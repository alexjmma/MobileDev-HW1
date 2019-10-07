package com.csuf.cpsc411.a411hw1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
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
        root.setColumnCount(3);
        root.setRowCount(3);

        TextView tv = new TextView(this);
        tv.setText("Rules void hello1(int hor)");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);

        GridLayout.Spec row_spec = GridLayout.spec(0,GridLayout.CENTER); //this is basically the homework
        GridLayout.Spec col_spec = GridLayout.spec(2);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(5, 10, 5, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        //----------------------------------------------------------------
        tv = new TextView(this);
        tv.setText("Properties \n \n Rule \n R10 \n R20 \n R30 \n R40");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(1);
        col_spec = GridLayout.spec(0, 0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        //-----------------------------------------------------------------
        tv = new TextView(this);
        tv.setText("name \n catagory \n C1 \n min <=hour && hour <= max");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(1);
        col_spec = GridLayout.spec(1, GridLayout.CENTER);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        //-----------------------------------------------------------------
        tv = new TextView(this);
        tv.setText("int min \n From \n 0 \n 12 \n 18 \n 22");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(2, GridLayout.CENTER);
        col_spec = GridLayout.spec(1, GridLayout.ALIGN_BOUNDS);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 5, 5, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

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
