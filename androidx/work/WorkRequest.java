package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.DurationApi26Impl;
import j..time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;

public abstract class WorkRequest {
    @s0({"SMAP\nWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkRequest.kt\nandroidx/work/WorkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
    public static abstract class Builder {
        @l
        private final Class a;
        private boolean b;
        @l
        private UUID c;
        @l
        private WorkSpec d;
        @l
        private final Set e;

        public Builder(@l Class class0) {
            L.p(class0, "workerClass");
            super();
            this.a = class0;
            UUID uUID0 = UUID.randomUUID();
            L.o(uUID0, "randomUUID()");
            this.c = uUID0;
            String s = this.c.toString();
            L.o(s, "id.toString()");
            String s1 = class0.getName();
            L.o(s1, "workerClass.name");
            this.d = new WorkSpec(s, s1);
            String s2 = class0.getName();
            L.o(s2, "workerClass.name");
            this.e = k0.q(new String[]{s2});
        }

        public final void A(@l WorkSpec workSpec0) {
            L.p(workSpec0, "<set-?>");
            this.d = workSpec0;
        }

        @l
        public final Builder a(@l String s) {
            L.p(s, "tag");
            this.e.add(s);
            return this.g();
        }

        @l
        public final WorkRequest b() {
            WorkRequest workRequest0 = this.c();
            Constraints constraints0 = this.d.j;
            boolean z = Build.VERSION.SDK_INT >= 24 && constraints0.g() || constraints0.h() || constraints0.i() || Build.VERSION.SDK_INT >= 23 && constraints0.j();
            WorkSpec workSpec0 = this.d;
            if(workSpec0.q) {
                if(z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if(workSpec0.g > 0L) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if(workSpec0.I() == null) {
                this.d.S(WorkRequest.d.b(this.d.c));
            }
            UUID uUID0 = UUID.randomUUID();
            L.o(uUID0, "randomUUID()");
            this.q(uUID0);
            return workRequest0;
        }

        @l
        public abstract WorkRequest c();

        public final boolean d() {
            return this.b;
        }

        @l
        public final UUID e() {
            return this.c;
        }

        @l
        public final Set f() {
            return this.e;
        }

        @l
        public abstract Builder g();

        @l
        public final WorkSpec h() {
            return this.d;
        }

        @l
        public final Class i() {
            return this.a;
        }

        @l
        public final Builder j(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "timeUnit");
            WorkSpec workSpec0 = this.d;
            workSpec0.o = timeUnit0.toMillis(v);
            return this.g();
        }

        @RequiresApi(26)
        @l
        public final Builder k(@l Duration duration0) {
            L.p(duration0, "duration");
            WorkSpec workSpec0 = this.d;
            workSpec0.o = DurationApi26Impl.a(duration0);
            return this.g();
        }

        @l
        public final Builder l(@l BackoffPolicy backoffPolicy0, long v, @l TimeUnit timeUnit0) {
            L.p(backoffPolicy0, "backoffPolicy");
            L.p(timeUnit0, "timeUnit");
            this.b = true;
            this.d.l = backoffPolicy0;
            this.d.M(timeUnit0.toMillis(v));
            return this.g();
        }

        @RequiresApi(26)
        @l
        public final Builder m(@l BackoffPolicy backoffPolicy0, @l Duration duration0) {
            L.p(backoffPolicy0, "backoffPolicy");
            L.p(duration0, "duration");
            this.b = true;
            this.d.l = backoffPolicy0;
            this.d.M(DurationApi26Impl.a(duration0));
            return this.g();
        }

        public final void n(boolean z) {
            this.b = z;
        }

        @l
        public final Builder o(@l Constraints constraints0) {
            L.p(constraints0, "constraints");
            this.d.j = constraints0;
            return this.g();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @l
        public Builder p(@l OutOfQuotaPolicy outOfQuotaPolicy0) {
            L.p(outOfQuotaPolicy0, "policy");
            this.d.q = true;
            this.d.r = outOfQuotaPolicy0;
            return this.g();
        }

        @l
        public final Builder q(@l UUID uUID0) {
            L.p(uUID0, "id");
            this.c = uUID0;
            String s = uUID0.toString();
            L.o(s, "id.toString()");
            this.d = new WorkSpec(s, this.d);
            return this.g();
        }

        public final void r(@l UUID uUID0) {
            L.p(uUID0, "<set-?>");
            this.c = uUID0;
        }

        @l
        public Builder s(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "timeUnit");
            WorkSpec workSpec0 = this.d;
            workSpec0.g = timeUnit0.toMillis(v);
            if(0x7FFFFFFFFFFFFFFFL - System.currentTimeMillis() <= this.d.g) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
            return this.g();
        }

        @RequiresApi(26)
        @l
        public Builder t(@l Duration duration0) {
            L.p(duration0, "duration");
            WorkSpec workSpec0 = this.d;
            workSpec0.g = DurationApi26Impl.a(duration0);
            if(0x7FFFFFFFFFFFFFFFL - System.currentTimeMillis() <= this.d.g) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
            return this.g();
        }

        @RestrictTo({Scope.b})
        @VisibleForTesting
        @l
        public final Builder u(int v) {
            this.d.k = v;
            return this.g();
        }

        @RestrictTo({Scope.b})
        @VisibleForTesting
        @l
        public final Builder v(@l State workInfo$State0) {
            L.p(workInfo$State0, "state");
            this.d.b = workInfo$State0;
            return this.g();
        }

        @l
        public final Builder w(@l Data data0) {
            L.p(data0, "inputData");
            this.d.e = data0;
            return this.g();
        }

        @RestrictTo({Scope.b})
        @VisibleForTesting
        @l
        public final Builder x(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "timeUnit");
            WorkSpec workSpec0 = this.d;
            workSpec0.n = timeUnit0.toMillis(v);
            return this.g();
        }

        @RestrictTo({Scope.b})
        @VisibleForTesting
        @l
        public final Builder y(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "timeUnit");
            WorkSpec workSpec0 = this.d;
            workSpec0.p = timeUnit0.toMillis(v);
            return this.g();
        }

        @l
        public final Builder z(@l String s) {
            L.p(s, "traceTag");
            this.d.S(s);
            return this.g();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final String b(String s) {
            List list0 = v.V4(s, new String[]{"."}, false, 0, 6, null);
            String s1 = list0.size() == 1 ? ((String)list0.get(0)) : ((String)u.p3(list0));
            return s1.length() <= 0x7F ? s1 : v.Z8(s1, 0x7F);
        }
    }

    @l
    private final UUID a;
    @l
    private final WorkSpec b;
    @l
    private final Set c;
    @l
    public static final Companion d = null;
    public static final long e = 30000L;
    @SuppressLint({"MinMaxConstant"})
    public static final long f = 18000000L;
    @SuppressLint({"MinMaxConstant"})
    public static final long g = 10000L;
    private static final int h = 0x7F;

    static {
        WorkRequest.d = new Companion(null);
    }

    public WorkRequest(@l UUID uUID0, @l WorkSpec workSpec0, @l Set set0) {
        L.p(uUID0, "id");
        L.p(workSpec0, "workSpec");
        L.p(set0, "tags");
        super();
        this.a = uUID0;
        this.b = workSpec0;
        this.c = set0;
    }

    @l
    public UUID a() {
        return this.a;
    }

    @RestrictTo({Scope.b})
    @l
    public final String b() {
        String s = this.a().toString();
        L.o(s, "id.toString()");
        return s;
    }

    @RestrictTo({Scope.b})
    @l
    public final Set c() {
        return this.c;
    }

    @RestrictTo({Scope.b})
    @l
    public final WorkSpec d() {
        return this.b;
    }
}

