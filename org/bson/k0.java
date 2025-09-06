package org.bson;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.bson.codecs.T;
import org.bson.codecs.t0;
import org.bson.io.f;
import org.bson.types.c;
import org.bson.types.d;
import org.bson.types.e;
import org.bson.types.g;
import org.bson.types.h;
import org.bson.types.j;

public class k0 implements i {
    static class b {
        static final int[] a;

        static {
            int[] arr_v = new int[X.values().length];
            b.a = arr_v;
            try {
                arr_v[X.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.g.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.l.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.h.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.i.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.j.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.k.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.m.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.n.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.o.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.p.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.q.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.r.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.s.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.t.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.u.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.v.ordinal()] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[X.w.ordinal()] = 21;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final byte[] a;
    private final int b;
    private final h0 c;

    public k0(byte[] arr_b, int v, h0 h00) {
        this.a = arr_b;
        this.c = h00;
        this.b = v;
    }

    public k0(byte[] arr_b, h0 h00) {
        this(arr_b, 0, h00);
    }

    @Override  // org.bson.i
    public boolean a(String s) {
        try(p p0 = this.j()) {
            p0.g0();
            while(true) {
                if(p0.T2() == X.b) {
                    break;
                }
                if(!p0.n0().equals(s)) {
                    p0.Y1();
                    continue;
                }
                return true;
            }
            return false;
        }
    }

    @Override  // org.bson.i
    public void b(i i0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override  // org.bson.i
    public Object c(String s, Object object0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override  // org.bson.i
    public Map d() {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: this.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap0);
    }

    public Set entrySet() {
        class a implements Set {
            final List a;
            final k0 b;

            a(List list0) {
                this.a = list0;
                super();
            }

            public boolean a(Map.Entry map$Entry0) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean add(Object object0) {
                return this.a(((Map.Entry)object0));
            }

            @Override
            public boolean addAll(Collection collection0) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean contains(Object object0) {
                return this.a.contains(object0);
            }

            @Override
            public boolean containsAll(Collection collection0) {
                return this.a.containsAll(collection0);
            }

            @Override
            public boolean isEmpty() {
                return this.a.isEmpty();
            }

            @Override
            public Iterator iterator() {
                return this.a.iterator();
            }

            @Override
            public boolean remove(Object object0) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean removeAll(Collection collection0) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean retainAll(Collection collection0) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int size() {
                return this.a.size();
            }

            @Override
            public Object[] toArray() {
                return this.a.toArray();
            }

            @Override
            public Object[] toArray(Object[] arr_object) {
                return this.a.toArray(arr_object);
            }
        }

        ArrayList arrayList0 = new ArrayList();
        try(p p0 = this.j()) {
            p0.g0();
            while(true) {
                if(p0.T2() == X.b) {
                    break;
                }
                arrayList0.add(new AbstractMap.SimpleImmutableEntry(p0.n0(), this.r(p0)));
            }
            p0.E1();
            return new a(this, arrayList0);
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            byte[] arr_b = this.a;
            byte[] arr_b1 = ((k0)object0).a;
            if(arr_b == arr_b1 && this.b == ((k0)object0).b) {
                return true;
            }
            if(arr_b != null && arr_b1 != null && arr_b.length != 0 && arr_b1.length != 0) {
                int v = arr_b[this.b];
                if(arr_b1[((k0)object0).b] != v) {
                    return false;
                }
                for(int v1 = 0; v1 < v; ++v1) {
                    if(this.a[this.b + v1] != ((k0)object0).a[((k0)object0).b + v1]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override  // org.bson.i
    @Deprecated
    public boolean g(String s) {
        return this.a(s);
    }

    @Override  // org.bson.i
    public Object get(String s) {
        try(p p0 = this.j()) {
            p0.g0();
            while(true) {
                if(p0.T2() == X.b) {
                    break;
                }
                if(s.equals(p0.n0())) {
                    return this.r(p0);
                }
                p0.Y1();
            }
        }
        return null;
    }

    @Override  // org.bson.i
    public Object h(String s) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public int hashCode() {
        int v = this.i();
        int v1 = this.b;
        int v2 = 1;
        while(v1 < this.b + v) {
            v2 = v2 * 0x1F + this.a[v1];
            ++v1;
        }
        return v2;
    }

    public int i() {
        return this.k().getInt();
    }

    public boolean isEmpty() {
        return this.keySet().size() == 0;
    }

    p j() {
        return new p(new f(new d0(this.k())));
    }

    private ByteBuffer k() {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.a, this.b, this.a.length - this.b).slice();
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer0.limit(byteBuffer0.getInt());
        byteBuffer0.rewind();
        return byteBuffer0;
    }

    @Override  // org.bson.i
    public Set keySet() {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        try(p p0 = this.j()) {
            p0.g0();
            while(true) {
                if(p0.T2() == X.b) {
                    break;
                }
                linkedHashSet0.add(p0.n0());
                p0.Y1();
            }
            p0.E1();
            return DesugarCollections.unmodifiableSet(linkedHashSet0);
        }
    }

    protected byte[] l() {
        return this.a;
    }

    protected int m() {
        return this.b;
    }

    public int n(OutputStream outputStream0) throws IOException {
        return Channels.newChannel(outputStream0).write(this.k());
    }

    private Object o(p p0) {
        int v = p0.g2().getPosition();
        p0.Y1();
        return this.c.C(this.a, this.b + v);
    }

    private Object p(p p0) {
        int v = p0.g2().getPosition();
        p0.Y1();
        return this.c.E(this.a, this.b + v);
    }

    @Override  // org.bson.i
    public void putAll(Map map0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    private Object q(p p0) {
        int v = p0.g2().getPosition();
        p0.g0();
        while(p0.T2() != X.b) {
            p0.g1();
            p0.Y1();
        }
        p0.E1();
        return this.c.E(this.a, this.b + v);
    }

    Object r(p p0) {
        switch(p0.z0()) {
            case 1: {
                return this.p(p0);
            }
            case 2: {
                return this.o(p0);
            }
            case 3: {
                return p0.readDouble();
            }
            case 4: {
                return p0.readString();
            }
            case 5: {
                int v = p0.G3();
                if(q.b(((byte)v)) && p0.a3() == 16) {
                    return new t0(r0.d).h(p0, T.a().a());
                }
                o o0 = p0.B0();
                return v != q.b.a() && v != q.d.a() ? new c(o0.o0(), o0.n0()) : o0.n0();
            }
            case 6: {
                p0.o0();
                return null;
            }
            case 7: {
                p0.G1();
                return null;
            }
            case 8: {
                return p0.H();
            }
            case 9: {
                return Boolean.valueOf(p0.readBoolean());
            }
            case 10: {
                return new Date(p0.m3());
            }
            case 11: {
                S s0 = p0.m0();
                return Pattern.compile(s0.k0(), org.bson.c.o(s0.j0()));
            }
            case 12: {
                w w0 = p0.M();
                return this.c.D(w0.k0(), w0.j0());
            }
            case 13: {
                return new d(p0.C1());
            }
            case 14: {
                return new j(p0.c2());
            }
            case 15: {
                return new e(p0.y2(), ((i)this.q(p0)));
            }
            case 16: {
                return p0.readInt32();
            }
            case 17: {
                W w1 = p0.U0();
                return new org.bson.types.a(w1.m0(), w1.k0());
            }
            case 18: {
                return p0.readInt64();
            }
            case 19: {
                return p0.U1();
            }
            case 20: {
                p0.V0();
                return new h();
            }
            case 21: {
                p0.s1();
                return new g();
            }
            default: {
                throw new IllegalArgumentException("unhandled BSON type: " + p0.z0());
            }
        }
    }
}

