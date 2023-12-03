package com.example.arenaspablo_examenroom.modelo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="entidad2")
data class Entidad2(
    @ColumnInfo(name = "nombre")
    var nombre : String
){

    @ColumnInfo(name="id")
    @PrimaryKey(autoGenerate = true)
    var id : Int= 0

}