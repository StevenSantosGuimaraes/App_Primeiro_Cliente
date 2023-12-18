package primeiro.cliente.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textoPromocional = findViewById(R.id.textViewTextoPromocional);
        textoPromocional.setText(R.string.mensagem_promocional);
    }

}