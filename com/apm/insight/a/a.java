package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.runtime.m;

public class a implements ICrashCallback {
    private volatile String a;
    private volatile com.apm.insight.b.i.a b;
    private volatile com.apm.insight.b.i.a c;
    private static volatile a d;
    private volatile boolean e;

    private a() {
        this.e = false;
    }

    public static a a() {
        if(a.d == null) {
            Class class0 = a.class;
            synchronized(class0) {
                if(a.d == null) {
                    a.d = new a();
                }
            }
        }
        return a.d;
    }

    public final void a(String s, com.apm.insight.b.i.a i$a0, com.apm.insight.b.i.a i$a1) {
        this.a = s;
        this.b = i$a0;
        this.c = i$a1;
        if(!this.e) {
            this.e = true;
            m.a().a(new Runnable() {
                private a a;

                @Override
                public final void run() {
                }
            });
        }
    }

    @Override  // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType0, @Nullable String s, @Nullable Thread thread0) {
        crashType0.equals(CrashType.NATIVE);
    }
}

