package atmempresaconsultoria.livroandroid.com.appdengue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);


    // adiciona botao up navigation - funciona
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
    // faz parte botao up navigation - funciona
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
        // o metodo finish() vai encerrar essa activity
            finish();
            return (true);
        }
        return super.onOptionsItemSelected(item);
    }
}
