package com.example.esjumbo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClicked: (MutableList<String>) -> Unit
){
    var nmMahasiswa by rememberSaveable{ mutableStateOf("") }
    var nim by rememberSaveable{ mutableStateOf("") }
    var konsentrasi by rememberSaveable{ mutableStateOf("") }
    var judul by rememberSaveable{ mutableStateOf("") }


    var listDataCust: MutableList<String> = mutableListOf(nmMahasiswa, nim, konsentrasi, judul)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 16.dp)
    ){
        OutlinedTextField(
            value = nmMahasiswa,
            onValueChange = {nmMahasiswa = it},
            label = { Text(text = " Nama Mahasiswa") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
        )
        OutlinedTextField(
            value = nim,
            onValueChange = {nim = it},
            label = { Text(text = "NIM")},
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Phone
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
        )
        OutlinedTextField(
            value = konsentrasi,
            onValueChange ={ konsentrasi = it},
            label = { Text(text = "Konsentrasi")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
        )
        OutlinedTextField(
            value = judul,
            onValueChange ={ judul = it},
            label = { Text(text = "Judul Skripsi")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
        )
        Button(
            onClick = { onSubmitButtonClicked(listDataCust) }
        ) {
            Text(text = "Submit")
        }
    }
}

