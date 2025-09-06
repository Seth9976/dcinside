package j$.time.temporal;

import j..time.chrono.b;
import j..time.chrono.h;
import j..time.chrono.l;
import j..time.format.E;
import java.util.HashMap;

final class u implements q {
    private final String a;
    private final v b;
    private final Enum c;
    private final Enum d;
    private final t e;
    private static final t f;
    private static final t g;
    private static final t h;
    private static final t i;

    static {
        u.f = t.j(1L, 7L);
        u.g = t.k(0L, 4L, 6L);
        u.h = t.k(0L, 52L, 54L);
        u.i = t.k(1L, 52L, 53L);
    }

    private u(String s, v v0, r r0, r r1, t t0) {
        this.a = s;
        this.b = v0;
        this.c = (Enum)r0;
        this.d = (Enum)r1;
        this.e = t0;
    }

    private static int a(int v, int v1) [...] // Inlined contents

    private int b(TemporalAccessor temporalAccessor0) {
        int v = this.b.e().getValue();
        return m.h(temporalAccessor0.n(a.DAY_OF_WEEK) - v) + 1;
    }

    private int c(TemporalAccessor temporalAccessor0) {
        int v = this.b(temporalAccessor0);
        int v1 = temporalAccessor0.n(a.YEAR);
        a a0 = a.DAY_OF_YEAR;
        int v2 = temporalAccessor0.n(a0);
        int v3 = this.m(v2, v);
        int v4 = (v3 + v2 + 6) / 7;
        if(v4 == 0) {
            return v1 - 1;
        }
        t t0 = temporalAccessor0.q(a0);
        return v4 < u.a(v3, this.b.f() + ((int)t0.d())) ? v1 : v1 + 1;
    }

    private int d(TemporalAccessor temporalAccessor0) {
        int v = this.b(temporalAccessor0);
        a a0 = a.DAY_OF_YEAR;
        int v1 = temporalAccessor0.n(a0);
        int v2 = this.m(v1, v);
        int v3 = (v2 + v1 + 6) / 7;
        if(v3 == 0) {
            return this.d(h.p(temporalAccessor0).o(temporalAccessor0).J(((long)v1), ChronoUnit.DAYS));
        }
        if(v3 > 50) {
            t t0 = temporalAccessor0.q(a0);
            int v4 = u.a(v2, this.b.f() + ((int)t0.d()));
            return v3 < v4 ? v3 : v3 - v4 + 1;
        }
        return v3;
    }

    static u e(v v0) {
        return new u("DayOfWeek", v0, ChronoUnit.DAYS, ChronoUnit.WEEKS, u.f);
    }

    private b f(l l0, int v, int v1, int v2) {
        b b0 = l0.D(v, 1, 1);
        int v3 = this.m(1, this.b(b0));
        int v4 = b0.L();
        return b0.d(((long)((Math.min(v1, u.a(v3, this.b.f() + v4) - 1) - 1) * 7 + (v2 - 1 - v3))), ChronoUnit.DAYS);
    }

    static u g(v v0) {
        return new u("WeekBasedYear", v0, i.d, ChronoUnit.FOREVER, a.YEAR.l());
    }

    static u h(v v0) {
        return new u("WeekOfMonth", v0, ChronoUnit.WEEKS, ChronoUnit.MONTHS, u.g);
    }

    static u i(v v0) {
        return new u("WeekOfWeekBasedYear", v0, ChronoUnit.WEEKS, i.d, u.i);
    }

    private t j(TemporalAccessor temporalAccessor0, a a0) {
        int v = this.b(temporalAccessor0);
        int v1 = this.m(temporalAccessor0.n(a0), v);
        t t0 = temporalAccessor0.q(a0);
        return t.j(u.a(v1, ((int)t0.e())), u.a(v1, ((int)t0.d())));
    }

    private t k(TemporalAccessor temporalAccessor0) {
        a a0 = a.DAY_OF_YEAR;
        if(!temporalAccessor0.e(a0)) {
            return u.h;
        }
        int v = this.b(temporalAccessor0);
        int v1 = temporalAccessor0.n(a0);
        int v2 = this.m(v1, v);
        int v3 = (v2 + v1 + 6) / 7;
        if(v3 == 0) {
            return this.k(h.p(temporalAccessor0).o(temporalAccessor0).J(((long)(v1 + 7)), ChronoUnit.DAYS));
        }
        int v4 = (int)temporalAccessor0.q(a0).d();
        int v5 = u.a(v2, this.b.f() + v4);
        return v3 < v5 ? t.j(1L, v5 - 1) : this.k(h.p(temporalAccessor0).o(temporalAccessor0).d(((long)(v4 - v1 + 8)), ChronoUnit.DAYS));
    }

