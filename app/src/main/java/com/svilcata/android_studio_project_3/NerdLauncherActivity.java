package com.svilcata.android_studio_project_3;

import android.support.v4.app.Fragment;


public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }

}