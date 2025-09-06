package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.g;
import java.io.File;

public class e {
    static class a {
    }

    static final class b implements c {
        private b() {
        }

        b(a e$a0) {
        }

        @Override  // com.google.firebase.crashlytics.internal.metadata.c
        public byte[] a() {
            return null;
        }

        @Override  // com.google.firebase.crashlytics.internal.metadata.c
        public void b() {
        }

        @Override  // com.google.firebase.crashlytics.internal.metadata.c
        public void c(long v, String s) {
        }

        @Override  // com.google.firebase.crashlytics.internal.metadata.c
        public void d() {
        }

        @Override  // com.google.firebase.crashlytics.internal.metadata.c
        public String e() {
            return null;
        }
    }

    private final g a;
    private c b;
    private static final String c = "userlog";
    private static final b d = null;
    static final int e = 0x10000;

    static {
        e.d = new b(null);
    }

    public e(g g0) {
        this.a = g0;
        this.b = e.d;
    }

    public e(g g0, String s) {
        this(g0);
        this.e(s);
    }

    public void a() {
        this.b.b();
    }

    public byte[] b() {
        return this.b.a();
    }

    @Nullable
    public String c() {
        return this.b.e();
    }

    private File d(String s) {
        return this.a.r(s, "userlog");
    }

    public final void e(String s) {
        this.b.d();
        this.b = e.d;
        if(s == null) {
            return;
        }
        this.f(this.d(s), 0x10000);
    }

    void f(File file0, int v) {
        this.b = new h(file0, v);
    }

    public void g(long v, String s) {
        this.b.c(v, s);
    }
}

