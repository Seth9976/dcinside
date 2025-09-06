package androidx.compose.ui.semantics;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class SemanticsModifierCore extends InspectorValueInfo implements SemanticsModifier {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final int a() {
            return SemanticsModifierCore.f.addAndGet(1);
        }
    }

    @l
    private final SemanticsConfiguration d;
    @l
    public static final Companion e;
    @l
    private static AtomicInteger f;

    static {
        SemanticsModifierCore.e = new Companion(null);
        SemanticsModifierCore.f = new AtomicInteger(0);
    }

    public SemanticsModifierCore(boolean z, boolean z1, @l Function1 function10, @l Function1 function11) {
        L.p(function10, "properties");
        L.p(function11, "inspectorInfo");
        super(function11);
        SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
        semanticsConfiguration0.o(z);
        semanticsConfiguration0.m(z1);
        function10.invoke(semanticsConfiguration0);
        this.d = semanticsConfiguration0;
    }

    public SemanticsModifierCore(boolean z, boolean z1, Function1 function10, Function1 function11, int v, w w0) {
        if((v & 8) != 0) {
            function11 = InspectableValueKt.b();
        }
        this(z, z1, function10, function11);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @Override  // androidx.compose.ui.semantics.SemanticsModifier
    @l
    public SemanticsConfiguration c0() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SemanticsModifierCore ? L.g(this.c0(), ((SemanticsModifierCore)object0).c0()) : false;
    }

    @Override  // androidx.compose.ui.semantics.SemanticsModifier
    public int getId() {
        return -1;
    }

    @Override
    public int hashCode() {
        return this.c0().hashCode();
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

