package virbac.virbacapp;

/**
 * Created by omar on 27/09/15.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonFloat;

/**
 * Created by omar on 27/09/15.
 */

public class Fragment4Manag extends Fragment {
    ButtonFloat suivMaterialBtn;
    ButtonFloat precedMaterialBtn;

    // this Fragment will be called from MainActivity
    public Fragment4Manag(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_manag, container, false);
        suivMaterialBtn = (ButtonFloat) rootView.findViewById(R.id.suivManag);
        suivMaterialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Pass to next Health category ...", Toast.LENGTH_LONG).show();
                Fragment fragment = null;

                fragment = new Fragment6Heal();
                android.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit();

                getActivity().setTitle(Main.tagTitles[5]);
                /*Main.drawerList.setItemChecked(1, true);
                Main.drawerList.setSelection(1);
                Main.drawerLayout.closeDrawer(Main.drawerList);*/
            }
        });

        precedMaterialBtn = (ButtonFloat) rootView.findViewById(R.id.precedManag);
        precedMaterialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "return to Husbandry category ...", Toast.LENGTH_LONG).show();
                Fragment fragment = null;

                fragment = new Fragment2Husbandry();
                android.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit();

                getActivity().setTitle(Main.tagTitles[1]);
                /*Main.drawerList.setItemChecked(1, true);
                Main.drawerList.setSelection(1);
                Main.drawerLayout.closeDrawer(Main.drawerList);*/
            }
        });
        return rootView;
    }
}
