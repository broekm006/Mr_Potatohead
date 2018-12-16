///
// Marc van den Broek
// 12469602
//
//  This application allows you to create mr.potatohead part for part with checkboxes.
///

package com.potatohead.mr.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int resID_from_name;
    ImageView image;

    private ImageView arms;
    private ImageView mustache;
    private ImageView nose;
    private ImageView shoes;
    private ImageView glasses;
    private ImageView eyes;
    private ImageView hat;
    private ImageView ears;
    private ImageView mouth;
    private ImageView eyebrows;

    // create app > get layout file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arms = findViewById(R.id.arms);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);
        glasses = findViewById(R.id.glasses);
        eyes = findViewById(R.id.eyes);
        hat = findViewById(R.id.hat);
        ears = findViewById(R.id.ears);
        mouth = findViewById(R.id.mouth);
        eyebrows = findViewById(R.id.eyebrows);
    }

    // save state for in memory
    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("arms", arms.getVisibility());
        outState.putInt("mustache", mustache.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());
        outState.putInt("eyes", eyes.getVisibility());
        outState.putInt("hat", hat.getVisibility());
        outState.putInt("ears", ears.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());

    }

    // restore state for in memory
    @Override
    protected void onRestoreInstanceState(Bundle savedState)
    {
        super.onRestoreInstanceState(savedState);

        arms.setVisibility(savedState.getInt("hat"));
        mustache.setVisibility(savedState.getInt("mustache"));
        nose.setVisibility(savedState.getInt("nose"));
        shoes.setVisibility(savedState.getInt("shoes"));
        glasses.setVisibility(savedState.getInt("glasses"));
        eyes.setVisibility(savedState.getInt("eyes"));
        hat.setVisibility(savedState.getInt("hat"));
        ears.setVisibility(savedState.getInt("ears"));
        mouth.setVisibility(savedState.getInt("mouth"));
        eyebrows.setVisibility(savedState.getInt("eyebrows"));
    }

    // check if checkbox is clicked
    public void checkClicked(View v)
    {
        CheckBox checkbox = (CheckBox) v;
        Log.d("potato", "checkClicked: ");
        String get_name = checkbox.getText().toString();

        // use string name resource for the id of the image
        resID_from_name = getResources().getIdentifier(get_name, "id", getPackageName()); //google power

        // check if checkbox is checked. And show or don't shown image accordingly
        if(checkbox.isChecked() == false)
        {
            image = findViewById(resID_from_name);
            image.setVisibility(View.INVISIBLE);
        }

        else
        {
            image = findViewById(resID_from_name);
            image.setVisibility(View.VISIBLE);
        }
    }
}
