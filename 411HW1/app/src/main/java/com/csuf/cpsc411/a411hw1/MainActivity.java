package com.csuf.cpsc411.a411hw1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        root.setLayoutParams(rParams);

        root.setBackgroundColor(Color.GRAY);
        root.setColumnCount(4);
        root.setRowCount(5);

        TextView tv = new TextView(this);
        tv.setText("Rules void hello1(int hor)");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        //--------------------------------------------------------------
        GridLayout.Spec row_spec = GridLayout.spec(0, 0f); //this is basically the homework
        GridLayout.Spec col_spec = GridLayout.spec(1, 0f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Properties \n \n Rule \n R10 \n R20 \n R30 \n R40");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(1,2, 1f);
        col_spec = GridLayout.spec(0, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        //----------------------------------------------------------------
        tv = new TextView(this);
        tv.setText("name \n catagory \n C1 \n min <=hour && hour <= max");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(1, 1, 0f);
        col_spec = GridLayout.spec(1, 1,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        //----------------------------------------------------------------
        tv = new TextView(this);
        tv.setText("int min \n From \n 0 \n 12 \n 18 \n 22");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(2, 1f);
        col_spec = GridLayout.spec(1, 0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        //--------------------------------------------------------------
        tv = new TextView(this);
        tv.setText("int max \n To \n 11 \n 17 \n 21 \n 23");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(2,2f);
        col_spec = GridLayout.spec(2, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        //---------------------------------------------------------------
        tv = new TextView(this);
        tv.setText("Day Hour Classification \n Day and Time");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.WHITE);



        /*
        for(int i=2; i<=3; i++)
        {
            TextView tv = new TextView(this);
            tv.setText("String" + i);
            tv.setTextSize(16);
            tv.setBackgroundColor(Color.BLUE);
            root.addView(tv);


        }
        */

        setContentView(root);
    }

}
