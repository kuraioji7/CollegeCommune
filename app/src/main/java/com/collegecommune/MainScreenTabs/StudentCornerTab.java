package com.collegecommune.MainScreenTabs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.support.v4.app.Fragment;

import com.collegecommune.R;

public class StudentCornerTab extends Fragment{
    public StudentCornerTab(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.studentcorner_tab, container, false);

        String[] menu_list = {"Complain and Suggestion", "E-Book", "Events", "Exam Papers", "Time-Tables"};
        ListAdapter l_adapter = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1,menu_list);
        ListView list = rootView.findViewById(R.id.sc_list);
        list.setAdapter(l_adapter);

        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i_dept_select;

                        switch (i){
                            // case 1, 3, 4 are passed through default case.
                            case 0:
                                i_dept_select = new Intent(view.getContext(), CompSuggPage.class);
                                break;
                            case 2:
                                i_dept_select = new Intent(view.getContext(), EventsPage.class);
                                break;
                            default:
                                i_dept_select = new Intent(view.getContext(), Dept_Select.class);
                        }
                        i_dept_select.putExtra("Selected List", i);
                        startActivity(i_dept_select);

                    }
                }
        );
        return rootView;
    }


}