package br.com.unipac.protocolo.repositorio

import androidx.room.Dao
import androidx.room.RoomDatabase
import br.com.unipac.protocolo.model.Protocolo

@Dao
abstract class ProtocoloRepositorio(roomDatabase: RoomDatabase): BaseDao<Protocolo>("protocolo", roomDatabase)
