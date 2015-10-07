package com.example.tacademy.myapplication_mail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button send = (Button) this.findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                GmailSender sender = new GmailSender("@gmail.com", " /비밇번호/"); // SUBSTITUTE HERE
                try {
                    sender.sendMail(
                            "메일제목 !!",   //subject.getText().toString(),
                            "메일 본문입니다..~~ ",           //body.getText().toString(),
                            "sangyoocjswo@gmail.com",          //from.getText().toString(),
                            "sangyoocjswo@gmail.com"            //to.getText().toString()
                    );
                } catch (Exception e) {
                    Log.e("SendMail", e.getMessage(), e);
                }
            }
        });
    }


}
