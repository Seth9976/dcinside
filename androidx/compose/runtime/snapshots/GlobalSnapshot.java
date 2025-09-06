package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.y;
import y4.l;
import y4.m;

@s0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n1686#2:2194\n70#3:2193\n70#3:2195\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1292#1:2192\n1346#1:2194\n1292#1:2193\n1346#1:2195\n*E\n"})
public final class GlobalSnapshot extends MutableSnapshot {
    public GlobalSnapshot(int v, @l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "invalid");
        Function1 function10;
        synchronized(SnapshotKt.E()) {
            List list0 = SnapshotKt.i.isEmpty() ? null : u.Y5(SnapshotKt.i);
            if(list0 == null) {
                function10 = null;
            }
            else {
                function10 = (Function1)u.k5(list0);
                if(function10 == null) {
                    function10 = new Function1() {
                        final List e;

                        {
                            this.e = list0;
                            super(1);
                        }

                        public final void a(@l Object object0) {
                            L.p(object0, "state");
                            List list0 = this.e;
                            int v = list0.size();
                            for(int v1 = 0; v1 < v; ++v1) {
                                ((Function1)list0.get(v1)).invoke(object0);
                            }
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(object0);
                            return S0.a;
                        }
                    };
                }
            }
        }
        super(v, snapshotIdSet0, null, function10);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public Snapshot A(@m Function1 function10) {
        return SnapshotKt.b0(new Function1() {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            @l
            public final ReadonlySnapshot a(@l SnapshotIdSet snapshotIdSet0) {
                L.p(snapshotIdSet0, "invalid");
                synchronized(SnapshotKt.E()) {
                    SnapshotKt.f = 3;
                }
                return new ReadonlySnapshot(2, snapshotIdSet0, this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SnapshotIdSet)object0));
            }
        });
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public SnapshotApplyResult J() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public MutableSnapshot X(@m Function1 function10, @m Function1 function11) {
        return (MutableSnapshot)SnapshotKt.b0(new Function1(function11) {
            final Function1 e;
            final Function1 f;

            {
                this.e = function10;
                this.f = function11;
                super(1);
            }

            @l
            public final MutableSnapshot a(@l SnapshotIdSet snapshotIdSet0) {
                L.p(snapshotIdSet0, "invalid");
                synchronized(SnapshotKt.E()) {
                    SnapshotKt.f = 3;
                }
                return new MutableSnapshot(2, snapshotIdSet0, this.e, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SnapshotIdSet)object0));
            }
        });
    }

    @l
    public Void b0(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        SnapshotStateMapKt.b();
        throw new y();
    }

    @l
    public Void c0(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        SnapshotStateMapKt.b();
        throw new y();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void d() {
        synchronized(SnapshotKt.E()) {
            this.u();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void q(Snapshot snapshot0) {
        this.b0(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void r(Snapshot snapshot0) {
        this.c0(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void s() {
        SnapshotKt.y();
    }
}

