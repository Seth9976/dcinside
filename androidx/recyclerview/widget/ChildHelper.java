package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

class ChildHelper {
    static class Bucket {
        long a;
        Bucket b;
        static final int c = 0x40;
        static final long d = 0x8000000000000000L;

        Bucket() {
            this.a = 0L;
        }

        void a(int v) {
            if(v >= 0x40) {
                Bucket childHelper$Bucket0 = this.b;
                if(childHelper$Bucket0 != null) {
                    childHelper$Bucket0.a(v - 0x40);
                }
            }
            else {
                this.a &= ~(1L << v);
            }
        }

        int b(int v) {
            Bucket childHelper$Bucket0 = this.b;
            if(childHelper$Bucket0 == null) {
                return v < 0x40 ? Long.bitCount(this.a & (1L << v) - 1L) : Long.bitCount(this.a);
            }
            return v >= 0x40 ? childHelper$Bucket0.b(v - 0x40) + Long.bitCount(this.a) : Long.bitCount(this.a & (1L << v) - 1L);
        }

        private void c() {
            if(this.b == null) {
                this.b = new Bucket();
            }
        }

        boolean d(int v) {
            if(v >= 0x40) {
                this.c();
                return this.b.d(v - 0x40);
            }
            return (this.a & 1L << v) != 0L;
        }

        void e(int v, boolean z) {
            if(v >= 0x40) {
                this.c();
                this.b.e(v - 0x40, z);
                return;
            }
            boolean z1 = (0x8000000000000000L & this.a) != 0L;
            long v1 = (1L << v) - 1L;
            this.a = (this.a & ~v1) << 1 | this.a & v1;
            if(z) {
                this.h(v);
            }
            else {
                this.a(v);
            }
            if(z1 || this.b != null) {
                this.c();
                this.b.e(0, z1);
            }
        }

        boolean f(int v) {
            if(v >= 0x40) {
                this.c();
                return this.b.f(v - 0x40);
            }
            long v1 = this.a;
            long v2 = v1 & ~(1L << v);
            long v3 = (1L << v) - 1L;
            this.a = v2 & v3 | Long.rotateRight(~v3 & v2, 1);
            Bucket childHelper$Bucket0 = this.b;
            if(childHelper$Bucket0 != null) {
                if(childHelper$Bucket0.d(0)) {
                    this.h(0x3F);
                }
                this.b.f(0);
            }
            return (v1 & 1L << v) != 0L;
        }

        void g() {
            this.a = 0L;
            Bucket childHelper$Bucket0 = this.b;
            if(childHelper$Bucket0 != null) {
                childHelper$Bucket0.g();
            }
        }

        void h(int v) {
            if(v >= 0x40) {
                this.c();
                this.b.h(v - 0x40);
                return;
            }
            this.a |= 1L << v;
        }

        // 去混淆评级： 中等(50)
        @Override
        public String toString() [...] // 潜在的解密器
    }

    interface Callback {
        View a(int arg1);

        void b(View arg1);

        int c();

        ViewHolder d(View arg1);

        void e(View arg1, int arg2);

        void f();

        void g(View arg1, int arg2, ViewGroup.LayoutParams arg3);

        void h(int arg1);

        int i(View arg1);

        void j(View arg1);

        void k(int arg1);
    }

    final Callback a;
    final Bucket b;
    final List c;
    private int d;
    private View e;
    private static final boolean f = false;
    private static final String g = "ChildrenHelper";
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;

    ChildHelper(Callback childHelper$Callback0) {
        this.d = 0;
        this.a = childHelper$Callback0;
        this.b = new Bucket();
        this.c = new ArrayList();
    }

    void a(View view0, int v, boolean z) {
        int v1 = v >= 0 ? this.h(v) : this.a.c();
        this.b.e(v1, z);
        if(z) {
            this.l(view0);
        }
        this.a.e(view0, v1);
    }

    void b(View view0, boolean z) {
        this.a(view0, -1, z);
    }

    void c(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0, boolean z) {
        int v1 = v >= 0 ? this.h(v) : this.a.c();
        this.b.e(v1, z);
        if(z) {
            this.l(view0);
        }
        this.a.g(view0, v1, viewGroup$LayoutParams0);
    }

