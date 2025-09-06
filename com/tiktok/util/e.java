package com.tiktok.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map.Entry;

public class e {
    private final SharedPreferences a;

    public e(Context context0) {
        this.a = context0.getApplicationContext().getSharedPreferences("com.tiktok.sdk.keystore", 0);
    }

    public String a(String s) {
        return this.a.getString(s, null);
    }

    public void b(String s, Object object0) {
        this.a.edit().putString(s, object0.toString()).apply();
    }

    public void c(HashMap hashMap0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
        for(Object object0: hashMap0.entrySet()) {
            sharedPreferences$Editor0.putString(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue().toString());
        }
        sharedPreferences$Editor0.apply();
    }
}

