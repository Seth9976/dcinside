package com.iab.omid.library.vungle.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.adsession.q;
import com.iab.omid.library.vungle.utils.f;
import java.util.Date;

public class a implements com.iab.omid.library.vungle.internal.d.a {
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

    @Override  // com.iab.omid.library.vungle.internal.d$a
    public void a(boolean z) {
        if(!this.e && z) {
            this.e();
        }
        this.e = z;
    }

    public void b(@NonNull Context context0) {
        if(!this.c) {
            this.d.a(context0);
            this.d.b(this);
            this.d.i();
            this.e = this.d.g();
            this.c = true;
        }
    }

    public Date c() {
        return this.b == null ? null : ((Date)this.b.clone());
    }

    private void d() {
        if(this.c && this.b != null) {
            for(Object object0: c.e().a()) {
                ((q)object0).f().m(this.c());
            }
        }
    }

    public void e() {
        Date date0 = this.a.a();
        if(this.b == null || date0.after(this.b)) {
            this.b = date0;
            this.d();
        }
    }
}

