package com.bykv.vk.openvk.preload.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public final class c implements Closeable, Flushable {
    private static final String[] a;
    private static final String[] b;
    private final Writer c;
    private int[] d;
    private int e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;

    static {
        c.a = new String[0x80];
        for(int v = 0; v <= 0x1F; ++v) {
            c.a[v] = "\\u001f";
        }
        c.a[34] = "\\\"";
        c.a[92] = "\\\\";
        c.a[9] = "\\t";
        c.a[8] = "\\b";
        c.a[10] = "\\n";
        c.a[13] = "\\r";
        c.a[12] = "\\f";
        String[] arr_s = (String[])c.a.clone();
        c.b = arr_s;
        arr_s[60] = "\\u003c";
        arr_s[62] = "\\u003e";
        arr_s[38] = "\\u0026";
        arr_s[61] = "\\u003d";
        arr_s[39] = "\\u0027";
    }

    public c(Writer writer0) {
        this.d = new int[0x20];
        this.e = 0;
        this.a(6);
        this.g = ":";
        this.k = true;
        if(writer0 == null) {
            throw new NullPointerException("out == null");
        }
        this.c = writer0;
    }

    private c a(int v, char c) throws IOException {
        this.m();
        this.a(v);
        this.c.write(((int)c));
        return this;
    }

    private c a(int v, int v1, char c) throws IOException {
        int v2 = this.i();
        if(v2 != v1 && v2 != v) {
            throw new IllegalStateException("Nesting problem.");
        }
        if(this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        --this.e;
        if(v2 == v1) {
            this.k();
        }
        this.c.write(((int)c));
        return this;
    }

    private void a(int v) {
        int v1 = this.e;
        int[] arr_v = this.d;
        if(v1 == arr_v.length) {
            this.d = Arrays.copyOf(arr_v, v1 << 1);
        }
        int v2 = this.e;
        this.e = v2 + 1;
        this.d[v2] = v;
    }

    public final c a(long v) throws IOException {
        this.j();
        this.m();
        this.c.write(Long.toString(v));
        return this;
    }

    public final c a(Boolean boolean0) throws IOException {
        if(boolean0 == null) {
            return this.h();
        }
        this.j();
        this.m();
        this.c.write((boolean0.booleanValue() ? "true" : "false"));
        return this;
    }

    public final c a(Number number0) throws IOException {
        if(number0 == null) {
            return this.h();
        }
        this.j();
        String s = number0.toString();
        if(!this.h && (s.equals("-Infinity") || s.equals("Infinity") || s.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number0);
        }
        this.m();
        this.c.append(s);
        return this;
    }

    public final c a(String s) throws IOException {
        if(s == null) {
            throw new NullPointerException("name == null");
        }
        if(this.j != null) {
            throw new IllegalStateException();
        }
        if(this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.j = s;
        return this;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final boolean a() {
        return this.h;
    }

    private void b(int v) {
        this.d[this.e - 1] = v;
    }

    public final c b(String s) throws IOException {
        if(s == null) {
            return this.h();
        }
        this.j();
        this.m();
        this.c(s);
        return this;
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public final boolean b() {
        return this.i;
    }

    private void c(String s) throws IOException {
        String s2;
        String[] arr_s = this.i ? c.b : c.a;
        this.c.write(34);
        int v = s.length();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            int v3 = s.charAt(v1);
            if(v3 < 0x80) {
                String s1 = arr_s[v3];
                if(s1 != null) {
                    s2 = s1;
                    goto label_17;
                }
            }
            else {
                switch(v3) {
                    case 0x2028: {
                        s2 = "\\u2028";
                        break;
                    }
                    case 0x2029: {
                        s2 = "\\u2029";
                        break;
                    }
                    default: {
                        goto label_21;
                    }
                }
            label_17:
                if(v2 < v1) {
                    this.c.write(s, v2, v1 - v2);
                }
                this.c.write(s2);
                v2 = v1 + 1;
            }
        label_21:
            ++v1;
        }
        if(v2 < v) {
            this.c.write(s, v2, v - v2);
        }
        this.c.write(34);
    }

    public final void c(boolean z) {
        this.k = z;
    }

    public final boolean c() {
        return this.k;
    }

    @Override
    public final void close() throws IOException {
        this.c.close();
        if(this.e > 1 || this.e == 1 && this.d[0] != 7) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    public final c d() throws IOException {
        this.j();
        return this.a(1, '[');
    }

    public final c d(boolean z) throws IOException {
        this.j();
        this.m();
        this.c.write((z ? "true" : "false"));
        return this;
    }

    public final c e() throws IOException {
        return this.a(1, 2, ']');
    }

    public final c f() throws IOException {
        this.j();
        return this.a(3, '{');
    }

    @Override
    public final void flush() throws IOException {
        if(this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.c.flush();
    }

    public final c g() throws IOException {
        return this.a(3, 5, '}');
    }

    public final c h() throws IOException {
        if(this.j != null) {
            if(this.k) {
                this.j();
                this.m();
                this.c.write("null");
                return this;
            }
            this.j = null;
            return this;
        }
        this.m();
        this.c.write("null");
        return this;
    }

    private int i() {
        int v = this.e;
        if(v == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.d[v - 1];
    }

    private void j() throws IOException {
        if(this.j != null) {
            this.l();
            this.c(this.j);
            this.j = null;
        }
    }

    private void k() throws IOException {
        if(this.f == null) {
            return;
        }
        this.c.write(10);
        int v = this.e;
        for(int v1 = 1; v1 < v; ++v1) {
            this.c.write(this.f);
        }
    }

    private void l() throws IOException {
        int v = this.i();
        if(v == 5) {
            this.c.write(44);
        }
        else if(v == 3) {
        }
        else {
            throw new IllegalStateException("Nesting problem.");
        }
        this.k();
        this.b(4);
    }

    private void m() throws IOException {
        switch(this.i()) {
            case 1: {
                this.b(2);
                this.k();
                return;
            }
            case 2: {
                this.c.append(',');
                this.k();
                return;
            }
            case 4: {
                this.c.append(this.g);
                this.b(5);
                return;
            }
            case 6: {
                break;
            }
            case 7: {
                if(!this.h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
            }
            default: {
                throw new IllegalStateException("Nesting problem.");
            }
        }
        this.b(7);
    }
}

