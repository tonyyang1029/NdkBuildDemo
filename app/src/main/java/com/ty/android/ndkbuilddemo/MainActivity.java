/**
 * https://www.jianshu.com/p/09ff3300f453
 */

package com.ty.android.ndkbuilddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView        mTextView = null;
    private Button          mButton   = null;
    private NdkBuildDemoLib mDemoLib  = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDemoLib = new NdkBuildDemoLib();
        mTextView = findViewById(R.id.ID_MAIN_TEXTVIEW);
        mTextView.setText("No." + mDemoLib.updateNumber() + " " + mDemoLib.getStringFromLib());

        mButton = findViewById(R.id.ID_MAIN_BUTTON);
        mButton.setText("Update");
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ID_MAIN_BUTTON) {
            mTextView.setText("No." + mDemoLib.updateNumber() + " " + mDemoLib.getStringFromLib());
        }
    }
}
