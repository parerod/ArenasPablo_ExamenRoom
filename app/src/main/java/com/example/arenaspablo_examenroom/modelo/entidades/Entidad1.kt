package com.example.arenaspablo_examenroom.modelo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName="entidad1",
    foreignKeys = [
        ForeignKey(
            entity = Entidad2::class,
            parentColumns = ["id"],
            childColumns = ["idEntidad2"],
            onDelete = ForeignKey.CASCADE
        )
    ])
data class Entidad1(
    @ColumnInfo(name = "nombre")
    var nombre : String,
    @ColumnInfo(name = "idEntidad2")
    var idEntidad2 : Int
){

    @ColumnInfo(name="id")
    @PrimaryKey(autoGenerate = true)
    var id : Int= 0

}