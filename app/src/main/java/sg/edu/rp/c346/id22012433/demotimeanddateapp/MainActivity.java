package sg.edu.rp.c346.id22012433.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
DatePicker dp;
TimePicker tp;
Button btnDisplayDate;
Button btnDisplayTime;
Button btnReset;
TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.resetButton);
        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
     tvDisplay.setText("Time is "+tp.getCurrentHour()+":"+tp.getCurrentMinute());
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Date is "+dp.getDayOfMonth()+"/"+(dp.getMonth()+1)+"/"+dp.getYear());
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            tp.setCurrentHour(0);
            tp.setCurrentMinute(0);
            dp.updateDate(2020,0,01);
            }
        });

        }

}
