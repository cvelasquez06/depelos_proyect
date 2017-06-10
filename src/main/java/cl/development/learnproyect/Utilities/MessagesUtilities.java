package cl.development.learnproyect.Utilities;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by servidor on 01/06/2017.
 */

public class MessagesUtilities{

    public static Toast messagesToast(Activity activity, String message){
        Context context = activity.getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        return toast;
    }
}
