package ly.bsagar.tripoli;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ResturantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_layout, container, false);
        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item(getString(R.string.Pizza_J3J3),0));
        itemArrayList.add(new Item(getString(R.string.Dilevry_Cafe),0));
        itemArrayList.add(new Item(getString(R.string.Lamma),0));
        itemArrayList.add(new Item(getString(R.string.Taza),0));
        itemArrayList.add(new Item(getString(R.string.ThePalmCafe),0));
        itemArrayList.add(new Item(getString(R.string.Pizza_Family),0));
        itemArrayList.add(new Item(getString(R.string.PapaRotiRestaurant),0));

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(getActivity(), R.layout.item_layout,itemArrayList);
        ListView listView = rootView.findViewById(R.id.LandmarkListView);
        listView.setAdapter(itemArrayAdapter);

        return rootView;
    }

}
