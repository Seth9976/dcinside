package androidx.compose.foundation.lazy.layout;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,106:1\n76#2:107\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n*L\n43#1:107\n*E\n"})
public final class LazySaveableStateHolderKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(@l p p0, @m Composer composer0, int v) {
        L.p(p0, "content");
        Composer composer1 = composer0.G(0x282F3FA8);
        int v1 = (v & 14) == 0 ? (composer1.Y(p0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x282F3FA8, v1, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            SaveableStateRegistry saveableStateRegistry0 = (SaveableStateRegistry)composer1.L(SaveableStateRegistryKt.b());
            LazySaveableStateHolder lazySaveableStateHolder0 = (LazySaveableStateHolder)RememberSaveableKt.d(new Object[]{saveableStateRegistry0}, LazySaveableStateHolder.d.a(saveableStateRegistry0), null, new a(saveableStateRegistry0) {
                final SaveableStateRegistry e;

                {
                    this.e = saveableStateRegistry0;
                    super(0);
                }

                @l
                public final LazySaveableStateHolder b() {
                    Map map0 = Y.z();
                    return new LazySaveableStateHolder(this.e, map0);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }, composer1, 72, 4);
            CompositionLocalKt.b(new ProvidedValue[]{SaveableStateRegistryKt.b().f(lazySaveableStateHolder0)}, ComposableLambdaKt.b(composer1, 0x6F1942E8, true, new o(lazySaveableStateHolder0, p0, v1) {
                final LazySaveableStateHolder e;
                final p f;
                final int g;

                {
                    this.e = lazySaveableStateHolder0;
                    this.f = p0;
                    this.g = v;
                    super(2);
                }

                @Composable
                public final void a(@m Composer composer0, int v) {
                    if((v & 11) == 2 && composer0.c()) {
                        composer0.m();
                        return;
                    }
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(0x6F1942E8, v, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:48)");
                    }
                    SaveableStateHolder saveableStateHolder0 = SaveableStateHolderKt.a(composer0, 0);
                    this.e.i(saveableStateHolder0);
                    this.f.invoke(this.e, composer0, ((int)(this.g << 3 & 0x70 | 8)));
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            }), composer1, 56);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(p0, v) {
                final p e;
                final int f;

                {
                    this.e = p0;
                    this.f = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazySaveableStateHolderKt.a(this.e, composer0, (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
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

