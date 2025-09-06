package com.vungle.ads.internal.network;

public final class g implements Runnable {
    public final j a;
    public final String b;

    public g(j j0, String s) {
        this.a = j0;
        this.b = s;
    }

    @Override
    public final void run() {
        j.sendWinNotification$lambda-0(this.a, this.b);
    }
}

