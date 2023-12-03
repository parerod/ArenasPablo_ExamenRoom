package com.example.arenaspablo_examenroom.modelo.conexiones

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad1
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad2
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad3
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad4
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad3_4
import com.example.arenaspablo_examenroom.modelo.interfaces.*

// Esta anotación define la base de datos utilizando Room.
// Cambio la versión a 2 debido a la migración
@Database(entities = [Entidad1::class, Entidad2::class,Entidad3::class,Entidad4::class,Entidad3_4::class], version = 1)
abstract class RoomDB : RoomDatabase() {

    // Este método abstracto proporciona acceso al DAO
    abstract fun DaoEntidad1(): InterfaceDaoEntidad1
    abstract fun DaoEntidad2(): InterfaceDaoEntidad2
    abstract fun DaoEntidad3(): InterfaceDaoEntidad3
    abstract fun DaoEntidad4(): InterfaceDaoEntidad4
    abstract fun DaoEntidad3_4(): InterfaceDaoEntidad3_4


    // Este bloque define un companion object que contiene métodos estáticos.

    companion object {
        // INSTANCE almacena la instancia única de la base de datos.
        private var INSTANCE: RoomDB? = null

        // Este método estático crea y devuelve la instancia de la base de datos utilizando Room.
        fun getBaseDatos(context: Context): RoomDB {
            // Si INSTANCE es nulo, crea una nueva instancia de la base de datos.
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext, RoomDB::class.java,
                    // Se especifica el nombre de la base de datos como "usuariosBD".
                    "arenaspablo_examenroomBD"
                )
                    // Permite realizar consultas en el hilo principal
                    .allowMainThreadQueries()
                    //.addMigrations(MIGRATION_1_2)
                    .build()
            }
            // Devuelve la instancia existente o recién creada de la base de datos.
            return INSTANCE as RoomDB
        }

        /*val MIGRATION_1_2: Migration = object : Migration(1,2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE departamento (idDepartamento TEXT NOT NULL, nombre TEXT NOT NULL")
                database.execSQL("CREATE TABLE profesor (idProfesor INTEGER NOT NULL, nombre TEXT NOT NULL, departamentoID TEXT NOT NULL")
            }
        }*/
    }
}
