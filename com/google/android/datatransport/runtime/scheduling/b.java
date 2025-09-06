package com.google.android.datatransport.runtime.scheduling;

import B1.b.a;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;

public final class b implements a {
    public final c a;
    public final r b;
    public final j c;

    public b(c c0, r r0, j j0) {
        this.a = c0;
        this.b = r0;
        this.c = j0;
    }

    @Override  // B1.b$a
    public final Object execute() {
        return this.a.d(this.b, this.c);
    }
}

