package ni.uca.the_dog_api.ui

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp

class MainApp : Application(){

    override fun onCreate() {
        super.onCreate()
    }
}