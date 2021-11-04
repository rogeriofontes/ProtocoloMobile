package br.com.unipac.protocolo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "protocolo")
class Protocolo(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    @ColumnInfo(name = "nome_completo")
    var nome: String = "",
    var email: String = "",
    @ColumnInfo(name = "numero_protocolo")
    var numeroProtocolo: Int = 0
)