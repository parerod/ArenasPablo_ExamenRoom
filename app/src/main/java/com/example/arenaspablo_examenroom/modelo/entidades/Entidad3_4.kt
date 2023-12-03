package com.example.arenaspablo_examenroom.modelo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName="entidad3_4",
    primaryKeys = ["alumnoId", "cursoId"],
    foreignKeys = [
        ForeignKey(
            entity = Entidad3::class,
            parentColumns = ["id"],
            childColumns = ["idEntidad3"]
        ),
        ForeignKey(
            entity = Entidad4::class,
            parentColumns = ["id"],
            childColumns = ["idEntidad4"]
        )
    ]
)
data class Entidad3_4(

    @ColumnInfo(name = "idEntidad3")
    var idEntidad3 : Int,
    @ColumnInfo(name = "idEntidad4")
    var idEntidad4 : Int
){

}