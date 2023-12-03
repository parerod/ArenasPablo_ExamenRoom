package com.example.arenaspablo_examenroom.modelo.interfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.arenaspablo_examenroom.modelo.entidades.Entidad4

@Dao
interface InterfaceDaoEntidad4 {

        @Insert
        fun addEntidad4(ent : Entidad4)

        @Query("SELECT * FROM entidad4")
        fun getEntidades4() : MutableList<Entidad4>

        @Query("SELECT * FROM entidad4 WHERE nombre LIKE :nombre")
        fun getEntidad4(nombre: String) : Entidad4

        @Update
        fun updateEntidad4(ent : Entidad4)

        @Delete
        fun deleteEntidad4(ent: Entidad4)

        @Query("DELETE FROM entidad4")
        fun limpiaTabla()

}