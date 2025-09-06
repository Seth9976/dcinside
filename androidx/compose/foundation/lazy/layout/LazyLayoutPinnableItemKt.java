package androidx.compose.foundation.lazy.layout;

import A3.o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,161:1\n50#2:162\n49#2:163\n36#2:171\n1114#3,6:164\n1114#3,6:172\n76#4:170\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n49#1:162\n49#1:163\n52#1:171\n49#1:164,6\n52#1:172,6\n51#1:170\n*E\n"})
public final class LazyLayoutPinnableItemKt {
    @ExperimentalFoundationApi
    @Composable
    public static final void a(@m Object object0, int v, @l LazyLayoutPinnedItemList lazyLayoutPinnedItemList0, @l o o0, @m Composer composer0, int v1) {
        L.p(lazyLayoutPinnedItemList0, "pinnedItemList");
        L.p(o0, "content");
        Composer composer1 = composer0.G(-2079116560);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-2079116560, v1, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:42)");
        }
        composer1.V(0x1E7B2B64);
        boolean z = composer1.t(object0);
        boolean z1 = composer1.t(lazyLayoutPinnedItemList0);
        LazyLayoutPinnableItem lazyLayoutPinnableItem0 = composer1.W();
        if(z || z1 || lazyLayoutPinnableItem0 == Composer.a.a()) {
            lazyLayoutPinnableItem0 = new LazyLayoutPinnableItem(object0, lazyLayoutPinnedItemList0);
            composer1.O(lazyLayoutPinnableItem0);
        }
        composer1.g0();
        lazyLayoutPinnableItem0.g(v);
        lazyLayoutPinnableItem0.i(((PinnableContainer)composer1.L(PinnableContainerKt.a())));
        composer1.V(0x44FAF204);
        boolean z2 = composer1.t(lazyLayoutPinnableItem0);
        androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.LazyLayoutPinnableItem.1.1 lazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$10 = composer1.W();
        if(z2 || lazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$10 == Composer.a.a()) {
            lazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$10 = new Function1(lazyLayoutPinnableItem0) {
                final LazyLayoutPinnableItem e;

                {
                    this.e = lazyLayoutPinnableItem0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.a.f();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            };
            composer1.O(lazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$10);
        }
        composer1.g0();
        EffectsKt.c(lazyLayoutPinnableItem0, lazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$10, composer1, 0);
        CompositionLocalKt.b(new ProvidedValue[]{PinnableContainerKt.a().f(lazyLayoutPinnableItem0)}, o0, composer1, v1 >> 6 & 0x70 | 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, v, lazyLayoutPinnedItemList0, o0, v1) {
                final Object e;
                final int f;
                final LazyLayoutPinnedItemList g;
                final o h;
                final int i;

                {
                    this.e = object0;
                    this.f = v;
                    this.g = lazyLayoutPinnedItemList0;
                    this.h = o0;
                    this.i = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyLayoutPinnableItemKt.a(this.e, this.f, this.g, this.h, composer0, (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }
}

