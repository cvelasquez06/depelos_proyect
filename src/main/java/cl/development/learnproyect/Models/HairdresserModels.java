package cl.development.learnproyect.Models;
/**
 * Created by servidor on 02/06/2017.
 */
public class HairdresserModels {
    private int mProfilePic;
    private String mName;
    private String mMessage;

    public HairdresserModels(int profilePic, String name, String message) {
        mProfilePic = profilePic;
        mName = name;
        mMessage = message;
    }

    public int getProfilePic() {
        return mProfilePic;
    }

    public String getName() {
        return mName;
    }

    public String getMessage() {
        return mMessage;
    }
}