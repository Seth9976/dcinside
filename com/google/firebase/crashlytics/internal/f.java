package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.i;
import java.io.IOException;
import java.io.InputStream;

public class f {
    static class a {
    }

    class b {
        @Nullable
        private final String a;
        @Nullable
        private final String b;
        final f c;

        private b() {
            int v = i.q(f0.a, "com.google.firebase.crashlytics.unity_version", "string");
            if(v != 0) {
                this.a = "Unity";
                String s = f0.a.getResources().getString(v);
                this.b = s;
                g.f().k("Unity Editor version is: " + s);
                return;
            }
            if(f0.c("flutter_assets/NOTICES.Z")) {
                this.a = "Flutter";
                this.b = null;
                g.f().k("Development platform is: Flutter");
                return;
            }
            this.a = null;
            this.b = null;
        }

        b(a f$a0) {
        }
    }

    private final Context a;
    @Nullable
    private b b;
    private static final String c = "Unity";
    private static final String d = "Flutter";
    private static final String e = "com.google.firebase.crashlytics.unity_version";
    private static final String f = "flutter_assets/NOTICES.Z";

    public f(Context context0) {
        this.a = context0;
        this.b = null;
    }

    private boolean c(String s) {
        if(this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStream0 = this.a.getAssets().open(s);
            if(inputStream0 != null) {
                inputStream0.close();
            }
            return true;
        }
        catch(IOException unused_ex) {
            return false;
        }
    }

    @Nullable
    public String d() {
        return this.f().a;
    }

    @Nullable
    public String e() {
        return this.f().b;
    }

    private b f() {
        if(this.b == null) {
            this.b = new b(this, null);
        }
        return this.b;
    }

    public static boolean g(Context context0) {
        return i.q(context0, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }
}

