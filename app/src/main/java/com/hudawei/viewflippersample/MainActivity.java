package com.hudawei.viewflippersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper=(ViewFlipper)findViewById(R.id.viewFlipper);
    }

    public void processClick(View view){
//        boolean result=viewFlipper.isAutoStart();
//        log("result:"+result);

//        boolean result=viewFlipper.isFlipping();
//        log("result:"+result);

//        viewFlipper.stopFlipping();

//        viewFlipper.startFlipping();

//        int result=viewFlipper.getDisplayedChild();
//        log("result:"+result);

        viewFlipper.showNext();

//        viewFlipper.showPrevious();
    }

    public void log(String msg){
        Log.e("MainActivity",msg);
    }
}
