package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1390#1:2192\n1390#1:2193\n*E\n"})
public final class NestedMutableSnapshot extends MutableSnapshot {
    @l
    private final MutableSnapshot o;
    private boolean p;

    public NestedMutableSnapshot(int v, @l SnapshotIdSet snapshotIdSet0, @m Function1 function10, @m Function1 function11, @l MutableSnapshot mutableSnapshot0) {
        L.p(snapshotIdSet0, "invalid");
        L.p(mutableSnapshot0, "parent");
        super(v, snapshotIdSet0, function10, function11);
        this.o = mutableSnapshot0;
        mutableSnapshot0.q(this);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public SnapshotApplyResult J() {
        SnapshotApplyResult snapshotApplyResult0;
        Map map0;
        if(!this.o.K() && !this.o.f()) {
            Set set0 = this.i();
            int v = this.g();
            if(set0 == null) {
                map0 = null;
            }
            else {
                SnapshotIdSet snapshotIdSet0 = this.o.h();
                map0 = SnapshotKt.P(this.o, this, snapshotIdSet0);
            }
            Object object0 = SnapshotKt.E();
            __monitor_enter(object0);
            try {
                SnapshotKt.g0(this);
                if(set0 == null || set0.size() == 0) {
                    this.b();
                    goto label_21;
                }
                snapshotApplyResult0 = this.N(this.o.g(), map0, this.o.h());
                if(L.g(snapshotApplyResult0, Success.b)) {
                    Set set1 = this.o.i();
                    if(set1 == null) {
                        set1 = new HashSet();
                        this.o.U(set1);
                    }
                    set1.addAll(set0);
                label_21:
                    if(this.o.g() < v) {
                        this.o.I();
                    }
                    SnapshotIdSet snapshotIdSet1 = this.o.h().j(v).i(this.L());
                    this.o.z(snapshotIdSet1);
                    this.o.O(v);
                    int v1 = this.C();
                    this.o.Q(v1);
                    this.o.P(this.L());
                    this.o.R(this.M());
                    goto label_34;
                }
                goto label_38;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(object0);
            throw throwable0;
        label_34:
            __monitor_exit(object0);
            this.T(true);
            this.b0();
            return Success.b;
        label_38:
            __monitor_exit(object0);
            return snapshotApplyResult0;
        }
        return new Failure(this);
    }

    private final void b0() {
        if(!this.p) {
            this.p = true;
            this.o.r(this);
        }
    }

    @l
    public final MutableSnapshot c0() {
        return this.o;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void d() {
        if(!this.f()) {
            super.d();
            this.b0();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public Snapshot l() {
        return this.o.l();
    }
}

