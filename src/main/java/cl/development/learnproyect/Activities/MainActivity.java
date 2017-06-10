package cl.development.learnproyect.Activities;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import cl.development.learnproyect.R;
import cl.development.learnproyect.Utilities.NetworksUtilities;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView)findViewById(R.id.TextNetStatus);
        if(NetworksUtilities.isConnected(this)){
            txt.setText("Conexion Establecida");
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    Intent wnd = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(wnd);
                    finish();
                }
            };
            Handler h = new Handler();
            h.postDelayed(r, 4000);
            }else{
            txt.setText("Conexion Erronea");
        }
    }
}
