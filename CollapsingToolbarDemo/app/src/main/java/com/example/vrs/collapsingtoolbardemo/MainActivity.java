package com.example.vrs.collapsingtoolbardemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String MyPREFERENCES = "MyPrefs" ;
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;
    FloatingActionButton floatingActionButton;
    int mutedColor = R.attr.colorPrimary;
    RecyclerView recyclerView;
    SharedPreferences sharedpreferences;
    CardAdapter adapter;
    List<Flower> flowers;
    TextView Name,Email,Gender,DOB,Mobile,Blood,Height,Heart,Hba1c,Weight,BP1,BP2,BP3,BG1,BG2,BG3,LP1,LP2,LP3,LP4;

    public static final String name = "-";
    public static final String email = "-";
    public static final String gender = "-";
    public static final String dob = "-";
    public static final String mobile = "-";
    public static final String blood = "-";
    public static final String height = "-";
    public static final String heart = "-";
    public static final String weight= "-";
    public static final String hba1c = "-";
    public static final String b1 = "-";
    public static final String b2 = "-";
    public static final String b3 = "-";
    public static final String b4 = "-";
    public static final String b5 = "-";
    public static final String b6 = "-";
    public static final String l1 = "-";
    public static final String l2 = "-";
    public static final String l3 = "-";
    public static final String l4 = "-";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        floatingActionButton=(FloatingActionButton)findViewById(R.id.fab);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        toolbar.setTitle("Hello");
        collapsingToolbarLayout.setTitle("Ram");

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        setSupportActionBar(toolbar);

        if (sharedpreferences.contains(name)) {
            Name.setText(sharedpreferences.getString(name, ""));
        }
        if (sharedpreferences.contains(gender)) {
            Gender.setText(sharedpreferences.getString(gender, ""));
        }
        if (sharedpreferences.contains(email)) {
            Email.setText(sharedpreferences.getString(email, ""));
        }
        if (sharedpreferences.contains(dob)) {
            DOB.setText(sharedpreferences.getString(dob, ""));
        }

        if (sharedpreferences.contains(mobile)) {
            Mobile.setText(sharedpreferences.getString(mobile, ""));
        }
        if (sharedpreferences.contains(blood)) {
            Blood.setText(sharedpreferences.getString(blood, ""));
        }

        if (sharedpreferences.contains(height)) {
            Height.setText(sharedpreferences.getString(height, ""));
        }
        if (sharedpreferences.contains(weight)) {
            Weight.setText(sharedpreferences.getString(weight, ""));
        }

        if (sharedpreferences.contains(heart)) {
            Heart.setText(sharedpreferences.getString(heart, ""));
        }
        if (sharedpreferences.contains(b1)) {
            BP1.setText(sharedpreferences.getString(b1, ""));
        }

        if (sharedpreferences.contains(b2)) {
            BP2.setText(sharedpreferences.getString(b2, ""));
        }
        if (sharedpreferences.contains(b3)) {
            BP3.setText(sharedpreferences.getString(b3, ""));
        }

        if (sharedpreferences.contains(b4)) {
            BG1.setText(sharedpreferences.getString(b4, ""));
        }
        if (sharedpreferences.contains(b5)) {
            BG2.setText(sharedpreferences.getString(b5, ""));
        }




        //recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);
        initializeData();
        adapter = new CardAdapter(getApplicationContext(), flowers);
        recyclerView.setAdapter(adapter);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputDialog();
            }
        });
    }

    private void initializeData() {
        flowers = new ArrayList<>();
        flowers.add(new Flower("Name", "Ramkesh Meena"));


    }

    protected void showInputDialog() {



        // get prompts.xml view
        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
        View promptView = layoutInflater.inflate(R.layout.popup_layout, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setView(promptView);

         Name=(TextView) findViewById(R.id.textView2);
         Gender=(TextView) findViewById(R.id.textView4);
         DOB=(TextView) findViewById(R.id.textView6);
         Email=(TextView) findViewById(R.id.textView8);
         Mobile=(TextView) findViewById(R.id.textView10);
         Blood=(TextView) findViewById(R.id.textView12);
         Height=(TextView) findViewById(R.id.textView14);
         Weight=(TextView) findViewById(R.id.textView16);
         Heart=(TextView) findViewById(R.id.textView20);
         BP1=(TextView) findViewById(R.id.textView22);
         BP2=(TextView) findViewById(R.id.textView23);
         BP3=(TextView) findViewById(R.id.textView24);
         BG1=(TextView) findViewById(R.id.textView30);
         BG2=(TextView) findViewById(R.id.textView31);
         BG3=(TextView) findViewById(R.id.textView32);
         LP1=(TextView) findViewById(R.id.textView38);
         LP2=(TextView) findViewById(R.id.textView39);
         LP3=(TextView) findViewById(R.id.textView40);
         LP4=(TextView) findViewById(R.id.textView41);
         Hba1c=(TextView) findViewById(R.id.textView48);



        final EditText editText = (EditText) promptView.findViewById(R.id.edittext);
        final EditText editText2 = (EditText) promptView.findViewById(R.id.edittext2);
        final EditText editText3 = (EditText) promptView.findViewById(R.id.edittext3);
        final EditText editText4 = (EditText) promptView.findViewById(R.id.edittext4);
        final EditText editText5 = (EditText) promptView.findViewById(R.id.edittext5);
        final EditText editText6 = (EditText) promptView.findViewById(R.id.edittext6);
        final EditText editText7 = (EditText) promptView.findViewById(R.id.edittext7);
        final EditText editText8 = (EditText) promptView.findViewById(R.id.edittext8);

        final EditText editText9 = (EditText) promptView.findViewById(R.id.edittext9);
        final EditText editText10 = (EditText) promptView.findViewById(R.id.edittext10);
        final EditText editText11 = (EditText) promptView.findViewById(R.id.edittext11);
        final EditText editText12 = (EditText) promptView.findViewById(R.id.edittext12);
        final EditText editText13 = (EditText) promptView.findViewById(R.id.edittext13);
        final EditText editText14 = (EditText) promptView.findViewById(R.id.edittext14);
        final EditText editText15 = (EditText) promptView.findViewById(R.id.edittext15);
        final EditText editText16 = (EditText) promptView.findViewById(R.id.edittext16);

        final EditText editText17 = (EditText) promptView.findViewById(R.id.edittext17);
        final EditText editText18 = (EditText) promptView.findViewById(R.id.edittext18);
        final EditText editText19 = (EditText) promptView.findViewById(R.id.edittext19);
        final EditText editText20 = (EditText) promptView.findViewById(R.id.edittext20);
        // setup a dialog window
        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        Name.setText(editText.getText());
                        Gender.setText(editText2.getText());
                        DOB.setText(editText3.getText());
                        Email.setText(editText4.getText());
                        Mobile.setText(editText5.getText());
                        Blood.setText(editText6.getText());
                        Height.setText(editText7.getText());
                        Weight.setText(editText8.getText());
                        Heart.setText(editText9.getText());
                        BP1.setText(editText10.getText());
                        BP2.setText(editText11.getText());
                        BP3.setText(editText12.getText());
                        BG1.setText(editText13.getText());
                        BG2.setText(editText14.getText());
                       // BG3.setText(editText15.getText());
                        //LP1.setText(editText16.getText());
                        //LP2.setText(editText17.getText());
                        //LP3.setText(editText18.getText());
                        //LP4.setText(editText19.getText());
                        //Hba1c.setText(editText20.getText());


                        String n = editText.getText().toString();
                        String g = editText2.getText().toString();
                        String d = editText.getText().toString();
                        String e = editText2.getText().toString();
                        String m = editText.getText().toString();
                        String b = editText2.getText().toString();
                        String h = editText.getText().toString();
                        String w = editText2.getText().toString();
                        String he = editText.getText().toString();
                        String bp1 = editText2.getText().toString();
                        String bp2 = editText.getText().toString();
                        String bp3 = editText2.getText().toString();
                        String bg1 = editText.getText().toString();
                        String bg2 = editText2.getText().toString();
                        //String bg3 = editText.getText().toString();
                        //String lp1 = editText2.getText().toString();
                        //String lp2 = editText.getText().toString();
                        //String lp3 = editText2.getText().toString();
                        //String lp4 = editText.getText().toString();
                        //String hb = editText2.getText().toString();

                        editor.putString(name, n);
                        editor.putString(gender, g);
                        editor.putString(dob, d);
                        editor.putString(email, e);
                        editor.putString(mobile, m);
                        editor.putString(blood, b);
                        editor.putString(height, h);
                        editor.putString(weight, w);
                        editor.putString(heart, he);
                        editor.putString(b1, bp1);
                        editor.putString(b2, bp2);
                        editor.putString(b3, bp3);
                        editor.putString(b4, bg1);
                        editor.putString(b5, bg2);
                      //  editor.putString(b6, bg3);
                       // editor.putString(l1, lp1);
                        //editor.putString(l2, lp2);
                        //editor.putString(l3, lp3);
                        //editor.putString(l4, lp4);
                        //editor.putString(hba1c, hb);
                        editor.commit();

                    }
                })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        // create an alert dialog
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
