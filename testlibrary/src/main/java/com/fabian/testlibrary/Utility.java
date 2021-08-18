package com.fabian.testlibrary;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Utility {
    public static Toast toast;
    public static Context context;

    public static void showToast(Context context, String message) {
        if (toast == null) {
            toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
        }
        toast.setText(message);
        toast.show();
    }

    public static void getDate(Context context, final TextView textview) {
        Calendar calendar = Calendar.getInstance();
        new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                textview.setTextColor(Color.BLUE);
                textview.setText(String.format("%d/%d/%d", year, month + 1, dayOfMonth));
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
    }
}
