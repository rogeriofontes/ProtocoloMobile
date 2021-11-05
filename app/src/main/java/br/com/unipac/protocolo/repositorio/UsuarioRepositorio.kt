package br.com.unipac.protocolo.repositorio

import androidx.room.Dao
import androidx.room.RoomDatabase
import br.com.unipac.protocolo.model.Usuario

@Dao
abstract class UsuarioRepositorio(roomDatabase: RoomDatabase): BaseDao<Usuario>("usuario", roomDatabase) {
    //TODO - FIND BY USERNAME AND PASSWORD
}


