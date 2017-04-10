package kr.hs.emirim.koojiwon.friendsimulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "프렌즈시뮬레이터(혜수)앱 : Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreat메소드 호출!! ~~!!!");
        setContentView(R.layout.activity_main);
        Log.d(TAG, "activity_main 레이아웃 세팅~!~~~~!!!!");
    } //end of onCreate

    void onClick(View view)
    {
        Log.d(TAG, "onClick메소드 호출!! ~~!!!");
        Log.d(TAG, "클릭된 뷰 id : " + view.getId());
        switch (view.getId())
        {
            case R.id.button1:
                Log.d(TAG, "버튼1 클릭");
                Toast.makeText(this, "열심히 덕질중", Toast.LENGTH_SHORT).show();

            case R.id.button2:
                Log.d(TAG, "버튼2 클릭");
                Toast.makeText(this, "나..안자..", Toast.LENGTH_SHORT).show();

            case R.id.button3:
                Log.d(TAG, "버튼3 클릭");
                Toast.makeText(this, "(어깨를 주무르며)일어나!", Toast.LENGTH_SHORT).show();

            case R.id.button4:
                Log.d(TAG, "버튼4 클릭");
                Toast.makeText(this, "에?", Toast.LENGTH_SHORT).show();

            case R.id.button5:
                Log.d(TAG, "버튼5 클릭");
                Toast.makeText(this, "호룰루", Toast.LENGTH_SHORT).show();

            default:
                Log.d(TAG, "에러!에러!에러!");
                Toast.makeText(this, "쏘리 맴", Toast.LENGTH_SHORT).show();
                break;
        } // end of switch

        Log.d(TAG, "메소드 무사종료");
    } // end of onClick
} // end of MainActivity
