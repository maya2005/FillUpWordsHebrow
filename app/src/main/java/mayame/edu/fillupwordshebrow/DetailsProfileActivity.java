package mayame.edu.fillupwordshebrow;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import mayame.edu.fillupwordshebrow.models.UserProfile;


public class DetailsProfileActivity extends AppCompatActivity {

    EditText etName;
    TextView tvName, tvAge;
    ImageView ivImageProfile1, ivImageProfile2, ivImageProfile3, ivImageProfile4;
    RelativeLayout layoutImage1, layoutImage2, layoutImage3, layoutImage4;
    CardView cwProfileImage1, cwProfileImage2, cwProfileImage3, cwProfileImage4;



    String userName, userGender, age, profileImage;
    ArrayList <UserProfile> users = new ArrayList<>();

    private MediaPlayer funnyPlayer;
    private Spinner spAge;
    UserProfile u ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details);
        Intent genderIntent = getIntent();
        String gender = genderIntent.getStringExtra("gender");
        initFindViewByID();
        initSpinner();

        if (gender!=null &&gender.equals("boy")) {
            setBoyData();
            userGender = "boy";
        } else{
            setGirlData();
            userGender = "Girl";
        }



    }

    public void saveUser (View view){

        userName = etName.getText().toString();
        age = (String) spAge.getSelectedItem();

        u= new UserProfile(userName, age,userGender,profileImage);
        users.add(u);
    }


    private void initSpinner() {

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.age, R.layout.item);//  android.R.layout.simple_spinner_item
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource( R.layout.checked_item);
        // Apply the adapter to the spinner
        spAge.setAdapter(adapter);


    }

    private void setGirlData() {
        tvName.setText("אֵיךְ קוֹרְאִים לֵךְ?");
        tvAge.setText("בַּת כַּמָּה אֶת?");
        ivImageProfile1.setImageResource(R.drawable.girl_avatar_1);
        ivImageProfile2.setImageResource(R.drawable.girl_avatar_2);
        ivImageProfile3.setImageResource(R.drawable.girl_avatar_3);
        ivImageProfile4.setImageResource(R.drawable.girl_avatar_4);

    }


    private void setBoyData() {
        tvName.setText("אֵיךְ קוֹרְאִים לְךָ?");
        tvAge.setText("בֶּן כַּמָּה אַתָּה?");
        ivImageProfile1.setImageResource(R.drawable.boy_avatar_1);
        ivImageProfile2.setImageResource(R.drawable.boy_avatar_2);
        ivImageProfile3.setImageResource(R.drawable.boy_avatar_3);
        ivImageProfile4.setImageResource(R.drawable.boy_avatar_4);

    }


    private void initFindViewByID() {

        spAge = (Spinner) findViewById(R.id.spAge);
        etName = (EditText) findViewById(R.id.etName);

        tvAge = (TextView) findViewById(R.id.tvAge);
        tvName = (TextView) findViewById(R.id.tvName);

        ivImageProfile1 = (ImageView) findViewById(R.id.ivImageProfile1);
        ivImageProfile2 = (ImageView) findViewById(R.id.ivImageProfile2);
        ivImageProfile3 = (ImageView) findViewById(R.id.ivImageProfile3);
        ivImageProfile4 = (ImageView) findViewById(R.id.ivImageProfile4);

        layoutImage1 = (RelativeLayout) findViewById(R.id.layotImage1);
        layoutImage2 = (RelativeLayout) findViewById(R.id.layotImage2);
        layoutImage3 = (RelativeLayout) findViewById(R.id.layotImage3);
        layoutImage4 = (RelativeLayout) findViewById(R.id.layotImage4);

        cwProfileImage1 = (CardView) findViewById(R.id.cwProfileImage1);
        cwProfileImage2 = (CardView) findViewById(R.id.cwProfileImage2);
        cwProfileImage3 = (CardView) findViewById(R.id.cwProfileImage3);
        cwProfileImage4 = (CardView) findViewById(R.id.cwProfileImage4);

        funnyPlayer = MediaPlayer.create(this, R.raw.funny);

    }




    public void ivProfile1(View view) {
        profileImage = "image1";
        Toast.makeText(DetailsProfileActivity.this,profileImage, Toast.LENGTH_SHORT).show();
        layoutImage1.setBackgroundColor(0xff00ff00);
        funnyPlayer.start();
        cwProfileImage1.animate().scaleX(1.1f).setDuration(500).scaleY(1.1f).rotationBy(20).withEndAction(new Runnable() {
            @Override
            public void run() {
                cwProfileImage1.animate().scaleX(1.f).scaleY(1.f).rotationBy(-20).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        funnyPlayer.stop();
                        funnyPlayer.reset();
                        funnyPlayer = MediaPlayer.create(DetailsProfileActivity.this, R.raw.funny);
                    }
                });
            }
        }).start();
    }

    public void ivProfile2(View view) {
        profileImage = "image2";
        layoutImage2.setBackgroundColor(0xff00ff00);
        funnyPlayer.start();
        cwProfileImage2.animate().scaleX(1.1f).setDuration(500).scaleY(1.1f).rotationBy(-20).withEndAction(new Runnable() {
            @Override
            public void run() {
                cwProfileImage2.animate().scaleX(1.f).scaleY(1.f).rotationBy(20).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        funnyPlayer.stop();
                        funnyPlayer = MediaPlayer.create(DetailsProfileActivity.this, R.raw.funny);
                    }
                });
            }
        }).start();
    }


    public void ivProfile(View view, String image, RelativeLayout layoutImage, final CardView cwProfileImage) {
        profileImage = image;
        layoutImage.setBackgroundColor(0xff00ff00);
        funnyPlayer.start();
        cwProfileImage.animate().scaleX(1.1f).setDuration(500).scaleY(1.1f).rotationBy(-20).withEndAction(new Runnable() {
            @Override
            public void run() {
                cwProfileImage.animate().scaleX(1.f).scaleY(1.f).rotationBy(20).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        funnyPlayer.stop();
                        funnyPlayer = MediaPlayer.create(DetailsProfileActivity.this, R.raw.funny);
                    }
                });
            }
        }).start();
    }

    public void ivProfile3(View view) {
        profileImage ="image3";
        layoutImage3.setBackgroundColor(0xff00ff00);
        funnyPlayer.start();
        cwProfileImage3.animate().scaleX(1.1f).setDuration(500).scaleY(1.1f).rotationBy(20).withEndAction(new Runnable() {
            @Override
            public void run() {
                cwProfileImage3.animate().scaleX(1.f).scaleY(1.f).rotationBy(-20).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        funnyPlayer.stop();
                        funnyPlayer = MediaPlayer.create(DetailsProfileActivity.this, R.raw.funny);
                    }
                });
            }
        }).start();
    }

    public void ivProfile4(View view) {
        profileImage = "image4";
        layoutImage4.setBackgroundColor(0xff00ff00);
        funnyPlayer.start();
        cwProfileImage4.animate().scaleX(1.1f).setDuration(500).scaleY(1.1f).rotationBy(-20).withEndAction(new Runnable() {
            @Override
            public void run() {
                cwProfileImage4.animate().scaleX(1.f).scaleY(1.f).rotationBy(20).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        funnyPlayer.stop();
                        funnyPlayer = MediaPlayer.create(DetailsProfileActivity.this, R.raw.funny);
                    }
                });
            }
        }).start();
    }

    public void beginGame(View view) {
        saveUser(view);
        Toast.makeText(DetailsProfileActivity.this, u+"", Toast.LENGTH_SHORT).show();
    }
}
