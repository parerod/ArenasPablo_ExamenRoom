package com.example.arenaspablo_examenroom.modelo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="entidad3")
data class Entidad3(
    @ColumnInfo(name = "nombre")
    var nombre : String
){

    @ColumnInfo(name="id")
    @PrimaryKey(autoGenerate = true)
    var id : Int= 0

}