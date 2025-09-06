package com.fasterxml.jackson.core.sym;

import java.util.Arrays;

public final class g extends f {
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int[] h;

    g(String s, int v, int v1, int v2, int v3, int v4, int[] arr_v, int v5) {
        super(s, v);
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.h = arr_v;
        this.g = v5;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean a(int v) {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean b(int v, int v1) {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean c(int v, int v1, int v2) {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean d(int[] arr_v, int v) {
        if(v != this.g) {
            return false;
        }
        if(arr_v[0] != this.c) {
            return false;
        }
        if(arr_v[1] != this.d) {
            return false;
        }
        if(arr_v[2] != this.e) {
            return false;
        }
        if(arr_v[3] != this.f) {
            return false;
        }
        switch(v) {
            case 4: {
                return true;
            }
            case 5: {
                return arr_v[4] == this.h[0];
            }
            case 6: {
                break;
            }
            case 7: {
            label_16:
                if(arr_v[6] != this.h[2]) {
                    return false;
                }
                break;
            }
            case 8: {
                if(arr_v[7] != this.h[3]) {
                    return false;
                }
                goto label_16;
            }
            default: {
                return this.f(arr_v);
            }
        }
        return arr_v[5] == this.h[1] ? arr_v[4] == this.h[0] : false;
    }

    private final boolean f(int[] arr_v) {
        int v = this.g - 4;
        for(int v1 = 0; v1 < v; ++v1) {
            if(arr_v[v1 + 4] != this.h[v1]) {
                return false;
            }
        }
        return true;
    }

    public static g g(String s, int v, int[] arr_v, int v1) {
        if(v1 < 4) {
            throw new IllegalArgumentException();
        }
        int v2 = arr_v[0];
        int v3 = arr_v[1];
        int v4 = arr_v[2];
        int v5 = arr_v[3];
        return v1 - 4 <= 0 ? new g(s, v, v2, v3, v4, v5, null, v1) : new g(s, v, v2, v3, v4, v5, Arrays.copyOfRange(arr_v, 4, v1), v1);
    }
}

