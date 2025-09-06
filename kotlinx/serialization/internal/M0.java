package kotlinx.serialization.internal;

import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.h;
import y4.l;

@h
public abstract class m0 extends Q0 {
    @Override  // kotlinx.serialization.internal.Q0
    public Object a0(f f0, int v) {
        return this.f0(f0, v);
    }

    @l
    protected String d0(@l String s, @l String s1) {
        L.p(s, "parentName");
        L.p(s1, "childName");
        return s.length() == 0 ? s1 : s + '.' + s1;
    }

    @l
    protected String e0(@l f f0, int v) {
        L.p(f0, "descriptor");
        return f0.f(v);
    }

    @l
    protected final String f0(@l f f0, int v) {
        L.p(f0, "<this>");
        return this.g0(this.e0(f0, v));
    }

    @l
    protected final String g0(@l String s) {
        L.p(s, "nestedName");
        String s1 = (String)this.Z();
        if(s1 == null) {
            s1 = "";
        }
        return this.d0(s1, s);
    }
}

