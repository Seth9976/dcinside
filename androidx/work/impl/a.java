package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;

public final class a implements Runnable {
    public final Processor a;
    public final WorkGenerationalId b;
    public final boolean c;

    public a(Processor processor0, WorkGenerationalId workGenerationalId0, boolean z) {
        this.a = processor0;
        this.b = workGenerationalId0;
        this.c = z;
    }

    @Override
    public final void run() {
        this.a.m(this.b, this.c);
    }
}

