package com.gpaddy.mylibrarydemo;

import android.content.Context;
import android.widget.Toast;

public class DemoCalculator {
    public static int sum(Context c,int a, int b) {
        int sum = 0;
        sum = a + b;
        Toast.makeText(c, "Sum: a+b="+sum, Toast.LENGTH_SHORT).show();
        return sum;
    }

    public static int sub(Context c,int a, int b) {
        int sum = 0;
        sum = a - b;
        Toast.makeText(c, "Sub: a+b="+sum, Toast.LENGTH_SHORT).show();
        return sum;
    }


}
