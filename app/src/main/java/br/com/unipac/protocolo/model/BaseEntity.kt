package br.com.unipac.protocolo.model

import androidx.room.PrimaryKey
import java.util.*

abstract class BaseEntity {
    abstract val id: Long
    abstract val created: String //= Date()
    abstract val createdDate: Date //= Date()
    abstract val updated: String //= Date()
    abstract val updatedDate: Date //= Date()
}