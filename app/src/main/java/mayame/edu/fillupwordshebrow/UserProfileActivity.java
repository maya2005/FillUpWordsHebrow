package mayame.edu.fillupwordshebrow;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class UserProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

    }


    public void boyChosen(View view) {
       Intent genderIntent = new Intent( this, DetailsProfileActivity.class);
        genderIntent.putExtra("gender", "boy");
        startActivity(genderIntent);
        showProgerssDialog();
    }



    public void girlChosen(View view) {

        Intent genderIntent = new Intent(this, DetailsProfileActivity.class);
        genderIntent.putExtra("gender", "girl");
        startActivity(genderIntent);
        showProgerssDialog();

    }

    private void showProgerssDialog() {
        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("");
        dialog.setMessage("כְּבָר מַגִּיעִים..");
        dialog.show();
    }

}
