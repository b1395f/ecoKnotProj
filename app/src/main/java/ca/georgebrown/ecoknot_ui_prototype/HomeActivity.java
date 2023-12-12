package ca.georgebrown.ecoknot_ui_prototype;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private RelativeLayout sideMenu;

    private ActivityResultLauncher<Intent> cameraLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        sideMenu = findViewById(R.id.sideMenu);

        Button menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleMenu();
            }
        });

        Button menuOption1 = findViewById(R.id.menuOption1);
        Button menuOption2 = findViewById(R.id.menuOption2);

        menuOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleMenu();
            }
        });

        menuOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleMenu();
            }
        });

        Button searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        Button uploadButton = findViewById(R.id.uploadButton);

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AddRecipeActivity.class);
                startActivity(intent);
            }
        });

        Button pantryButton = findViewById(R.id.pantryButton);

        pantryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PantryActivity.class);
                startActivity(intent);
            }
        });

        Button profileButton = findViewById(R.id.profileButton);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }

    private void toggleMenu() {
        if (sideMenu.getVisibility() == View.VISIBLE) {
            sideMenu.setVisibility(View.GONE);
        } else {
            sideMenu.setVisibility(View.VISIBLE);
        }
    }

    public void onMenuItemClick(View view) {
        toggleMenu();
        if (view.getId() == R.id.menuOption1) {

        } else if (view.getId() == R.id.menuOption2) {

        }
    }
}