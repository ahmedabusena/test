package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button btnnotifacation,btndialog,btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);


        btnToast =(Button) findViewById(R.id.btnToast);
        btndialog =(Button)findViewById(R.id.btndialog);
        btnnotifacation =(Button)findViewById(R.id.btnnotifacation);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t= (Toast) Toast.makeText(MainActivity.this,"hello toast",Toast.LENGTH_LONG);
                t.show();
                t.setGravity(Gravity.TOP,0,0);

            }
        });
        btndialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("welcom");
                dialog.setMessage("are you sure ");
                dialog.setIcon(R.drawable.ic_launcher_background);
                dialog.setNegativeButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("Negative button","ok");
                    }
                });
                dialog.setPositiveButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("Postive button","cancel");
                    }
                });
                dialog.show();

            }
        });


    }


    @Override
    public void onClick(View view) {

    }
}

