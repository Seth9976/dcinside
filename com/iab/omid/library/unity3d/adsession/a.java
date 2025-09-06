package com.iab.omid.library.unity3d.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.media.e;
import com.iab.omid.library.unity3d.utils.g;
import org.json.JSONObject;

public final class a {
    private final p a;

    private a(p p0) {
        this.a = p0;
    }

    public static a a(b b0) {
        g.d(b0, "AdSession is null");
        g.l(((p)b0));
        g.g(((p)b0));
        a a0 = new a(((p)b0));
        ((p)b0).f().d(a0);
        return a0;
    }

    public void b() {
        g.g(this.a);
        g.j(this.a);
        if(!this.a.x()) {
            try {
                this.a.k();
            }
            catch(Exception unused_ex) {
            }
        }
        if(this.a.x()) {
            this.a.C();
        }
    }

    public void c() {
        g.c(this.a);
        g.j(this.a);
        this.a.D();
    }

    public void d(@NonNull e e0) {
        g.d(e0, "VastProperties is null");
        g.c(this.a);
        g.j(this.a);
        JSONObject jSONObject0 = e0.a();
        this.a.p(jSONObject0);
    }
}

