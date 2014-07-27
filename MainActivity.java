package com.example.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        //Creating Button variable
        Button button = (Button) findViewById(R.id.bt);      
       
       //Adding Listener to button
         button.setOnClickListener(new View.OnClickListener() {
           
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               
                //Creating TextView Variable
                TextView text = (TextView) findViewById(R.id.tv);
               
                //Sets the new text to TextView (runtime click event)
                text.setText("Very good.You have clicked the button.");
            }
        });
   
    }
}
