package com.vungle.ads.internal.network;

public final class i implements Runnable {
    public final j a;
    public final String b;
    public final String c;

    public i(j j0, String s, String s1) {
        this.a = j0;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final void run() {
        j.sendTpat$lambda-2(this.a, this.b, this.c);
    }
}

