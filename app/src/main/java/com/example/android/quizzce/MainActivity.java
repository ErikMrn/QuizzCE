package com.example.android.quizzce;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.android.quizzce.R.id.r10a;
import static com.example.android.quizzce.R.id.r10b;
import static com.example.android.quizzce.R.id.r10c;
import static com.example.android.quizzce.R.id.r1a;
import static com.example.android.quizzce.R.id.r1b;
import static com.example.android.quizzce.R.id.r1c;
import static com.example.android.quizzce.R.id.r2a;
import static com.example.android.quizzce.R.id.r2b;
import static com.example.android.quizzce.R.id.r2c;
import static com.example.android.quizzce.R.id.r3a;
import static com.example.android.quizzce.R.id.r3b;
import static com.example.android.quizzce.R.id.r3c;
import static com.example.android.quizzce.R.id.r4a;
import static com.example.android.quizzce.R.id.r4b;
import static com.example.android.quizzce.R.id.r4c;
import static com.example.android.quizzce.R.id.r5a;
import static com.example.android.quizzce.R.id.r5b;
import static com.example.android.quizzce.R.id.r5c;
import static com.example.android.quizzce.R.id.r6a;
import static com.example.android.quizzce.R.id.r6b;
import static com.example.android.quizzce.R.id.r6c;
import static com.example.android.quizzce.R.id.r7a;
import static com.example.android.quizzce.R.id.r7b;
import static com.example.android.quizzce.R.id.r7c;
import static com.example.android.quizzce.R.id.r8a;
import static com.example.android.quizzce.R.id.r8b;
import static com.example.android.quizzce.R.id.r8c;
import static com.example.android.quizzce.R.id.r9a;
import static com.example.android.quizzce.R.id.r9b;
import static com.example.android.quizzce.R.id.r9c;

public class MainActivity extends AppCompatActivity {


    private double puntos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        puntos = 0;

        final RadioGroup RGP1 = (RadioGroup)findViewById(R.id.pregunta1);
        final RadioGroup RGP2 = (RadioGroup)findViewById(R.id.pregunta2);
        final RadioGroup RGP3 = (RadioGroup)findViewById(R.id.pregunta3);
        final RadioGroup RGP4 = (RadioGroup)findViewById(R.id.pregunta4);
        final RadioGroup RGP5 = (RadioGroup)findViewById(R.id.pregunta5);
        final RadioGroup RGP6 = (RadioGroup)findViewById(R.id.pregunta6);
        final RadioGroup RGP7 = (RadioGroup)findViewById(R.id.pregunta7);
        final RadioGroup RGP8 = (RadioGroup)findViewById(R.id.pregunta8);
        final RadioGroup RGP9 = (RadioGroup)findViewById(R.id.pregunta9);
        final RadioGroup RGP10 = (RadioGroup)findViewById(R.id.pregunta10);
        EditText ET11 = (EditText) findViewById(R.id.texto11);
        TextView TP1 = (TextView) findViewById(R.id.pregunta11);


        int respuesta1 = RGP1.getCheckedRadioButtonId();
        int respuesta2 = RGP2.getCheckedRadioButtonId();
        int respuesta3 = RGP3.getCheckedRadioButtonId();
        int respuesta4 = RGP4.getCheckedRadioButtonId();
        int respuesta5 = RGP5.getCheckedRadioButtonId();
        int respuesta6 = RGP6.getCheckedRadioButtonId();
        int respuesta7 = RGP7.getCheckedRadioButtonId();
        int respuesta8 = RGP8.getCheckedRadioButtonId();
        int respuesta9 = RGP9.getCheckedRadioButtonId();
        int respuesta10 = RGP10.getCheckedRadioButtonId();
        String respuesta11 = ET11.getText().toString();
        final CheckBox CBp12a = (CheckBox)findViewById(R.id.r12a);
        final CheckBox CBp12b = (CheckBox)findViewById(R.id.r12b);
        final CheckBox CBp12c = (CheckBox)findViewById(R.id.r12c);
        final CheckBox CBp12d = (CheckBox)findViewById(R.id.r12d);

