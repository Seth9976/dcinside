package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

public class AsyncListUtil {
    public static abstract class DataCallback {
        @WorkerThread
        public abstract void a(@NonNull Object[] arg1, int arg2, int arg3);

        @WorkerThread
        public int b() [...] // Inlined contents

        @WorkerThread
        public void c(@NonNull Object[] arr_object, int v) {
        }

        @WorkerThread
        public abstract int d();
    }

    public static abstract class ViewCallback {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;

        @UiThread
        public void a(@NonNull int[] arr_v, @NonNull int[] arr_v1, int v) {
            int v1 = arr_v[1];
            int v2 = v1 - arr_v[0] + 1;
            arr_v1[0] = arr_v[0] - (v == 1 ? v2 : v2 / 2);
            if(v != 2) {
                v2 /= 2;
            }
            arr_v1[1] = v1 + v2;
        }

        @UiThread
        public abstract void b(@NonNull int[] arg1);

        @UiThread
        public abstract void c();

        @UiThread
        public abstract void d(int arg1);
    }

    final Class a;
    final int b;
    final DataCallback c;
    final ViewCallback d;
    final TileList e;
    final MainThreadCallback f;
    final BackgroundCallback g;
    final int[] h;
    final int[] i;
    final int[] j;
    boolean k;
    private int l;
    int m;
    int n;
    int o;
    final SparseIntArray p;
    private final MainThreadCallback q;
    private final BackgroundCallback r;
    static final String s = "AsyncListUtil";
    static final boolean t = false;

