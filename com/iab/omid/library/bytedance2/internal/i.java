package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.devicevolume.b;
import com.iab.omid.library.bytedance2.devicevolume.c;
import com.iab.omid.library.bytedance2.devicevolume.d;
import com.iab.omid.library.bytedance2.devicevolume.e;
import com.iab.omid.library.bytedance2.walking.TreeWalker;

public class i implements c, a {
    private float a;
    private final e b;
    private final b c;
    private d d;
    private com.iab.omid.library.bytedance2.internal.c e;
    private static i f;

    public i(e e0, b b0) {
        this.a = 0.0f;
        this.b = e0;
        this.c = b0;
    }

    private com.iab.omid.library.bytedance2.internal.c a() {
        if(this.e == null) {
            this.e = com.iab.omid.library.bytedance2.internal.c.c();
        }
        return this.e;
    }

    @Override  // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f) {
        this.a = f;
        for(Object object0: this.a().a()) {
            ((com.iab.omid.library.bytedance2.adsession.a)object0).getAdSessionStatePublisher().a(f);
        }
    }

    public void a(Context context0) {
        com.iab.omid.library.bytedance2.devicevolume.a a0 = this.c.a();
        Handler handler0 = new Handler();
        this.d = this.b.a(handler0, context0, a0, this);
    }

    @Override  // com.iab.omid.library.bytedance2.internal.d$a
    public void a(boolean z) {
        if(z) {
            TreeWalker.getInstance().h();
            return;
        }
        TreeWalker.getInstance().g();
    }

    public float b() {
        return this.a;
    }

    public static i c() {
        if(i.f == null) {
            b b0 = new b();
            i.f = new i(new e(), b0);
        }
        return i.f;
    }

    public void d() {
        com.iab.omid.library.bytedance2.internal.b.g().a(this);
        com.iab.omid.library.bytedance2.internal.b.g().e();
        TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        com.iab.omid.library.bytedance2.internal.b.g().f();
        this.d.d();
    }
}

