package com.example.user.jetsetmars;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class parameters extends AppCompatActivity {

    private double m_Text = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parameters);

        int value = getIntent().getExtras().getInt("bucketno");

        String marsParameter = getString(R.string.mars_parameter);
        String marsThermoDetails = getString(R.string.mars_thermo_details);
        String marsRainFall = getString(R.string.mars_rainfall_details);
        String marsAtmComp = getString(R.string.mars_atm_compdetails);

        String earthParameter = getString(R.string.earth_parameter);
        String earthThermoDetails = getString(R.string.earth_thermo_details);
        String earthRainFall = getString(R.string.earth_rainfall_details);
        String earthAtmComp = getString(R.string.earth_atm_compdetails);

        String moonParameter = getString(R.string.moon_parameter);
        String moonThermoDetails = getString(R.string.moon_thermo_details);
        String moonRainFall = getString(R.string.moon_rainfall_details);
        String moonAtmComp = getString(R.string.moon_atm_compdetails);

        switch (value) {
            case 1:
                TextView textView = (TextView) findViewById(R.id.txtMarsParameter);
                textView.setText(marsParameter);
                TextView textView1 = (TextView) findViewById(R.id.txtMarsThermoDetails);
                textView1.setText(marsThermoDetails);
                TextView textView2 = (TextView) findViewById(R.id.txtMarsRainFall);
                textView2.setText(marsRainFall);
                TextView textView3 = (TextView) findViewById(R.id.txtMarsAtmComp);
                textView3.setText(marsAtmComp);

                break;
            case 2:
                TextView textView4 = (TextView) findViewById(R.id.txtMarsParameter);
                textView4.setText(earthParameter);
                TextView textView5 = (TextView) findViewById(R.id.txtMarsThermoDetails);
                textView5.setText(earthThermoDetails);
                TextView textView6 = (TextView) findViewById(R.id.txtMarsRainFall);
                textView6.setText(earthRainFall);
                TextView textView7 = (TextView) findViewById(R.id.txtMarsAtmComp);
                textView7.setText(earthAtmComp);

                break;
            case 3:
                TextView textView8 = (TextView) findViewById(R.id.txtMarsParameter);
                textView8.setText(moonParameter);
                TextView textView9 = (TextView) findViewById(R.id.txtMarsThermoDetails);
                textView9.setText(moonThermoDetails);
                TextView textView10 = (TextView) findViewById(R.id.txtMarsRainFall);
                textView10.setText(moonRainFall);
                TextView textView11 = (TextView) findViewById(R.id.txtMarsAtmComp);
                textView11.setText(moonAtmComp);

                break;
        }

    }

    public void onClickDesignMaterials(View v)
    {
        int value = getIntent().getExtras().getInt("bucketno");
        Intent intent = new Intent(parameters.this, Main2Activity.class);
        intent.putExtra("bucketno", value);
        startActivity(intent);

    }

    public void onClickJetPacks(View v)
    {
        Intent intent = new Intent(parameters.this, jetpacks.class);
        startActivity(intent);
    }

}
