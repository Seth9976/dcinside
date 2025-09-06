package com.google.android.datatransport.runtime;

import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import com.google.android.datatransport.k;
import com.google.android.datatransport.l;
import com.google.android.datatransport.n;

final class u implements l {
    private final r a;
    private final String b;
    private final e c;
    private final k d;
    private final v e;

    u(r r0, String s, e e0, k k0, v v0) {
        this.a = r0;
        this.b = s;
        this.c = e0;
        this.d = k0;
        this.e = v0;
    }

    @Override  // com.google.android.datatransport.l
    public void a(f f0, n n0) {
        q q0 = q.a().f(this.a).c(f0).g(this.b).e(this.d).b(this.c).a();
        this.e.a(q0, n0);
    }

    @Override  // com.google.android.datatransport.l
    public void b(f f0) {
        this.a(f0, new t());
    }

    public static void c(Exception exception0) {
    }

    r d() {
        return this.a;
    }

    private static void e(Exception exception0) {
    }
}

