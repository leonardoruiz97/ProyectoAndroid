package edu.cibertec.myapplication.presentation.Login.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import edu.cibertec.myapplication.R;
import edu.cibertec.myapplication.presentation.Login.ILoginContract;
import edu.cibertec.myapplication.presentation.Usuario.view.UsuarioActivity;

public class LoginActivity extends AppCompatActivity implements ILoginContract.IView {


    private TextView tvAqui;
    private Button btSignl;
    private ProgressBar progressBarLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvAqui = findViewById(R.id.tvAqui);
        btSignl = findViewById(R.id.btSignl);
        progressBarLogin = findViewById(R.id.progressBarLogin);

        btSignl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToRegistrar();
            }
        });
    }

    @Override
    public void showError(String errorMsg) {
        Toast.makeText(this,errorMsg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgressBar() {progressBarLogin.setVisibility(View.VISIBLE); }

    @Override
    public void hideProgressBar() { progressBarLogin.setVisibility(View.GONE); }

    @Override
    public void goToRegistrar() {
        Intent intent = new Intent(LoginActivity.this, UsuarioActivity.class);
        startActivity(intent);

    }


    //if boton is press gotoRegistrar
}
