package ni.uca.the_dog_api.repository

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ni.uca.the_dog_api.retrofit.DogRetrofit
import ni.uca.the_dog_api.retrofit.NetworkMapper
import ni.uca.the_dog_api.room.CacheMapper
import ni.uca.the_dog_api.room.DogDao
import ni.uca.the_dog_api.utils.DataState

class DogRepository constructor (
    private val dogDao: DogDao,
    private val dogRetrofit: DogRetrofit,
    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
)
{
    suspend fun getDogs(): Flow<DataState> = flow {
        emit(DataState.Loading)
        delay(1000)
        try {
            val dogData = dogRetrofit.get()
            val dogMap = networkMapper.mapFromEntityList(dogData)
            for (tempDog in dogMap){
                dogDao.insert(cacheMapper.mapToEntity(tempDog))
            }
            val cacheDog = dogDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cacheDog)))
        }catch (e: Exception){
            emit(DataState.Error(e))
        }
    }
}