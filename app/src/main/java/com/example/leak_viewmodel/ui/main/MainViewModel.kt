package com.example.leak_viewmodel.ui.main

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

//@HiltViewModel
class MainViewModel /*@Inject constructor(
    testSingleton: TestSingleton,*/ (
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    val x = 33 //testSingleton.x
}
