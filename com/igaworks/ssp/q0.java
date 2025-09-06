package com.igaworks.ssp;

import android.content.Context;
import android.content.SharedPreferences.Editor;

public class q0 {
    private static q0 a;

    public static q0 a() {
        if(q0.a == null) {
            q0.a = new q0();
        }
        return q0.a;
    }

    public String a(Context context0, String s, String s1, String s2) {
        try {
            return context0.getSharedPreferences(s, 0).getString(s1, s2);
        }
        catch(Exception unused_ex) {
            return s2;
        }
    }

    public void b(Context context0, String s, String s1, String s2) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences(s, 0).edit();
            sharedPreferences$Editor0.putString(s1, s2);
            sharedPreferences$Editor0.commit();
        }
        catch(Exception unused_ex) {
        }
    }
}

