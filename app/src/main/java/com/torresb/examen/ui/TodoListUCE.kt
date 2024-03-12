package com.torresb.examen.ui

import android.app.Application

class TodoListUCE : Application() {

    override fun onCreate() {
        super.onCreate()
        //conn = DBConnection().getConnection(applicationContext)
    }

    companion object {
        private lateinit var conn: TaskRepository

        fun getDBInstance() : TaskRepository {
            return conn
        }
    }
}