package androidx.compose.runtime.snapshots;

import A3.a;
import A3.o;
import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.b0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n1686#2:2192\n1686#2:2194\n70#3:2193\n70#3:2195\n1#4:2196\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n84#1:2192\n233#1:2194\n84#1:2193\n233#1:2195\n*E\n"})
public abstract class Snapshot {
    @s0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1#2:2192\n122#3,5:2193\n122#3,5:2198\n122#3,5:2203\n1686#4:2208\n1686#4:2210\n1686#4:2212\n70#5:2209\n70#5:2211\n70#5:2213\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n424#1:2193,5\n461#1:2198,5\n483#1:2203,5\n499#1:2208\n526#1:2210\n564#1:2212\n499#1:2209\n526#1:2211\n564#1:2213\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @b0
        @l
        public final Snapshot a() {
            return SnapshotKt.A(((Snapshot)SnapshotKt.c.a()), null, false, 6, null);
        }

        @l
        public final Snapshot b() {
            return SnapshotKt.D();
        }

        public final Object c(@l a a0) {
            L.p(a0, "block");
            Snapshot snapshot0 = this.j();
            Object object0 = a0.invoke();
            Snapshot.e.k(snapshot0);
            return object0;
        }

        public final void d() {
            SnapshotKt.D().s();
        }

        public final Object e(@m Function1 function10, @m Function1 function11, @l a a0) {
            Object object0;
            Snapshot snapshot1;
            L.p(a0, "block");
            if(function10 == null && function11 == null) {
                return a0.invoke();
            }
            Snapshot snapshot0 = (Snapshot)SnapshotKt.c.a();
            if(snapshot0 == null || snapshot0 instanceof MutableSnapshot) {
                snapshot1 = new TransparentObserverMutableSnapshot((snapshot0 instanceof MutableSnapshot ? ((MutableSnapshot)snapshot0) : null), function10, function11, true, false);
            }
            else {
                if(function10 == null) {
                    return a0.invoke();
                }
                snapshot1 = snapshot0.A(function10);
            }
            try {
                Snapshot snapshot2 = snapshot1.p();
                try {
                    object0 = a0.invoke();
                }
                catch(Throwable throwable0) {
                    snapshot1.w(snapshot2);
                    throw throwable0;
                }
                snapshot1.w(snapshot2);
                return object0;
            }
            finally {
                snapshot1.d();
            }
        }

