package androidx.compose.foundation.layout;

import A3.a;
import A3.p;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSpacer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,56:1\n75#2:57\n76#2,11:59\n89#2:86\n76#3:58\n460#4,16:70\n*S KotlinDebug\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n*L\n40#1:57\n40#1:59,11\n40#1:86\n40#1:58\n40#1:70,16\n*E\n"})
public final class SpacerKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l Modifier modifier0, @m Composer composer0, int v) {
        L.p(modifier0, "modifier");
        composer0.V(0xFBA7E6DD);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xFBA7E6DD, v, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        SpacerMeasurePolicy spacerMeasurePolicy0 = SpacerMeasurePolicy.a;
        composer0.V(-1323940314);
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
        Companion composeUiNode$Companion0 = ComposeUiNode.p0;
        a a0 = composeUiNode$Companion0.a();
        p p0 = LayoutKt.f(modifier0);
        if(!(composer0.H() instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.h();
        if(composer0.E()) {
            composer0.k(a0);
        }
        else {
            composer0.f();
        }
        composer0.b0();
        Composer composer1 = Updater.b(composer0);
        Updater.j(composer1, spacerMeasurePolicy0, composeUiNode$Companion0.d());
        Updater.j(composer1, density0, composeUiNode$Companion0.b());
        Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
        Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
        composer0.y();
        p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
        composer0.V(2058660585);
        composer0.g0();
        composer0.g();
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }
}

