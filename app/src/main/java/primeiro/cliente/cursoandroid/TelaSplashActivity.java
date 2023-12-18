package primeiro.cliente.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class TelaSplashActivity extends AppCompatActivity {

    int tempo = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);
        TextView texto = findViewById(R.id.textView);
        texto.setText(R.string.mensagem_splash);
        trocarTela();
    }

    private void trocarTela() {
        new Handler().postDelayed(() -> {
            Intent trocarDeTela = new Intent(TelaSplashActivity.this, MainActivity.class);
            startActivity(trocarDeTela);
            finish();
        }, tempo);
    }

}