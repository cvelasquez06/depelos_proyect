package cl.development.learnproyect.Activities;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cl.development.learnproyect.Entity.UserEntity;
import cl.development.learnproyect.R;
import cl.development.learnproyect.Services.UserServices;
import cl.development.learnproyect.Utilities.MessagesUtilities;
import cl.development.learnproyect.Utilities.PhoneUtilities;

public class RegisterActivity extends Activity {
    @BindView(R.id.registerFirstname) EditText firstname;
    @BindView(R.id.registerLastname) EditText lastname;
    @BindView(R.id.registerEmail) EditText email;
    @BindView(R.id.registerAccountButton) Button registerButton;
    private UserEntity usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.registerAccountButton)
    public void registerAccount(){
        usuario = new UserEntity();
        usuario = UserServices.createAccount(firstname.getText().toString(), lastname.getText().toString(), email.getText().toString(), PhoneUtilities.getPhoneImei(this));
            if (usuario != null) {
                Toast toast = MessagesUtilities.messagesToast(RegisterActivity.this, "Usuario creado en el sistema");
                toast.show();
                showHairdresserListActivity();
            }
        }

        public void showHairdresserListActivity(){
                Gson gson = new Gson();
                String data = gson.toJson(this.usuario);
                Intent activityHairdresserList = new Intent(RegisterActivity.this, HairdresserListActivity.class);
                activityHairdresserList.putExtra("dataFromRegister", data);
                startActivity(activityHairdresserList);
                finish();
        }
}
