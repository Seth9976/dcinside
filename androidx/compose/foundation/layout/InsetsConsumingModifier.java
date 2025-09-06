package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@Stable
@s0({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,305:1\n76#2:306\n102#2,2:307\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n*L\n215#1:306\n215#1:307,2\n*E\n"})
abstract class InsetsConsumingModifier extends InspectorValueInfo implements ModifierLocalConsumer, ModifierLocalProvider {
    @l
    private final MutableState d;

    private InsetsConsumingModifier(Function1 function10) {
        super(function10);
        this.d = SnapshotStateKt__SnapshotStateKt.g(WindowInsetsKt.a(0, 0, 0, 0), null, 2, null);
    }

    public InsetsConsumingModifier(Function1 function10, w w0) {
        this(function10);
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

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.e();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this.m();
    }

    @l
    public abstract WindowInsets j(@l WindowInsets arg1);

    private final WindowInsets l() {
        return (WindowInsets)this.d.getValue();
    }

    @l
    public WindowInsets m() {
        return this.l();
    }

    private final void n(WindowInsets windowInsets0) {
        this.d.setValue(windowInsets0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
        L.p(modifierLocalReadScope0, "scope");
        this.n(this.j(((WindowInsets)modifierLocalReadScope0.a(WindowInsetsPaddingKt.e()))));
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

