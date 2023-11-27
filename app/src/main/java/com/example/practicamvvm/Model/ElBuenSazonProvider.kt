package com.example.practicamvvm.Model

import com.example.practicamvvm.Model.elBuenSazonModel

class elBuenSazonProvider {
    companion object {
        fun random(): elBuenSazonModel {
            val position = (0..3).random()
            return elBuenSazon[position]
        }
        private val elBuenSazon = listOf<elBuenSazonModel>(
            elBuenSazonModel(
                Receta = "Sorrentinos de Jamon y queso. Para la masa 1 kg de harina, 8 huevos, calabaza, Para" +
                        " el relleno: Jamon y Queso",
                ElBuenSazon = "ElBuenSazon"
            ),
            elBuenSazonModel(
                Receta = "Sorrentinos  de Ricota, Jamon y Queso. Para la masa 1 kg de harina, 8 huevos, calabaza, " +
                        "Para el relleno: Jamon, Ricota y Queso",
                ElBuenSazon = "ElBuenSazon"
            ),
            elBuenSazonModel(
                Receta = "Sorrentinos Ricota y queso. Para la masa 1 kg de harina, 8 huevos, calabaza. Para el " +
                        "relleno: Ricota, Queso, Nuez mozcada",
                ElBuenSazon = "ElBuenSazon"
            ),
            elBuenSazonModel(
                Receta = "Sorrentinos Ricota. Para la masa 1 kg de harina, 8 huevos, calabaza. Para el relleno:" +
                        "Ricota, Nueva mozcada.",
                ElBuenSazon = "ElBuenSazon"
            )
        )
    }
}