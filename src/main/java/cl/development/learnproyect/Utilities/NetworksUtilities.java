package cl.development.learnproyect.Utilities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by servidor on 23/05/2017.
 */
public class NetworksUtilities{
        public static boolean isConnected(Context context) {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
            boolean st = activeNetwork != null && activeNetwork.isConnected();
            return st;
        }
}
