package com.CR22.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.util.Log;

import java.text.BreakIterator;

import static com.CR22.counterhomework.R.id.textView;

public class MainActivity extends AppCompatActivity {
    int mCount=0 ;
    private TextView mShowCount;
    private View mMessageEditText;

    private static final String TAG= MainActivity.class.getSimpleName();
    private Log log;

    @SuppressLint({"NewApi", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(textView);
        mMessageEditText = findViewById(R.id.textview);





        if (savedInstanceState != null) {
            boolean isVisible =
                    savedInstanceState.getBoolean("reply_visible");

            if (isVisible) {
                mShowCount.setVisibility(View.VISIBLE);
                mShowCount.setText(savedInstanceState
                        .getString("reply_text"));
                mShowCount.setVisibility(View.VISIBLE);
            }
        }
    }

    public void countUp(View view) {
        mCount++;
          mShowCount.setText(Integer.toString(mCount));
        }
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        AssistStructure.ViewNode mReplyHeadTextView;
        if (mShowCount.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            BreakIterator mReplyTextView;
            outState.putString("reply_text",
                    mShowCount.getText().toString());
        }
    }}