    public AsyncListUtil(@NonNull Class class0, int v, @NonNull DataCallback asyncListUtil$DataCallback0, @NonNull ViewCallback asyncListUtil$ViewCallback0) {
        this.h = new int[2];
        this.i = new int[2];
        this.j = new int[2];
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = new SparseIntArray();
        androidx.recyclerview.widget.AsyncListUtil.1 asyncListUtil$10 = new MainThreadCallback() {
            final AsyncListUtil a;

            @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
            public void a(int v, int v1) {
                if(!this.d(v)) {
                    return;
                }
                AsyncListUtil.this.m = v1;
                AsyncListUtil.this.d.c();
                AsyncListUtil.this.n = AsyncListUtil.this.o;
                this.e();
                AsyncListUtil.this.k = false;
                AsyncListUtil.this.g();
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
            public void b(int v, int v1) {
                if(!this.d(v)) {
                    return;
                }
                Tile tileList$Tile0 = AsyncListUtil.this.e.e(v1);
                if(tileList$Tile0 == null) {
                    Log.e("AsyncListUtil", "tile not found @" + v1);
                    return;
                }
                AsyncListUtil.this.g.d(tileList$Tile0);
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
            public void c(int v, Tile tileList$Tile0) {
                if(!this.d(v)) {
                    AsyncListUtil.this.g.d(tileList$Tile0);
                    return;
                }
                Tile tileList$Tile1 = AsyncListUtil.this.e.a(tileList$Tile0);
                if(tileList$Tile1 != null) {
                    Log.e("AsyncListUtil", "duplicate tile @" + tileList$Tile1.b);
                    AsyncListUtil.this.g.d(tileList$Tile1);
                }
                int v1 = tileList$Tile0.b + tileList$Tile0.c;
                int v2 = 0;
                while(v2 < AsyncListUtil.this.p.size()) {
                    int v3 = AsyncListUtil.this.p.keyAt(v2);
                    if(tileList$Tile0.b <= v3 && v3 < v1) {
                        AsyncListUtil.this.p.removeAt(v2);
                        AsyncListUtil.this.d.d(v3);
                    }
                    else {
                        ++v2;
                    }
                }
            }

            private boolean d(int v) {
                return v == AsyncListUtil.this.o;
            }

            private void e() {
                for(int v = 0; v < AsyncListUtil.this.e.f(); ++v) {
                    Tile tileList$Tile0 = AsyncListUtil.this.e.c(v);
                    AsyncListUtil.this.g.d(tileList$Tile0);
                }
                AsyncListUtil.this.e.b();
            }
        };
        this.q = asyncListUtil$10;
        androidx.recyclerview.widget.AsyncListUtil.2 asyncListUtil$20 = new BackgroundCallback() {
            private Tile a;
            final SparseBooleanArray b;
            private int c;
            private int d;
            private int e;
            private int f;
            final AsyncListUtil g;

            {
                this.b = new SparseBooleanArray();
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
            public void a(int v, int v1, int v2, int v3, int v4) {
                if(v > v1) {
                    return;
                }
                int v5 = this.h(v);
                int v6 = this.h(v1);
                this.e = this.h(v2);
                int v7 = this.h(v3);
                this.f = v7;
                if(v4 == 1) {
                    this.l(this.e, v6, 1, true);
                    this.l(v6 + AsyncListUtil.this.b, this.f, 1, false);
                    return;
                }
                this.l(v5, v7, v4, false);
                this.l(this.e, v5 - AsyncListUtil.this.b, v4, true);
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
            public void b(int v, int v1) {
                if(this.i(v)) {
                    return;
                }
                Tile tileList$Tile0 = this.e();
                tileList$Tile0.b = v;
                int v2 = Math.min(AsyncListUtil.this.b, this.d - v);
                tileList$Tile0.c = v2;
                AsyncListUtil.this.c.a(tileList$Tile0.a, tileList$Tile0.b, v2);
                this.g(v1);
                this.f(tileList$Tile0);
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
            public void c(int v) {
                this.c = v;
                this.b.clear();
                int v1 = AsyncListUtil.this.c.d();
                this.d = v1;
                AsyncListUtil.this.f.a(this.c, v1);
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
            public void d(Tile tileList$Tile0) {
                AsyncListUtil.this.c.c(tileList$Tile0.a, tileList$Tile0.c);
                tileList$Tile0.d = this.a;
                this.a = tileList$Tile0;
            }

            private Tile e() {
                Tile tileList$Tile0 = this.a;
                if(tileList$Tile0 != null) {
                    this.a = tileList$Tile0.d;
                    return tileList$Tile0;
                }
                return new Tile(AsyncListUtil.this.a, AsyncListUtil.this.b);
            }

            private void f(Tile tileList$Tile0) {
                this.b.put(tileList$Tile0.b, true);
                AsyncListUtil.this.f.c(this.c, tileList$Tile0);
            }

            private void g(int v) {
                while(this.b.size() >= 10) {
                    int v1 = this.b.keyAt(0);
                    int v2 = this.b.keyAt(this.b.size() - 1);
                    int v3 = this.e - v1;
                    int v4 = v2 - this.f;
                    if(v3 > 0 && (v3 >= v4 || v == 2)) {
                        this.k(v1);
                    }
                    else {
                        if(v4 <= 0 || v3 >= v4 && v != 1) {
                            break;
                        }
                        this.k(v2);
                    }
                }
            }

            private int h(int v) {
                return v - v % AsyncListUtil.this.b;
            }

            private boolean i(int v) {
                return this.b.get(v);
            }

            private void j(String s, Object[] arr_object) {
                Log.d("AsyncListUtil", "[BKGR] " + String.format(s, arr_object));
            }

            private void k(int v) {
                this.b.delete(v);
                AsyncListUtil.this.f.b(this.c, v);
            }

            private void l(int v, int v1, int v2, boolean z) {
                for(int v3 = v; v3 <= v1; v3 += AsyncListUtil.this.b) {
                    AsyncListUtil.this.g.b((z ? v1 + v - v3 : v3), v2);
                }
            }
        };
        this.r = asyncListUtil$20;
        this.a = class0;
        this.b = v;
        this.c = asyncListUtil$DataCallback0;
        this.d = asyncListUtil$ViewCallback0;
        this.e = new TileList(v);
        MessageThreadUtil messageThreadUtil0 = new MessageThreadUtil();
        this.f = messageThreadUtil0.a(asyncListUtil$10);
        this.g = messageThreadUtil0.b(asyncListUtil$20);
        this.f();
    }

    @Nullable
    public Object a(int v) {
        if(v < 0 || v >= this.m) {
            throw new IndexOutOfBoundsException(v + " is not within 0 and " + this.m);
        }
        Object object0 = this.e.d(v);
        if(object0 == null && !this.c()) {
            this.p.put(v, 0);
        }
        return object0;
    }

    public int b() {
        return this.m;
    }

    private boolean c() {
        return this.o != this.n;
    }

    void d(String s, Object[] arr_object) {
        Log.d("AsyncListUtil", "[MAIN] " + String.format(s, arr_object));
    }

    public void e() {
        if(this.c()) {
            return;
        }
        this.g();
        this.k = true;
    }

    public void f() {
        this.p.clear();
        int v = this.o + 1;
        this.o = v;
        this.g.c(v);
    }

    void g() {
        this.d.b(this.h);
        int[] arr_v = this.h;
        int v = arr_v[0];
        int v1 = arr_v[1];
        if(v > v1 || v < 0 || v1 >= this.m) {
            return;
        }
        if(this.k) {
            int[] arr_v1 = this.i;
            if(v <= arr_v1[1]) {
                int v2 = arr_v1[0];
                if(v2 > v1) {
                    this.l = 0;
                }
                else if(v < v2) {
                    this.l = 1;
                }
                else if(v > v2) {
                    this.l = 2;
                }
            }
            else {
                this.l = 0;
            }
        }
        else {
            this.l = 0;
        }
        this.i[0] = v;
        this.i[1] = v1;
        this.d.a(arr_v, this.j, this.l);
        this.j[0] = Math.min(this.h[0], Math.max(this.j[0], 0));
        this.j[1] = Math.max(this.h[1], Math.min(this.j[1], this.m - 1));
        this.g.a(this.h[0], this.h[1], this.j[0], this.j[1], this.l);
    }
}

