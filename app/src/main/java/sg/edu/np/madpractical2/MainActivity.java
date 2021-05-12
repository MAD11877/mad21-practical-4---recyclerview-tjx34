package sg.edu.np.madpractical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nameId = getIntent().getStringExtra("RANDOM_INT");
        User myObj = new User();
        myObj.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        myObj.setFollowed(false);
        myObj.setId(1);
        myObj.setName("MAD " + nameId);

        final TextView nameTextView = (TextView) findViewById(R.id.textView);
        nameTextView.setText(myObj.getName());
        final TextView descriptionTextView = (TextView) findViewById(R.id.textView2);
        descriptionTextView.setText(myObj.getDescription());
        final Button followButton = findViewById(R.id.button4);
        if (myObj.getFollowed() == true) {
            followButton.setText(R.string.unfollow_button);
        }
        followButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (followButton.getText().equals("Follow")) {
                    followButton.setText(R.string.unfollow_button);
                    myObj.setFollowed(true);
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                } else {
                    followButton.setText(R.string.follow_button);
                    myObj.setFollowed(false);
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}