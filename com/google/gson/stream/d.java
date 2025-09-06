package com.google.gson.stream;

import j..util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class d implements Closeable, Flushable {
    private final Writer a;
    private int[] b;
    private int c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private String h;
    private boolean i;
    private static final Pattern j;
    private static final String[] k;
    private static final String[] l;

    static {
        d.j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
        d.k = new String[0x80];
        for(int v = 0; v <= 0x1F; ++v) {
            d.k[v] = "\\u001f";
        }
        d.k[34] = "\\\"";
        d.k[92] = "\\\\";
        d.k[9] = "\\t";
        d.k[8] = "\\b";
        d.k[10] = "\\n";
        d.k[13] = "\\r";
        d.k[12] = "\\f";
        String[] arr_s = (String[])d.k.clone();
        d.l = arr_s;
        arr_s[60] = "\\u003c";
        arr_s[62] = "\\u003e";
        arr_s[38] = "\\u0026";
        arr_s[61] = "\\u003d";
        arr_s[39] = "\\u0027";
    }

    public d(Writer writer0) {
        this.b = new int[0x20];
        this.c = 0;
        this.L(6);
        this.e = ":";
        this.i = true;
        Objects.requireNonNull(writer0, "out == null");
        this.a = writer0;
    }

    public d E0(String s) throws IOException {
        if(s == null) {
            return this.v();
        }
        this.T0();
        this.b();
        this.e0(s);
        return this;
    }

    private void L(int v) {
        int v1 = this.c;
        int[] arr_v = this.b;
        if(v1 == arr_v.length) {
            this.b = Arrays.copyOf(arr_v, v1 * 2);
        }
        int v2 = this.c;
        this.c = v2 + 1;
        this.b[v2] = v;
    }

    public d L0(boolean z) throws IOException {
        this.T0();
        this.b();
        this.a.write((z ? "true" : "false"));
        return this;
    }

    private void Q(int v) {
        this.b[this.c - 1] = v;
    }

    public final void R(boolean z) {
        this.g = z;
    }

    public final void T(String s) {
        if(s.length() == 0) {
            this.d = null;
            this.e = ":";
            return;
        }
        this.d = s;
        this.e = ": ";
    }

    private void T0() throws IOException {
        if(this.h != null) {
            this.a();
            this.e0(this.h);
            this.h = null;
        }
    }

    public final void Y(boolean z) {
        this.f = z;
    }

    private void a() throws IOException {
        int v = this.x();
        if(v == 5) {
            this.a.write(44);
        }
        else if(v == 3) {
        }
        else {
            throw new IllegalStateException("Nesting problem.");
        }
        this.t();
        this.Q(4);
    }

    private void b() throws IOException {
        switch(this.x()) {
            case 1: {
                this.Q(2);
                this.t();
                return;
            }
            case 2: {
                this.a.append(',');
                this.t();
                return;
            }
            case 4: {
                this.a.append(this.e);
                this.Q(5);
                return;
            }
            case 6: {
                break;
            }
            case 7: {
                if(!this.f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
            }
            default: {
                throw new IllegalStateException("Nesting problem.");
            }
        }
        this.Q(7);
    }

    public d c() throws IOException {
        this.T0();
        return this.w(1, '[');
    }

    @Override
    public void close() throws IOException {
        this.a.close();
        if(this.c > 1 || this.c == 1 && this.b[0] != 7) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public final void d0(boolean z) {
        this.i = z;
    }

    public d e() throws IOException {
        this.T0();
        return this.w(3, '{');
    }

    private void e0(String s) throws IOException {
        String s2;
        String[] arr_s = this.g ? d.l : d.k;
        this.a.write(34);
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
                    this.a.write(s, v2, v1 - v2);
                }
                this.a.write(s2);
                v2 = v1 + 1;
            }
        label_21:
            ++v1;
        }
        if(v2 < v) {
            this.a.write(s, v2, v - v2);
        }
        this.a.write(34);
    }

    private d f(int v, int v1, char c) throws IOException {
        int v2 = this.x();
        if(v2 != v1 && v2 != v) {
            throw new IllegalStateException("Nesting problem.");
        }
        if(this.h != null) {
            throw new IllegalStateException("Dangling name: " + this.h);
        }
        --this.c;
        if(v2 == v1) {
            this.t();
        }
        this.a.write(((int)c));
        return this;
    }

    public d f0(double f) throws IOException {
        this.T0();
        if(!this.f && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        this.b();
        this.a.append(Double.toString(f));
        return this;
    }

    @Override
    public void flush() throws IOException {
        if(this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public d h0(float f) throws IOException {
        this.T0();
        if(!this.f && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        this.b();
        this.a.append(Float.toString(f));
        return this;
    }

    public d i() throws IOException {
        return this.f(1, 2, ']');
    }

    public d j() throws IOException {
        return this.f(3, 5, '}');
    }

    public final boolean k() {
        return this.i;
    }

    public d l0(long v) throws IOException {
        this.T0();
        this.b();
        this.a.write(Long.toString(v));
        return this;
    }

    public final boolean n() {
        return this.g;
    }

    public boolean o() {
        return this.f;
    }

    private static boolean p(Class class0) {
        return class0 == Integer.class || class0 == Long.class || class0 == Double.class || class0 == Float.class || class0 == Byte.class || class0 == Short.class || class0 == BigDecimal.class || class0 == BigInteger.class || class0 == AtomicInteger.class || class0 == AtomicLong.class;
    }

    public d q(String s) throws IOException {
        if(s == null) {
            return this.v();
        }
        this.T0();
        this.b();
        this.a.append(s);
        return this;
    }

    public d s(String s) throws IOException {
        Objects.requireNonNull(s, "name == null");
        if(this.h != null) {
            throw new IllegalStateException();
        }
        if(this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.h = s;
        return this;
    }

    private void t() throws IOException {
        if(this.d == null) {
            return;
        }
        this.a.write(10);
        int v = this.c;
        for(int v1 = 1; v1 < v; ++v1) {
            this.a.write(this.d);
        }
    }

    public d u0(Boolean boolean0) throws IOException {
        if(boolean0 == null) {
            return this.v();
        }
        this.T0();
        this.b();
        this.a.write((boolean0.booleanValue() ? "true" : "false"));
        return this;
    }

    public d v() throws IOException {
        if(this.h != null) {
            if(this.i) {
                this.T0();
                this.b();
                this.a.write("null");
                return this;
            }
            this.h = null;
            return this;
        }
        this.b();
        this.a.write("null");
        return this;
    }

    private d w(int v, char c) throws IOException {
        this.b();
        this.L(v);
        this.a.write(((int)c));
        return this;
    }

    private int x() {
        int v = this.c;
        if(v == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.b[v - 1];
    }

    public d x0(Number number0) throws IOException {
        if(number0 == null) {
            return this.v();
        }
        this.T0();
        String s = number0.toString();
        if(!s.equals("-Infinity") && !s.equals("Infinity") && !s.equals("NaN")) {
            Class class0 = number0.getClass();
            if(!d.p(class0) && !d.j.matcher(s).matches()) {
                throw new IllegalArgumentException("String created by " + class0 + " is not a valid JSON number: " + s);
            }
        }
        else if(!this.f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + s);
        }
        this.b();
        this.a.append(s);
        return this;
    }
}

