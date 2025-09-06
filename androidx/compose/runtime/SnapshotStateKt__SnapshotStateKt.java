package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.o;
import y4.l;
import y4.m;

@s0({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,298:1\n1#2:299\n25#3:300\n1114#4,6:301\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n295#1:300\n295#1:301,6\n*E\n"})
final class SnapshotStateKt__SnapshotStateKt {
    public static final Object a(@l State state0, @m Object object0, @l o o0) {
        L.p(state0, "<this>");
        L.p(o0, "property");
        return state0.getValue();
    }

    @l
    public static final SnapshotStateList b() {
        return new SnapshotStateList();
    }

    @l
    public static final SnapshotStateList c(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        SnapshotStateList snapshotStateList0 = new SnapshotStateList();
        snapshotStateList0.addAll(kotlin.collections.l.Ky(arr_object));
        return snapshotStateList0;
    }

    @l
    public static final SnapshotStateMap d() {
        return new SnapshotStateMap();
    }

    @l
    public static final SnapshotStateMap e(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        SnapshotStateMap snapshotStateMap0 = new SnapshotStateMap();
        snapshotStateMap0.putAll(Y.H0(arr_v));
        return snapshotStateMap0;
    }

    @l
    public static final MutableState f(Object object0, @l SnapshotMutationPolicy snapshotMutationPolicy0) {
        L.p(snapshotMutationPolicy0, "policy");
        return ActualAndroid_androidKt.a(object0, snapshotMutationPolicy0);
    }

    public static MutableState g(Object object0, SnapshotMutationPolicy snapshotMutationPolicy0, int v, Object object1) {
        if((v & 2) != 0) {
            snapshotMutationPolicy0 = SnapshotStateKt.w();
        }
        return SnapshotStateKt.j(object0, snapshotMutationPolicy0);
    }

    @Composable
    @l
    public static final State h(Object object0, @m Composer composer0, int v) {
        composer0.V(0xC0EB518E);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xC0EB518E, v, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:294)");
        }
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        if(mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
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

    public static final void i(@l MutableState mutableState0, @m Object object0, @l o o0, Object object1) {
        L.p(mutableState0, "<this>");
        L.p(o0, "property");
        mutableState0.setValue(object1);
    }

    @l
    public static final SnapshotStateList j(@l Collection collection0) {
        L.p(collection0, "<this>");
        SnapshotStateList snapshotStateList0 = new SnapshotStateList();
        snapshotStateList0.addAll(collection0);
        return snapshotStateList0;
    }

    @l
    public static final SnapshotStateMap k(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        SnapshotStateMap snapshotStateMap0 = new SnapshotStateMap();
        snapshotStateMap0.putAll(Y.B0(iterable0));
        return snapshotStateMap0;
    }
}

