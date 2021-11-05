package br.com.unipac.protocolo.infra

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.unipac.protocolo.converters.Converters
import br.com.unipac.protocolo.model.Protocolo
import br.com.unipac.protocolo.model.Usuario
import br.com.unipac.protocolo.repositorio.ProtocoloRepositorio
import br.com.unipac.protocolo.repositorio.UsuarioRepositorio

@Database(entities = [Protocolo::class, Usuario::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun ProtocoloRepositorio() : ProtocoloRepositorio
    abstract fun UsuarioRepositorio() : UsuarioRepositorio

    companion object {
        private var INSTANCE: AppDatabase? = null
        private val databaseName  = "protoco.db"

        fun getInstance(context: Context) : AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {

                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        AppDatabase::class.java, databaseName
                    ).allowMainThreadQueries().build();
                }
            }
            return INSTANCE;
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}