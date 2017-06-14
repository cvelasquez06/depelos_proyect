package cl.development.learnproyect.Activities;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cl.development.learnproyect.R;

public class HairdresserProfileActivity extends AppCompatActivity {
    @BindView(R.id.textPersonalProfile) TextView personalProfile;
    @BindView(R.id.buttonProfile) Button buttonProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairdresser_profile);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonProfile)
    public void showCalendarActivity(){
        Intent activityCalendar = new Intent(HairdresserProfileActivity.this, CalendarActivity.class);
        startActivity(activityCalendar);
        finish();
    }

}
