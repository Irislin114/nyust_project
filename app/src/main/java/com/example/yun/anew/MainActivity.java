package com.example.yun.anew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button button2;
    private EditText editText;
    private EditText editText3;
    private TextView text;
    private RadioButton radioButton;
    private RadioButton radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) this.findViewById(R.id.button2);
        editText = (EditText) this.findViewById(R.id.editText);
        editText3 = (EditText) this.findViewById(R.id.editText3);
        text = (TextView) this.findViewById(R.id.text);
        radioButton =(RadioButton) this.findViewById(R.id.radioButton);
        radioButton2 =(RadioButton) this.findViewById(R.id.radioButton2);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (radioButton2 == radioButton2) {

                    String[] account = {"Tom", "Aney", "Bob"};
                    String[] password = {"111", "222", "333"};
// 設定三組帳號密碼
                    for (int i = 0; i < account.length; i++) { // 用一個迴圈把帳號跟密碼從陣列取出
                        if (editText.getText().toString().equals(account[i])
                                && editText3.getText().toString().equals(password[i])) {
                            Intent intent = new Intent();
                            intent.setClass(MainActivity.this, flight.class);
                            startActivity(intent);
                            MainActivity.this.finish();


                            break;//一定要break,否則會無法判斷第二組

                        } else if (radioButton == radioButton) {

                            String[] account1 = {"Amy", "Aa", "Bob"};
                            String[] password1 = {"111", "222", "333"};

                            { // 用一個迴圈把帳號跟密碼從陣列取出
                                if (editText.getText().toString().equals(account1[i])
                                        && editText3.getText().toString().equals(password1[i])) {
                                    Intent intent = new Intent();
                                    intent.setClass(MainActivity.this, login.class);
                                    startActivity(intent);
                                    MainActivity.this.finish();

                                    break;//一定要break,否則會無法判斷第二組
                                } else {


                                    text.setText("輸入錯誤，請重新輸入");
                                }
                            }
                        }
                    }
                }
            }

                    });
                }
            }








// TODO Auto-generated method stub







