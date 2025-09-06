package j$.util.concurrent;

import j..sun.misc.a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream.PutField;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConcurrentHashMap extends AbstractMap implements ConcurrentMap, Serializable, java.util.concurrent.ConcurrentMap {
    volatile transient l[] a;
    private volatile transient l[] b;
    private volatile transient long baseCount;
    private volatile transient c[] c;
    private volatile transient int cellsBusy;
    private transient i d;
    private transient s e;
    private transient e f;
    static final int g = 0;
    private static final a h = null;
    private static final long i = 0L;
    private static final long j = 0L;
    private static final long k = 0L;
    private static final long l = 0L;
    private static final long m = 0L;
    private static final int n = 0;
    private static final int o = 0;
    private static final ObjectStreamField[] serialPersistentFields = null;
    private static final long serialVersionUID = 0x6499DE129D87293DL;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        ConcurrentHashMap.g = Runtime.getRuntime().availableProcessors();
        ObjectStreamField objectStreamField0 = new ObjectStreamField("segments", n[].class);
        Class class0 = Integer.TYPE;
        ConcurrentHashMap.serialPersistentFields = new ObjectStreamField[]{objectStreamField0, new ObjectStreamField("segmentMask", class0), new ObjectStreamField("segmentShift", class0)};
        a a0 = a.h();
        ConcurrentHashMap.h = a0;
        ConcurrentHashMap.i = a0.j(ConcurrentHashMap.class, "sizeCtl");
        ConcurrentHashMap.j = a0.j(ConcurrentHashMap.class, "transferIndex");
        ConcurrentHashMap.k = a0.j(ConcurrentHashMap.class, "baseCount");
        ConcurrentHashMap.l = a0.j(ConcurrentHashMap.class, "cellsBusy");
        ConcurrentHashMap.m = a0.j(c.class, "value");
        ConcurrentHashMap.n = a0.a(l[].class);
        int v = a0.b(l[].class);
        if((v - 1 & v) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        ConcurrentHashMap.o = 0x1F - Integer.numberOfLeadingZeros(v);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int v) {
        this(v, 0.75f, 1);
    }

    public ConcurrentHashMap(int v, float f) {
        this(v, f, 1);
    }

    public ConcurrentHashMap(int v, float f, int v1) {
        if(f <= 0.0f || v < 0 || v1 <= 0) {
            throw new IllegalArgumentException();
        }
        if(v < v1) {
            v = v1;
        }
        long v2 = (long)(((double)(((float)(((long)v))) / f)) + 1.0);
        this.sizeCtl = v2 < 0x40000000L ? ConcurrentHashMap.l(((int)v2)) : 0x40000000;
    }

    public ConcurrentHashMap(Map map0) {
        this.sizeCtl = 16;
        this.putAll(map0);
    }

    // This method was un-flattened
    private final void a(long v, int v1) {
        boolean z3;
        boolean z2;
        boolean z;
        long v2;
        c[] arr_c = this.c;
        if(arr_c == null) {
            v2 = this.baseCount + v;
            if(!ConcurrentHashMap.h.d(this, ConcurrentHashMap.k, this.baseCount, v2)) {
                goto label_4;
            }
            goto label_14;
        }
    label_4:
        if(arr_c == null) {
            z = true;
        }
        else {
            int v3 = arr_c.length - 1;
            if(v3 >= 0) {
                c c0 = arr_c[v3 & ThreadLocalRandom.b()];
                if(c0 == null) {
                    z = true;
                }
                else {
                    z = ConcurrentHashMap.h.d(c0, ConcurrentHashMap.m, c0.value, c0.value + v);
                    if(z) {
                        if(v1 <= 1) {
                            return;
                        }
                        v2 = this.j();
                    label_14:
                        if(v1 >= 0) {
                            while(true) {
                                int v4 = this.sizeCtl;
                                if(v2 < ((long)v4)) {
                                    break;
                                }
                                l[] arr_l = this.a;
                                if(arr_l == null || arr_l.length >= 0x40000000) {
                                    break;
                                }
                                int v5 = Integer.numberOfLeadingZeros(arr_l.length) | 0x8000;
                                if(v4 < 0) {
                                    if(v4 >>> 16 != v5 || v4 == v5 + 1 || v4 == v5 + 0xFFFF) {
                                        break;
                                    }
                                    l[] arr_l1 = this.b;
                                    if(arr_l1 == null || this.transferIndex <= 0) {
                                        break;
                                    }
                                    if(ConcurrentHashMap.h.c(this, ConcurrentHashMap.i, v4, v4 + 1)) {
                                        this.m(arr_l, arr_l1);
                                    }
                                }
                                else if(ConcurrentHashMap.h.c(this, ConcurrentHashMap.i, v4, (v5 << 16) + 2)) {
                                    this.m(arr_l, null);
                                }
                                v2 = this.j();
                            }
                        }
                        return;
                    }
                }
            }
            else {
                z = true;
            }
        }
        int v6 = ThreadLocalRandom.b();
        if(v6 == 0) {
            ThreadLocalRandom.f();
            v6 = ThreadLocalRandom.b();
            z = true;
        }
        boolean z1 = z;
        while(true) {
            z2 = false;
        label_44:
            c[] arr_c1 = this.c;
            if(arr_c1 == null || arr_c1.length <= 0) {
                goto label_83;
            }
            c c1 = arr_c1[arr_c1.length - 1 & v6];
            if(c1 == null) {
                if(this.cellsBusy == 0) {
                    c c2 = new c(v);
                    if(this.cellsBusy != 0 || !ConcurrentHashMap.h.c(this, ConcurrentHashMap.l, 0, 1)) {
                        z2 = false;
                        v6 = ThreadLocalRandom.a(v6);
                        goto label_44;
                    }
                    else {
                        try {
                            c[] arr_c2 = this.c;
                            if(arr_c2 != null && arr_c2.length > 0) {
                                int v7 = arr_c2.length - 1 & v6;
                                if(arr_c2[v7] == null) {
                                    arr_c2[v7] = c2;
                                    this.cellsBusy = 0;
                                    return;
                                }
                            }
                            this.cellsBusy = 0;
                            goto label_44;
                        }
                        catch(Throwable throwable0) {
                            this.cellsBusy = 0;
                            throw throwable0;
                        }
                    }
                }
                else {
                    z2 = false;
                    v6 = ThreadLocalRandom.a(v6);
                    goto label_44;
                }
            }
            if(!z1) {
                z1 = true;
                v6 = ThreadLocalRandom.a(v6);
                goto label_44;
            }
            a a0 = ConcurrentHashMap.h;
            if(a0.d(c1, ConcurrentHashMap.m, c1.value, c1.value + v)) {
                return;
            }
            if(this.c != arr_c1 || arr_c1.length >= ConcurrentHashMap.g) {
                z2 = false;
                v6 = ThreadLocalRandom.a(v6);
                goto label_44;
            }
            if(!z2) {
                z2 = true;
                v6 = ThreadLocalRandom.a(v6);
                goto label_44;
            }
            if(this.cellsBusy != 0 || !a0.c(this, ConcurrentHashMap.l, 0, 1)) {
                v6 = ThreadLocalRandom.a(v6);
                goto label_44;
            }
            try {
                if(this.c == arr_c1) {
                    this.c = (c[])Arrays.copyOf(arr_c1, arr_c1.length << 1);
                }
                this.cellsBusy = 0;
                continue;
            }
            catch(Throwable throwable1) {
            }
            break;
        }
        this.cellsBusy = 0;
        throw throwable1;
    label_83:
        if(this.cellsBusy == 0 && this.c == arr_c1 && ConcurrentHashMap.h.c(this, ConcurrentHashMap.l, 0, 1)) {
            try {
                if(this.c == arr_c1) {
                    c[] arr_c3 = new c[2];
                    arr_c3[v6 & 1] = new c(v);
                    this.c = arr_c3;
                    z3 = true;
                }
                else {
                    z3 = false;
                }
            }
            catch(Throwable throwable2) {
                this.cellsBusy = 0;
                throw throwable2;
            }
            this.cellsBusy = 0;
            if(!z3) {
                goto label_44;
            }
        }
        else if(!ConcurrentHashMap.h.d(this, ConcurrentHashMap.k, this.baseCount, this.baseCount + v)) {
            goto label_44;
        }
    }

    static final boolean b(l[] arr_l, int v, l l0) {
        return ConcurrentHashMap.h.e(arr_l, (((long)v) << ConcurrentHashMap.o) + ((long)ConcurrentHashMap.n), l0);
    }

    static Class c(Object object0) {
        if(object0 instanceof Comparable) {
            Class class0 = object0.getClass();
            if(class0 == String.class) {
                return class0;
            }
            Type[] arr_type = class0.getGenericInterfaces();
            if(arr_type != null) {
                for(int v = 0; v < arr_type.length; ++v) {
                    Type type0 = arr_type[v];
                    if(type0 instanceof ParameterizedType && ((ParameterizedType)type0).getRawType() == Comparable.class) {
                        Type[] arr_type1 = ((ParameterizedType)type0).getActualTypeArguments();
                        if(arr_type1 != null && arr_type1.length == 1 && arr_type1[0] == class0) {
                            return class0;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void clear() {
        l l1;
        l[] arr_l = this.a;
        long v = 0L;
        while(true) {
            int v1 = 0;
        label_3:
            if(arr_l == null || v1 >= arr_l.length) {
                break;
            }
            l l0 = ConcurrentHashMap.k(arr_l, v1);
            if(l0 == null) {
                ++v1;
                goto label_3;
            }
            int v2 = l0.a;
            if(v2 == -1) {
                arr_l = this.d(arr_l, l0);
                continue;
            }
            synchronized(l0) {
                if(ConcurrentHashMap.k(arr_l, v1) == l0) {
                    if(v2 >= 0) {
                        l1 = l0;
                    }
                    else if(l0 instanceof q) {
                        l1 = ((q)l0).f;
                    }
                    else {
                        l1 = null;
                    }
                    while(l1 != null) {
                        --v;
                        l1 = l1.d;
                    }
                    ConcurrentHashMap.h(arr_l, v1, null);
                    ++v1;
                }
            }
            goto label_3;
        }
        if(v != 0L) {
            this.a(v, -1);
        }
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public final Object compute(Object object0, BiFunction biFunction0) {
        l l1;
        if(object0 == null || biFunction0 == null) {
            throw null;
        }
        int v = ConcurrentHashMap.i(object0.hashCode());
        l[] arr_l = this.a;
        int v1 = 0;
        Object object1 = null;
        int v2 = 0;
        while(true) {
            if(arr_l == null || arr_l.length == 0) {
                arr_l = this.e();
                continue;
            }
            int v3 = arr_l.length - 1 & v;
            l l0 = ConcurrentHashMap.k(arr_l, v3);
            if(l0 == null) {
                m m0 = new m();
                synchronized(m0) {
                    if(ConcurrentHashMap.b(arr_l, v3, m0)) {
                        goto label_15;
                    }
                    goto label_27;
                }
                try {
                label_15:
                    object1 = biFunction0.apply(object0, null);
                    if(object1 == null) {
                        l1 = null;
                    }
                    else {
                        l1 = new l(v, object0, object1);
                        v2 = 1;
                    }
                    goto label_25;
                }
                catch(Throwable throwable1) {
                    ConcurrentHashMap.h(arr_l, v3, null);
                    throw throwable1;
                label_25:
                    ConcurrentHashMap.h(arr_l, v3, l1);
                    v1 = 1;
                }
            label_27:
                if(v1 == 0) {
                    continue;
                }
                break;
            }
            int v4 = l0.a;
            if(v4 == -1) {
                arr_l = this.d(arr_l, l0);
                continue;
            }
            synchronized(l0) {
                if(ConcurrentHashMap.k(arr_l, v3) == l0) {
                    if(v4 >= 0) {
                        l l2 = null;
                        l l3 = l0;
                        v1 = 1;
                        while(true) {
                            if(l3.a == v && (l3.b == object0 || l3.b != null && object0.equals(l3.b))) {
                                Object object2 = biFunction0.apply(object0, l3.c);
                                if(object2 == null) {
                                    l l4 = l3.d;
                                    if(l2 == null) {
                                        ConcurrentHashMap.h(arr_l, v3, l4);
                                    }
                                    else {
                                        l2.d = l4;
                                    }
                                    object1 = null;
                                    v2 = -1;
                                }
                                else {
                                    l3.c = object2;
                                    object1 = object2;
                                }
                                break;
                            }
                            l l5 = l3.d;
                            if(l5 == null) {
                                Object object3 = biFunction0.apply(object0, null);
                                if(object3 == null) {
                                    object1 = null;
                                }
                                else {
                                    if(l3.d != null) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                    l3.d = new l(v, object0, object3);
                                    object1 = object3;
                                    v2 = 1;
                                }
                                break;
                            }
                            ++v1;
                            l2 = l3;
                            l3 = l5;
                        }
                    }
                    else if(l0 instanceof q) {
                        r r0 = ((q)l0).e;
                        r r1 = r0 == null ? null : r0.b(v, object0, null);
                        Object object4 = biFunction0.apply(object0, (r1 == null ? null : r1.c));
                        if(object4 == null) {
                            if(r1 != null) {
                                if(((q)l0).f(r1)) {
                                    ConcurrentHashMap.h(arr_l, v3, ConcurrentHashMap.p(((q)l0).f));
                                }
                                v2 = -1;
                            }
                        }
                        else if(r1 == null) {
                            ((q)l0).e(v, object0, object4);
                            v2 = 1;
                        }
                        else {
                            r1.c = object4;
                        }
                        object1 = object4;
                        v1 = 1;
                    }
                    else if(l0 instanceof m) {
                        throw new IllegalStateException("Recursive update");
                    }
                }
            }
            if(v1 == 0) {
                continue;
            }
            else if(v1 >= 8) {
                this.n(arr_l, v3);
                break;
            }
            else {
                break;
            }
            return object1;
        }
        if(v2 != 0) {
            this.a(((long)v2), v1);
        }
        return object1;
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public final Object computeIfAbsent(Object object0, Function function0) {
        l l1;
        if(object0 == null || function0 == null) {
            throw null;
        }
        int v = ConcurrentHashMap.i(object0.hashCode());
        l[] arr_l = this.a;
        Object object1 = null;
        int v1 = 0;
        while(true) {
            if(arr_l == null || arr_l.length == 0) {
                arr_l = this.e();
                continue;
            }
            int v2 = arr_l.length - 1 & v;
            l l0 = ConcurrentHashMap.k(arr_l, v2);
            boolean z = true;
            if(l0 == null) {
                m m0 = new m();
                synchronized(m0) {
                    if(ConcurrentHashMap.b(arr_l, v2, m0)) {
                        object1 = function0.apply(object0);
                        l1 = object1 == null ? null : new l(v, object0, object1);
                        goto label_24;
                    }
                    goto label_26;
                }
                try {
                    object1 = function0.apply(object0);
                    l1 = object1 == null ? null : new l(v, object0, object1);
                    goto label_24;
                }
                catch(Throwable throwable1) {
                    ConcurrentHashMap.h(arr_l, v2, null);
                    throw throwable1;
                label_24:
                    ConcurrentHashMap.h(arr_l, v2, l1);
                    v1 = 1;
                }
            label_26:
                if(v1 == 0) {
                    continue;
                }
                break;
            }
            int v3 = l0.a;
            if(v3 == -1) {
                arr_l = this.d(arr_l, l0);
                continue;
            }
            if(v3 == v && (l0.b == object0 || l0.b != null && object0.equals(l0.b))) {
                Object object2 = l0.c;
                if(object2 != null) {
                    return object2;
                }
            }
            synchronized(l0) {
                if(ConcurrentHashMap.k(arr_l, v2) == l0) {
                    if(v3 >= 0) {
                        l l2 = l0;
                        v1 = 1;
                        while(true) {
                            if(l2.a == v && (l2.b == object0 || l2.b != null && object0.equals(l2.b))) {
                                object1 = l2.c;
                                break;
                            }
                            l l3 = l2.d;
                            if(l3 == null) {
                                Object object3 = function0.apply(object0);
                                if(object3 == null) {
                                    object1 = null;
                                    break;
                                }
                                else {
                                    if(l2.d != null) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                    l2.d = new l(v, object0, object3);
                                    object1 = object3;
                                    goto label_82;
                                }
                            }
                            ++v1;
                            l2 = l3;
                        }
                    }
                    else if(l0 instanceof q) {
                        r r0 = ((q)l0).e;
                        if(r0 == null) {
                            object1 = function0.apply(object0);
                            if(object1 != null) {
                                ((q)l0).e(v, object0, object1);
                                v1 = 2;
                                goto label_82;
                            }
                        }
                        else {
                            r r1 = r0.b(v, object0, null);
                            if(r1 != null) {
                                object1 = r1.c;
                            }
                        }
                        z = false;
                        v1 = 2;
                        goto label_82;
                    }
                    else if(l0 instanceof m) {
                        throw new IllegalStateException("Recursive update");
                    }
                }
                z = false;
            }
        label_82:
            if(v1 == 0) {
                continue;
            }
            else {
                if(v1 >= 8) {
                    this.n(arr_l, v2);
                }
                if(z) {
                    break;
                }
                return object1;
            }
            return object1;
        }
        if(object1 != null) {
            this.a(1L, v1);
        }
        return object1;
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public final Object computeIfPresent(Object object0, BiFunction biFunction0) {
        if(object0 == null || biFunction0 == null) {
            throw null;
        }
        int v = ConcurrentHashMap.i(object0.hashCode());
        l[] arr_l = this.a;
        int v1 = 0;
        Object object1 = null;
        int v2 = 0;
        while(true) {
            if(arr_l == null || arr_l.length == 0) {
                arr_l = this.e();
            }
            else {
                int v3 = arr_l.length - 1 & v;
                l l0 = ConcurrentHashMap.k(arr_l, v3);
                if(l0 == null) {
                    break;
                }
                int v4 = l0.a;
                if(v4 == -1) {
                    arr_l = this.d(arr_l, l0);
                }
                else {
                    synchronized(l0) {
                        if(ConcurrentHashMap.k(arr_l, v3) == l0) {
                            if(v4 >= 0) {
                                v2 = 1;
                                l l1 = null;
                                for(l l2 = l0; true; l2 = l4) {
                                    if(l2.a == v && (l2.b == object0 || l2.b != null && object0.equals(l2.b))) {
                                        object1 = biFunction0.apply(object0, l2.c);
                                        if(object1 == null) {
                                            l l3 = l2.d;
                                            if(l1 == null) {
                                                ConcurrentHashMap.h(arr_l, v3, l3);
                                            }
                                            else {
                                                l1.d = l3;
                                            }
                                            v1 = -1;
                                        }
                                        else {
                                            l2.c = object1;
                                        }
                                        break;
                                    }
                                    l l4 = l2.d;
                                    if(l4 == null) {
                                        break;
                                    }
                                    ++v2;
                                    l1 = l2;
                                }
                            }
                            else if(l0 instanceof q) {
                                r r0 = ((q)l0).e;
                                if(r0 != null) {
                                    r r1 = r0.b(v, object0, null);
                                    if(r1 != null) {
                                        object1 = biFunction0.apply(object0, r1.c);
                                        if(object1 == null) {
                                            if(((q)l0).f(r1)) {
                                                ConcurrentHashMap.h(arr_l, v3, ConcurrentHashMap.p(((q)l0).f));
                                            }
                                            v1 = -1;
                                        }
                                        else {
                                            r1.c = object1;
                                        }
                                    }
                                }
                                v2 = 2;
                            }
                            else if(l0 instanceof m) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                    }
                    if(v2 != 0) {
                        break;
                    }
                }
            }
        }
        if(v1 != 0) {
            this.a(((long)v1), v2);
        }
        return object1;
    }

    public boolean contains(Object object0) {
        return this.containsValue(object0);
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.get(object0) != null;
    }

    @Override
    public final boolean containsValue(Object object0) {
        object0.getClass();
        l[] arr_l = this.a;
        if(arr_l != null) {
            p p0 = new p(arr_l, arr_l.length, 0, arr_l.length);
            l l0;
            while((l0 = p0.a()) != null) {
                if(l0.c == object0 || l0.c != null && object0.equals(l0.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    final l[] d(l[] arr_l, l l0) {
        if(l0 instanceof g) {
            l[] arr_l1 = ((g)l0).e;
            int v = Integer.numberOfLeadingZeros(arr_l.length);
            while(arr_l1 == this.b && this.a == arr_l) {
                int v1 = this.sizeCtl;
                if(v1 >= 0 || v1 >>> 16 != (v | 0x8000) || v1 == (v | 0x8000) + 1 || v1 == 0xFFFF + (v | 0x8000) || this.transferIndex <= 0) {
                    break;
                }
                if(ConcurrentHashMap.h.c(this, ConcurrentHashMap.i, v1, v1 + 1)) {
                    this.m(arr_l, arr_l1);
                    return arr_l1;
                }
                if(false) {
                    break;
                }
            }
            return arr_l1;
        }
        return this.a;
    }

    private final l[] e() {
        l[] arr_l;
        while(true) {
            arr_l = this.a;
            if(arr_l != null && arr_l.length != 0) {
                break;
            }
            int v = this.sizeCtl;
            if(v < 0) {
                Thread.yield();
            }
            else if(ConcurrentHashMap.h.c(this, ConcurrentHashMap.i, v, -1)) {
                try {
                    l[] arr_l1 = this.a;
                    if(arr_l1 == null || arr_l1.length == 0) {
                        int v2 = v <= 0 ? 16 : v;
                        l[] arr_l2 = new l[v2];
                        this.a = arr_l2;
                        v = v2 - (v2 >>> 2);
                        arr_l1 = arr_l2;
                    }
                    return arr_l1;
                }
                finally {
                    this.sizeCtl = v;
                }
            }
        }
        return arr_l;
    }

    @Override
    public Set entrySet() {
        Set set0 = this.f;
        if(set0 != null) {
            return set0;
        }
        e e0 = new e(this);  // 初始化器: Lj$/util/concurrent/b;-><init>(Lj$/util/concurrent/ConcurrentHashMap;)V
        this.f = e0;
        return e0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 != this) {
            if(!(object0 instanceof Map)) {
                return false;
            }
            int v = this.a == null ? 0 : this.a.length;
            p p0 = new p(this.a, v, 0, v);
            l l0;
            while((l0 = p0.a()) != null) {
                Object object1 = l0.c;
                Object object2 = ((Map)object0).get(l0.b);
                if(object2 == null || object2 != object1 && !object2.equals(object1)) {
                    return false;
                }
            }
            for(Object object3: ((Map)object0).entrySet()) {
                Object object4 = ((Map.Entry)object3).getKey();
                if(object4 != null) {
                    Object object5 = ((Map.Entry)object3).getValue();
                    if(object5 == null) {
                        return false;
                    }
                    Object object6 = this.get(object4);
                    if(object6 == null || object5 != object6 && !object5.equals(object6)) {
                        return false;
                    }
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    final Object f(Object object0, Object object1, boolean z) {
        Object object3;
        if(object0 == null || object1 == null) {
            throw null;
        }
        int v = ConcurrentHashMap.i(object0.hashCode());
        l[] arr_l = this.a;
        int v1 = 0;
        while(true) {
            if(arr_l == null || arr_l.length == 0) {
                arr_l = this.e();
            }
            else {
                int v2 = arr_l.length - 1 & v;
                l l0 = ConcurrentHashMap.k(arr_l, v2);
                if(l0 == null) {
                    if(!ConcurrentHashMap.b(arr_l, v2, new l(v, object0, object1))) {
                        continue;
                    }
                    break;
                }
                int v3 = l0.a;
                if(v3 == -1) {
                    arr_l = this.d(arr_l, l0);
                }
                else {
                    if(z && v3 == v && (l0.b == object0 || l0.b != null && object0.equals(l0.b))) {
                        Object object2 = l0.c;
                        if(object2 != null) {
                            return object2;
                        }
                    }
                    synchronized(l0) {
                        if(ConcurrentHashMap.k(arr_l, v2) == l0) {
                            if(v3 >= 0) {
                                v1 = 1;
                                l l1 = l0;
                                while(true) {
                                    if(l1.a == v && (l1.b == object0 || l1.b != null && object0.equals(l1.b))) {
                                        object3 = l1.c;
                                        if(!z) {
                                            l1.c = object1;
                                        }
                                        goto label_53;
                                    }
                                    l l2 = l1.d;
                                    if(l2 == null) {
                                        l1.d = new l(v, object0, object1);
                                        break;
                                    }
                                    ++v1;
                                    l1 = l2;
                                }
                            }
                            else if(l0 instanceof q) {
                                r r0 = ((q)l0).e(v, object0, object1);
                                if(r0 == null) {
                                    object3 = null;
                                }
                                else {
                                    Object object4 = r0.c;
                                    if(!z) {
                                        r0.c = object1;
                                    }
                                    object3 = object4;
                                }
                                v1 = 2;
                                goto label_53;
                            }
                            else if(l0 instanceof m) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        object3 = null;
                    }
                label_53:
                    if(v1 != 0) {
                        if(v1 >= 8) {
                            this.n(arr_l, v2);
                        }
                        if(object3 == null) {
                            break;
                        }
                        return object3;
                    }
                }
            }
        }
        this.a(1L, v1);
        return null;
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public final void forEach(BiConsumer biConsumer0) {
        biConsumer0.getClass();
        l[] arr_l = this.a;
        if(arr_l != null) {
            p p0 = new p(arr_l, arr_l.length, 0, arr_l.length);
            l l0;
            while((l0 = p0.a()) != null) {
                biConsumer0.accept(l0.b, l0.c);
            }
        }
    }

    final Object g(Object object0, Object object1, Object object2) {
        Object object3;
        int v = ConcurrentHashMap.i(object0.hashCode());
        l[] arr_l = this.a;
        while(arr_l != null && arr_l.length != 0) {
            int v1 = arr_l.length - 1 & v;
            l l0 = ConcurrentHashMap.k(arr_l, v1);
            if(l0 == null) {
                break;
            }
            int v2 = l0.a;
            if(v2 == -1) {
                arr_l = this.d(arr_l, l0);
            }
            else {
                boolean z = true;
                synchronized(l0) {
                    if(ConcurrentHashMap.k(arr_l, v1) != l0) {
                        z = false;
                        object3 = null;
                    }
                    else if(v2 >= 0) {
                        l l1 = null;
                        l l2 = l0;
                        while(true) {
                            if(l2.a == v && (l2.b == object0 || l2.b != null && object0.equals(l2.b))) {
                                object3 = l2.c;
                                if(object2 != null && object2 != object3 && (object3 == null || !object2.equals(object3))) {
                                    break;
                                }
                                else if(object1 != null) {
                                    l2.c = object1;
                                    goto label_62;
                                }
                                else {
                                    if(l1 == null) {
                                        ConcurrentHashMap.h(arr_l, v1, l2.d);
                                    }
                                    else {
                                        l1.d = l2.d;
                                    }
                                    goto label_62;
                                }
                            }
                            l l3 = l2.d;
                            if(l3 == null) {
                                break;
                            }
                            l1 = l2;
                            l2 = l3;
                        }
                        object3 = null;
                    }
                    else if(l0 instanceof q) {
                        r r0 = ((q)l0).e;
                        if(r0 == null) {
                            object3 = null;
                        }
                        else {
                            r r1 = r0.b(v, object0, null);
                            if(r1 == null) {
                                object3 = null;
                            }
                            else {
                                object3 = r1.c;
                                if(object2 != null && object2 != object3 && (object3 == null || !object2.equals(object3))) {
                                    object3 = null;
                                }
                                else if(object1 != null) {
                                    r1.c = object1;
                                }
                                else if(((q)l0).f(r1)) {
                                    ConcurrentHashMap.h(arr_l, v1, ConcurrentHashMap.p(((q)l0).f));
                                }
                            }
                        }
                    }
                    else {
                        if(l0 instanceof m) {
                            throw new IllegalStateException("Recursive update");
                        }
                        z = false;
                        object3 = null;
                    }
                }
            label_62:
                if(z) {
                    if(object3 == null) {
                        break;
                    }
                    if(object1 == null) {
                        this.a(-1L, -1);
                    }
                    return object3;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Override
    public Object get(Object object0) {
        int v = ConcurrentHashMap.i(object0.hashCode());
        l[] arr_l = this.a;
        if(arr_l != null && arr_l.length > 0) {
            l l0 = ConcurrentHashMap.k(arr_l, arr_l.length - 1 & v);
            if(l0 != null) {
                int v1 = l0.a;
                if(v1 == v) {
                    if(l0.b == object0 || l0.b != null && object0.equals(l0.b)) {
                        return l0.c;
                    }
                }
                else if(v1 < 0) {
                    l l1 = l0.a(v, object0);
                    return l1 == null ? null : l1.c;
                }
                while(true) {
                    l0 = l0.d;
                    if(l0 == null) {
                        break;
                    }
                    if(l0.a == v && (l0.b == object0 || l0.b != null && object0.equals(l0.b))) {
                        return l0.c;
                    }
                }
            }
        }
        return null;
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object object0, Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? object1 : object2;
    }

    static final void h(l[] arr_l, int v, l l0) {
        ConcurrentHashMap.h.l(arr_l, (((long)v) << ConcurrentHashMap.o) + ((long)ConcurrentHashMap.n), l0);
    }

    @Override
    public final int hashCode() {
        l[] arr_l = this.a;
        int v = 0;
        if(arr_l != null) {
            p p0 = new p(arr_l, arr_l.length, 0, arr_l.length);
            l l0;
            while((l0 = p0.a()) != null) {
                v += l0.c.hashCode() ^ l0.b.hashCode();
            }
        }
        return v;
    }

    static final int i(int v) {
        return (v ^ v >>> 16) & 0x7FFFFFFF;
    }

    @Override
    public boolean isEmpty() {
        return this.j() <= 0L;
    }

    final long j() {
        c[] arr_c = this.c;
        long v = this.baseCount;
        if(arr_c != null) {
            for(int v1 = 0; v1 < arr_c.length; ++v1) {
                c c0 = arr_c[v1];
                if(c0 != null) {
                    v += c0.value;
                }
            }
        }
        return v;
    }

    static final l k(l[] arr_l, int v) {
        return (l)ConcurrentHashMap.h.g(arr_l, (((long)v) << ConcurrentHashMap.o) + ((long)ConcurrentHashMap.n));
    }

    @Override
    public Set keySet() {
        Set set0 = this.d;
        if(set0 != null) {
            return set0;
        }
        i i0 = new i(this);  // 初始化器: Lj$/util/concurrent/b;-><init>(Lj$/util/concurrent/ConcurrentHashMap;)V
        this.d = i0;
        return i0;
    }

    private static final int l(int v) {
        int v1 = Integer.numberOfLeadingZeros(v - 1);
        if(-1 >>> v1 >= 0) {
            return -1 >>> v1 < 0x40000000 ? 1 + (-1 >>> v1) : 0x40000000;
        }
        return 1;
    }

    private final void m(l[] arr_l, l[] arr_l1) {
        l l8;
        l l7;
        int v13;
        l l4;
        g g1;
        int v8;
        ConcurrentHashMap concurrentHashMap1;
        l[] arr_l3;
        ConcurrentHashMap concurrentHashMap0 = this;
        int v = ConcurrentHashMap.g <= 1 ? arr_l.length : (arr_l.length >>> 3) / ConcurrentHashMap.g;
        int v1 = v >= 16 ? v : 16;
        if(arr_l1 == null) {
            try {
                l[] arr_l2 = new l[arr_l.length << 1];
                concurrentHashMap0.b = arr_l2;
                concurrentHashMap0.transferIndex = arr_l.length;
                arr_l3 = arr_l2;
            }
            catch(Throwable unused_ex) {
                concurrentHashMap0.sizeCtl = 0x7FFFFFFF;
                return;
            }
        }
        else {
            arr_l3 = arr_l1;
        }
        int v2 = arr_l3.length;
        g g0 = new g(arr_l3);
        int v3 = 0;
        int v4 = 0;
        boolean z = true;
        boolean z1 = false;
        while(true) {
            l l0 = null;
            if(!z) {
                if(v4 >= 0 && v4 < arr_l.length) {
                    int v7 = v4 + arr_l.length;
                    if(v7 < v2) {
                        l l1 = ConcurrentHashMap.k(arr_l, v4);
                        if(l1 == null) {
                            z = ConcurrentHashMap.b(arr_l, v4, g0);
                            concurrentHashMap1 = concurrentHashMap0;
                            v8 = v2;
                            g1 = g0;
                        }
                        else {
                            int v9 = l1.a;
                            if(v9 == -1) {
                                concurrentHashMap1 = concurrentHashMap0;
                                v8 = v2;
                                g1 = g0;
                                z = true;
                            }
                            else {
                                synchronized(l1) {
                                    if(ConcurrentHashMap.k(arr_l, v4) != l1) {
                                        v8 = v2;
                                    }
                                    else if(v9 >= 0) {
                                        int v10 = v9 & arr_l.length;
                                        l l2 = l1.d;
                                        l l3 = l1;
                                        while(l2 != null) {
                                            int v11 = l2.a & arr_l.length;
                                            if(v11 != v10) {
                                                l3 = l2;
                                                v10 = v11;
                                            }
                                            l2 = l2.d;
                                        }
                                        if(v10 == 0) {
                                            l4 = null;
                                            l0 = l3;
                                        }
                                        else {
                                            l4 = l3;
                                        }
                                        l l5 = l1;
                                        while(l5 != l3) {
                                            int v12 = l5.a;
                                            Object object0 = l5.b;
                                            Object object1 = l5.c;
                                            if((v12 & arr_l.length) == 0) {
                                                v13 = v2;
                                                l0 = new l(v12, object0, object1, l0);
                                            }
                                            else {
                                                v13 = v2;
                                                l4 = new l(v12, object0, object1, l4);
                                            }
                                            l5 = l5.d;
                                            v2 = v13;
                                        }
                                        v8 = v2;
                                        ConcurrentHashMap.h(arr_l3, v4, l0);
                                        ConcurrentHashMap.h(arr_l3, v7, l4);
                                        ConcurrentHashMap.h(arr_l, v4, g0);
                                        g1 = g0;
                                        z = true;
                                        goto label_136;
                                    }
                                    else {
                                        v8 = v2;
                                        if(l1 instanceof q) {
                                            r r0 = null;
                                            r r1 = null;
                                            l l6 = ((q)l1).f;
                                            int v14 = 0;
                                            int v15 = 0;
                                            r r2 = null;
                                            while(l6 != null) {
                                                r r3 = new r(l6.a, l6.b, l6.c, null, null);
                                                if((l6.a & arr_l.length) == 0) {
                                                    r3.h = r1;
                                                    if(r1 == null) {
                                                        l0 = r3;
                                                    }
                                                    else {
                                                        r1.d = r3;
                                                    }
                                                    ++v14;
                                                    r1 = r3;
                                                }
                                                else {
                                                    r3.h = r0;
                                                    if(r0 == null) {
                                                        r2 = r3;
                                                    }
                                                    else {
                                                        r0.d = r3;
                                                    }
                                                    ++v15;
                                                    r0 = r3;
                                                }
                                                l6 = l6.d;
                                            }
                                            if(v14 <= 6) {
                                                l7 = ConcurrentHashMap.p(((r)l0));
                                            }
                                            else {
                                                l7 = v15 == 0 ? ((q)l1) : new q(((r)l0));
                                            }
                                            if(v15 <= 6) {
                                                l8 = ConcurrentHashMap.p(r2);
                                            }
                                            else {
                                                l8 = v14 == 0 ? ((q)l1) : new q(r2);
                                            }
                                            ConcurrentHashMap.h(arr_l3, v4, l7);
                                            ConcurrentHashMap.h(arr_l3, v7, l8);
                                            g1 = g0;
                                            ConcurrentHashMap.h(arr_l, v4, g1);
                                            z = true;
                                            goto label_136;
                                        }
                                    }
                                    g1 = g0;
                                label_136:
                                    concurrentHashMap1 = this;
                                }
                            }
                        }
                    }
                }
                else {
                    v8 = v2;
                    g1 = g0;
                    if(z1) {
                        this.b = null;
                        this.a = arr_l3;
                        this.sizeCtl = (arr_l.length << 1) - (arr_l.length >>> 1);
                        return;
                    }
                    concurrentHashMap1 = this;
                    int v16 = concurrentHashMap1.sizeCtl;
                    if(ConcurrentHashMap.h.c(this, ConcurrentHashMap.i, v16, v16 - 1)) {
                        if(v16 - 2 != (Integer.numberOfLeadingZeros(arr_l.length) | 0x8000) << 16) {
                            return;
                        }
                        v4 = arr_l.length;
                        z = true;
                        z1 = true;
                    }
                }
                g0 = g1;
                concurrentHashMap0 = concurrentHashMap1;
                v2 = v8;
            }
            else if(v4 - 1 < v3 && !z1) {
                int v5 = concurrentHashMap0.transferIndex;
                if(v5 <= 0) {
                    v4 = -1;
                    z = false;
                }
                else {
                    int v6 = v5 <= v1 ? 0 : v5 - v1;
                    if(ConcurrentHashMap.h.c(this, ConcurrentHashMap.j, v5, v6)) {
                        v4 = v5 - 1;
                        v3 = v6;
                        z = false;
                    }
                    else {
                        --v4;
                    }
                }
            }
            else {
                --v4;
                z = false;
            }
        }
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public final Object merge(Object object0, Object object1, BiFunction biFunction0) {
        int v4;
        if(object0 == null || object1 == null || biFunction0 == null) {
            throw null;
        }
        int v = ConcurrentHashMap.i(object0.hashCode());
        l[] arr_l = this.a;
        int v1 = 0;
        Object object2 = null;
        int v2 = 0;
        while(true) {
            if(arr_l == null || arr_l.length == 0) {
                arr_l = this.e();
                continue;
            }
            int v3 = arr_l.length - 1 & v;
            l l0 = ConcurrentHashMap.k(arr_l, v3);
            v4 = 1;
            if(l0 == null) {
                if(!ConcurrentHashMap.b(arr_l, v3, new l(v, object0, object1))) {
                    continue;
                }
                break;
            }
            int v5 = l0.a;
            if(v5 == -1) {
                arr_l = this.d(arr_l, l0);
                continue;
            }
            synchronized(l0) {
                if(ConcurrentHashMap.k(arr_l, v3) == l0) {
                    if(v5 >= 0) {
                        l l1 = null;
                        l l2 = l0;
                        v1 = 1;
                        while(true) {
                            if(l2.a == v && (l2.b == object0 || l2.b != null && object0.equals(l2.b))) {
                                Object object3 = biFunction0.apply(l2.c, object1);
                                if(object3 == null) {
                                    l l3 = l2.d;
                                    if(l1 == null) {
                                        ConcurrentHashMap.h(arr_l, v3, l3);
                                    }
                                    else {
                                        l1.d = l3;
                                    }
                                    object2 = null;
                                    v2 = -1;
                                }
                                else {
                                    l2.c = object3;
                                    object2 = object3;
                                }
                                break;
                            }
                            l l4 = l2.d;
                            if(l4 == null) {
                                l2.d = new l(v, object0, object1);
                                object2 = object1;
                                v2 = 1;
                                break;
                            }
                            ++v1;
                            l1 = l2;
                            l2 = l4;
                        }
                    }
                    else if(l0 instanceof q) {
                        r r0 = ((q)l0).e;
                        r r1 = r0 == null ? null : r0.b(v, object0, null);
                        Object object4 = r1 == null ? object1 : biFunction0.apply(r1.c, object1);
                        if(object4 == null) {
                            if(r1 != null) {
                                if(((q)l0).f(r1)) {
                                    ConcurrentHashMap.h(arr_l, v3, ConcurrentHashMap.p(((q)l0).f));
                                }
                                v2 = -1;
                            }
                        }
                        else if(r1 == null) {
                            ((q)l0).e(v, object0, object4);
                            v2 = 1;
                        }
                        else {
                            r1.c = object4;
                        }
                        v1 = 2;
                        object2 = object4;
                    }
                    else if(l0 instanceof m) {
                        throw new IllegalStateException("Recursive update");
                    }
                }
            }
            if(v1 == 0) {
                continue;
            }
            else {
                if(v1 >= 8) {
                    this.n(arr_l, v3);
                }
                v4 = v2;
                object1 = object2;
                break;
            }
            return object1;
        }
        if(v4 != 0) {
            this.a(((long)v4), v1);
        }
        return object1;
    }

    private final void n(l[] arr_l, int v) {
        if(arr_l.length < 0x40) {
            this.o(arr_l.length << 1);
            return;
        }
        l l0 = ConcurrentHashMap.k(arr_l, v);
        if(l0 != null && l0.a >= 0) {
            synchronized(l0) {
                if(ConcurrentHashMap.k(arr_l, v) == l0) {
                    r r0 = null;
                    l l1 = l0;
                    for(r r1 = null; l1 != null; r1 = r2) {
                        r r2 = new r(l1.a, l1.b, l1.c, null, null);
                        r2.h = r1;
                        if(r1 == null) {
                            r0 = r2;
                        }
                        else {
                            r1.d = r2;
                        }
                        l1 = l1.d;
                    }
                    ConcurrentHashMap.h(arr_l, v, new q(r0));
                }
            }
        }
    }

    private final void o(int v) {
        int v1 = v < 0x20000000 ? ConcurrentHashMap.l(v + (v >>> 1) + 1) : 0x40000000;
        int v2;
        while((v2 = this.sizeCtl) >= 0) {
            l[] arr_l = this.a;
            if(arr_l != null && arr_l.length != 0) {
                if(v1 <= v2 || arr_l.length >= 0x40000000) {
                    break;
                }
                if(arr_l != this.a || !ConcurrentHashMap.h.c(this, ConcurrentHashMap.i, v2, ((Integer.numberOfLeadingZeros(arr_l.length) | 0x8000) << 16) + 2)) {
                    continue;
                }
                this.m(arr_l, null);
            }
            else {
                int v3 = v2 <= v1 ? v1 : v2;
                if(ConcurrentHashMap.h.c(this, ConcurrentHashMap.i, v2, -1)) {
                    try {
                        if(this.a == arr_l) {
                            this.a = new l[v3];
                            v2 = v3 - (v3 >>> 2);
                        }
                    }
                    finally {
                        this.sizeCtl = v2;
                    }
                }
            }
        }
    }

    static l p(r r0) {
        l l0 = null;
        for(l l1 = null; r0 != null; l1 = l2) {
            l l2 = new l(r0.a, r0.b, r0.c);
            if(l1 == null) {
                l0 = l2;
            }
            else {
                l1.d = l2;
            }
            r0 = r0.d;
        }
        return l0;
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.f(object0, object1, false);
    }

    @Override
    public void putAll(Map map0) {
        this.o(map0.size());
        for(Object object0: map0.entrySet()) {
            this.f(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue(), false);
        }
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        return this.f(object0, object1, true);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        int v8;
        int v6;
        this.sizeCtl = -1;
        objectInputStream0.defaultReadObject();
        long v = 0L;
        long v1 = 0L;
        l l0;
        for(l0 = null; true; l0 = new l(ConcurrentHashMap.i(object0.hashCode()), object0, object1, l0)) {
            Object object0 = objectInputStream0.readObject();
            Object object1 = objectInputStream0.readObject();
            if(object0 == null || object1 == null) {
                break;
            }
            ++v1;
        }
        if(v1 == 0L) {
            this.sizeCtl = 0;
            return;
        }
        long v2 = (long)(((double)(((float)v1) / 0.75f)) + 1.0);
        int v3 = v2 < 0x40000000L ? ConcurrentHashMap.l(((int)v2)) : 0x40000000;
        l[] arr_l = new l[v3];
        while(l0 != null) {
            l l1 = l0.d;
            int v4 = l0.a;
            int v5 = v4 & v3 - 1;
            l l2 = ConcurrentHashMap.k(arr_l, v5);
            if(l2 == null) {
                v6 = 1;
            }
            else {
                Object object2 = l0.b;
                if(l2.a < 0) {
                    if(((q)l2).e(v4, object2, l0.c) == null) {
                        ++v;
                    }
                    v6 = 0;
                }
                else {
                    l l3 = l2;
                    int v7 = 0;
                    while(true) {
                        v8 = 1;
                        if(l3 != null) {
                            if(l3.a != v4 || l3.b != object2 && (l3.b == null || !object2.equals(l3.b))) {
                                ++v7;
                                l3 = l3.d;
                                continue;
                            }
                            else {
                                v8 = 0;
                            }
                        }
                        break;
                    }
                    if(v8 == 0 || v7 < 8) {
                        v6 = v8;
                    }
                    else {
                        l0.d = l2;
                        l l4 = l0;
                        r r0 = null;
                        for(r r1 = null; l4 != null; r1 = r2) {
                            r r2 = new r(l4.a, l4.b, l4.c, null, null);
                            r2.h = r1;
                            if(r1 == null) {
                                r0 = r2;
                            }
                            else {
                                r1.d = r2;
                            }
                            l4 = l4.d;
                        }
                        ConcurrentHashMap.h(arr_l, v5, new q(r0));
                        ++v;
                        v6 = 0;
                    }
                }
            }
            if(v6 != 0) {
                ++v;
                l0.d = l2;
                ConcurrentHashMap.h(arr_l, v5, l0);
            }
            l0 = l1;
        }
        this.a = arr_l;
        this.sizeCtl = v3 - (v3 >>> 2);
        this.baseCount = v;
    }

    @Override
    public Object remove(Object object0) {
        return this.g(object0, null, null);
    }

    @Override  // j$.util.Map
    public boolean remove(Object object0, Object object1) {
        object0.getClass();
        return object1 != null && this.g(object0, null, object1) != null;
    }

    @Override  // j$.util.Map
    public final Object replace(Object object0, Object object1) {
        if(object0 == null || object1 == null) {
            throw null;
        }
        return this.g(object0, object1, null);
    }

    @Override  // j$.util.Map
    public boolean replace(Object object0, Object object1, Object object2) {
        if(object0 == null || object1 == null || object2 == null) {
            throw null;
        }
        return this.g(object0, object2, object1) != null;
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public final void replaceAll(BiFunction biFunction0) {
        Object object3;
        Object object0;
        biFunction0.getClass();
        l[] arr_l = this.a;
        if(arr_l != null) {
            p p0 = new p(arr_l, arr_l.length, 0, arr_l.length);
        alab1:
            while(true) {
                do {
                    l l0 = p0.a();
                    if(l0 == null) {
                        break alab1;
                    }
                    object0 = l0.c;
                    Object object1 = l0.b;
                label_8:
                    Object object2 = biFunction0.apply(object1, object0);
                    object2.getClass();
                    if(this.g(object1, object2, object0) != null) {
                        continue alab1;
                    }
                    object3 = this.get(object1);
                }
                while(object3 == null);
                object0 = object3;
                goto label_8;
            }
        }
    }

    @Override
    public int size() {
        long v = this.j();
        if(v < 0L) {
            return 0;
        }
        return v <= 0x7FFFFFFFL ? ((int)v) : 0x7FFFFFFF;
    }

    @Override
    public String toString() {
        int v = this.a == null ? 0 : this.a.length;
        p p0 = new p(this.a, v, 0, v);
        StringBuilder stringBuilder0 = new StringBuilder("{");
        l l0 = p0.a();
        if(l0 != null) {
            while(true) {
                String s = l0.b;
                String s1 = l0.c;
                if(s == this) {
                    s = "(this Map)";
                }
                stringBuilder0.append(s);
                stringBuilder0.append('=');
                if(s1 == this) {
                    s1 = "(this Map)";
                }
                stringBuilder0.append(s1);
                l0 = p0.a();
                if(l0 == null) {
                    break;
                }
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    @Override
    public Collection values() {
        Collection collection0 = this.e;
        if(collection0 != null) {
            return collection0;
        }
        s s0 = new s(this);  // 初始化器: Lj$/util/concurrent/b;-><init>(Lj$/util/concurrent/ConcurrentHashMap;)V
        this.e = s0;
        return s0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        int v = 0;
        int v1;
        for(v1 = 1; v1 < 16; v1 <<= 1) {
            ++v;
        }
        n[] arr_n = new n[16];
        for(int v2 = 0; v2 < 16; ++v2) {
            arr_n[v2] = new n();  // 初始化器: Ljava/util/concurrent/locks/ReentrantLock;-><init>()V
        }
        ObjectOutputStream.PutField objectOutputStream$PutField0 = objectOutputStream0.putFields();
        objectOutputStream$PutField0.put("segments", arr_n);
        objectOutputStream$PutField0.put("segmentShift", 0x20 - v);
        objectOutputStream$PutField0.put("segmentMask", v1 - 1);
        objectOutputStream0.writeFields();
        l[] arr_l = this.a;
        if(arr_l != null) {
            p p0 = new p(arr_l, arr_l.length, 0, arr_l.length);
            l l0;
            while((l0 = p0.a()) != null) {
                objectOutputStream0.writeObject(l0.b);
                objectOutputStream0.writeObject(l0.c);
            }
        }
        objectOutputStream0.writeObject(null);
        objectOutputStream0.writeObject(null);
    }
}

