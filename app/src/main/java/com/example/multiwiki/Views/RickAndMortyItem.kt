package com.example.multiwiki.Views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiwiki.modelViews.ViewModelRAM

@Composable
fun CharacterList(
    modifier: Modifier = Modifier,
    viewModel: ViewModelRAM = viewModel()
) {
    LaunchedEffect(Unit) {
        viewModel.getCharacter()
    }

    LazyColumn {
        items(viewModel.resultQuery) { character ->
            Text("${character.id} - ${character.name}")
        }
    }
}