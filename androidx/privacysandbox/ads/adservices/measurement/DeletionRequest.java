package androidx.privacysandbox.ads.adservices.measurement;

import androidx.annotation.RequiresApi;
import j..time.Instant;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import s3.a;
import s3.e;
import y4.l;
import y4.m;

@RequiresApi(33)
public final class DeletionRequest {
    @RequiresApi(33)
    public static final class Builder {
        private final int a;
        private final int b;
        @l
        private Instant c;
        @l
        private Instant d;
        @l
        private List e;
        @l
        private List f;

        public Builder(int v, int v1) {
            this.a = v;
            this.b = v1;
            L.o(Instant.MIN, "MIN");
            this.c = Instant.MIN;
            L.o(Instant.MAX, "MAX");
            this.d = Instant.MAX;
            this.e = u.H();
            this.f = u.H();
        }

        @l
        public final DeletionRequest a() {
            return new DeletionRequest(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        @l
        public final Builder b(@l List list0) {
            L.p(list0, "domainUris");
            this.e = list0;
            return this;
        }

        @l
        public final Builder c(@l Instant instant0) {
            L.p(instant0, "end");
            this.d = instant0;
            return this;
        }

        @l
        public final Builder d(@l List list0) {
            L.p(list0, "originUris");
            this.f = list0;
            return this;
        }

        @l
        public final Builder e(@l Instant instant0) {
            L.p(instant0, "start");
            this.c = instant0;
            return this;
        }
    }

    public static final class Companion {
        @Retention(RetentionPolicy.SOURCE)
        @e(a.a)
        public @interface DeletionMode {
        }

        @Retention(RetentionPolicy.SOURCE)
        @e(a.a)
        public @interface MatchBehavior {
        }

        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    private final int a;
    private final int b;
    @l
    private final Instant c;
    @l
    private final Instant d;
    @l
    private final List e;
    @l
    private final List f;
    @l
    public static final Companion g = null;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 0;
    public static final int k = 1;

    static {
        DeletionRequest.g = new Companion(null);
    }

    public DeletionRequest(int v, int v1, @l Instant instant0, @l Instant instant1, @l List list0, @l List list1) {
        L.p(instant0, "start");
        L.p(instant1, "end");
        L.p(list0, "domainUris");
        L.p(list1, "originUris");
        super();
        this.a = v;
        this.b = v1;
        this.c = instant0;
        this.d = instant1;
        this.e = list0;
        this.f = list1;
    }

    public DeletionRequest(int v, int v1, Instant instant0, Instant instant1, List list0, List list1, int v2, w w0) {
        if((v2 & 4) != 0) {
            instant0 = Instant.MIN;
            L.o(instant0, "MIN");
        }
        if((v2 & 8) != 0) {
            instant1 = Instant.MAX;
            L.o(instant1, "MAX");
        }
        if((v2 & 16) != 0) {
            list0 = u.H();
        }
        if((v2 & 0x20) != 0) {
            list1 = u.H();
        }
        this(v, v1, instant0, instant1, list0, list1);
    }

    public final int a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.e;
    }

    @l
    public final Instant c() {
        return this.d;
    }

    public final int d() {
        return this.b;
    }

    @l
    public final List e() {
        return this.f;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DeletionRequest ? this.a == ((DeletionRequest)object0).a && L.g(new HashSet(this.e), new HashSet(((DeletionRequest)object0).e)) && L.g(new HashSet(this.f), new HashSet(((DeletionRequest)object0).f)) && L.g(this.c, ((DeletionRequest)object0).c) && L.g(this.d, ((DeletionRequest)object0).d) && this.b == ((DeletionRequest)object0).b : false;
    }

    @l
    public final Instant f() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return ((((this.a * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        String s = this.a == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA";
        return this.b == 0 ? "DeletionRequest { DeletionMode=" + s + ", MatchBehavior=" + "MATCH_BEHAVIOR_DELETE" + ", Start=" + this.c + ", End=" + this.d + ", DomainUris=" + this.e + ", OriginUris=" + this.f + " }" : "DeletionRequest { DeletionMode=" + s + ", MatchBehavior=" + "MATCH_BEHAVIOR_PRESERVE" + ", Start=" + this.c + ", End=" + this.d + ", DomainUris=" + this.e + ", OriginUris=" + this.f + " }";
    }
}

