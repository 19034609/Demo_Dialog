package sg.edu.c346.id19034609.demodialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.time.Year;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnDemo1, btnDemo2, btnDemo3, btnExe3, btnDemo4, btnDemo5;
    TextView tvDemo2, tvDemo3, tvExe3, tvDemo4, tvDemo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDemo1 = findViewById(R.id.buttonDemo1);
        btnDemo2 = findViewById(R.id.buttonDemo2);
        btnDemo3 = findViewById(R.id.buttonDemo3);
        btnExe3 = findViewById(R.id.buttonExe3);
        btnDemo4 = findViewById(R.id.buttonDemo4);
        btnDemo5 = findViewById(R.id.buttonDemo5);
        tvDemo2 = findViewById(R.id.textViewDemo2);
        tvDemo3 = findViewById(R.id.textViewDemo3);
        tvExe3 = findViewById(R.id.textViewExe3);
        tvDemo4 = findViewById(R.id.textViewDemo4);
        tvDemo5 = findViewById(R.id.textViewDemo5);

//        AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

//        myBuilder.setTitle ("Demo 1-Simple Dialog");
//        myBuilder.setMessage("I can develop Android App.");
//        myBuilder.setCancelable(false);
//        myBuilder.setPositiveButton("Close",null);

//        myBuilder.setTitle ("Congratulations");
//        myBuilder.setMessage("You have completed a simple Dialog Box.");
//        myBuilder.setCancelable(false);
//        myBuilder.setPositiveButton("Dismiss",null);

//        myBuilder.setTitle ("Demo 2 Buttons Dialog");
//        myBuilder.setMessage("Select one of the Buttons below.");
//        myBuilder.setCancelable(false);
//
//        myBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                tvDemo2.setText("You have selected Positive.");
//            }
//        });
//
//        myBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                tvDemo2.setText("You have selected Negative.");
//            }
//        });

//        AlertDialog myDialog = myBuilder.create();
//        myDialog.show();

//        DEMO 3

//        btnDemo3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                View viewDialog = inflater.inflate(R.layout.input, null);
//
//                final EditText etInput = viewDialog.findViewById(R.id.editTextInput);
//
//                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
//                myBuilder.setView(viewDialog);
//                myBuilder.setTitle ("Demo 3 Text input Dialog");
//                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        String message = etInput.getText().toString();
//                        tvDemo3.setText(message);
//                    }
//                });
//                myBuilder.setNegativeButton("CANCEL",null);
//                AlertDialog myDialog = myBuilder.create();
//                myDialog.show();
//            }
//        });

//        EXE 3

//        btnExe3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                View viewDialog = inflater.inflate(R.layout.input_exe3, null);
//
//                final EditText etInput1 = viewDialog.findViewById(R.id.editTextnput1);
//                final EditText etInput2 = viewDialog.findViewById(R.id.editTextnput2);
//
//                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
//                myBuilder.setView(viewDialog);
//                myBuilder.setTitle ("Exercise 3");
//                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        int num1 = Integer.parseInt(etInput1.getText().toString());
//                        int num2 = Integer.parseInt(etInput2.getText().toString());
//                        tvExe3.setText("The sum is " + (num1 + num2));
//                    }
//                });
//                myBuilder.setNegativeButton("CANCEL",null);
//                AlertDialog myDialog = myBuilder.create();
//                myDialog.show();
//            }
//        });

//        DEMO 4

//        btnDemo4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                        tvDemo4.setText("Date: " + dayOfMonth + "/" + (monthOfYear+1) + "/" + year);
//                    }
//                };
//
//                Calendar current = Calendar.getInstance();
//
//                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, myDateListener, current.get(Calendar.YEAR), current.get(Calendar.MONTH), current.get(Calendar.DAY_OF_MONTH));
//                myDateDialog.show();
//            }
//        });

//        DEMO 5

        btnDemo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        tvDemo5.setText("Time: " + hourOfDay + ":" + minute);
                    }
                };

                Calendar current = Calendar.getInstance();

                TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this, myTimeListener, current.get(Calendar.HOUR), current.get(Calendar.MINUTE), false);

                myTimeDialog.show();
            }
        });
    }
}