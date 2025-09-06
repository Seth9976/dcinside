package androidx.compose.foundation.lazy;

import A3.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,457:1\n50#2:458\n49#2:459\n1114#3,6:460\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n64#1:458\n64#1:459\n64#1:460,6\n*E\n"})
public final class LazyListStateKt {
    @Composable
    @l
    public static final LazyListState a(int v, int v1, @m Composer composer0, int v2, int v3) {
        composer0.V(1470655220);
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(1470655220, v2, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:59)");
        }
        Saver saver0 = LazyListState.v.a();
        composer0.V(0x1E7B2B64);
        boolean z = composer0.t(v);
        boolean z1 = composer0.t(v1);
        androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState.1.1 lazyListStateKt$rememberLazyListState$1$10 = composer0.W();
        if(z || z1 || lazyListStateKt$rememberLazyListState$1$10 == Composer.a.a()) {
            lazyListStateKt$rememberLazyListState$1$10 = new a(v, v1) {
                final int e;
                final int f;

                {
                    this.e = v;
                    this.f = v1;
                    super(0);
                }

                @l
                public final LazyListState b() {
                    return new LazyListState(this.e, this.f);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
            composer0.O(lazyListStateKt$rememberLazyListState$1$10);
        }
        composer0.g0();
        LazyListState lazyListState0 = (LazyListState)RememberSaveableKt.d(new Object[0], saver0, null, lazyListStateKt$rememberLazyListState$1$10, composer0, 72, 4);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyListState0;
    }
}

