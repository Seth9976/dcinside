package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

public class NestedScrollingChildHelper {
    private ViewParent a;
    private ViewParent b;
    private final View c;
    private boolean d;
    private int[] e;

    public NestedScrollingChildHelper(View view0) {
        this.c = view0;
    }

    public boolean a(float f, float f1, boolean z) {
        if(this.m()) {
            ViewParent viewParent0 = this.i(0);
            return viewParent0 == null ? false : ViewParentCompat.c(viewParent0, this.c, f, f1, z);
        }
        return false;
    }

    public boolean b(float f, float f1) {
        if(this.m()) {
            ViewParent viewParent0 = this.i(0);
            return viewParent0 == null ? false : ViewParentCompat.d(viewParent0, this.c, f, f1);
        }
        return false;
    }

    public boolean c(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.d(v, v1, arr_v, arr_v1, 0);
    }

    public boolean d(int v, int v1, int[] arr_v, int[] arr_v1, int v2) {
        int v4;
        int v3;
        if(this.m()) {
            ViewParent viewParent0 = this.i(v2);
            if(viewParent0 == null) {
                return false;
            }
            if(v != 0 || v1 != 0) {
                if(arr_v1 == null) {
                    v3 = 0;
                    v4 = 0;
                }
                else {
                    this.c.getLocationInWindow(arr_v1);
                    v3 = arr_v1[0];
                    v4 = arr_v1[1];
                }
                if(arr_v == null) {
                    arr_v = this.j();
                }
                arr_v[0] = 0;
                arr_v[1] = 0;
                ViewParentCompat.f(viewParent0, this.c, v, v1, arr_v, v2);
                if(arr_v1 != null) {
                    this.c.getLocationInWindow(arr_v1);
                    arr_v1[0] -= v3;
                    arr_v1[1] -= v4;
                }
                return arr_v[0] != 0 || arr_v[1] != 0;
            }
            else if(arr_v1 != null) {
                arr_v1[0] = 0;
                arr_v1[1] = 0;
                return false;
            }
        }
        return false;
    }

    public void e(int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        this.h(v, v1, v2, v3, arr_v, v4, arr_v1);
    }

    public boolean f(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.h(v, v1, v2, v3, arr_v, 0, null);
    }

    public boolean g(int v, int v1, int v2, int v3, int[] arr_v, int v4) {
        return this.h(v, v1, v2, v3, arr_v, v4, null);
    }

    private boolean h(int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        int[] arr_v3;
        int v6;
        int v5;
        if(this.m()) {
            ViewParent viewParent0 = this.i(v4);
            if(viewParent0 == null) {
                return false;
            }
            if(v != 0 || v1 != 0 || v2 != 0 || v3 != 0) {
                if(arr_v == null) {
                    v5 = 0;
                    v6 = 0;
                }
                else {
                    this.c.getLocationInWindow(arr_v);
                    v5 = arr_v[0];
                    v6 = arr_v[1];
                }
                if(arr_v1 == null) {
                    int[] arr_v2 = this.j();
                    arr_v2[0] = 0;
                    arr_v2[1] = 0;
                    arr_v3 = arr_v2;
                }
                else {
                    arr_v3 = arr_v1;
                }
                ViewParentCompat.i(viewParent0, this.c, v, v1, v2, v3, v4, arr_v3);
                if(arr_v != null) {
                    this.c.getLocationInWindow(arr_v);
                    arr_v[0] -= v5;
                    arr_v[1] -= v6;
                }
                return true;
            }
            else if(arr_v != null) {
                arr_v[0] = 0;
                arr_v[1] = 0;
                return false;
            }
        }
        return false;
    }

    private ViewParent i(int v) {
        switch(v) {
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
            default: {
                return null;
            }
        }
    }

    private int[] j() {
        if(this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public boolean k() {
        return this.l(0);
    }

    public boolean l(int v) {
        return this.i(v) != null;
    }

    public boolean m() {
        return this.d;
    }

    public void n() {
        ViewCompat.R2(this.c);
    }

    public void o(View view0) {
        ViewCompat.R2(this.c);
    }

    public void p(boolean z) {
        if(this.d) {
            ViewCompat.R2(this.c);
        }
        this.d = z;
    }

    private void q(int v, ViewParent viewParent0) {
        switch(v) {
            case 0: {
                this.a = viewParent0;
                return;
            }
            case 1: {
                this.b = viewParent0;
            }
        }
    }

    public boolean r(int v) {
        return this.s(v, 0);
    }

    public boolean s(int v, int v1) {
        if(this.l(v1)) {
            return true;
        }
        if(this.m()) {
            ViewParent viewParent0 = this.c.getParent();
            View view0 = this.c;
            while(viewParent0 != null) {
                if(ViewParentCompat.m(viewParent0, view0, this.c, v, v1)) {
                    this.q(v1, viewParent0);
                    ViewParentCompat.k(viewParent0, view0, this.c, v, v1);
                    return true;
                }
                if(viewParent0 instanceof View) {
                    view0 = (View)viewParent0;
                }
                viewParent0 = viewParent0.getParent();
            }
        }
        return false;
    }

    public void t() {
        this.u(0);
    }

    public void u(int v) {
        ViewParent viewParent0 = this.i(v);
        if(viewParent0 != null) {
            ViewParentCompat.o(viewParent0, this.c, v);
            this.q(v, null);
        }
    }
}

