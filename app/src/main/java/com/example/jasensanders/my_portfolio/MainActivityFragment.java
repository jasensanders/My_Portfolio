package com.example.jasensanders.my_portfolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

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

        final Button Button1 = (Button) rootView.findViewById(R.id.button);
        Button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context = getActivity();
                CharSequence text = "This button wil launch my Spotify Streamer app!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });
        final Button Button2 = (Button) rootView.findViewById(R.id.button2);
        Button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context = getActivity();
                CharSequence text = "This button wil launch my Scores app!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });
        final Button Button3 = (Button) rootView.findViewById(R.id.button3);
        Button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context = getActivity();
                CharSequence text = "This button wil launch my Library app!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });
        final Button Button4 = (Button) rootView.findViewById(R.id.button4);
        Button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context = getActivity();
                CharSequence text = "This button wil launch my Build It Bigger app!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });
        final Button Button5 = (Button) rootView.findViewById(R.id.button5);
        Button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context = getActivity();
                CharSequence text = "This button wil launch my XYZ Reader app!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });
        final Button Button6 = (Button) rootView.findViewById(R.id.button6);
        Button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context = getActivity();
                CharSequence text = "This button wil launch my CapStone app!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });


        return rootView;
    }
}
