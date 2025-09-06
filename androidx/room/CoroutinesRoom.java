package androidx.room;

import A3.o;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;
import z3.n;

@RestrictTo({Scope.c})
public final class CoroutinesRoom {
    @s0({"SMAP\nCoroutinesRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n*L\n84#1:163,11\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final i a(@l RoomDatabase roomDatabase0, boolean z, @l String[] arr_s, @l Callable callable0) {
            return k.I0(new o(roomDatabase0, arr_s, callable0, null) {
                int k;
                private Object l;
                final boolean m;
                final RoomDatabase n;
                final String[] o;
                final Callable p;

                {
                    this.m = z;
                    this.n = roomDatabase0;
                    this.o = arr_s;
                    this.p = callable0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.room.CoroutinesRoom.Companion.createFlow.1(this.m, this.n, this.o, this.p, d0);
                    d1.l = object0;
                    return d1;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((j)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l j j0, @m d d0) {
                    return ((androidx.room.CoroutinesRoom.Companion.createFlow.1)this.create(j0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            androidx.room.CoroutinesRoom.Companion.createFlow.1.1 coroutinesRoom$Companion$createFlow$1$10 = new o(this.n, ((j)this.l), this.o, this.p, null) {
                                int k;
                                private Object l;
                                final boolean m;
                                final RoomDatabase n;
                                final j o;
                                final String[] p;
                                final Callable q;

                                {
                                    this.m = z;
                                    this.n = roomDatabase0;
                                    this.o = j0;
                                    this.p = arr_s;
                                    this.q = callable0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    d d1 = new androidx.room.CoroutinesRoom.Companion.createFlow.1.1(this.m, this.n, this.o, this.p, this.q, d0);
                                    d1.l = object0;
                                    return d1;
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((O)object0), ((d)object1));
                                }

                                @m
                                public final Object invoke(@l O o0, @m d d0) {
                                    return ((androidx.room.CoroutinesRoom.Companion.createFlow.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    e e0;
                                    Object object1 = b.l();
                                    switch(this.k) {
                                        case 0: {
                                            f0.n(object0);
                                            O o0 = (O)this.l;
                                            kotlinx.coroutines.channels.l l0 = kotlinx.coroutines.channels.o.d(-1, null, null, 6, null);
                                            androidx.room.CoroutinesRoom.Companion.createFlow.1.1.observer.1 coroutinesRoom$Companion$createFlow$1$1$observer$10 = new Observer(l0) {
                                                @Override  // androidx.room.InvalidationTracker$Observer
                                                public void c(@l Set set0) {
                                                    this.b.l(S0.a);
                                                }
                                            };
                                            l0.l(S0.a);
                                            TransactionElement transactionElement0 = (TransactionElement)o0.getCoroutineContext().get(TransactionElement.c);
                                            if(transactionElement0 == null) {
                                                e0 = this.m ? CoroutinesRoomKt.b(this.n) : CoroutinesRoomKt.a(this.n);
                                            }
                                            else {
                                                e0 = transactionElement0.d();
                                                if(e0 == null) {
                                                    e0 = this.m ? CoroutinesRoomKt.b(this.n) : CoroutinesRoomKt.a(this.n);
                                                }
                                            }
                                            kotlinx.coroutines.channels.l l1 = kotlinx.coroutines.channels.o.d(0, null, null, 7, null);
                                            kotlinx.coroutines.k.f(o0, e0, null, new o(coroutinesRoom$Companion$createFlow$1$1$observer$10, l0, this.q, l1, null) {
                                                Object k;
                                                int l;
                                                final RoomDatabase m;
                                                final androidx.room.CoroutinesRoom.Companion.createFlow.1.1.observer.1 n;
                                                final kotlinx.coroutines.channels.l o;
                                                final Callable p;
                                                final kotlinx.coroutines.channels.l q;

                                                {
                                                    this.m = roomDatabase0;
                                                    this.n = coroutinesRoom$Companion$createFlow$1$1$observer$10;
                                                    this.o = l0;
                                                    this.p = callable0;
                                                    this.q = l1;
                                                    super(2, d0);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @l
                                                public final d create(@m Object object0, @l d d0) {
                                                    return new androidx.room.CoroutinesRoom.Companion.createFlow.1.1.1(this.m, this.n, this.o, this.p, this.q, d0);
                                                }

                                                @Override  // A3.o
                                                public Object invoke(Object object0, Object object1) {
                                                    return this.invoke(((O)object0), ((d)object1));
                                                }

                                                @m
                                                public final Object invoke(@l O o0, @m d d0) {
                                                    return ((androidx.room.CoroutinesRoom.Companion.createFlow.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @m
                                                public final Object invokeSuspend(@l Object object0) {
                                                    kotlinx.coroutines.channels.n n1;
                                                    kotlinx.coroutines.channels.n n0;
                                                    Object object1 = b.l();
                                                    switch(this.l) {
                                                        case 0: {
                                                            f0.n(object0);
                                                            this.m.p().c(this.n);
                                                            try {
                                                                n0 = this.o.iterator();
                                                                goto label_13;
                                                            }
                                                            catch(Throwable throwable0) {
                                                                break;
                                                            }
                                                        }
                                                        case 1: {
                                                            n1 = (kotlinx.coroutines.channels.n)this.k;
                                                            try {
                                                                f0.n(object0);
                                                                goto label_20;
                                                            }
                                                            catch(Throwable throwable0) {
                                                                break;
                                                            }
                                                        }
                                                        case 2: {
                                                            n1 = (kotlinx.coroutines.channels.n)this.k;
                                                            try {
                                                                f0.n(object0);
                                                                while(true) {
                                                                    n0 = n1;
                                                                label_13:
                                                                    this.k = n0;
                                                                    this.l = 1;
                                                                    Object object2 = n0.b(this);
                                                                    if(object2 == object1) {
                                                                        return object1;
                                                                    }
                                                                    n1 = n0;
                                                                    object0 = object2;
                                                                label_20:
                                                                    if(!((Boolean)object0).booleanValue()) {
                                                                        goto label_31;
                                                                    }
                                                                    n1.next();
                                                                    Object object3 = this.p.call();
                                                                    this.k = n1;
                                                                    this.l = 2;
                                                                    if(this.q.I(object3, this) != object1) {
                                                                        continue;
                                                                    }
                                                                    return object1;
                                                                }
                                                            }
                                                            catch(Throwable throwable0) {
                                                                break;
                                                            }
                                                        }
                                                        default: {
                                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                        }
                                                    }
                                                    this.m.p().t(this.n);
                                                    throw throwable0;
                                                label_31:
                                                    this.m.p().t(this.n);
                                                    return S0.a;
                                                }
                                            }, 2, null);
                                            this.k = 1;
                                            return k.l0(this.o, l1, this) == object1 ? object1 : S0.a;
                                        }
                                        case 1: {
                                            f0.n(object0);
                                            return S0.a;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }
                                }
                            };
                            this.k = 1;
                            return P.g(coroutinesRoom$Companion$createFlow$1$10, this) == object1 ? object1 : S0.a;
                        }
                        case 1: {
                            f0.n(object0);
                            return S0.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }
            });
        }

        @m
        @n
        public final Object b(@l RoomDatabase roomDatabase0, boolean z, @m CancellationSignal cancellationSignal0, @l Callable callable0, @l d d0) {
            e e0;
            if(roomDatabase0.H() && roomDatabase0.z()) {
                return callable0.call();
            }
            TransactionElement transactionElement0 = (TransactionElement)d0.getContext().get(TransactionElement.c);
            if(transactionElement0 == null) {
                e0 = z ? CoroutinesRoomKt.b(roomDatabase0) : CoroutinesRoomKt.a(roomDatabase0);
            }
            else {
                e0 = transactionElement0.d();
                if(e0 == null) {
                    e0 = z ? CoroutinesRoomKt.b(roomDatabase0) : CoroutinesRoomKt.a(roomDatabase0);
                }
            }
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            androidx.room.CoroutinesRoom.Companion.execute.4.job.1 coroutinesRoom$Companion$execute$4$job$10 = new o(p0, null) {
                int k;
                final Callable l;
                final kotlinx.coroutines.o m;

                {
                    this.l = callable0;
                    this.m = o0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.room.CoroutinesRoom.Companion.execute.4.job.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.room.CoroutinesRoom.Companion.execute.4.job.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    try {
                        Object object1 = e0.b(this.l.call());
                        this.m.resumeWith(object1);
                    }
                    catch(Throwable throwable0) {
                        Object object2 = e0.b(f0.a(throwable0));
                        this.m.resumeWith(object2);
                    }
                    return S0.a;
                }
            };
            p0.K(new Function1(kotlinx.coroutines.k.f(() -> kotlin.coroutines.i.a, e0, null, coroutinesRoom$Companion$execute$4$job$10, 2, null)) {
                final CancellationSignal e;
                final I0 f;

                {
                    this.e = cancellationSignal0;
                    this.f = i00;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Throwable)object0));
                    return S0.a;
                }

                public final void invoke(@m Throwable throwable0) {
                    CancellationSignal cancellationSignal0 = this.e;
                    if(cancellationSignal0 != null) {
                        Api16Impl.a(cancellationSignal0);
                    }
                    a.b(this.f, null, 1, null);
                }
            });
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0;
        }

        @m
        @n
        public final Object c(@l RoomDatabase roomDatabase0, boolean z, @l Callable callable0, @l d d0) {
            if(roomDatabase0.H() && roomDatabase0.z()) {
                return callable0.call();
            }
            TransactionElement transactionElement0 = (TransactionElement)d0.getContext().get(TransactionElement.c);
            if(transactionElement0 != null) {
                e e0 = transactionElement0.d();
                if(e0 != null) {
                    return kotlinx.coroutines.i.h(e0, new o(null) {
                        int k;
                        final Callable l;

                        {
                            this.l = callable0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.room.CoroutinesRoom.Companion.execute.2(this.l, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.room.CoroutinesRoom.Companion.execute.2)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            if(this.k != 0) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                            f0.n(object0);
                            return this.l.call();
                        }
                    }, d0);
                }
            }
            return z ? kotlinx.coroutines.i.h(CoroutinesRoomKt.b(roomDatabase0), new o(null) {
                int k;
                final Callable l;

                {
                    this.l = callable0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.room.CoroutinesRoom.Companion.execute.2(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.room.CoroutinesRoom.Companion.execute.2)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    return this.l.call();
                }
            }, d0) : kotlinx.coroutines.i.h(CoroutinesRoomKt.a(roomDatabase0), new o(null) {
                int k;
                final Callable l;

                {
                    this.l = callable0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.room.CoroutinesRoom.Companion.execute.2(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.room.CoroutinesRoom.Companion.execute.2)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    return this.l.call();
                }
            }, d0);
        }
    }

    @l
    public static final Companion a;

    static {
        CoroutinesRoom.a = new Companion(null);
    }

    @l
    @n
    public static final i a(@l RoomDatabase roomDatabase0, boolean z, @l String[] arr_s, @l Callable callable0) {
        return CoroutinesRoom.a.a(roomDatabase0, z, arr_s, callable0);
    }

    @m
    @n
    public static final Object b(@l RoomDatabase roomDatabase0, boolean z, @m CancellationSignal cancellationSignal0, @l Callable callable0, @l d d0) {
        return CoroutinesRoom.a.b(roomDatabase0, z, cancellationSignal0, callable0, d0);
    }

    @m
    @n
    public static final Object c(@l RoomDatabase roomDatabase0, boolean z, @l Callable callable0, @l d d0) {
        return CoroutinesRoom.a.c(roomDatabase0, z, callable0, d0);
    }
}

