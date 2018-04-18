package com.example.user.to.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.to.fragment_tabs.ApplicationFragment;

public class TabsPageFragment extends FragmentPagerAdapter{

    private String[] tabs ;
    public TabsPageFragment(FragmentManager fm) {
        super(fm);
        tabs= new String[]{
                "Заявка",
                "Список клиентов",
                "Новости"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ApplicationFragment.getInstance();
            case 1:
                return ApplicationFragment.getInstance();
            case 2:
                return ApplicationFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