        TextView priceTextView = (TextView) findViewById(R.id.marcador);

        RadioButton rb1A, rb1B, rb1C, rb2A, rb2B, rb2C, rb3A, rb3B, rb3C, rb4A, rb4B, rb4C, rb5A, rb5B, rb5C, rb6A, rb6B, rb6C, rb7A, rb7B, rb7C, rb8A, rb8B, rb8C,rb9A, rb9B, rb9C, rb10A, rb10B, rb10C;



        rb1A = (RadioButton) findViewById(r1a);
        rb1B = (RadioButton) findViewById(r1b);
        rb1C = (RadioButton) findViewById(r1c);

        rb2A = (RadioButton) findViewById(r2a);
        rb2B = (RadioButton) findViewById(r2b);
        rb2C = (RadioButton) findViewById(r2c);

        rb3A = (RadioButton) findViewById(r3a);
        rb3B = (RadioButton) findViewById(r3b);
        rb3C = (RadioButton) findViewById(r3c);

        rb4A = (RadioButton) findViewById(r4a);
        rb4B = (RadioButton) findViewById(r4b);
        rb4C = (RadioButton) findViewById(r4c);

        rb5A = (RadioButton) findViewById(r5a);
        rb5B = (RadioButton) findViewById(r5b);
        rb5C = (RadioButton) findViewById(r5c);

        rb6A = (RadioButton) findViewById(r6a);
        rb6B = (RadioButton) findViewById(r6b);
        rb6C = (RadioButton) findViewById(r6c);

        rb7A = (RadioButton) findViewById(r7a);
        rb7B = (RadioButton) findViewById(r7b);
        rb7C = (RadioButton) findViewById(r7c);

        rb8A = (RadioButton) findViewById(r8a);
        rb8B = (RadioButton) findViewById(r8b);
        rb8C = (RadioButton) findViewById(r8c);

        rb9A = (RadioButton) findViewById(r9a);
        rb9B = (RadioButton) findViewById(r9b);
        rb9C = (RadioButton) findViewById(r9c);

        rb10A = (RadioButton) findViewById(r10a);
        rb10B = (RadioButton) findViewById(r10b);
        rb10C = (RadioButton) findViewById(r10c);


        /* Pregunta 1 */

        if (respuesta1 == r1a){

            puntos = puntos - 0.5;

            rb1A.setBackgroundColor(Color.parseColor("#f44336"));

            rb1B.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta1 == r1b){

            puntos = puntos + 1;

            rb1B.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta1 == r1c) {

            puntos = puntos - 0.5;

            rb1C.setBackgroundColor(Color.parseColor("#f44336"));

            rb1B.setBackgroundColor(Color.parseColor("#4caf50"));


        }

        /* Pregunta 2 */

        if (respuesta2 == r2a){

            puntos = puntos - 0.5;

            rb2A.setBackgroundColor(Color.parseColor("#f44336"));

            rb2C.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta2 == r2b){

            puntos = puntos - 0.5;

            rb2B.setBackgroundColor(Color.parseColor("#f44336"));

            rb2C.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta2 == r2c) {

            puntos = puntos + 1;

            rb2C.setBackgroundColor(Color.parseColor("#4caf50"));



        }

        /* Pregunta 3 */

        if (respuesta3 == r3a){

            puntos = puntos + 1;

            rb3A.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta3 == r3b){

            puntos = puntos - 0.5;

            rb3B.setBackgroundColor(Color.parseColor("#f44336"));

            rb3A.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta2 == r2c) {

            rb3C.setBackgroundColor(Color.parseColor("#f44336"));

            rb3A.setBackgroundColor(Color.parseColor("#4caf50"));



        }

        /* Pregunta 4 */

