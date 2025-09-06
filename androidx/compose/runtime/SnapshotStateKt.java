package androidx.compose.runtime;

import A3.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import kotlin.V;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.o;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public final class SnapshotStateKt {
    @Composable
    @l
    public static final State a(@l i i0, Object object0, @m g g0, @m Composer composer0, int v, int v1) {
        return SnapshotStateKt__SnapshotFlowKt.b(i0, object0, g0, composer0, v, v1);
    }

    @Composable
    @l
    public static final State b(@l U u0, @m g g0, @m Composer composer0, int v, int v1) {
        return SnapshotStateKt__SnapshotFlowKt.c(u0, g0, composer0, v, v1);
    }

    @l
    public static final State c(@l a a0) {
        return SnapshotStateKt__DerivedStateKt.c(a0);
    }

    @l
    public static final State d(@l SnapshotMutationPolicy snapshotMutationPolicy0, @l a a0) {
        return SnapshotStateKt__DerivedStateKt.d(snapshotMutationPolicy0, a0);
    }

    public static final Object e(@l State state0, @m Object object0, @l o o0) {
        return SnapshotStateKt__SnapshotStateKt.a(state0, object0, o0);
    }

    @l
    public static final SnapshotStateList f() {
        return SnapshotStateKt__SnapshotStateKt.b();
    }

    @l
    public static final SnapshotStateList g(@l Object[] arr_object) {
        return SnapshotStateKt__SnapshotStateKt.c(arr_object);
    }

    @l
    public static final SnapshotStateMap h() {
        return SnapshotStateKt__SnapshotStateKt.d();
    }

    @l
    public static final SnapshotStateMap i(@l V[] arr_v) {
        return SnapshotStateKt__SnapshotStateKt.e(arr_v);
    }

    @l
    public static final MutableState j(Object object0, @l SnapshotMutationPolicy snapshotMutationPolicy0) {
        return SnapshotStateKt__SnapshotStateKt.f(object0, snapshotMutationPolicy0);
    }

    @l
    public static final SnapshotMutationPolicy l() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.a();
    }

    public static final void m(@l Function1 function10, @l Function1 function11, @l a a0) {
        SnapshotStateKt__DerivedStateKt.f(function10, function11, a0);
    }

    @Composable
    @l
    public static final State n(Object object0, @l A3.o o0, @m Composer composer0, int v) {
        return SnapshotStateKt__ProduceStateKt.a(object0, o0, composer0, v);
    }

    @Composable
    @l
    public static final State o(Object object0, @m Object object1, @l A3.o o0, @m Composer composer0, int v) {
        return SnapshotStateKt__ProduceStateKt.b(object0, object1, o0, composer0, v);
    }

    @Composable
    @l
    public static final State p(Object object0, @m Object object1, @m Object object2, @l A3.o o0, @m Composer composer0, int v) {
        return SnapshotStateKt__ProduceStateKt.c(object0, object1, object2, o0, composer0, v);
    }

    @Composable
    @l
    public static final State q(Object object0, @m Object object1, @m Object object2, @m Object object3, @l A3.o o0, @m Composer composer0, int v) {
        return SnapshotStateKt__ProduceStateKt.d(object0, object1, object2, object3, o0, composer0, v);
    }

    @Composable
    @l
    public static final State r(Object object0, @l Object[] arr_object, @l A3.o o0, @m Composer composer0, int v) {
        return SnapshotStateKt__ProduceStateKt.e(object0, arr_object, o0, composer0, v);
    }

    @l
    public static final SnapshotMutationPolicy s() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.b();
    }

    @Composable
    @l
    public static final State t(Object object0, @m Composer composer0, int v) {
        return SnapshotStateKt__SnapshotStateKt.h(object0, composer0, v);
    }

    public static final void u(@l MutableState mutableState0, @m Object object0, @l o o0, Object object1) {
        SnapshotStateKt__SnapshotStateKt.i(mutableState0, object0, o0, object1);
    }

    @l
    public static final i v(@l a a0) {
        return SnapshotStateKt__SnapshotFlowKt.e(a0);
    }

    @l
    public static final SnapshotMutationPolicy w() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.c();
    }

    @l
    public static final SnapshotStateList x(@l Collection collection0) {
        return SnapshotStateKt__SnapshotStateKt.j(collection0);
    }

    @l
    public static final SnapshotStateMap y(@l Iterable iterable0) {
        return SnapshotStateKt__SnapshotStateKt.k(iterable0);
    }
}

