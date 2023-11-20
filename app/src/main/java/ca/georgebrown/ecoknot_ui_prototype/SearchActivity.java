package ca.georgebrown.ecoknot_ui_prototype;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    private RelativeLayout sideMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        EditText searchBar = findViewById(R.id.searchBar);

        searchBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchBar.setInputType(InputType.TYPE_CLASS_TEXT);
                searchBar.requestFocus();
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

            Button uploadButton = findViewById(R.id.uploadButton);

            uploadButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SearchActivity.this, AddRecipeActivity.class);
                    startActivity(intent);
                }
            });

            Button homeButton = findViewById(R.id.homeButton);

            homeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SearchActivity.this, HomeActivity.class);
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

}
