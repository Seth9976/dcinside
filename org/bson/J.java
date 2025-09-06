package org.bson;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.bson.types.a;
import org.bson.types.b;
import org.bson.types.c;
import org.bson.types.e;
import org.bson.types.g;
import org.bson.types.h;

public class j implements d {
    private Object a;
    private final LinkedList b;
    private final LinkedList c;

    public j() {
        this.b = new LinkedList();
        this.c = new LinkedList();
        this.reset();
    }

    @Override  // org.bson.d
    public void A(String s, Decimal128 decimal1280) {
        this.C(s, decimal1280);
    }

    @Override  // org.bson.d
    public void B(String s, String s1) {
        this.C(s, s1);
    }

    protected void C(String s, Object object0) {
        this.G().c(s, object0);
    }

    public i D() {
        return new m();
    }

    // 去混淆评级： 低(20)
    public i E(boolean z, List list0) {
        return z ? this.F() : this.D();
    }

    protected i F() {
        return new b();
    }

    protected i G() {
        return (i)this.b.getLast();
    }

    protected String H() {
        return (String)this.c.peekLast();
    }

    protected boolean I() {
        return this.b.size() < 1;
    }

    protected void J(Object object0) {
        this.a = object0;
    }

    @Override  // org.bson.d
    public void a() {
        if(this.b.size() > 0) {
            throw new IllegalStateException("Illegal object beginning in current context.");
        }
        i i0 = this.E(false, null);
        this.a = i0;
        this.b.add(i0);
    }

    @Override  // org.bson.d
    public void b(String s) {
        this.c.addLast(s);
        i i0 = this.E(true, this.c);
        ((i)this.b.getLast()).c(s, i0);
        this.b.addLast(i0);
    }

    @Override  // org.bson.d
    public void c(String s) {
        this.c.addLast(s);
        i i0 = this.E(false, this.c);
        ((i)this.b.getLast()).c(s, i0);
        this.b.addLast(i0);
    }

    @Override  // org.bson.d
    public void d(String s, String s1) {
        this.C(s, s1);
    }

    @Override  // org.bson.d
    public void e(String s) {
    }

    @Override  // org.bson.d
    public void f(String s, double f) {
        this.C(s, f);
    }

    @Override  // org.bson.d
    public void g(String s, byte b, byte[] arr_b) {
        if(b != 0 && b != 2) {
            this.C(s, new c(b, arr_b));
            return;
        }
        this.C(s, arr_b);
    }

    @Override  // org.bson.d
    public Object get() {
        return this.a;
    }

    @Override  // org.bson.d
    public void h(String s, String s1, String s2) {
        this.C(s, Pattern.compile(s1, org.bson.c.o(s2)));
    }

    @Override  // org.bson.d
    public void i(String s, boolean z) {
        this.C(s, Boolean.valueOf(z));
    }

    @Override  // org.bson.d
    public void j(String s, int v, int v1) {
        this.C(s, new a(v, v1));
    }

    @Override  // org.bson.d
    public void k(String s) {
        this.G().c(s, null);
    }

    @Override  // org.bson.d
    public void l(String s) {
        this.G().c(s, new h());
    }

    @Override  // org.bson.d
    public void m(String s, long v) {
        this.C(s, new Date(v));
    }

    @Override  // org.bson.d
    public void n(String s, String s1, Object object0) {
        this.C(s, new e(s1, ((i)object0)));
    }

    @Override  // org.bson.d
    public void o(String s, ObjectId objectId0) {
        this.C(s, objectId0);
    }

    @Override  // org.bson.d
    public Object p() {
        i i0 = (i)this.b.removeLast();
        if(this.c.size() > 0) {
            this.c.removeLast();
            return i0;
        }
        if(this.b.size() > 0) {
            throw new IllegalStateException("Illegal object end in current context.");
        }
        return i0;
    }

    @Override  // org.bson.d
    public void q(String s, long v) {
        this.C(s, v);
    }

    @Override  // org.bson.d
    public void r(String s, String s1, ObjectId objectId0) {
        this.C(s, new m("$ns", s1).e("$id", objectId0));
    }

    @Override  // org.bson.d
    public void reset() {
        this.a = null;
        this.b.clear();
        this.c.clear();
    }

    @Override  // org.bson.d
    public void s(String s) {
        this.G().c(s, new g());
    }

    @Override  // org.bson.d
    public void t(String s, String s1) {
        this.C(s, new org.bson.types.d(s1));
    }

    @Override  // org.bson.d
    @Deprecated
    public void u(String s, byte[] arr_b) {
        this.g(s, 0, arr_b);
    }

    @Override  // org.bson.d
    public void v(String s, long v, long v1) {
        this.C(s, new UUID(v, v1));
    }

    @Override  // org.bson.d
    public d w() {
        return new j();
    }

    @Override  // org.bson.d
    public void x() {
        i i0 = this.E(true, null);
        this.a = i0;
        this.b.add(i0);
    }

    @Override  // org.bson.d
    public void y(String s, int v) {
        this.C(s, v);
    }

    @Override  // org.bson.d
    public Object z() {
        return this.p();
    }
}

