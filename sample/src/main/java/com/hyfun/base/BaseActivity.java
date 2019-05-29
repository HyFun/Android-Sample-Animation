package com.hyfun.base;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by HyFun on 2019/05/29.
 * Email: 775183940@qq.com
 * Description:
 */
public class BaseActivity extends AppCompatActivity {


    protected void setDisplayHomeAsUpEnabled() {
        setTitle(getClass().getSimpleName());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
