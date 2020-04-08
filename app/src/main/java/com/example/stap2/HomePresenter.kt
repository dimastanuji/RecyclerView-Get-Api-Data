package com.example.stap2

import javax.security.auth.callback.Callback

class HomePresenter(private  val view: HomeView) {
    fun discoverMovie(){
        view.onShowLoading()

        val datasource = NetworkProvider.providesHttpAdapter().create(HomeDatasource::class.java)
        datasource.discoverMovie().equals(object : Callback<HomeResponse>{
            override fun onResponse(cal)
        })
    }

}