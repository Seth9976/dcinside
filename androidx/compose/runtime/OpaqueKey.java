package androidx.compose.runtime;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class OpaqueKey {
    @l
    private final String a;

    public OpaqueKey(@l String s) {
        L.p(s, "key");
        super();
        this.a = s;
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final OpaqueKey b(@l String s) {
        L.p(s, "key");
        return new OpaqueKey(s);
    }

    public static OpaqueKey c(OpaqueKey opaqueKey0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = opaqueKey0.a;
        }
        return opaqueKey0.b(s);
    }

    @l
    public final String d() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof OpaqueKey ? L.g(this.a, ((OpaqueKey)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "OpaqueKey(key=" + this.a + ')';
    }
}

