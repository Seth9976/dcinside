package j$.time.temporal;

import j..time.LocalDate;
import j..time.b;
import j..time.chrono.h;
import j..time.chrono.s;
import j..time.d;
import j..time.format.E;
import java.util.HashMap;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
abstract class g extends Enum implements q {
    public static final enum g DAY_OF_QUARTER;
    public static final enum g QUARTER_OF_YEAR;
    public static final enum g WEEK_BASED_YEAR;
    public static final enum g WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final g[] b;

    static {
        j..time.temporal.g.c c0 = new g() {
            @Override  // j$.time.temporal.q
            public final t l() {
                return t.k(1L, 90L, 92L);
            }

            @Override  // j$.time.temporal.g
            public final TemporalAccessor n(HashMap hashMap0, TemporalAccessor temporalAccessor0, E e0) {
                long v2;
                LocalDate localDate0;
                a a0 = a.YEAR;
                Long long0 = (Long)hashMap0.get(a0);
                g g0 = g.QUARTER_OF_YEAR;
                Long long1 = (Long)hashMap0.get(g0);
                if(long0 != null && long1 != null) {
                    int v = a0.Q(((long)long0));
                    long v1 = (long)(((Long)hashMap0.get(g.DAY_OF_QUARTER)));
                    if(!h.p(temporalAccessor0).equals(s.d)) {
                        throw new b("Resolve requires IsoChronology");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                    if(e0 == E.LENIENT) {
                        localDate0 = LocalDate.c0(v, 1, 1).h0(j..com.android.tools.r8.a.o(j..com.android.tools.r8.a.p(((long)long1), 1L), 3L));
                        v2 = j..com.android.tools.r8.a.p(v1, 1L);
                    }
                    else {
                        LocalDate localDate1 = LocalDate.c0(v, (g0.l().a(((long)long1), g0) - 1) * 3 + 1, 1);
                        if(v1 < 1L || v1 > 90L) {
                            if(e0 == E.STRICT) {
                                this.y(localDate1).b(v1, this);
                            }
                            else {
                                this.l().b(v1, this);
                            }
                        }
                        v2 = v1 - 1L;
                        localDate0 = localDate1;
                    }
                    hashMap0.remove(this);
                    hashMap0.remove(a0);
                    hashMap0.remove(g0);
                    return localDate0.g0(v2);
                }
                return null;
            }

            @Override  // j$.time.temporal.q
            public final long p(TemporalAccessor temporalAccessor0) {
                if(!this.q(temporalAccessor0)) {
                    throw new j..time.temporal.s("Unsupported field: DayOfQuarter");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                int v = temporalAccessor0.n(a.DAY_OF_YEAR);
                int v1 = temporalAccessor0.n(a.MONTH_OF_YEAR);
                long v2 = temporalAccessor0.u(a.YEAR);
                int[] arr_v = g.a;
                return s.d.N(v2) ? ((long)(v - arr_v[(v1 - 1) / 3 + 4])) : ((long)(v - arr_v[(v1 - 1) / 3]));
            }

            // 去混淆评级： 低(40)
            @Override  // j$.time.temporal.q
            public final boolean q(TemporalAccessor temporalAccessor0) {
                return temporalAccessor0.e(a.DAY_OF_YEAR) && temporalAccessor0.e(a.MONTH_OF_YEAR) && temporalAccessor0.e(a.YEAR) && h.p(temporalAccessor0).equals(s.d);
            }

            @Override
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override  // j$.time.temporal.q
            public final l u(l l0, long v) {
                long v1 = this.p(l0);
                this.l().b(v, this);
                return l0.c(v - v1 + l0.u(a.DAY_OF_YEAR), a.DAY_OF_YEAR);
            }

            @Override  // j$.time.temporal.q
            public final t y(TemporalAccessor temporalAccessor0) {
                if(!this.q(temporalAccessor0)) {
                    throw new j..time.temporal.s("Unsupported field: DayOfQuarter");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                long v = temporalAccessor0.u(g.QUARTER_OF_YEAR);
                if(v == 1L) {
                    long v1 = temporalAccessor0.u(a.YEAR);
                    return s.d.N(v1) ? t.j(1L, 91L) : t.j(1L, 90L);
                }
                if(v == 2L) {
                    return t.j(1L, 91L);
                }
                return v == 3L || v == 4L ? t.j(1L, 92L) : this.l();
            }
        };
        g.DAY_OF_QUARTER = c0;
        j..time.temporal.g.d d0 = new g() {
            @Override  // j$.time.temporal.q
            public final t l() {
                return t.j(1L, 4L);
            }

            @Override  // j$.time.temporal.q
            public final long p(TemporalAccessor temporalAccessor0) {
                if(!this.q(temporalAccessor0)) {
                    throw new j..time.temporal.s("Unsupported field: QuarterOfYear");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return (temporalAccessor0.u(a.MONTH_OF_YEAR) + 2L) / 3L;
            }

            // 去混淆评级： 低(20)
            @Override  // j$.time.temporal.q
            public final boolean q(TemporalAccessor temporalAccessor0) {
                return temporalAccessor0.e(a.MONTH_OF_YEAR) && h.p(temporalAccessor0).equals(s.d);
            }

            @Override
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override  // j$.time.temporal.q
            public final l u(l l0, long v) {
                long v1 = this.p(l0);
                this.l().b(v, this);
                return l0.c((v - v1) * 3L + l0.u(a.MONTH_OF_YEAR), a.MONTH_OF_YEAR);
            }

            @Override  // j$.time.temporal.q
            public final t y(TemporalAccessor temporalAccessor0) {
                if(!this.q(temporalAccessor0)) {
                    throw new j..time.temporal.s("Unsupported field: QuarterOfYear");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return this.l();
            }
        };
        g.QUARTER_OF_YEAR = d0;
        j..time.temporal.g.e e0 = new g() {
            @Override  // j$.time.temporal.q
            public final t l() {
                return t.k(1L, 52L, 53L);
            }

            @Override  // j$.time.temporal.g
            public final TemporalAccessor n(HashMap hashMap0, TemporalAccessor temporalAccessor0, E e0) {
                TemporalAccessor temporalAccessor1;
                g g0 = g.WEEK_BASED_YEAR;
                Long long0 = (Long)hashMap0.get(g0);
                a a0 = a.DAY_OF_WEEK;
                Long long1 = (Long)hashMap0.get(a0);
                if(long0 != null && long1 != null) {
                    int v = g0.l().a(((long)long0), g0);
                    long v1 = (long)(((Long)hashMap0.get(g.WEEK_OF_WEEK_BASED_YEAR)));
                    if(!h.p(temporalAccessor0).equals(s.d)) {
                        throw new b("Resolve requires IsoChronology");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                    LocalDate localDate0 = LocalDate.c0(v, 1, 4);
                    if(e0 == E.LENIENT) {
                        long v2 = (long)long1;
                        if(v2 > 7L) {
                            localDate0 = localDate0.i0((v2 - 1L) / 7L);
                            v2 = (v2 - 1L) % 7L + 1L;
                        }
                        else if(v2 < 1L) {
                            localDate0 = localDate0.i0(j..com.android.tools.r8.a.p(v2, 7L) / 7L);
                            v2 = (v2 + 6L) % 7L + 1L;
                        }
                        temporalAccessor1 = localDate0.i0(j..com.android.tools.r8.a.p(v1, 1L)).l0(v2, a0);
                    }
                    else {
                        int v3 = a0.Q(((long)long1));
                        if(v1 < 1L || v1 > 52L) {
                            if(e0 == E.STRICT) {
                                g.U(localDate0).b(v1, this);
                            }
                            else {
                                this.l().b(v1, this);
                            }
                        }
                        temporalAccessor1 = localDate0.i0(v1 - 1L).l0(((long)v3), a0);
                    }
                    hashMap0.remove(this);
                    hashMap0.remove(g0);
                    hashMap0.remove(a0);
                    return temporalAccessor1;
                }
                return null;
            }

            @Override  // j$.time.temporal.q
            public final long p(TemporalAccessor temporalAccessor0) {
                if(!this.q(temporalAccessor0)) {
                    throw new j..time.temporal.s("Unsupported field: WeekOfWeekBasedYear");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return (long)g.R(LocalDate.S(temporalAccessor0));
            }

            // 去混淆评级： 低(20)
            @Override  // j$.time.temporal.q
            public final boolean q(TemporalAccessor temporalAccessor0) {
                return temporalAccessor0.e(a.EPOCH_DAY) && h.p(temporalAccessor0).equals(s.d);
            }

            @Override
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override  // j$.time.temporal.q
            public final l u(l l0, long v) {
                this.l().b(v, this);
                return l0.d(j..com.android.tools.r8.a.p(v, this.p(l0)), ChronoUnit.WEEKS);
            }

            @Override  // j$.time.temporal.q
            public final t y(TemporalAccessor temporalAccessor0) {
                if(!this.q(temporalAccessor0)) {
                    throw new j..time.temporal.s("Unsupported field: WeekOfWeekBasedYear");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return g.U(LocalDate.S(temporalAccessor0));
            }
        };
        g.WEEK_OF_WEEK_BASED_YEAR = e0;
        j..time.temporal.g.f f0 = new g() {
            @Override  // j$.time.temporal.q
            public final t l() {
                return a.YEAR.l();
            }

            @Override  // j$.time.temporal.q
            public final long p(TemporalAccessor temporalAccessor0) {
                if(!this.q(temporalAccessor0)) {
                    throw new j..time.temporal.s("Unsupported field: WeekBasedYear");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return (long)g.V(LocalDate.S(temporalAccessor0));
            }

            // 去混淆评级： 低(20)
            @Override  // j$.time.temporal.q
            public final boolean q(TemporalAccessor temporalAccessor0) {
                return temporalAccessor0.e(a.EPOCH_DAY) && h.p(temporalAccessor0).equals(s.d);
            }

            @Override
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override  // j$.time.temporal.q
            public final l u(l l0, long v) {
                if(!this.q(l0)) {
                    throw new j..time.temporal.s("Unsupported field: WeekBasedYear");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                int v1 = a.YEAR.l().a(v, g.WEEK_BASED_YEAR);
                LocalDate localDate0 = LocalDate.S(l0);
                a a0 = a.DAY_OF_WEEK;
                int v2 = localDate0.n(a0);
                int v3 = g.R(localDate0);
                if(v3 == 53 && g.W(v1) == 52) {
                    v3 = 52;
                }
                LocalDate localDate1 = LocalDate.c0(v1, 1, 4);
                return l0.p(localDate1.g0(((long)((v3 - 1) * 7 + (v2 - localDate1.n(a0))))));
            }

            @Override  // j$.time.temporal.q
            public final t y(TemporalAccessor temporalAccessor0) {
                if(!this.q(temporalAccessor0)) {
                    throw new j..time.temporal.s("Unsupported field: WeekBasedYear");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return this.l();
            }
        };
        g.WEEK_BASED_YEAR = f0;
        g.b = new g[]{c0, d0, e0, f0};
        g.a = new int[]{0, 90, 0xB5, 273, 0, 91, 0xB6, 274};
    }

    static int R(LocalDate localDate0) {
        int v = localDate0.U().ordinal();
        int v1 = localDate0.V();
        int v2 = v1 - v + 2;
        int v3 = v2 - v2 / 7 * 7;
        int v4 = v3 - 3 >= -3 ? v3 - 3 : v3 + 4;
        if(v1 - 1 < v4) {
            return (int)t.j(1L, g.W(g.V(localDate0.n0(180).j0(-1L)))).d();
        }
        int v5 = (v1 - 1 - v4) / 7 + 1;
        return v5 == 53 && v4 != -3 && (v4 != -2 || !localDate0.F()) ? 1 : v5;
    }

    static t U(LocalDate localDate0) {
        return t.j(1L, g.W(g.V(localDate0)));
    }

    private static int V(LocalDate localDate0) {
        int v = localDate0.X();
        int v1 = localDate0.V();
        if(v1 <= 3) {
            return v1 - localDate0.U().ordinal() >= -2 ? v : v - 1;
        }
        if(v1 >= 363) {
            int v2 = localDate0.U().ordinal();
            return v1 - 363 - localDate0.F() - v2 < 0 ? v : v + 1;
        }
        return v;
    }

    private static int W(int v) {
        LocalDate localDate0 = LocalDate.c0(v, 1, 1);
        return localDate0.U() == d.THURSDAY || localDate0.U() == d.WEDNESDAY && localDate0.F() ? 53 : 52;
    }

    @Override  // j$.time.temporal.q
    public TemporalAccessor n(HashMap hashMap0, TemporalAccessor temporalAccessor0, E e0) {
        return null;
    }

    public static g valueOf(String s) {
        return (g)Enum.valueOf(g.class, s);
    }

    public static g[] values() {
        return (g[])g.b.clone();
    }

    @Override  // j$.time.temporal.q
    public final boolean z() {
        return true;
    }
}

