package com.vungle.ads.internal.session;

public final class c implements Runnable {
    public final d a;
    public final String b;

    public c(d d0, String s) {
        this.a = d0;
        this.b = s;
    }

    @Override
    public final void run() {
        d.writeUnclosedAdToFile$lambda-3(this.a, this.b);
    }
}

