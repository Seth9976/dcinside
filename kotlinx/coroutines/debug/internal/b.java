package kotlinx.coroutines.debug.internal;

import A3.o;
import B3.d;
import com.google.common.util.concurrent.Z0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.S0;
import kotlin.collections.g;
import kotlin.collections.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.y;
import y4.l;
import y4.m;

@s0({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class b extends g {
    final class a {
        @s0({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
        final class kotlinx.coroutines.debug.internal.b.a.a implements d, Iterator {
            @l
            private final o a;
            private int b;
            private Object c;
            private Object d;
            final a e;

            public kotlinx.coroutines.debug.internal.b.a.a(@l o o0) {
                this.a = o0;
                this.b = -1;
                this.a();
            }

            private final void a() {
                Object object1;
                Object object0;
            alab1:
                while(true) {
                    do {
                        do {
                            int v = this.b + 1;
                            this.b = v;
                            if(v >= a.this.a) {
                                break alab1;
                            }
                            k k0 = (k)a.this.f().get(this.b);
                            if(k0 == null) {
                                continue alab1;
                            }
                            object0 = k0.get();
                        }
                        while(object0 == null);
                        this.c = object0;
                        object1 = a.this.i().get(this.b);
                        if(object1 instanceof kotlinx.coroutines.debug.internal.l) {
                            object1 = ((kotlinx.coroutines.debug.internal.l)object1).a;
                        }
                    }
                    while(object1 == null);
                    this.d = object1;
                    return;
                }
            }

            @l
            public Void b() {
                c.e();
                throw new y();
            }

            @Override
            public boolean hasNext() {
                return this.b < a.this.a;
            }

            @Override
            public Object next() {
                if(this.b >= a.this.a) {
                    throw new NoSuchElementException();
                }
                o o0 = this.a;
                S0 s00 = this.c;
                if(s00 == null) {
                    L.S("key");
                    s00 = S0.a;
                }
                S0 s01 = this.d;
                if(s01 == null) {
                    L.S("value");
                    s01 = S0.a;
                }
                Object object0 = o0.invoke(s00, s01);
                this.a();
                return object0;
            }

            @Override
            public void remove() {
                this.b();
            }
        }

        private final int a;
        private final int b;
        private final int c;
        private final AtomicReferenceArray d;
        private final AtomicReferenceArray e;
        final b f;
        private static final AtomicIntegerFieldUpdater g;
        private volatile int load$volatile;

        static {
            a.g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load$volatile");
        }

        public a(int v) {
            this.a = v;
            this.b = Integer.numberOfLeadingZeros(v) + 1;
            this.c = v * 2 / 3;
            this.d = new AtomicReferenceArray(v);
            this.e = new AtomicReferenceArray(v);
        }

        public final void d(@l k k0) {
            for(int v = this.j(k0.a); true; --v) {
                k k1 = (k)this.f().get(v);
                if(k1 == null) {
                    return;
                }
                if(k1 == k0) {
                    this.o(v);
                    return;
                }
                if(v == 0) {
                    v = this.a;
                }
            }
        }

        @m
        public final Object e(@l Object object0) {
            for(int v = this.j(object0.hashCode()); true; --v) {
                k k0 = (k)this.f().get(v);
                if(k0 == null) {
                    return null;
                }
                Object object1 = k0.get();
                if(L.g(object0, object1)) {
                    Object object2 = this.i().get(v);
                    return object2 instanceof kotlinx.coroutines.debug.internal.l ? ((kotlinx.coroutines.debug.internal.l)object2).a : object2;
                }
                if(object1 == null) {
                    this.o(v);
                }
                if(v == 0) {
                    v = this.a;
                }
            }
        }

        private final AtomicReferenceArray f() {
            return this.d;
        }

        private final int g() {
            return this.load$volatile;
        }

        private final AtomicReferenceArray i() {
            return this.e;
        }

        private final int j(int v) {
            return v * -1640531527 >>> this.b;
        }

        @l
        public final Iterator k(@l o o0) {
            return new kotlinx.coroutines.debug.internal.b.a.a(this, o0);
        }

        @m
        public final Object l(@l Object object0, @m Object object1, @m k k0) {
            Object object3;
            int v = this.j(object0.hashCode());
            boolean z = false;
            while(true) {
                k k1 = (k)this.f().get(v);
                if(k1 == null) {
                    if(object1 == null) {
                        return null;
                    }
                    if(!z) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = a.g;
                        do {
                            int v1 = atomicIntegerFieldUpdater0.get(this);
                            if(v1 >= this.c) {
                                return c.c;
                            }
                        }
                        while(!atomicIntegerFieldUpdater0.compareAndSet(this, v1, v1 + 1));
                        z = true;
                    }
                    if(k0 == null) {
                        k0 = new k(object0, b.this.a);
                    }
                    if(!Z0.a(this.f(), v, null, k0)) {
                        continue;
                    }
                }
                else {
                    Object object2 = k1.get();
                    if(!L.g(object0, object2)) {
                        goto label_26;
                    }
                    else if(z) {
                        a.g.decrementAndGet(this);
                    }
                }
                do {
                    object3 = this.i().get(v);
                    if(object3 instanceof kotlinx.coroutines.debug.internal.l) {
                        return c.c;
                    }
                }
                while(!Z0.a(this.i(), v, object3, object1));
                return object3;
            label_26:
                if(object2 == null) {
                    this.o(v);
                }
                if(v == 0) {
                    v = this.a;
                }
                --v;
            }
        }

        public static Object m(a b$a0, Object object0, Object object1, k k0, int v, Object object2) {
            if((v & 4) != 0) {
                k0 = null;
            }
            return b$a0.l(object0, object1, k0);
        }

        @l
        public final a n() {
            a b$a0;
        alab1:
            while(true) {
                int v = Integer.highestOneBit(s.u(b.this.size(), 4));
                b$a0 = new a(b.this, v * 4);
                int v1 = this.a;
                for(int v2 = 0; true; ++v2) {
                    if(v2 >= v1) {
                        break alab1;
                    }
                    k k0 = (k)this.f().get(v2);
                    Object object0 = k0 == null ? null : k0.get();
                    if(k0 != null && object0 == null) {
                        this.o(v2);
                    }
                    do {
                        Object object1 = this.i().get(v2);
                        if(object1 instanceof kotlinx.coroutines.debug.internal.l) {
                            object1 = ((kotlinx.coroutines.debug.internal.l)object1).a;
                            break;
                        }
                    }
                    while(!Z0.a(this.i(), v2, object1, c.d(object1)));
                    if(object0 != null && object1 != null && b$a0.l(object0, object1, k0) == c.c) {
                        break;
                    }
                }
            }
            return b$a0;
        }

        private final void o(int v) {
            do {
                Object object0 = this.i().get(v);
                if(object0 == null) {
                    return;
                }
                if(object0 instanceof kotlinx.coroutines.debug.internal.l) {
                    return;
                }
            }
            while(!Z0.a(this.i(), v, object0, null));
            b.this.j();
        }

        private final void p(int v) {
            this.load$volatile = v;
        }

        private final void q(Object object0, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0, Function1 function10) {
            do {
                int v = atomicIntegerFieldUpdater0.get(object0);
            }
            while(!atomicIntegerFieldUpdater0.compareAndSet(object0, v, ((Number)function10.invoke(v)).intValue()));
        }
    }

    static final class kotlinx.coroutines.debug.internal.b.b implements B3.g.a, Map.Entry {
        private final Object a;
        private final Object b;

        public kotlinx.coroutines.debug.internal.b.b(Object object0, Object object1) {
            this.a = object0;
            this.b = object1;
        }

        @Override
        public Object getKey() {
            return this.a;
        }

        @Override
        public Object getValue() {
            return this.b;
        }

        @Override
        public Object setValue(Object object0) {
            c.e();
            throw new y();
        }
    }

    final class kotlinx.coroutines.debug.internal.b.c extends h {
        @l
        private final o a;
        final b b;

        public kotlinx.coroutines.debug.internal.b.c(@l o o0) {
            this.a = o0;
        }

        @Override  // kotlin.collections.h
        public int a() {
            return b.this.size();
        }

        @Override  // kotlin.collections.h
        public boolean add(Object object0) {
            c.e();
            throw new y();
        }

        @Override
        @l
        public Iterator iterator() {
            return ((a)b.c.get(b.this)).k(this.a);
        }
    }

    private volatile int _size$volatile;
    @m
    private final ReferenceQueue a;
    private static final AtomicIntegerFieldUpdater b;
    private static final AtomicReferenceFieldUpdater c;
    private volatile Object core$volatile;

    static {
        b.b = AtomicIntegerFieldUpdater.newUpdater(b.class, "_size$volatile");
        b.c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "core$volatile");
    }

    public b() {
        this(false, 1, null);
    }

    public b(boolean z) {
        this.core$volatile = new a(this, 16);
        this.a = z ? new ReferenceQueue() : null;
    }

    public b(boolean z, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    @Override  // kotlin.collections.g
    @l
    public Set a() {
        static final class kotlinx.coroutines.debug.internal.b.d extends N implements o {
            public static final kotlinx.coroutines.debug.internal.b.d e;

            static {
                kotlinx.coroutines.debug.internal.b.d.e = new kotlinx.coroutines.debug.internal.b.d();
            }

            kotlinx.coroutines.debug.internal.b.d() {
                super(2);
            }

            @l
            public final Map.Entry a(@l Object object0, @l Object object1) {
                return new kotlinx.coroutines.debug.internal.b.b(object0, object1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, object1);
            }
        }

        return new kotlinx.coroutines.debug.internal.b.c(this, kotlinx.coroutines.debug.internal.b.d.e);
    }

    @Override  // kotlin.collections.g
    @l
    public Set b() {
        static final class e extends N implements o {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(2);
            }

            @Override  // A3.o
            @l
            public final Object invoke(@l Object object0, @l Object object1) {
                return object0;
            }
        }

        return new kotlinx.coroutines.debug.internal.b.c(this, e.e);
    }

    @Override  // kotlin.collections.g
    public int c() {
        return b.b.get(this);
    }

    @Override
    public void clear() {
        for(Object object0: this.keySet()) {
            this.remove(object0);
        }
    }

    @Override
    @m
    public Object get(@m Object object0) {
        return object0 == null ? null : ((a)b.c.get(this)).e(object0);
    }

    private final void i(k k0) {
        ((a)b.c.get(this)).d(k0);
    }

    private final void j() {
        b.b.decrementAndGet(this);
    }

    private final Object l() {
        return this.core$volatile;
    }

    private final int o() {
        return this._size$volatile;
    }

    @Override  // kotlin.collections.g
    @m
    public Object put(@l Object object0, @l Object object1) {
        Object object2 = a.m(((a)b.c.get(this)), object0, object1, null, 4, null);
        if(object2 == c.c) {
            object2 = this.r(object0, object1);
        }
        if(object2 == null) {
            b.b.incrementAndGet(this);
        }
        return object2;
    }

    private final Object r(Object object0, Object object1) {
        synchronized(this) {
            a b$a0 = (a)b.c.get(this);
            Object object2;
            while((object2 = a.m(b$a0, object0, object1, null, 4, null)) == c.c) {
                b$a0 = b$a0.n();
                b.c.set(this, b$a0);
            }
            return object2;
        }
    }

    @Override
    @m
    public Object remove(@m Object object0) {
        if(object0 == null) {
            return null;
        }
        Object object1 = a.m(((a)b.c.get(this)), object0, null, null, 4, null);
        if(object1 == c.c) {
            object1 = this.r(object0, null);
        }
        if(object1 != null) {
            b.b.decrementAndGet(this);
        }
        return object1;
    }

    public final void s() {
        if(this.a != null) {
            try {
                while(true) {
                    Reference reference0 = this.a.remove();
                    L.n(reference0, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                    this.i(((k)reference0));
                }
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        throw new IllegalStateException("Must be created with weakRefQueue = true");
    }

    private final void t(Object object0) {
        this.core$volatile = object0;
    }

    private final void u(int v) {
        this._size$volatile = v;
    }
}

