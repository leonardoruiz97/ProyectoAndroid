package edu.cibertec.myapplication.presentation.Registrar.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import edu.cibertec.myapplication.R;
import edu.cibertec.myapplication.presentation.Login.view.LoginActivity;
import edu.cibertec.myapplication.presentation.Registrar.IRegistrarContract;
import edu.cibertec.myapplication.presentation.Usuario.view.UsuarioActivity;

public class RegistrarActivity extends AppCompatActivity implements IRegistrarContract.IView {
    private Button btCancelar;
    private Button btRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
     btCancelar = findViewById(R.id.btCancel);
     btRegistrar = findViewById(R.id.btRegistrar);

     btCancelar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             goToLogin();
         }

     });

     btRegistrar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             goToUsuario();
         }
     });

    }

    @Override
    public void showError(String errorMsg) {
        Toast.makeText(this,errorMsg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void hideProgressBar() {

    }

    @Override
    public void goToLogin() {
        Intent intent = new Intent(RegistrarActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void goToUsuario() {
        Intent intent = new Intent(RegistrarActivity.this, UsuarioActivity.class);
        startActivity(intent);
    }
}
