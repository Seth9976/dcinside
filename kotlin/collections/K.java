package kotlin.collections;

import A3.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@h0(version = "1.4")
@s0({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,660:1\n476#1,53:663\n476#1,53:716\n37#2,2:661\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n471#1:663,53\n473#1:716,53\n46#1:661,2\n*E\n"})
public final class k extends f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private int a;
    @l
    private Object[] b;
    private int c;
    @l
    public static final a d = null;
    @l
    private static final Object[] e = null;
    private static final int f = 10;

    static {
        k.d = new a(null);
        k.e = new Object[0];
    }

    public k() {
        this.b = k.e;
    }

    public k(int v) {
        Object[] arr_object;
        if(v == 0) {
            arr_object = k.e;
        }
        else if(v > 0) {
            arr_object = new Object[v];
        }
        else {
            throw new IllegalArgumentException("Illegal Capacity: " + v);
        }
        this.b = arr_object;
    }

    public k(@l Collection collection0) {
        L.p(collection0, "elements");
        super();
        Object[] arr_object = collection0.toArray(new Object[0]);
        this.b = arr_object;
        this.c = arr_object.length;
        if(arr_object.length == 0) {
            this.b = k.e;
        }
    }

    private final void A(int v, int v1) {
        int v2 = this.u(this.a + (v - 1));
        int v3 = this.u(this.a + (v1 - 1));
        while(v > 0) {
            int v4 = Math.min(v, Math.min(v2 + 1, v3 + 1));
            int v5 = v3 - v4;
            int v6 = v2 - v4;
            kotlin.collections.l.B0(this.b, this.b, v5 + 1, v6 + 1, v2 + 1);
            v2 = this.q(v6);
            v3 = this.q(v5);
            v -= v4;
        }
    }

    private final void B(int v, int v1) {
        int v2 = this.u(this.a + v1);
        int v3 = this.u(this.a + v);
        int v4 = this.size();
        while(true) {
            v4 -= v1;
            if(v4 <= 0) {
                break;
            }
            v1 = Math.min(v4, Math.min(this.b.length - v2, this.b.length - v3));
            int v5 = v2 + v1;
            kotlin.collections.l.B0(this.b, this.b, v3, v2, v5);
            v2 = this.u(v5);
            v3 = this.u(v3 + v1);
        }
    }

    public final void C(int v, int v1) {
        this.removeRange(v, v1);
    }

    @l
    public final Object[] D() {
        return this.toArray();
    }

    @l
    public final Object[] E(@l Object[] arr_object) {
        L.p(arr_object, "array");
        return this.toArray(arr_object);
    }

    @Override  // kotlin.collections.f
    public int a() {
        return this.c;
    }

    @Override  // kotlin.collections.f
    public void add(int v, Object object0) {
        c.a.c(v, this.size());
        if(v == this.size()) {
            this.addLast(object0);
            return;
        }
        if(v == 0) {
            this.addFirst(object0);
            return;
        }
        this.x();
        this.h(this.size() + 1);
        int v1 = this.u(this.a + v);
        if(v < this.size() + 1 >> 1) {
            int v2 = this.g(v1);
            int v3 = this.g(this.a);
            int v4 = this.a;
            if(v2 >= v4) {
                Object[] arr_object = this.b;
                arr_object[v3] = arr_object[v4];
                kotlin.collections.l.B0(arr_object, arr_object, v4, v4 + 1, v2 + 1);
            }
            else {
                kotlin.collections.l.B0(this.b, this.b, v4 - 1, v4, this.b.length);
                Object[] arr_object1 = this.b;
                arr_object1[arr_object1.length - 1] = arr_object1[0];
                kotlin.collections.l.B0(arr_object1, arr_object1, 0, 1, v2 + 1);
            }
            this.b[v2] = object0;
            this.a = v3;
        }
        else {
            int v5 = this.u(this.a + this.size());
            if(v1 < v5) {
                kotlin.collections.l.B0(this.b, this.b, v1 + 1, v1, v5);
            }
            else {
                kotlin.collections.l.B0(this.b, this.b, 1, 0, v5);
                Object[] arr_object2 = this.b;
                arr_object2[0] = arr_object2[arr_object2.length - 1];
                kotlin.collections.l.B0(arr_object2, arr_object2, v1 + 1, v1, arr_object2.length - 1);
            }
            this.b[v1] = object0;
        }
        this.c = this.size() + 1;
    }

    @Override
    public boolean add(Object object0) {
        this.addLast(object0);
        return true;
    }

    @Override
    public boolean addAll(int v, @l Collection collection0) {
        L.p(collection0, "elements");
        c.a.c(v, this.size());
        if(collection0.isEmpty()) {
            return false;
        }
        if(v == this.size()) {
            return this.addAll(collection0);
        }
        this.x();
        this.h(this.size() + collection0.size());
        int v1 = this.u(this.a + this.size());
        int v2 = this.u(this.a + v);
        int v3 = collection0.size();
        if(v < this.size() + 1 >> 1) {
            int v4 = this.a;
            int v5 = v4 - v3;
            if(v2 < v4) {
                kotlin.collections.l.B0(this.b, this.b, v5, v4, this.b.length);
                if(v3 >= v2) {
                    kotlin.collections.l.B0(this.b, this.b, this.b.length - v3, 0, v2);
                }
                else {
                    kotlin.collections.l.B0(this.b, this.b, this.b.length - v3, 0, v3);
                    kotlin.collections.l.B0(this.b, this.b, 0, v3, v2);
                }
            }
            else if(v5 >= 0) {
                kotlin.collections.l.B0(this.b, this.b, v5, v4, v2);
            }
            else {
                Object[] arr_object = this.b;
                v5 += arr_object.length;
                int v6 = arr_object.length - v5;
                if(v6 >= v2 - v4) {
                    kotlin.collections.l.B0(arr_object, arr_object, v5, v4, v2);
                }
                else {
                    kotlin.collections.l.B0(arr_object, arr_object, v5, v4, v4 + v6);
                    kotlin.collections.l.B0(this.b, this.b, 0, this.a + v6, v2);
                }
            }
            this.a = v5;
            this.c(this.q(v2 - v3), collection0);
            return true;
        }
        int v7 = v2 + v3;
        if(v2 < v1) {
            int v8 = v3 + v1;
            Object[] arr_object1 = this.b;
            if(v8 <= arr_object1.length) {
                kotlin.collections.l.B0(arr_object1, arr_object1, v7, v2, v1);
            }
            else if(v7 >= arr_object1.length) {
                kotlin.collections.l.B0(arr_object1, arr_object1, v7 - arr_object1.length, v2, v1);
            }
            else {
                int v9 = v1 - (v8 - arr_object1.length);
                kotlin.collections.l.B0(arr_object1, arr_object1, 0, v9, v1);
                kotlin.collections.l.B0(this.b, this.b, v7, v2, v9);
            }
        }
        else {
            kotlin.collections.l.B0(this.b, this.b, v3, 0, v1);
            Object[] arr_object2 = this.b;
            if(v7 >= arr_object2.length) {
                kotlin.collections.l.B0(arr_object2, arr_object2, v7 - arr_object2.length, v2, arr_object2.length);
            }
            else {
                kotlin.collections.l.B0(arr_object2, arr_object2, 0, arr_object2.length - v3, arr_object2.length);
                kotlin.collections.l.B0(this.b, this.b, v7, v2, this.b.length - v3);
            }
        }
        this.c(v2, collection0);
        return true;
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(collection0.isEmpty()) {
            return false;
        }
        this.x();
        this.h(this.size() + collection0.size());
        this.c(this.u(this.a + this.size()), collection0);
        return true;
    }

    @Override
    public final void addFirst(Object object0) {
        this.x();
        this.h(this.size() + 1);
        int v = this.g(this.a);
        this.a = v;
        this.b[v] = object0;
        this.c = this.size() + 1;
    }

    @Override
    public final void addLast(Object object0) {
        this.x();
        this.h(this.size() + 1);
        this.b[this.u(this.a + this.size())] = object0;
        this.c = this.size() + 1;
    }

    @Override  // kotlin.collections.f
    public Object b(int v) {
        c.a.b(v, this.size());
        if(v == u.J(this)) {
            return this.removeLast();
        }
        if(v == 0) {
            return this.removeFirst();
        }
        this.x();
        int v1 = this.u(this.a + v);
        Object object0 = this.b[v1];
        if(v < this.size() >> 1) {
            int v2 = this.a;
            if(v1 >= v2) {
                kotlin.collections.l.B0(this.b, this.b, v2 + 1, v2, v1);
            }
            else {
                kotlin.collections.l.B0(this.b, this.b, 1, 0, v1);
                Object[] arr_object = this.b;
                arr_object[0] = arr_object[arr_object.length - 1];
                kotlin.collections.l.B0(arr_object, arr_object, this.a + 1, this.a, arr_object.length - 1);
            }
            int v3 = this.a;
            this.b[v3] = null;
            this.a = this.k(v3);
        }
        else {
            int v4 = this.u(this.a + u.J(this));
            if(v1 <= v4) {
                kotlin.collections.l.B0(this.b, this.b, v1, v1 + 1, v4 + 1);
            }
            else {
                kotlin.collections.l.B0(this.b, this.b, v1, v1 + 1, this.b.length);
                Object[] arr_object1 = this.b;
                arr_object1[arr_object1.length - 1] = arr_object1[0];
                kotlin.collections.l.B0(arr_object1, arr_object1, 0, 1, v4 + 1);
            }
            this.b[v4] = null;
        }
        this.c = this.size() - 1;
        return object0;
    }

    private final void c(int v, Collection collection0) {
        Iterator iterator0 = collection0.iterator();
        while(v < this.b.length && iterator0.hasNext()) {
            Object[] arr_object = this.b;
            Object object0 = iterator0.next();
            arr_object[v] = object0;
            ++v;
        }
        int v1 = this.a;
        for(int v2 = 0; v2 < v1 && iterator0.hasNext(); ++v2) {
            Object[] arr_object1 = this.b;
            Object object1 = iterator0.next();
            arr_object1[v2] = object1;
        }
        this.c = this.size() + collection0.size();
    }

    @Override
    public void clear() {
        if(!this.isEmpty()) {
            this.x();
            int v = this.u(this.a + this.size());
            this.r(this.a, v);
        }
        this.a = 0;
        this.c = 0;
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    private final void d(int v) {
        Object[] arr_object = new Object[v];
        kotlin.collections.l.B0(this.b, arr_object, 0, this.a, this.b.length);
        kotlin.collections.l.B0(this.b, arr_object, this.b.length - this.a, 0, this.a);
        this.a = 0;
        this.b = arr_object;
    }

    public final Object first() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.b[this.a];
    }

    private final int g(int v) {
        return v == 0 ? kotlin.collections.l.we(this.b) : v - 1;
    }

    @Override
    public Object get(int v) {
        c.a.b(v, this.size());
        return this.b[this.u(this.a + v)];
    }

    private final void h(int v) {
        if(v < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] arr_object = this.b;
        if(v <= arr_object.length) {
            return;
        }
        if(arr_object == k.e) {
            this.b = new Object[s.u(v, 10)];
            return;
        }
        this.d(c.a.e(arr_object.length, v));
    }

    private final boolean i(Function1 function10) {
        int v3;
        int v = 0;
        if(!this.isEmpty() && this.b.length != 0) {
            int v1 = this.u(this.a + this.size());
            int v2 = this.a;
            if(v2 < v1) {
                v3 = v2;
                while(v2 < v1) {
                    Object object0 = this.b[v2];
                    if(((Boolean)function10.invoke(object0)).booleanValue()) {
                        this.b[v3] = object0;
                        ++v3;
                    }
                    else {
                        v = 1;
                    }
                    ++v2;
                }
                kotlin.collections.l.M1(this.b, null, v3, v1);
            }
            else {
                int v4 = v2;
                int v5 = 0;
                while(v2 < this.b.length) {
                    Object[] arr_object = this.b;
                    Object object1 = arr_object[v2];
                    arr_object[v2] = null;
                    if(((Boolean)function10.invoke(object1)).booleanValue()) {
                        this.b[v4] = object1;
                        ++v4;
                    }
                    else {
                        v5 = 1;
                    }
                    ++v2;
                }
                v3 = this.u(v4);
                while(v < v1) {
                    Object[] arr_object1 = this.b;
                    Object object2 = arr_object1[v];
                    arr_object1[v] = null;
                    if(((Boolean)function10.invoke(object2)).booleanValue()) {
                        this.b[v3] = object2;
                        v3 = this.k(v3);
                    }
                    else {
                        v5 = 1;
                    }
                    ++v;
                }
                v = v5;
            }
            if(v) {
                this.x();
                this.c = this.q(v3 - this.a);
            }
        }
        return v != 0;
    }

    @Override
    public int indexOf(Object object0) {
        int v = this.u(this.a + this.size());
        int v1 = this.a;
        if(v1 < v) {
            while(v1 < v) {
                if(L.g(object0, this.b[v1])) {
                    return v1 - this.a;
                }
                ++v1;
            }
            return -1;
        }
        if(v1 >= v) {
            while(v1 < this.b.length) {
                if(L.g(object0, this.b[v1])) {
                    return v1 - this.a;
                }
                ++v1;
            }
            for(int v2 = 0; v2 < v; ++v2) {
                if(L.g(object0, this.b[v2])) {
                    return v2 + this.b.length - this.a;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    // 去混淆评级： 低(20)
    @m
    public final Object j() {
        return this.isEmpty() ? null : this.b[this.a];
    }

    private final int k(int v) {
        return v == kotlin.collections.l.we(this.b) ? 0 : v + 1;
    }

    @kotlin.internal.f
    private final Object l(int v) {
        return this.b[v];
    }

    public final Object last() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] arr_object = this.b;
        return arr_object[this.u(this.a + u.J(this))];
    }

    @Override
    public int lastIndexOf(Object object0) {
        int v2;
        int v = this.u(this.a + this.size());
        int v1 = this.a;
        if(v1 < v) {
            v2 = v - 1;
            if(v1 <= v2) {
                while(true) {
                    if(L.g(object0, this.b[v2])) {
                        return v2 - this.a;
                    }
                    if(v2 == v1) {
                        break;
                    }
                    --v2;
                }
            }
        }
        else if(v1 > v) {
            for(int v3 = v - 1; -1 < v3; --v3) {
                if(L.g(object0, this.b[v3])) {
                    return v3 + this.b.length - this.a;
                }
            }
            v2 = kotlin.collections.l.we(this.b);
            int v4 = this.a;
            if(v4 <= v2) {
                while(true) {
                    if(L.g(object0, this.b[v2])) {
                        return v2 - this.a;
                    }
                    if(v2 == v4) {
                        break;
                    }
                    --v2;
                }
            }
        }
        return -1;
    }

    @kotlin.internal.f
    private final int m(int v) {
        return this.u(this.a + v);
    }

    public final void o(@l o o0) {
        int v2;
        L.p(o0, "structure");
        int v = this.u(this.a + this.size());
        if(this.isEmpty()) {
            v2 = this.a;
        }
        else {
            int v1 = this.a;
            v2 = v1 >= v ? v1 - this.b.length : this.a;
        }
        o0.invoke(v2, this.toArray());
    }

    @m
    public final Object p() {
        if(this.isEmpty()) {
            return null;
        }
        Object[] arr_object = this.b;
        return arr_object[this.u(this.a + u.J(this))];
    }

    private final int q(int v) {
        return v >= 0 ? v : v + this.b.length;
    }

    private final void r(int v, int v1) {
        if(v < v1) {
            kotlin.collections.l.M1(this.b, null, v, v1);
            return;
        }
        kotlin.collections.l.M1(this.b, null, v, this.b.length);
        kotlin.collections.l.M1(this.b, null, 0, v1);
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v == -1) {
            return false;
        }
        this.remove(v);
        return true;
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        int v3;
        L.p(collection0, "elements");
        int v = 0;
        if(!this.isEmpty() && this.b.length != 0) {
            int v1 = this.u(this.a + this.size());
            int v2 = this.a;
            if(v2 < v1) {
                v3 = v2;
                while(v2 < v1) {
                    Object object0 = this.b[v2];
                    if(collection0.contains(object0)) {
                        v = 1;
                    }
                    else {
                        this.b[v3] = object0;
                        ++v3;
                    }
                    ++v2;
                }
                kotlin.collections.l.M1(this.b, null, v3, v1);
            }
            else {
                int v4 = v2;
                int v5 = 0;
                while(v2 < this.b.length) {
                    Object[] arr_object = this.b;
                    Object object1 = arr_object[v2];
                    arr_object[v2] = null;
                    if(collection0.contains(object1)) {
                        v5 = 1;
                    }
                    else {
                        this.b[v4] = object1;
                        ++v4;
                    }
                    ++v2;
                }
                v3 = this.u(v4);
                while(v < v1) {
                    Object[] arr_object1 = this.b;
                    Object object2 = arr_object1[v];
                    arr_object1[v] = null;
                    if(collection0.contains(object2)) {
                        v5 = 1;
                    }
                    else {
                        this.b[v3] = object2;
                        v3 = this.k(v3);
                    }
                    ++v;
                }
                v = v5;
            }
            if(v) {
                this.x();
                this.c = this.q(v3 - this.a);
            }
        }
        return v != 0;
    }

    @Override
    public final Object removeFirst() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        this.x();
        Object[] arr_object = this.b;
        int v = this.a;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.a = this.k(v);
        this.c = this.size() - 1;
        return object0;
    }

    @Override
    public final Object removeLast() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        this.x();
        int v = this.u(this.a + u.J(this));
        Object[] arr_object = this.b;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.c = this.size() - 1;
        return object0;
    }

    @Override
    protected void removeRange(int v, int v1) {
        c.a.d(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == 0) {
            return;
        }
        if(v2 == this.size()) {
            this.clear();
            return;
        }
        if(v2 == 1) {
            this.remove(v);
            return;
        }
        this.x();
        if(v < this.size() - v1) {
            this.A(v, v1);
            int v3 = this.u(this.a + v2);
            this.r(this.a, v3);
            this.a = v3;
        }
        else {
            this.B(v, v1);
            int v4 = this.u(this.a + this.size());
            this.r(this.q(v4 - v2), v4);
        }
        this.c = this.size() - v2;
    }

    @Override
    public boolean retainAll(@l Collection collection0) {
        int v3;
        L.p(collection0, "elements");
        int v = 0;
        if(!this.isEmpty() && this.b.length != 0) {
            int v1 = this.u(this.a + this.size());
            int v2 = this.a;
            if(v2 < v1) {
                v3 = v2;
                while(v2 < v1) {
                    Object object0 = this.b[v2];
                    if(collection0.contains(object0)) {
                        this.b[v3] = object0;
                        ++v3;
                    }
                    else {
                        v = 1;
                    }
                    ++v2;
                }
                kotlin.collections.l.M1(this.b, null, v3, v1);
            }
            else {
                int v4 = v2;
                int v5 = 0;
                while(v2 < this.b.length) {
                    Object[] arr_object = this.b;
                    Object object1 = arr_object[v2];
                    arr_object[v2] = null;
                    if(collection0.contains(object1)) {
                        this.b[v4] = object1;
                        ++v4;
                    }
                    else {
                        v5 = 1;
                    }
                    ++v2;
                }
                v3 = this.u(v4);
                while(v < v1) {
                    Object[] arr_object1 = this.b;
                    Object object2 = arr_object1[v];
                    arr_object1[v] = null;
                    if(collection0.contains(object2)) {
                        this.b[v3] = object2;
                        v3 = this.k(v3);
                    }
                    else {
                        v5 = 1;
                    }
                    ++v;
                }
                v = v5;
            }
            if(v) {
                this.x();
                this.c = this.q(v3 - this.a);
            }
        }
        return v != 0;
    }

    @Override  // kotlin.collections.f
    public Object set(int v, Object object0) {
        c.a.b(v, this.size());
        int v1 = this.u(this.a + v);
        Object[] arr_object = this.b;
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }

    @Override
    @l
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    @Override
    @l
    public Object[] toArray(@l Object[] arr_object) {
        L.p(arr_object, "array");
        if(arr_object.length < this.size()) {
            arr_object = kotlin.collections.m.a(arr_object, this.size());
        }
        int v = this.u(this.a + this.size());
        int v1 = this.a;
        if(v1 < v) {
            kotlin.collections.l.K0(this.b, arr_object, 0, v1, v, 2, null);
            return u.n(this.size(), arr_object);
        }
        if(!this.isEmpty()) {
            kotlin.collections.l.B0(this.b, arr_object, 0, this.a, this.b.length);
            kotlin.collections.l.B0(this.b, arr_object, this.b.length - this.a, 0, v);
        }
        return u.n(this.size(), arr_object);
    }

    private final int u(int v) {
        return v < this.b.length ? v : v - this.b.length;
    }

    private final void x() {
        ++this.modCount;
    }

    // 去混淆评级： 低(20)
    @m
    public final Object y() {
        return this.isEmpty() ? null : this.removeFirst();
    }

    // 去混淆评级： 低(20)
    @m
    public final Object z() {
        return this.isEmpty() ? null : this.removeLast();
    }
}

