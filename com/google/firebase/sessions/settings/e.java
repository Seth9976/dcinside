package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class e {
    @m
    private final Boolean a;
    @m
    private final Double b;
    @m
    private final Integer c;
    @m
    private final Integer d;
    @m
    private final Long e;

    public e(@m Boolean boolean0, @m Double double0, @m Integer integer0, @m Integer integer1, @m Long long0) {
        this.a = boolean0;
        this.b = double0;
        this.c = integer0;
        this.d = integer1;
        this.e = long0;
    }

    @m
    public final Boolean a() {
        return this.a;
    }

    @m
    public final Double b() {
        return this.b;
    }

    @m
    public final Integer c() {
        return this.c;
    }

    @m
    public final Integer d() {
        return this.d;
    }

    @m
    public final Long e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!L.g(this.a, ((e)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((e)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((e)object0).c)) {
            return false;
        }
        return L.g(this.d, ((e)object0).d) ? L.g(this.e, ((e)object0).e) : false;
    }

    @l
    public final e f(@m Boolean boolean0, @m Double double0, @m Integer integer0, @m Integer integer1, @m Long long0) {
        return new e(boolean0, double0, integer0, integer1, long0);
    }

    public static e g(e e0, Boolean boolean0, Double double0, Integer integer0, Integer integer1, Long long0, int v, Object object0) {
        if((v & 1) != 0) {
            boolean0 = e0.a;
        }
        if((v & 2) != 0) {
            double0 = e0.b;
        }
        if((v & 4) != 0) {
            integer0 = e0.c;
        }
        if((v & 8) != 0) {
            integer1 = e0.d;
        }
        if((v & 16) != 0) {
            long0 = e0.e;
        }
        return e0.f(boolean0, double0, integer0, integer1, long0);
    }

    @m
    public final Integer h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        Long long0 = this.e;
        if(long0 != null) {
            v = long0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @m
    public final Long i() {
        return this.e;
    }

    @m
    public final Boolean j() {
        return this.a;
    }

    @m
    public final Integer k() {
        return this.c;
    }

    @m
    public final Double l() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionRestartTimeout=" + this.c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.e + ')';
    }
}

