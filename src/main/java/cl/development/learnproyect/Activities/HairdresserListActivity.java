package cl.development.learnproyect.Activities;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

import butterknife.ButterKnife;
import cl.development.learnproyect.Adapters.HairdresserAdapter;
import cl.development.learnproyect.Models.HairdresserModels;
import cl.development.learnproyect.R;

public class HairdresserListActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairdresser_list);
        ButterKnife.bind(this);

        ArrayList<HairdresserModels> chats = new ArrayList<>();
        for (int a = 0; a<=2000; a++) {
            chats.add(new HairdresserModels(R.drawable.avatarempty, a + ".- Carlos Gonzales Malcorte", "291"));
            /*chats.add(new HairdresserModels(R.drawable.avatarempty, a + "Maria Sepulveda", "Me gusta dar un servicio de calidad con excelentes productos."));*/
        }
        HairdresserAdapter adapter = new HairdresserAdapter(this, R.id.hairdresserListView, chats);
        ListView chatList = (ListView) findViewById(R.id.hairdresserListView);
        chatList.setAdapter(adapter);
    }
}
