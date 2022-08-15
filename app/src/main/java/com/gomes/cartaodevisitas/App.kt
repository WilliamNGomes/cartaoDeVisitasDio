package com.gomes.cartaodevisitas

import android.app.Application
import com.gomes.cartaodevisitas.data.AppDatabase
import com.gomes.cartaodevisitas.data.BusinessCardRepository

class App : Application (){
    val database by lazy {
        AppDatabase.getDatabase(this)
    }
    val  repository by lazy { BusinessCardRepository(database.businessDao()) }
}