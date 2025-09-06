package com.google.common.escape;

import J1.b;
import com.google.common.base.H;
import o3.a;

@b
@f
public abstract class l extends h {
    private static final int b = 0x20;

    @Override  // com.google.common.escape.h
    public String b(String s) {
        H.E(s);
        int v = s.length();
        int v1 = this.g(s, 0, v);
        return v1 == v ? s : this.e(s, v1);
    }

    protected static int c(CharSequence charSequence0, int v, int v1) {
        H.E(charSequence0);
        if(v >= v1) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int v2 = charSequence0.charAt(v);
        if(v2 >= 0xD800 && v2 <= 0xDFFF) {
            if(v2 > 0xDBFF) {
                throw new IllegalArgumentException("Unexpected low surrogate character \'" + ((char)v2) + "\' with value " + v2 + " at index " + v + " in \'" + charSequence0 + "\'");
            }
            if(v + 1 == v1) {
                return -v2;
            }
            int v3 = charSequence0.charAt(v + 1);
            if(!Character.isLowSurrogate(((char)v3))) {
                throw new IllegalArgumentException("Expected low surrogate but got char \'" + ((char)v3) + "\' with value " + v3 + " at index " + (v + 1) + " in \'" + charSequence0 + "\'");
            }
            return Character.toCodePoint(((char)v2), ((char)v3));
        }
        return v2;
    }

    @a
    protected abstract char[] d(int arg1);

    protected final String e(String s, int v) {
        int v1 = s.length();
        char[] arr_c = k.a();
        int v2 = 0;
        int v3 = 0;
        while(v < v1) {
            int v4 = l.c(s, v, v1);
            if(v4 < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] arr_c1 = this.d(v4);
            int v5 = (Character.isSupplementaryCodePoint(v4) ? 2 : 1) + v;
            if(arr_c1 != null) {
                int v6 = v - v2;
                int v7 = v3 + v6;
                int v8 = arr_c1.length + v7;
                if(arr_c.length < v8) {
                    arr_c = l.f(arr_c, v3, v8 + (v1 - v) + 0x20);
                }
                if(v6 > 0) {
                    v3 = v7;
                }
                if(arr_c1.length > 0) {
                    System.arraycopy(arr_c1, 0, arr_c, v3, arr_c1.length);
                    v3 += arr_c1.length;
                }
                v2 = v5;
            }
            v = this.g(s, v5, v1);
        }
        int v9 = v1 - v2;
        if(v9 > 0) {
            int v10 = v9 + v3;
            if(arr_c.length < v10) {
                arr_c = l.f(arr_c, v3, v10);
            }
            v3 = v10;
        }
        return new String(arr_c, 0, v3);
    }

    private static char[] f(char[] arr_c, int v, int v1) {
        if(v1 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] arr_c1 = new char[v1];
        if(v > 0) {
            System.arraycopy(arr_c, 0, arr_c1, 0, v);
        }
        return arr_c1;
    }

    protected int g(CharSequence charSequence0, int v, int v1) {
        while(v < v1) {
            int v2 = l.c(charSequence0, v, v1);
            if(v2 < 0 || this.d(v2) != null) {
                break;
            }
            v += (Character.isSupplementaryCodePoint(v2) ? 2 : 1);
        }
        return v;
    }
}

