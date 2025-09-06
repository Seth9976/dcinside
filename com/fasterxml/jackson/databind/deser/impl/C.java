package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.q;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;

public class c implements Serializable, Iterable {
    protected final boolean a;
    private int b;
    private int c;
    private int d;
    private Object[] e;
    private final y[] f;
    private final Map g;
    private final Map h;
    private final Locale i;
    private static final long j = 2L;

    private c(c c0, y y0, int v, int v1) {
        this.a = c0.a;
        this.i = c0.i;
        this.b = c0.b;
        this.c = c0.c;
        this.d = c0.d;
        this.g = c0.g;
        this.h = c0.h;
        this.e = Arrays.copyOf(c0.e, c0.e.length);
        y[] arr_y = (y[])Arrays.copyOf(c0.f, c0.f.length);
        this.f = arr_y;
        this.e[v] = y0;
        arr_y[v1] = y0;
    }

    private c(c c0, y y0, String s, int v) {
        this.a = c0.a;
        this.i = c0.i;
        this.b = c0.b;
        this.c = c0.c;
        this.d = c0.d;
        this.g = c0.g;
        this.h = c0.h;
        this.e = Arrays.copyOf(c0.e, c0.e.length);
        y[] arr_y = (y[])Arrays.copyOf(c0.f, c0.f.length + 1);
        this.f = arr_y;
        arr_y[c0.f.length] = y0;
        int v1 = this.b + 1;
        int v2 = v << 1;
        Object[] arr_object = this.e;
        if(arr_object[v2] != null) {
            v2 = (v >> 1) + v1 << 1;
            if(arr_object[v2] != null) {
                v2 = (v1 + (v1 >> 1) << 1) + this.d;
                this.d += 2;
                if(v2 >= arr_object.length) {
                    this.e = Arrays.copyOf(arr_object, arr_object.length + 4);
                }
            }
        }
        Object[] arr_object1 = this.e;
        arr_object1[v2] = s;
        arr_object1[v2 + 1] = y0;
    }

    protected c(c c0, boolean z) {
        this.a = z;
        this.i = c0.i;
        this.g = c0.g;
        this.h = c0.h;
        y[] arr_y = (y[])Arrays.copyOf(c0.f, c0.f.length);
        this.f = arr_y;
        this.z(Arrays.asList(arr_y));
    }

    @Deprecated
    public c(boolean z, Collection collection0, Map map0) {
        this(z, collection0, map0, Locale.getDefault());
    }

    public c(boolean z, Collection collection0, Map map0, Locale locale0) {
        this.a = z;
        this.f = (y[])collection0.toArray(new y[collection0.size()]);
        this.g = map0;
        this.i = locale0;
        this.h = this.a(map0, z, locale0);
        this.z(collection0);
    }

    public boolean A() {
        return this.a;
    }

    public void B(y y0) {
        ArrayList arrayList0 = new ArrayList(this.c);
        String s = this.x(y0);
        boolean z = false;
        for(int v = 1; v < this.e.length; v += 2) {
            Object[] arr_object = this.e;
            y y1 = (y)arr_object[v];
            if(y1 != null) {
                if(!z) {
                    z = s.equals(arr_object[v - 1]);
                    if(z) {
                        this.f[this.d(y1)] = null;
                        continue;
                    }
                }
                arrayList0.add(y1);
            }
        }
        if(!z) {
            throw new NoSuchElementException("No entry \'" + y0.getName() + "\' found, can\'t remove");
        }
        this.z(arrayList0);
    }

    public c C(x x0) {
        if(x0 != null && x0 != x.a) {
            ArrayList arrayList0 = new ArrayList(this.f.length);
            for(int v = 0; v < this.f.length; ++v) {
                y y0 = this.f[v];
                if(y0 == null) {
                    arrayList0.add(null);
                }
                else {
                    arrayList0.add(this.j(y0, x0));
                }
            }
            return new c(this.a, arrayList0, this.g, this.i);
        }
        return this;
    }

    public void D(y y0, y y1) {
        for(int v = 1; v < this.e.length; v += 2) {
            Object[] arr_object = this.e;
            if(arr_object[v] == y0) {
                arr_object[v] = y1;
                this.f[this.d(y0)] = y1;
                return;
            }
        }
        throw new NoSuchElementException("No entry \'" + y0.getName() + "\' found, can\'t replace");
    }

