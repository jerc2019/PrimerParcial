package sv.edu.utec.primerparcialramirezchavez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtusuario,etcontraseña;

    TextView txtresp;
    Button btningresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtusuario=findViewById(R.id.edtuser);
        etcontraseña=findViewById(R.id.edtcontra);
        txtresp=findViewById(R.id.txtresp);

        public void ingre (View v){
            String Usuario, contraseña, resp;

            Usuario = etUsuario.getText().ToString();
            contraseña=etcontraseña.getText().toString();

            if(Usuario.equals("parcialETps1")&&(contraseña.equals("p4rC14l#tp$"))){
                txtresp.setText("conrrecto");

        }
            else{
                txtresp.setText("incorrecto");
            }
        }
    }
}