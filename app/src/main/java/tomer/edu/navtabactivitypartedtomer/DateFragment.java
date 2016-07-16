package tomer.edu.navtabactivitypartedtomer;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tomer.edu.navtabactivitypartedtomer.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DateFragment extends Fragment {


    public DateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_date, container, false);
        //findViewById, setOn...Listener.
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //findViewById, setOn...Listener.
    }
}
