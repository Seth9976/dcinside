package com.vungle.ads.internal.network;

public final class h implements Runnable {
    public final j a;
    public final String b;
    public final c c;
    public final String d;
    public final boolean e;

    public h(j j0, String s, c c0, String s1, boolean z) {
        this.a = j0;
        this.b = s;
        this.c = c0;
        this.d = s1;
        this.e = z;
    }

    @Override
    public final void run() {
        j.sendGenericTpat$lambda-3(this.a, this.b, this.c, this.d, this.e);
    }
}

