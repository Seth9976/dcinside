package org.bson;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Map.Entry;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.bson.types.a;
import org.bson.types.d;
import org.bson.types.e;
import org.bson.types.h;
import org.bson.types.j;

public class l implements g {
    private r a;
    private org.bson.io.g b;

    protected boolean A(String s, Object object0) [...] // Inlined contents

    protected void B(String s, String s1) {
        this.u(s);
        this.a.d(s1);
    }

    protected void C(String s, j j0) {
        this.u(s);
        this.a.Y0(j0.a());
    }

    protected void D(String s, a a0) {
        this.u(s);
        this.a.x(new W(a0.c(), a0.b()));
    }

    protected void E(String s, UUID uUID0) {
        this.u(s);
        byte[] arr_b = new byte[16];
        l.G(arr_b, 0, uUID0.getMostSignificantBits());
        l.G(arr_b, 8, uUID0.getLeastSignificantBits());
        this.a.T0(new o(q.e, arr_b));
    }

    protected void F(String s) {
        this.u(s);
        this.a.x0();
    }

    private static void G(byte[] arr_b, int v, long v1) {
        arr_b[v] = (byte)(((int)(v1 & 0xFFL)));
        arr_b[v + 1] = (byte)(((int)(v1 >> 8 & 0xFFL)));
        arr_b[v + 2] = (byte)(((int)(v1 >> 16 & 0xFFL)));
        arr_b[v + 3] = (byte)(((int)(v1 >> 24 & 0xFFL)));
        arr_b[v + 4] = (byte)(((int)(v1 >> 0x20 & 0xFFL)));
        arr_b[v + 5] = (byte)(((int)(v1 >> 40 & 0xFFL)));
        arr_b[v + 6] = (byte)(((int)(v1 >> 0x30 & 0xFFL)));
        arr_b[v + 7] = (byte)(((int)(v1 >> 56 & 0xFFL)));
    }

    @Override  // org.bson.g
    public void a(org.bson.io.g g0) {
        if(this.a != null) {
            throw new IllegalStateException("Performing another operation at this moment");
        }
        this.b = g0;
        this.a = new r(g0);
    }

    @Override  // org.bson.g
    public int b(i i0) {
        int v = this.g().getPosition();
        this.a.e0();
        if(this.h() && i0.a("_id")) {
            this.e("_id", i0.get("_id"));
        }
        for(Object object0: i0.keySet()) {
            String s = (String)object0;
            if(!this.h() || !s.equals("_id")) {
                this.e(s, i0.get(s));
            }
        }
        this.a.J1();
        return this.g().getPosition() - v;
    }

    @Override  // org.bson.g
    public void c() {
        this.a.close();
        this.a = null;
    }

    @Override  // org.bson.g
    public byte[] d(i i0) {
        org.bson.io.a a0 = new org.bson.io.a();
        this.a(a0);
        this.b(i0);
        this.c();
        return a0.c();
    }

    protected void e(String s, Object object0) {
        if("_transientFields".equals(s)) {
            return;
        }
        if(s.contains("\u0000")) {
            throw new IllegalArgumentException("Document field names can\'t have a NULL character. (Bad Key: \'" + s + "\')");
        }
        if("$where".equals(s) && object0 instanceof String) {
            this.m(s, new d(((String)object0)));
        }
        Object object1 = c.d(object0);
        if(object1 == null) {
            this.v(s);
            return;
        }
        if(object1 instanceof Date) {
            this.o(s, ((Date)object1));
            return;
        }
        if(object1 instanceof Decimal128) {
            this.p(s, ((Decimal128)object1));
            return;
        }
        if(object1 instanceof Number) {
            this.w(s, ((Number)object1));
            return;
        }
        if(object1 instanceof Character) {
            this.B(s, object1.toString());
            return;
        }
        if(object1 instanceof String) {
            this.B(s, object1.toString());
            return;
        }
        if(object1 instanceof ObjectId) {
            this.y(s, ((ObjectId)object1));
            return;
        }
        if(object1 instanceof Boolean) {
            this.l(s, ((Boolean)object1));
            return;
        }
        if(object1 instanceof Pattern) {
            this.z(s, ((Pattern)object1));
            return;
        }
        if(object1 instanceof Iterable) {
            this.q(s, ((Iterable)object1));
            return;
        }
        if(object1 instanceof i) {
            this.x(s, ((i)object1));
            return;
        }
        if(object1 instanceof Map) {
            this.r(s, ((Map)object1));
            return;
        }
        if(object1 instanceof byte[]) {
            this.k(s, ((byte[])object1));
            return;
        }
        if(object1 instanceof org.bson.types.c) {
            this.j(s, ((org.bson.types.c)object1));
            return;
        }
        if(object1 instanceof UUID) {
            this.E(s, ((UUID)object1));
            return;
        }
        if(object1.getClass().isArray()) {
            this.i(s, object1);
            return;
        }
        if(object1 instanceof j) {
            this.C(s, ((j)object1));
            return;
        }
        if(object1 instanceof a) {
            this.D(s, ((a)object1));
            return;
        }
        if(object1 instanceof e) {
            this.n(s, ((e)object1));
            return;
        }
        if(object1 instanceof d) {
            this.m(s, ((d)object1));
            return;
        }
        if(object1 instanceof h) {
            this.t(s);
            return;
        }
        if(!(object1 instanceof org.bson.types.g)) {
            throw new IllegalArgumentException("Can\'t serialize " + object1.getClass());
        }
        this.s(s);
    }

