package androidx.compose.runtime;

import A3.a;
import A3.o;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,255:1\n125#2:256\n152#2,3:257\n37#3,2:260\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n250#1:256\n250#1:257,3\n251#1:260,2\n*E\n"})
public final class CompositionLocalKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(@l CompositionLocalContext compositionLocalContext0, @l o o0, @m Composer composer0, int v) {
        L.p(compositionLocalContext0, "context");
        L.p(o0, "content");
        Composer composer1 = composer0.G(0x6E803C08);
        int v1 = (v & 14) == 0 ? (composer1.t(compositionLocalContext0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.Y(o0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x6E803C08, v1, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:246)");
            }
            PersistentMap persistentMap0 = compositionLocalContext0.a();
            ArrayList arrayList0 = new ArrayList(persistentMap0.size());
            for(Object object0: persistentMap0.entrySet()) {
                Object object1 = ((Map.Entry)object0).getKey();
                L.n(object1, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
                arrayList0.add(((ProvidableCompositionLocal)object1).f(((State)((Map.Entry)object0).getValue()).getValue()));
            }
            ProvidedValue[] arr_providedValue = (ProvidedValue[])arrayList0.toArray(new ProvidedValue[0]);
            CompositionLocalKt.b(((ProvidedValue[])Arrays.copyOf(arr_providedValue, arr_providedValue.length)), o0, composer1, v1 & 0x70 | 8);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(compositionLocalContext0, o0, v) {
                final CompositionLocalContext e;
                final o f;
                final int g;

                {
                    this.e = compositionLocalContext0;
                    this.f = o0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CompositionLocalKt.a(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void b(@l ProvidedValue[] arr_providedValue, @l o o0, @m Composer composer0, int v) {
        L.p(arr_providedValue, "values");
        L.p(o0, "content");
        Composer composer1 = composer0.G(-1390796515);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1390796515, v, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        composer1.u(arr_providedValue);
        o0.invoke(composer1, ((int)(v >> 3 & 14)));
        composer1.d0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(arr_providedValue, o0, v) {
                final ProvidedValue[] e;
                final o f;
                final int g;

                {
                    this.e = arr_providedValue;
                    this.f = o0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CompositionLocalKt.b(((ProvidedValue[])Arrays.copyOf(this.e, this.e.length)), this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @l
    public static final ProvidableCompositionLocal c(@l SnapshotMutationPolicy snapshotMutationPolicy0, @l a a0) {
        L.p(snapshotMutationPolicy0, "policy");
        L.p(a0, "defaultFactory");
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy0, a0);
    }

    public static ProvidableCompositionLocal d(SnapshotMutationPolicy snapshotMutationPolicy0, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            snapshotMutationPolicy0 = SnapshotStateKt.w();
        }
        return CompositionLocalKt.c(snapshotMutationPolicy0, a0);
    }

    @l
    public static final ProvidableCompositionLocal e(@l a a0) {
        L.p(a0, "defaultFactory");
        return new StaticProvidableCompositionLocal(a0);
    }
}

