package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.internal.g;

class e {
    private final Float a;
    private final boolean b;
    static final int c = 1;
    static final int d = 2;
    static final int e = 3;

    private e(Float float0, boolean z) {
        this.b = z;
        this.a = float0;
    }

    public static e a(Context context0) {
        boolean z = false;
        try {
            Intent intent0 = context0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if(intent0 != null) {
                z = e.f(intent0);
                return new e(e.d(intent0), z);
            }
        }
        catch(IllegalStateException illegalStateException0) {
            g.f().e("An error occurred getting battery state.", illegalStateException0);
            return new e(null, z);
        }
        return new e(null, false);
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        if(this.b) {
            Float float0 = this.a;
            if(float0 != null) {
                return ((double)(((float)float0))) < 0.99 ? 2 : 3;
            }
        }
        return 1;
    }

    private static Float d(Intent intent0) {
        int v = intent0.getIntExtra("level", -1);
        int v1 = intent0.getIntExtra("scale", -1);
        return v == -1 || v1 == -1 ? null : ((float)(((float)v) / ((float)v1)));
    }

    boolean e() {
        return this.b;
    }

    private static boolean f(Intent intent0) {
        int v = intent0.getIntExtra("status", -1);
        return v == -1 ? false : v == 2 || v == 5;
    }
}

