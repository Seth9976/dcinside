package com.dcinside.app.main.adapter;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

public final class c implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final f a;

    public c(f f0) {
        this.a = f0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        f.S(this.a, sharedPreferences0, s);
    }
}

