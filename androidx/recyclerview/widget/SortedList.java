package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SortedList {
    public static class BatchedCallback extends Callback {
        final Callback a;
        private final BatchingListUpdateCallback b;

        @SuppressLint({"UnknownNullness"})
        public BatchedCallback(Callback sortedList$Callback0) {
            this.a = sortedList$Callback0;
            this.b = new BatchingListUpdateCallback(sortedList$Callback0);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        @SuppressLint({"UnknownNullness"})
        public void b(int v, int v1, Object object0) {
            this.b.b(v, v1, object0);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        public int compare(Object object0, Object object1) {
            return this.a.compare(object0, object1);
        }

        @Override  // androidx.recyclerview.widget.ListUpdateCallback
        public void g(int v, int v1) {
            this.b.g(v, v1);
        }

        @Override  // androidx.recyclerview.widget.ListUpdateCallback
        public void i(int v, int v1) {
            this.b.i(v, v1);
        }

        @Override  // androidx.recyclerview.widget.ListUpdateCallback
        public void j(int v, int v1) {
            this.b.j(v, v1);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        public boolean k(Object object0, Object object1) {
            return this.a.k(object0, object1);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        public boolean n(Object object0, Object object1) {
            return this.a.n(object0, object1);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        @Nullable
        public Object o(Object object0, Object object1) {
            return this.a.o(object0, object1);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        public void p(int v, int v1) {
            this.b.b(v, v1, null);
        }

        public void q() {
            this.b.a();
        }
    }

    public static abstract class Callback implements ListUpdateCallback, Comparator {
        @Override  // androidx.recyclerview.widget.ListUpdateCallback
        @SuppressLint({"UnknownNullness"})
        public void b(int v, int v1, Object object0) {
            this.p(v, v1);
        }

        @Override
        public abstract int compare(Object arg1, Object arg2);

        public abstract boolean k(Object arg1, Object arg2);

        public abstract boolean n(Object arg1, Object arg2);

        @Nullable
        public Object o(Object object0, Object object1) {
            return null;
        }

        public abstract void p(int arg1, int arg2);
    }

    Object[] a;
    private Object[] b;
    private int c;
    private int d;
    private int e;
    private Callback f;
    private BatchedCallback g;
    private int h;
    private final Class i;
    public static final int j = -1;
    private static final int k = 10;
    private static final int l = 10;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 4;

    public SortedList(@NonNull Class class0, @NonNull Callback sortedList$Callback0) {
        this(class0, sortedList$Callback0, 10);
    }

    public SortedList(@NonNull Class class0, @NonNull Callback sortedList$Callback0, int v) {
        this.i = class0;
        this.a = (Object[])Array.newInstance(class0, v);
        this.f = sortedList$Callback0;
        this.h = 0;
    }

    private void A(@NonNull Object[] arr_object) {
        boolean z = this.f instanceof BatchedCallback;
        if(!z) {
            this.h();
        }
        this.c = 0;
        this.d = this.h;
        this.b = this.a;
        this.e = 0;
        int v = this.D(arr_object);
        this.a = (Object[])Array.newInstance(this.i, v);
        while(true) {
            int v1 = this.e;
            if(v1 >= v && this.c >= this.d) {
                break;
            }
            int v2 = this.c;
            int v3 = this.d;
            if(v2 >= v3) {
                int v4 = v - v1;
                System.arraycopy(arr_object, v1, this.a, v1, v4);
                this.e += v4;
                this.h += v4;
                this.f.g(v1, v4);
                break;
            }
            if(v1 >= v) {
                int v5 = v3 - v2;
                this.h -= v5;
                this.f.i(v1, v5);
                break;
            }
            Object object0 = this.b[v2];
            Object object1 = arr_object[v1];
            int v6 = this.f.compare(object0, object1);
            if(v6 < 0) {
                this.B();
            }
            else if(v6 > 0) {
                this.z(object1);
            }
            else if(this.f.n(object0, object1)) {
                int v7 = this.e;
                this.a[v7] = object1;
                ++this.c;
                this.e = v7 + 1;
                if(!this.f.k(object0, object1)) {
                    this.f.b(this.e - 1, 1, this.f.o(object0, object1));
                }
            }
            else {
                this.B();
                this.z(object1);
            }
        }
        this.b = null;
        if(!z) {
            this.k();
        }
    }

    private void B() {
        --this.h;
        ++this.c;
        this.f.i(this.e, 1);
    }

    public int C() {
        return this.h;
    }

    private int D(@NonNull Object[] arr_object) {
        if(arr_object.length == 0) {
            return 0;
        }
        Arrays.sort(arr_object, this.f);
        int v1 = 1;
        int v2 = 0;
        for(int v = 1; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(this.f.compare(arr_object[v2], object0) == 0) {
                int v3 = this.m(object0, arr_object, v2, v1);
                if(v3 == -1) {
                    if(v1 != v) {
                        arr_object[v1] = object0;
                    }
                    ++v1;
                }
                else {
                    arr_object[v3] = object0;
                }
            }
            else {
                if(v1 != v) {
                    arr_object[v1] = object0;
                }
                v2 = v1;
                ++v1;
            }
        }
        return v1;
    }

    private void E() {
        if(this.b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void F(int v, Object object0) {
        this.E();
        Object object1 = this.n(v);
        boolean z = object1 == object0 || !this.f.k(object1, object0);
        if(object1 != object0 && this.f.compare(object1, object0) == 0) {
            this.a[v] = object0;
            if(z) {
                this.f.b(v, 1, this.f.o(object1, object0));
            }
            return;
        }
        if(z) {
            this.f.b(v, 1, this.f.o(object1, object0));
        }
        this.v(v, false);
        int v1 = this.b(object0, false);
        if(v != v1) {
            this.f.j(v, v1);
        }
    }

    public int a(Object object0) {
        this.E();
        return this.b(object0, true);
    }

    private int b(Object object0, boolean z) {
        int v = this.l(object0, this.a, 0, this.h, 1);
        if(v == -1) {
            v = 0;
        }
        else if(v < this.h) {
            Object object1 = this.a[v];
            if(this.f.n(object1, object0)) {
                if(this.f.k(object1, object0)) {
                    this.a[v] = object0;
                    return v;
                }
                this.a[v] = object0;
                this.f.b(v, 1, this.f.o(object1, object0));
                return v;
            }
        }
        this.g(v, object0);
        if(z) {
            this.f.g(v, 1);
        }
        return v;
    }

    public void c(@NonNull Collection collection0) {
        this.e(collection0.toArray(((Object[])Array.newInstance(this.i, collection0.size()))), true);
    }

    public void d(@NonNull Object[] arr_object) {
        this.e(arr_object, false);
    }

    public void e(@NonNull Object[] arr_object, boolean z) {
        this.E();
        if(arr_object.length == 0) {
            return;
        }
        if(z) {
            this.f(arr_object);
            return;
        }
        this.f(this.j(arr_object));
    }

    private void f(Object[] arr_object) {
        if(arr_object.length < 1) {
            return;
        }
        int v = this.D(arr_object);
        if(this.h == 0) {
            this.a = arr_object;
            this.h = v;
            this.f.g(0, v);
            return;
        }
        this.q(arr_object, v);
    }

    private void g(int v, Object object0) {
        int v1 = this.h;
        if(v > v1) {
            throw new IndexOutOfBoundsException("cannot add item to " + v + " because size is " + this.h);
        }
        Object[] arr_object = this.a;
        if(v1 == arr_object.length) {
            Object[] arr_object1 = (Object[])Array.newInstance(this.i, arr_object.length + 10);
            System.arraycopy(this.a, 0, arr_object1, 0, v);
            arr_object1[v] = object0;
            System.arraycopy(this.a, v, arr_object1, v + 1, this.h - v);
            this.a = arr_object1;
        }
        else {
            System.arraycopy(arr_object, v, arr_object, v + 1, v1 - v);
            this.a[v] = object0;
        }
        ++this.h;
    }

    public void h() {
        this.E();
        Callback sortedList$Callback0 = this.f;
        if(sortedList$Callback0 instanceof BatchedCallback) {
            return;
        }
        if(this.g == null) {
            this.g = new BatchedCallback(sortedList$Callback0);
        }
        this.f = this.g;
    }

    public void i() {
        this.E();
        int v = this.h;
        if(v == 0) {
            return;
        }
        Arrays.fill(this.a, 0, v, null);
        this.h = 0;
        this.f.i(0, v);
    }

    private Object[] j(Object[] arr_object) {
        Object[] arr_object1 = (Object[])Array.newInstance(this.i, arr_object.length);
        System.arraycopy(arr_object, 0, arr_object1, 0, arr_object.length);
        return arr_object1;
    }

    public void k() {
        this.E();
        Callback sortedList$Callback0 = this.f;
        if(sortedList$Callback0 instanceof BatchedCallback) {
            ((BatchedCallback)sortedList$Callback0).q();
        }
        BatchedCallback sortedList$BatchedCallback0 = this.g;
        if(this.f == sortedList$BatchedCallback0) {
            this.f = sortedList$BatchedCallback0.a;
        }
    }

    private int l(Object object0, Object[] arr_object, int v, int v1, int v2) {
        while(v < v1) {
            int v3 = (v + v1) / 2;
            Object object1 = arr_object[v3];
            int v4 = this.f.compare(object1, object0);
            if(v4 < 0) {
                v = v3 + 1;
            }
            else {
                if(v4 == 0) {
                    if(this.f.n(object1, object0)) {
                        return v3;
                    }
                    int v5 = this.p(object0, v3, v, v1);
                    return v2 == 1 && v5 == -1 ? v3 : v5;
                }
                v1 = v3;
            }
        }
        return v2 == 1 ? v : -1;
    }

    private int m(Object object0, Object[] arr_object, int v, int v1) {
        while(v < v1) {
            if(this.f.n(arr_object[v], object0)) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public Object n(int v) throws IndexOutOfBoundsException {
        if(v >= this.h || v < 0) {
            throw new IndexOutOfBoundsException("Asked to get item at " + v + " but size is " + this.h);
        }
        Object[] arr_object = this.b;
        if(arr_object != null) {
            return v < this.e ? this.a[v] : arr_object[v - this.e + this.c];
        }
        return this.a[v];
    }

    public int o(Object object0) {
        if(this.b != null) {
            int v = this.l(object0, this.a, 0, this.e, 4);
            if(v != -1) {
                return v;
            }
            int v1 = this.l(object0, this.b, this.c, this.d, 4);
            return v1 == -1 ? -1 : v1 - this.c + this.e;
        }
        return this.l(object0, this.a, 0, this.h, 4);
    }

    private int p(Object object0, int v, int v1, int v2) {
        for(int v3 = v - 1; v3 >= v1; --v3) {
            Object object1 = this.a[v3];
            if(this.f.compare(object1, object0) != 0) {
                break;
            }
            if(this.f.n(object1, object0)) {
                return v3;
            }
        }
        while(true) {
            ++v;
            if(v >= v2) {
                break;
            }
            Object object2 = this.a[v];
            if(this.f.compare(object2, object0) != 0) {
                break;
            }
            if(this.f.n(object2, object0)) {
                return v;
            }
        }
        return -1;
    }

    private void q(Object[] arr_object, int v) {
        boolean z = this.f instanceof BatchedCallback;
        if(!z) {
            this.h();
        }
        this.b = this.a;
        int v1 = 0;
        this.c = 0;
        this.d = this.h;
        this.a = (Object[])Array.newInstance(this.i, this.h + v + 10);
        this.e = 0;
        while(true) {
            int v2 = this.c;
            int v3 = this.d;
            if(v2 >= v3 && v1 >= v) {
                break;
            }
            if(v2 == v3) {
                int v4 = v - v1;
                System.arraycopy(arr_object, v1, this.a, this.e, v4);
                int v5 = this.e + v4;
                this.e = v5;
                this.h += v4;
                this.f.g(v5 - v4, v4);
                break;
            }
            if(v1 == v) {
                int v6 = v3 - v2;
                System.arraycopy(this.b, v2, this.a, this.e, v6);
                this.e += v6;
                break;
            }
            Object object0 = this.b[v2];
            Object object1 = arr_object[v1];
            int v7 = this.f.compare(object0, object1);
            if(v7 > 0) {
                int v8 = this.e;
                this.e = v8 + 1;
                this.a[v8] = object1;
                ++this.h;
                ++v1;
                this.f.g(v8, 1);
            }
            else if(v7 == 0 && this.f.n(object0, object1)) {
                int v9 = this.e;
                this.e = v9 + 1;
                this.a[v9] = object1;
                ++v1;
                ++this.c;
                if(this.f.k(object0, object1)) {
                    continue;
                }
                this.f.b(this.e - 1, 1, this.f.o(object0, object1));
            }
            else {
                int v10 = this.e;
                this.e = v10 + 1;
                this.a[v10] = object0;
                ++this.c;
            }
        }
        this.b = null;
        if(!z) {
            this.k();
        }
    }

    public void r(int v) {
        this.E();
        Object object0 = this.n(v);
        this.v(v, false);
        int v1 = this.b(object0, false);
        if(v != v1) {
            this.f.j(v, v1);
        }
    }

    public boolean s(Object object0) {
        this.E();
        return this.t(object0, true);
    }

    private boolean t(Object object0, boolean z) {
        int v = this.l(object0, this.a, 0, this.h, 2);
        if(v == -1) {
            return false;
        }
        this.v(v, z);
        return true;
    }

    public Object u(int v) {
        this.E();
        Object object0 = this.n(v);
        this.v(v, true);
        return object0;
    }

    private void v(int v, boolean z) {
        System.arraycopy(this.a, v + 1, this.a, v, this.h - v - 1);
        int v1 = this.h - 1;
        this.h = v1;
        this.a[v1] = null;
        if(z) {
            this.f.i(v, 1);
        }
    }

    public void w(@NonNull Collection collection0) {
        this.y(collection0.toArray(((Object[])Array.newInstance(this.i, collection0.size()))), true);
    }

    public void x(@NonNull Object[] arr_object) {
        this.y(arr_object, false);
    }

    public void y(@NonNull Object[] arr_object, boolean z) {
        this.E();
        if(z) {
            this.A(arr_object);
            return;
        }
        this.A(this.j(arr_object));
    }

    private void z(Object object0) {
        int v = this.e;
        this.a[v] = object0;
        this.e = v + 1;
        ++this.h;
        this.f.g(v, 1);
    }
}

