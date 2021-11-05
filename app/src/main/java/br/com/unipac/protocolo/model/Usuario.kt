package br.com.unipac.protocolo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "usuario")
class Usuario(
    @PrimaryKey(autoGenerate = true)
    override val id: Long = 0,
    @ColumnInfo(name = "full_name")
    var fullName: String = "",
    val usename: String = "",
    val senha: String = "",
    override val created: String = "",
    override val createdDate: Date = Date(),
    override val updated: String  = "",
    override val updatedDate: Date = Date()
) : BaseEntity()