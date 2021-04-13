package ni.uca.the_dog_api.intent

sealed class Intent {
    object GetDogEvent: Intent()
    object None: Intent()
}