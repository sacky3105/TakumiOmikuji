package com.example.takumiomikuji;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //　型 箱の名前 = activity_mainからomikuji_buttonっていうヤツを探してくる
        Button omikujiButton = findViewById(R.id.omikuji_button);

        // ボタンにクイックリスナーをセット
        omikujiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ボタンが押された時、ここに来る

                // ランダムみたいな数字を取得する randomっていう箱に、新しいRandomを作って入れる
                Random random = new Random();
                // 0-5までの整数を、omikujiNumberっていう箱に入れる
                int omikujiNumber = random.nextInt(5);
                // 運勢の文字が入る時
                String unsei = "";

                //で、0の時が大吉、1の時が吉、みたいなルールを決める
                switch(omikujiNumber){
                    case 0:
                        // omikujiNumberが0の時やりたいことをここに書く
                        unsei = "大吉";
                        break;
                    case 1:
                        unsei = "吉";
                        break;
                    case 2:
                        unsei = "中吉";
                        break;
                    case 3:
                        unsei = "小吉";
                        break;
                    case 4:
                        unsei = "末吉";
                        break;
                    case 5:
                        unsei = "凶";
                        break;
                }

                Toast.makeText(MainActivity.this, unsei, Toast.LENGTH_SHORT).show();
            }
        });
    }
}