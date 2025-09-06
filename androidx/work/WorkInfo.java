package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class WorkInfo {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public static final class PeriodicityInfo {
        private final long a;
        private final long b;

        public PeriodicityInfo(long v, long v1) {
            this.a = v;
            this.b = v1;
        }

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return L.g(PeriodicityInfo.class, class0) && (((PeriodicityInfo)object0).a == this.a && ((PeriodicityInfo)object0).b == this.b);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + ((int)(this.b ^ this.b >>> 0x20));
        }

        @Override
        @l
        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
        }
    }

    public static enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        private static final State[] a() [...] // Inlined contents

        public final boolean b() [...] // 潜在的解密器
    }

    public static final int A = 11;
    public static final int B = 12;
    public static final int C = 13;
    public static final int D = 14;
    public static final int E = 15;
    @l
    private final UUID a;
    @l
    private final State b;
    @l
    private final Set c;
    @l
    private final Data d;
    @l
    private final Data e;
    private final int f;
    private final int g;
    @l
    private final Constraints h;
    private final long i;
    @m
    private final PeriodicityInfo j;
    private final long k;
    private final int l;
    @l
    public static final Companion m = null;
    public static final int n = 0xFFFFFF80;
    public static final int o = 0xFFFFFF00;
    public static final int p = 0xFFFFFE00;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public static final int t = 4;
    public static final int u = 5;
    public static final int v = 6;
    public static final int w = 7;
    public static final int x = 8;
    public static final int y = 9;
    public static final int z = 10;

    static {
        WorkInfo.m = new Companion(null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        this(uUID0, workInfo$State0, set0, null, null, 0, 0, null, 0L, null, 0L, 0, 0xFF8, null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0, @l Data data0) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        L.p(data0, "outputData");
        this(uUID0, workInfo$State0, set0, data0, null, 0, 0, null, 0L, null, 0L, 0, 0xFF0, null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0, @l Data data0, @l Data data1) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        L.p(data0, "outputData");
        L.p(data1, "progress");
        this(uUID0, workInfo$State0, set0, data0, data1, 0, 0, null, 0L, null, 0L, 0, 0xFE0, null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0, @l Data data0, @l Data data1, int v) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        L.p(data0, "outputData");
        L.p(data1, "progress");
        this(uUID0, workInfo$State0, set0, data0, data1, v, 0, null, 0L, null, 0L, 0, 0xFC0, null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0, @l Data data0, @l Data data1, int v, int v1) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        L.p(data0, "outputData");
        L.p(data1, "progress");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, null, 0L, null, 0L, 0, 0xF80, null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0, @l Data data0, @l Data data1, int v, int v1, @l Constraints constraints0) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        L.p(data0, "outputData");
        L.p(data1, "progress");
        L.p(constraints0, "constraints");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, constraints0, 0L, null, 0L, 0, 0xF00, null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0, @l Data data0, @l Data data1, int v, int v1, @l Constraints constraints0, long v2) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        L.p(data0, "outputData");
        L.p(data1, "progress");
        L.p(constraints0, "constraints");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, constraints0, v2, null, 0L, 0, 0xE00, null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0, @l Data data0, @l Data data1, int v, int v1, @l Constraints constraints0, long v2, @m PeriodicityInfo workInfo$PeriodicityInfo0) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        L.p(data0, "outputData");
        L.p(data1, "progress");
        L.p(constraints0, "constraints");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, constraints0, v2, workInfo$PeriodicityInfo0, 0L, 0, 0xC00, null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0, @l Data data0, @l Data data1, int v, int v1, @l Constraints constraints0, long v2, @m PeriodicityInfo workInfo$PeriodicityInfo0, long v3) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        L.p(data0, "outputData");
        L.p(data1, "progress");
        L.p(constraints0, "constraints");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, constraints0, v2, workInfo$PeriodicityInfo0, v3, 0, 0x800, null);
    }

    @j
    public WorkInfo(@l UUID uUID0, @l State workInfo$State0, @l Set set0, @l Data data0, @l Data data1, int v, int v1, @l Constraints constraints0, long v2, @m PeriodicityInfo workInfo$PeriodicityInfo0, long v3, int v4) {
        L.p(uUID0, "id");
        L.p(workInfo$State0, "state");
        L.p(set0, "tags");
        L.p(data0, "outputData");
        L.p(data1, "progress");
        L.p(constraints0, "constraints");
        super();
        this.a = uUID0;
        this.b = workInfo$State0;
        this.c = set0;
        this.d = data0;
        this.e = data1;
        this.f = v;
        this.g = v1;
        this.h = constraints0;
        this.i = v2;
        this.j = workInfo$PeriodicityInfo0;
        this.k = v3;
        this.l = v4;
    }

    public WorkInfo(UUID uUID0, State workInfo$State0, Set set0, Data data0, Data data1, int v, int v1, Constraints constraints0, long v2, PeriodicityInfo workInfo$PeriodicityInfo0, long v3, int v4, int v5, w w0) {
        this(uUID0, workInfo$State0, set0, ((v5 & 8) == 0 ? data0 : Data.c), ((v5 & 16) == 0 ? data1 : Data.c), ((v5 & 0x20) == 0 ? v : 0), ((v5 & 0x40) == 0 ? v1 : 0), ((v5 & 0x80) == 0 ? constraints0 : Constraints.k), ((v5 & 0x100) == 0 ? v2 : 0L), ((v5 & 0x200) == 0 ? workInfo$PeriodicityInfo0 : null), ((v5 & 0x400) == 0 ? v3 : 0x7FFFFFFFFFFFFFFFL), ((v5 & 0x800) == 0 ? v4 : 0xFFFFFF00));
    }

    @l
    public final Constraints a() {
        return this.h;
    }

    public final int b() {
        return this.g;
    }

    @l
    public final UUID c() {
        return this.a;
    }

    public final long d() {
        return this.i;
    }

    public final long e() {
        return this.k;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!L.g(WorkInfo.class, class0) || this.f != ((WorkInfo)object0).f) {
                return false;
            }
            if(this.g != ((WorkInfo)object0).g) {
                return false;
            }
            if(!L.g(this.a, ((WorkInfo)object0).a)) {
                return false;
            }
            if(this.b != ((WorkInfo)object0).b) {
                return false;
            }
            if(!L.g(this.d, ((WorkInfo)object0).d)) {
                return false;
            }
            if(!L.g(this.h, ((WorkInfo)object0).h)) {
                return false;
            }
            if(this.i != ((WorkInfo)object0).i) {
                return false;
            }
            if(!L.g(this.j, ((WorkInfo)object0).j)) {
                return false;
            }
            if(this.k != ((WorkInfo)object0).k) {
                return false;
            }
            if(this.l != ((WorkInfo)object0).l) {
                return false;
            }
            return L.g(this.c, ((WorkInfo)object0).c) ? L.g(this.e, ((WorkInfo)object0).e) : false;
        }
        return false;
    }

    @l
    public final Data f() {
        return this.d;
    }

    @m
    public final PeriodicityInfo g() {
        return this.j;
    }

    @l
    public final Data h() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = ((((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h.hashCode()) * 0x1F + ((int)(this.i ^ this.i >>> 0x20))) * 0x1F;
        return this.j == null ? (v * 0x1F + ((int)(this.k ^ this.k >>> 0x20))) * 0x1F + this.l : ((v + this.j.hashCode()) * 0x1F + ((int)(this.k ^ this.k >>> 0x20))) * 0x1F + this.l;
    }

    @IntRange(from = 0L)
    public final int i() {
        return this.f;
    }

    @l
    public final State j() {
        return this.b;
    }

    @RequiresApi(0x1F)
    public final int k() {
        return this.l;
    }

    @l
    public final Set l() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "WorkInfo{id=\'" + this.a + "\', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}

