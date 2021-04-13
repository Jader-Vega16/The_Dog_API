package ni.uca.the_dog_api.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import ni.uca.the_dog_api.repository.DogRepository
import ni.uca.the_dog_api.retrofit.DogRetrofit
import ni.uca.the_dog_api.retrofit.NetworkMapper
import ni.uca.the_dog_api.room.CacheMapper
import ni.uca.the_dog_api.room.DogDao
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {
    @Singleton
    @Provides
    fun provideDogRepository(
        dogDao: DogDao,
        dogRetrofit: DogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): DogRepository {
        return DogRepository(dogDao, dogRetrofit, cacheMapper, networkMapper)
    }
}
