package mayame.edu.fillupwordshebrow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GameFragment fragment = new GameFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();


    }


}
