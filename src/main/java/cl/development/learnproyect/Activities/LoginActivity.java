package cl.development.learnproyect.Activities;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cl.development.learnproyect.R;
import cl.development.learnproyect.Services.UserServices;
import cl.development.learnproyect.Utilities.MessagesUtilities;

public class LoginActivity extends Activity {
    @BindView(R.id.loginButton) Button loginButton;
    @BindView(R.id.linkToRegister) TextView linkToRegister;
    @BindView(R.id.userLogin) EditText userLogin;
    @BindView(R.id.passLogin) EditText passLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView textViewWelcome = (TextView) findViewById(R.id.TextWelcome);
        ButterKnife.bind(this);
    }

    public boolean validateLogin(){
        if(UserServices.validateLogin(userLogin.getText().toString(), passLogin.getText().toString())){
            return true;
        }
        Toast toast = MessagesUtilities.messagesToast(LoginActivity.this, "Error de usuario o password");
        toast.show();
        return false;
    }
    @OnClick(R.id.linkToRegister)
    public void showRegisterActivity(){
        Intent activityRegister = new Intent(this, RegisterActivity.class);
        startActivity(activityRegister);
        finish();
    }

    @OnClick(R.id.loginButton)
    public void showHairdresserListActivity() {
        if (validateLogin()) {
            Intent activityLogin = new Intent(LoginActivity.this, HairdresserListActivity.class);
            startActivity(activityLogin);
            finish();
        }
    }
}
