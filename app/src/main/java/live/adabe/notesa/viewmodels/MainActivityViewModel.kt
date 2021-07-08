package live.adabe.notesa.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import live.adabe.notesa.models.Note
import live.adabe.notesa.models.ContactDatabase

class MainActivityViewModel : ViewModel() {


    val notesLiveData = MutableLiveData<List<Note>>()

    fun getNotes(database: ContactDatabase){
        notesLiveData.postValue(database.noteDao().getAllNotes())
    }

    fun addNote(database: ContactDatabase, note: Note){
        database.noteDao().addNote(note)
        getNotes(database)
    }

}