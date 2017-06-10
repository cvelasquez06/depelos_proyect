package cl.development.learnproyect.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import cl.development.learnproyect.Entity.UserEntity;
import cl.development.learnproyect.R;
import cl.development.learnproyect.Services.UserServices;
import cl.development.learnproyect.Utilities.MessagesUtilities;
import cl.development.learnproyect.Utilities.PhoneUtilities;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void registerAccount(View view){
        UserEntity users = UserServices.createAccount(
                "Cesar"
                ,"Velasquez"
                ,"test@email.com"
                ,"Berta Correa 1791 Casa 80"
                ,"123"
                ,true
                ,false
                ,PhoneUtilities.getPhoneImei(this)
        );
            if ((users.getCustomer() || users.getHairdresser())) {
                Toast toast = MessagesUtilities.messagesToast(RegisterActivity.this, "Usuario creado en el sistema");
                toast.show();
                LoginActivity.textViewWelcome.setText("Hola , " + users.getFirstname() + " " + users.getLastname());
                goLoginActivity(users);
            }
        }

        public void goLoginActivity(UserEntity users){
            LoginActivity.user = (UserEntity) users;
            onBackPressed();
            finish();
        }
}
