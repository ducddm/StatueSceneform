package com.google.ar.sceneform.samples.hellosceneform;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testButton(View view){
        Intent intent = new Intent(this, HelloSceneformActivity.class);
        startActivity(intent);
    }

    public void testButton2(View view) {
        Intent intent = new Intent(this,HelloSceneformActivity1.class);
        startActivity(intent);
    }

    public void testButton3(View view){ //Error here
        Intent intent = new Intent(this,HelloSceneformActivity2.class);
        startActivity(intent);
    }

    public void testButton4(View view){
        Intent intent = new Intent(this,HelloSceneformActivity3.class);
        startActivity(intent);
    }

    public void testButton5(View view){
        Intent intent = new Intent(this,HelloSceneformActivity4.class);
        startActivity(intent);
    }

    public void testButton6(View view){
        Intent intent = new Intent(this,HelloSceneformActivity5.class);
        startActivity(intent);
    }

    public void testButton7(View view){
        Intent intent = new Intent(this,HelloSceneformActivity6.class);
        startActivity(intent);
    }

}
