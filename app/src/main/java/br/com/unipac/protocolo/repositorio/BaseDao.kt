package br.com.unipac.protocolo.repositorio

import androidx.room.*
import br.com.unipac.protocolo.model.BaseEntity

abstract class BaseDao<T : BaseEntity>(
    private val tableName: String,
    private val roomDatabase: RoomDatabase
) {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun salvar(entity: T)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun salvar(entities: List<T>)

    @Update
    abstract fun update(entity: T)

    @RawQuery
    abstract fun listar(): List<T>?

    @Delete
    abstract fun delete(entity: T)
}