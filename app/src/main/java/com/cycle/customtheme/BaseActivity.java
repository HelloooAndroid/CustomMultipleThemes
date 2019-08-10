package com.cycle.customtheme;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class BaseActivity extends AppCompatActivity {
    private final static int THEME_LIGHT = 1;
    private final static int THEME_CONSOLE = 2;
    private final static int THEME_NAVY = 3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        updateTheme();
    }
    public void updateTheme() {
        if (Utility.getTheme(getApplicationContext()) <= THEME_LIGHT) {
            setTheme(R.style.AppTheme_Light);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.primaryColorDark_light));
            }
        } else if (Utility.getTheme(getApplicationContext()) == THEME_CONSOLE) {
            setTheme(R.style.AppTheme_Console);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.primaryColorDark_console));
            }
        }else if (Utility.getTheme(getApplicationContext()) == THEME_NAVY) {
            setTheme(R.style.AppTheme_Navy);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.primaryColorDark_navy));
            }
        }
    }
}