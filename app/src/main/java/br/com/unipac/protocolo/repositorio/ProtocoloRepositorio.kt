package br.com.unipac.protocolo.repositorio

import android.content.Context
import androidx.room.*
import br.com.unipac.protocolo.model.Protocolo

@Dao
interface ProtocoloRepositorio {

    @Insert
    fun salvar(protocolo: Protocolo)

    @Update
    fun update(protocolo: Protocolo)

    @Query("Select * from protocolo")
    fun listar(): List<Protocolo>?

    @Delete
    fun delete(protocolo: Protocolo)
}
