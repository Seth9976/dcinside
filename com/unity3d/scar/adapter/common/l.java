package com.unity3d.scar.adapter.common;

import P2.b;
import P2.e;
import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.signals.c;
import j..util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

public abstract class l implements f {
    protected c a;
    protected Map b;
    protected b c;
    protected d d;

    public l(d d0) {
        this.b = new ConcurrentHashMap();
        this.d = d0;
    }

    @Override  // com.unity3d.scar.adapter.common.f
    public void a(Context context0, String s, e e0, com.unity3d.scar.adapter.common.signals.b b0) {
        this.a.a(context0, s, e0, b0);
    }

    @Override  // com.unity3d.scar.adapter.common.f
    public void b(Context context0, boolean z, com.unity3d.scar.adapter.common.signals.b b0) {
        this.a.b(context0, z, b0);
    }

    @Override  // com.unity3d.scar.adapter.common.f
    public void c(Context context0, List list0, com.unity3d.scar.adapter.common.signals.b b0) {
        this.a.c(context0, list0, b0);
    }

    @Override  // com.unity3d.scar.adapter.common.f
    public void d(Activity activity0, String s, String s1) {
        class a implements Runnable {
            final Activity a;
            final l b;

            a(Activity activity0) {
                this.a = activity0;
                super();
            }

            @Override
            public void run() {
                l.this.c.a(this.a);
            }
        }

        b b0 = (b)this.b.get(s1);
        if(b0 == null) {
            this.d.handleError(com.unity3d.scar.adapter.common.b.f(s1, s, "Could not find ad for placement \'" + s1 + "\'."));
            return;
        }
        this.c = b0;
        m.a(new a(this, activity0));
    }
}

