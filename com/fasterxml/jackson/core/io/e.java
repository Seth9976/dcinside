package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.c;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class e implements Serializable {
    protected final transient Object a;
    protected final int b;
    protected final int c;
    protected final boolean d;
    protected final int e;
    private static final long f = 1L;
    protected static final e g = null;
    protected static final e h = null;
    @Deprecated
    public static final int i = 500;

    static {
        e.g = new e(false, null);
        e.h = new e(false, null);
    }

    @Deprecated
    protected e(boolean z, Object object0) {
        this(z, object0, -1, -1, c.b());
    }

    @Deprecated
    protected e(boolean z, Object object0, int v, int v1) {
        this(z, object0, v, v1, c.b());
    }

    protected e(boolean z, Object object0, int v, int v1, c c0) {
        this.d = z;
        this.a = object0;
        this.b = v;
        this.c = v1;
        this.e = c0.d();
    }

    protected e(boolean z, Object object0, c c0) {
        this(z, object0, -1, -1, c0);
    }

    protected int a(StringBuilder stringBuilder0, String s) {
        stringBuilder0.append('\"');
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(!Character.isISOControl(((char)v2)) || !this.b(stringBuilder0, v2)) {
                stringBuilder0.append(((char)v2));
            }
        }
        stringBuilder0.append('\"');
        return s.length();
    }

    protected boolean b(StringBuilder stringBuilder0, int v) {
        if(v != 10 && v != 13) {
            stringBuilder0.append('\\');
            stringBuilder0.append('u');
            stringBuilder0.append(com.fasterxml.jackson.core.io.c.o(v >> 12 & 15));
            stringBuilder0.append(com.fasterxml.jackson.core.io.c.o(v >> 8 & 15));
            stringBuilder0.append(com.fasterxml.jackson.core.io.c.o(v >> 4 & 15));
            stringBuilder0.append(com.fasterxml.jackson.core.io.c.o(v & 15));
            return true;
        }
        return false;
    }

    protected String c(CharSequence charSequence0, int[] arr_v, int v) {
        this.f(arr_v, charSequence0.length());
        int v1 = arr_v[0];
        return charSequence0.subSequence(v1, Math.min(arr_v[1], v) + v1).toString();
    }

    protected String d(byte[] arr_b, int[] arr_v, int v) {
        this.f(arr_v, arr_b.length);
        return new String(arr_b, arr_v[0], Math.min(arr_v[1], v), StandardCharsets.UTF_8);
    }

    protected String e(char[] arr_c, int[] arr_v, int v) {
        this.f(arr_v, arr_c.length);
        return new String(arr_c, arr_v[0], Math.min(arr_v[1], v));
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(this.b == ((e)object0).b && this.c == ((e)object0).c) {
            Object object1 = ((e)object0).a;
            Object object2 = this.a;
            if(object2 == null) {
                return object1 == null;
            }
            if(object1 == null) {
                return false;
            }
            return object2 instanceof File || object2 instanceof URL || object2 instanceof URI ? object2.equals(object1) : object2 == object1;
        }
        return false;
    }

    protected void f(int[] arr_v, int v) {
        int v1 = arr_v[0];
        if(v1 < 0) {
            v1 = 0;
        }
        else if(v1 >= v) {
            v1 = v;
        }
        arr_v[0] = v1;
        int v2 = arr_v[1];
        int v3 = v - v1;
        if(v2 < 0 || v2 > v3) {
            arr_v[1] = v3;
        }
    }

    public StringBuilder g(StringBuilder stringBuilder0) {
        String s2;
        Object object0 = this.o();
        if(object0 == null) {
            if(this == e.h) {
                stringBuilder0.append("REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled)");
                return stringBuilder0;
            }
            stringBuilder0.append("UNKNOWN");
            return stringBuilder0;
        }
        Class class0 = object0 instanceof Class ? ((Class)object0) : object0.getClass();
        String s = class0.getName();
        if(s.startsWith("java.")) {
            s = class0.getSimpleName();
        }
        else if(object0 instanceof byte[]) {
            s = "byte[]";
        }
        else if(object0 instanceof char[]) {
            s = "char[]";
        }
        stringBuilder0.append('(');
        stringBuilder0.append(s);
        stringBuilder0.append(')');
        if(this.p()) {
            int v = this.q();
            int[] arr_v = {this.n(), this.m()};
            String s1 = " chars";
            if(object0 instanceof CharSequence) {
                s2 = this.c(((CharSequence)object0), arr_v, v);
            }
            else if(object0 instanceof char[]) {
                s2 = this.e(((char[])object0), arr_v, v);
            }
            else if(object0 instanceof byte[]) {
                s2 = this.d(((byte[])object0), arr_v, v);
                s1 = " bytes";
            }
            else {
                s2 = null;
            }
            if(s2 != null) {
                this.a(stringBuilder0, s2);
                if(arr_v[1] > v) {
                    stringBuilder0.append("[truncated ");
                    stringBuilder0.append(arr_v[1] - v);
                    stringBuilder0.append(s1);
                    stringBuilder0.append(']');
                    return stringBuilder0;
                }
            }
        }
        else if(object0 instanceof byte[]) {
            stringBuilder0.append('[');
            stringBuilder0.append((this.m() >= 0 ? this.m() : ((byte[])object0).length));
            stringBuilder0.append(" bytes]");
        }
        return stringBuilder0;
    }

    public String h() {
        return this.g(new StringBuilder(200)).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Deprecated
    public static e i(boolean z, Object object0) {
        return new e(z, object0, c.b());
    }

    @Deprecated
    public static e j(boolean z, Object object0, int v, int v1) {
        return new e(z, object0, v, v1, c.b());
    }

    public static e k(boolean z, Object object0, int v, int v1, c c0) {
        return new e(z, object0, v, v1, c0);
    }

    public static e l(boolean z, Object object0, c c0) {
        return new e(z, object0, c0);
    }

    public int m() {
        return this.c;
    }

    public int n() {
        return this.b;
    }

    public Object o() {
        return this.a;
    }

    public boolean p() {
        return this.d;
    }

    protected int q() {
        return this.e;
    }

    public static e r(Object object0) {
        return e.s(false, object0);
    }

    // 去混淆评级： 低(20)
    public static e s(boolean z, Object object0) {
        return object0 instanceof e ? ((e)object0) : new e(z, object0);
    }

    private void u(ObjectInputStream objectInputStream0) throws IOException {
    }

    protected Object w() {
        return e.g;
    }

    public static e x() {
        return e.h;
    }

    public static e y() {
        return e.g;
    }

    private void z(ObjectOutputStream objectOutputStream0) throws IOException {
    }
}

