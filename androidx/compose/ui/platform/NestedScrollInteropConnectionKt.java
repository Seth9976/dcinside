package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nNestedScrollInteropConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,236:1\n76#2:237\n36#3:238\n1114#4,6:239\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n233#1:237\n234#1:238\n234#1:239,6\n*E\n"})
public final class NestedScrollInteropConnectionKt {
    private static final float a = 0.5f;

    public static final float d(float f) {
        return f * -1.0f;
    }

    private static final float e(float f) {
        return f >= 0.0f ? ((float)Math.ceil(f)) : ((float)Math.floor(f));
    }

    public static final int f(float f) {
        return -((int)NestedScrollInteropConnectionKt.e(f));
    }

    private static final int g(long v) {
        int v1 = Math.abs(Offset.p(v)) >= 0.5f ? 1 : 0;
        return Math.abs(Offset.r(v)) >= 0.5f ? v1 | 2 : v1;
    }

    @Composable
    @l
    public static final NestedScrollConnection h(@m View view0, @m Composer composer0, int v, int v1) {
        composer0.V(1260107652);
        if((v1 & 1) != 0) {
            view0 = (View)composer0.L(AndroidCompositionLocals_androidKt.k());
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(1260107652, v, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.kt:231)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(view0);
        NestedScrollInteropConnection nestedScrollInteropConnection0 = composer0.W();
        if(z || nestedScrollInteropConnection0 == Composer.a.a()) {
            nestedScrollInteropConnection0 = new NestedScrollInteropConnection(view0);
            composer0.O(nestedScrollInteropConnection0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return nestedScrollInteropConnection0;
    }

    private static final float i(int v) {
        return ((float)v) * -1.0f;
    }

    private static final long j(int[] arr_v, long v) {
        float f = Offset.p(v) >= 0.0f ? s.A(NestedScrollInteropConnectionKt.i(arr_v[0]), Offset.p(v)) : s.t(NestedScrollInteropConnectionKt.i(arr_v[0]), Offset.p(v));
        return Offset.r(v) >= 0.0f ? OffsetKt.a(f, s.A(NestedScrollInteropConnectionKt.i(arr_v[1]), Offset.r(v))) : OffsetKt.a(f, s.t(NestedScrollInteropConnectionKt.i(arr_v[1]), Offset.r(v)));
    }

    // 去混淆评级： 低(20)
    private static final int k(int v) {
        return !NestedScrollSource.g(v, 1);
    }

    private static final float l(float f) [...] // Inlined contents
}

