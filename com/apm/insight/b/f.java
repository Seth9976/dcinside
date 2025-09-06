package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

public class f {
    private static volatile f a;
    private final b b;
    private static g c;

    private f(@NonNull Context context0) {
        this.b = new b(context0);
        g g0 = new g();
        f.c = g0;
        g0.a();
    }

    public static f a(Context context0) {
        if(f.a == null) {
            Class class0 = f.class;
            synchronized(class0) {
                if(f.a == null) {
                    f.a = new f(context0);
                }
            }
        }
        return f.a;
    }

    public final b a() {
        return this.b;
    }

    public static g b() {
        return f.c;
    }

    public final void c() {
        this.b.a();
    }

    public final void d() {
        this.b.b();
    }
}

