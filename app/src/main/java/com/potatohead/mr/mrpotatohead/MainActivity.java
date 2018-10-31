///
// Marc van den Broek
// 12469602
//
//  This application allows you to create mr.potatohead part for part with checkboxes.
///

package com.potatohead.mr.mrpotatohead;

import android.media.Image;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // create app > get layout file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // save state for in memory
    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
    }

    // check if checkbox is clicked
    public void checkClicked(View v)
    {
        CheckBox checkbox = (CheckBox) v;
        Log.d("potato", "checkClicked: ");
        String x = checkbox.getText().toString();

        // use string name resource for the id of the image
        int idss = getResources().getIdentifier(x, "id", getPackageName()); //google power

        // check if checkbox is checked. And show or dont shown image accordingly
        if(checkbox.isChecked() == false)
        {
            ImageView image = findViewById(idss);
            image.setVisibility(View.INVISIBLE);
        }

        else
        {
            ImageView image = findViewById(idss);
            image.setVisibility(View.VISIBLE);
        }
    }
}
