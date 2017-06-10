package cl.development.learnproyect.Activities;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import cl.development.learnproyect.Entity.UserEntity;
import cl.development.learnproyect.R;
import cl.development.learnproyect.Utilities.MessagesUtilities;

public class LoginActivity extends Activity {

    public static TextView textViewWelcome;
    public static UserEntity user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textViewWelcome = (TextView) findViewById(R.id.TextWelcome);
    }

    public boolean validateLogin(){
        EditText user = (EditText) findViewById(R.id.user_login);
        EditText pass = (EditText) findViewById(R.id.pass_login);
        if(this.user != null && user.getText().toString().equals(this.user.getEmail()) && pass.getText().toString().equals(this.user.getPassword())){
            return true;
        }
        Toast toast = MessagesUtilities.messagesToast(LoginActivity.this, "Error de usuario o password");
        toast.show();
        return false;
    }

    public void showRegisterActivity(View view){
        Intent views1 = new Intent(this, RegisterActivity.class);
        startActivity(views1);
    }

    public void showHairdresserListActivity(View view) {
        if (validateLogin()) {
            Intent hl = new Intent(LoginActivity.this, HairdresserListActivity.class);
            startActivity(hl);
            finish();
        }
    }
}
