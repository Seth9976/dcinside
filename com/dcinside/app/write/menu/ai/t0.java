package com.dcinside.app.write.menu.ai;

public final class t0 implements Runnable {
    public final u0 a;
    public final boolean b;

    public t0(u0 u00, boolean z) {
        this.a = u00;
        this.b = z;
    }

    @Override
    public final void run() {
        u0.j(this.a, this.b);
    }
}

