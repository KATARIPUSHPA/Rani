package com.example.mlrit.rani;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Spinner spn;
    EditText et1;
    Button b1;
    TextView t1;
    int pos;

    String[] names={"DOLLAR","YEN","EURO","RUPEES"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spn=(Spinner)findViewById(R.id.sp2);
        b1=(Button)findViewById(R.id.b1);
        et1=(EditText)findViewById(R.id.et1);
        t1=(TextView)findViewById(R.id.t1);

        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,names);
        spn.setAdapter(aa);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                          @Override
                                          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                              pos=position;
                                          }

                                          @Override
                                          public void onNothingSelected(AdapterView<?> parent) {

                                          }
                                      



        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1=et1.getText().toString();
                long val=Long.parseLong(s1);

                if(pos==0)
                {
                    val=val*100;
                    t1.setText(""+val);

                }
                else if(pos==1)
                {
                    val=val*50;
                    t1.setText(""+val);
                }
              else if(pos==2)
                {
                    val=val*20;
                    t1.setText(""+val);
                }

                else if(pos==3)
                {
                    val=val*10;
                    t1.setText(""+val);
                }
            }
        });
    }
}
