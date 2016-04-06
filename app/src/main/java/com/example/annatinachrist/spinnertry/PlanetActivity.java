package com.example.annatinachrist.spinnertry;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class PlanetActivity extends Activity implements AdapterView.OnItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);

        Spinner spinner = (Spinner) findViewById(R.id.planet_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(this);




    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView textView = (TextView) findViewById(R.id.planet_text);
        ImageView imageView = (ImageView) findViewById(R.id.planet_pictures);
        TextView blurbText = (TextView) findViewById(R.id.planet_blurb);


        switch (position){
            case 0:
                //On selecting an item
                String item = parent.getItemAtPosition(position).toString();

                //showing selected spinner item
                textView.setText(item);

                //Show the blurb for the planet
                blurbText.setText(R.string.mercury);

                //Display picture in Image view

                imageView.setImageResource(R.drawable.mercury);

                break;
            case 1:
                //On selecting an item
                String item1 = parent.getItemAtPosition(position).toString();

                //showing selected spinner item

                textView.setText(item1);

                blurbText.setText(R.string.venus);

                //Display picture in image view

                imageView.setImageResource(R.drawable.venus);
                break;
            case 2:

                String item2 = parent.getItemAtPosition(position).toString();


                textView.setText(item2);
                blurbText.setText(R.string.earth);

                imageView.setImageResource(R.drawable.earth);
                break;

            case 3:
                String item3 = parent.getItemAtPosition(position).toString();

                textView.setText(item3);
                blurbText.setText(R.string.mars);

                imageView.setImageResource(R.drawable.mars);
                break;

            case 4:
                String item4 = parent.getItemAtPosition(position).toString();

               textView.setText(item4);
                blurbText.setText(R.string.jupiter);

                imageView.setImageResource(R.drawable.jupiter);
                break;


            case 5:
                String item5 = parent.getItemAtPosition(position).toString();

               textView.setText(item5);
                blurbText.setText(R.string.saturn);

                imageView.setImageResource(R.drawable.saturn);
                break;
            case 6:
                String item6 = parent.getItemAtPosition(position).toString();

                textView.setText(item6);
                blurbText.setText(R.string.uranus);

                imageView.setImageResource(R.drawable.uranus);
                break;
            case 7:

                String item7 = parent.getItemAtPosition(position).toString();

                textView.setText(item7);
                blurbText.setText(R.string.neptune);

                imageView.setImageResource(R.drawable.neptune);
                break;
        }







    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
