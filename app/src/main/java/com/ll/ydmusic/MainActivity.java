package com.ll.ydmusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_0)
    TextView tv0;
    @BindView(R.id.tv_1)
    TextView tv1;
    @BindView(R.id.bt_1)
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_0)
    public void onTv0Clicked() {
    }

    @OnClick(R.id.tv_1)
    public void onTv1Clicked() {
    }

    @OnClick(R.id.bt_1)
    public void onBt1Clicked() {
    }
}
