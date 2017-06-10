package cl.development.learnproyect.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cl.development.learnproyect.Models.HairdresserModels;
import cl.development.learnproyect.R;

/**
 * Created by servidor on 02/06/2017.
 */
public class HairdresserAdapter extends ArrayAdapter<HairdresserModels> {

    public HairdresserAdapter(Context context, int resource, ArrayList<HairdresserModels> data) {
        super(context, resource, data);
    }

    public View getView(int position, View view, ViewGroup parent) {
        //Get the instance of our chat
        HairdresserModels hairdresserModels = getItem(position);

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE );

        //Create new list item
        View rowView = inflater.inflate(R.layout.element_listview_layout, null, true);

        //Get UI objects
        ImageView profilePic = (ImageView) rowView.findViewById(R.id.profile_pic_imageview);
        TextView nameView = (TextView) rowView.findViewById(R.id.name);
        TextView messageView = (TextView) rowView.findViewById(R.id.ranking);

        //Set image profile picture
        profilePic.setImageDrawable(getContext().getResources().getDrawable(hairdresserModels.getProfilePic()));

        //Set text into TextViews
        nameView.setText(hairdresserModels.getName());
        messageView.setText(hairdresserModels.getMessage());

        return rowView;
    }

}