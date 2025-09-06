package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class h0 {
    static class a {
        final String a;
        final String b;
        final long c;
        private static final String d = "token";
        private static final String e = "appVersion";
        private static final String f = "timestamp";
        private static final long g;

        static {
            a.g = TimeUnit.DAYS.toMillis(7L);
        }

        private a(String s, String s1, long v) {
            this.a = s;
            this.b = s1;
            this.c = v;
        }

        static String a(String s, String s1, long v) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("token", s);
                jSONObject0.put("appVersion", s1);
                jSONObject0.put("timestamp", v);
                return jSONObject0.toString();
            }
            catch(JSONException jSONException0) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + jSONException0);
                return null;
            }
        }

        boolean b(String s) {
            return System.currentTimeMillis() > this.c + a.g || !s.equals(this.b);
        }

        static a c(String s) {
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            if(s.startsWith("{")) {
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    return new a(jSONObject0.getString("token"), jSONObject0.getString("appVersion"), jSONObject0.getLong("timestamp"));
                }
                catch(JSONException jSONException0) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + jSONException0);
                    return null;
                }
            }
            return new a(s, null, 0L);
        }
    }

    final SharedPreferences a;
    private static final String b = "|T|";
    private static final String c = "*";
    static final String d = "com.google.android.gms.appid";
    static final String e = "com.google.android.gms.appid-no-backup";

    public h0(Context context0) {
        this.a = context0.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a(context0, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context0, String s) {
        File file0 = new File(ContextCompat.getNoBackupFilesDir(context0), s);
        if(file0.exists()) {
            return;
        }
        try {
            if(file0.createNewFile() && !this.f()) {
                Log.i("FirebaseMessaging", "App restored, clearing state");
                this.c();
            }
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + iOException0.getMessage());
            }
        }
    }

    private String b(String s, String s1) [...] // Inlined contents

    public void c() {
        synchronized(this) {
            this.a.edit().clear().commit();
        }
    }

    public void d(String s, String s1) {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            sharedPreferences$Editor0.remove(s + "|T|" + s1 + "|" + "*");
            sharedPreferences$Editor0.commit();
        }
    }

    public a e(String s, String s1) {
        synchronized(this) {
            return a.c(this.a.getString(s + "|T|" + s1 + "|" + "*", null));
        }
    }

    public boolean f() {
        synchronized(this) {
            return this.a.getAll().isEmpty();
        }
    }

    public void g(String s, String s1, String s2, String s3) {
        synchronized(this) {
            String s4 = a.a(s2, s3, System.currentTimeMillis());
            if(s4 == null) {
                return;
            }
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            sharedPreferences$Editor0.putString(s + "|T|" + s1 + "|" + "*", s4);
            sharedPreferences$Editor0.commit();
        }
    }
}

