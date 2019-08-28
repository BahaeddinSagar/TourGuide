package ly.bsagar.tripoli;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class EventsFragments extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_layout, container, false);
        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item(getString(R.string.Weddings),0));
        itemArrayList.add(new Item(getString(R.string.Parties),0));
        itemArrayList.add(new Item(getString(R.string.Conferences),0));

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(getActivity(), R.layout.item_layout,itemArrayList);
        ListView listView = rootView.findViewById(R.id.LandmarkListView);
        listView.setAdapter(itemArrayAdapter);

        return rootView;
    }


}
