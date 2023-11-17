package com.example.ucp2

import androidx.lifecycle.ViewModel
import com.example.ucp2.Data.FormUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat


class OrderViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(FormUIState())
    val stateUI: StateFlow<FormUIState> = _stateUI.asStateFlow()


    fun setForm(list: MutableList<String>){
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(
            nmMahasiswa = list[0],
            nim = list[1],
            konsentrasi = list[2],
            judul = list[3]
        ) }

    }

    fun resetForm() {
        _stateUI.value = FormUIState()
    }

}