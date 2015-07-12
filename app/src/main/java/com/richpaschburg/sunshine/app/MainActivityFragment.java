package com.richpaschburg.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        // Reference: GitHub code from Shawn Moss was useful in determining how to
        // code rootView.

        String[] forecastArray = {
            "Today - Sunny - 88/63",
            "Tomorrow - Foggy - 70/40",
            "Weds - Cloudy - 72/63",
            "Thurs - Asteroids - 75/65",
            "Fri - Heavy Rain - 75/65",
            "Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
            "Sun - Sunny - 80/68"
        };

        List<String> weekForecast = new ArrayList<>(
            Arrays.asList(forecastArray));

        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<> (
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        ListView listView = (ListView) rootView.findViewById(
                R.id.listView_forecast);
                listView.setAdapter(mForecastAdapter);

        return rootView;

    }
}
