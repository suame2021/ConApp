package live.adabe.notesa.models

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Note::class], version = 1)
abstract class ContactDatabase: RoomDatabase() {
    abstract fun noteDao() : ContactDAO
}