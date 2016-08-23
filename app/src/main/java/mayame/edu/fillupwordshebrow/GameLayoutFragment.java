package mayame.edu.fillupwordshebrow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GameLayoutFragment extends Fragment {

    CardView cw_1_1, cw_1_2, cw_1_3, cw_1_4, cw_1_5, cw_1_6, cw_1_7, cw_1_8, cw_1_9, cw_1_10, cw_1_11;
    CardView cw_2_1, cw_2_2, cw_2_3, cw_2_4, cw_2_5, cw_2_6, cw_2_7, cw_2_8, cw_2_9, cw_2_10, cw_2_11;
    CardView cw_3_1, cw_3_2, cw_3_3, cw_3_4, cw_3_5, cw_3_6, cw_3_7, cw_3_8, cw_3_9, cw_3_10, cw_3_11;
    CardView cw_4_1, cw_4_2, cw_4_3, cw_4_4, cw_4_5, cw_4_6, cw_4_7, cw_4_8, cw_4_9, cw_4_10, cw_4_11;
    CardView cw_5_1, cw_5_2, cw_5_3, cw_5_4, cw_5_5, cw_5_6, cw_5_7, cw_5_8, cw_5_9, cw_5_10, cw_5_11;
    CardView cw_6_1, cw_6_2, cw_6_3, cw_6_4, cw_6_5, cw_6_6, cw_6_7, cw_6_8, cw_6_9, cw_6_10, cw_6_11;

    ImageView iv_1_1, iv_1_2, iv_1_3, iv_1_4, iv_1_5, iv_1_6, iv_1_7, iv_1_8, iv_1_9, iv_1_10, iv_1_11;
    ImageView iv_2_1, iv_2_2, iv_2_3, iv_2_4, iv_2_5, iv_2_6, iv_2_7, iv_2_8, iv_2_9, iv_2_10, iv_2_11;
    ImageView iv_3_1, iv_3_2, iv_3_3, iv_3_4, iv_3_5, iv_3_6, iv_3_7, iv_3_8, iv_3_9, iv_3_10, iv_3_11;
    ImageView iv_4_1, iv_4_2, iv_4_3, iv_4_4, iv_4_5, iv_4_6, iv_4_7, iv_4_8, iv_4_9, iv_4_10, iv_4_11;
    ImageView iv_5_1, iv_5_2, iv_5_3, iv_5_4, iv_5_5, iv_5_6, iv_5_7, iv_5_8, iv_5_9, iv_5_10, iv_5_11;
    ImageView iv_6_1, iv_6_2, iv_6_3, iv_6_4, iv_6_5, iv_6_6, iv_6_7, iv_6_8, iv_6_9, iv_6_10, iv_6_11;

    public GameLayoutFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_game_layout, container, false);
        initFindViewByIdCardView(v);
        initFindViewByIdImageView(v);
        return v;
    }



    private void initFindViewByIdImageView(View v) {
        iv_1_1 = (ImageView) v.findViewById(R.id.iv_1_1);
        iv_1_2 = (ImageView) v.findViewById(R.id.iv_1_2);
        iv_1_3 = (ImageView) v.findViewById(R.id.iv_1_3);
        iv_1_4 = (ImageView) v.findViewById(R.id.iv_1_4);
        iv_1_5 = (ImageView) v.findViewById(R.id.iv_1_5);
        iv_1_6 = (ImageView) v.findViewById(R.id.iv_1_6);
        iv_1_7 = (ImageView) v.findViewById(R.id.iv_1_7);
        iv_1_8 = (ImageView) v.findViewById(R.id.iv_1_8);
        iv_1_9 = (ImageView) v.findViewById(R.id.iv_1_9);
        iv_1_10 = (ImageView) v.findViewById(R.id.iv_1_10);
        iv_1_11 = (ImageView) v.findViewById(R.id.iv_1_11);

        iv_2_1 = (ImageView) v.findViewById(R.id.iv_2_1);
        iv_2_2 = (ImageView) v.findViewById(R.id.iv_2_2);
        iv_2_3 = (ImageView) v.findViewById(R.id.iv_2_3);
        iv_2_4 = (ImageView) v.findViewById(R.id.iv_2_4);
        iv_2_5 = (ImageView) v.findViewById(R.id.iv_2_5);
        iv_2_6 = (ImageView) v.findViewById(R.id.iv_2_6);
        iv_2_7 = (ImageView) v.findViewById(R.id.iv_2_7);
        iv_2_8 = (ImageView) v.findViewById(R.id.iv_2_8);
        iv_2_9 = (ImageView) v.findViewById(R.id.iv_2_9);
        iv_2_10 = (ImageView) v.findViewById(R.id.iv_2_10);
        iv_2_11 = (ImageView) v.findViewById(R.id.iv_2_11);

        iv_3_1 = (ImageView) v.findViewById(R.id.iv_3_1);
        iv_3_2 = (ImageView) v.findViewById(R.id.iv_3_2);
        iv_3_3 = (ImageView) v.findViewById(R.id.iv_3_3);
        iv_3_4 = (ImageView) v.findViewById(R.id.iv_3_4);
        iv_3_5 = (ImageView) v.findViewById(R.id.iv_3_5);
        iv_3_6 = (ImageView) v.findViewById(R.id.iv_3_6);
        iv_3_7 = (ImageView) v.findViewById(R.id.iv_3_7);
        iv_3_8 = (ImageView) v.findViewById(R.id.iv_3_8);
        iv_3_9 = (ImageView) v.findViewById(R.id.iv_3_9);
        iv_3_10 = (ImageView) v.findViewById(R.id.iv_3_10);
        iv_3_11 = (ImageView) v.findViewById(R.id.iv_3_11);

        iv_4_1 = (ImageView) v.findViewById(R.id.iv_4_1);
        iv_4_2 = (ImageView) v.findViewById(R.id.iv_4_2);
        iv_4_3 = (ImageView) v.findViewById(R.id.iv_4_3);
        iv_4_4 = (ImageView) v.findViewById(R.id.iv_4_4);
        iv_4_5 = (ImageView) v.findViewById(R.id.iv_4_5);
        iv_4_6 = (ImageView) v.findViewById(R.id.iv_4_6);
        iv_4_7 = (ImageView) v.findViewById(R.id.iv_4_7);
        iv_4_8 = (ImageView) v.findViewById(R.id.iv_4_8);
        iv_4_9 = (ImageView) v.findViewById(R.id.iv_4_9);
        iv_4_10 = (ImageView) v.findViewById(R.id.iv_4_10);
        iv_4_11 = (ImageView) v.findViewById(R.id.iv_4_11);

        iv_5_1 = (ImageView) v.findViewById(R.id.iv_5_1);
        iv_5_2 = (ImageView) v.findViewById(R.id.iv_5_2);
        iv_5_3 = (ImageView) v.findViewById(R.id.iv_5_3);
        iv_5_4 = (ImageView) v.findViewById(R.id.iv_5_4);
        iv_5_5 = (ImageView) v.findViewById(R.id.iv_5_5);
        iv_5_6 = (ImageView) v.findViewById(R.id.iv_5_6);
        iv_5_7 = (ImageView) v.findViewById(R.id.iv_5_7);
        iv_5_8 = (ImageView) v.findViewById(R.id.iv_5_8);
        iv_5_9 = (ImageView) v.findViewById(R.id.iv_5_9);
        iv_5_10 = (ImageView) v.findViewById(R.id.iv_5_10);
        iv_5_11 = (ImageView) v.findViewById(R.id.iv_5_11);

        iv_6_1 = (ImageView) v.findViewById(R.id.iv_6_1);
        iv_6_2 = (ImageView) v.findViewById(R.id.iv_6_2);
        iv_6_3 = (ImageView) v.findViewById(R.id.iv_6_3);
        iv_6_4 = (ImageView) v.findViewById(R.id.iv_6_4);
        iv_6_5 = (ImageView) v.findViewById(R.id.iv_6_5);
        iv_6_6 = (ImageView) v.findViewById(R.id.iv_6_6);
        iv_6_7 = (ImageView) v.findViewById(R.id.iv_6_7);
        iv_6_8 = (ImageView) v.findViewById(R.id.iv_6_8);
        iv_6_9 = (ImageView) v.findViewById(R.id.iv_6_9);
        iv_6_10 = (ImageView) v.findViewById(R.id.iv_6_10);
        iv_6_11 = (ImageView) v.findViewById(R.id.iv_6_11);
    }

    public void initFindViewByIdCardView(View v) {
        cw_1_1 = (CardView) v.findViewById(R.id.cw_1_1);
        cw_1_2 = (CardView) v.findViewById(R.id.cw_1_2);
        cw_1_3 = (CardView) v.findViewById(R.id.cw_1_3);
        cw_1_4 = (CardView) v.findViewById(R.id.cw_1_4);
        cw_1_5 = (CardView) v.findViewById(R.id.cw_1_5);
        cw_1_6 = (CardView) v.findViewById(R.id.cw_1_6);
        cw_1_7 = (CardView) v.findViewById(R.id.cw_1_7);
        cw_1_8 = (CardView) v.findViewById(R.id.cw_1_8);
        cw_1_9 = (CardView) v.findViewById(R.id.cw_1_9);
        cw_1_10 = (CardView) v.findViewById(R.id.cw_1_10);
        cw_1_11 = (CardView) v.findViewById(R.id.cw_1_11);

        cw_2_1 = (CardView) v.findViewById(R.id.cw_2_1);
        cw_2_2 = (CardView) v.findViewById(R.id.cw_2_2);
        cw_2_3 = (CardView) v.findViewById(R.id.cw_2_3);
        cw_2_4 = (CardView) v.findViewById(R.id.cw_2_4);
        cw_2_5 = (CardView) v.findViewById(R.id.cw_2_5);
        cw_2_6 = (CardView) v.findViewById(R.id.cw_2_6);
        cw_2_7 = (CardView) v.findViewById(R.id.cw_2_7);
        cw_2_8 = (CardView) v.findViewById(R.id.cw_2_8);
        cw_2_9 = (CardView) v.findViewById(R.id.cw_2_9);
        cw_2_10 = (CardView) v.findViewById(R.id.cw_2_10);
        cw_2_11 = (CardView) v.findViewById(R.id.cw_2_11);

        cw_3_1 = (CardView) v.findViewById(R.id.cw_3_1);
        cw_3_2 = (CardView) v.findViewById(R.id.cw_3_2);
        cw_3_3 = (CardView) v.findViewById(R.id.cw_3_3);
        cw_3_4 = (CardView) v.findViewById(R.id.cw_3_4);
        cw_3_5 = (CardView) v.findViewById(R.id.cw_3_5);
        cw_3_6 = (CardView) v.findViewById(R.id.cw_3_6);
        cw_3_7 = (CardView) v.findViewById(R.id.cw_3_7);
        cw_3_8 = (CardView) v.findViewById(R.id.cw_3_8);
        cw_3_9 = (CardView) v.findViewById(R.id.cw_3_9);
        cw_3_10 = (CardView) v.findViewById(R.id.cw_3_10);
        cw_3_11 = (CardView) v.findViewById(R.id.cw_3_11);

        cw_4_1 = (CardView) v.findViewById(R.id.cw_4_1);
        cw_4_2 = (CardView) v.findViewById(R.id.cw_4_2);
        cw_4_3 = (CardView) v.findViewById(R.id.cw_4_3);
        cw_4_4 = (CardView) v.findViewById(R.id.cw_4_4);
        cw_4_5 = (CardView) v.findViewById(R.id.cw_4_5);
        cw_4_6 = (CardView) v.findViewById(R.id.cw_4_6);
        cw_4_7 = (CardView) v.findViewById(R.id.cw_4_7);
        cw_4_8 = (CardView) v.findViewById(R.id.cw_4_8);
        cw_4_9 = (CardView) v.findViewById(R.id.cw_4_9);
        cw_4_10 = (CardView) v.findViewById(R.id.cw_4_10);
        cw_4_11 = (CardView) v.findViewById(R.id.cw_4_11);

        cw_5_1 = (CardView) v.findViewById(R.id.cw_5_1);
        cw_5_2 = (CardView) v.findViewById(R.id.cw_5_2);
        cw_5_3 = (CardView) v.findViewById(R.id.cw_5_3);
        cw_5_4 = (CardView) v.findViewById(R.id.cw_5_4);
        cw_5_5 = (CardView) v.findViewById(R.id.cw_5_5);
        cw_5_6 = (CardView) v.findViewById(R.id.cw_5_6);
        cw_5_7 = (CardView) v.findViewById(R.id.cw_5_7);
        cw_5_8 = (CardView) v.findViewById(R.id.cw_5_8);
        cw_5_9 = (CardView) v.findViewById(R.id.cw_5_9);
        cw_5_10 = (CardView) v.findViewById(R.id.cw_5_10);
        cw_5_11 = (CardView) v.findViewById(R.id.cw_5_11);

        cw_6_1 = (CardView) v.findViewById(R.id.cw_6_1);
        cw_6_2 = (CardView) v.findViewById(R.id.cw_6_2);
        cw_6_3 = (CardView) v.findViewById(R.id.cw_6_3);
        cw_6_4 = (CardView) v.findViewById(R.id.cw_6_4);
        cw_6_5 = (CardView) v.findViewById(R.id.cw_6_5);
        cw_6_6 = (CardView) v.findViewById(R.id.cw_6_6);
        cw_6_7 = (CardView) v.findViewById(R.id.cw_6_7);
        cw_6_8 = (CardView) v.findViewById(R.id.cw_6_8);
        cw_6_9 = (CardView) v.findViewById(R.id.cw_6_9);
        cw_6_10 = (CardView) v.findViewById(R.id.cw_6_10);
        cw_6_11 = (CardView) v.findViewById(R.id.cw_6_11);

    }

}
