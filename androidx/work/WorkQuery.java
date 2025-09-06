package androidx.work;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.n;

public final class WorkQuery {
    public static final class Builder {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            @n
            public final Builder a(@l List list0) {
                L.p(list0, "ids");
                Builder workQuery$Builder0 = new Builder(null);
                workQuery$Builder0.a(list0);
                return workQuery$Builder0;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            @n
            public final Builder b(@l List list0) {
                L.p(list0, "states");
                Builder workQuery$Builder0 = new Builder(null);
                workQuery$Builder0.b(list0);
                return workQuery$Builder0;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            @n
            public final Builder c(@l List list0) {
                L.p(list0, "tags");
                Builder workQuery$Builder0 = new Builder(null);
                workQuery$Builder0.c(list0);
                return workQuery$Builder0;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            @n
            public final Builder d(@l List list0) {
                L.p(list0, "uniqueWorkNames");
                Builder workQuery$Builder0 = new Builder(null);
                workQuery$Builder0.d(list0);
                return workQuery$Builder0;
            }
        }

        @l
        private final List a;
        @l
        private final List b;
        @l
        private final List c;
        @l
        private final List d;
        @l
        public static final Companion e;

        static {
            Builder.e = new Companion(null);
        }

        private Builder() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public Builder(w w0) {
        }

        @l
        public final Builder a(@l List list0) {
            L.p(list0, "ids");
            u.q0(this.a, list0);
            return this;
        }

        @l
        public final Builder b(@l List list0) {
            L.p(list0, "states");
            u.q0(this.d, list0);
            return this;
        }

        @l
        public final Builder c(@l List list0) {
            L.p(list0, "tags");
            u.q0(this.c, list0);
            return this;
        }

        @l
        public final Builder d(@l List list0) {
            L.p(list0, "uniqueWorkNames");
            u.q0(this.b, list0);
            return this;
        }

        @l
        public final WorkQuery e() {
            if(this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this.a, this.b, this.c, this.d);
        }

        @SuppressLint({"BuilderSetStyle"})
        @l
        @n
        public static final Builder f(@l List list0) {
            return Builder.e.a(list0);
        }

        @SuppressLint({"BuilderSetStyle"})
        @l
        @n
        public static final Builder g(@l List list0) {
            return Builder.e.b(list0);
        }

        @SuppressLint({"BuilderSetStyle"})
        @l
        @n
        public static final Builder h(@l List list0) {
            return Builder.e.c(list0);
        }

        @SuppressLint({"BuilderSetStyle"})
        @l
        @n
        public static final Builder i(@l List list0) {
            return Builder.e.d(list0);
        }
    }

    public static final class androidx.work.WorkQuery.Companion {
        private androidx.work.WorkQuery.Companion() {
        }

        public androidx.work.WorkQuery.Companion(w w0) {
        }

        @l
        @n
        public final WorkQuery a(@l List list0) {
            L.p(list0, "ids");
            return new WorkQuery(list0, null, null, null, 14, null);
        }

        @l
        @n
        public final WorkQuery b(@l UUID[] arr_uUID) {
            L.p(arr_uUID, "ids");
            return new WorkQuery(kotlin.collections.l.Ky(arr_uUID), null, null, null, 14, null);
        }

        @l
        @n
        public final WorkQuery c(@l List list0) {
            L.p(list0, "states");
            return new WorkQuery(null, null, null, list0, 7, null);
        }

        @l
        @n
        public final WorkQuery d(@l State[] arr_workInfo$State) {
            L.p(arr_workInfo$State, "states");
            return new WorkQuery(null, null, null, kotlin.collections.l.Ky(arr_workInfo$State), 7, null);
        }

        @l
        @n
        public final WorkQuery e(@l List list0) {
            L.p(list0, "tags");
            return new WorkQuery(null, null, list0, null, 11, null);
        }

        @l
        @n
        public final WorkQuery f(@l String[] arr_s) {
            L.p(arr_s, "tags");
            return new WorkQuery(null, null, kotlin.collections.l.Ky(arr_s), null, 11, null);
        }

        @l
        @n
        public final WorkQuery g(@l List list0) {
            L.p(list0, "uniqueWorkNames");
            return new WorkQuery(null, list0, null, null, 13, null);
        }

        @l
        @n
        public final WorkQuery h(@l String[] arr_s) {
            L.p(arr_s, "uniqueWorkNames");
            return new WorkQuery(null, kotlin.collections.l.Ky(arr_s), null, null, 13, null);
        }
    }

    @l
    private final List a;
    @l
    private final List b;
    @l
    private final List c;
    @l
    private final List d;
    @l
    public static final androidx.work.WorkQuery.Companion e;

    static {
        WorkQuery.e = new androidx.work.WorkQuery.Companion(null);
    }

    public WorkQuery() {
        this(null, null, null, null, 15, null);
    }

    public WorkQuery(@l List list0, @l List list1, @l List list2, @l List list3) {
        L.p(list0, "ids");
        L.p(list1, "uniqueWorkNames");
        L.p(list2, "tags");
        L.p(list3, "states");
        super();
        this.a = list0;
        this.b = list1;
        this.c = list2;
        this.d = list3;
    }

    public WorkQuery(List list0, List list1, List list2, List list3, int v, w w0) {
        if((v & 1) != 0) {
            list0 = u.H();
        }
        if((v & 2) != 0) {
            list1 = u.H();
        }
        if((v & 4) != 0) {
            list2 = u.H();
        }
        if((v & 8) != 0) {
            list3 = u.H();
        }
        this(list0, list1, list2, list3);
    }

    @l
    @n
    public static final WorkQuery a(@l List list0) {
        return WorkQuery.e.a(list0);
    }

    @l
    @n
    public static final WorkQuery b(@l UUID[] arr_uUID) {
        return WorkQuery.e.b(arr_uUID);
    }

    @l
    @n
    public static final WorkQuery c(@l List list0) {
        return WorkQuery.e.c(list0);
    }

    @l
    @n
    public static final WorkQuery d(@l State[] arr_workInfo$State) {
        return WorkQuery.e.d(arr_workInfo$State);
    }

    @l
    @n
    public static final WorkQuery e(@l List list0) {
        return WorkQuery.e.e(list0);
    }

    @l
    @n
    public static final WorkQuery f(@l String[] arr_s) {
        return WorkQuery.e.f(arr_s);
    }

    @l
    @n
    public static final WorkQuery g(@l List list0) {
        return WorkQuery.e.g(list0);
    }

    @l
    @n
    public static final WorkQuery h(@l String[] arr_s) {
        return WorkQuery.e.h(arr_s);
    }

    @l
    public final List i() {
        return this.a;
    }

    @l
    public final List j() {
        return this.d;
    }

    @l
    public final List k() {
        return this.c;
    }

    @l
    public final List l() {
        return this.b;
    }
}

