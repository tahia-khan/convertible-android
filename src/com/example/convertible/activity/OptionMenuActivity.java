package com.example.convertible.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.convertible.R;
import com.example.convertible.activity.AreaConversionActivity;

/**
 * Created with IntelliJ IDEA.
 * User: shawli
 * Date: 11/05/13
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */

public class OptionMenuActivity extends Activity {

    static final String[] OPTIONS = new String[] { "option_area", "length", "volume",
            "mass", "number system", "temperature", "speed", "angle"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_screen);

        Typeface font = Typeface.createFromAsset(getAssets(), "Roboto_Thin.ttf");
        TextView txt = (TextView) findViewById(R.id.sexy);
        txt.setTypeface(font);
        font = Typeface.createFromAsset(getAssets(), "Roboto_Light.ttf");
        txt = (TextView) findViewById(R.id.convert);
        txt.setTypeface(font);

        font = Typeface.createFromAsset(getAssets(), "Roboto_Thin.ttf");
        txt = (TextView) findViewById(R.id.option_area);
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.option_length);
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.option_mass);
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.option_number_system);
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.option_volume);
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.option_speed);
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.option_temperature);
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.option_angle);
        txt.setTypeface(font);
    };

    public void onAreaButtonClick(View view) {
        Intent intent = new Intent(this, AreaConversionActivity.class);
        startActivity(intent);
    }

    public void onLengthButtonClick(View view) {
        Intent intent = new Intent(this, LengthConversionActivity.class);
        startActivity(intent);
    }

    public void onVolumeButtonClick(View view) {
        Intent intent = new Intent(this, VolumeConversionActivity.class);
        startActivity(intent);
    }

    public void onMassButtonClick(View view) {
        Intent intent = new Intent(this, MassConversionActivity.class);
        startActivity(intent);
    }

    public void onNumberSystemButtonClick(View view) {
        Intent intent = new Intent(this, NumberSystemConversionActivity.class);
        startActivity(intent);
    }

    public void onTemperatureButtonClick(View view) {
        Intent intent = new Intent(this, TemperatureConversionActivity.class);
        startActivity(intent);
    }

    public void onSpeedButtonClick(View view) {
        Intent intent = new Intent(this, SpeedConversionActivity.class);
        startActivity(intent);
    }

    public void onAngleButtonClick(View view) {
        Intent intent = new Intent(this, AngleConversionActivity.class);
        startActivity(intent);
    }


}

