package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.l;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class x {
    private final a a;
    private char[] b;
    private int c;
    private int d;
    private ArrayList e;
    private boolean f;
    private int g;
    private char[] h;
    private int i;
    private String j;
    private char[] k;
    static final char[] l = null;
    static final int m = 500;
    static final int n = 0x10000;

    static {
        x.l = new char[0];
    }

    public x(a a0) {
        this.a = a0;
    }

    protected x(a a0, char[] arr_c) {
        this(a0);
        this.h = arr_c;
        this.i = arr_c.length;
        this.c = -1;
    }

    public char[] A() {
        return this.h;
    }

    public char[] B() {
        if(this.c >= 0) {
            this.R(1);
            return this.h;
        }
        char[] arr_c = this.h;
        if(arr_c == null) {
            this.h = this.f(0);
            return this.h;
        }
        if(this.i >= arr_c.length) {
            this.u();
        }
        return this.h;
    }

    public int C() {
        return this.i;
    }

    public char[] D() throws IOException {
        if(this.c >= 0) {
            return this.b;
        }
        char[] arr_c = this.k;
        if(arr_c != null) {
            return arr_c;
        }
        String s = this.j;
        if(s != null) {
            char[] arr_c1 = s.toCharArray();
            this.k = arr_c1;
            return arr_c1;
        }
        if(!this.f) {
            return this.h == null ? x.l : this.h;
        }
        return this.i();
    }

    public int E() {
        return this.c >= 0 ? this.c : 0;
    }

    public boolean F() {
        return this.c >= 0 || this.k != null || this.j == null;
    }

    public void G() {
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.k = null;
        if(this.f) {
            this.h();
        }
        a a0 = this.a;
        if(a0 != null) {
            char[] arr_c = this.h;
            if(arr_c != null) {
                this.h = null;
                a0.l(2, arr_c);
            }
        }
    }

    public void H(char c) {
        this.c = -1;
        this.d = 0;
        this.j = null;
        this.k = null;
        if(this.f) {
            this.h();
        }
        else if(this.h == null) {
            this.h = this.f(1);
        }
        this.h[0] = c;
        this.g = 1;
        this.i = 1;
    }

    public void I(String s, int v, int v1) throws IOException {
        this.b = null;
        this.c = -1;
        this.d = 0;
        this.j = null;
        this.k = null;
        if(this.f) {
            this.h();
        }
        else if(this.h == null) {
            this.h = this.f(v1);
        }
        this.g = 0;
        this.i = 0;
        this.d(s, v, v1);
    }

    public void J(char[] arr_c, int v, int v1) throws IOException {
        this.b = null;
        this.c = -1;
        this.d = 0;
        this.j = null;
        this.k = null;
        if(this.f) {
            this.h();
        }
        else if(this.h == null) {
            this.h = this.f(v1);
        }
        this.g = 0;
        this.i = 0;
        this.e(arr_c, v, v1);
    }

    public void K() {
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.j = null;
        this.k = null;
        if(this.f) {
            this.h();
        }
    }

    public void L(char[] arr_c, int v, int v1) {
        this.j = null;
        this.k = null;
        this.b = arr_c;
        this.c = v;
        this.d = v1;
        if(this.f) {
            this.h();
        }
    }

    public void M(String s) throws IOException {
        this.b = null;
        this.c = -1;
        this.d = 0;
        this.T(s.length());
        this.j = s;
        this.k = null;
        if(this.f) {
            this.h();
        }
        this.i = 0;
    }

    private char[] N() throws IOException {
        int v4;
        String s = this.j;
        if(s != null) {
            return s.toCharArray();
        }
        if(this.c >= 0) {
            int v = this.d;
            if(v < 1) {
                return x.l;
            }
            this.T(v);
            return this.c == 0 ? Arrays.copyOf(this.b, v) : Arrays.copyOfRange(this.b, this.c, v + this.c);
        }
        int v1 = this.Q();
        if(v1 < 1) {
            if(v1 < 0) {
                this.b(this.g, this.i);
            }
            return x.l;
        }
        this.T(v1);
        char[] arr_c = this.g(v1);
        ArrayList arrayList0 = this.e;
        if(arrayList0 == null) {
            v4 = 0;
        }
        else {
            int v2 = arrayList0.size();
            v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                char[] arr_c1 = (char[])this.e.get(v3);
                System.arraycopy(arr_c1, 0, arr_c, v4, arr_c1.length);
                v4 += arr_c1.length;
            }
        }
        System.arraycopy(this.h, 0, arr_c, v4, this.i);
        return arr_c;
    }

    public String O(int v) throws IOException {
        this.i = v;
        if(this.g > 0) {
            return this.q();
        }
        this.T(v);
        String s = v == 0 ? "" : new String(this.h, 0, v);
        this.j = s;
        return s;
    }

    public void P(int v) {
        this.i = v;
    }

    public int Q() {
        if(this.c >= 0) {
            return this.d;
        }
        char[] arr_c = this.k;
        if(arr_c != null) {
            return arr_c.length;
        }
        return this.j == null ? this.g + this.i : this.j.length();
    }

    private void R(int v) {
        int v1 = this.d;
        this.d = 0;
        char[] arr_c = this.b;
        this.b = null;
        int v2 = this.c;
        this.c = -1;
        int v3 = v + v1;
        if(this.h == null || v3 > this.h.length) {
            this.h = this.f(v3);
        }
        if(v1 > 0) {
            System.arraycopy(arr_c, v2, this.h, 0, v1);
        }
        this.g = 0;
        this.i = v1;
    }

    private void S(int v) throws IOException {
        this.T((this.g + this.i + v >= 0 ? this.g + this.i + v : 0x7FFFFFFF));
    }

    protected void T(int v) throws IOException {
    }

    private String a(int v) throws IOException {
        while(true) {
            char[] arr_c = this.h;
            while(v - 1 >= 0) {
                if(arr_c[v - 1] > 0x20) {
                    this.i = v;
                    return this.q();
                }
                --v;
            }
            if(this.e == null || this.e.isEmpty()) {
                break;
            }
            char[] arr_c1 = (char[])this.e.remove(this.e.size() - 1);
            this.h = arr_c1;
            v = arr_c1.length;
        }
        this.i = 0;
        this.f = false;
        return this.q();
    }

    protected void b(int v, int v1) {
        throw new IllegalStateException("TextBuffer overrun: size reached (" + (((long)v) + ((long)v1)) + ") exceeds maximum of " + 0x7FFFFFFF);
    }

    public void c(char c) throws IOException {
        if(this.c >= 0) {
            this.R(16);
        }
        this.j = null;
        this.k = null;
        char[] arr_c = this.h;
        if(this.i >= arr_c.length) {
            this.S(1);
            this.u();
            arr_c = this.h;
        }
        int v = this.i;
        this.i = v + 1;
        arr_c[v] = c;
    }

    public void d(String s, int v, int v1) throws IOException {
        if(this.c >= 0) {
            this.R(v1);
        }
        this.j = null;
        this.k = null;
        char[] arr_c = this.h;
        int v2 = this.i;
        int v3 = arr_c.length - v2;
        if(v3 >= v1) {
            s.getChars(v, v + v1, arr_c, v2);
            this.i += v1;
            return;
        }
        this.S(v1);
        if(v3 > 0) {
            int v4 = v + v3;
            s.getChars(v, v4, arr_c, this.i);
            v1 -= v3;
            v = v4;
        }
        while(true) {
            this.u();
            int v5 = Math.min(this.h.length, v1);
            int v6 = v + v5;
            s.getChars(v, v6, this.h, 0);
            this.i += v5;
            v1 -= v5;
            if(v1 <= 0) {
                break;
            }
            v = v6;
        }
    }

    public void e(char[] arr_c, int v, int v1) throws IOException {
        if(this.c >= 0) {
            this.R(v1);
        }
        this.j = null;
        this.k = null;
        char[] arr_c1 = this.h;
        int v2 = this.i;
        int v3 = arr_c1.length - v2;
        if(v3 >= v1) {
            System.arraycopy(arr_c, v, arr_c1, v2, v1);
            this.i += v1;
            return;
        }
        this.S(v1);
        if(v3 > 0) {
            System.arraycopy(arr_c, v, arr_c1, this.i, v3);
            v += v3;
            v1 -= v3;
        }
        do {
            this.u();
            int v4 = Math.min(this.h.length, v1);
            System.arraycopy(arr_c, v, this.h, 0, v4);
            this.i += v4;
            v += v4;
            v1 -= v4;
        }
        while(v1 > 0);
    }

    private char[] f(int v) {
        return this.a == null ? new char[Math.max(v, 500)] : this.a.f(2, v);
    }

    private char[] g(int v) {
        return new char[v];
    }

    private void h() {
        this.f = false;
        this.e.clear();
        this.g = 0;
        this.i = 0;
    }

    public char[] i() throws IOException {
        char[] arr_c = this.k;
        if(arr_c == null) {
            arr_c = this.N();
            this.k = arr_c;
        }
        return arr_c;
    }

    @Deprecated
    public BigDecimal j() throws NumberFormatException {
        try {
            return l.i(this.i());
        }
        catch(IOException iOException0) {
            throw new NumberFormatException(iOException0.getMessage());
        }
    }

    @Deprecated
    public double k() throws NumberFormatException {
        return this.l(false);
    }

    public double l(boolean z) throws NumberFormatException {
        try {
            return l.q(this.q(), z);
        }
        catch(IOException iOException0) {
            throw new NumberFormatException(iOException0.getMessage());
        }
    }

    @Deprecated
    public float m() throws NumberFormatException {
        return this.n(false);
    }

    public float n(boolean z) throws NumberFormatException {
        try {
            return l.s(this.q(), z);
        }
        catch(IOException iOException0) {
            throw new NumberFormatException(iOException0.getMessage());
        }
    }

    public int o(boolean z) {
        int v = this.c;
        if(v >= 0) {
            char[] arr_c = this.b;
            if(arr_c != null) {
                return z ? -l.u(arr_c, v + 1, this.d - 1) : l.u(arr_c, v, this.d);
            }
        }
        return z ? -l.u(this.h, 1, this.i - 1) : l.u(this.h, 0, this.i);
    }

    public long p(boolean z) {
        int v = this.c;
        if(v >= 0) {
            char[] arr_c = this.b;
            if(arr_c != null) {
                return z ? -l.w(arr_c, v + 1, this.d - 1) : l.w(arr_c, v, this.d);
            }
        }
        return z ? -l.w(this.h, 1, this.i - 1) : l.w(this.h, 0, this.i);
    }

    public String q() throws IOException {
        if(this.j == null) {
            char[] arr_c = this.k;
            if(arr_c != null) {
                this.j = new String(arr_c);
                return this.j;
            }
            if(this.c >= 0) {
                int v = this.d;
                if(v < 1) {
                    this.j = "";
                    return "";
                }
                this.T(v);
                this.j = new String(this.b, this.c, this.d);
                return this.j;
            }
            int v1 = this.g;
            int v2 = this.i;
            if(v1 == 0) {
                if(v2 == 0) {
                    this.j = "";
                    return "";
                }
                this.T(v2);
                this.j = new String(this.h, 0, v2);
                return this.j;
            }
            int v3 = v1 + v2;
            if(v3 < 0) {
                this.b(v1, v2);
            }
            this.T(v3);
            StringBuilder stringBuilder0 = new StringBuilder(v3);
            ArrayList arrayList0 = this.e;
            if(arrayList0 != null) {
                int v4 = arrayList0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    char[] arr_c1 = (char[])this.e.get(v5);
                    stringBuilder0.append(arr_c1, 0, arr_c1.length);
                }
            }
            stringBuilder0.append(this.h, 0, this.i);
            this.j = stringBuilder0.toString();
        }
        return this.j;
    }

    public int r(Writer writer0) throws IOException {
        int v4;
        char[] arr_c = this.k;
        if(arr_c != null) {
            writer0.write(arr_c);
            return this.k.length;
        }
        String s = this.j;
        if(s != null) {
            writer0.write(s);
            return this.j.length();
        }
        int v = this.c;
        if(v >= 0) {
            int v1 = this.d;
            if(v1 > 0) {
                writer0.write(this.b, v, v1);
            }
            return v1;
        }
        ArrayList arrayList0 = this.e;
        if(arrayList0 == null) {
            v4 = 0;
        }
        else {
            int v2 = arrayList0.size();
            v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                char[] arr_c1 = (char[])this.e.get(v3);
                v4 += arr_c1.length;
                writer0.write(arr_c1, 0, arr_c1.length);
            }
        }
        int v5 = this.i;
        if(v5 > 0) {
            v4 += v5;
            writer0.write(this.h, 0, v5);
        }
        return v4;
    }

    public char[] s() {
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.j = null;
        this.k = null;
        if(this.f) {
            this.h();
        }
        char[] arr_c = this.h;
        if(arr_c == null) {
            arr_c = this.f(0);
            this.h = arr_c;
        }
        return arr_c;
    }

    public void t() {
        if(this.c >= 0) {
            this.R(16);
        }
    }

    @Override
    public String toString() {
        try {
            return this.q();
        }
        catch(IOException unused_ex) {
            return "TextBuffer: Exception when reading contents";
        }
    }

    private void u() {
        if(this.e == null) {
            this.e = new ArrayList();
        }
        char[] arr_c = this.h;
        this.f = true;
        this.e.add(arr_c);
        int v = this.g + arr_c.length;
        this.g = v;
        if(v < 0) {
            this.b(v - arr_c.length, arr_c.length);
        }
        this.i = 0;
        int v1 = arr_c.length + (arr_c.length >> 1);
        if(v1 < 500) {
            v1 = 500;
        }
        else if(v1 > 0x10000) {
            v1 = 0x10000;
        }
        this.h = this.g(v1);
    }

    public char[] v() {
        char[] arr_c = Arrays.copyOf(this.h, ((this.h.length >> 1) + this.h.length <= 0x10000 ? (this.h.length >> 1) + this.h.length : (this.h.length >> 2) + this.h.length));
        this.h = arr_c;
        return arr_c;
    }

    public char[] w(int v) {
        char[] arr_c = this.h;
        if(arr_c.length >= v) {
            return arr_c;
        }
        char[] arr_c1 = Arrays.copyOf(arr_c, v);
        this.h = arr_c1;
        return arr_c1;
    }

    public String x(int v, boolean z) throws IOException {
        if(z && (v - 1 < 0 || this.h[v - 1] <= 0x20)) {
            return this.a(v - 1);
        }
        this.i = v;
        return this.q();
    }

    public char[] y() throws IOException {
        if(this.e == null) {
            this.e = new ArrayList();
        }
        this.f = true;
        this.e.add(this.h);
        int v = this.h.length;
        int v1 = this.g + v;
        this.g = v1;
        if(v1 < 0) {
            this.b(v1 - v, v);
        }
        this.i = 0;
        this.T(this.g);
        int v2 = v + (v >> 1);
        if(v2 < 500) {
            v2 = 500;
        }
        else if(v2 > 0x10000) {
            v2 = 0x10000;
        }
        char[] arr_c = this.g(v2);
        this.h = arr_c;
        return arr_c;
    }

    public static x z(char[] arr_c) {
        return new x(null, arr_c);
    }
}

