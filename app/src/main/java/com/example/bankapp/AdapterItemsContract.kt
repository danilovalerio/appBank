package com.example.bankapp

interface AdapterItemsContract {

//    O objetivo dessa interface é fazer com que o adapter seja responsável por implementar
//    o comportamento de atualizar o seu dataset e permitir uma integração mais genérica
//    com o recurso de BindingAdapter presente no databinding.

    fun replaceItems(list: List<*>)
}