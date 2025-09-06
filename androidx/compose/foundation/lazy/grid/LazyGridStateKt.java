package androidx.compose.foundation.lazy.grid;

import A3.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,460:1\n50#2:461\n49#2:462\n1114#3,6:463\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n*L\n62#1:461\n62#1:462\n62#1:463,6\n*E\n"})
public final class LazyGridStateKt {
    @Composable
    @l
    public static final LazyGridState a(int v, int v1, @m Composer composer0, int v2, int v3) {
        composer0.V(0x1BD5B8C);
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x1BD5B8C, v2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:57)");
        }
        Saver saver0 = LazyGridState.x.a();
        composer0.V(0x1E7B2B64);
        boolean z = composer0.t(v);
        boolean z1 = composer0.t(v1);
        androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState.1.1 lazyGridStateKt$rememberLazyGridState$1$10 = composer0.W();
        if(z || z1 || lazyGridStateKt$rememberLazyGridState$1$10 == Composer.a.a()) {
            lazyGridStateKt$rememberLazyGridState$1$10 = new a(v, v1) {
                final int e;
                final int f;

                {
                    this.e = v;
                    this.f = v1;
                    super(0);
                }

                @l
                public final LazyGridState b() {
                    return new LazyGridState(this.e, this.f);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
            composer0.O(lazyGridStateKt$rememberLazyGridState$1$10);
        }
        composer0.g0();
        LazyGridState lazyGridState0 = (LazyGridState)RememberSaveableKt.d(new Object[0], saver0, null, lazyGridStateKt$rememberLazyGridState$1$10, composer0, 72, 4);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyGridState0;
    }
}

