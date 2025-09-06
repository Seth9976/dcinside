package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.adsession.p;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.utils.c;
import com.iab.omid.library.unity3d.utils.g;
import org.json.JSONObject;

public final class b {
    private final p a;

    private b(p p0) {
        this.a = p0;
    }

    public void a(a a0) {
        g.d(a0, "InteractionType is null");
        g.c(this.a);
        JSONObject jSONObject0 = new JSONObject();
        c.i(jSONObject0, "interactionType", a0);
        this.a.f().l("adUserInteraction", jSONObject0);
    }

    public void b() {
        g.c(this.a);
        this.a.f().j("bufferFinish");
    }

    public void c() {
        g.c(this.a);
        this.a.f().j("bufferStart");
    }

    public void d() {
        g.c(this.a);
        this.a.f().j("complete");
    }

    private void e(float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void f(float f) {
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static b g(com.iab.omid.library.unity3d.adsession.b b0) {
        g.d(b0, "AdSession is null");
        g.k(((p)b0));
        g.h(((p)b0));
        g.g(((p)b0));
        g.m(((p)b0));
        b b1 = new b(((p)b0));
        ((p)b0).f().i(b1);
        return b1;
    }

    public void h() {
        g.c(this.a);
        this.a.f().j("firstQuartile");
    }

    public void i() {
        g.c(this.a);
        this.a.f().j("midpoint");
    }

    public void j() {
        g.c(this.a);
        this.a.f().j("pause");
    }

    public void k(com.iab.omid.library.unity3d.adsession.media.c c0) {
        g.d(c0, "PlayerState is null");
        g.c(this.a);
        JSONObject jSONObject0 = new JSONObject();
        c.i(jSONObject0, "state", c0);
        this.a.f().l("playerStateChange", jSONObject0);
    }

    public void l() {
        g.c(this.a);
        this.a.f().j("resume");
    }

    public void m() {
        g.c(this.a);
        this.a.f().j("skipped");
    }

    public void n(float f, float f1) {
        this.e(f);
        this.f(f1);
        g.c(this.a);
        JSONObject jSONObject0 = new JSONObject();
        c.i(jSONObject0, "duration", f);
        c.i(jSONObject0, "mediaPlayerVolume", f1);
        c.i(jSONObject0, "deviceVolume", h.d().c());
        this.a.f().l("start", jSONObject0);
    }

    public void o() {
        g.c(this.a);
        this.a.f().j("thirdQuartile");
    }

    public void p(float f) {
        this.f(f);
        g.c(this.a);
        JSONObject jSONObject0 = new JSONObject();
        c.i(jSONObject0, "mediaPlayerVolume", f);
        c.i(jSONObject0, "deviceVolume", h.d().c());
        this.a.f().l("volumeChange", jSONObject0);
    }
}

