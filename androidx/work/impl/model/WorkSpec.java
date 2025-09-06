package androidx.work.impl.model;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.compose.foundation.c;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo.PeriodicityInfo;
import androidx.work.WorkInfo.State;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.f;

@RestrictTo({Scope.b})
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@s0({"SMAP\nWorkSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1549#2:464\n1620#2,3:465\n*S KotlinDebug\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n*L\n402#1:464\n402#1:465,3\n*E\n"})
public final class WorkSpec {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final long a(boolean z, int v, @l BackoffPolicy backoffPolicy0, long v1, long v2, int v3, boolean z1, long v4, long v5, long v6, long v7) {
            L.p(backoffPolicy0, "backoffPolicy");
            if(v7 != 0x7FFFFFFFFFFFFFFFL && z1) {
                return v3 == 0 ? v7 : s.v(v7, v2 + 900000L);
            }
            if(z) {
                return backoffPolicy0 == BackoffPolicy.b ? v2 + s.C(((long)v) * v1, 18000000L) : v2 + s.C(((long)Math.scalb(v1, v - 1)), 18000000L);
            }
            if(z1) {
                long v8 = v3 == 0 ? v2 + v4 : v2 + v6;
                return v5 == v6 || v3 != 0 ? v8 : v8 + (v6 - v5);
            }
            return v2 == -1L ? 0x7FFFFFFFFFFFFFFFL : v2 + v4;
        }
    }

    public static final class IdAndState {
        @ColumnInfo(name = "id")
        @l
        @f
        public String a;
        @ColumnInfo(name = "state")
        @l
        @f
        public State b;

        public IdAndState(@l String s, @l State workInfo$State0) {
            L.p(s, "id");
            L.p(workInfo$State0, "state");
            super();
            this.a = s;
            this.b = workInfo$State0;
        }

        @l
        public final String a() {
            return this.a;
        }

        @l
        public final State b() {
            return this.b;
        }

        @l
        public final IdAndState c(@l String s, @l State workInfo$State0) {
            L.p(s, "id");
            L.p(workInfo$State0, "state");
            return new IdAndState(s, workInfo$State0);
        }

        public static IdAndState d(IdAndState workSpec$IdAndState0, String s, State workInfo$State0, int v, Object object0) {
            if((v & 1) != 0) {
                s = workSpec$IdAndState0.a;
            }
            if((v & 2) != 0) {
                workInfo$State0 = workSpec$IdAndState0.b;
            }
            return workSpec$IdAndState0.c(s, workInfo$State0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof IdAndState)) {
                return false;
            }
            return L.g(this.a, ((IdAndState)object0).a) ? this.b == ((IdAndState)object0).b : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    public static final class WorkInfoPojo {
        @ColumnInfo(name = "id")
        @l
        private final String a;
        @ColumnInfo(name = "state")
        @l
        private final State b;
        @ColumnInfo(name = "output")
        @l
        private final Data c;
        @ColumnInfo(name = "initial_delay")
        private final long d;
        @ColumnInfo(name = "interval_duration")
        private final long e;
        @ColumnInfo(name = "flex_duration")
        private final long f;
        @Embedded
        @l
        private final Constraints g;
        @ColumnInfo(name = "run_attempt_count")
        private final int h;
        @ColumnInfo(name = "backoff_policy")
        @l
        private BackoffPolicy i;
        @ColumnInfo(name = "backoff_delay_duration")
        private long j;
        @ColumnInfo(name = "last_enqueue_time")
        private long k;
        @ColumnInfo(defaultValue = "0", name = "period_count")
        private int l;
        @ColumnInfo(name = "generation")
        private final int m;
        @ColumnInfo(name = "next_schedule_time_override")
        private final long n;
        @ColumnInfo(name = "stop_reason")
        private final int o;
        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        @l
        private final List p;
        @Relation(entity = WorkProgress.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        @l
        private final List q;

        public WorkInfoPojo(@l String s, @l State workInfo$State0, @l Data data0, long v, long v1, long v2, @l Constraints constraints0, int v3, @l BackoffPolicy backoffPolicy0, long v4, long v5, int v6, int v7, long v8, int v9, @l List list0, @l List list1) {
            L.p(s, "id");
            L.p(workInfo$State0, "state");
            L.p(data0, "output");
            L.p(constraints0, "constraints");
            L.p(backoffPolicy0, "backoffPolicy");
            L.p(list0, "tags");
            L.p(list1, "progress");
            super();
            this.a = s;
            this.b = workInfo$State0;
            this.c = data0;
            this.d = v;
            this.e = v1;
            this.f = v2;
            this.g = constraints0;
            this.h = v3;
            this.i = backoffPolicy0;
            this.j = v4;
            this.k = v5;
            this.l = v6;
            this.m = v7;
            this.n = v8;
            this.o = v9;
            this.p = list0;
            this.q = list1;
        }

        public WorkInfoPojo(String s, State workInfo$State0, Data data0, long v, long v1, long v2, Constraints constraints0, int v3, BackoffPolicy backoffPolicy0, long v4, long v5, int v6, int v7, long v8, int v9, List list0, List list1, int v10, w w0) {
            this(s, workInfo$State0, data0, ((v10 & 8) == 0 ? v : 0L), ((v10 & 16) == 0 ? v1 : 0L), ((v10 & 0x20) == 0 ? v2 : 0L), constraints0, v3, ((v10 & 0x100) == 0 ? backoffPolicy0 : BackoffPolicy.a), ((v10 & 0x200) == 0 ? v4 : 30000L), ((v10 & 0x400) == 0 ? v5 : 0L), ((v10 & 0x800) == 0 ? v6 : 0), v7, v8, v9, list0, list1);
        }

        public final long A() {
            return this.d;
        }

        public final long B() {
            return this.e;
        }

        public final long C() {
            return this.k;
        }

        public final long D() {
            return this.n;
        }

        @l
        public final Data E() {
            return this.c;
        }

        public final int F() {
            return this.l;
        }

        private final PeriodicityInfo G() {
            return this.e == 0L ? null : new PeriodicityInfo(this.e, this.f);
        }

        @l
        public final List H() {
            return this.q;
        }

        public final int I() {
            return this.h;
        }

        @l
        public final State J() {
            return this.b;
        }

        public final int K() {
            return this.o;
        }

        @l
        public final List L() {
            return this.p;
        }

        public final boolean M() {
            return this.b == State.a && this.h > 0;
        }

        public final boolean N() {
            return this.e != 0L;
        }

        public final void O(long v) {
            this.j = v;
        }

        public final void P(@l BackoffPolicy backoffPolicy0) {
            L.p(backoffPolicy0, "<set-?>");
            this.i = backoffPolicy0;
        }

        public final void Q(long v) {
            this.k = v;
        }

        public final void R(int v) {
            this.l = v;
        }

        @l
        public final WorkInfo S() {
            Data data0 = this.q.isEmpty() ? Data.c : ((Data)this.q.get(0));
            UUID uUID0 = UUID.fromString(this.a);
            L.o(uUID0, "fromString(id)");
            HashSet hashSet0 = new HashSet(this.p);
            PeriodicityInfo workInfo$PeriodicityInfo0 = this.G();
            long v = this.a();
            return new WorkInfo(uUID0, this.b, hashSet0, this.c, data0, this.h, this.m, this.g, this.d, workInfo$PeriodicityInfo0, v, this.o);
        }

        private final long a() {
            if(this.b == State.a) {
                boolean z = this.M();
                BackoffPolicy backoffPolicy0 = this.i;
                long v = this.j;
                long v1 = this.k;
                int v2 = this.l;
                boolean z1 = this.N();
                return WorkSpec.y.a(z, this.h, backoffPolicy0, v, v1, v2, z1, this.d, this.f, this.e, this.n);
            }
            return 0x7FFFFFFFFFFFFFFFL;
        }

        @l
        public final String b() {
            return this.a;
        }

        public final long c() {
            return this.j;
        }

        public final long d() {
            return this.k;
        }

        public final int e() {
            return this.l;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof WorkInfoPojo)) {
                return false;
            }
            if(!L.g(this.a, ((WorkInfoPojo)object0).a)) {
                return false;
            }
            if(this.b != ((WorkInfoPojo)object0).b) {
                return false;
            }
            if(!L.g(this.c, ((WorkInfoPojo)object0).c)) {
                return false;
            }
            if(this.d != ((WorkInfoPojo)object0).d) {
                return false;
            }
            if(this.e != ((WorkInfoPojo)object0).e) {
                return false;
            }
            if(this.f != ((WorkInfoPojo)object0).f) {
                return false;
            }
            if(!L.g(this.g, ((WorkInfoPojo)object0).g)) {
                return false;
            }
            if(this.h != ((WorkInfoPojo)object0).h) {
                return false;
            }
            if(this.i != ((WorkInfoPojo)object0).i) {
                return false;
            }
            if(this.j != ((WorkInfoPojo)object0).j) {
                return false;
            }
            if(this.k != ((WorkInfoPojo)object0).k) {
                return false;
            }
            if(this.l != ((WorkInfoPojo)object0).l) {
                return false;
            }
            if(this.m != ((WorkInfoPojo)object0).m) {
                return false;
            }
            if(this.n != ((WorkInfoPojo)object0).n) {
                return false;
            }
            if(this.o != ((WorkInfoPojo)object0).o) {
                return false;
            }
            return L.g(this.p, ((WorkInfoPojo)object0).p) ? L.g(this.q, ((WorkInfoPojo)object0).q) : false;
        }

        public final int f() {
            return this.m;
        }

        public final long g() {
            return this.n;
        }

        public final int h() {
            return this.o;
        }

        @Override
        public int hashCode() {
            return (((((((((((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + ((int)(this.e ^ this.e >>> 0x20))) * 0x1F + ((int)(this.f ^ this.f >>> 0x20))) * 0x1F + this.g.hashCode()) * 0x1F + this.h) * 0x1F + this.i.hashCode()) * 0x1F + ((int)(this.j ^ this.j >>> 0x20))) * 0x1F + ((int)(this.k ^ this.k >>> 0x20))) * 0x1F + this.l) * 0x1F + this.m) * 0x1F + ((int)(this.n ^ this.n >>> 0x20))) * 0x1F + this.o) * 0x1F + this.p.hashCode()) * 0x1F + this.q.hashCode();
        }

        @l
        public final List i() {
            return this.p;
        }

        @l
        public final List j() {
            return this.q;
        }

        @l
        public final State k() {
            return this.b;
        }

        @l
        public final Data l() {
            return this.c;
        }

        public final long m() {
            return this.d;
        }

        public final long n() {
            return this.e;
        }

        public final long o() {
            return this.f;
        }

        @l
        public final Constraints p() {
            return this.g;
        }

        public final int q() {
            return this.h;
        }

        @l
        public final BackoffPolicy r() {
            return this.i;
        }

        @l
        public final WorkInfoPojo s(@l String s, @l State workInfo$State0, @l Data data0, long v, long v1, long v2, @l Constraints constraints0, int v3, @l BackoffPolicy backoffPolicy0, long v4, long v5, int v6, int v7, long v8, int v9, @l List list0, @l List list1) {
            L.p(s, "id");
            L.p(workInfo$State0, "state");
            L.p(data0, "output");
            L.p(constraints0, "constraints");
            L.p(backoffPolicy0, "backoffPolicy");
            L.p(list0, "tags");
            L.p(list1, "progress");
            return new WorkInfoPojo(s, workInfo$State0, data0, v, v1, v2, constraints0, v3, backoffPolicy0, v4, v5, v6, v7, v8, v9, list0, list1);
        }

        public static WorkInfoPojo t(WorkInfoPojo workSpec$WorkInfoPojo0, String s, State workInfo$State0, Data data0, long v, long v1, long v2, Constraints constraints0, int v3, BackoffPolicy backoffPolicy0, long v4, long v5, int v6, int v7, long v8, int v9, List list0, List list1, int v10, Object object0) {
            String s1 = (v10 & 1) == 0 ? s : workSpec$WorkInfoPojo0.a;
            State workInfo$State1 = (v10 & 2) == 0 ? workInfo$State0 : workSpec$WorkInfoPojo0.b;
            Data data1 = (v10 & 4) == 0 ? data0 : workSpec$WorkInfoPojo0.c;
            long v11 = (v10 & 8) == 0 ? v : workSpec$WorkInfoPojo0.d;
            long v12 = (v10 & 16) == 0 ? v1 : workSpec$WorkInfoPojo0.e;
            long v13 = (v10 & 0x20) == 0 ? v2 : workSpec$WorkInfoPojo0.f;
            Constraints constraints1 = (v10 & 0x40) == 0 ? constraints0 : workSpec$WorkInfoPojo0.g;
            int v14 = (v10 & 0x80) == 0 ? v3 : workSpec$WorkInfoPojo0.h;
            BackoffPolicy backoffPolicy1 = (v10 & 0x100) == 0 ? backoffPolicy0 : workSpec$WorkInfoPojo0.i;
            long v15 = (v10 & 0x200) == 0 ? v4 : workSpec$WorkInfoPojo0.j;
            long v16 = (v10 & 0x400) == 0 ? v5 : workSpec$WorkInfoPojo0.k;
            int v17 = (v10 & 0x800) == 0 ? v6 : workSpec$WorkInfoPojo0.l;
            int v18 = (v10 & 0x1000) == 0 ? v7 : workSpec$WorkInfoPojo0.m;
            long v19 = (v10 & 0x2000) == 0 ? v8 : workSpec$WorkInfoPojo0.n;
            int v20 = (v10 & 0x4000) == 0 ? v9 : workSpec$WorkInfoPojo0.o;
            List list2 = (0x8000 & v10) == 0 ? list0 : workSpec$WorkInfoPojo0.p;
            return (v10 & 0x10000) == 0 ? workSpec$WorkInfoPojo0.s(s1, workInfo$State1, data1, v11, v12, v13, constraints1, v14, backoffPolicy1, v15, v16, v17, v18, v19, v20, list2, list1) : workSpec$WorkInfoPojo0.s(s1, workInfo$State1, data1, v11, v12, v13, constraints1, v14, backoffPolicy1, v15, v16, v17, v18, v19, v20, list2, workSpec$WorkInfoPojo0.q);
        }

        @Override
        @l
        public String toString() {
            return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
        }

        public final long u() {
            return this.j;
        }

        @l
        public final BackoffPolicy v() {
            return this.i;
        }

        @l
        public final Constraints w() {
            return this.g;
        }

        public final long x() {
            return this.f;
        }

        public final int y() {
            return this.m;
        }

        @l
        public final String z() {
            return this.a;
        }
    }

    public static final long A = -1L;
    @l
    @f
    public static final Function B;
    @ColumnInfo(name = "id")
    @PrimaryKey
    @l
    @f
    public final String a;
    @ColumnInfo(name = "state")
    @l
    @f
    public State b;
    @ColumnInfo(name = "worker_class_name")
    @l
    @f
    public String c;
    @ColumnInfo(name = "input_merger_class_name")
    @l
    @f
    public String d;
    @ColumnInfo(name = "input")
    @l
    @f
    public Data e;
    @ColumnInfo(name = "output")
    @l
    @f
    public Data f;
    @ColumnInfo(name = "initial_delay")
    @f
    public long g;
    @ColumnInfo(name = "interval_duration")
    @f
    public long h;
    @ColumnInfo(name = "flex_duration")
    @f
    public long i;
    @Embedded
    @l
    @f
    public Constraints j;
    @ColumnInfo(name = "run_attempt_count")
    @f
    public int k;
    @ColumnInfo(name = "backoff_policy")
    @l
    @f
    public BackoffPolicy l;
    @ColumnInfo(name = "backoff_delay_duration")
    @f
    public long m;
    @ColumnInfo(defaultValue = "-1", name = "last_enqueue_time")
    @f
    public long n;
    @ColumnInfo(name = "minimum_retention_duration")
    @f
    public long o;
    @ColumnInfo(name = "schedule_requested_at")
    @f
    public long p;
    @ColumnInfo(name = "run_in_foreground")
    @f
    public boolean q;
    @ColumnInfo(name = "out_of_quota_policy")
    @l
    @f
    public OutOfQuotaPolicy r;
    @ColumnInfo(defaultValue = "0", name = "period_count")
    private int s;
    @ColumnInfo(defaultValue = "0")
    private final int t;
    @ColumnInfo(defaultValue = "9223372036854775807", name = "next_schedule_time_override")
    private long u;
    @ColumnInfo(defaultValue = "0", name = "next_schedule_time_override_generation")
    private int v;
    @ColumnInfo(defaultValue = "-256", name = "stop_reason")
    private final int w;
    @ColumnInfo(name = "trace_tag")
    @m
    private String x;
    @l
    public static final Companion y;
    @l
    private static final String z;

    static {
        WorkSpec.y = new Companion(null);
        L.o("WM-WorkSpec", "tagWithPrefix(\"WorkSpec\")");
        WorkSpec.z = "WM-WorkSpec";
        WorkSpec.B = (List list0) -> {
            if(list0 != null) {
                List list1 = new ArrayList(u.b0(list0, 10));
                for(Object object0: list0) {
                    list1.add(((WorkInfoPojo)object0).S());
                }
                return list1;
            }
            return null;
        };
    }

    public WorkSpec(@l String s, @l State workInfo$State0, @l String s1, @l String s2, @l Data data0, @l Data data1, long v, long v1, long v2, @l Constraints constraints0, @IntRange(from = 0L) int v3, @l BackoffPolicy backoffPolicy0, long v4, long v5, long v6, long v7, boolean z, @l OutOfQuotaPolicy outOfQuotaPolicy0, int v8, int v9, long v10, int v11, int v12, @m String s3) {
        L.p(s, "id");
        L.p(workInfo$State0, "state");
        L.p(s1, "workerClassName");
        L.p(s2, "inputMergerClassName");
        L.p(data0, "input");
        L.p(data1, "output");
        L.p(constraints0, "constraints");
        L.p(backoffPolicy0, "backoffPolicy");
        L.p(outOfQuotaPolicy0, "outOfQuotaPolicy");
        super();
        this.a = s;
        this.b = workInfo$State0;
        this.c = s1;
        this.d = s2;
        this.e = data0;
        this.f = data1;
        this.g = v;
        this.h = v1;
        this.i = v2;
        this.j = constraints0;
        this.k = v3;
        this.l = backoffPolicy0;
        this.m = v4;
        this.n = v5;
        this.o = v6;
        this.p = v7;
        this.q = z;
        this.r = outOfQuotaPolicy0;
        this.s = v8;
        this.t = v9;
        this.u = v10;
        this.v = v11;
        this.w = v12;
        this.x = s3;
    }

    public WorkSpec(String s, State workInfo$State0, String s1, String s2, Data data0, Data data1, long v, long v1, long v2, Constraints constraints0, int v3, BackoffPolicy backoffPolicy0, long v4, long v5, long v6, long v7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy0, int v8, int v9, long v10, int v11, int v12, String s3, int v13, w w0) {
        String s4;
        State workInfo$State1 = (v13 & 2) == 0 ? workInfo$State0 : State.a;
        if((v13 & 8) == 0) {
            s4 = s2;
        }
        else {
            L.o("androidx.work.OverwritingInputMerger", "OverwritingInputMerger::class.java.name");
            s4 = "androidx.work.OverwritingInputMerger";
        }
        this(s, workInfo$State1, s1, s4, ((v13 & 16) == 0 ? data0 : Data.c), ((v13 & 0x20) == 0 ? data1 : Data.c), ((v13 & 0x40) == 0 ? v : 0L), ((v13 & 0x80) == 0 ? v1 : 0L), ((v13 & 0x100) == 0 ? v2 : 0L), ((v13 & 0x200) == 0 ? constraints0 : Constraints.k), ((v13 & 0x400) == 0 ? v3 : 0), ((v13 & 0x800) == 0 ? backoffPolicy0 : BackoffPolicy.a), ((v13 & 0x1000) == 0 ? v4 : 30000L), ((v13 & 0x2000) == 0 ? v5 : -1L), ((v13 & 0x4000) == 0 ? v6 : 0L), ((0x8000 & v13) == 0 ? v7 : -1L), ((0x10000 & v13) == 0 ? z : false), ((0x20000 & v13) == 0 ? outOfQuotaPolicy0 : OutOfQuotaPolicy.a), ((0x40000 & v13) == 0 ? v8 : 0), ((0x80000 & v13) == 0 ? v9 : 0), ((0x100000 & v13) == 0 ? v10 : 0x7FFFFFFFFFFFFFFFL), ((0x200000 & v13) == 0 ? v11 : 0), ((0x400000 & v13) == 0 ? v12 : 0xFFFFFF00), ((v13 & 0x800000) == 0 ? s3 : null));
    }

    public WorkSpec(@l String s, @l WorkSpec workSpec0) {
        L.p(s, "newId");
        L.p(workSpec0, "other");
        this(s, workSpec0.b, workSpec0.c, workSpec0.d, new Data(workSpec0.e), new Data(workSpec0.f), workSpec0.g, workSpec0.h, workSpec0.i, new Constraints(workSpec0.j), workSpec0.k, workSpec0.l, workSpec0.m, workSpec0.n, workSpec0.o, workSpec0.p, workSpec0.q, workSpec0.r, workSpec0.s, 0, workSpec0.u, workSpec0.v, workSpec0.w, workSpec0.x, 0x80000, null);
    }

    public WorkSpec(@l String s, @l String s1) {
        L.p(s, "id");
        L.p(s1, "workerClassName_");
        this(s, null, s1, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 0xFFFFFA, null);
    }

    public final long A() {
        return this.i;
    }

    @l
    public final WorkSpec B(@l String s, @l State workInfo$State0, @l String s1, @l String s2, @l Data data0, @l Data data1, long v, long v1, long v2, @l Constraints constraints0, @IntRange(from = 0L) int v3, @l BackoffPolicy backoffPolicy0, long v4, long v5, long v6, long v7, boolean z, @l OutOfQuotaPolicy outOfQuotaPolicy0, int v8, int v9, long v10, int v11, int v12, @m String s3) {
        L.p(s, "id");
        L.p(workInfo$State0, "state");
        L.p(s1, "workerClassName");
        L.p(s2, "inputMergerClassName");
        L.p(data0, "input");
        L.p(data1, "output");
        L.p(constraints0, "constraints");
        L.p(backoffPolicy0, "backoffPolicy");
        L.p(outOfQuotaPolicy0, "outOfQuotaPolicy");
        return new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v, v1, v2, constraints0, v3, backoffPolicy0, v4, v5, v6, v7, z, outOfQuotaPolicy0, v8, v9, v10, v11, v12, s3);
    }

    public static WorkSpec C(WorkSpec workSpec0, String s, State workInfo$State0, String s1, String s2, Data data0, Data data1, long v, long v1, long v2, Constraints constraints0, int v3, BackoffPolicy backoffPolicy0, long v4, long v5, long v6, long v7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy0, int v8, int v9, long v10, int v11, int v12, String s3, int v13, Object object0) {
        String s4 = (v13 & 1) == 0 ? s : workSpec0.a;
        State workInfo$State1 = (v13 & 2) == 0 ? workInfo$State0 : workSpec0.b;
        String s5 = (v13 & 4) == 0 ? s1 : workSpec0.c;
        String s6 = (v13 & 8) == 0 ? s2 : workSpec0.d;
        Data data2 = (v13 & 16) == 0 ? data0 : workSpec0.e;
        Data data3 = (v13 & 0x20) == 0 ? data1 : workSpec0.f;
        long v14 = (v13 & 0x40) == 0 ? v : workSpec0.g;
        long v15 = (v13 & 0x80) == 0 ? v1 : workSpec0.h;
        long v16 = (v13 & 0x100) == 0 ? v2 : workSpec0.i;
        Constraints constraints1 = (v13 & 0x200) == 0 ? constraints0 : workSpec0.j;
        int v17 = (v13 & 0x400) == 0 ? v3 : workSpec0.k;
        BackoffPolicy backoffPolicy1 = (v13 & 0x800) == 0 ? backoffPolicy0 : workSpec0.l;
        long v18 = (v13 & 0x1000) == 0 ? v4 : workSpec0.m;
        long v19 = (v13 & 0x2000) == 0 ? v5 : workSpec0.n;
        long v20 = (v13 & 0x4000) == 0 ? v6 : workSpec0.o;
        long v21 = (v13 & 0x8000) == 0 ? v7 : workSpec0.p;
        boolean z1 = (v13 & 0x10000) == 0 ? z : workSpec0.q;
        OutOfQuotaPolicy outOfQuotaPolicy1 = (0x20000 & v13) == 0 ? outOfQuotaPolicy0 : workSpec0.r;
        int v22 = (v13 & 0x40000) == 0 ? v8 : workSpec0.s;
        int v23 = (v13 & 0x80000) == 0 ? v9 : workSpec0.t;
        long v24 = (v13 & 0x100000) == 0 ? v10 : workSpec0.u;
        int v25 = (v13 & 0x200000) == 0 ? v11 : workSpec0.v;
        int v26 = (0x400000 & v13) == 0 ? v12 : workSpec0.w;
        return (v13 & 0x800000) == 0 ? workSpec0.B(s4, workInfo$State1, s5, s6, data2, data3, v14, v15, v16, constraints1, v17, backoffPolicy1, v18, v19, v20, v21, z1, outOfQuotaPolicy1, v22, v23, v24, v25, v26, s3) : workSpec0.B(s4, workInfo$State1, s5, s6, data2, data3, v14, v15, v16, constraints1, v17, backoffPolicy1, v18, v19, v20, v21, z1, outOfQuotaPolicy1, v22, v23, v24, v25, v26, workSpec0.x);
    }

    public final int D() {
        return this.t;
    }

    public final long E() {
        return this.u;
    }

    public final int F() {
        return this.v;
    }

    public final int G() {
        return this.s;
    }

    public final int H() {
        return this.w;
    }

    @m
    public final String I() {
        return this.x;
    }

    public final boolean J() {
        return !L.g(Constraints.k, this.j);
    }

    public final boolean K() {
        return this.b == State.a && this.k > 0;
    }

    public final boolean L() {
        return this.h != 0L;
    }

    public final void M(long v) {
        if(v > 18000000L) {
            Logger.e().l("WM-WorkSpec", "Backoff delay duration exceeds maximum value");
        }
        if(v < 10000L) {
            Logger.e().l("WM-WorkSpec", "Backoff delay duration less than minimum value");
        }
        this.m = s.K(v, 10000L, 18000000L);
    }

    public final void N(long v) {
        this.u = v;
    }

    public final void O(int v) {
        this.v = v;
    }

    public final void P(int v) {
        this.s = v;
    }

    public final void Q(long v) {
        if(v < 900000L) {
            Logger.e().l("WM-WorkSpec", "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.R(s.v(v, 900000L), s.v(v, 900000L));
    }

    public final void R(long v, long v1) {
        if(v < 900000L) {
            Logger.e().l("WM-WorkSpec", "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.h = s.v(v, 900000L);
        if(v1 < 300000L) {
            Logger.e().l("WM-WorkSpec", "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if(v1 > this.h) {
            Logger.e().l("WM-WorkSpec", "Flex duration greater than interval duration; Changed to " + v);
        }
        this.i = s.K(v1, 300000L, this.h);
    }

    public final void S(@m String s) {
        this.x = s;
    }

    // 检测为 Lambda 实现
    private static final List b(List list0) [...]

    public final long c() {
        boolean z = this.K();
        int v = this.k;
        BackoffPolicy backoffPolicy0 = this.l;
        long v1 = this.m;
        long v2 = this.n;
        int v3 = this.s;
        boolean z1 = this.L();
        return WorkSpec.y.a(z, v, backoffPolicy0, v1, v2, v3, z1, this.g, this.i, this.h, this.u);
    }

    @l
    public final String d() {
        return this.a;
    }

    @l
    public final Constraints e() {
        return this.j;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec0 = (WorkSpec)object0;
        if(!L.g(this.a, workSpec0.a)) {
            return false;
        }
        if(this.b != workSpec0.b) {
            return false;
        }
        if(!L.g(this.c, workSpec0.c)) {
            return false;
        }
        if(!L.g(this.d, workSpec0.d)) {
            return false;
        }
        if(!L.g(this.e, workSpec0.e)) {
            return false;
        }
        if(!L.g(this.f, workSpec0.f)) {
            return false;
        }
        if(this.g != workSpec0.g) {
            return false;
        }
        if(this.h != workSpec0.h) {
            return false;
        }
        if(this.i != workSpec0.i) {
            return false;
        }
        if(!L.g(this.j, workSpec0.j)) {
            return false;
        }
        if(this.k != workSpec0.k) {
            return false;
        }
        if(this.l != workSpec0.l) {
            return false;
        }
        if(this.m != workSpec0.m) {
            return false;
        }
        if(this.n != workSpec0.n) {
            return false;
        }
        if(this.o != workSpec0.o) {
            return false;
        }
        if(this.p != workSpec0.p) {
            return false;
        }
        if(this.q != workSpec0.q) {
            return false;
        }
        if(this.r != workSpec0.r) {
            return false;
        }
        if(this.s != workSpec0.s) {
            return false;
        }
        if(this.t != workSpec0.t) {
            return false;
        }
        if(this.u != workSpec0.u) {
            return false;
        }
        if(this.v != workSpec0.v) {
            return false;
        }
        return this.w == workSpec0.w ? L.g(this.x, workSpec0.x) : false;
    }

    public final int f() {
        return this.k;
    }

    @l
    public final BackoffPolicy g() {
        return this.l;
    }

    public final long h() {
        return this.m;
    }

    @Override
    public int hashCode() {
        int v = ((((((((((((((((((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + ((int)(this.g ^ this.g >>> 0x20))) * 0x1F + ((int)(this.h ^ this.h >>> 0x20))) * 0x1F + ((int)(this.i ^ this.i >>> 0x20))) * 0x1F + this.j.hashCode()) * 0x1F + this.k) * 0x1F + this.l.hashCode()) * 0x1F + ((int)(this.m ^ this.m >>> 0x20))) * 0x1F + ((int)(this.n ^ this.n >>> 0x20))) * 0x1F + ((int)(this.o ^ this.o >>> 0x20))) * 0x1F + ((int)(this.p ^ this.p >>> 0x20))) * 0x1F + c.a(this.q)) * 0x1F + this.r.hashCode()) * 0x1F + this.s) * 0x1F + this.t) * 0x1F + ((int)(this.u ^ this.u >>> 0x20))) * 0x1F + this.v) * 0x1F + this.w) * 0x1F;
        return this.x == null ? v : v + this.x.hashCode();
    }

    public final long i() {
        return this.n;
    }

    public final long j() {
        return this.o;
    }

    public final long k() {
        return this.p;
    }

    public final boolean l() {
        return this.q;
    }

    @l
    public final OutOfQuotaPolicy m() {
        return this.r;
    }

    public final int n() {
        return this.s;
    }

    @l
    public final State o() {
        return this.b;
    }

    public final int p() {
        return this.t;
    }

    public final long q() {
        return this.u;
    }

    public final int r() {
        return this.v;
    }

    public final int s() {
        return this.w;
    }

    @m
    public final String t() {
        return this.x;
    }

    @Override
    @l
    public String toString() {
        return "{WorkSpec: " + this.a + '}';
    }

    @l
    public final String u() {
        return this.c;
    }

    @l
    public final String v() {
        return this.d;
    }

    @l
    public final Data w() {
        return this.e;
    }

    @l
    public final Data x() {
        return this.f;
    }

    public final long y() {
        return this.g;
    }

    public final long z() {
        return this.h;
    }
}

