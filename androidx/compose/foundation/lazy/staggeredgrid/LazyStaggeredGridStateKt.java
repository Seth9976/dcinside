package androidx.compose.foundation.lazy.staggeredgrid;

import A3.a;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,477:1\n50#2:478\n49#2:479\n1114#3,6:480\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n*L\n67#1:478\n67#1:479\n67#1:480,6\n*E\n"})
public final class LazyStaggeredGridStateKt {
    @ExperimentalFoundationApi
    @Composable
    @l
    public static final LazyStaggeredGridState a(int v, int v1, @m Composer composer0, int v2, int v3) {
        composer0.V(0x99AE3C4);
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x99AE3C4, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:62)");
        }
        Saver saver0 = LazyStaggeredGridState.x.a();
        composer0.V(0x1E7B2B64);
        boolean z = composer0.t(v);
        boolean z1 = composer0.t(v1);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState.1.1 lazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$10 = composer0.W();
        if(z || z1 || lazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$10 == Composer.a.a()) {
            lazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$10 = new a(v, v1) {
                final int e;
                final int f;

                {
                    this.e = v;
                    this.f = v1;
                    super(0);
                }

                @l
                public final LazyStaggeredGridState b() {
                    return new LazyStaggeredGridState(this.e, this.f);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
            composer0.O(lazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$10);
        }
        composer0.g0();
        LazyStaggeredGridState lazyStaggeredGridState0 = (LazyStaggeredGridState)RememberSaveableKt.d(new Object[0], saver0, null, lazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$10, composer0, 72, 4);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyStaggeredGridState0;
    }
}

