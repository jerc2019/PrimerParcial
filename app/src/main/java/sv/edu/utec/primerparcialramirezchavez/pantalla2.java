package sv.edu.utec.primerparcialramirezchavez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
    }

    /*
    public void ingre (View v){
        String Usuario, contraseña, resp;
        Usuario = etusuario.getText().toString();
        contraseña=etcontraseña.getText().toString();
        if(Usuario.equals("parcialETps1")&&(contraseña.equals("p4rC14l#tp$"))){
            Intent intento=new Intent(this,Pantalla2.class);
            startActivity(intento);
        }
        else {
            txresp.setText("incorrecto");
        }
    }
    */
}