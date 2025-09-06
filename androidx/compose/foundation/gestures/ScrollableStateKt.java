package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nScrollableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,192:1\n25#2:193\n1114#3,6:194\n*S KotlinDebug\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n*L\n146#1:193\n146#1:194,6\n*E\n"})
public final class ScrollableStateKt {
    @l
    public static final ScrollableState a(@l Function1 function10) {
        L.p(function10, "consumeScrollDelta");
        return new DefaultScrollableState(function10);
    }

    @Composable
    @l
    public static final ScrollableState b(@l Function1 function10, @m Composer composer0, int v) {
        L.p(function10, "consumeScrollDelta");
        composer0.V(-180460798);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-180460798, v, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        State state0 = SnapshotStateKt.t(function10, composer0, v & 14);
        composer0.V(0xE2A708A4);
        ScrollableState scrollableState0 = composer0.W();
        if(scrollableState0 == Composer.a.a()) {
            scrollableState0 = ScrollableStateKt.a(new Function1(state0) {
                final State e;

                {
                    this.e = state0;
                    super(1);
                }

                @l
                public final Float b(float f) {
                    return (Float)((Function1)this.e.getValue()).invoke(f);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.b(((Number)object0).floatValue());
                }
            });
            composer0.O(scrollableState0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return scrollableState0;
    }
}

