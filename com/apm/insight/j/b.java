package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.e;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import java.util.Map;

public final class b extends a {
    private Context a;
    private static Runnable b;

    static {
        b.b = new Runnable() {
            @Override
            public final void run() {
                m.a().a().removeCallbacks(this);
                m.a().a(new b(m.a().a(), e.g()));
            }
        };
    }

    public b(Handler handler0, Context context0) {
        super(handler0, 30000L);
        this.a = context0;
    }

    public static void c() {
        m.a().a(b.b, 100L);
    }

    @Override
    public final void run() {
        Map map0 = null;
        try {
            map0 = e.a().c().getCommonParams();
        }
        catch(Throwable unused_ex) {
        }
        try {
            if(map0 != null && com.apm.insight.nativecrash.b.a(map0)) {
                this.a(this.b());
                return;
            }
            o.a().a(map0, com.apm.insight.entity.b.b());
        }
        catch(Throwable unused_ex) {
        }
    }
}

