package com.example.t_aoki.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hoge, menu);
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_menu1:
                // menu1 選択時の処理を記述
                break;
            case R.id.action_menu2:
                // menu2 選択時の処理を記述
                break;
            case R.id.action_menu3:
                // menu3 選択時の処理を記述
                break;
            case R.id.action_menu4:
                // menu4 選択時の処理を記述
                break;
            default:
                break;
        }
        return super.onMenuItemSelected(featureId, item);
    }
}
