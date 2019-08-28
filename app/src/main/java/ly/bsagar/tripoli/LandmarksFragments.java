package ly.bsagar.tripoli;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class LandmarksFragments extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item(getString(R.string.Natural_Arches), R.drawable.naturalarches));
        itemArrayList.add(new Item(getString(R.string.Watterfalls), R.drawable.waterfalls));
        itemArrayList.add(new Item(getString(R.string.RockCaveArt), R.drawable.rockart));
        itemArrayList.add(new Item(getString(R.string.Garamantes), R.drawable.garamantes));
        itemArrayList.add(new Item(getString(R.string.LandmarksGreekEtc), R.drawable.phoeniciansgreeklsandromas));

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(getActivity(), R.layout.item_layout, itemArrayList);
        ListView listView = rootView.findViewById(R.id.LandmarkListView);
        listView.setAdapter(itemArrayAdapter);

        return rootView;
    }
}
