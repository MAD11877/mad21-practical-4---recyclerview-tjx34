package sg.edu.np.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.AlertDialog;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<User> userList = new ArrayList<User>();

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();
        User user7 = new User();
        User user8 = new User();
        User user9 = new User();
        User user10 = new User();
        User user11 = new User();
        User user12 = new User();
        User user13 = new User();
        User user14 = new User();
        User user15 = new User();
        User user16 = new User();
        User user17 = new User();
        User user18 = new User();
        User user19 = new User();
        User user20 = new User();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);
        userList.add(user11);
        userList.add(user12);
        userList.add(user13);
        userList.add(user14);
        userList.add(user15);
        userList.add(user16);
        userList.add(user17);
        userList.add(user18);
        userList.add(user19);
        userList.add(user20);

        for (int i = 0; i < userList.size(); i++) {
            User user = new User();
            userList.add(user);
            Random r = new Random();
            int nameID = r.nextInt(999999999);
            String name = String.valueOf(nameID);
            userList.get(i).setName("MAD " + name);
            int description_no = r.nextInt(999999999);
            String description = String.valueOf(description_no);
            userList.get(i).setDescription("Description " + description);
            int followed_no = r.nextInt(2);
            if (followed_no == 0) {
                userList.get(i).setFollowed(true);
            }
            else {
                userList.get(i).setFollowed(false);
            }
            userList.get(i).setId(i);
        }

        builder = new AlertDialog.Builder(this);
        final ImageView profileImageView = findViewById(R.id.imageView);
        profileImageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("MADness")
                        .setCancelable(false)
                        .setPositiveButton("View", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Random r = new Random();
                                int random_no = r.nextInt(999999999);
                                String random = String.valueOf(random_no);
                                Intent intent = new Intent(ListActivity.this,
                                        MainActivity.class);
                                intent.putExtra("RANDOM_INT", random);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("Profile");
                alert.show();
            }
        });
    }
}