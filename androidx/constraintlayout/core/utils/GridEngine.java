package androidx.constraintlayout.core.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GridEngine {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private String f;
    private String g;
    private int h;
    private int i;
    private boolean[][] j;
    private int[][] k;
    public static final int l = 1;
    public static final int m = 0;
    private static final int n = 50;
    private static final int o = 50;
    private static final int p = 3;

    public GridEngine() {
        this.i = 0;
    }

    public GridEngine(int v, int v1) {
        this.i = 0;
        this.b = v;
        this.e = v1;
        if(v > 50) {
            this.b = 3;
        }
        if(v1 > 50) {
            this.e = 3;
        }
        this.x();
        this.j();
    }

    public GridEngine(int v, int v1, int v2) {
        this.i = 0;
        this.b = v;
        this.e = v1;
        this.c = v2;
        if(v > 50) {
            this.b = 3;
        }
        if(v1 > 50) {
            this.e = 3;
        }
        this.x();
        int v3 = this.a;
        int v4 = this.d;
        if(v2 > v3 * v4 || v2 < 1) {
            this.c = v3 * v4;
        }
        this.j();
        this.d(false);
    }

    private void a() {
        for(int v = 0; v < this.c; ++v) {
            if(this.m(v) == -1) {
                int v1 = this.f();
                int v2 = this.g(v1);
                int v3 = this.e(v1);
                if(v1 == -1) {
                    return;
                }
                this.b(v, v2, v3, 1, 1);
            }
        }
    }

    private void b(int v, int v1, int v2, int v3, int v4) {
        int[] arr_v = this.k[v];
        arr_v[0] = v2;
        arr_v[1] = v1;
        arr_v[2] = v2 + v4 - 1;
        arr_v[3] = v1 + v3 - 1;
    }

    public int c(int v) {
        return this.k == null || v >= this.k.length ? 0 : this.k[v][3];
    }

    private void d(boolean z) {
        if(z) {
            for(int v = 0; v < this.j.length; ++v) {
                for(int v1 = 0; true; ++v1) {
                    boolean[][] arr2_z = this.j;
                    if(v1 >= arr2_z[0].length) {
                        break;
                    }
                    arr2_z[v][v1] = true;
                }
            }
            for(int v2 = 0; v2 < this.k.length; ++v2) {
                for(int v3 = 0; true; ++v3) {
                    int[][] arr2_v = this.k;
                    if(v3 >= arr2_v[0].length) {
                        break;
                    }
                    arr2_v[v2][v3] = -1;
                }
            }
        }
        this.i = 0;
        if(this.g != null && !this.g.trim().isEmpty()) {
            int[][] arr2_v1 = this.n(this.g);
            if(arr2_v1 != null) {
                this.h(arr2_v1);
            }
        }
        if(this.f != null && !this.f.trim().isEmpty()) {
            int[][] arr2_v2 = this.n(this.f);
            if(arr2_v2 != null) {
                this.i(arr2_v2);
            }
        }
        this.a();
    }

    private int e(int v) {
        return this.h == 1 ? v / this.a : v % this.d;
    }

    private int f() {
        int v = 0;
        boolean z = false;
        while(!z) {
            v = this.i;
            if(v >= this.a * this.d) {
                return -1;
            }
            int v1 = this.g(v);
            int v2 = this.e(this.i);
            boolean[] arr_z = this.j[v1];
            if(arr_z[v2]) {
                arr_z[v2] = false;
                z = true;
            }
            ++this.i;
        }
        return v;
    }

    private int g(int v) {
        return this.h == 1 ? v % this.a : v / this.d;
    }

    private void h(int[][] arr2_v) {
        for(int v = 0; v < arr2_v.length; ++v) {
            int v1 = this.g(arr2_v[v][0]);
            int v2 = this.e(arr2_v[v][0]);
            int[] arr_v = arr2_v[v];
            if(!this.k(v1, v2, arr_v[1], arr_v[2])) {
                return;
            }
        }
    }

    private void i(int[][] arr2_v) {
        for(int v = 0; v < arr2_v.length; ++v) {
            int v1 = this.g(arr2_v[v][0]);
            int v2 = this.e(arr2_v[v][0]);
            int[] arr_v = arr2_v[v];
            if(!this.k(v1, v2, arr_v[1], arr_v[2])) {
                return;
            }
            int[] arr_v1 = arr2_v[v];
            this.b(v, v1, v2, arr_v1[1], arr_v1[2]);
        }
    }

    private void j() {
        int[] arr_v = new int[2];
        arr_v[1] = this.d;
        arr_v[0] = this.a;
        boolean[][] arr2_z = (boolean[][])Array.newInstance(Boolean.TYPE, arr_v);
        this.j = arr2_z;
        for(int v1 = 0; v1 < arr2_z.length; ++v1) {
            Arrays.fill(arr2_z[v1], true);
        }
        int v2 = this.c;
        if(v2 > 0) {
            int[][] arr2_v = new int[v2][4];
            this.k = arr2_v;
            for(int v = 0; v < arr2_v.length; ++v) {
                Arrays.fill(arr2_v[v], -1);
            }
        }
    }

    private boolean k(int v, int v1, int v2, int v3) {
        int v4 = v;
        while(v4 < v + v2) {
            int v5 = v1;
            while(v5 < v1 + v3) {
                boolean[][] arr2_z = this.j;
                if(v4 < arr2_z.length && v5 < arr2_z[0].length) {
                    boolean[] arr_z = arr2_z[v4];
                    if(!arr_z[v5]) {
                        return false;
                    }
                    arr_z[v5] = false;
                    ++v5;
                    continue;
                }
                return false;
            }
            ++v4;
        }
        return true;
    }

    private boolean l(CharSequence charSequence0) {
        return charSequence0 != null;
    }

    public int m(int v) {
        return this.k == null || v >= this.k.length ? 0 : this.k[v][0];
    }

    private int[][] n(String s) {
        if(!this.l(s)) {
            return null;
        }
        String[] arr_s = s.split(",");
        int[][] arr2_v = new int[arr_s.length][3];
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].trim().split(":");
            String[] arr_s2 = arr_s1[1].split("x");
            int[] arr_v = arr2_v[v];
            arr_v[0] = Integer.parseInt(arr_s1[0]);
            int[] arr_v1 = arr2_v[v];
            arr_v1[1] = Integer.parseInt(arr_s2[0]);
            int[] arr_v2 = arr2_v[v];
            arr_v2[2] = Integer.parseInt(arr_s2[1]);
        }
        return arr2_v;
    }

    public int o(int v) {
        return this.k == null || v >= this.k.length ? 0 : this.k[v][2];
    }

    public void p(int v) {
        if(v > 50) {
            return;
        }
        if(this.e == v) {
            return;
        }
        this.e = v;
        this.x();
    }

    public void q(int v) {
        if(v > this.a * this.d) {
            return;
        }
        this.c = v;
    }

    public void r(int v) {
        if(v != 0 && v != 1) {
            return;
        }
        if(this.h == v) {
            return;
        }
        this.h = v;
    }

    public void s(int v) {
        if(v > 50) {
            return;
        }
        if(this.b == v) {
            return;
        }
        this.b = v;
        this.x();
    }

    public void t(String s) {
        if(this.g != null && this.g.equals(s)) {
            return;
        }
        this.g = s;
    }

    public void u(CharSequence charSequence0) {
        if(this.f != null && this.f.equals(charSequence0.toString())) {
            return;
        }
        this.f = charSequence0.toString();
    }

    public void v() {
        boolean z = false;
        if(this.k == null || this.k.length != this.c || (this.j == null || this.j.length != this.a || this.j[0].length != this.d)) {
            this.j();
        }
        else {
            z = true;
        }
        this.d(z);
    }

    public int w(int v) {
        return this.k == null || v >= this.k.length ? 0 : this.k[v][1];
    }

    private void x() {
        int v = this.b;
        if(v != 0) {
            int v1 = this.e;
            if(v1 != 0) {
                this.a = v;
                this.d = v1;
                return;
            }
        }
        int v2 = this.e;
        if(v2 > 0) {
            this.d = v2;
            this.a = (this.c + v2 - 1) / v2;
            return;
        }
        if(v > 0) {
            this.a = v;
            this.d = (this.c + v - 1) / v;
            return;
        }
        double f = Math.sqrt(this.c);
        this.a = (int)(f + 1.5);
        this.d = (this.c + ((int)(f + 1.5)) - 1) / ((int)(f + 1.5));
    }
}

