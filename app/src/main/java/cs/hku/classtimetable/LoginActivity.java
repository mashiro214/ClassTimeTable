package cs.hku.classtimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private LinearLayout layout_main;
    private Animation animation_fadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.blackIconStatusBar(LoginActivity.this, R.color.light_background);

        layout_main = findViewById(R.id.layout_main);
        animation_fadein = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.fade_in);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                layout_main.setVisibility(View.VISIBLE);
                layout_main.setAnimation(animation_fadein);
            }
        }, 1000);
    }
}