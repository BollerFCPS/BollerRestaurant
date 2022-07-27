package com.example.bollerrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class OrderOnlineActivity extends AppCompatActivity {

    RadioButton smallMarRad, largeMarRad, largePlusMarRad, smallQuesoRad, largeQuesoRad, largeChorizoRad;

    FloatingActionButton marFAB, chipFAB;
    int margIndex, chipIndex;
    double total, totalplustax;
    TextView totalTV, totalWTaxTV, taxTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_online);
        food order = new food();

        margIndex = 0;
        chipIndex = 0;
        total = 0.0;
        totalplustax = 0.0;
        smallMarRad = (RadioButton) findViewById(R.id.smallMar);
        largeMarRad = (RadioButton) findViewById(R.id.largeMar);
        largePlusMarRad = (RadioButton) findViewById(R.id.largePlusMar);
        smallQuesoRad = (RadioButton) findViewById(R.id.smallQueso);
        largeQuesoRad = (RadioButton) findViewById(R.id.largeQueso);
        largeChorizoRad = (RadioButton) findViewById(R.id.largeChorizo);
        totalTV = (TextView) findViewById(R.id.subtotalAMT);
        totalWTaxTV = (TextView) findViewById(R.id.total_AMT);
        taxTV = (TextView) findViewById(R.id.tax_AMT);

        marFAB = (FloatingActionButton) findViewById(R.id.addMargFAB);
        chipFAB = (FloatingActionButton) findViewById(R.id.addChipsFAB);

        marFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(smallMarRad.isChecked()){
                    margIndex = 0;
                }
                else if (largeMarRad.isChecked()){
                    margIndex = 1;
                }
                else if (largePlusMarRad.isChecked()){
                    margIndex = 2;
                }
                else { Toast.makeText(getApplicationContext(), "You must select a Margarita option.", Toast.LENGTH_SHORT).show();}
                if(margIndex<3){
                    total = order.calcMarg(margIndex);
                }
                totalTV.setText("$" + String.format("%.2f",total));
                taxTV.setText("$" + String.format("%.2f", total * .06));
                totalWTaxTV.setText ( "$" + String.format("%.2f",(total + (total * .06) )));
            }
        });

        chipFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(smallQuesoRad.isChecked()){
                    chipIndex = 0;
                }
                else if (largeQuesoRad.isChecked()){
                    chipIndex = 1;
                }
                else if (largeChorizoRad.isChecked()){
                    chipIndex = 2;
                }
                else { Toast.makeText(getApplicationContext(), "You must select a Chip option.", Toast.LENGTH_SHORT).show();}
                if(chipIndex<3){
                    total = order.calcChip(chipIndex);
                }
                totalTV.setText("$" + String.format("%.2f",total));
                taxTV.setText("$" + String.format("%.2f", total * .06));
                totalWTaxTV.setText ( "$" + String.format("%.2f",(total + (total * .06) )));
            }
        });





            }
        }
        
