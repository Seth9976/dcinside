package androidx.room;

import A3.a;
import A3.o;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.y;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nRoomDatabaseExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,239:1\n314#2,11:240\n*S KotlinDebug\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n*L\n92#1:240,11\n*E\n"})
@i(name = "RoomDatabaseKt")
public final class RoomDatabaseKt {
    public static final Object b(RoomDatabase roomDatabase0, g g0, o o0, d d0) {
        return RoomDatabaseKt.f(roomDatabase0, g0, o0, d0);
    }

    private static final g c(RoomDatabase roomDatabase0, e e0) {
        TransactionElement transactionElement0 = new TransactionElement(e0);
        k1 k10 = l1.a(roomDatabase0.w(), System.identityHashCode(transactionElement0));
        return e0.plus(transactionElement0).plus(k10);
    }

    @l
    public static final kotlinx.coroutines.flow.i d(@l RoomDatabase roomDatabase0, @l String[] arr_s, boolean z) {
        return k.s(new o(z, roomDatabase0, arr_s, null) {
            int k;
            private Object l;
            final boolean m;
            final RoomDatabase n;
            final String[] o;

            {
                this.m = z;
                this.n = roomDatabase0;
                this.o = arr_s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                e e0;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        AtomicBoolean atomicBoolean0 = new AtomicBoolean(this.m);
                        androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1.observer.1 roomDatabaseKt$invalidationTrackerFlow$1$observer$10 = new Observer(atomicBoolean0) {
                            @Override  // androidx.room.InvalidationTracker$Observer
                            public void c(@l Set set0) {
                                if(d0.get()) {
                                    return;
                                }
                                this.c.l(set0);
                            }
                        };
                        TransactionElement transactionElement0 = (TransactionElement)d0.getCoroutineContext().get(TransactionElement.c);
                        if(transactionElement0 == null) {
                            e0 = CoroutinesRoomKt.a(this.n);
                        }
                        else {
                            e0 = transactionElement0.d();
                            if(e0 == null) {
                                e0 = CoroutinesRoomKt.a(this.n);
                            }
                        }
                        androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1.1 roomDatabaseKt$invalidationTrackerFlow$1$10 = new a() {
                            final I0 e;

                            {
                                this.e = i00;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                kotlinx.coroutines.I0.a.b(this.e, null, 1, null);
                            }
                        };
                        this.k = 1;
                        return B.a(d0, roomDatabaseKt$invalidationTrackerFlow$1$10, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }

                @f(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1", f = "RoomDatabaseExt.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
                final class androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1.job.1 extends kotlin.coroutines.jvm.internal.o implements o {
                    int k;
                    final RoomDatabase l;
                    final androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1.observer.1 m;
                    final boolean n;
                    final D o;
                    final String[] p;
                    final AtomicBoolean q;

                    androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1.job.1(RoomDatabase roomDatabase0, androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1.observer.1 roomDatabaseKt$invalidationTrackerFlow$1$observer$10, boolean z, D d0, String[] arr_s, AtomicBoolean atomicBoolean0, d d1) {
                        this.l = roomDatabase0;
                        this.m = roomDatabaseKt$invalidationTrackerFlow$1$observer$10;
                        this.n = z;
                        this.o = d0;
                        this.p = arr_s;
                        this.q = atomicBoolean0;
                        super(2, d1);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1.job.1(this.l, this.m, this.n, this.o, this.p, this.q, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.room.RoomDatabaseKt.invalidationTrackerFlow.1.job.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.l.p().c(this.m);
                                try {
                                    if(this.n) {
                                        Set set0 = kotlin.collections.l.mz(this.p);
                                        this.o.l(set0);
                                    }
                                    this.q.set(false);
                                    this.k = 1;
                                    if(a0.a(this) == object1) {
                                        return object1;
                                    label_12:
                                        f0.n(object0);
                                    }
                                    throw new y();
                                }
                                catch(Throwable throwable0) {
                                    break;
                                }
                            }
                            case 1: {
                                goto label_12;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        this.l.p().t(this.m);
                        throw throwable0;
                    }
                }

            }
        });
    }

    public static kotlinx.coroutines.flow.i e(RoomDatabase roomDatabase0, String[] arr_s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return RoomDatabaseKt.d(roomDatabase0, arr_s, z);
    }

    private static final Object f(RoomDatabase roomDatabase0, g g0, o o0, d d0) {
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        try {
            roomDatabase0.x().execute(new Runnable() {
                @Override
                public final void run() {
                    try {
                        kotlinx.coroutines.i.f(g0.minusKey(e.z8), new o(p0, o0, null) {
                            int k;
                            private Object l;
                            final RoomDatabase m;
                            final kotlinx.coroutines.o n;
                            final o o;

                            {
                                this.m = roomDatabase0;
                                this.n = o0;
                                this.o = o1;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.room.RoomDatabaseKt.startTransactionCoroutine.2.1.1(this.m, this.n, this.o, d0);
                                d1.l = object0;
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.room.RoomDatabaseKt.startTransactionCoroutine.2.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                d d0;
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        kotlin.coroutines.g.b g$b0 = ((O)this.l).getCoroutineContext().get(e.z8);
                                        L.m(g$b0);
                                        g g0 = RoomDatabaseKt.c(this.m, ((e)g$b0));
                                        kotlinx.coroutines.o o0 = this.n;
                                        this.l = o0;
                                        this.k = 1;
                                        object0 = kotlinx.coroutines.i.h(g0, this.o, this);
                                        if(object0 == object1) {
                                            return object1;
                                        }
                                        d0 = o0;
                                        break;
                                    }
                                    case 1: {
                                        d0 = (d)this.l;
                                        f0.n(object0);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                d0.resumeWith(object0);
                                return S0.a;
                            }
                        });
                    }
                    catch(Throwable throwable0) {
                        p0.c(throwable0);
                    }
                }
            });
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            p0.c(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", rejectedExecutionException0));
        }
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @m
    public static final Object g(@l RoomDatabase roomDatabase0, @l Function1 function10, @l d d0) {
        e e0 = null;
        androidx.room.RoomDatabaseKt.withTransaction.transactionBlock.1 roomDatabaseKt$withTransaction$transactionBlock$10 = new o(roomDatabase0, function10, null) {
            int k;
            private Object l;
            final RoomDatabase m;
            final Function1 n;

            {
                this.m = roomDatabase0;
                this.n = function10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.room.RoomDatabaseKt.withTransaction.transactionBlock.1(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.room.RoomDatabaseKt.withTransaction.transactionBlock.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Throwable throwable3;
                Object object2;
                Throwable throwable1;
                TransactionElement transactionElement1;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        kotlin.coroutines.g.b g$b0 = ((O)this.l).getCoroutineContext().get(TransactionElement.c);
                        L.m(g$b0);
                        TransactionElement transactionElement0 = (TransactionElement)g$b0;
                        transactionElement0.b();
                        try {
                            this.m.e();
                        }
                        catch(Throwable throwable0) {
                            transactionElement1 = transactionElement0;
                            throwable1 = throwable0;
                            transactionElement1.g();
                            throw throwable1;
                        }
                        try {
                            this.l = transactionElement0;
                            this.k = 1;
                            object2 = this.n.invoke(this);
                        }
                        catch(Throwable throwable2) {
                            transactionElement1 = transactionElement0;
                            throwable3 = throwable2;
                            break;
                        }
                        if(object2 == object1) {
                            return object1;
                        }
                        transactionElement1 = transactionElement0;
                        object0 = object2;
                        goto label_29;
                    }
                    case 1: {
                        transactionElement1 = (TransactionElement)this.l;
                        try {
                            f0.n(object0);
                        label_29:
                            this.m.Q();
                            goto label_34;
                        }
                        catch(Throwable throwable3) {
                            break;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                try {
                    this.m.k();
                    throw throwable3;
                label_34:
                    this.m.k();
                }
                catch(Throwable throwable1) {
                    transactionElement1.g();
                    throw throwable1;
                }
                transactionElement1.g();
                return object0;
            }
        };
        TransactionElement transactionElement0 = (TransactionElement)d0.getContext().get(TransactionElement.c);
        if(transactionElement0 != null) {
            e0 = transactionElement0.d();
        }
        return e0 == null ? RoomDatabaseKt.f(roomDatabase0, d0.getContext(), roomDatabaseKt$withTransaction$transactionBlock$10, d0) : kotlinx.coroutines.i.h(e0, roomDatabaseKt$withTransaction$transactionBlock$10, d0);
    }
}

