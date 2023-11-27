
package com.example.practicamvvm.Io.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practicamvvm.Model.elBuenSazonModel
import com.example.practicamvvm.Model.elBuenSazonProvider


class elBuenSazonViewModel: ViewModel(){
    //MutableLiveData es una subclase de LiveData que proporciona mutabilidad, permitiendo la modificación
// de su valor. Se usa comúnmente dentro de ViewModels para almacenar y exponer datos que pueden actualizarse
// con el tiempo. MutableLiveData amplía la funcionalidad de LiveData agregando métodos para modificar el
// valor almacenado.
    val  elBuenSazonModel= MutableLiveData<elBuenSazonModel>()

    fun randomElBuenSazon(){
        val recipeCurrent = elBuenSazonProvider.random()
        elBuenSazonModel.postValue(recipeCurrent)
        //La responsabilidad del método postValue es publicar o agregar una tarea al hilo principal de la
        // aplicación cada vez que cambia el valor. El valor se actualizará cada vez que se ejecute el hilo
        // principal. El valor se actualizará cada vez que el hilo principal se ejecute más tarde.
    }
}