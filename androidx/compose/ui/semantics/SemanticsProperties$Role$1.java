package androidx.compose.ui.semantics;

import A3.o;
import kotlin.jvm.internal.N;
import y4.m;

final class SemanticsProperties.Role.1 extends N implements o {
    public static final SemanticsProperties.Role.1 e;

    static {
        SemanticsProperties.Role.1.e = new SemanticsProperties.Role.1();
    }

    SemanticsProperties.Role.1() {
        super(2);
    }

    @m
    public final Role a(@m Role role0, int v) {
        return role0;
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((Role)object0), ((Role)object1).n());
    }
}

