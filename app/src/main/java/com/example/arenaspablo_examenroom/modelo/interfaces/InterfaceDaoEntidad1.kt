package com.example.arenaspablo_examenroom.modelo.interfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad1

@Dao
interface InterfaceDaoEntidad1 {

        @Insert
        fun addEntidad1(ent : Entidad1)

        @Query("SELECT * FROM entidad1")
        fun getEntidades1() : MutableList<Entidad1>

        @Query("SELECT * FROM entidad1 WHERE nombre LIKE :nombre")
        fun getEntidad1(nombre: String) : Entidad1

        @Update
        fun updateEntidad1(ent : Entidad1)

        @Delete
        fun deleteEntidad1(ent:Entidad1)

        @Query("DELETE FROM entidad1")
        fun limpiaTabla()

}