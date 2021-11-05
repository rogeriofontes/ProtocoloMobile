package br.com.unipac.protocolo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "protocolo")
class Protocolo(
    @PrimaryKey(autoGenerate = true)
    override var id: Long = 0,
    @ColumnInfo(name = "nome_completo")
    var nome: String = "",
    var email: String = "",
    @ColumnInfo(name = "numero_protocolo")
    var numeroProtocolo: Int = 0,
    override val created: String = "Rogerio",
    override val createdDate: Date = Date(),
    override val updated: String = "",
    override val updatedDate: Date = Date(),
    //Many To One - Trocar usuario por Aluno
    @ForeignKey(
        entity = Usuario::class,
                parentColumns = ["id"],
                childColumns = ["id_usuario"],
                onDelete = CASCADE
    )
    val idUsuario: Long = 0
) : BaseEntity()