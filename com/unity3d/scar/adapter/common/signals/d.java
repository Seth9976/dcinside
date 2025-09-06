package com.unity3d.scar.adapter.common.signals;

public class d implements a {
    private com.unity3d.scar.adapter.common.a a;
    private g b;
    private f c;

    public d(com.unity3d.scar.adapter.common.a a0, f f0) {
        this(a0, null, f0);
    }

    public d(com.unity3d.scar.adapter.common.a a0, g g0, f f0) {
        this.a = a0;
        this.b = g0;
        this.c = f0;
    }

    @Override  // com.unity3d.scar.adapter.common.signals.a
    public void a(String s, String s1, Object object0) {
        this.c.a(s, s1);
        g g0 = this.b;
        if(g0 != null) {
            g0.b(s, object0);
        }
        this.a.b();
    }

    @Override  // com.unity3d.scar.adapter.common.signals.a
    public void onFailure(String s) {
        this.c.d(s);
        this.a.b();
    }
}

