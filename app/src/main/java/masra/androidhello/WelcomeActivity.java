package masra.androidhello;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        TextView welcomeTextView =
                (TextView) findViewById(R.id.welcome_text_view);

        String user = getIntent().getStringExtra("user");
        welcomeTextView.setText(String.format("Hello, %s!", user));
    }
}
