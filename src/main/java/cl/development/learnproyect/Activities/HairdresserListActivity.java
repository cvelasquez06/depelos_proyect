package cl.development.learnproyect.Activities;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.gson.Gson;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;
import cl.development.learnproyect.Adapters.HairdresserAdapter;
import cl.development.learnproyect.Entity.UserEntity;
import cl.development.learnproyect.Models.HairdresserModels;
import cl.development.learnproyect.R;
public class HairdresserListActivity extends Activity {
    @BindView(R.id.hairdresserListView) ListView hairdresserList;
    private UserEntity usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairdresser_list);
        ButterKnife.bind(this);
        Gson gson = new Gson();
        UserEntity usuario = gson.fromJson(getIntent().getStringExtra("dataFromRegister"), UserEntity.class);
        ArrayList<HairdresserModels> elements = new ArrayList<>();
        for (int a = 0; a<=15; a++) {
            elements.add(new HairdresserModels(R.drawable.avatarempty, a + ".- Carlos Gonzales Malcorte", "291"));
        }
        HairdresserAdapter adapter = new HairdresserAdapter(this, hairdresserList.getId(),elements);
        ListView hairsList = (ListView) hairdresserList;
        hairsList.setItemsCanFocus(false);
        hairsList.setAdapter(adapter);

        hairsList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent activityHairProfile = new Intent(HairdresserListActivity.this, HairdresserProfileActivity.class);
                startActivity(activityHairProfile);
            }
        });
    }
}