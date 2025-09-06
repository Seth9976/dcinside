package com.apm.insight.k;

import android.content.Context;
import com.apm.insight.b.f;
import com.apm.insight.e;
import com.apm.insight.j.d;
import com.apm.insight.l.a;
import com.apm.insight.l.k;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;

public final class h implements Runnable {
    private Context a;

    private h(Context context0) {
        this.a = context0;
    }

    public static void a(Context context0) {
        m.a().a(new h(context0), 0L);
    }

    // 去混淆评级： 低(20)
    public static boolean a() {
        return b.a().c() || !a.c(e.g());
    }

    @Override
    public final void run() {
        try {
            f.a(this.a).a().f();
        }
        catch(Throwable unused_ex) {
        }
        try {
            if(a.c(this.a)) {
                b.a().a(k.b(this.a));
            }
            else {
                NativeImpl.j();
            }
            goto label_17;
        }
        catch(Throwable throwable0) {
        }
        try {
            com.apm.insight.a.b(throwable0);
        }
        catch(Throwable throwable1) {
            o.a().a(e.a().b(), com.apm.insight.entity.b.b());
            if(m.a().a() != null) {
                d.a(m.a().a(), this.a).a();
            }
            throw throwable1;
        }
        o.a().a(e.a().b(), com.apm.insight.entity.b.b());
        if(m.a().a() != null) {
            d.a(m.a().a(), this.a).a();
            return;
        }
        return;
    label_17:
        o.a().a(e.a().b(), com.apm.insight.entity.b.b());
        if(m.a().a() != null) {
            d.a(m.a().a(), this.a).a();
        }
    }
}

