package com.example.android.whatkindoftravellerareyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int points = 0;
    //This is a variable for initial points value.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method adds points for each question to the total points count. It returns the final points value.
     */

    public int checkResult() {
        RadioButton hotel = (RadioButton) findViewById(R.id.hotel_radio_button);
        if (hotel.isChecked()) {
            points = points + 3;
        }
        RadioButton cottage = (RadioButton) findViewById(R.id.cottage_radio_button);
        if (cottage.isChecked()) {
            points = points + 2;
        }
        RadioButton tent = (RadioButton) findViewById(R.id.tent_radio_button);
        if (tent.isChecked()) {
            points = points + 1;
        }
        RadioButton myself = (RadioButton) findViewById(R.id.myself_radio_button);
        if (myself.isChecked()) {
            points = points + 1;
        }
        RadioButton friend = (RadioButton) findViewById(R.id.friend_radio_button);
        if (friend.isChecked()) {
            points = points + 2;
        }
        RadioButton agency = (RadioButton) findViewById(R.id.agency_radio_button);
        if (agency.isChecked()) {
            points = points + 1;
        }
        RadioButton car = (RadioButton) findViewById(R.id.car_radio_button);
        if (car.isChecked()) {
            points = points + 3;
        }
        RadioButton bus = (RadioButton) findViewById(R.id.bus_radio_button);
        if (bus.isChecked()) {
            points = points + 2;
        }
        RadioButton onFoot = (RadioButton) findViewById(R.id.on_foot_radio_button);
        if (onFoot.isChecked()) {
            points = points + 1;
        }
        RadioButton sunny = (RadioButton) findViewById(R.id.sunny_radio_button);
        if (sunny.isChecked()) {
            points = points + 3;
        }
        RadioButton snowy = (RadioButton) findViewById(R.id.snowy_radio_button);
        if (snowy.isChecked()) {
            points = points + 1;
        }
        RadioButton mixed = (RadioButton) findViewById(R.id.mixed_radio_button);
        if (mixed.isChecked()) {
            points = points + 2;
        }
        RadioButton lazy = (RadioButton) findViewById(R.id.lazy_radio_button);
        if (lazy.isChecked()) {
            points = points + 3;
        }
        RadioButton active = (RadioButton) findViewById(R.id.active_radio_button);
        if (active.isChecked()) {
            points = points + 1;
        }
        RadioButton tourist = (RadioButton) findViewById(R.id.tourist_radio_button);
        if (tourist.isChecked()) {
            points = points + 2;
        }

        return points;
    }

    /**
     * This method links appropriate result messages with particular points scopes.
     */

    public String yourResult() {

        if (points < 5) {
            String resultMessage = getString(R.string.message4);
            return resultMessage;
        } else if (points <= 7) {
            String resultMessage = getString(R.string.message1);
            return resultMessage;
        } else if (points <= 12) {
            String resultMessage = getString(R.string.message2);
            return resultMessage;
        } else if (points <= 15) {
            String resultMessage = getString(R.string.message3);
            return resultMessage;
        }
        return yourResult();
    }

    /**
     * This method displays the user’s name, number of points, appropriate result message.
     */


    public void showScore(View view) {
        points = checkResult();
        String message = yourResult();
        EditText name = (EditText) findViewById(R.id.name);
        String myName = name.getText().toString();

        TextView scoreTextView = (TextView) findViewById(R.id.result_text_view);
        scoreTextView.setText(myName + getString(R.string.result_you_got) + " " + points + " " + getString(R.string.result_points) + " " + message);
    }


}
