package ni.uca.the_dog_api.utils

import ni.uca.the_dog_api.model.Dog
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class Success(val dogs: List<Dog>) : DataState()
    data class Error(val exception: Exception) : DataState()
    object Loading: DataState()
}