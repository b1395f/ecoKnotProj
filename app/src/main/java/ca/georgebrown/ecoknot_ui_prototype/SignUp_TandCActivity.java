package ca.georgebrown.ecoknot_ui_prototype;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp_TandCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_tandc);

        TextView termsConditionsView = findViewById(R.id.termsConditions);
        String termsConditionsText = "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit. Quisque mattis, mauris nec vehicula dapibus, " +
                "neque dui convallis mi, ac feugiat purus mauris sed lectus. " +
                "Praesent eleifend commodo odio. Aenean in dictum libero. " +
                "Donec nec dignissim erat. Vestibulum id est a neque dictum vulputate. " +
                "Pellentesque vel dapibus lacus. Praesent ullamcorper pretium massa a tincidunt. " +
                "Mauris dolor magna, rutrum ut quam eu, consectetur rhoncus tellus.\n" +
                "\n" +
                "Aenean eu efficitur massa. Pellentesque eget lorem placerat ex pretium ornare. " +
                "Nam vulputate eros ac rutrum dignissim. Donec nulla leo, lobortis vitae ligula " +
                "non, consequat lobortis risus. Etiam mollis luctus purus, ac tincidunt magna " +
                "mattis quis. Aliquam cursus arcu quis ante rutrum, fermentum laoreet nunc " +
                "dignissim. Vivamus et leo bibendum, commodo massa eu, dignissim nisi." +
                "\n" +
                "In venenatis, ligula ut accumsan suscipit, metus lacus eleifend tellus, id " +
                "volutpat ligula velit ut justo. Donec pulvinar scelerisque dolor, nec ultrices " +
                "eros mollis et. Suspendisse ullamcorper sem in ipsum ultricies vehicula. " +
                "Suspendisse auctor lacus id risus iaculis cursus. Ut nulla nulla, volutpat " +
                "imperdiet neque eu, viverra tempus felis. Nunc euismod sapien felis, at interdum " +
                "ligula feugiat et. Vivamus nec diam purus." +
                "\n" +
                "Suspendisse posuere diam sapien, a eleifend lacus gravida in. Nam aliquam " +
                "tristique nunc ut porta. Duis id pharetra turpis. Nulla a turpis mi. In " +
                "hac habitasse platea dictumst. Etiam mattis sapien sed tincidunt dapibus. " +
                "Mauris neque nisl, elementum sed volutpat vitae, porta eu neque. In tristique " +
                "luctus ante, a volutpat mi dapibus at. Nunc scelerisque sit amet erat at " +
                "pulvinar. Praesent ultrices ipsum quis dui consectetur interdum ac quis ante. " +
                "Cras imperdiet non nibh nec malesuada." +
                "\n" +
                "Integer id neque vel augue vehicula dapibus. Curabitur imperdiet quam eget " +
                "justo tempus dapibus. Quisque augue urna, dapibus quis leo sed, sodales luctus " +
                "nisl. Morbi pulvinar, tortor id sodales laoreet, nunc nibh sodales massa, quis " +
                "accumsan felis eros et purus. Phasellus ac neque lorem. Cras et tortor ipsum. " +
                "Nulla interdum ullamcorper purus, ac ullamcorper nisi volutpat in. " +
                "Nulla faucibus odio faucibus purus tincidunt, in volutpat lacus congue. " +
                "Vestibulum pretium ut sem quis vulputate. Cras eu pretium dui. Nam maximus " +
                "in sem non feugiat. Curabitur faucibus, risus id facilisis feugiat, tellus " +
                "ipsum gravida ex, ac auctor erat turpis quis urna. Vivamus neque turpis, " +
                "imperdiet sed dignissim vel, mattis quis sem.";
        termsConditionsView.setText(termsConditionsText);

        termsConditionsView.setMovementMethod(new ScrollingMovementMethod());

        Button createAcctButton = findViewById(R.id.createAcctButton);

        createAcctButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_TandCActivity.this,
                        HomeActivity.class);

                startActivity(intent);
            }
        });

    }



}
