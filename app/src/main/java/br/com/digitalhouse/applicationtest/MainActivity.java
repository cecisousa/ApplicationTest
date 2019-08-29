package br.com.digitalhouse.applicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    private EditText editTextNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_id);
        button = (Button) findViewById(R.id.botao_main);
        editTextNome = (EditText) findViewById(R.id.edit_text_nome);

        final Editable nome = editTextNome.getText();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarNome(nome.toString());
            }

                public void mostrarNome(String nomeUser){
                Toast.makeText(getApplicationContext(), "Olá, usuário " + nomeUser.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
