package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class ViewBoundsCheck {
    static class BoundFlags {
        int a;
        int b;
        int c;
        int d;
        int e;

        BoundFlags() {
            this.a = 0;
        }

        void a(int v) {
            this.a |= v;
        }

        boolean b() {
            if((this.a & 7) != 0 && (this.a & this.c(this.d, this.b)) == 0) {
                return false;
            }
            if((this.a & 0x70) != 0 && (this.a & this.c(this.d, this.c) << 4) == 0) {
                return false;
            }
            return (this.a & 0x700) == 0 || (this.a & this.c(this.e, this.b) << 8) != 0 ? (this.a & 0x7000) == 0 || (this.a & this.c(this.e, this.c) << 12) != 0 : false;
        }

        int c(int v, int v1) {
            if(v > v1) {
                return 1;
            }
            return v == v1 ? 2 : 4;
        }

        void d() {
            this.a = 0;
        }

        void e(int v, int v1, int v2, int v3) {
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
        }
    }

    interface Callback {
        View a(int arg1);

        int b();

        int c();

        int d(View arg1);

        int e(View arg1);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    final Callback a;
    BoundFlags b;
    static final int c = 1;
    static final int d = 2;
    static final int e = 4;
    static final int f = 0;
    static final int g = 1;
    static final int h = 2;
    static final int i = 4;
    static final int j = 4;
    static final int k = 16;
    static final int l = 0x20;
    static final int m = 0x40;
    static final int n = 8;
    static final int o = 0x100;
    static final int p = 0x200;
    static final int q = 0x400;
    static final int r = 12;
    static final int s = 0x1000;
    static final int t = 0x2000;
    static final int u = 0x4000;
    static final int v = 7;

    ViewBoundsCheck(Callback viewBoundsCheck$Callback0) {
        this.a = viewBoundsCheck$Callback0;
        this.b = new BoundFlags();
    }

    View a(int v, int v1, int v2, int v3) {
        int v4 = this.a.b();
        int v5 = this.a.c();
        int v6 = v1 <= v ? -1 : 1;
        View view0 = null;
        while(v != v1) {
            View view1 = this.a.a(v);
            int v7 = this.a.d(view1);
            int v8 = this.a.e(view1);
            this.b.e(v4, v5, v7, v8);
            if(v2 != 0) {
                this.b.d();
                this.b.a(v2);
                if(this.b.b()) {
                    return view1;
                }
            }
            if(v3 != 0) {
                this.b.d();
                this.b.a(v3);
                if(this.b.b()) {
                    view0 = view1;
                }
            }
            v += v6;
        }
        return view0;
    }

    boolean b(View view0, int v) {
        this.b.e(this.a.b(), this.a.c(), this.a.d(view0), this.a.e(view0));
        if(v != 0) {
            this.b.d();
            this.b.a(v);
            return this.b.b();
        }
        return false;
    }
}

