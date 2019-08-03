package edu.cibertec.myapplication.presentation.Usuario.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import edu.cibertec.myapplication.VendedoresFragment;
import edu.cibertec.myapplication.CarritoActivity;
import edu.cibertec.myapplication.ComprasFragment;
import edu.cibertec.myapplication.R;

public class UsuarioActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        Toolbar toolbar = findViewById(R.id.toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        // Personalizacion del contenido del NavigationView header

        ImageView ivAvatar = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.ivAvatar);
        ivAvatar.setImageResource(R.drawable.ic_cat);

        TextView tvNombreU = (TextView) navigationView.getHeaderView(0).findViewById(R.id.tvNombreU) ;
        TextView tvEmailU = (TextView) navigationView.getHeaderView(0).findViewById(R.id.tvEmailU) ;

        tvNombreU.setText("Micha");
        tvEmailU.setText("micha@gmail.com");
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.flContenedor,new VendedoresFragment())
                .commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_optionsl,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_carrito:
                startActivity(new Intent(this, CarritoActivity.class));
                return true;
             default:
                 return super.onOptionsItemSelected(item);

        }
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment f = null;

        if (id == R.id.nav_vendedor) {
            f = new VendedoresFragment();
        } else if (id == R.id.nav_carrito) {
             f = new ComprasFragment();
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_logout) {

        }

        if (f!=null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flContenedor,f)
                    .commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
