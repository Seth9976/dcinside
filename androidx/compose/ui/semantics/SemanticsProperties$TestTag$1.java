package androidx.compose.ui.semantics;

import A3.o;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SemanticsProperties.TestTag.1 extends N implements o {
    public static final SemanticsProperties.TestTag.1 e;

    static {
        SemanticsProperties.TestTag.1.e = new SemanticsProperties.TestTag.1();
    }

    SemanticsProperties.TestTag.1() {
        super(2);
    }

    @m
    public final String a(@m String s, @l String s1) {
        L.p(s1, "<anonymous parameter 1>");
        return s;
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((String)object0), ((String)object1));
    }
}