    protected r f() {
        return this.a;
    }

    protected org.bson.io.g g() {
        return this.b;
    }

    private boolean h() {
        return this.a.p4().i() == null;
    }

    protected void i(String s, Object object0) {
        this.u(s);
        this.a.o();
        int v = 0;
        if(object0 instanceof int[]) {
            while(v < ((int[])object0).length) {
                this.a.h(((int[])object0)[v]);
                ++v;
            }
        }
        else if(object0 instanceof long[]) {
            while(v < ((long[])object0).length) {
                this.a.r(((long[])object0)[v]);
                ++v;
            }
        }
        else if(object0 instanceof float[]) {
            while(v < ((float[])object0).length) {
                this.a.writeDouble(((double)((float[])object0)[v]));
                ++v;
            }
        }
        else if(object0 instanceof short[]) {
            while(v < ((short[])object0).length) {
                this.a.h(((int)((short[])object0)[v]));
                ++v;
            }
        }
        else if(object0 instanceof byte[]) {
            while(v < ((byte[])object0).length) {
                this.a.h(((int)((byte[])object0)[v]));
                ++v;
            }
        }
        else if(object0 instanceof double[]) {
            while(v < ((double[])object0).length) {
                this.a.writeDouble(((double[])object0)[v]);
                ++v;
            }
        }
        else if(object0 instanceof boolean[]) {
            while(v < ((boolean[])object0).length) {
                this.a.writeBoolean(((boolean[])object0)[v]);
                ++v;
            }
        }
        else if(object0 instanceof String[]) {
            while(v < ((String[])object0).length) {
                this.a.d(((String[])object0)[v]);
                ++v;
            }
        }
        else {
            int v1 = Array.getLength(object0);
            while(v < v1) {
                this.e(String.valueOf(v), Array.get(object0, v));
                ++v;
            }
        }
        this.a.q();
    }

    protected void j(String s, org.bson.types.c c0) {
        this.u(s);
        this.a.T0(new o(c0.b(), c0.a()));
    }

    protected void k(String s, byte[] arr_b) {
        this.u(s);
        this.a.T0(new o(arr_b));
    }

    protected void l(String s, Boolean boolean0) {
        this.u(s);
        this.a.writeBoolean(boolean0.booleanValue());
    }

    protected void m(String s, d d0) {
        this.u(s);
        this.a.L(d0.a());
    }

    protected void n(String s, e e0) {
        this.u(s);
        this.a.u0(e0.a());
        this.b(e0.b());
    }

    protected void o(String s, Date date0) {
        this.u(s);
        this.a.f0(date0.getTime());
    }

    protected void p(String s, Decimal128 decimal1280) {
        this.u(s);
        this.a.E0(decimal1280);
    }

    protected void q(String s, Iterable iterable0) {
        this.u(s);
        this.a.o();
        for(Object object0: iterable0) {
            this.e("0", object0);
        }
        this.a.q();
    }

    protected void r(String s, Map map0) {
        this.u(s);
        this.a.e0();
        for(Object object0: map0.entrySet()) {
            this.e(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        this.a.J1();
    }

    protected void s(String s) {
        this.u(s);
        this.a.d1();
    }

    protected void t(String s) {
        this.u(s);
        this.a.t1();
    }

    protected void u(String s) {
        if(this.a.N3() == org.bson.b.d.b) {
            this.a.k(s);
        }
    }

    protected void v(String s) {
        this.u(s);
        this.a.i();
    }

    protected void w(String s, Number number0) {
        this.u(s);
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte) && !(number0 instanceof AtomicInteger)) {
            if(!(number0 instanceof Long) && !(number0 instanceof AtomicLong)) {
                if(!(number0 instanceof Float) && !(number0 instanceof Double)) {
                    throw new IllegalArgumentException("Can\'t serialize " + number0.getClass());
                }
                this.a.writeDouble(number0.doubleValue());
                return;
            }
            this.a.r(number0.longValue());
            return;
        }
        this.a.h(number0.intValue());
    }

    protected int x(String s, i i0) {
        this.u(s);
        return this.b(i0);
    }

    protected void y(String s, ObjectId objectId0) {
        this.u(s);
        this.a.l(objectId0);
    }

    protected void z(String s, Pattern pattern0) {
        this.u(s);
        this.a.h1(new S(pattern0.pattern(), c.p(pattern0.flags())));
    }
}

