package tku.testex03_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView01;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView01 = (TextView)findViewById(R.id.myTextView01);
        String str_2 = "test 測試 Android TextView";
        mTextView01.setText(str_2);
    }
}

