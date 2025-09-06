package com.dcinside.app.totalsearch.post;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

public final class s implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final u a;

    public s(u u0) {
        this.a = u0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        u.M0(this.a, sharedPreferences0, s);
    }
}

