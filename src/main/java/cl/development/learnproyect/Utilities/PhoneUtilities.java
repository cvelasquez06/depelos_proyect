package cl.development.learnproyect.Utilities;

import android.app.Activity;
import android.provider.Settings;

/**
 * Created by servidor on 27/05/2017.
 */

public class PhoneUtilities {
    public static String getPhoneImei(Activity activity){
        String device_unique_id = Settings.Secure.getString(activity.getContentResolver(), Settings.Secure.ANDROID_ID);
        return device_unique_id;
    }
}
