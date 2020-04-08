package com.example.stap2

interface HomeView {
    fun onShowLoading()
    fun onHideLoading()
    fun onResponse(results: List<Result>)
    fun onFailure(eror: Throwable)
}