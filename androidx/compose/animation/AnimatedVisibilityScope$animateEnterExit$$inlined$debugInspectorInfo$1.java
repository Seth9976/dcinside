package androidx.compose.animation;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n1#1,170:1\n667#2,5:171\n*E\n"})
public final class AnimatedVisibilityScope.animateEnterExit..inlined.debugInspectorInfo.1 extends N implements Function1 {
    final EnterTransition e;
    final ExitTransition f;
    final String g;

    public AnimatedVisibilityScope.animateEnterExit..inlined.debugInspectorInfo.1(EnterTransition enterTransition0, ExitTransition exitTransition0, String s) {
        this.e = enterTransition0;
        this.f = exitTransition0;
        this.g = s;
        super(1);
    }

    public final void a(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "$this$null");
        inspectorInfo0.d("animateEnterExit");
        inspectorInfo0.b().c("enter", this.e);
        inspectorInfo0.b().c("exit", this.f);
        inspectorInfo0.b().c("label", this.g);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((InspectorInfo)object0));
        return S0.a;
    }
}

