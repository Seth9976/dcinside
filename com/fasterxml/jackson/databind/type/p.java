package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class p implements Serializable {
    static final class a {
        private final Class a;
        private final m[] b;
        private final int c;

        public a(Class class0, m[] arr_m, int v) {
            this.a = class0;
            this.b = arr_m;
            this.c = class0.hashCode() * 0x1F + v;
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 == null) {
                return false;
            }
            if(object0.getClass() != a.class) {
                return false;
            }
            if(this.c == ((a)object0).c && this.a == ((a)object0).a) {
                m[] arr_m = ((a)object0).b;
                if(this.b.length == arr_m.length) {
                    for(int v = 0; v < this.b.length; ++v) {
                        if(!this.b[v].equals(arr_m[v])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.c;
        }

        @Override
        public String toString() {
            return this.a.getName() + "<>";
        }
    }

    static class b {
        private static final TypeVariable[] a;
        private static final TypeVariable[] b;
        private static final TypeVariable[] c;
        private static final TypeVariable[] d;
        private static final TypeVariable[] e;
        private static final TypeVariable[] f;
        private static final TypeVariable[] g;
        private static final TypeVariable[] h;

        static {
            b.a = AbstractList.class.getTypeParameters();
            b.b = Collection.class.getTypeParameters();
            b.c = Iterable.class.getTypeParameters();
            b.d = List.class.getTypeParameters();
            b.e = ArrayList.class.getTypeParameters();
            b.f = Map.class.getTypeParameters();
            b.g = HashMap.class.getTypeParameters();
            b.h = LinkedHashMap.class.getTypeParameters();
        }

        public static TypeVariable[] a(Class class0) {
            if(class0 == Collection.class) {
                return b.b;
            }
            if(class0 == List.class) {
                return b.d;
            }
            if(class0 == ArrayList.class) {
                return b.e;
            }
            if(class0 == AbstractList.class) {
                return b.a;
            }
            return class0 == Iterable.class ? b.c : class0.getTypeParameters();
        }

        public static TypeVariable[] b(Class class0) {
            if(class0 == Map.class) {
                return b.f;
            }
            if(class0 == HashMap.class) {
                return b.g;
            }
            return class0 == LinkedHashMap.class ? b.h : class0.getTypeParameters();
        }
    }

    private final String[] a;
    private final m[] b;
    private final String[] c;
    private final int d;
    private static final long e = 1L;
    private static final String[] f;
    private static final m[] g;
    private static final p h;

    static {
        String[] arr_s = new String[0];
        p.f = arr_s;
        m[] arr_m = new m[0];
        p.g = arr_m;
        p.h = new p(arr_s, arr_m, null);
    }

    private p(String[] arr_s, m[] arr_m, String[] arr_s1) {
        if(arr_s == null) {
            arr_s = p.f;
        }
        this.a = arr_s;
        if(arr_m == null) {
            arr_m = p.g;
        }
        this.b = arr_m;
        if(arr_s.length != arr_m.length) {
            throw new IllegalArgumentException("Mismatching names (" + arr_s.length + "), types (" + arr_m.length + ")");
        }
        this.c = arr_s1;
        this.d = Arrays.hashCode(arr_m);
    }

    public Object a(Class class0) {
        return this.o() ? null : new a(class0, this.b, this.d);
    }

    public static p b(Class class0, m m0) {
        TypeVariable[] arr_typeVariable = b.a(class0);
        int v = arr_typeVariable == null ? 0 : arr_typeVariable.length;
        if(v != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + class0.getName() + " with 1 type parameter: class expects " + v);
        }
        return new p(new String[]{arr_typeVariable[0].getName()}, new m[]{m0}, null);
    }

    public static p c(Class class0, m m0, m m1) {
        TypeVariable[] arr_typeVariable = b.b(class0);
        int v = arr_typeVariable == null ? 0 : arr_typeVariable.length;
        if(v != 2) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + class0.getName() + " with 2 type parameters: class expects " + v);
        }
        return new p(new String[]{arr_typeVariable[0].getName(), arr_typeVariable[1].getName()}, new m[]{m0, m1}, null);
    }

    public static p d(Class class0, List list0) {
        return list0 == null || list0.isEmpty() ? p.e(class0, p.g) : p.e(class0, ((m[])list0.toArray(p.g)));
    }

    public static p e(Class class0, m[] arr_m) {
        String[] arr_s;
        if(arr_m == null) {
            arr_m = p.g;
            goto label_5;
        }
        switch(arr_m.length) {
            case 1: {
                return p.b(class0, arr_m[0]);
            }
            case 2: {
                return p.c(class0, arr_m[0], arr_m[1]);
            }
            default: {
            label_5:
                TypeVariable[] arr_typeVariable = class0.getTypeParameters();
                if(arr_typeVariable == null || arr_typeVariable.length == 0) {
                    arr_s = p.f;
                }
                else {
                    arr_s = new String[arr_typeVariable.length];
                    for(int v = 0; v < arr_typeVariable.length; ++v) {
                        arr_s[v] = arr_typeVariable[v].getName();
                    }
                }
                if(arr_s.length != arr_m.length) {
                    throw new IllegalArgumentException("Cannot create TypeBindings for class " + class0.getName() + " with " + arr_m.length + " type parameter" + (arr_m.length == 1 ? "" : "s") + ": class expects " + arr_s.length);
                }
                return new p(arr_s, arr_m, null);
            }
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return h.R(object0, this.getClass()) ? this.d == ((p)object0).d && Arrays.equals(this.b, ((p)object0).b) : false;
    }

    // 去混淆评级： 低(20)
    public static p f(List list0, List list1) {
        return list0 == null || list0.isEmpty() || list1 == null || list1.isEmpty() ? p.h : new p(((String[])list0.toArray(p.f)), ((m[])list1.toArray(p.g)), null);
    }

    public static p g(Class class0, m m0) {
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        int v = arr_typeVariable == null ? 0 : arr_typeVariable.length;
        if(v == 0) {
            return p.h;
        }
        if(v != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + class0.getName() + " with 1 type parameter: class expects " + v);
        }
        return new p(new String[]{arr_typeVariable[0].getName()}, new m[]{m0}, null);
    }

    public static p h(Class class0, m[] arr_m) {
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        if(arr_typeVariable != null && arr_typeVariable.length != 0) {
            if(arr_m == null) {
                arr_m = p.g;
            }
            String[] arr_s = new String[arr_typeVariable.length];
            for(int v = 0; v < arr_typeVariable.length; ++v) {
                arr_s[v] = arr_typeVariable[v].getName();
            }
            if(arr_typeVariable.length != arr_m.length) {
                throw new IllegalArgumentException("Cannot create TypeBindings for class " + class0.getName() + " with " + arr_m.length + " type parameter" + (arr_m.length == 1 ? "" : "s") + ": class expects " + arr_typeVariable.length);
            }
            return new p(arr_s, arr_m, null);
        }
        return p.h;
    }

    @Override
    public int hashCode() {
        return this.d;
    }

    public static p i() {
        return p.h;
    }

    public m j(String s) {
        for(int v = 0; v < this.a.length; ++v) {
            if(s.equals(this.a[v])) {
                m m0 = this.b[v];
                if(m0 instanceof com.fasterxml.jackson.databind.type.m) {
                    m m1 = ((com.fasterxml.jackson.databind.type.m)m0).r0();
                    return m1 == null ? m0 : m1;
                }
                return m0;
            }
        }
        return null;
    }

    public String k(int v) {
        if(v >= 0) {
            return v >= this.a.length ? null : this.a[v];
        }
        return null;
    }

    public m l(int v) {
        if(v >= 0) {
            return v >= this.b.length ? null : this.b[v];
        }
        return null;
    }

    public List m() {
        return this.b.length == 0 ? Collections.emptyList() : Arrays.asList(this.b);
    }

    public boolean n(String s) {
        String[] arr_s = this.c;
        if(arr_s != null) {
            int v = arr_s.length;
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                if(s.equals(this.c[v])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean o() {
        m[] arr_m = this.b;
        for(int v = 0; v < arr_m.length; ++v) {
            if(arr_m[v] instanceof f) {
                return true;
            }
        }
        return false;
    }

    public boolean p() {
        return this.b.length == 0;
    }

    protected Object q() {
        return this.a == null || this.a.length == 0 ? p.h : this;
    }

    public int r() {
        return this.b.length;
    }

    protected m[] s() {
        return this.b;
    }

    @Override
    public String toString() {
        if(this.b.length == 0) {
            return "<>";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('<');
        for(int v = 0; v < this.b.length; ++v) {
            if(v > 0) {
                stringBuilder0.append(',');
            }
            stringBuilder0.append(this.b[v].K());
        }
        stringBuilder0.append('>');
        return stringBuilder0.toString();
    }

    public p u(String s) {
        int v = this.c == null ? 0 : this.c.length;
        String[] arr_s = v == 0 ? new String[1] : ((String[])Arrays.copyOf(this.c, v + 1));
        arr_s[v] = s;
        return new p(this.a, this.b, arr_s);
    }

    public p w(String s) {
        int v = Arrays.asList(this.a).indexOf(s);
        if(v == -1) {
            return this;
        }
        String[] arr_s = (String[])Arrays.copyOf(this.a, this.a.length - 1);
        m[] arr_m = (m[])Arrays.copyOf(this.b, this.b.length - 1);
        if(v != arr_s.length) {
            System.arraycopy(this.a, v + 1, arr_s, v, arr_s.length - v);
            System.arraycopy(this.b, v + 1, arr_m, v, arr_m.length - v);
        }
        return new p(arr_s, arr_m, this.c);
    }
}

