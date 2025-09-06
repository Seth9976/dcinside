package com.google.firebase.sessions;

import androidx.compose.animation.core.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class f {
    @l
    private final e a;
    @l
    private final e b;
    private final double c;

    public f() {
        this(null, null, 0.0, 7, null);
    }

    public f(@l e e0, @l e e1, double f) {
        L.p(e0, "performance");
        L.p(e1, "crashlytics");
        super();
        this.a = e0;
        this.b = e1;
        this.c = f;
    }

    public f(e e0, e e1, double f, int v, w w0) {
        if((v & 1) != 0) {
            e0 = e.c;
        }
        if((v & 2) != 0) {
            e1 = e.c;
        }
        if((v & 4) != 0) {
            f = 1.0;
        }
        this(e0, e1, f);
    }

    @l
    public final e a() {
        return this.a;
    }

    @l
    public final e b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    @l
    public final f d(@l e e0, @l e e1, double f) {
        L.p(e0, "performance");
        L.p(e1, "crashlytics");
        return new f(e0, e1, f);
    }

    public static f e(f f0, e e0, e e1, double f1, int v, Object object0) {
        if((v & 1) != 0) {
            e0 = f0.a;
        }
        if((v & 2) != 0) {
            e1 = f0.b;
        }
        if((v & 4) != 0) {
            f1 = f0.c;
        }
        return f0.d(e0, e1, f1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        if(this.a != ((f)object0).a) {
            return false;
        }
        return this.b == ((f)object0).b ? Double.compare(this.c, ((f)object0).c) == 0 : false;
    }

    @l
    public final e f() {
        return this.b;
    }

    @l
    public final e g() {
        return this.a;
    }

    public final double h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + b.a(this.c);
    }

    @Override
    @l
    public String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}

