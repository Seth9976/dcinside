package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.selects.r;
import y4.l;
import y4.m;

@s0({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,411:1\n11#2:412\n11#2:413\n11#2:417\n11#2:420\n11#2:426\n11#2:427\n11#2:433\n11#2:436\n11#2:437\n11#2:438\n766#3:414\n857#3,2:415\n1855#3,2:418\n1747#3,3:421\n1855#3,2:424\n1855#3,2:428\n766#3:430\n857#3,2:431\n1855#3,2:434\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n163#1:412\n185#1:413\n210#1:417\n234#1:420\n276#1:426\n328#1:427\n340#1:433\n352#1:436\n379#1:437\n391#1:438\n186#1:414\n186#1:415,2\n223#1:418,2\n239#1:421,3\n248#1:424,2\n330#1:428,2\n335#1:430\n335#1:431,2\n343#1:434,2\n*E\n"})
public final class e extends j implements d {
    @s0({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,411:1\n11#2:412\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n359#1:412\n*E\n"})
    final class a extends j {
        final e m;

        public a() {
            super(e0.n2(), null, 2, null);
        }

        @Override  // kotlinx.coroutines.channels.j
        public boolean R(Throwable throwable0) {
            return this.k2(throwable0);
        }

        public boolean k2(@m Throwable throwable0) {
            ReentrantLock reentrantLock0 = e.this.n;
            reentrantLock0.lock();
            try {
                e.this.s2(this);
                return super.R(throwable0);
            }
            finally {
                reentrantLock0.unlock();
            }
        }
    }

    final class b extends y {
        final e o;

        public b() {
            super(1, i.b, null, 4, null);
        }

        @Override  // kotlinx.coroutines.channels.j
        public boolean R(Throwable throwable0) {
            return this.o2(throwable0);
        }

        public boolean o2(@m Throwable throwable0) {
            e.this.s2(this);
            return super.R(throwable0);
        }
    }

    private final int m;
    @l
    private final ReentrantLock n;
    @l
    private List o;
    @m
    private Object p;
    @l
    private final HashMap q;

    public e(int v) {
        super(0, null);
        this.m = v;
        if(v < 1 && v != -1) {
            throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + v + " was specified").toString());
        }
        this.n = new ReentrantLock();
        this.o = u.H();
        this.p = f.a;
        this.q = new HashMap();
    }

    @Override  // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.G
    public boolean A() {
        this.n.lock();
        try {
            return super.A();
        }
        finally {
            this.n.unlock();
        }
    }

    @Override  // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.G
    public boolean G(@m Throwable throwable0) {
        ReentrantLock reentrantLock0 = this.n;
        reentrantLock0.lock();
        try {
            for(Object object0: this.o) {
                ((j)object0).G(throwable0);
            }
            Iterable iterable0 = this.o;
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: iterable0) {
                if(((j)object1).I0()) {
                    arrayList0.add(object1);
                }
            }
            this.o = arrayList0;
            return super.G(throwable0);
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.G
    @m
    public Object I(Object object0, @l kotlin.coroutines.d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {0xE3}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
        static final class kotlinx.coroutines.channels.e.d extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            final e o;
            int p;

            kotlinx.coroutines.channels.e.d(e e0, kotlin.coroutines.d d0) {
                this.o = e0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.p |= 0x80000000;
                return this.o.I(null, this);
            }
        }

        Object object4;
        Iterator iterator0;
        Object object3;
        e e0;
        kotlinx.coroutines.channels.e.d e$d0;
        if(d0 instanceof kotlinx.coroutines.channels.e.d) {
            e$d0 = (kotlinx.coroutines.channels.e.d)d0;
            int v = e$d0.p;
            if((v & 0x80000000) == 0) {
                e$d0 = new kotlinx.coroutines.channels.e.d(this, d0);
            }
            else {
                e$d0.p = v ^ 0x80000000;
            }
        }
        else {
            e$d0 = new kotlinx.coroutines.channels.e.d(this, d0);
        }
        Object object1 = e$d0.n;
        Object object2 = kotlin.coroutines.intrinsics.b.l();
        switch(e$d0.p) {
            case 0: {
                f0.n(object1);
                ReentrantLock reentrantLock0 = this.n;
                reentrantLock0.lock();
                try {
                    if(!this.A()) {
                        if(this.m == -1) {
                            this.p = object0;
                        }
                        List list0 = this.o;
                        e0 = this;
                        object3 = object0;
                        iterator0 = list0.iterator();
                        goto label_37;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                throw this.A0();
            }
            case 1: {
                iterator0 = (Iterator)e$d0.m;
                object4 = e$d0.l;
                e0 = (e)e$d0.k;
                f0.n(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(!((Boolean)object1).booleanValue() && e0.A()) {
                throw e0.A0();
            }
            object3 = object4;
        label_37:
            if(!iterator0.hasNext()) {
                break;
            }
            Object object5 = iterator0.next();
            e$d0.k = e0;
            e$d0.l = object3;
            e$d0.m = iterator0;
            e$d0.p = 1;
            Object object6 = ((j)object5).F1(object3, e$d0);
            if(object6 == object2) {
                return object2;
            }
            object4 = object3;
            object1 = object6;
        }
        return S0.a;
    }

    @Override  // kotlinx.coroutines.channels.j
    public boolean R(@m Throwable throwable0) {
        ReentrantLock reentrantLock0 = this.n;
        reentrantLock0.lock();
        try {
            for(Object object0: this.o) {
                ((j)object0).R(throwable0);
            }
            this.p = f.a;
            return super.R(throwable0);
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // kotlinx.coroutines.channels.d
    @l
    public F g() {
        F f0;
        ReentrantLock reentrantLock0 = this.n;
        reentrantLock0.lock();
        try {
            f0 = this.m == -1 ? new b(this) : new a(this);
            if(!this.A() || this.p != f.a) {
                if(this.p != f.a) {
                    ((j)f0).l(this.o2());
                }
                this.o = u.E4(this.o, f0);
                goto label_10;
            }
            goto label_12;
        }
        catch(Throwable throwable0) {
            reentrantLock0.unlock();
            throw throwable0;
        }
    label_10:
        reentrantLock0.unlock();
        return f0;
        try {
        label_12:
            ((j)f0).G(this.k0());
        }
        catch(Throwable throwable0) {
            reentrantLock0.unlock();
            throw throwable0;
        }
        reentrantLock0.unlock();
        return f0;
    }

    @Override  // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.G
    @l
    public Object l(Object object0) {
        ReentrantLock reentrantLock0 = this.n;
        reentrantLock0.lock();
        try {
            if(this.A()) {
                return super.l(object0);
            }
            Iterable iterable0 = this.o;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object2: iterable0) {
                    if(((j)object2).V1()) {
                        return p.b.b();
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(this.m == -1) {
                this.p = object0;
            }
            for(Object object4: this.o) {
                ((j)object4).l(object0);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        return p.b.c(S0.a);
    }

    public final int n2() {
        return this.m;
    }

    public final Object o2() {
        ReentrantLock reentrantLock0 = this.n;
        reentrantLock0.lock();
        try {
            if(this.A()) {
                Throwable throwable0 = this.k0();
                if(throwable0 == null) {
                    throwable0 = new IllegalStateException("This broadcast channel is closed");
                }
                throw throwable0;
            }
            if(this.p != f.a) {
                return this.p;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("No value");
    }

    public static void p2() {
    }

    @m
    public final Object q2() {
        Object object0 = null;
        ReentrantLock reentrantLock0 = this.n;
        reentrantLock0.lock();
        try {
            if(!this.C() && this.p != f.a) {
                object0 = this.p;
            }
            return object0;
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public static void r2() {
    }

    private final void s2(F f0) {
        ReentrantLock reentrantLock0 = this.n;
        reentrantLock0.lock();
        try {
            Iterable iterable0 = this.o;
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(((j)object0) != f0) {
                    arrayList0.add(object0);
                }
            }
            this.o = arrayList0;
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // kotlinx.coroutines.channels.j
    @l
    public String toString() {
        return (this.p == f.a ? "" : "CONFLATED_ELEMENT=" + this.p + "; ") + "BROADCAST=<" + super.toString() + ">; SUBSCRIBERS=" + u.m3(this.o, ";", "<", ">", 0, null, null, 56, null);
    }

    @Override  // kotlinx.coroutines.channels.j
    protected void z1(@l kotlinx.coroutines.selects.m m0, @m Object object0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {0x120}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,411:1\n11#2:412\n1#3:413\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n301#1:412\n*E\n"})
        static final class c extends o implements A3.o {
            int k;
            final e l;
            final Object m;
            final kotlinx.coroutines.selects.m n;

            c(e e0, Object object0, kotlinx.coroutines.selects.m m0, kotlin.coroutines.d d0) {
                this.l = e0;
                this.m = object0;
                this.n = m0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new c(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                boolean z = true;
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        try {
                            this.k = 1;
                            if(this.l.I(this.m, this) == object1) {
                                return object1;
                            label_8:
                                f0.n(object0);
                            }
                            break;
                        }
                        catch(Throwable throwable0) {
                            goto label_11;
                        }
                    }
                    case 1: {
                        goto label_8;
                    label_11:
                        if(!this.l.A() || !(throwable0 instanceof w) && this.l.A0() != throwable0) {
                            throw throwable0;
                        }
                        z = false;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                ReentrantLock reentrantLock0 = this.l.n;
                e e0 = this.l;
                kotlinx.coroutines.selects.m m0 = this.n;
                reentrantLock0.lock();
                try {
                    HashMap hashMap0 = e0.q;
                    S0 s00 = z ? S0.a : k.z();
                    hashMap0.put(m0, s00);
                    L.n(m0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                    kotlinx.coroutines.selects.l l0 = (kotlinx.coroutines.selects.l)m0;
                    S0 s01 = S0.a;
                    if(((kotlinx.coroutines.selects.l)m0).L(e0, s01) != r.b) {
                        e0.q.remove(m0);
                    }
                    return s01;
                }
                finally {
                    reentrantLock0.unlock();
                }
            }
        }

        ReentrantLock reentrantLock0 = this.n;
        reentrantLock0.lock();
        try {
            Object object1 = this.q.remove(m0);
            if(object1 != null) {
                m0.g(object1);
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        O o0 = P.a(m0.getContext());
        c e$c0 = new c(this, object0, m0, null);
        kotlinx.coroutines.k.f(o0, null, Q.d, e$c0, 1, null);
    }
}