    @Override  // j$.time.temporal.q
    public final t l() {
        return this.e;
    }

    private int m(int v, int v1) {
        int v2 = m.h(v - v1);
        return v2 + 1 <= this.b.f() ? -v2 : 7 - v2;
    }

    @Override  // j$.time.temporal.q
    public final TemporalAccessor n(HashMap hashMap0, TemporalAccessor temporalAccessor0, E e0) {
        a a3;
        TemporalAccessor temporalAccessor1;
        long v = (long)(((Long)hashMap0.get(this)));
        int v1 = j..com.android.tools.r8.a.h(v);
        ChronoUnit chronoUnit0 = ChronoUnit.WEEKS;
        Enum enum0 = this.d;
        t t0 = this.e;
        v v2 = this.b;
        if(enum0 == chronoUnit0) {
            int v3 = m.h(t0.a(v, this) - 1 + (v2.e().getValue() - 1));
            hashMap0.remove(this);
            hashMap0.put(a.DAY_OF_WEEK, ((long)(v3 + 1)));
            return null;
        }
        a a0 = a.DAY_OF_WEEK;
        if(hashMap0.containsKey(a0)) {
            int v4 = m.h(a0.Q(((long)(((Long)hashMap0.get(a0))))) - v2.e().getValue());
            l l0 = h.p(temporalAccessor0);
            a a1 = a.YEAR;
            if(hashMap0.containsKey(a1)) {
                int v5 = a1.Q(((long)(((Long)hashMap0.get(a1)))));
                ChronoUnit chronoUnit1 = ChronoUnit.MONTHS;
                if(enum0 == chronoUnit1) {
                    a a2 = a.MONTH_OF_YEAR;
                    if(hashMap0.containsKey(a2)) {
                        long v6 = (long)(((Long)hashMap0.get(a2)));
                        if(e0 == E.LENIENT) {
                            b b0 = l0.D(v5, 1, 1).d(j..com.android.tools.r8.a.p(v6, 1L), chronoUnit1);
                            int v7 = this.b(b0);
                            int v8 = b0.n(a.DAY_OF_MONTH);
                            long v9 = j..com.android.tools.r8.a.p(v1, u.a(this.m(v8, v7), v8));
                            int v10 = this.b(b0);
                            temporalAccessor1 = b0.d(j..com.android.tools.r8.a.i(j..com.android.tools.r8.a.o(v9, 7L), v4 + 1 - v10), ChronoUnit.DAYS);
                            a3 = a2;
                        }
                        else {
                            a3 = a2;
                            b b1 = l0.D(v5, a3.Q(v6), 1);
                            long v11 = (long)t0.a(((long)v1), this);
                            int v12 = this.b(b1);
                            int v13 = b1.n(a.DAY_OF_MONTH);
                            b b2 = b1.d(((long)(((int)(v11 - ((long)u.a(this.m(v13, v12), v13)))) * 7 + (v4 + 1 - this.b(b1)))), ChronoUnit.DAYS);
                            if(e0 == E.STRICT && b2.u(a3) != v6) {
                                throw new j..time.b("Strict mode rejected resolved date as it is in a different month");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                            }
                            temporalAccessor1 = b2;
                        }
                        hashMap0.remove(this);
                        hashMap0.remove(a1);
                        hashMap0.remove(a3);
                        hashMap0.remove(a0);
                        return temporalAccessor1;
                    }
                }
                if(enum0 == ChronoUnit.YEARS) {
                    b b3 = l0.D(v5, 1, 1);
                    if(e0 == E.LENIENT) {
                        int v14 = this.b(b3);
                        int v15 = b3.n(a.DAY_OF_YEAR);
                        long v16 = j..com.android.tools.r8.a.p(v1, u.a(this.m(v15, v14), v15));
                        int v17 = this.b(b3);
                        temporalAccessor1 = b3.d(j..com.android.tools.r8.a.i(j..com.android.tools.r8.a.o(v16, 7L), v4 + 1 - v17), ChronoUnit.DAYS);
                    }
                    else {
                        long v18 = (long)t0.a(((long)v1), this);
                        int v19 = this.b(b3);
                        int v20 = b3.n(a.DAY_OF_YEAR);
                        b b4 = b3.d(((long)(((int)(v18 - ((long)u.a(this.m(v20, v19), v20)))) * 7 + (v4 + 1 - this.b(b3)))), ChronoUnit.DAYS);
                        if(e0 == E.STRICT && b4.u(a1) != ((long)v5)) {
                            throw new j..time.b("Strict mode rejected resolved date as it is in a different year");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        temporalAccessor1 = b4;
                    }
                    hashMap0.remove(this);
                    hashMap0.remove(a1);
                    hashMap0.remove(a0);
                    return temporalAccessor1;
                }
            }
            else if((enum0 == v.h || enum0 == ChronoUnit.FOREVER) && hashMap0.containsKey(v2.f) && hashMap0.containsKey(v2.e)) {
                int v21 = ((u)v2.f).e.a(((long)(((Long)hashMap0.get(v2.f)))), v2.f);
                if(e0 == E.LENIENT) {
                    temporalAccessor1 = this.f(l0, v21, 1, v4 + 1).d(j..com.android.tools.r8.a.p(((long)(((Long)hashMap0.get(v2.e)))), 1L), chronoUnit0);
                }
                else {
                    b b5 = this.f(l0, v21, ((u)v2.e).e.a(((long)(((Long)hashMap0.get(v2.e)))), v2.e), v4 + 1);
                    if(e0 == E.STRICT && this.c(b5) != v21) {
                        throw new j..time.b("Strict mode rejected resolved date as it is in a different week-based-year");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                    temporalAccessor1 = b5;
                }
                hashMap0.remove(this);
                hashMap0.remove(v2.f);
                hashMap0.remove(v2.e);
                hashMap0.remove(a0);
                return temporalAccessor1;
            }
        }
        return null;
    }

    @Override  // j$.time.temporal.q
    public final long p(TemporalAccessor temporalAccessor0) {
        Enum enum0 = this.d;
        if(enum0 == ChronoUnit.WEEKS) {
            return (long)this.b(temporalAccessor0);
        }
        if(enum0 == ChronoUnit.MONTHS) {
            int v = this.b(temporalAccessor0);
            int v1 = temporalAccessor0.n(a.DAY_OF_MONTH);
            return (long)u.a(this.m(v1, v), v1);
        }
        if(enum0 == ChronoUnit.YEARS) {
            int v2 = this.b(temporalAccessor0);
            int v3 = temporalAccessor0.n(a.DAY_OF_YEAR);
            return (long)u.a(this.m(v3, v2), v3);
        }
        if(enum0 == v.h) {
            return (long)this.d(temporalAccessor0);
        }
        if(enum0 != ChronoUnit.FOREVER) {
            throw new IllegalStateException("unreachable, rangeUnit: " + enum0 + ", this: " + this);
        }
        return (long)this.c(temporalAccessor0);
    }

    @Override  // j$.time.temporal.q
    public final boolean q(TemporalAccessor temporalAccessor0) {
        if(temporalAccessor0.e(a.DAY_OF_WEEK)) {
            Enum enum0 = this.d;
            if(enum0 == ChronoUnit.WEEKS) {
                return true;
            }
            if(enum0 == ChronoUnit.MONTHS) {
                return temporalAccessor0.e(a.DAY_OF_MONTH);
            }
            if(enum0 == ChronoUnit.YEARS) {
                return temporalAccessor0.e(a.DAY_OF_YEAR);
            }
            if(enum0 == v.h) {
                return temporalAccessor0.e(a.DAY_OF_YEAR);
            }
            return enum0 == ChronoUnit.FOREVER ? temporalAccessor0.e(a.YEAR) : false;
        }
        return false;
    }

    @Override
    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override  // j$.time.temporal.q
    public final j..time.temporal.l u(j..time.temporal.l l0, long v) {
        int v1 = this.e.a(v, this);
        int v2 = l0.n(this);
        if(v1 == v2) {
            return l0;
        }
        if(this.d == ChronoUnit.FOREVER) {
            int v3 = l0.n(this.b.c);
            int v4 = l0.n(this.b.e);
            return this.f(h.p(l0), ((int)v), v4, v3);
        }
        return l0.d(((long)(v1 - v2)), ((r)this.c));
    }

    @Override  // j$.time.temporal.q
    public final t y(TemporalAccessor temporalAccessor0) {
        Enum enum0 = this.d;
        if(enum0 == ChronoUnit.WEEKS) {
            return this.e;
        }
        if(enum0 == ChronoUnit.MONTHS) {
            return this.j(temporalAccessor0, a.DAY_OF_MONTH);
        }
        if(enum0 == ChronoUnit.YEARS) {
            return this.j(temporalAccessor0, a.DAY_OF_YEAR);
        }
        if(enum0 == v.h) {
            return this.k(temporalAccessor0);
        }
        if(enum0 != ChronoUnit.FOREVER) {
            throw new IllegalStateException("unreachable, rangeUnit: " + enum0 + ", this: " + this);
        }
        return a.YEAR.l();
    }

    @Override  // j$.time.temporal.q
    public final boolean z() {
        return true;
    }
}

