package com.example.arenaspablo_examenroom.modelo.interfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad2

@Dao
interface InterfaceDaoEntidad2 {

        @Insert
        fun addEntidad2(ent : Entidad2)

        @Query("SELECT * FROM entidad2")
        fun getEntidades2() : MutableList<Entidad2>

        @Query("SELECT * FROM entidad2 WHERE nombre LIKE :nombre")
        fun getEntidad2(nombre: String) : Entidad2

        @Update
        fun updateEntidad2(ent : Entidad2)

        @Delete
        fun deleteEntidad2(ent:Entidad2)

        @Query("DELETE FROM entidad2")
        fun limpiaTabla()

}