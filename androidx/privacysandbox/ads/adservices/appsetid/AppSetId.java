package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nAppSetId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetId.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public final class AppSetId {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final String a;
    private final int b;
    @l
    public static final Companion c = null;
    public static final int d = 1;
    public static final int e = 2;

    static {
        AppSetId.c = new Companion(null);
    }

    public AppSetId(@l String s, int v) {
        L.p(s, "id");
        super();
        this.a = s;
        this.b = v;
        if(v != 1 && v != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    @l
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AppSetId ? L.g(this.a, ((AppSetId)object0).a) && this.b == ((AppSetId)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return this.b == 1 ? "AppSetId: id=" + this.a + ", scope=" + "SCOPE_APP" : "AppSetId: id=" + this.a + ", scope=" + "SCOPE_DEVELOPER";
    }
}

