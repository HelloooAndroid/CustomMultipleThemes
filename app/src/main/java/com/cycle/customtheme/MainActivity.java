package com.cycle.customtheme;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cycle.customtheme.BaseActivity;
import com.cycle.customtheme.R;
import com.cycle.customtheme.Utility;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.light_theme_btn)).setOnClickListener(this);
        ((Button)findViewById(R.id.console_theme_btn)).setOnClickListener(this);
        ((Button)findViewById(R.id.navy_theme_btn)).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.light_theme_btn:
                Utility.setTheme(getApplicationContext(), 1);
                recreateActivity();
                break;
            case R.id.console_theme_btn:
                Utility.setTheme(getApplicationContext(), 2);
                recreateActivity();
                break;
            case R.id.navy_theme_btn:
                Utility.setTheme(getApplicationContext(), 3);
                recreateActivity();
                break;
        }
    }
    public void recreateActivity() {
        Intent intent = getIntent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0, 0);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}