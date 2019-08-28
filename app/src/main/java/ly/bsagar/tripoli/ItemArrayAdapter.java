package ly.bsagar.tripoli;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemArrayAdapter extends ArrayAdapter<Item> {


    ItemArrayAdapter(Context context, int resource, ArrayList<Item> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_layout, parent, false);
        }
        Item item = getItem(position);

        TextView textView = listItemView.findViewById(R.id.Description);
        ImageView imageView = listItemView.findViewById(R.id.imageView);

        textView.setText(item.description);
        if (item.imageID ==0 ){
            imageView.setVisibility(View.GONE);
        } else {
            imageView.setImageResource(item.imageID);
        }
        return listItemView;
    }
}