        public static Object f(Companion snapshot$Companion0, Function1 function10, Function1 function11, a a0, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = null;
            }
            if((v & 2) != 0) {
                function11 = null;
            }
            return snapshot$Companion0.e(function10, function11, a0);
        }

        @InternalComposeApi
        public final int g() {
            return u.V5(SnapshotKt.e).size();
        }

        @l
        public final ObserverHandle h(@l o o0) {
            L.p(o0, "observer");
            SnapshotKt.x(SnapshotKt.a);
            synchronized(SnapshotKt.E()) {
                SnapshotKt.h.add(o0);
            }
            return new ObserverHandle() {
                @Override  // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    synchronized(SnapshotKt.E()) {
                        SnapshotKt.h.remove(this.a);
                    }
                }
            };
        }

        @l
        public final ObserverHandle i(@l Function1 function10) {
            L.p(function10, "observer");
            synchronized(SnapshotKt.E()) {
                SnapshotKt.i.add(function10);
            }
            SnapshotKt.y();
            return new ObserverHandle() {
                @Override  // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    synchronized(SnapshotKt.E()) {
                        SnapshotKt.i.remove(this.a);
                    }
                    SnapshotKt.y();
                }
            };
        }

        @b0
        @m
        public final Snapshot j() {
            Snapshot snapshot0 = (Snapshot)SnapshotKt.c.a();
            if(snapshot0 != null) {
                SnapshotKt.c.b(null);
            }
            return snapshot0;
        }

        @b0
        public final void k(@m Snapshot snapshot0) {
            if(snapshot0 != null) {
                SnapshotKt.c.b(snapshot0);
            }
        }

        public final void l() {
            synchronized(SnapshotKt.E()) {
                Set set0 = ((GlobalSnapshot)SnapshotKt.j.get()).i();
            }
            if(set0 != null && !set0.isEmpty() == 1) {
                SnapshotKt.y();
            }
        }

        @l
        public final MutableSnapshot m(@m Function1 function10, @m Function1 function11) {
            Snapshot snapshot0 = SnapshotKt.D();
            MutableSnapshot mutableSnapshot0 = snapshot0 instanceof MutableSnapshot ? ((MutableSnapshot)snapshot0) : null;
            if(mutableSnapshot0 != null) {
                MutableSnapshot mutableSnapshot1 = mutableSnapshot0.X(function10, function11);
                if(mutableSnapshot1 != null) {
                    return mutableSnapshot1;
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }

        public static MutableSnapshot n(Companion snapshot$Companion0, Function1 function10, Function1 function11, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = null;
            }
            if((v & 2) != 0) {
                function11 = null;
            }
            return snapshot$Companion0.m(function10, function11);
        }

        @l
        public final Snapshot o(@m Function1 function10) {
            return SnapshotKt.D().A(function10);
        }

        public static Snapshot p(Companion snapshot$Companion0, Function1 function10, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = null;
            }
            return snapshot$Companion0.o(function10);
        }

        public final Object q(@l a a0) {
            Object object0;
            L.p(a0, "block");
            MutableSnapshot mutableSnapshot0 = Companion.n(this, null, null, 3, null);
            try {
                Snapshot snapshot0 = mutableSnapshot0.p();
                try {
                    object0 = a0.invoke();
                }
                catch(Throwable throwable0) {
                    mutableSnapshot0.w(snapshot0);
                    throw throwable0;
                }
                mutableSnapshot0.w(snapshot0);
                mutableSnapshot0.J().a();
                return object0;
            }
            finally {
                mutableSnapshot0.d();
            }
        }

        public final Object r(@l a a0) {
            Object object0;
            L.p(a0, "block");
            Snapshot snapshot0 = this.a();
            try {
                Snapshot snapshot1 = snapshot0.p();
                try {
                    object0 = a0.invoke();
                }
                catch(Throwable throwable0) {
                    snapshot0.w(snapshot1);
                    throw throwable0;
                }
                snapshot0.w(snapshot1);
                return object0;
            }
            finally {
                snapshot0.d();
            }
        }
    }

    @l
    private SnapshotIdSet a;
    private int b;
    private boolean c;
    private int d;
    @l
    public static final Companion e;
    public static final int f;

    static {
        Snapshot.e = new Companion(null);
        Snapshot.f = 8;
    }

    private Snapshot(int v, SnapshotIdSet snapshotIdSet0) {
        this.a = snapshotIdSet0;
        this.b = v;
        this.d = v == 0 ? -1 : SnapshotKt.c0(v, this.h());
    }

    public Snapshot(int v, SnapshotIdSet snapshotIdSet0, w w0) {
        this(v, snapshotIdSet0);
    }

    @l
    public abstract Snapshot A(@m Function1 arg1);

    public static Snapshot B(Snapshot snapshot0, Function1 function10, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if((v & 1) != 0) {
            function10 = null;
        }
        return snapshot0.A(function10);
    }

    public final int C() {
        int v = this.d;
        this.d = -1;
        return v;
    }

    @ExperimentalComposeApi
    @m
    public final Snapshot D() {
        return this.p();
    }

    @ExperimentalComposeApi
    public final void E(@m Snapshot snapshot0) {
        if(SnapshotKt.c.a() != this) {
            throw new IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
        }
        this.w(snapshot0);
    }

    public final void F() {
        if(this.c) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public final void b() {
        synchronized(SnapshotKt.E()) {
            this.c();
            this.v();
        }
    }

    public void c() {
        SnapshotKt.e = SnapshotKt.e.j(this.g());
    }

    public void d() {
        this.c = true;
        synchronized(SnapshotKt.E()) {
            this.u();
        }
    }

    public final Object e(@l a a0) {
        L.p(a0, "block");
        Snapshot snapshot0 = this.p();
        try {
            return a0.invoke();
        }
        finally {
            this.w(snapshot0);
        }
    }

    public final boolean f() {
        return this.c;
    }

    public int g() {
        return this.b;
    }

    @l
    public SnapshotIdSet h() {
        return this.a;
    }

    @m
    public abstract Set i();

    @m
    public abstract Function1 j();

    public abstract boolean k();

    @l
    public abstract Snapshot l();

    @m
    public abstract Function1 m();

    public abstract boolean n();

    public final boolean o() {
        return this.d >= 0;
    }

    @b0
    @m
    public Snapshot p() {
        Snapshot snapshot0 = (Snapshot)SnapshotKt.c.a();
        SnapshotKt.c.b(this);
        return snapshot0;
    }

    public abstract void q(@l Snapshot arg1);

    public abstract void r(@l Snapshot arg1);

    public abstract void s();

    public abstract void t(@l StateObject arg1);

    public final void u() {
        int v = this.d;
        if(v >= 0) {
            SnapshotKt.X(v);
            this.d = -1;
        }
    }

    public void v() {
        this.u();
    }

    @b0
    public void w(@m Snapshot snapshot0) {
        SnapshotKt.c.b(snapshot0);
    }

    public final void x(boolean z) {
        this.c = z;
    }

    public void y(int v) {
        this.b = v;
    }

    public void z(@l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "<set-?>");
        this.a = snapshotIdSet0;
    }
}

