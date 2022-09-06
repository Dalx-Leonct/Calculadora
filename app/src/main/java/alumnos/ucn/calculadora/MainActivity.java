package alumnos.ucn.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button suma, resta, multiplicacion, division;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        suma = (Button) findViewById(R.id.sumar);
        resta = (Button) findViewById(R.id.restar);
        multiplicacion = (Button) findViewById(R.id.multiplicar);
        division = (Button) findViewById(R.id.dividir);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        division.setOnClickListener(this);

        resultado = (TextView) findViewById(R.id.resultado);
    }


    @Override
    public void onClick(View i) {

        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();

        double doble1 = Double.parseDouble(numero1);
        double doble2 = Double.parseDouble(numero2);

        double respuesta = 0;

        switch (i.getId()){
            case R.id.sumar:
                respuesta = doble1 + doble2;
                break;
            case R.id.restar:
                respuesta = doble1 - doble2;
                break;
            case R.id.multiplicar:
                respuesta = doble1*doble2;
                break;
            case R.id.dividir:
                respuesta = doble1/doble2;
                break;
        }

        resultado.setText(""+respuesta);

    }
}