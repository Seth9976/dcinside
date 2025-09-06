package com.dcinside.app.view.recent;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

public final class d implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final RecentMenuView a;

    public d(RecentMenuView recentMenuView0) {
        this.a = recentMenuView0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        this.a.H(sharedPreferences0, s);
    }
}

