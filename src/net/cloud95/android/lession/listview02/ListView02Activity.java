package net.cloud95.android.lession.listview02;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListView02Activity extends Activity {

    private ListView list_view;
    private ArrayAdapter<String> aa;
    private List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview02);

        processViews();
               
        // 建立一個給ListView使用的項目資料
        // 加入10個項目
        // 使用Android為ListView內建的畫面配置資源
        // 建立一個項目為String的Adapter物件
        // 第一個參數設定「this」，表示這個Activity元件
        // 第二個參數設定畫面配置資源
        // 第三個參數設定一個List物件，提供項目資料        
        // 呼叫setAdapter方法指定使用的Adapter物件
    }

    private void processViews() {
        list_view = (ListView) findViewById(R.id.list_view);
    }
    
    public void addItem(View view) {
        // 增加一個項目
        // 通知項目資料已經改變
    }

    public void removeItem(View view) {
    }
    
}