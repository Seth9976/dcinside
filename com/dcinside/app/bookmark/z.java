package com.dcinside.app.bookmark;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

public final class z implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final FavoriteMenuView a;

    public z(FavoriteMenuView favoriteMenuView0) {
        this.a = favoriteMenuView0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        FavoriteMenuView.y(this.a, sharedPreferences0, s);
    }
}

