package ca.georgebrown.ecoknot_ui_prototype;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class ForgotPasswordActivity extends AppCompatActivity {

    private TextView messageTextView;
    private EditText emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);

        messageTextView = findViewById(R.id.emailSent);
        emailEditText = findViewById(R.id.firstNameEditText);
        Button sendEmailButton = findViewById(R.id.sendEmail);

        sendEmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userEmail = emailEditText.getText().toString();

                if (userEmail.isEmpty()) {

                    messageTextView.setText("Please enter your email. \nEmail box cannot be empty");
                    messageTextView.setTextColor(Color.RED);
                } else {
                    // Perform the action you need, e.g., send reset email
                    String message = "We've sent a reset email to " + userEmail;
                    messageTextView.setText(message);
                    messageTextView.setTextColor(Color.GREEN);
                }
            }
        });

    }


}
