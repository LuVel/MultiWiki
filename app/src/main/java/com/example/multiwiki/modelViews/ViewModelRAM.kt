package com.example.multiwiki.modelViews

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiwiki.model.data.Characteres
import com.example.multiwiki.model.network.RickAndMortyService
import kotlinx.coroutines.launch

class ViewModelRAM : ViewModel() {
    var resultQuery by mutableStateOf(emptyList<Characteres>())
        private set

    fun getCharacter() {
        viewModelScope.launch {
            resultQuery = RickAndMortyService.retrofitService.getCharacter().results
        }
    }
}