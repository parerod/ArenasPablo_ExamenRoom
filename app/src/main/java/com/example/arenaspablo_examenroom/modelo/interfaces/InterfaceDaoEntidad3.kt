package com.example.arenaspablo_examenroom.modelo.interfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad3

@Dao
interface InterfaceDaoEntidad3 {

        @Insert
        fun addEntidad3(ent : Entidad3)

        @Query("SELECT * FROM entidad3")
        fun getEntidades3() : MutableList<Entidad3>

        @Query("SELECT * FROM entidad3 WHERE nombre LIKE :nombre")
        fun getEntidad3(nombre: String) : Entidad3

        @Update
        fun updateEntidad3(ent : Entidad3)

        @Delete
        fun deleteEntidad3(ent: Entidad3)

        @Query("DELETE FROM entidad3")
        fun limpiaTabla()

}