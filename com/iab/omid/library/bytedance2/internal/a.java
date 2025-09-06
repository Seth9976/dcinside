package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Date;

public class a implements com.iab.omid.library.bytedance2.internal.d.a {
    protected f a;
    private Date b;
    private boolean c;
    private d d;
    private boolean e;
    private static a f;

    static {
        a.f = new a(new d());
    }

    private a(d d0) {
        this.a = new f();
        this.d = d0;
    }

    public static a a() {
        return a.f;
    }

    public void a(@NonNull Context context0) {
        if(!this.c) {
            this.d.a(context0);
            this.d.a(this);
            this.d.e();
            this.e = this.d.c();
            this.c = true;
        }
    }

    @Override  // com.iab.omid.library.bytedance2.internal.d$a
    public void a(boolean z) {
        if(!this.e && z) {
            this.d();
        }
        this.e = z;
    }

    public Date b() {
        return this.b == null ? null : ((Date)this.b.clone());
    }

    private void c() {
        if(this.c && this.b != null) {
            for(Object object0: c.c().a()) {
                ((com.iab.omid.library.bytedance2.adsession.a)object0).getAdSessionStatePublisher().a(this.b());
            }
        }
    }

    public void d() {
        Date date0 = this.a.a();
        if(this.b == null || date0.after(this.b)) {
            this.b = date0;
            this.c();
        }
    }
}

