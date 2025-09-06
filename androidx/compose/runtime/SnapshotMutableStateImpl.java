package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,298:1\n2180#2:299\n2101#2,2:300\n1686#2:302\n2103#2,5:304\n2180#2:309\n2180#2:310\n70#3:303\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n131#1:299\n133#1:300,2\n133#1:302\n133#1:304,5\n174#1:309\n210#1:310\n133#1:303\n*E\n"})
public class SnapshotMutableStateImpl implements SnapshotMutableState, StateObject {
    static final class StateStateRecord extends StateRecord {
        private Object d;

        public StateStateRecord(Object object0) {
            this.d = object0;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void a(@l StateRecord stateRecord0) {
            L.p(stateRecord0, "value");
            this.d = ((StateStateRecord)stateRecord0).d;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord b() {
            return new StateStateRecord(this.d);
        }

        public final Object g() {
            return this.d;
        }

        public final void h(Object object0) {
            this.d = object0;
        }
    }

    @l
    private final SnapshotMutationPolicy a;
    @l
    private StateStateRecord b;

    public SnapshotMutableStateImpl(Object object0, @l SnapshotMutationPolicy snapshotMutationPolicy0) {
        L.p(snapshotMutationPolicy0, "policy");
        super();
        this.a = snapshotMutationPolicy0;
        this.b = new StateStateRecord(object0);
    }

    @Override  // androidx.compose.runtime.snapshots.SnapshotMutableState
    @l
    public SnapshotMutationPolicy a() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void d(@l StateRecord stateRecord0) {
        L.p(stateRecord0, "value");
        this.b = (StateStateRecord)stateRecord0;
    }

    @Override  // androidx.compose.runtime.MutableState
    @l
    public Function1 f() {
        return new Function1() {
            final SnapshotMutableStateImpl e;

            {
                this.e = snapshotMutableStateImpl0;
                super(1);
            }

            public final void a(Object object0) {
                this.e.setValue(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(object0);
                return S0.a;
            }
        };
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @m
    public StateRecord g(@l StateRecord stateRecord0, @l StateRecord stateRecord1, @l StateRecord stateRecord2) {
        L.p(stateRecord0, "previous");
        L.p(stateRecord1, "current");
        L.p(stateRecord2, "applied");
        if(!this.a().a(((StateStateRecord)stateRecord1).g(), ((StateStateRecord)stateRecord2).g())) {
            Object object0 = this.a().b(((StateStateRecord)stateRecord0).g(), ((StateStateRecord)stateRecord1).g(), ((StateStateRecord)stateRecord2).g());
            if(object0 != null) {
                stateRecord1 = ((StateStateRecord)stateRecord2).b();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
                ((StateStateRecord)stateRecord1).h(object0);
                return stateRecord1;
            }
            return null;
        }
        return stateRecord1;
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object getValue() {
        return ((StateStateRecord)SnapshotKt.V(this.b, this)).g();
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord h() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object l() {
        return this.getValue();
    }

    @i(name = "getDebuggerDisplayValue")
    public final Object m() {
        return ((StateStateRecord)SnapshotKt.B(this.b)).g();
    }

    public static void o() {
    }

    public static void q() {
    }

    @Override  // androidx.compose.runtime.MutableState
    public void setValue(Object object0) {
        Snapshot snapshot0;
        StateStateRecord snapshotMutableStateImpl$StateStateRecord0 = (StateStateRecord)SnapshotKt.B(this.b);
        if(!this.a().a(snapshotMutableStateImpl$StateStateRecord0.g(), object0)) {
            StateStateRecord snapshotMutableStateImpl$StateStateRecord1 = this.b;
            synchronized(SnapshotKt.E()) {
                snapshot0 = Snapshot.e.b();
                ((StateStateRecord)SnapshotKt.R(snapshotMutableStateImpl$StateStateRecord1, this, snapshot0, snapshotMutableStateImpl$StateStateRecord0)).h(object0);
            }
            SnapshotKt.O(snapshot0, this);
        }
    }

    @Override
    @l
    public String toString() {
        return "MutableState(value=" + ((StateStateRecord)SnapshotKt.B(this.b)).g() + ")@" + this.hashCode();
    }
}

