package com.tiktok.appevents;

public final class m implements Runnable {
    public final p a;
    public final b b;

    public m(p p0, b p$b0) {
        this.a = p0;
        this.b = p$b0;
    }

    @Override
    public final void run() {
        this.a.A(this.b);
    }
}

