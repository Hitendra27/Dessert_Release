package com.example.dessertrelease

import android.app.Application
import android.app.Presentation
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import com.example.dessertrelease.data.UserPreferencesRepository
import androidx.compose.runtime.getValue
import androidx.datastore.dataStore
import androidx.datastore.preferences.core.Preferences

class DessertReleaseApplication : Application() {

    lateinit var userPreferencesRepository: UserPreferencesRepository

    override fun onCreate() {
        super.onCreate()
        userPreferencesRepository = UserPreferencesRepository(dataStore)
    }
}

private const val LAYOUT_PREFERENCE_NAME = "layout_preferences"

private val Context.dataStore : DataStore<Preferences> by preferencesDataStore(
    name = LAYOUT_PREFERENCE_NAME
)