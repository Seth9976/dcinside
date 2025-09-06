package com.iab.omid.library.vungle.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.adsession.media.e;
import com.iab.omid.library.vungle.utils.g;
import org.json.JSONObject;

public final class a {
    private final q a;

    private a(q q0) {
        this.a = q0;
    }

    public static a a(b b0) {
        g.d(b0, "AdSession is null");
        g.l(((q)b0));
        g.g(((q)b0));
        a a0 = new a(((q)b0));
        ((q)b0).f().d(a0);
        return a0;
    }

    public void b() {
        g.g(this.a);
        g.j(this.a);
        if(!this.a.u()) {
            try {
                this.a.k();
            }
            catch(Exception unused_ex) {
            }
        }
        if(this.a.u()) {
            this.a.z();
        }
    }

    public void c() {
        g.c(this.a);
        g.j(this.a);
        this.a.A();
    }

    public void d(@NonNull e e0) {
        g.d(e0, "VastProperties is null");
        g.c(this.a);
        g.j(this.a);
        JSONObject jSONObject0 = e0.a();
        this.a.o(jSONObject0);
    }
}

