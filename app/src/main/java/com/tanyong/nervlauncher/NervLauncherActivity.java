package com.tanyong.nervlauncher;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NervLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment()
    {
        return NervLauncherFragment.newInstance();
    }
}
