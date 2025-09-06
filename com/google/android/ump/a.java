package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzct;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class a {
    public static class com.google.android.ump.a.a {
        private final List a;
        private final Context b;
        private int c;
        private boolean d;

        public com.google.android.ump.a.a(@RecentlyNonNull Context context0) {
            this.a = new ArrayList();
            this.c = 0;
            this.b = context0.getApplicationContext();
        }

        @RecentlyNonNull
        public com.google.android.ump.a.a a(@RecentlyNonNull String s) {
            this.a.add(s);
            return this;
        }

        @RecentlyNonNull
        public a b() {
            boolean z = true;
            if(!zzct.zza(true)) {
                String s = zzcl.zza(this.b);
                if(!this.a.contains(s) && !this.d) {
                    z = false;
                }
            }
            return new a(z, this, null);
        }

        @RecentlyNonNull
        public com.google.android.ump.a.a c(int v) {
            this.c = v;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public com.google.android.ump.a.a d(boolean z) {
            this.d = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int R0 = 0;
        public static final int S0 = 1;
        public static final int T0 = 2;

    }

    private final boolean a;
    private final int b;

    a(boolean z, com.google.android.ump.a.a a$a0, g g0) {
        this.a = z;
        this.b = a$a0.c;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }
}

