package kotlinx.serialization.internal;

import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.h;
import y4.l;

@h
public abstract class l0 extends P0 {
    @Override  // kotlinx.serialization.internal.P0
    public Object b0(f f0, int v) {
        return this.h0(f0, v);
    }

    @l
    protected String f0(@l String s, @l String s1) {
        L.p(s, "parentName");
        L.p(s1, "childName");
        return s.length() == 0 ? s1 : s + '.' + s1;
    }

    @l
    protected String g0(@l f f0, int v) {
        L.p(f0, "desc");
        return f0.f(v);
    }

    @l
    protected final String h0(@l f f0, int v) {
        L.p(f0, "<this>");
        return this.i0(this.g0(f0, v));
    }

    @l
    protected final String i0(@l String s) {
        L.p(s, "nestedName");
        String s1 = (String)this.a0();
        if(s1 == null) {
            s1 = "";
        }
        return this.f0(s1, s);
    }
}

