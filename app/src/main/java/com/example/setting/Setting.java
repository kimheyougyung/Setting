package com.example.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.setting.R;

public class Setting extends AppCompatActivity implements AdapterView.OnItemClickListener {
    static final String[] LIST_SET = {"도움말", "개발자 버전", "계정정보", "Google Cloud", "비밀번호 변경"};
//    View view = View.inflate(R.layout.)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_SET);

        //listview 에 listViewSetting 가져와서 저장
        ListView listView = (ListView)findViewById(R.id.listViewSetting);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0){
            Intent mIntent1 = new Intent(Setting.this, Help.class);
            startActivity(mIntent1);
        }
        if(position == 1){
            Intent mIntent2 = new Intent(Setting.this, Version.class);
            startActivity(mIntent2);
        }
        if(position == 2){
            Intent mIntent3 = new Intent(Setting.this, Information.class);
            startActivity(mIntent3);
        }
        if(position == 3){
            Intent mIntent4 = new Intent(Setting.this, Google_Cloud.class);
            startActivity(mIntent4);
        }
        if(position == 4){
            Intent mIntent5 = new Intent(Setting.this, Change_Password.class);
            startActivity(mIntent5);
        }
    }
}