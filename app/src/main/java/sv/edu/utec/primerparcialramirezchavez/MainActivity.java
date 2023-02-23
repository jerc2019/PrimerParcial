package sv.edu.utec.primerparcialramirezchavez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    EditText edtusuario,etcontraseña;

    TextView txtrespi;
    Button btningresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtusuario=findViewById(R.id.edtuser);
        etcontraseña=findViewById(R.id.edtcontra);
        txtrespi=findViewById(R.id.txtresp);

        public void ingre(View view){
            String Usuario, contraseña, resp;

            Usuario = edtusuario.getText().toString();
            contraseña=etcontraseña.getText().toString();

            if(Usuario.equals("parcialETps1")&&(contraseña.equals("p4rC14l#tp$"))){
                txtrespi.setText("conrrecto");
        }
            else{
                txtrespi.setText("incorrecto");
            }
        }
    }
}