        if (respuesta4 == r4a){

            puntos = puntos - 0.5;

            rb4A.setBackgroundColor(Color.parseColor("#f44336"));

            rb4C.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta4 == r4b){

            puntos = puntos - 0.5;

            rb4B.setBackgroundColor(Color.parseColor("#f44336"));

            rb4C.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta4 == r4c) {

            puntos = puntos + 1;

            rb4C.setBackgroundColor(Color.parseColor("#4caf50"));



        }

        /* Pregunta 5 */

        if (respuesta5 == r5a){

            puntos = puntos - 0.5;

            rb5A.setBackgroundColor(Color.parseColor("#f44336"));

            rb5B.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta5 == r5b){

            puntos = puntos + 1;

            rb5B.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta5 == r5c) {

            puntos = puntos - 0.5;

            rb5C.setBackgroundColor(Color.parseColor("#f44336"));

            rb5B.setBackgroundColor(Color.parseColor("#4caf50"));


        }

        /* Pregunta 6 */

        if (respuesta6 == r6a){

            puntos = puntos - 0.5;

            rb6A.setBackgroundColor(Color.parseColor("#f44336"));

            rb6C.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta6 == r6b){

            puntos = puntos - 0.5;

            rb6B.setBackgroundColor(Color.parseColor("#f44336"));

            rb6C.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta6 == r6c) {

            puntos = puntos + 1;

            rb6C.setBackgroundColor(Color.parseColor("#4caf50"));



        }

        /* Pregunta 7*/

        if (respuesta7 == r7a){

            puntos = puntos + 1;

            rb7A.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta7 == r7b){

            puntos = puntos - 0.5;

            rb7B.setBackgroundColor(Color.parseColor("#f44336"));

            rb7A.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta7 == r7c) {

            rb7C.setBackgroundColor(Color.parseColor("#f44336"));

            rb7A.setBackgroundColor(Color.parseColor("#4caf50"));



        }




         /* Pregunta 8 */

        if (respuesta8 == r8a){

            puntos = puntos - 0.5;

            rb8A.setBackgroundColor(Color.parseColor("#f44336"));

            rb8C.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta8 == r8b){

            puntos = puntos - 0.5;

            rb8B.setBackgroundColor(Color.parseColor("#f44336"));

            rb8C.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta8 == r8c) {

            puntos = puntos + 1;

            rb8C.setBackgroundColor(Color.parseColor("#4caf50"));



        }

        /* Pregunta 9 */

        if (respuesta9 == r9a){

            puntos = puntos + 1;

            rb9A.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta9 == r9b){

            puntos = puntos - 0.5;

            rb9B.setBackgroundColor(Color.parseColor("#f44336"));

            rb9A.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta9 == r9c) {

            rb9C.setBackgroundColor(Color.parseColor("#f44336"));

            rb9A.setBackgroundColor(Color.parseColor("#4caf50"));



        }


         /* Pregunta 10 */

        if (respuesta10 == r10a){

            puntos = puntos - 0.5;

            rb10A.setBackgroundColor(Color.parseColor("#f44336"));

            rb10C.setBackgroundColor(Color.parseColor("#4caf50"));


        } else if (respuesta10 == r10b){

            puntos = puntos - 0.5;

            rb10B.setBackgroundColor(Color.parseColor("#f44336"));

            rb10C.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta10 == r10c) {

            puntos = puntos + 1;

            rb10C.setBackgroundColor(Color.parseColor("#4caf50"));



        }

        /* Pregunta 11*/

        if (respuesta11.equals("169")) {

            puntos = puntos + 1;
            ET11.setBackgroundColor(Color.parseColor("#4caf50"));

        } else if (respuesta11.equals("")) {

        }else {
            puntos = puntos - 0.5;
            ET11.setBackgroundColor(Color.parseColor("#f44336"));

        }

        /* Pregunta 12*/

