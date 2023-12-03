package com.example.arenaspablo_examenroom.modelo.interfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad3_4

@Dao
interface InterfaceDaoEntidad3_4 {

        @Insert
        fun addEntidad3_4(ent : Entidad3_4)

        @Query("SELECT * FROM entidad3_4")
        fun getEntidades3_4() : MutableList<Entidad3_4>

        @Query("SELECT * FROM entidad3_4 WHERE nombre LIKE :nombre")
        fun getEntidad3_4(nombre: String) : Entidad3_4

        @Update
        fun updateEntidad3_4(ent : Entidad3_4)

        @Delete
        fun deleteEntidad3_4(ent: Entidad3_4)

        @Query("DELETE FROM entidad3_4")
        fun limpiaTabla()

}