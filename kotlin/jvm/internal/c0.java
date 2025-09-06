package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.h0;
import y4.l;
import y4.m;
import z3.r;

@h0(version = "1.1")
public final class c0 implements t {
    @l
    private final Class a;
    @l
    private final String b;

    public c0(@l Class class0, @l String s) {
        L.p(class0, "jClass");
        L.p(s, "moduleName");
        super();
        this.a = class0;
        this.b = s;
    }

    @Override  // kotlin.reflect.h
    @l
    public Collection b() {
        throw new r();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof c0 && L.g(this.q(), ((c0)object0).q());
    }

    @Override
    public int hashCode() {
        return this.q().hashCode();
    }

    @Override  // kotlin.jvm.internal.t
    @l
    public Class q() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return this.q().toString() + " (Kotlin reflection is not available)";
    }
}