        if(CBp12a.isChecked()){

            puntos = puntos - 0.25;
            CBp12a.setBackgroundColor(Color.parseColor("#f44336"));

        }


        if (CBp12b.isChecked()){

            puntos = puntos + 0.5;
            CBp12b.setBackgroundColor(Color.parseColor("#4caf50"));


        }

        if(CBp12c.isChecked()){

            puntos = puntos - 0.25;
            CBp12c.setBackgroundColor(Color.parseColor("#f44336"));

        }

        if (CBp12d.isChecked()){

            puntos = puntos + 0.5;
            CBp12d.setBackgroundColor(Color.parseColor("#4caf50"));


        }


        priceTextView.setText("Has sacado " + puntos + " puntos.");

        if (puntos >= 9) {

            Toast aprobado = Toast.makeText(this, "Has aprobado", Toast.LENGTH_LONG);
            aprobado.show();

        } else {

            Toast suspendido = Toast.makeText(this, "Has suspendido", Toast.LENGTH_LONG);
            suspendido.show();

        }




    }

    public void resetear (View view) {

        TextView priceTextView = (TextView) findViewById(R.id.marcador);

        RadioButton rb1A, rb1B, rb1C, rb2A, rb2B, rb2C, rb3A, rb3B, rb3C, rb4A, rb4B, rb4C, rb5A, rb5B, rb5C, rb6A, rb6B, rb6C, rb7A, rb7B, rb7C, rb8A, rb8B, rb8C,rb9A, rb9B, rb9C, rb10A, rb10B, rb10C;



        rb1A = (RadioButton) findViewById(r1a);
        rb1B = (RadioButton) findViewById(R.id.r1b);
        rb1C = (RadioButton) findViewById(R.id.r1c);

        rb2A = (RadioButton) findViewById(R.id.r2a);
        rb2B = (RadioButton) findViewById(R.id.r2b);
        rb2C = (RadioButton) findViewById(R.id.r2c);

        rb3A = (RadioButton) findViewById(r3a);
        rb3B = (RadioButton) findViewById(r3b);
        rb3C = (RadioButton) findViewById(r3c);

        rb4A = (RadioButton) findViewById(r4a);
        rb4B = (RadioButton) findViewById(r4b);
        rb4C = (RadioButton) findViewById(r4c);

        rb5A = (RadioButton) findViewById(r5a);
        rb5B = (RadioButton) findViewById(r5b);
        rb5C = (RadioButton) findViewById(r5c);

        rb6A = (RadioButton) findViewById(r6a);
        rb6B = (RadioButton) findViewById(r6b);
        rb6C = (RadioButton) findViewById(r6c);

        rb7A = (RadioButton) findViewById(r7a);
        rb7B = (RadioButton) findViewById(r7b);
        rb7C = (RadioButton) findViewById(r7c);

        rb8A = (RadioButton) findViewById(r8a);
        rb8B = (RadioButton) findViewById(r8b);
        rb8C = (RadioButton) findViewById(r8c);

        rb9A = (RadioButton) findViewById(r9a);
        rb9B = (RadioButton) findViewById(r9b);
        rb9C = (RadioButton) findViewById(r9c);

        rb10A = (RadioButton) findViewById(r10a);
        rb10B = (RadioButton) findViewById(r10b);
        rb10C = (RadioButton) findViewById(r10c);

        EditText ET11 = (EditText) findViewById(R.id.texto11);
        TextView TP1 = (TextView) findViewById(R.id.pregunta11);

        final CheckBox CBp12a = (CheckBox)findViewById(R.id.r12a);
        final CheckBox CBp12b = (CheckBox)findViewById(R.id.r12b);
        final CheckBox CBp12c = (CheckBox)findViewById(R.id.r12c);
        final CheckBox CBp12d = (CheckBox)findViewById(R.id.r12d);


        rb1A.setBackgroundColor(Color.TRANSPARENT);

        rb1B.setBackgroundColor(Color.TRANSPARENT);

        rb1C.setBackgroundColor(Color.TRANSPARENT);

        rb2A.setBackgroundColor(Color.TRANSPARENT);

        rb2B.setBackgroundColor(Color.TRANSPARENT);

        rb2C.setBackgroundColor(Color.TRANSPARENT);

        rb3A.setBackgroundColor(Color.TRANSPARENT);

        rb3B.setBackgroundColor(Color.TRANSPARENT);

        rb3C.setBackgroundColor(Color.TRANSPARENT);

        rb4A.setBackgroundColor(Color.TRANSPARENT);

        rb4B.setBackgroundColor(Color.TRANSPARENT);

        rb4C.setBackgroundColor(Color.TRANSPARENT);

        rb5A.setBackgroundColor(Color.TRANSPARENT);

        rb5B.setBackgroundColor(Color.TRANSPARENT);

        rb5C.setBackgroundColor(Color.TRANSPARENT);

        rb6A.setBackgroundColor(Color.TRANSPARENT);

        rb6B.setBackgroundColor(Color.TRANSPARENT);

        rb6C.setBackgroundColor(Color.TRANSPARENT);

        rb7A.setBackgroundColor(Color.TRANSPARENT);

        rb7B.setBackgroundColor(Color.TRANSPARENT);

        rb7C.setBackgroundColor(Color.TRANSPARENT);

        rb8A.setBackgroundColor(Color.TRANSPARENT);

        rb8B.setBackgroundColor(Color.TRANSPARENT);

        rb8C.setBackgroundColor(Color.TRANSPARENT);

        rb9A.setBackgroundColor(Color.TRANSPARENT);

        rb9B.setBackgroundColor(Color.TRANSPARENT);

        rb9C.setBackgroundColor(Color.TRANSPARENT);

        rb10A.setBackgroundColor(Color.TRANSPARENT);

        rb10B.setBackgroundColor(Color.TRANSPARENT);

        rb10C.setBackgroundColor(Color.TRANSPARENT);

        ET11.setBackgroundColor(Color.TRANSPARENT);

        CBp12a.setBackgroundColor(Color.TRANSPARENT);

        CBp12b.setBackgroundColor(Color.TRANSPARENT);

        CBp12c.setBackgroundColor(Color.TRANSPARENT);

        CBp12d.setBackgroundColor(Color.TRANSPARENT);
        final RadioGroup RGP1 = (RadioGroup)findViewById(R.id.pregunta1);

        RGP1.clearCheck();

        final RadioGroup RGP2 = (RadioGroup)findViewById(R.id.pregunta2);

        RGP2.clearCheck();

        final RadioGroup RGP3 = (RadioGroup)findViewById(R.id.pregunta3);

        RGP3.clearCheck();

        final RadioGroup RGP4 = (RadioGroup)findViewById(R.id.pregunta4);

        RGP4.clearCheck();

        final RadioGroup RGP5 = (RadioGroup)findViewById(R.id.pregunta5);

        RGP5.clearCheck();

        final RadioGroup RGP6 = (RadioGroup)findViewById(R.id.pregunta6);

        RGP6.clearCheck();

        final RadioGroup RGP7 = (RadioGroup)findViewById(R.id.pregunta7);

        RGP7.clearCheck();

        final RadioGroup RGP8 = (RadioGroup)findViewById(R.id.pregunta8);

        RGP8.clearCheck();

        final RadioGroup RGP9 = (RadioGroup)findViewById(R.id.pregunta9);

        RGP9.clearCheck();

        final RadioGroup RGP10 = (RadioGroup)findViewById(R.id.pregunta10);

        RGP10.clearCheck();

        ET11.setText("");

        CBp12a.setChecked(false);
        CBp12b.setChecked(false);
        CBp12c.setChecked(false);
        CBp12d.setChecked(false);

        priceTextView.setText("Marcador:");



    }


}
