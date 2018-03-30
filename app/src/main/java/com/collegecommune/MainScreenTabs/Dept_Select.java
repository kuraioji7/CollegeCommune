package com.collegecommune.MainScreenTabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.collegecommune.R;

public class Dept_Select extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sc_listview_layout);

        String[] departments = {"BM","CE","EC","IC","MET"};

        ListAdapter adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,departments);
        ListView list = findViewById(R.id.sc_1_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        int list_no = getIntent().getExtras().getInt("Selected List");
                        Intent selected_list;
                        switch (list_no){
                            case 1:
                                selected_list = new Intent(view.getContext(), E_books_list.class);
                                break;
                            case 3:
                                selected_list = new Intent(view.getContext(), ExamPapers.class);
                                break;
                            case 4:
                                selected_list = new Intent(view.getContext(), TimeTablePage.class);
                                break;
                            default:
                                selected_list = new Intent(view.getContext(), CompSuggPage.class);
                        }
                        startActivity(selected_list);
                    }
                }
        );
    }
}