    public c E(boolean z) {
        return this.a == z ? this : new c(this, z);
    }

    public c F(y y0) {
        String s = this.x(y0);
        for(int v = 1; v < this.e.length; v += 2) {
            y y1 = (y)this.e[v];
            if(y1 != null && y1.getName().equals(s)) {
                return new c(this, y0, v, this.d(y1));
            }
        }
        return new c(this, y0, s, this.h(s));
    }

    public c G(Collection collection0) {
        return this.H(collection0, null);
    }

    public c H(Collection collection0, Collection collection1) {
        if((collection0 == null || collection0.isEmpty()) && collection1 == null) {
            return this;
        }
        ArrayList arrayList0 = new ArrayList(this.f.length);
        for(int v = 0; v < this.f.length; ++v) {
            y y0 = this.f[v];
            if(y0 != null && !q.c(y0.getName(), collection0, collection1)) {
                arrayList0.add(y0);
            }
        }
        return new c(this.a, arrayList0, this.g, this.i);
    }

    protected void I(Throwable throwable0, Object object0, String s, h h0) throws IOException {
        while(throwable0 instanceof InvocationTargetException && throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        com.fasterxml.jackson.databind.util.h.v0(throwable0);
        boolean z = h0 == null || h0.J0(i.r);
        if(throwable0 instanceof IOException) {
            if(!z || !(throwable0 instanceof f)) {
                throw (IOException)throwable0;
            }
        }
        else if(!z) {
            com.fasterxml.jackson.databind.util.h.x0(throwable0);
        }
        throw o.D(throwable0, object0, s);
    }

    private Map a(Map map0, boolean z, Locale locale0) {
        if(map0 != null && !map0.isEmpty()) {
            Map map1 = new HashMap();
            for(Object object0: map0.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                if(z) {
                    s = s.toLowerCase(locale0);
                }
                for(Object object1: ((List)((Map.Entry)object0).getValue())) {
                    String s1 = ((B)object1).d();
                    if(z) {
                        s1 = s1.toLowerCase(locale0);
                    }
                    map1.put(s1, s);
                }
            }
            return map1;
        }
        return Collections.emptyMap();
    }

    private final y b(String s, int v, Object object0) {
        if(object0 == null) {
            return this.g(((String)this.h.get(s)));
        }
        int v1 = this.b + 1;
        int v2 = (v >> 1) + v1 << 1;
        Object object1 = this.e[v2];
        if(s.equals(object1)) {
            return (y)this.e[v2 + 1];
        }
        if(object1 != null) {
            int v3 = v1 + (v1 >> 1) << 1;
            int v4 = this.d + v3;
            while(v3 < v4) {
                Object object2 = this.e[v3];
                if(object2 != s && !s.equals(object2)) {
                    v3 += 2;
                    continue;
                }
                return (y)this.e[v3 + 1];
            }
        }
        return this.g(((String)this.h.get(s)));
    }

    private y c(String s, int v, Object object0) {
        int v1 = this.b + 1;
        int v2 = (v >> 1) + v1 << 1;
        Object object1 = this.e[v2];
        if(s.equals(object1)) {
            return (y)this.e[v2 + 1];
        }
        if(object1 != null) {
            int v3 = v1 + (v1 >> 1) << 1;
            int v4 = this.d + v3;
            while(v3 < v4) {
                Object object2 = this.e[v3];
                if(object2 != s && !s.equals(object2)) {
                    v3 += 2;
                    continue;
                }
                return (y)this.e[v3 + 1];
            }
        }
        return null;
    }

    private final int d(y y0) {
        for(int v = 0; v < this.f.length; ++v) {
            if(this.f[v] == y0) {
                return v;
            }
        }
        throw new IllegalStateException("Illegal state: property \'" + y0.getName() + "\' missing from _propsInOrder");
    }

    private y g(String s) {
        if(s == null) {
            return null;
        }
        int v = this.h(s);
        Object object0 = this.e[v << 1];
        if(s.equals(object0)) {
            return (y)this.e[(v << 1) + 1];
        }
        return object0 == null ? null : this.c(s, v, object0);
    }

    private final int h(String s) {
        return s.hashCode() & this.b;
    }

    private List i() {
        List list0 = new ArrayList(this.c);
        for(int v = 1; v < this.e.length; v += 2) {
            y y0 = (y)this.e[v];
            if(y0 != null) {
                ((ArrayList)list0).add(y0);
            }
        }
        return list0;
    }

    @Override
    public Iterator iterator() {
        return this.i().iterator();
    }

    protected y j(y y0, x x0) {
        if(y0 == null) {
            return null;
        }
        y y1 = y0.U(x0.d(y0.getName()));
        n n0 = y1.E();
        if(n0 != null) {
            n n1 = n0.z(x0);
            return n1 == n0 ? y1 : y1.V(n1);
        }
        return y1;
    }

    public c k() {
        int v = 0;
        for(int v1 = 1; v1 < this.e.length; v1 += 2) {
            y y0 = (y)this.e[v1];
            if(y0 != null) {
                y0.p(v);
                ++v;
            }
        }
        return this;
    }

    @Deprecated
    public static c l(t t0, Collection collection0, Map map0) {
        return new c(t0.a0(com.fasterxml.jackson.databind.t.y), collection0, map0, t0.N());
    }

    public static c m(t t0, Collection collection0, Map map0, boolean z) {
        return new c(z, collection0, map0, t0.N());
    }

    @Deprecated
    public static c n(Collection collection0, boolean z, Map map0) {
        return new c(z, collection0, map0);
    }

    public y o(int v) {
        for(int v1 = 1; v1 < this.e.length; v1 += 2) {
            y y0 = (y)this.e[v1];
            if(y0 != null && v == y0.D()) {
                return y0;
            }
        }
        return null;
    }

    public y p(String s) {
        if(s == null) {
            throw new IllegalArgumentException("Cannot pass null property name");
        }
        if(this.a) {
            s = s.toLowerCase(this.i);
        }
        int v = s.hashCode() & this.b;
        Object object0 = this.e[v << 1];
        return object0 == s || s.equals(object0) ? ((y)this.e[(v << 1) + 1]) : this.b(s, v, object0);
    }

    public boolean q(com.fasterxml.jackson.core.n n0, h h0, Object object0, String s) throws IOException {
        y y0 = this.p(s);
        if(y0 == null) {
            return false;
        }
        try {
            y0.r(n0, h0, object0);
        }
        catch(Exception exception0) {
            this.I(exception0, object0, s, h0);
        }
        return true;
    }

    private static final int r(int v) {
        if(v <= 5) {
            return 8;
        }
        if(v <= 12) {
            return 16;
        }
        int v1;
        for(v1 = 0x20; v1 < v + (v >> 2); v1 += v1) {
        }
        return v1;
    }

    public int size() {
        return this.c;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Properties=[");
        int v = 0;
        for(Object object0: this) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((y)object0).getName());
            stringBuilder0.append('(');
            stringBuilder0.append(((y)object0).getType());
            stringBuilder0.append(')');
            ++v;
        }
        stringBuilder0.append(']');
        if(!this.g.isEmpty()) {
            stringBuilder0.append("(aliases: ");
            stringBuilder0.append(this.g);
            stringBuilder0.append(")");
        }
        return stringBuilder0.toString();
    }

