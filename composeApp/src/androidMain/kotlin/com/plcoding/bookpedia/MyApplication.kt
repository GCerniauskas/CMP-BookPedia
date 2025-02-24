package com.plcoding.bookpedia

import android.app.Application
import com.plcoding.bookpedia.di.initKoin
import io.ktor.http.ContentType
import org.koin.android.ext.koin.androidContext

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApplication)
        }
    }

}