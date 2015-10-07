package com.slymdev.smplapp_playingwithanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.animeMe);
    }

    public void onFadeButtonClick(View v){
        Animation animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.fade);
        imageView.startAnimation(animation);
    }

    public void onMoveButtonClick(View v){
        Animation animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.move);
        imageView.startAnimation(animation);
    }

    public void onScaleButtonClick(View v){
        Animation animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.scale);
        imageView.startAnimation(animation);
    }

    public void onTranslateButtonClick(View v){
        Animation animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.translate);
        imageView.startAnimation(animation);
    }

    public void onSpaceButtonClick(View v){
        Animation animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.space);
        imageView.startAnimation(animation);
    }

    public void onZoomButtonClick(View v){
        Animation animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.zoom);
        imageView.startAnimation(animation);
    }

    public void onRotateButtonClick(View v){
        Animation animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.rotate);
        imageView.startAnimation(animation);
    }

    public void onCustomButtonClick(View v){
        Animation animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.custom);
        imageView.startAnimation(animation);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
