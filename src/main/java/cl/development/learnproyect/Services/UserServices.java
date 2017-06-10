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
            ,String address
            ,String password
            ,Boolean customer
            ,Boolean hairdresser
            ,String imei
    ) {
        UserEntity user = new UserEntity();
        if (!firstname.isEmpty()
                && !lastname.isEmpty()
                && !email.isEmpty()
                && !address.isEmpty()
                && !password.isEmpty()
                && (customer == true
                || hairdresser == true)
                && !imei.isEmpty()){
            user.setFirstname(firstname);
            user.setLastname(lastname);
            user.setEmail(email);
            user.setAddress(address);
            user.setPassword(password);
            user.setCustomer(customer);
            user.setHairdresser(hairdresser);
            user.setImei(imei);
        }
        return user;
    }


}