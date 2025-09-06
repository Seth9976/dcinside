package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.n;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;

public final class a implements Runnable {
    public final c a;
    public final r b;
    public final n c;
    public final j d;

    public a(c c0, r r0, n n0, j j0) {
        this.a = c0;
        this.b = r0;
        this.c = n0;
        this.d = j0;
    }

    @Override
    public final void run() {
        this.a.e(this.b, this.c, this.d);
    }
}

