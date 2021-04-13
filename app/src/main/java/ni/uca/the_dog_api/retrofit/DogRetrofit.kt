package ni.uca.the_dog_api.retrofit

import retrofit2.http.GET

interface DogRetrofit {
    @GET("search")
    suspend fun get(): List<DogNetworkEntity>
}