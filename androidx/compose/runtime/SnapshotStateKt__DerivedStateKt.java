package androidx.compose.runtime;

import A3.a;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;

@s0({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,346:1\n1162#2:347\n1182#2:370\n1161#2,2:371\n460#3,11:348\n460#3,11:359\n48#3:373\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n311#1:347\n334#1:370\n334#1:371,2\n312#1:348,11\n316#1:359,11\n343#1:373\n*E\n"})
final class SnapshotStateKt__DerivedStateKt {
    @l
    private static final SnapshotThreadLocal a;
    @l
    private static final SnapshotThreadLocal b;

    static {
        SnapshotStateKt__DerivedStateKt.a = new SnapshotThreadLocal();
        SnapshotStateKt__DerivedStateKt.b = new SnapshotThreadLocal();
    }

    @l
    public static final State c(@l a a0) {
        L.p(a0, "calculation");
        return new DerivedSnapshotState(a0, null);
    }

    @l
    public static final State d(@l SnapshotMutationPolicy snapshotMutationPolicy0, @l a a0) {
        L.p(snapshotMutationPolicy0, "policy");
        L.p(a0, "calculation");
        return new DerivedSnapshotState(a0, snapshotMutationPolicy0);
    }

    private static final Object e(DerivedState derivedState0, a a0) {
        Object object0;
        MutableVector mutableVector0 = (MutableVector)SnapshotStateKt__DerivedStateKt.b.a();
        int v = 0;
        if(mutableVector0 == null) {
            mutableVector0 = new MutableVector(new V[0], 0);
        }
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            int v2 = 0;
            while(true) {
                ((Function1)((V)arr_object[v2]).a()).invoke(derivedState0);
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        try {
            object0 = a0.invoke();
            int v3 = mutableVector0.J();
        }
        catch(Throwable throwable0) {
            int v4 = mutableVector0.J();
            if(v4 > 0) {
                Object[] arr_object1 = mutableVector0.F();
                while(true) {
                    ((Function1)((V)arr_object1[v]).b()).invoke(derivedState0);
                    ++v;
                    if(v >= v4) {
                        break;
                    }
                }
            }
            throw throwable0;
        }
        if(v3 > 0) {
            Object[] arr_object2 = mutableVector0.F();
            while(true) {
                ((Function1)((V)arr_object2[v]).b()).invoke(derivedState0);
                ++v;
                if(v >= v3) {
                    break;
                }
            }
        }
        return object0;
    }

    public static final void f(@l Function1 function10, @l Function1 function11, @l a a0) {
        L.p(function10, "start");
        L.p(function11, "done");
        L.p(a0, "block");
        SnapshotThreadLocal snapshotThreadLocal0 = SnapshotStateKt__DerivedStateKt.b;
        MutableVector mutableVector0 = (MutableVector)snapshotThreadLocal0.a();
        if(mutableVector0 == null) {
            mutableVector0 = new MutableVector(new V[16], 0);
            snapshotThreadLocal0.b(mutableVector0);
        }
        V v0 = r0.a(function10, function11);
        try {
            mutableVector0.b(v0);
            a0.invoke();
        }
        finally {
            mutableVector0.e0(mutableVector0.J() - 1);
        }
    }
}

