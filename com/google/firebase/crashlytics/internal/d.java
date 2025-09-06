package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.G;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements a {
    static class com.google.firebase.crashlytics.internal.d.a {
    }

    static final class b implements h {
        private b() {
        }

        b(com.google.firebase.crashlytics.internal.d.a d$a0) {
        }

        @Override  // com.google.firebase.crashlytics.internal.h
        public File a() {
            return null;
        }

        @Override  // com.google.firebase.crashlytics.internal.h
        public com.google.firebase.crashlytics.internal.model.F.a b() {
            return null;
        }

        @Override  // com.google.firebase.crashlytics.internal.h
        public File c() {
            return null;
        }

        @Override  // com.google.firebase.crashlytics.internal.h
        public File d() {
            return null;
        }

        @Override  // com.google.firebase.crashlytics.internal.h
        public File e() {
            return null;
        }

        @Override  // com.google.firebase.crashlytics.internal.h
        public File f() {
            return null;
        }

        @Override  // com.google.firebase.crashlytics.internal.h
        public File g() {
            return null;
        }

        @Override  // com.google.firebase.crashlytics.internal.h
        public File h() {
            return null;
        }
    }

    private final h2.a a;
    private final AtomicReference b;
    private static final h c;

    static {
        d.c = new b(null);
    }

    public d(h2.a a0) {
        this.b = new AtomicReference(null);
        this.a = a0;
        a0.a((h2.b b0) -> {
            g.f().b("Crashlytics native component now available.");
            a a0 = (a)b0.get();
            this.b.set(a0);
        });
    }

    @Override  // com.google.firebase.crashlytics.internal.a
    public void a(@NonNull String s, @NonNull String s1, long v, @NonNull G g0) {
        g.f().k("Deferring native open session: " + s);
        c c0 = (h2.b b0) -> ((a)b0.get()).a(s, s1, v, g0);
        this.a.a(c0);
    }

    @Override  // com.google.firebase.crashlytics.internal.a
    @NonNull
    public h b(@NonNull String s) {
        a a0 = (a)this.b.get();
        return a0 == null ? d.c : a0.b(s);
    }

    @Override  // com.google.firebase.crashlytics.internal.a
    public boolean c() {
        a a0 = (a)this.b.get();
        return a0 != null && a0.c();
    }

    @Override  // com.google.firebase.crashlytics.internal.a
    public boolean d(@NonNull String s) {
        a a0 = (a)this.b.get();
        return a0 != null && a0.d(s);
    }

    // 检测为 Lambda 实现
    private void g(h2.b b0) [...]

    // 检测为 Lambda 实现
    private static void h(String s, String s1, long v, G g0, h2.b b0) [...]
}