    void d(int v) {
        int v1 = this.h(v);
        this.b.f(v1);
        this.a.h(v1);
    }

    View e(int v) {
        int v1 = this.c.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = (View)this.c.get(v2);
            ViewHolder recyclerView$ViewHolder0 = this.a.d(view0);
            if(recyclerView$ViewHolder0.getLayoutPosition() == v && !recyclerView$ViewHolder0.isInvalid() && !recyclerView$ViewHolder0.isRemoved()) {
                return view0;
            }
        }
        return null;
    }

    View f(int v) {
        int v1 = this.h(v);
        return this.a.a(v1);
    }

    int g() {
        return this.a.c() - this.c.size();
    }

    private int h(int v) {
        if(v < 0) {
            return -1;
        }
        int v1 = this.a.c();
        for(int v2 = v; v2 < v1; v2 += v3) {
            int v3 = v - (v2 - this.b.b(v2));
            if(v3 == 0) {
                while(this.b.d(v2)) {
                    ++v2;
                }
                return v2;
            }
        }
        return -1;
    }

    View i(int v) {
        return this.a.a(v);
    }

    int j() {
        return this.a.c();
    }

    void k(View view0) {
        int v = this.a.i(view0);
        if(v < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view0);
        }
        this.b.h(v);
        this.l(view0);
    }

    private void l(View view0) {
        this.c.add(view0);
        this.a.b(view0);
    }

    int m(View view0) {
        int v = this.a.i(view0);
        if(v == -1) {
            return -1;
        }
        return this.b.d(v) ? -1 : v - this.b.b(v);
    }

    boolean n(View view0) {
        return this.c.contains(view0);
    }

    void o() {
        this.b.g();
        for(int v = this.c.size() - 1; v >= 0; --v) {
            View view0 = (View)this.c.get(v);
            this.a.j(view0);
            this.c.remove(v);
        }
        this.a.f();
    }

    void p(View view0) {
        switch(this.d) {
            case 1: {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            case 2: {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            default: {
                try {
                    this.d = 1;
                    this.e = view0;
                    int v = this.a.i(view0);
                    if(v >= 0) {
                        if(this.b.f(v)) {
                            this.t(view0);
                        }
                        this.a.k(v);
                        this.d = 0;
                        this.e = null;
                        return;
                    }
                    this.d = 0;
                    this.e = null;
                    return;
                }
                catch(Throwable throwable0) {
                }
                this.d = 0;
                this.e = null;
                throw throwable0;
            }
        }
    }

    void q(int v) {
        switch(this.d) {
            case 1: {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            case 2: {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            default: {
                try {
                    int v1 = this.h(v);
                    View view0 = this.a.a(v1);
                    if(view0 != null) {
                        this.d = 1;
                        this.e = view0;
                        if(this.b.f(v1)) {
                            this.t(view0);
                        }
                        this.a.k(v1);
                        this.d = 0;
                        this.e = null;
                        return;
                    }
                    this.d = 0;
                    this.e = null;
                    return;
                }
                catch(Throwable throwable0) {
                }
                this.d = 0;
                this.e = null;
                throw throwable0;
            }
        }
    }

    boolean r(View view0) {
        int v = this.d;
        if(v == 1) {
            if(this.e != view0) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            return false;
        }
        if(v != 2) {
            try {
                this.d = 2;
                int v1 = this.a.i(view0);
                if(v1 == -1) {
                    this.t(view0);
                    this.d = 0;
                    return true;
                }
                if(this.b.d(v1)) {
                    this.b.f(v1);
                    this.t(view0);
                    this.a.k(v1);
                    this.d = 0;
                    return true;
                }
                this.d = 0;
                return false;
            }
            catch(Throwable throwable0) {
                this.d = 0;
                throw throwable0;
            }
        }
        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
    }

    void s(View view0) {
        int v = this.a.i(view0);
        if(v < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view0);
        }
        if(!this.b.d(v)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view0);
        }
        this.b.a(v);
        this.t(view0);
    }

    private boolean t(View view0) {
        if(this.c.remove(view0)) {
            this.a.j(view0);
            return true;
        }
        return false;
    }

    // 去混淆评级： 低(40)
    @Override
    public String toString() {
        return "0, hidden list:" + this.c.size();
    }
}

