package br.com.unipac.protocolo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import br.com.unipac.protocolo.infra.AppDatabase
import br.com.unipac.protocolo.model.Protocolo
import br.com.unipac.protocolo.repositorio.ProtocoloRepositorio
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val db = AppDatabase.getInstance(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nomeProtocoloEdt = findViewById<EditText>(R.id.nomeProtocoloEdt)
        var emailProtocoloEdt = findViewById<EditText>(R.id.emailProtocoloEdt)
        var numeroProtocoloEdt = findViewById<EditText>(R.id.numeroProtocoloEdt)
        var btnSalvar = findViewById<Button>(R.id.btnSalvar)

        getAll() //TODO - Enviar dados para recycleview

        btnSalvar.setOnClickListener {
            var nomeProtocoloEdt = nomeProtocoloEdt.text.toString()
            var emailProtocoloEdt = emailProtocoloEdt.text.toString()
            var numeroProtocoloEdt = numeroProtocoloEdt.text.toString()

            var protocolo =
                Protocolo(1, nomeProtocoloEdt, emailProtocoloEdt, numeroProtocoloEdt.toInt())
            db?.ProtocoloRepositorio()?.salvar(protocolo)
        }
    }

    fun getAll(): List<Protocolo>? {
        return db?.ProtocoloRepositorio()?.listar()
    }
}