    public y[] u() {
        return this.f;
    }

    protected final String x(y y0) {
        String s = y0.getName();
        return this.a ? s.toLowerCase(this.i) : s;
    }

    public boolean y() {
        return !this.g.isEmpty();
    }

    protected void z(Collection collection0) {
        int v = collection0.size();
        this.c = v;
        int v1 = c.r(v);
        this.b = v1 - 1;
        int v2 = (v1 >> 1) + v1;
        Object[] arr_object = new Object[v2 * 2];
        int v3 = 0;
        for(Object object0: collection0) {
            y y0 = (y)object0;
            if(y0 != null) {
                String s = this.x(y0);
                int v4 = this.h(s);
                int v5 = v4 << 1;
                if(arr_object[v5] != null) {
                    int v6 = (v4 >> 1) + v1 << 1;
                    if(arr_object[v6] == null) {
                        v5 = v6;
                    }
                    else {
                        v5 = (v2 << 1) + v3;
                        v3 += 2;
                        if(v5 >= arr_object.length) {
                            arr_object = Arrays.copyOf(arr_object, arr_object.length + 4);
                        }
                    }
                }
                arr_object[v5] = s;
                arr_object[v5 + 1] = y0;
            }
        }
        this.e = arr_object;
        this.d = v3;
    }
}

