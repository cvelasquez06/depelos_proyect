package cl.development.learnproyect.Services;
import cl.development.learnproyect.Entity.UserEntity;

/**
 * Created by servidor on 25/05/2017.
 */

public class UserServices {
    public static UserEntity createAccount(
            String firstname
            ,String lastname
            ,String email
            ,String imei
    ) {
        UserEntity usuario = new UserEntity();
        if (!firstname.isEmpty()
                && !lastname.isEmpty()
                && !email.isEmpty()
                && !imei.isEmpty()){
            usuario.setFirstname(firstname);
            usuario.setLastname(lastname);
            usuario.setEmail(email);
            usuario.setImei(imei);
        }
        return usuario;
    }

    public static boolean validateLogin(String user, String password){
       return false;
    }


}