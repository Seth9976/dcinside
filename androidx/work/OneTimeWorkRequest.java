package androidx.work;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.reflect.d;
import y4.l;
import z3.b;
import z3.n;

public final class OneTimeWorkRequest extends WorkRequest {
    public static final class Builder extends androidx.work.WorkRequest.Builder {
        public Builder(@l Class class0) {
            L.p(class0, "workerClass");
            super(class0);
        }

        public Builder(@l d d0) {
            L.p(d0, "workerClass");
            this(b.e(d0));
        }

        @l
        public OneTimeWorkRequest B() {
            if(this.d() && Build.VERSION.SDK_INT >= 23 && this.h().j.j()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new OneTimeWorkRequest(this);
        }

        @l
        public Builder C() [...] // Inlined contents

        @l
        public final Builder D(@l Class class0) {
            L.p(class0, "inputMerger");
            String s = class0.getName();
            L.o(s, "inputMerger.name");
            this.h().d = s;
            return this;
        }

        @Override  // androidx.work.WorkRequest$Builder
        public WorkRequest c() {
            return this.B();
        }

        @Override  // androidx.work.WorkRequest$Builder
        public androidx.work.WorkRequest.Builder g() {
            return this;
        }
    }

    @s0({"SMAP\nOneTimeWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequest$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1549#2:113\n1620#2,3:114\n*S KotlinDebug\n*F\n+ 1 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequest$Companion\n*L\n98#1:113\n98#1:114,3\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final OneTimeWorkRequest a(@l Class class0) {
            L.p(class0, "workerClass");
            return (OneTimeWorkRequest)new Builder(class0).b();
        }

        @l
        @n
        public final List b(@l List list0) {
            L.p(list0, "workerClasses");
            List list1 = new ArrayList(u.b0(list0, 10));
            for(Object object0: list0) {
                list1.add(((OneTimeWorkRequest)new Builder(((Class)object0)).b()));
            }
            return list1;
        }
    }

    @l
    public static final Companion i;

    static {
        OneTimeWorkRequest.i = new Companion(null);
    }

    public OneTimeWorkRequest(@l Builder oneTimeWorkRequest$Builder0) {
        L.p(oneTimeWorkRequest$Builder0, "builder");
        super(oneTimeWorkRequest$Builder0.e(), oneTimeWorkRequest$Builder0.h(), oneTimeWorkRequest$Builder0.f());
    }

    @l
    @n
    public static final OneTimeWorkRequest e(@l Class class0) {
        return OneTimeWorkRequest.i.a(class0);
    }

    @l
    @n
    public static final List f(@l List list0) {
        return OneTimeWorkRequest.i.b(list0);
    }
}

