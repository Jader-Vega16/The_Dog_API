package ni.uca.the_dog_api.ui

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import ni.uca.the_dog_api.intent.Intent
import ni.uca.the_dog_api.repository.DogRepository
import ni.uca.the_dog_api.utils.DataState

@ExperimentalCoroutinesApi

class MainViewModel
@ViewModelInject
constructor(
    private val dogRepository: DogRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

}