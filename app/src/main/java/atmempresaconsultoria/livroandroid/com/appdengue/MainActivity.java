package atmempresaconsultoria.livroandroid.com.appdengue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView menuDengue;
    private ImageView menuSintomas;
    private ImageView menuContagio;
    private ImageView menuTratamento;
    private ImageView menuOutrasDoencas;
    private ImageView menuPrevencao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // adiciona botao up navigation
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);











            menuDengue = (ImageView) findViewById(R.id.menumosquitoId);
            menuSintomas = (ImageView) findViewById(R.id.menusintomasId);
            menuContagio = (ImageView) findViewById(R.id.menucontagioId);
            menuTratamento = (ImageView) findViewById(R.id.menutratamentoId);
            menuOutrasDoencas = (ImageView) findViewById(R.id.outrasdoencasId);
            menuPrevencao = (ImageView) findViewById(R.id.prevencaoId);


            menuDengue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(MainActivity.this, SegundaActivity.class));

                }
            });

            menuSintomas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(MainActivity.this, TerceiraActivity.class));

                }
            });

            menuContagio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(MainActivity.this, QuartaActivity.class));

                }
            });

        menuTratamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, QuintaActivity.class));
                }
            });

            menuOutrasDoencas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(MainActivity.this, SextaActivity.class));
                }
            });

            menuPrevencao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(MainActivity.this, SetimaActivity.class));
                }
            });






        }
    }




