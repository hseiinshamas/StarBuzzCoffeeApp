package com.hfad.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends AppCompatActivity {
    public static final String EXTRA_DRINKID = "drinkId";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // get the drink from the intent
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId]; // use the drink id to get details of the drink the user chose

        // populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        // populate the drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());

        // populate the drink image
        ImageView image = (ImageView) findViewById(R.id.photo);
        image.setImageResource(drink.getImageResourceId());
    }
}