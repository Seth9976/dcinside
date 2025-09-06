package androidx.compose.ui.semantics;

import A3.o;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SemanticsProperties.IsDialog.1 extends N implements o {
    public static final SemanticsProperties.IsDialog.1 e;

    static {
        SemanticsProperties.IsDialog.1.e = new SemanticsProperties.IsDialog.1();
    }

    SemanticsProperties.IsDialog.1() {
        super(2);
    }

    @m
    public final S0 a(@m S0 s00, @l S0 s01) {
        L.p(s01, "<anonymous parameter 1>");
        throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((S0)object0), ((S0)object1));
    }
}

