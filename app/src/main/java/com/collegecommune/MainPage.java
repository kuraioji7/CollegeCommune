package com.collegecommune;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.collegecommune.MainScreenTabs.NoticeTab;
import com.collegecommune.MainScreenTabs.FacultyTab;
import com.collegecommune.MainScreenTabs.StudentCornerTab;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        Adapter adapter = new Adapter(getSupportFragmentManager());

        adapter.addFragment(new NoticeTab(), "Notices");
        adapter.addFragment(new FacultyTab(), "Faculties");
        adapter.addFragment(new StudentCornerTab(), "Student Corner");
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}


