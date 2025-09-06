package androidx.compose.runtime;

import A3.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/DynamicProvidableCompositionLocal\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,255:1\n25#2:256\n1114#3,6:257\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/DynamicProvidableCompositionLocal\n*L\n126#1:256\n126#1:257,6\n*E\n"})
public final class DynamicProvidableCompositionLocal extends ProvidableCompositionLocal {
    @l
    private final SnapshotMutationPolicy d;

    public DynamicProvidableCompositionLocal(@l SnapshotMutationPolicy snapshotMutationPolicy0, @l a a0) {
        L.p(snapshotMutationPolicy0, "policy");
        L.p(a0, "defaultFactory");
        super(a0);
        this.d = snapshotMutationPolicy0;
    }

    @Override  // androidx.compose.runtime.CompositionLocal
    @Composable
    @l
    public State e(Object object0, @m Composer composer0, int v) {
        composer0.V(-84026900);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-84026900, v, -1, "androidx.compose.runtime.DynamicProvidableCompositionLocal.provided (CompositionLocal.kt:125)");
        }
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        if(mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt.j(object0, this.d);
            composer0.O(mutableState0);
        }
        composer0.g0();
        mutableState0.setValue(object0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return mutableState0;
    }
}

