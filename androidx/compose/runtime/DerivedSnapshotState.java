package androidx.compose.runtime;

import A3.a;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.S0;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 7 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 8 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,346:1\n311#2:347\n312#2:349\n313#2,2:361\n316#2,2:368\n311#2:370\n312#2:372\n313#2,5:384\n1162#3:348\n1162#3:371\n460#4,11:350\n460#4,11:373\n146#5,5:363\n1686#6:389\n2180#6:391\n2180#6:392\n2180#6:393\n2180#6:395\n2180#6:396\n2180#6:397\n70#7:390\n26#8:394\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n143#1:347\n143#1:349\n143#1:361,2\n143#1:368,2\n158#1:370\n158#1:372\n158#1:384,5\n143#1:348\n158#1:371\n143#1:350,11\n158#1:373,11\n146#1:363,5\n180#1:389\n222#1:391\n229#1:392\n235#1:393\n241#1:395\n252#1:396\n260#1:397\n180#1:390\n238#1:394\n*E\n"})
final class DerivedSnapshotState implements DerivedState, StateObject {
    @StabilityInferred(parameters = 0)
    @s0({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,346:1\n1686#2:347\n70#3:348\n311#4:349\n312#4:351\n313#4,2:363\n316#4,2:370\n1162#5:350\n460#6,11:352\n146#7,5:365\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n95#1:347\n95#1:348\n97#1:349\n97#1:351\n97#1:363,2\n97#1:370,2\n97#1:350\n97#1:352,11\n98#1:365,5\n*E\n"})
    public static final class ResultRecord extends StateRecord {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @l
            public final Object a() {
                return ResultRecord.i;
            }
        }

        @m
        private IdentityArrayMap d;
        @m
        private Object e;
        private int f;
        @l
        public static final Companion g;
        public static final int h;
        @l
        private static final Object i;

        static {
            ResultRecord.g = new Companion(null);
            ResultRecord.h = 8;
            ResultRecord.i = new Object();
        }

        public ResultRecord() {
            this.e = ResultRecord.i;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void a(@l StateRecord stateRecord0) {
            L.p(stateRecord0, "value");
            this.d = ((ResultRecord)stateRecord0).d;
            this.e = ((ResultRecord)stateRecord0).e;
            this.f = ((ResultRecord)stateRecord0).f;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord b() {
            return new ResultRecord();
        }

        @m
        public final IdentityArrayMap h() {
            return this.d;
        }

        @m
        public final Object i() {
            return this.e;
        }

        public final int j() {
            return this.f;
        }

        public final boolean k(@l DerivedState derivedState0, @l Snapshot snapshot0) {
            L.p(derivedState0, "derivedState");
            L.p(snapshot0, "snapshot");
            return this.e != ResultRecord.i && this.f == this.l(derivedState0, snapshot0);
        }

        public final int l(@l DerivedState derivedState0, @l Snapshot snapshot0) {
            L.p(derivedState0, "derivedState");
            L.p(snapshot0, "snapshot");
            Object object0 = SnapshotKt.E();
            __monitor_enter(object0);
            IdentityArrayMap identityArrayMap0 = this.d;
            __monitor_exit(object0);
            int v = 7;
            if(identityArrayMap0 != null) {
                MutableVector mutableVector0 = (MutableVector)SnapshotStateKt__DerivedStateKt.b.a();
                int v1 = 0;
                if(mutableVector0 == null) {
                    mutableVector0 = new MutableVector(new V[0], 0);
                }
                int v2 = mutableVector0.J();
                if(v2 > 0) {
                    Object[] arr_object = mutableVector0.F();
                    int v3 = 0;
                    while(true) {
                        ((Function1)((V)arr_object[v3]).a()).invoke(derivedState0);
                        ++v3;
                        if(v3 >= v2) {
                            break;
                        }
                    }
                }
                try {
                    int v4 = identityArrayMap0.h();
                    for(int v5 = 0; v5 < v4; ++v5) {
                        Object object1 = identityArrayMap0.g()[v5];
                        L.n(object1, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        int v6 = ((Number)identityArrayMap0.i()[v5]).intValue();
                        StateObject stateObject0 = (StateObject)object1;
                        if(v6 == 1) {
                            StateRecord stateRecord0 = stateObject0 instanceof DerivedSnapshotState ? ((DerivedSnapshotState)stateObject0).b(snapshot0) : SnapshotKt.C(stateObject0.h(), snapshot0);
                            v = (v * 0x1F + ActualJvm_jvmKt.b(stateRecord0)) * 0x1F + stateRecord0.d();
                        }
                    }
                }
                catch(Throwable throwable0) {
                    int v7 = mutableVector0.J();
                    if(v7 > 0) {
                        Object[] arr_object1 = mutableVector0.F();
                        while(true) {
                            ((Function1)((V)arr_object1[v1]).b()).invoke(derivedState0);
                            ++v1;
                            if(v1 >= v7) {
                                break;
                            }
                        }
                    }
                    throw throwable0;
                }
                int v8 = mutableVector0.J();
                if(v8 > 0) {
                    Object[] arr_object2 = mutableVector0.F();
                    do {
                        ((Function1)((V)arr_object2[v1]).b()).invoke(derivedState0);
                        ++v1;
                    }
                    while(v1 < v8);
                    return v;
                }
            }
            return v;
        }

        public final void m(@m IdentityArrayMap identityArrayMap0) {
            this.d = identityArrayMap0;
        }

        public final void n(@m Object object0) {
            this.e = object0;
        }

        public final void o(int v) {
            this.f = v;
        }
    }

    @l
    private final a a;
    @m
    private final SnapshotMutationPolicy b;
    @l
    private ResultRecord c;

    public DerivedSnapshotState(@l a a0, @m SnapshotMutationPolicy snapshotMutationPolicy0) {
        L.p(a0, "calculation");
        super();
        this.a = a0;
        this.b = snapshotMutationPolicy0;
        this.c = new ResultRecord();
    }

    @Override  // androidx.compose.runtime.DerivedState
    @m
    public SnapshotMutationPolicy a() {
        return this.b;
    }

    @l
    public final StateRecord b(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        return this.j(((ResultRecord)SnapshotKt.C(this.c, snapshot0)), snapshot0, false, this.a);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void d(@l StateRecord stateRecord0) {
        L.p(stateRecord0, "value");
        this.c = (ResultRecord)stateRecord0;
    }

    @Override  // androidx.compose.runtime.DerivedState
    public Object e() {
        return this.j(((ResultRecord)SnapshotKt.B(this.c)), Snapshot.e.b(), false, this.a).i();
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord g(StateRecord stateRecord0, StateRecord stateRecord1, StateRecord stateRecord2) {
        return androidx.compose.runtime.snapshots.a.a(this, stateRecord0, stateRecord1, stateRecord2);
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        androidx.compose.runtime.snapshots.Snapshot.Companion snapshot$Companion0 = Snapshot.e;
        Function1 function10 = snapshot$Companion0.b().j();
        if(function10 != null) {
            function10.invoke(this);
        }
        return this.j(((ResultRecord)SnapshotKt.B(this.c)), snapshot$Companion0.b(), true, this.a).i();
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord h() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.DerivedState
    @l
    public Object[] i() {
        IdentityArrayMap identityArrayMap0 = this.j(((ResultRecord)SnapshotKt.B(this.c)), Snapshot.e.b(), false, this.a).h();
        if(identityArrayMap0 != null) {
            Object[] arr_object = identityArrayMap0.g();
            return arr_object == null ? new Object[0] : arr_object;
        }
        return new Object[0];
    }

    private final ResultRecord j(ResultRecord derivedSnapshotState$ResultRecord0, Snapshot snapshot0, boolean z, a a0) {
        androidx.compose.runtime.snapshots.Snapshot.Companion snapshot$Companion0;
        Object object1;
        int v = 0;
        if(derivedSnapshotState$ResultRecord0.k(this, snapshot0)) {
            if(z) {
                MutableVector mutableVector0 = (MutableVector)SnapshotStateKt__DerivedStateKt.b.a();
                if(mutableVector0 == null) {
                    mutableVector0 = new MutableVector(new V[0], 0);
                }
                int v1 = mutableVector0.J();
                if(v1 > 0) {
                    Object[] arr_object = mutableVector0.F();
                    int v2 = 0;
                    while(true) {
                        ((Function1)((V)arr_object[v2]).a()).invoke(this);
                        ++v2;
                        if(v2 >= v1) {
                            break;
                        }
                    }
                }
                try {
                    IdentityArrayMap identityArrayMap0 = derivedSnapshotState$ResultRecord0.h();
                    Integer integer0 = (Integer)SnapshotStateKt__DerivedStateKt.a.a();
                    int v3 = integer0 == null ? 0 : ((int)integer0);
                    if(identityArrayMap0 != null) {
                        int v4 = identityArrayMap0.h();
                        for(int v5 = 0; v5 < v4; ++v5) {
                            Object object0 = identityArrayMap0.g()[v5];
                            L.n(object0, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            int v6 = ((Number)identityArrayMap0.i()[v5]).intValue();
                            StateObject stateObject0 = (StateObject)object0;
                            SnapshotStateKt__DerivedStateKt.a.b(((int)(v6 + v3)));
                            Function1 function10 = snapshot0.j();
                            if(function10 != null) {
                                function10.invoke(stateObject0);
                            }
                        }
                    }
                    SnapshotStateKt__DerivedStateKt.a.b(v3);
                    int v7 = mutableVector0.J();
                }
                catch(Throwable throwable0) {
                    int v8 = mutableVector0.J();
                    if(v8 > 0) {
                        Object[] arr_object1 = mutableVector0.F();
                        while(true) {
                            ((Function1)((V)arr_object1[v]).b()).invoke(this);
                            ++v;
                            if(v >= v8) {
                                break;
                            }
                        }
                    }
                    throw throwable0;
                }
                if(v7 > 0) {
                    Object[] arr_object2 = mutableVector0.F();
                    do {
                        ((Function1)((V)arr_object2[v]).b()).invoke(this);
                        ++v;
                    }
                    while(v < v7);
                    return derivedSnapshotState$ResultRecord0;
                }
            }
            return derivedSnapshotState$ResultRecord0;
        }
        Integer integer1 = (Integer)SnapshotStateKt__DerivedStateKt.a.a();
        int v9 = integer1 == null ? 0 : ((int)integer1);
        IdentityArrayMap identityArrayMap1 = new IdentityArrayMap(0, 1, null);
        MutableVector mutableVector1 = (MutableVector)SnapshotStateKt__DerivedStateKt.b.a();
        if(mutableVector1 == null) {
            mutableVector1 = new MutableVector(new V[0], 0);
        }
        int v10 = mutableVector1.J();
        if(v10 > 0) {
            Object[] arr_object3 = mutableVector1.F();
            int v11 = 0;
            while(true) {
                ((Function1)((V)arr_object3[v11]).a()).invoke(this);
                ++v11;
                if(v11 >= v10) {
                    break;
                }
            }
        }
        try {
            SnapshotStateKt__DerivedStateKt.a.b(((int)(v9 + 1)));
            androidx.compose.runtime.DerivedSnapshotState.currentRecord.result.1.result.1 derivedSnapshotState$currentRecord$result$1$result$10 = new Function1(identityArrayMap1, v9) {
                final DerivedSnapshotState e;
                final IdentityArrayMap f;
                final int g;

                {
                    this.e = derivedSnapshotState0;
                    this.f = identityArrayMap0;
                    this.g = v;
                    super(1);
                }

                public final void a(@l Object object0) {
                    L.p(object0, "it");
                    if(object0 == this.e) {
                        throw new IllegalStateException("A derived state calculation cannot read itself");
                    }
                    if(object0 instanceof StateObject) {
                        Object object1 = SnapshotStateKt__DerivedStateKt.a.a();
                        L.m(object1);
                        Integer integer0 = (Integer)this.f.f(object0);
                        this.f.o(object0, Math.min(((Number)object1).intValue() - this.g, (integer0 == null ? 0x7FFFFFFF : ((int)integer0))));
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(object0);
                    return S0.a;
                }
            };
            object1 = Snapshot.e.e(derivedSnapshotState$currentRecord$result$1$result$10, null, a0);
            SnapshotStateKt__DerivedStateKt.a.b(v9);
            int v12 = mutableVector1.J();
        }
        catch(Throwable throwable1) {
            int v13 = mutableVector1.J();
            if(v13 > 0) {
                Object[] arr_object4 = mutableVector1.F();
                while(true) {
                    ((Function1)((V)arr_object4[v]).b()).invoke(this);
                    ++v;
                    if(v >= v13) {
                        break;
                    }
                }
            }
            throw throwable1;
        }
        if(v12 > 0) {
            Object[] arr_object5 = mutableVector1.F();
            while(true) {
                ((Function1)((V)arr_object5[v]).b()).invoke(this);
                ++v;
                if(v >= v12) {
                    break;
                }
            }
        }
        synchronized(SnapshotKt.E()) {
            snapshot$Companion0 = Snapshot.e;
            Snapshot snapshot1 = snapshot$Companion0.b();
            if(derivedSnapshotState$ResultRecord0.i() == ResultRecord.g.a()) {
            label_91:
                derivedSnapshotState$ResultRecord0 = (ResultRecord)SnapshotKt.M(this.c, this, snapshot1);
                derivedSnapshotState$ResultRecord0.m(identityArrayMap1);
                derivedSnapshotState$ResultRecord0.o(derivedSnapshotState$ResultRecord0.l(this, snapshot1));
                derivedSnapshotState$ResultRecord0.n(object1);
            }
            else {
                SnapshotMutationPolicy snapshotMutationPolicy0 = this.a();
                if(snapshotMutationPolicy0 != null && snapshotMutationPolicy0.a(object1, derivedSnapshotState$ResultRecord0.i())) {
                    derivedSnapshotState$ResultRecord0.m(identityArrayMap1);
                    derivedSnapshotState$ResultRecord0.o(derivedSnapshotState$ResultRecord0.l(this, snapshot1));
                    goto label_95;
                }
                goto label_91;
            }
        }
    label_95:
        if(v9 == 0) {
            snapshot$Companion0.d();
        }
        return derivedSnapshotState$ResultRecord0;
    }

    private final String k() {
        ResultRecord derivedSnapshotState$ResultRecord0 = (ResultRecord)SnapshotKt.B(this.c);
        return derivedSnapshotState$ResultRecord0.k(this, Snapshot.e.b()) ? String.valueOf(derivedSnapshotState$ResultRecord0.i()) : "<Not calculated>";
    }

    @m
    @i(name = "getDebuggerDisplayValue")
    public final Object m() {
        ResultRecord derivedSnapshotState$ResultRecord0 = (ResultRecord)SnapshotKt.B(this.c);
        return derivedSnapshotState$ResultRecord0.k(this, Snapshot.e.b()) ? derivedSnapshotState$ResultRecord0.i() : null;
    }

    public static void n() {
    }

    @Override
    @l
    public String toString() {
        ResultRecord derivedSnapshotState$ResultRecord0 = (ResultRecord)SnapshotKt.B(this.c);
        return "DerivedState(value=" + this.k() + ")@" + this.hashCode();
    }
}

