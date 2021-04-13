package ni.uca.the_dog_api.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DogCacheEntity::class], version = 1)

abstract class DogDatabase : RoomDatabase(){
    companion object{
        val DATABASE_NAME = "DogDB"
    }
    abstract fun dogDao(): DogDao
}