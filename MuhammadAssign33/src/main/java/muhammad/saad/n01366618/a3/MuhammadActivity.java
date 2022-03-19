package muhammad.saad.n01366618.a3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
//Name: Muhammad Saad
//Student#: N01366618
//Course: CENG258
//Section: RNA

public class MuhammadActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    InputFragment inputFragment = new InputFragment();
    DrawFragment drawFragment = new DrawFragment();
    SecuitiyFragment secuitiyFragment = new SecuitiyFragment();
    RotateFragment rotateFragment = new RotateFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.muhammadbottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.muhammadInput:
                    getSupportFragmentManager().beginTransaction().replace(R.id.muhammadflFragment, inputFragment).commit();
                    return true;

                case R.id.muhammadDraw:
                    getSupportFragmentManager().beginTransaction().replace(R.id.muhammadflFragment, drawFragment).commit();
                    return true;

                case R.id.muhammadSecuirty:
                    getSupportFragmentManager().beginTransaction().replace(R.id.muhammadflFragment, secuitiyFragment).commit();
                    return true;

                case R.id.muhammadRotate:
                    getSupportFragmentManager().beginTransaction().replace(R.id.muhammadflFragment, rotateFragment).commit();
                    return true;
            }
            return false;
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder((this)).setMessage("Muhammad Saad, N01366618 Do you want to exit the app?")
                .setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        }).setNegativeButton("No",null)
                .show();
    }
}


