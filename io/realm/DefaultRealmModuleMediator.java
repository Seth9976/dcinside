package io.realm;

import android.util.JsonReader;
import com.dcinside.app.dccon.setting.tag.a;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.A;
import com.dcinside.app.realm.B0;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.U;
import com.dcinside.app.realm.b0;
import com.dcinside.app.realm.b;
import com.dcinside.app.realm.c0;
import com.dcinside.app.realm.c;
import com.dcinside.app.realm.d0;
import com.dcinside.app.realm.d;
import com.dcinside.app.realm.e0;
import com.dcinside.app.realm.e;
import com.dcinside.app.realm.f0;
import com.dcinside.app.realm.f;
import com.dcinside.app.realm.g0;
import com.dcinside.app.realm.g;
import com.dcinside.app.realm.h0;
import com.dcinside.app.realm.h;
import com.dcinside.app.realm.j0;
import com.dcinside.app.realm.j;
import com.dcinside.app.realm.k0;
import com.dcinside.app.realm.k;
import com.dcinside.app.realm.l;
import com.dcinside.app.realm.m;
import com.dcinside.app.realm.n;
import com.dcinside.app.realm.o;
import com.dcinside.app.realm.q;
import com.dcinside.app.realm.r;
import com.dcinside.app.realm.s0;
import com.dcinside.app.realm.s;
import com.dcinside.app.realm.u0;
import com.dcinside.app.realm.v0;
import com.dcinside.app.realm.w0;
import com.dcinside.app.realm.x0;
import com.dcinside.app.realm.y0;
import com.dcinside.app.realm.y;
import com.dcinside.app.realm.z0;
import com.dcinside.app.realm.z;
import io.realm.annotations.RealmModule;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.t;
import io.realm.internal.u;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@RealmModule
class DefaultRealmModuleMediator extends t {
    private static final Set a;

    static {
        HashSet hashSet0 = new HashSet(45);
        hashSet0.add(B0.class);
        hashSet0.add(A0.class);
        hashSet0.add(z0.class);
        hashSet0.add(y0.class);
        hashSet0.add(x0.class);
        hashSet0.add(w0.class);
        hashSet0.add(v0.class);
        hashSet0.add(u0.class);
        hashSet0.add(s0.class);
        hashSet0.add(k0.class);
        hashSet0.add(j0.class);
        hashSet0.add(h0.class);
        hashSet0.add(g0.class);
        hashSet0.add(f0.class);
        hashSet0.add(e0.class);
        hashSet0.add(d0.class);
        hashSet0.add(c0.class);
        hashSet0.add(b0.class);
        hashSet0.add(U.class);
        hashSet0.add(B.class);
        hashSet0.add(A.class);
        hashSet0.add(z.class);
        hashSet0.add(y.class);
        hashSet0.add(com.dcinside.app.realm.t.class);
        hashSet0.add(s.class);
        hashSet0.add(r.class);
        hashSet0.add(q.class);
        hashSet0.add(o.class);
        hashSet0.add(n.class);
        hashSet0.add(m.class);
        hashSet0.add(l.class);
        hashSet0.add(k.class);
        hashSet0.add(j.class);
        hashSet0.add(h.class);
        hashSet0.add(g.class);
        hashSet0.add(f.class);
        hashSet0.add(e.class);
        hashSet0.add(d.class);
        hashSet0.add(c.class);
        hashSet0.add(b.class);
        hashSet0.add(com.dcinside.app.memo.q.class);
        hashSet0.add(com.dcinside.app.memo.n.class);
        hashSet0.add(com.dcinside.app.memo.m.class);
        hashSet0.add(com.dcinside.app.dccon.setting.tag.b.class);
        hashSet0.add(a.class);
        DefaultRealmModuleMediator.a = DesugarCollections.unmodifiableSet(hashSet0);
    }

    @Override  // io.realm.internal.t
    public X0 c(F0 f00, X0 x00, boolean z, Map map0, Set set0) {
        Class class0 = x00 instanceof io.realm.internal.s ? x00.getClass().getSuperclass() : x00.getClass();
        Class class1 = B0.class;
        if(class0.equals(class1)) {
            return (X0)class0.cast(m3.R5(f00, ((io.realm.m3.b)f00.e0().j(class1)), ((B0)x00), z, map0, set0));
        }
        Class class2 = A0.class;
        if(class0.equals(class2)) {
            return (X0)class0.cast(k3.l6(f00, ((io.realm.k3.b)f00.e0().j(class2)), ((A0)x00), z, map0, set0));
        }
        Class class3 = z0.class;
        if(class0.equals(class3)) {
            return (X0)class0.cast(i3.b6(f00, ((io.realm.i3.b)f00.e0().j(class3)), ((z0)x00), z, map0, set0));
        }
        Class class4 = y0.class;
        if(class0.equals(class4)) {
            return (X0)class0.cast(g3.Y5(f00, ((io.realm.g3.b)f00.e0().j(class4)), ((y0)x00), z, map0, set0));
        }
        Class class5 = x0.class;
        if(class0.equals(class5)) {
            return (X0)class0.cast(e3.b6(f00, ((io.realm.e3.b)f00.e0().j(class5)), ((x0)x00), z, map0, set0));
        }
        Class class6 = w0.class;
        if(class0.equals(class6)) {
            return (X0)class0.cast(c3.Z5(f00, ((io.realm.c3.b)f00.e0().j(class6)), ((w0)x00), z, map0, set0));
        }
        Class class7 = v0.class;
        if(class0.equals(class7)) {
            return (X0)class0.cast(a3.b6(f00, ((io.realm.a3.b)f00.e0().j(class7)), ((v0)x00), z, map0, set0));
        }
        Class class8 = u0.class;
        if(class0.equals(class8)) {
            return (X0)class0.cast(Y2.e6(f00, ((io.realm.Y2.b)f00.e0().j(class8)), ((u0)x00), z, map0, set0));
        }
        Class class9 = s0.class;
        if(class0.equals(class9)) {
            return (X0)class0.cast(W2.f6(f00, ((io.realm.W2.b)f00.e0().j(class9)), ((s0)x00), z, map0, set0));
        }
        Class class10 = k0.class;
        if(class0.equals(class10)) {
            return (X0)class0.cast(U2.t6(f00, ((io.realm.U2.b)f00.e0().j(class10)), ((k0)x00), z, map0, set0));
        }
        Class class11 = j0.class;
        if(class0.equals(class11)) {
            return (X0)class0.cast(S2.Z5(f00, ((io.realm.S2.b)f00.e0().j(class11)), ((j0)x00), z, map0, set0));
        }
        Class class12 = h0.class;
        if(class0.equals(class12)) {
            return (X0)class0.cast(O2.f6(f00, ((io.realm.O2.b)f00.e0().j(class12)), ((h0)x00), z, map0, set0));
        }
        Class class13 = g0.class;
        if(class0.equals(class13)) {
            return (X0)class0.cast(Q2.X5(f00, ((io.realm.Q2.b)f00.e0().j(class13)), ((g0)x00), z, map0, set0));
        }
        Class class14 = f0.class;
        if(class0.equals(class14)) {
            return (X0)class0.cast(M2.B6(f00, ((io.realm.M2.b)f00.e0().j(class14)), ((f0)x00), z, map0, set0));
        }
        Class class15 = e0.class;
        if(class0.equals(class15)) {
            return (X0)class0.cast(K2.b6(f00, ((io.realm.K2.b)f00.e0().j(class15)), ((e0)x00), z, map0, set0));
        }
        Class class16 = d0.class;
        if(class0.equals(class16)) {
            return (X0)class0.cast(I2.m6(f00, ((io.realm.I2.b)f00.e0().j(class16)), ((d0)x00), z, map0, set0));
        }
        Class class17 = c0.class;
        if(class0.equals(class17)) {
            return (X0)class0.cast(G2.e6(f00, ((io.realm.G2.b)f00.e0().j(class17)), ((c0)x00), z, map0, set0));
        }
        Class class18 = b0.class;
        if(class0.equals(class18)) {
            return (X0)class0.cast(E2.c6(f00, ((io.realm.E2.b)f00.e0().j(class18)), ((b0)x00), z, map0, set0));
        }
        Class class19 = U.class;
        if(class0.equals(class19)) {
            return (X0)class0.cast(C2.X5(f00, ((io.realm.C2.b)f00.e0().j(class19)), ((U)x00), z, map0, set0));
        }
        Class class20 = B.class;
        if(class0.equals(class20)) {
            return (X0)class0.cast(A2.n7(f00, ((io.realm.A2.b)f00.e0().j(class20)), ((B)x00), z, map0, set0));
        }
        Class class21 = A.class;
        if(class0.equals(class21)) {
            return (X0)class0.cast(y2.b6(f00, ((io.realm.y2.b)f00.e0().j(class21)), ((A)x00), z, map0, set0));
        }
        Class class22 = z.class;
        if(class0.equals(class22)) {
            return (X0)class0.cast(w2.k6(f00, ((io.realm.w2.b)f00.e0().j(class22)), ((z)x00), z, map0, set0));
        }
        if(class0.equals(y.class)) {
            return (X0)class0.cast(u2.a6(f00, ((io.realm.u2.b)f00.e0().j(y.class)), ((y)x00), z, map0, set0));
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            return (X0)class0.cast(s2.e6(f00, ((io.realm.s2.b)f00.e0().j(com.dcinside.app.realm.t.class)), ((com.dcinside.app.realm.t)x00), z, map0, set0));
        }
        if(class0.equals(s.class)) {
            return (X0)class0.cast(q2.R5(f00, ((io.realm.q2.b)f00.e0().j(s.class)), ((s)x00), z, map0, set0));
        }
        if(class0.equals(r.class)) {
            return (X0)class0.cast(o2.f6(f00, ((io.realm.o2.b)f00.e0().j(r.class)), ((r)x00), z, map0, set0));
        }
        if(class0.equals(q.class)) {
            return (X0)class0.cast(m2.n6(f00, ((io.realm.m2.b)f00.e0().j(q.class)), ((q)x00), z, map0, set0));
        }
        if(class0.equals(o.class)) {
            return (X0)class0.cast(k2.Z5(f00, ((io.realm.k2.b)f00.e0().j(o.class)), ((o)x00), z, map0, set0));
        }
        if(class0.equals(n.class)) {
            return (X0)class0.cast(i2.d6(f00, ((io.realm.i2.b)f00.e0().j(n.class)), ((n)x00), z, map0, set0));
        }
        if(class0.equals(m.class)) {
            return (X0)class0.cast(g2.Z5(f00, ((io.realm.g2.b)f00.e0().j(m.class)), ((m)x00), z, map0, set0));
        }
        if(class0.equals(l.class)) {
            return (X0)class0.cast(e2.e6(f00, ((io.realm.e2.b)f00.e0().j(l.class)), ((l)x00), z, map0, set0));
        }
        if(class0.equals(k.class)) {
            return (X0)class0.cast(c2.X5(f00, ((io.realm.c2.b)f00.e0().j(k.class)), ((k)x00), z, map0, set0));
        }
        if(class0.equals(j.class)) {
            return (X0)class0.cast(a2.h6(f00, ((io.realm.a2.a)f00.e0().j(j.class)), ((j)x00), z, map0, set0));
        }
        if(class0.equals(h.class)) {
            return (X0)class0.cast(W1.Z5(f00, ((io.realm.W1.a)f00.e0().j(h.class)), ((h)x00), z, map0, set0));
        }
        if(class0.equals(g.class)) {
            return (X0)class0.cast(S1.V5(f00, ((io.realm.S1.a)f00.e0().j(g.class)), ((g)x00), z, map0, set0));
        }
        if(class0.equals(f.class)) {
            return (X0)class0.cast(U1.b6(f00, ((io.realm.U1.a)f00.e0().j(f.class)), ((f)x00), z, map0, set0));
        }
        if(class0.equals(e.class)) {
            return (X0)class0.cast(Y1.i6(f00, ((io.realm.Y1.a)f00.e0().j(e.class)), ((e)x00), z, map0, set0));
        }
        if(class0.equals(d.class)) {
            return (X0)class0.cast(Q1.f6(f00, ((io.realm.Q1.a)f00.e0().j(d.class)), ((d)x00), z, map0, set0));
        }
        if(class0.equals(c.class)) {
            return (X0)class0.cast(O1.X5(f00, ((io.realm.O1.a)f00.e0().j(c.class)), ((c)x00), z, map0, set0));
        }
        if(class0.equals(b.class)) {
            return (X0)class0.cast(M1.j6(f00, ((io.realm.M1.a)f00.e0().j(b.class)), ((b)x00), z, map0, set0));
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            return (X0)class0.cast(I1.X5(f00, ((io.realm.I1.b)f00.e0().j(com.dcinside.app.memo.q.class)), ((com.dcinside.app.memo.q)x00), z, map0, set0));
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            return (X0)class0.cast(K1.V5(f00, ((io.realm.K1.b)f00.e0().j(com.dcinside.app.memo.n.class)), ((com.dcinside.app.memo.n)x00), z, map0, set0));
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            return (X0)class0.cast(G1.V5(f00, ((io.realm.G1.b)f00.e0().j(com.dcinside.app.memo.m.class)), ((com.dcinside.app.memo.m)x00), z, map0, set0));
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            return (X0)class0.cast(E1.Z5(f00, ((io.realm.E1.b)f00.e0().j(com.dcinside.app.dccon.setting.tag.b.class)), ((com.dcinside.app.dccon.setting.tag.b)x00), z, map0, set0));
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        return (X0)class0.cast(C1.V5(f00, ((io.realm.C1.b)f00.e0().j(a.class)), ((a)x00), z, map0, set0));
    }

    @Override  // io.realm.internal.t
    public io.realm.internal.c d(Class class0, OsSchemaInfo osSchemaInfo0) {
        t.a(class0);
        if(class0.equals(B0.class)) {
            return m3.S5(osSchemaInfo0);
        }
        if(class0.equals(A0.class)) {
            return k3.m6(osSchemaInfo0);
        }
        if(class0.equals(z0.class)) {
            return i3.c6(osSchemaInfo0);
        }
        if(class0.equals(y0.class)) {
            return g3.Z5(osSchemaInfo0);
        }
        if(class0.equals(x0.class)) {
            return e3.c6(osSchemaInfo0);
        }
        if(class0.equals(w0.class)) {
            return c3.a6(osSchemaInfo0);
        }
        if(class0.equals(v0.class)) {
            return a3.c6(osSchemaInfo0);
        }
        if(class0.equals(u0.class)) {
            return Y2.f6(osSchemaInfo0);
        }
        if(class0.equals(s0.class)) {
            return W2.g6(osSchemaInfo0);
        }
        if(class0.equals(k0.class)) {
            return U2.u6(osSchemaInfo0);
        }
        if(class0.equals(j0.class)) {
            return S2.a6(osSchemaInfo0);
        }
        if(class0.equals(h0.class)) {
            return O2.g6(osSchemaInfo0);
        }
        if(class0.equals(g0.class)) {
            return Q2.Y5(osSchemaInfo0);
        }
        if(class0.equals(f0.class)) {
            return M2.C6(osSchemaInfo0);
        }
        if(class0.equals(e0.class)) {
            return K2.c6(osSchemaInfo0);
        }
        if(class0.equals(d0.class)) {
            return I2.n6(osSchemaInfo0);
        }
        if(class0.equals(c0.class)) {
            return G2.f6(osSchemaInfo0);
        }
        if(class0.equals(b0.class)) {
            return E2.d6(osSchemaInfo0);
        }
        if(class0.equals(U.class)) {
            return C2.Y5(osSchemaInfo0);
        }
        if(class0.equals(B.class)) {
            return A2.o7(osSchemaInfo0);
        }
        if(class0.equals(A.class)) {
            return y2.c6(osSchemaInfo0);
        }
        if(class0.equals(z.class)) {
            return w2.l6(osSchemaInfo0);
        }
        if(class0.equals(y.class)) {
            return u2.b6(osSchemaInfo0);
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            return s2.f6(osSchemaInfo0);
        }
        if(class0.equals(s.class)) {
            return q2.S5(osSchemaInfo0);
        }
        if(class0.equals(r.class)) {
            return o2.g6(osSchemaInfo0);
        }
        if(class0.equals(q.class)) {
            return m2.o6(osSchemaInfo0);
        }
        if(class0.equals(o.class)) {
            return k2.a6(osSchemaInfo0);
        }
        if(class0.equals(n.class)) {
            return i2.e6(osSchemaInfo0);
        }
        if(class0.equals(m.class)) {
            return g2.a6(osSchemaInfo0);
        }
        if(class0.equals(l.class)) {
            return e2.f6(osSchemaInfo0);
        }
        if(class0.equals(k.class)) {
            return c2.Y5(osSchemaInfo0);
        }
        if(class0.equals(j.class)) {
            return a2.i6(osSchemaInfo0);
        }
        if(class0.equals(h.class)) {
            return W1.a6(osSchemaInfo0);
        }
        if(class0.equals(g.class)) {
            return S1.W5(osSchemaInfo0);
        }
        if(class0.equals(f.class)) {
            return U1.c6(osSchemaInfo0);
        }
        if(class0.equals(e.class)) {
            return Y1.j6(osSchemaInfo0);
        }
        if(class0.equals(d.class)) {
            return Q1.g6(osSchemaInfo0);
        }
        if(class0.equals(c.class)) {
            return O1.Y5(osSchemaInfo0);
        }
        if(class0.equals(b.class)) {
            return M1.k6(osSchemaInfo0);
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            return I1.Y5(osSchemaInfo0);
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            return K1.W5(osSchemaInfo0);
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            return G1.W5(osSchemaInfo0);
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            return E1.a6(osSchemaInfo0);
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        return C1.W5(osSchemaInfo0);
    }

    @Override  // io.realm.internal.t
    public X0 e(X0 x00, int v, Map map0) {
        Class class0 = x00.getClass().getSuperclass();
        if(class0.equals(B0.class)) {
            return (X0)class0.cast(m3.T5(((B0)x00), 0, v, map0));
        }
        if(class0.equals(A0.class)) {
            return (X0)class0.cast(k3.n6(((A0)x00), 0, v, map0));
        }
        if(class0.equals(z0.class)) {
            return (X0)class0.cast(i3.d6(((z0)x00), 0, v, map0));
        }
        if(class0.equals(y0.class)) {
            return (X0)class0.cast(g3.a6(((y0)x00), 0, v, map0));
        }
        if(class0.equals(x0.class)) {
            return (X0)class0.cast(e3.d6(((x0)x00), 0, v, map0));
        }
        if(class0.equals(w0.class)) {
            return (X0)class0.cast(c3.b6(((w0)x00), 0, v, map0));
        }
        if(class0.equals(v0.class)) {
            return (X0)class0.cast(a3.d6(((v0)x00), 0, v, map0));
        }
        if(class0.equals(u0.class)) {
            return (X0)class0.cast(Y2.g6(((u0)x00), 0, v, map0));
        }
        if(class0.equals(s0.class)) {
            return (X0)class0.cast(W2.h6(((s0)x00), 0, v, map0));
        }
        if(class0.equals(k0.class)) {
            return (X0)class0.cast(U2.v6(((k0)x00), 0, v, map0));
        }
        if(class0.equals(j0.class)) {
            return (X0)class0.cast(S2.b6(((j0)x00), 0, v, map0));
        }
        if(class0.equals(h0.class)) {
            return (X0)class0.cast(O2.h6(((h0)x00), 0, v, map0));
        }
        if(class0.equals(g0.class)) {
            return (X0)class0.cast(Q2.Z5(((g0)x00), 0, v, map0));
        }
        if(class0.equals(f0.class)) {
            return (X0)class0.cast(M2.D6(((f0)x00), 0, v, map0));
        }
        if(class0.equals(e0.class)) {
            return (X0)class0.cast(K2.d6(((e0)x00), 0, v, map0));
        }
        if(class0.equals(d0.class)) {
            return (X0)class0.cast(I2.o6(((d0)x00), 0, v, map0));
        }
        if(class0.equals(c0.class)) {
            return (X0)class0.cast(G2.g6(((c0)x00), 0, v, map0));
        }
        if(class0.equals(b0.class)) {
            return (X0)class0.cast(E2.e6(((b0)x00), 0, v, map0));
        }
        if(class0.equals(U.class)) {
            return (X0)class0.cast(C2.Z5(((U)x00), 0, v, map0));
        }
        if(class0.equals(B.class)) {
            return (X0)class0.cast(A2.p7(((B)x00), 0, v, map0));
        }
        if(class0.equals(A.class)) {
            return (X0)class0.cast(y2.d6(((A)x00), 0, v, map0));
        }
        if(class0.equals(z.class)) {
            return (X0)class0.cast(w2.m6(((z)x00), 0, v, map0));
        }
        if(class0.equals(y.class)) {
            return (X0)class0.cast(u2.c6(((y)x00), 0, v, map0));
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            return (X0)class0.cast(s2.g6(((com.dcinside.app.realm.t)x00), 0, v, map0));
        }
        if(class0.equals(s.class)) {
            return (X0)class0.cast(q2.T5(((s)x00), 0, v, map0));
        }
        if(class0.equals(r.class)) {
            return (X0)class0.cast(o2.h6(((r)x00), 0, v, map0));
        }
        if(class0.equals(q.class)) {
            return (X0)class0.cast(m2.p6(((q)x00), 0, v, map0));
        }
        if(class0.equals(o.class)) {
            return (X0)class0.cast(k2.b6(((o)x00), 0, v, map0));
        }
        if(class0.equals(n.class)) {
            return (X0)class0.cast(i2.f6(((n)x00), 0, v, map0));
        }
        if(class0.equals(m.class)) {
            return (X0)class0.cast(g2.b6(((m)x00), 0, v, map0));
        }
        if(class0.equals(l.class)) {
            return (X0)class0.cast(e2.g6(((l)x00), 0, v, map0));
        }
        if(class0.equals(k.class)) {
            return (X0)class0.cast(c2.Z5(((k)x00), 0, v, map0));
        }
        if(class0.equals(j.class)) {
            return (X0)class0.cast(a2.j6(((j)x00), 0, v, map0));
        }
        if(class0.equals(h.class)) {
            return (X0)class0.cast(W1.b6(((h)x00), 0, v, map0));
        }
        if(class0.equals(g.class)) {
            return (X0)class0.cast(S1.X5(((g)x00), 0, v, map0));
        }
        if(class0.equals(f.class)) {
            return (X0)class0.cast(U1.d6(((f)x00), 0, v, map0));
        }
        if(class0.equals(e.class)) {
            return (X0)class0.cast(Y1.k6(((e)x00), 0, v, map0));
        }
        if(class0.equals(d.class)) {
            return (X0)class0.cast(Q1.h6(((d)x00), 0, v, map0));
        }
        if(class0.equals(c.class)) {
            return (X0)class0.cast(O1.Z5(((c)x00), 0, v, map0));
        }
        if(class0.equals(b.class)) {
            return (X0)class0.cast(M1.l6(((b)x00), 0, v, map0));
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            return (X0)class0.cast(I1.Z5(((com.dcinside.app.memo.q)x00), 0, v, map0));
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            return (X0)class0.cast(K1.X5(((com.dcinside.app.memo.n)x00), 0, v, map0));
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            return (X0)class0.cast(G1.X5(((com.dcinside.app.memo.m)x00), 0, v, map0));
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            return (X0)class0.cast(E1.b6(((com.dcinside.app.dccon.setting.tag.b)x00), 0, v, map0));
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        return (X0)class0.cast(C1.X5(((a)x00), 0, v, map0));
    }

    @Override  // io.realm.internal.t
    public X0 f(Class class0, F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        t.a(class0);
        if(class0.equals(B0.class)) {
            return (X0)class0.cast(m3.V5(f00, jSONObject0, z));
        }
        if(class0.equals(A0.class)) {
            return (X0)class0.cast(k3.p6(f00, jSONObject0, z));
        }
        if(class0.equals(z0.class)) {
            return (X0)class0.cast(i3.f6(f00, jSONObject0, z));
        }
        if(class0.equals(y0.class)) {
            return (X0)class0.cast(g3.c6(f00, jSONObject0, z));
        }
        if(class0.equals(x0.class)) {
            return (X0)class0.cast(e3.f6(f00, jSONObject0, z));
        }
        if(class0.equals(w0.class)) {
            return (X0)class0.cast(c3.d6(f00, jSONObject0, z));
        }
        if(class0.equals(v0.class)) {
            return (X0)class0.cast(a3.f6(f00, jSONObject0, z));
        }
        if(class0.equals(u0.class)) {
            return (X0)class0.cast(Y2.i6(f00, jSONObject0, z));
        }
        if(class0.equals(s0.class)) {
            return (X0)class0.cast(W2.j6(f00, jSONObject0, z));
        }
        if(class0.equals(k0.class)) {
            return (X0)class0.cast(U2.x6(f00, jSONObject0, z));
        }
        if(class0.equals(j0.class)) {
            return (X0)class0.cast(S2.d6(f00, jSONObject0, z));
        }
        if(class0.equals(h0.class)) {
            return (X0)class0.cast(O2.j6(f00, jSONObject0, z));
        }
        if(class0.equals(g0.class)) {
            return (X0)class0.cast(Q2.b6(f00, jSONObject0, z));
        }
        if(class0.equals(f0.class)) {
            return (X0)class0.cast(M2.F6(f00, jSONObject0, z));
        }
        if(class0.equals(e0.class)) {
            return (X0)class0.cast(K2.f6(f00, jSONObject0, z));
        }
        if(class0.equals(d0.class)) {
            return (X0)class0.cast(I2.q6(f00, jSONObject0, z));
        }
        if(class0.equals(c0.class)) {
            return (X0)class0.cast(G2.i6(f00, jSONObject0, z));
        }
        if(class0.equals(b0.class)) {
            return (X0)class0.cast(E2.g6(f00, jSONObject0, z));
        }
        if(class0.equals(U.class)) {
            return (X0)class0.cast(C2.b6(f00, jSONObject0, z));
        }
        if(class0.equals(B.class)) {
            return (X0)class0.cast(A2.r7(f00, jSONObject0, z));
        }
        if(class0.equals(A.class)) {
            return (X0)class0.cast(y2.f6(f00, jSONObject0, z));
        }
        if(class0.equals(z.class)) {
            return (X0)class0.cast(w2.o6(f00, jSONObject0, z));
        }
        if(class0.equals(y.class)) {
            return (X0)class0.cast(u2.e6(f00, jSONObject0, z));
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            return (X0)class0.cast(s2.i6(f00, jSONObject0, z));
        }
        if(class0.equals(s.class)) {
            return (X0)class0.cast(q2.V5(f00, jSONObject0, z));
        }
        if(class0.equals(r.class)) {
            return (X0)class0.cast(o2.j6(f00, jSONObject0, z));
        }
        if(class0.equals(q.class)) {
            return (X0)class0.cast(m2.r6(f00, jSONObject0, z));
        }
        if(class0.equals(o.class)) {
            return (X0)class0.cast(k2.d6(f00, jSONObject0, z));
        }
        if(class0.equals(n.class)) {
            return (X0)class0.cast(i2.h6(f00, jSONObject0, z));
        }
        if(class0.equals(m.class)) {
            return (X0)class0.cast(g2.d6(f00, jSONObject0, z));
        }
        if(class0.equals(l.class)) {
            return (X0)class0.cast(e2.i6(f00, jSONObject0, z));
        }
        if(class0.equals(k.class)) {
            return (X0)class0.cast(c2.b6(f00, jSONObject0, z));
        }
        if(class0.equals(j.class)) {
            return (X0)class0.cast(a2.l6(f00, jSONObject0, z));
        }
        if(class0.equals(h.class)) {
            return (X0)class0.cast(W1.d6(f00, jSONObject0, z));
        }
        if(class0.equals(g.class)) {
            return (X0)class0.cast(S1.Z5(f00, jSONObject0, z));
        }
        if(class0.equals(f.class)) {
            return (X0)class0.cast(U1.f6(f00, jSONObject0, z));
        }
        if(class0.equals(e.class)) {
            return (X0)class0.cast(Y1.m6(f00, jSONObject0, z));
        }
        if(class0.equals(d.class)) {
            return (X0)class0.cast(Q1.j6(f00, jSONObject0, z));
        }
        if(class0.equals(c.class)) {
            return (X0)class0.cast(O1.b6(f00, jSONObject0, z));
        }
        if(class0.equals(b.class)) {
            return (X0)class0.cast(M1.n6(f00, jSONObject0, z));
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            return (X0)class0.cast(I1.b6(f00, jSONObject0, z));
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            return (X0)class0.cast(K1.Z5(f00, jSONObject0, z));
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            return (X0)class0.cast(G1.Z5(f00, jSONObject0, z));
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            return (X0)class0.cast(E1.d6(f00, jSONObject0, z));
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        return (X0)class0.cast(C1.Z5(f00, jSONObject0, z));
    }

    @Override  // io.realm.internal.t
    public X0 g(Class class0, F0 f00, JsonReader jsonReader0) throws IOException {
        t.a(class0);
        if(class0.equals(B0.class)) {
            return (X0)class0.cast(m3.W5(f00, jsonReader0));
        }
        if(class0.equals(A0.class)) {
            return (X0)class0.cast(k3.q6(f00, jsonReader0));
        }
        if(class0.equals(z0.class)) {
            return (X0)class0.cast(i3.g6(f00, jsonReader0));
        }
        if(class0.equals(y0.class)) {
            return (X0)class0.cast(g3.d6(f00, jsonReader0));
        }
        if(class0.equals(x0.class)) {
            return (X0)class0.cast(e3.g6(f00, jsonReader0));
        }
        if(class0.equals(w0.class)) {
            return (X0)class0.cast(c3.e6(f00, jsonReader0));
        }
        if(class0.equals(v0.class)) {
            return (X0)class0.cast(a3.g6(f00, jsonReader0));
        }
        if(class0.equals(u0.class)) {
            return (X0)class0.cast(Y2.j6(f00, jsonReader0));
        }
        if(class0.equals(s0.class)) {
            return (X0)class0.cast(W2.k6(f00, jsonReader0));
        }
        if(class0.equals(k0.class)) {
            return (X0)class0.cast(U2.y6(f00, jsonReader0));
        }
        if(class0.equals(j0.class)) {
            return (X0)class0.cast(S2.e6(f00, jsonReader0));
        }
        if(class0.equals(h0.class)) {
            return (X0)class0.cast(O2.k6(f00, jsonReader0));
        }
        if(class0.equals(g0.class)) {
            return (X0)class0.cast(Q2.c6(f00, jsonReader0));
        }
        if(class0.equals(f0.class)) {
            return (X0)class0.cast(M2.G6(f00, jsonReader0));
        }
        if(class0.equals(e0.class)) {
            return (X0)class0.cast(K2.g6(f00, jsonReader0));
        }
        if(class0.equals(d0.class)) {
            return (X0)class0.cast(I2.r6(f00, jsonReader0));
        }
        if(class0.equals(c0.class)) {
            return (X0)class0.cast(G2.j6(f00, jsonReader0));
        }
        if(class0.equals(b0.class)) {
            return (X0)class0.cast(E2.h6(f00, jsonReader0));
        }
        if(class0.equals(U.class)) {
            return (X0)class0.cast(C2.c6(f00, jsonReader0));
        }
        if(class0.equals(B.class)) {
            return (X0)class0.cast(A2.s7(f00, jsonReader0));
        }
        if(class0.equals(A.class)) {
            return (X0)class0.cast(y2.g6(f00, jsonReader0));
        }
        if(class0.equals(z.class)) {
            return (X0)class0.cast(w2.p6(f00, jsonReader0));
        }
        if(class0.equals(y.class)) {
            return (X0)class0.cast(u2.f6(f00, jsonReader0));
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            return (X0)class0.cast(s2.j6(f00, jsonReader0));
        }
        if(class0.equals(s.class)) {
            return (X0)class0.cast(q2.W5(f00, jsonReader0));
        }
        if(class0.equals(r.class)) {
            return (X0)class0.cast(o2.k6(f00, jsonReader0));
        }
        if(class0.equals(q.class)) {
            return (X0)class0.cast(m2.s6(f00, jsonReader0));
        }
        if(class0.equals(o.class)) {
            return (X0)class0.cast(k2.e6(f00, jsonReader0));
        }
        if(class0.equals(n.class)) {
            return (X0)class0.cast(i2.i6(f00, jsonReader0));
        }
        if(class0.equals(m.class)) {
            return (X0)class0.cast(g2.e6(f00, jsonReader0));
        }
        if(class0.equals(l.class)) {
            return (X0)class0.cast(e2.j6(f00, jsonReader0));
        }
        if(class0.equals(k.class)) {
            return (X0)class0.cast(c2.c6(f00, jsonReader0));
        }
        if(class0.equals(j.class)) {
            return (X0)class0.cast(a2.m6(f00, jsonReader0));
        }
        if(class0.equals(h.class)) {
            return (X0)class0.cast(W1.e6(f00, jsonReader0));
        }
        if(class0.equals(g.class)) {
            return (X0)class0.cast(S1.a6(f00, jsonReader0));
        }
        if(class0.equals(f.class)) {
            return (X0)class0.cast(U1.g6(f00, jsonReader0));
        }
        if(class0.equals(e.class)) {
            return (X0)class0.cast(Y1.n6(f00, jsonReader0));
        }
        if(class0.equals(d.class)) {
            return (X0)class0.cast(Q1.k6(f00, jsonReader0));
        }
        if(class0.equals(c.class)) {
            return (X0)class0.cast(O1.c6(f00, jsonReader0));
        }
        if(class0.equals(b.class)) {
            return (X0)class0.cast(M1.o6(f00, jsonReader0));
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            return (X0)class0.cast(I1.c6(f00, jsonReader0));
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            return (X0)class0.cast(K1.a6(f00, jsonReader0));
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            return (X0)class0.cast(G1.a6(f00, jsonReader0));
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            return (X0)class0.cast(E1.e6(f00, jsonReader0));
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        return (X0)class0.cast(C1.a6(f00, jsonReader0));
    }

    @Override  // io.realm.internal.t
    public Class i(String s) {
        t.b(s);
        if(s.equals("YoutubeSearchCache")) {
            return B0.class;
        }
        if(s.equals("VoiceArchive")) {
            return A0.class;
        }
        if(s.equals("UserNoticeInfo")) {
            return z0.class;
        }
        if(s.equals("UserFavorite")) {
            return y0.class;
        }
        if(s.equals("SearchGalleryItem")) {
            return x0.class;
        }
        if(s.equals("SearchGalleryCategory")) {
            return w0.class;
        }
        if(s.equals("ReplyHistory")) {
            return v0.class;
        }
        if(s.equals("RecentSearch")) {
            return u0.class;
        }
        if(s.equals("Recent")) {
            return s0.class;
        }
        if(s.equals("PostWrite")) {
            return k0.class;
        }
        if(s.equals("PostTemp")) {
            return j0.class;
        }
        if(s.equals("PostSeriesItem")) {
            return h0.class;
        }
        if(s.equals("PostSeries")) {
            return g0.class;
        }
        if(s.equals("PostHistory")) {
            return f0.class;
        }
        if(s.equals("PostArticle")) {
            return e0.class;
        }
        if(s.equals("PostArchive")) {
            return d0.class;
        }
        if(s.equals("Policy")) {
            return c0.class;
        }
        if(s.equals("MatchOtp")) {
            return b0.class;
        }
        if(s.equals("ManagerBlockImage")) {
            return U.class;
        }
        if(s.equals("Login")) {
            return B.class;
        }
        if(s.equals("LastManagerSituation")) {
            return A.class;
        }
        if(s.equals("ImageDownloadInfo")) {
            return z.class;
        }
        if(s.equals("HateWord")) {
            return y.class;
        }
        if(s.equals("GuestUserInfo")) {
            return com.dcinside.app.realm.t.class;
        }
        if(s.equals("GalleryZipInfo")) {
            return s.class;
        }
        if(s.equals("GalleryTextOption")) {
            return r.class;
        }
        if(s.equals("GalleryParams")) {
            return q.class;
        }
        if(s.equals("GalleryOptions")) {
            return o.class;
        }
        if(s.equals("FcmMsg")) {
            return n.class;
        }
        if(s.equals("FavoriteGallery")) {
            return m.class;
        }
        if(s.equals("DefaultImage")) {
            return l.class;
        }
        if(s.equals("DcconGuestHistory")) {
            return k.class;
        }
        if(s.equals("BlockReportedPost")) {
            return j.class;
        }
        if(s.equals("BlockPostImage")) {
            return h.class;
        }
        if(s.equals("BlockDCConItem")) {
            return g.class;
        }
        if(s.equals("BlockDCCon")) {
            return f.class;
        }
        if(s.equals("Block")) {
            return e.class;
        }
        if(s.equals("ArchiveFolderParent")) {
            return d.class;
        }
        if(s.equals("ArchiveFolderChild")) {
            return c.class;
        }
        if(s.equals("AiPromptHistory")) {
            return b.class;
        }
        if(s.equals("UserMemoItem")) {
            return com.dcinside.app.memo.q.class;
        }
        if(s.equals("UserMemo")) {
            return com.dcinside.app.memo.n.class;
        }
        if(s.equals("RecentAddUserMemo")) {
            return com.dcinside.app.memo.m.class;
        }
        if(s.equals("DcconTagItem")) {
            return com.dcinside.app.dccon.setting.tag.b.class;
        }
        if(!s.equals("DcconTagGroup")) {
            throw t.l(s);
        }
        return a.class;
    }

    @Override  // io.realm.internal.t
    public Map j() {
        Map map0 = new HashMap(45);
        map0.put(B0.class, m3.X5());
        map0.put(A0.class, k3.r6());
        map0.put(z0.class, i3.h6());
        map0.put(y0.class, g3.e6());
        map0.put(x0.class, e3.h6());
        map0.put(w0.class, c3.f6());
        map0.put(v0.class, a3.h6());
        map0.put(u0.class, Y2.k6());
        map0.put(s0.class, W2.l6());
        map0.put(k0.class, U2.z6());
        map0.put(j0.class, S2.f6());
        map0.put(h0.class, O2.l6());
        map0.put(g0.class, Q2.d6());
        map0.put(f0.class, M2.H6());
        map0.put(e0.class, K2.h6());
        map0.put(d0.class, I2.s6());
        map0.put(c0.class, G2.k6());
        map0.put(b0.class, E2.i6());
        map0.put(U.class, C2.d6());
        map0.put(B.class, A2.t7());
        map0.put(A.class, y2.h6());
        map0.put(z.class, w2.q6());
        map0.put(y.class, u2.g6());
        map0.put(com.dcinside.app.realm.t.class, s2.k6());
        map0.put(s.class, q2.X5());
        map0.put(r.class, o2.l6());
        map0.put(q.class, m2.t6());
        map0.put(o.class, k2.f6());
        map0.put(n.class, i2.j6());
        map0.put(m.class, g2.f6());
        map0.put(l.class, e2.k6());
        map0.put(k.class, c2.d6());
        map0.put(j.class, a2.n6());
        map0.put(h.class, W1.f6());
        map0.put(g.class, S1.b6());
        map0.put(f.class, U1.h6());
        map0.put(e.class, Y1.o6());
        map0.put(d.class, Q1.l6());
        map0.put(c.class, O1.d6());
        map0.put(b.class, M1.p6());
        map0.put(com.dcinside.app.memo.q.class, I1.d6());
        map0.put(com.dcinside.app.memo.n.class, K1.b6());
        map0.put(com.dcinside.app.memo.m.class, G1.b6());
        map0.put(com.dcinside.app.dccon.setting.tag.b.class, E1.f6());
        map0.put(a.class, C1.b6());
        return map0;
    }

    @Override  // io.realm.internal.t
    public Set m() {
        return DefaultRealmModuleMediator.a;
    }

    @Override  // io.realm.internal.t
    public String p(Class class0) {
        t.a(class0);
        if(class0.equals(B0.class)) {
            return "YoutubeSearchCache";
        }
        if(class0.equals(A0.class)) {
            return "VoiceArchive";
        }
        if(class0.equals(z0.class)) {
            return "UserNoticeInfo";
        }
        if(class0.equals(y0.class)) {
            return "UserFavorite";
        }
        if(class0.equals(x0.class)) {
            return "SearchGalleryItem";
        }
        if(class0.equals(w0.class)) {
            return "SearchGalleryCategory";
        }
        if(class0.equals(v0.class)) {
            return "ReplyHistory";
        }
        if(class0.equals(u0.class)) {
            return "RecentSearch";
        }
        if(class0.equals(s0.class)) {
            return "Recent";
        }
        if(class0.equals(k0.class)) {
            return "PostWrite";
        }
        if(class0.equals(j0.class)) {
            return "PostTemp";
        }
        if(class0.equals(h0.class)) {
            return "PostSeriesItem";
        }
        if(class0.equals(g0.class)) {
            return "PostSeries";
        }
        if(class0.equals(f0.class)) {
            return "PostHistory";
        }
        if(class0.equals(e0.class)) {
            return "PostArticle";
        }
        if(class0.equals(d0.class)) {
            return "PostArchive";
        }
        if(class0.equals(c0.class)) {
            return "Policy";
        }
        if(class0.equals(b0.class)) {
            return "MatchOtp";
        }
        if(class0.equals(U.class)) {
            return "ManagerBlockImage";
        }
        if(class0.equals(B.class)) {
            return "Login";
        }
        if(class0.equals(A.class)) {
            return "LastManagerSituation";
        }
        if(class0.equals(z.class)) {
            return "ImageDownloadInfo";
        }
        if(class0.equals(y.class)) {
            return "HateWord";
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            return "GuestUserInfo";
        }
        if(class0.equals(s.class)) {
            return "GalleryZipInfo";
        }
        if(class0.equals(r.class)) {
            return "GalleryTextOption";
        }
        if(class0.equals(q.class)) {
            return "GalleryParams";
        }
        if(class0.equals(o.class)) {
            return "GalleryOptions";
        }
        if(class0.equals(n.class)) {
            return "FcmMsg";
        }
        if(class0.equals(m.class)) {
            return "FavoriteGallery";
        }
        if(class0.equals(l.class)) {
            return "DefaultImage";
        }
        if(class0.equals(k.class)) {
            return "DcconGuestHistory";
        }
        if(class0.equals(j.class)) {
            return "BlockReportedPost";
        }
        if(class0.equals(h.class)) {
            return "BlockPostImage";
        }
        if(class0.equals(g.class)) {
            return "BlockDCConItem";
        }
        if(class0.equals(f.class)) {
            return "BlockDCCon";
        }
        if(class0.equals(e.class)) {
            return "Block";
        }
        if(class0.equals(d.class)) {
            return "ArchiveFolderParent";
        }
        if(class0.equals(c.class)) {
            return "ArchiveFolderChild";
        }
        if(class0.equals(b.class)) {
            return "AiPromptHistory";
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            return "UserMemoItem";
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            return "UserMemo";
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            return "RecentAddUserMemo";
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            return "DcconTagItem";
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        return "DcconTagGroup";
    }

    // 去混淆评级： 高(320)
    @Override  // io.realm.internal.t
    public boolean r(Class class0) {
        return B0.class.isAssignableFrom(class0) || A0.class.isAssignableFrom(class0) || z0.class.isAssignableFrom(class0) || y0.class.isAssignableFrom(class0) || x0.class.isAssignableFrom(class0) || w0.class.isAssignableFrom(class0) || v0.class.isAssignableFrom(class0) || u0.class.isAssignableFrom(class0) || s0.class.isAssignableFrom(class0) || j0.class.isAssignableFrom(class0) || f0.class.isAssignableFrom(class0) || e0.class.isAssignableFrom(class0) || d0.class.isAssignableFrom(class0) || c0.class.isAssignableFrom(class0) || b0.class.isAssignableFrom(class0) || B.class.isAssignableFrom(class0) || A.class.isAssignableFrom(class0) || y.class.isAssignableFrom(class0) || s.class.isAssignableFrom(class0) || q.class.isAssignableFrom(class0) || o.class.isAssignableFrom(class0) || n.class.isAssignableFrom(class0) || k.class.isAssignableFrom(class0) || j.class.isAssignableFrom(class0) || g.class.isAssignableFrom(class0) || f.class.isAssignableFrom(class0) || e.class.isAssignableFrom(class0) || d.class.isAssignableFrom(class0) || c.class.isAssignableFrom(class0) || b.class.isAssignableFrom(class0) || com.dcinside.app.memo.n.class.isAssignableFrom(class0) || a.class.isAssignableFrom(class0);
    }

    @Override  // io.realm.internal.t
    public long s(F0 f00, X0 x00, Map map0) {
        Class class0 = x00 instanceof io.realm.internal.s ? x00.getClass().getSuperclass() : x00.getClass();
        if(class0.equals(B0.class)) {
            return m3.Z5(f00, ((B0)x00), map0);
        }
        if(class0.equals(A0.class)) {
            return k3.t6(f00, ((A0)x00), map0);
        }
        if(class0.equals(z0.class)) {
            return i3.j6(f00, ((z0)x00), map0);
        }
        if(class0.equals(y0.class)) {
            return g3.g6(f00, ((y0)x00), map0);
        }
        if(class0.equals(x0.class)) {
            return e3.j6(f00, ((x0)x00), map0);
        }
        if(class0.equals(w0.class)) {
            return c3.h6(f00, ((w0)x00), map0);
        }
        if(class0.equals(v0.class)) {
            return a3.j6(f00, ((v0)x00), map0);
        }
        if(class0.equals(u0.class)) {
            return Y2.m6(f00, ((u0)x00), map0);
        }
        if(class0.equals(s0.class)) {
            return W2.n6(f00, ((s0)x00), map0);
        }
        if(class0.equals(k0.class)) {
            return U2.B6(f00, ((k0)x00), map0);
        }
        if(class0.equals(j0.class)) {
            return S2.h6(f00, ((j0)x00), map0);
        }
        if(class0.equals(h0.class)) {
            return O2.n6(f00, ((h0)x00), map0);
        }
        if(class0.equals(g0.class)) {
            return Q2.f6(f00, ((g0)x00), map0);
        }
        if(class0.equals(f0.class)) {
            return M2.J6(f00, ((f0)x00), map0);
        }
        if(class0.equals(e0.class)) {
            return K2.j6(f00, ((e0)x00), map0);
        }
        if(class0.equals(d0.class)) {
            return I2.u6(f00, ((d0)x00), map0);
        }
        if(class0.equals(c0.class)) {
            return G2.m6(f00, ((c0)x00), map0);
        }
        if(class0.equals(b0.class)) {
            return E2.k6(f00, ((b0)x00), map0);
        }
        if(class0.equals(U.class)) {
            return C2.f6(f00, ((U)x00), map0);
        }
        if(class0.equals(B.class)) {
            return A2.v7(f00, ((B)x00), map0);
        }
        if(class0.equals(A.class)) {
            return y2.j6(f00, ((A)x00), map0);
        }
        if(class0.equals(z.class)) {
            return w2.s6(f00, ((z)x00), map0);
        }
        if(class0.equals(y.class)) {
            return u2.i6(f00, ((y)x00), map0);
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            return s2.m6(f00, ((com.dcinside.app.realm.t)x00), map0);
        }
        if(class0.equals(s.class)) {
            return q2.Z5(f00, ((s)x00), map0);
        }
        if(class0.equals(r.class)) {
            return o2.n6(f00, ((r)x00), map0);
        }
        if(class0.equals(q.class)) {
            return m2.v6(f00, ((q)x00), map0);
        }
        if(class0.equals(o.class)) {
            return k2.h6(f00, ((o)x00), map0);
        }
        if(class0.equals(n.class)) {
            return i2.l6(f00, ((n)x00), map0);
        }
        if(class0.equals(m.class)) {
            return g2.h6(f00, ((m)x00), map0);
        }
        if(class0.equals(l.class)) {
            return e2.m6(f00, ((l)x00), map0);
        }
        if(class0.equals(k.class)) {
            return c2.f6(f00, ((k)x00), map0);
        }
        if(class0.equals(j.class)) {
            return a2.p6(f00, ((j)x00), map0);
        }
        if(class0.equals(h.class)) {
            return W1.h6(f00, ((h)x00), map0);
        }
        if(class0.equals(g.class)) {
            return S1.d6(f00, ((g)x00), map0);
        }
        if(class0.equals(f.class)) {
            return U1.j6(f00, ((f)x00), map0);
        }
        if(class0.equals(e.class)) {
            return Y1.q6(f00, ((e)x00), map0);
        }
        if(class0.equals(d.class)) {
            return Q1.n6(f00, ((d)x00), map0);
        }
        if(class0.equals(c.class)) {
            return O1.f6(f00, ((c)x00), map0);
        }
        if(class0.equals(b.class)) {
            return M1.r6(f00, ((b)x00), map0);
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            return I1.f6(f00, ((com.dcinside.app.memo.q)x00), map0);
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            return K1.d6(f00, ((com.dcinside.app.memo.n)x00), map0);
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            return G1.d6(f00, ((com.dcinside.app.memo.m)x00), map0);
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            return E1.h6(f00, ((com.dcinside.app.dccon.setting.tag.b)x00), map0);
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        return C1.d6(f00, ((a)x00), map0);
    }

    @Override  // io.realm.internal.t
    public void t(F0 f00, Collection collection0) {
        Iterator iterator0 = collection0.iterator();
        HashMap hashMap0 = new HashMap(collection0.size());
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            X0 x00 = (X0)object0;
            Class class0 = x00 instanceof io.realm.internal.s ? x00.getClass().getSuperclass() : x00.getClass();
            boolean z = class0.equals(B0.class);
            Class class1 = B0.class;
            Class class2 = h0.class;
            Class class3 = z.class;
            Class class4 = j0.class;
            Class class5 = A.class;
            Class class6 = k0.class;
            Class class7 = B.class;
            Class class8 = s0.class;
            Class class9 = U.class;
            Class class10 = u0.class;
            Class class11 = b0.class;
            Class class12 = v0.class;
            Class class13 = c0.class;
            Class class14 = w0.class;
            Class class15 = d0.class;
            Class class16 = x0.class;
            Class class17 = e0.class;
            Class class18 = y0.class;
            Class class19 = f0.class;
            Class class20 = z0.class;
            Class class21 = g0.class;
            Class class22 = A0.class;
            if(z) {
                m3.Z5(f00, ((B0)x00), hashMap0);
            }
            else if(class0.equals(class22)) {
                k3.t6(f00, ((A0)x00), hashMap0);
            }
            else if(class0.equals(class20)) {
                i3.j6(f00, ((z0)x00), hashMap0);
            }
            else if(class0.equals(class18)) {
                g3.g6(f00, ((y0)x00), hashMap0);
            }
            else if(class0.equals(class16)) {
                e3.j6(f00, ((x0)x00), hashMap0);
            }
            else if(class0.equals(class14)) {
                c3.h6(f00, ((w0)x00), hashMap0);
            }
            else if(class0.equals(class12)) {
                a3.j6(f00, ((v0)x00), hashMap0);
            }
            else if(class0.equals(class10)) {
                Y2.m6(f00, ((u0)x00), hashMap0);
            }
            else if(class0.equals(class8)) {
                W2.n6(f00, ((s0)x00), hashMap0);
            }
            else if(class0.equals(class6)) {
                U2.B6(f00, ((k0)x00), hashMap0);
            }
            else if(class0.equals(class4)) {
                S2.h6(f00, ((j0)x00), hashMap0);
            }
            else if(class0.equals(class2)) {
                O2.n6(f00, ((h0)x00), hashMap0);
            }
            else if(class0.equals(class21)) {
                Q2.f6(f00, ((g0)x00), hashMap0);
            }
            else if(class0.equals(class19)) {
                M2.J6(f00, ((f0)x00), hashMap0);
            }
            else if(class0.equals(class17)) {
                K2.j6(f00, ((e0)x00), hashMap0);
            }
            else if(class0.equals(class15)) {
                I2.u6(f00, ((d0)x00), hashMap0);
            }
            else if(class0.equals(class13)) {
                G2.m6(f00, ((c0)x00), hashMap0);
            }
            else if(class0.equals(class11)) {
                E2.k6(f00, ((b0)x00), hashMap0);
            }
            else if(class0.equals(class9)) {
                C2.f6(f00, ((U)x00), hashMap0);
            }
            else if(class0.equals(class7)) {
                A2.v7(f00, ((B)x00), hashMap0);
            }
            else if(class0.equals(class5)) {
                y2.j6(f00, ((A)x00), hashMap0);
            }
            else if(class0.equals(class3)) {
                w2.s6(f00, ((z)x00), hashMap0);
            }
            else if(class0.equals(y.class)) {
                u2.i6(f00, ((y)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.realm.t.class)) {
                s2.m6(f00, ((com.dcinside.app.realm.t)x00), hashMap0);
            }
            else if(class0.equals(s.class)) {
                q2.Z5(f00, ((s)x00), hashMap0);
            }
            else if(class0.equals(r.class)) {
                o2.n6(f00, ((r)x00), hashMap0);
            }
            else if(class0.equals(q.class)) {
                m2.v6(f00, ((q)x00), hashMap0);
            }
            else if(class0.equals(o.class)) {
                k2.h6(f00, ((o)x00), hashMap0);
            }
            else if(class0.equals(n.class)) {
                i2.l6(f00, ((n)x00), hashMap0);
            }
            else if(class0.equals(m.class)) {
                g2.h6(f00, ((m)x00), hashMap0);
            }
            else if(class0.equals(l.class)) {
                e2.m6(f00, ((l)x00), hashMap0);
            }
            else if(class0.equals(k.class)) {
                c2.f6(f00, ((k)x00), hashMap0);
            }
            else if(class0.equals(j.class)) {
                a2.p6(f00, ((j)x00), hashMap0);
            }
            else if(class0.equals(h.class)) {
                W1.h6(f00, ((h)x00), hashMap0);
            }
            else if(class0.equals(g.class)) {
                S1.d6(f00, ((g)x00), hashMap0);
            }
            else if(class0.equals(f.class)) {
                U1.j6(f00, ((f)x00), hashMap0);
            }
            else if(class0.equals(e.class)) {
                Y1.q6(f00, ((e)x00), hashMap0);
            }
            else if(class0.equals(d.class)) {
                Q1.n6(f00, ((d)x00), hashMap0);
            }
            else if(class0.equals(c.class)) {
                O1.f6(f00, ((c)x00), hashMap0);
            }
            else if(class0.equals(b.class)) {
                M1.r6(f00, ((b)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.memo.q.class)) {
                I1.f6(f00, ((com.dcinside.app.memo.q)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.memo.n.class)) {
                K1.d6(f00, ((com.dcinside.app.memo.n)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.memo.m.class)) {
                G1.d6(f00, ((com.dcinside.app.memo.m)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
                E1.h6(f00, ((com.dcinside.app.dccon.setting.tag.b)x00), hashMap0);
            }
            else {
                if(!class0.equals(a.class)) {
                    throw t.k(class0);
                }
                C1.d6(f00, ((a)x00), hashMap0);
            }
            if(iterator0.hasNext()) {
                if(class0.equals(class1)) {
                    m3.a6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class22)) {
                    k3.u6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class20)) {
                    i3.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class18)) {
                    g3.h6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class16)) {
                    e3.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class14)) {
                    c3.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class12)) {
                    a3.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class10)) {
                    Y2.n6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class8)) {
                    W2.o6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class6)) {
                    U2.C6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class4)) {
                    S2.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class2)) {
                    O2.o6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class21)) {
                    Q2.g6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class19)) {
                    M2.K6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class17)) {
                    K2.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class15)) {
                    I2.v6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class13)) {
                    G2.n6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class11)) {
                    E2.l6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class9)) {
                    C2.g6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class7)) {
                    A2.w7(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class5)) {
                    y2.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class3)) {
                    w2.t6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(y.class)) {
                    u2.j6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.realm.t.class)) {
                    s2.n6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(s.class)) {
                    q2.a6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(r.class)) {
                    o2.o6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(q.class)) {
                    m2.w6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(o.class)) {
                    k2.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(n.class)) {
                    i2.m6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(m.class)) {
                    g2.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(l.class)) {
                    e2.n6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(k.class)) {
                    c2.g6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(j.class)) {
                    a2.q6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(h.class)) {
                    W1.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(g.class)) {
                    S1.e6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(f.class)) {
                    U1.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(e.class)) {
                    Y1.r6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(d.class)) {
                    Q1.o6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(c.class)) {
                    O1.g6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(b.class)) {
                    M1.s6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.memo.q.class)) {
                    I1.g6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.memo.n.class)) {
                    K1.e6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.memo.m.class)) {
                    G1.e6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
                    E1.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(!class0.equals(a.class)) {
                    throw t.k(class0);
                }
                C1.e6(f00, iterator0, hashMap0);
            }
        }
    }

    @Override  // io.realm.internal.t
    public long u(F0 f00, X0 x00, Map map0) {
        Class class0 = x00 instanceof io.realm.internal.s ? x00.getClass().getSuperclass() : x00.getClass();
        if(class0.equals(B0.class)) {
            return m3.b6(f00, ((B0)x00), map0);
        }
        if(class0.equals(A0.class)) {
            return k3.v6(f00, ((A0)x00), map0);
        }
        if(class0.equals(z0.class)) {
            return i3.l6(f00, ((z0)x00), map0);
        }
        if(class0.equals(y0.class)) {
            return g3.i6(f00, ((y0)x00), map0);
        }
        if(class0.equals(x0.class)) {
            return e3.l6(f00, ((x0)x00), map0);
        }
        if(class0.equals(w0.class)) {
            return c3.j6(f00, ((w0)x00), map0);
        }
        if(class0.equals(v0.class)) {
            return a3.l6(f00, ((v0)x00), map0);
        }
        if(class0.equals(u0.class)) {
            return Y2.o6(f00, ((u0)x00), map0);
        }
        if(class0.equals(s0.class)) {
            return W2.p6(f00, ((s0)x00), map0);
        }
        if(class0.equals(k0.class)) {
            return U2.D6(f00, ((k0)x00), map0);
        }
        if(class0.equals(j0.class)) {
            return S2.j6(f00, ((j0)x00), map0);
        }
        if(class0.equals(h0.class)) {
            return O2.p6(f00, ((h0)x00), map0);
        }
        if(class0.equals(g0.class)) {
            return Q2.h6(f00, ((g0)x00), map0);
        }
        if(class0.equals(f0.class)) {
            return M2.L6(f00, ((f0)x00), map0);
        }
        if(class0.equals(e0.class)) {
            return K2.l6(f00, ((e0)x00), map0);
        }
        if(class0.equals(d0.class)) {
            return I2.w6(f00, ((d0)x00), map0);
        }
        if(class0.equals(c0.class)) {
            return G2.o6(f00, ((c0)x00), map0);
        }
        if(class0.equals(b0.class)) {
            return E2.m6(f00, ((b0)x00), map0);
        }
        if(class0.equals(U.class)) {
            return C2.h6(f00, ((U)x00), map0);
        }
        if(class0.equals(B.class)) {
            return A2.x7(f00, ((B)x00), map0);
        }
        if(class0.equals(A.class)) {
            return y2.l6(f00, ((A)x00), map0);
        }
        if(class0.equals(z.class)) {
            return w2.u6(f00, ((z)x00), map0);
        }
        if(class0.equals(y.class)) {
            return u2.k6(f00, ((y)x00), map0);
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            return s2.o6(f00, ((com.dcinside.app.realm.t)x00), map0);
        }
        if(class0.equals(s.class)) {
            return q2.b6(f00, ((s)x00), map0);
        }
        if(class0.equals(r.class)) {
            return o2.p6(f00, ((r)x00), map0);
        }
        if(class0.equals(q.class)) {
            return m2.x6(f00, ((q)x00), map0);
        }
        if(class0.equals(o.class)) {
            return k2.j6(f00, ((o)x00), map0);
        }
        if(class0.equals(n.class)) {
            return i2.n6(f00, ((n)x00), map0);
        }
        if(class0.equals(m.class)) {
            return g2.j6(f00, ((m)x00), map0);
        }
        if(class0.equals(l.class)) {
            return e2.o6(f00, ((l)x00), map0);
        }
        if(class0.equals(k.class)) {
            return c2.h6(f00, ((k)x00), map0);
        }
        if(class0.equals(j.class)) {
            return a2.r6(f00, ((j)x00), map0);
        }
        if(class0.equals(h.class)) {
            return W1.j6(f00, ((h)x00), map0);
        }
        if(class0.equals(g.class)) {
            return S1.f6(f00, ((g)x00), map0);
        }
        if(class0.equals(f.class)) {
            return U1.l6(f00, ((f)x00), map0);
        }
        if(class0.equals(e.class)) {
            return Y1.s6(f00, ((e)x00), map0);
        }
        if(class0.equals(d.class)) {
            return Q1.p6(f00, ((d)x00), map0);
        }
        if(class0.equals(c.class)) {
            return O1.h6(f00, ((c)x00), map0);
        }
        if(class0.equals(b.class)) {
            return M1.t6(f00, ((b)x00), map0);
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            return I1.h6(f00, ((com.dcinside.app.memo.q)x00), map0);
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            return K1.f6(f00, ((com.dcinside.app.memo.n)x00), map0);
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            return G1.f6(f00, ((com.dcinside.app.memo.m)x00), map0);
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            return E1.j6(f00, ((com.dcinside.app.dccon.setting.tag.b)x00), map0);
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        return C1.f6(f00, ((a)x00), map0);
    }

    @Override  // io.realm.internal.t
    public void v(F0 f00, Collection collection0) {
        Iterator iterator0 = collection0.iterator();
        HashMap hashMap0 = new HashMap(collection0.size());
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            X0 x00 = (X0)object0;
            Class class0 = x00 instanceof io.realm.internal.s ? x00.getClass().getSuperclass() : x00.getClass();
            boolean z = class0.equals(B0.class);
            Class class1 = B0.class;
            Class class2 = h0.class;
            Class class3 = z.class;
            Class class4 = j0.class;
            Class class5 = A.class;
            Class class6 = k0.class;
            Class class7 = B.class;
            Class class8 = s0.class;
            Class class9 = U.class;
            Class class10 = u0.class;
            Class class11 = b0.class;
            Class class12 = v0.class;
            Class class13 = c0.class;
            Class class14 = w0.class;
            Class class15 = d0.class;
            Class class16 = x0.class;
            Class class17 = e0.class;
            Class class18 = y0.class;
            Class class19 = f0.class;
            Class class20 = z0.class;
            Class class21 = g0.class;
            Class class22 = A0.class;
            if(z) {
                m3.b6(f00, ((B0)x00), hashMap0);
            }
            else if(class0.equals(class22)) {
                k3.v6(f00, ((A0)x00), hashMap0);
            }
            else if(class0.equals(class20)) {
                i3.l6(f00, ((z0)x00), hashMap0);
            }
            else if(class0.equals(class18)) {
                g3.i6(f00, ((y0)x00), hashMap0);
            }
            else if(class0.equals(class16)) {
                e3.l6(f00, ((x0)x00), hashMap0);
            }
            else if(class0.equals(class14)) {
                c3.j6(f00, ((w0)x00), hashMap0);
            }
            else if(class0.equals(class12)) {
                a3.l6(f00, ((v0)x00), hashMap0);
            }
            else if(class0.equals(class10)) {
                Y2.o6(f00, ((u0)x00), hashMap0);
            }
            else if(class0.equals(class8)) {
                W2.p6(f00, ((s0)x00), hashMap0);
            }
            else if(class0.equals(class6)) {
                U2.D6(f00, ((k0)x00), hashMap0);
            }
            else if(class0.equals(class4)) {
                S2.j6(f00, ((j0)x00), hashMap0);
            }
            else if(class0.equals(class2)) {
                O2.p6(f00, ((h0)x00), hashMap0);
            }
            else if(class0.equals(class21)) {
                Q2.h6(f00, ((g0)x00), hashMap0);
            }
            else if(class0.equals(class19)) {
                M2.L6(f00, ((f0)x00), hashMap0);
            }
            else if(class0.equals(class17)) {
                K2.l6(f00, ((e0)x00), hashMap0);
            }
            else if(class0.equals(class15)) {
                I2.w6(f00, ((d0)x00), hashMap0);
            }
            else if(class0.equals(class13)) {
                G2.o6(f00, ((c0)x00), hashMap0);
            }
            else if(class0.equals(class11)) {
                E2.m6(f00, ((b0)x00), hashMap0);
            }
            else if(class0.equals(class9)) {
                C2.h6(f00, ((U)x00), hashMap0);
            }
            else if(class0.equals(class7)) {
                A2.x7(f00, ((B)x00), hashMap0);
            }
            else if(class0.equals(class5)) {
                y2.l6(f00, ((A)x00), hashMap0);
            }
            else if(class0.equals(class3)) {
                w2.u6(f00, ((z)x00), hashMap0);
            }
            else if(class0.equals(y.class)) {
                u2.k6(f00, ((y)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.realm.t.class)) {
                s2.o6(f00, ((com.dcinside.app.realm.t)x00), hashMap0);
            }
            else if(class0.equals(s.class)) {
                q2.b6(f00, ((s)x00), hashMap0);
            }
            else if(class0.equals(r.class)) {
                o2.p6(f00, ((r)x00), hashMap0);
            }
            else if(class0.equals(q.class)) {
                m2.x6(f00, ((q)x00), hashMap0);
            }
            else if(class0.equals(o.class)) {
                k2.j6(f00, ((o)x00), hashMap0);
            }
            else if(class0.equals(n.class)) {
                i2.n6(f00, ((n)x00), hashMap0);
            }
            else if(class0.equals(m.class)) {
                g2.j6(f00, ((m)x00), hashMap0);
            }
            else if(class0.equals(l.class)) {
                e2.o6(f00, ((l)x00), hashMap0);
            }
            else if(class0.equals(k.class)) {
                c2.h6(f00, ((k)x00), hashMap0);
            }
            else if(class0.equals(j.class)) {
                a2.r6(f00, ((j)x00), hashMap0);
            }
            else if(class0.equals(h.class)) {
                W1.j6(f00, ((h)x00), hashMap0);
            }
            else if(class0.equals(g.class)) {
                S1.f6(f00, ((g)x00), hashMap0);
            }
            else if(class0.equals(f.class)) {
                U1.l6(f00, ((f)x00), hashMap0);
            }
            else if(class0.equals(e.class)) {
                Y1.s6(f00, ((e)x00), hashMap0);
            }
            else if(class0.equals(d.class)) {
                Q1.p6(f00, ((d)x00), hashMap0);
            }
            else if(class0.equals(c.class)) {
                O1.h6(f00, ((c)x00), hashMap0);
            }
            else if(class0.equals(b.class)) {
                M1.t6(f00, ((b)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.memo.q.class)) {
                I1.h6(f00, ((com.dcinside.app.memo.q)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.memo.n.class)) {
                K1.f6(f00, ((com.dcinside.app.memo.n)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.memo.m.class)) {
                G1.f6(f00, ((com.dcinside.app.memo.m)x00), hashMap0);
            }
            else if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
                E1.j6(f00, ((com.dcinside.app.dccon.setting.tag.b)x00), hashMap0);
            }
            else {
                if(!class0.equals(a.class)) {
                    throw t.k(class0);
                }
                C1.f6(f00, ((a)x00), hashMap0);
            }
            if(iterator0.hasNext()) {
                if(class0.equals(class1)) {
                    m3.c6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class22)) {
                    k3.w6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class20)) {
                    i3.m6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class18)) {
                    g3.j6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class16)) {
                    e3.m6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class14)) {
                    c3.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class12)) {
                    a3.m6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class10)) {
                    Y2.p6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class8)) {
                    W2.q6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class6)) {
                    U2.E6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class4)) {
                    S2.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class2)) {
                    O2.q6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class21)) {
                    Q2.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class19)) {
                    M2.M6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class17)) {
                    K2.m6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class15)) {
                    I2.x6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class13)) {
                    G2.p6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class11)) {
                    E2.n6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class9)) {
                    C2.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class7)) {
                    A2.y7(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class5)) {
                    y2.m6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(class3)) {
                    w2.v6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(y.class)) {
                    u2.l6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.realm.t.class)) {
                    s2.p6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(s.class)) {
                    q2.c6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(r.class)) {
                    o2.q6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(q.class)) {
                    m2.y6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(o.class)) {
                    k2.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(n.class)) {
                    i2.o6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(m.class)) {
                    g2.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(l.class)) {
                    e2.p6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(k.class)) {
                    c2.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(j.class)) {
                    a2.s6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(h.class)) {
                    W1.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(g.class)) {
                    S1.g6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(f.class)) {
                    U1.m6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(e.class)) {
                    Y1.t6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(d.class)) {
                    Q1.q6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(c.class)) {
                    O1.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(b.class)) {
                    M1.u6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.memo.q.class)) {
                    I1.i6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.memo.n.class)) {
                    K1.g6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.memo.m.class)) {
                    G1.g6(f00, iterator0, hashMap0);
                    return;
                }
                if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
                    E1.k6(f00, iterator0, hashMap0);
                    return;
                }
                if(!class0.equals(a.class)) {
                    throw t.k(class0);
                }
                C1.g6(f00, iterator0, hashMap0);
            }
        }
    }

    @Override  // io.realm.internal.t
    public boolean w(Class class0) {
        if(class0.equals(B0.class)) {
            return false;
        }
        if(class0.equals(A0.class)) {
            return false;
        }
        if(class0.equals(z0.class)) {
            return false;
        }
        if(class0.equals(y0.class)) {
            return false;
        }
        if(class0.equals(x0.class)) {
            return false;
        }
        if(class0.equals(w0.class)) {
            return false;
        }
        if(class0.equals(v0.class)) {
            return false;
        }
        if(class0.equals(u0.class)) {
            return false;
        }
        if(class0.equals(s0.class)) {
            return false;
        }
        if(class0.equals(k0.class)) {
            return false;
        }
        if(class0.equals(j0.class)) {
            return false;
        }
        if(class0.equals(h0.class)) {
            return false;
        }
        if(class0.equals(g0.class)) {
            return false;
        }
        if(class0.equals(f0.class)) {
            return false;
        }
        if(class0.equals(e0.class)) {
            return false;
        }
        if(class0.equals(d0.class)) {
            return false;
        }
        if(class0.equals(c0.class)) {
            return false;
        }
        if(class0.equals(b0.class)) {
            return false;
        }
        if(class0.equals(U.class)) {
            return false;
        }
        if(class0.equals(B.class)) {
            return false;
        }
        if(class0.equals(A.class)) {
            return false;
        }
        if(class0.equals(z.class)) {
            return false;
        }
        if(class0.equals(y.class)) {
            return false;
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            return false;
        }
        if(class0.equals(s.class)) {
            return false;
        }
        if(class0.equals(r.class)) {
            return false;
        }
        if(class0.equals(q.class)) {
            return false;
        }
        if(class0.equals(o.class)) {
            return false;
        }
        if(class0.equals(n.class)) {
            return false;
        }
        if(class0.equals(m.class)) {
            return false;
        }
        if(class0.equals(l.class)) {
            return false;
        }
        if(class0.equals(k.class)) {
            return false;
        }
        if(class0.equals(j.class)) {
            return false;
        }
        if(class0.equals(h.class)) {
            return false;
        }
        if(class0.equals(g.class)) {
            return false;
        }
        if(class0.equals(f.class)) {
            return false;
        }
        if(class0.equals(e.class)) {
            return false;
        }
        if(class0.equals(d.class)) {
            return false;
        }
        if(class0.equals(c.class)) {
            return false;
        }
        if(class0.equals(b.class)) {
            return false;
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            return false;
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            return false;
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            return false;
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            return false;
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        return false;
    }

    @Override  // io.realm.internal.t
    public X0 x(Class class0, Object object0, u u0, io.realm.internal.c c0, boolean z, List list0) {
        io.realm.a.h a$h0 = (io.realm.a.h)io.realm.a.q.get();
        try {
            a$h0.g(((io.realm.a)object0), u0, c0, z, list0);
            t.a(class0);
            if(class0.equals(B0.class)) {
                return (X0)class0.cast(new m3());
            }
            if(class0.equals(A0.class)) {
                return (X0)class0.cast(new k3());
            }
            if(class0.equals(z0.class)) {
                return (X0)class0.cast(new i3());
            }
            if(class0.equals(y0.class)) {
                return (X0)class0.cast(new g3());
            }
            if(class0.equals(x0.class)) {
                return (X0)class0.cast(new e3());
            }
            if(class0.equals(w0.class)) {
                return (X0)class0.cast(new c3());
            }
            if(class0.equals(v0.class)) {
                return (X0)class0.cast(new a3());
            }
            if(class0.equals(u0.class)) {
                return (X0)class0.cast(new Y2());
            }
            if(class0.equals(s0.class)) {
                return (X0)class0.cast(new W2());
            }
            if(class0.equals(k0.class)) {
                return (X0)class0.cast(new U2());
            }
            if(class0.equals(j0.class)) {
                return (X0)class0.cast(new S2());
            }
            if(class0.equals(h0.class)) {
                return (X0)class0.cast(new O2());
            }
            if(class0.equals(g0.class)) {
                return (X0)class0.cast(new Q2());
            }
            if(class0.equals(f0.class)) {
                return (X0)class0.cast(new M2());
            }
            if(class0.equals(e0.class)) {
                return (X0)class0.cast(new K2());
            }
            if(class0.equals(d0.class)) {
                return (X0)class0.cast(new I2());
            }
            if(class0.equals(c0.class)) {
                return (X0)class0.cast(new G2());
            }
            if(class0.equals(b0.class)) {
                return (X0)class0.cast(new E2());
            }
            if(class0.equals(U.class)) {
                return (X0)class0.cast(new C2());
            }
            if(class0.equals(B.class)) {
                return (X0)class0.cast(new A2());
            }
            if(class0.equals(A.class)) {
                return (X0)class0.cast(new y2());
            }
            if(class0.equals(z.class)) {
                return (X0)class0.cast(new w2());
            }
            if(class0.equals(y.class)) {
                return (X0)class0.cast(new u2());
            }
            if(class0.equals(com.dcinside.app.realm.t.class)) {
                return (X0)class0.cast(new s2());
            }
            if(class0.equals(s.class)) {
                return (X0)class0.cast(new q2());
            }
            if(class0.equals(r.class)) {
                return (X0)class0.cast(new o2());
            }
            if(class0.equals(q.class)) {
                return (X0)class0.cast(new m2());
            }
            if(class0.equals(o.class)) {
                return (X0)class0.cast(new k2());
            }
            if(class0.equals(n.class)) {
                return (X0)class0.cast(new i2());
            }
            if(class0.equals(m.class)) {
                return (X0)class0.cast(new g2());
            }
            if(class0.equals(l.class)) {
                return (X0)class0.cast(new e2());
            }
            if(class0.equals(k.class)) {
                return (X0)class0.cast(new c2());
            }
            if(class0.equals(j.class)) {
                return (X0)class0.cast(new a2());
            }
            if(class0.equals(h.class)) {
                return (X0)class0.cast(new W1());
            }
            if(class0.equals(g.class)) {
                return (X0)class0.cast(new S1());
            }
            if(class0.equals(f.class)) {
                return (X0)class0.cast(new U1());
            }
            if(class0.equals(e.class)) {
                return (X0)class0.cast(new Y1());
            }
            if(class0.equals(d.class)) {
                return (X0)class0.cast(new Q1());
            }
            if(class0.equals(c.class)) {
                return (X0)class0.cast(new O1());
            }
            if(class0.equals(b.class)) {
                return (X0)class0.cast(new M1());
            }
            if(class0.equals(com.dcinside.app.memo.q.class)) {
                return (X0)class0.cast(new I1());
            }
            if(class0.equals(com.dcinside.app.memo.n.class)) {
                return (X0)class0.cast(new K1());
            }
            if(class0.equals(com.dcinside.app.memo.m.class)) {
                return (X0)class0.cast(new G1());
            }
            if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
                return (X0)class0.cast(new E1());
            }
            if(class0.equals(a.class)) {
                return (X0)class0.cast(new C1());
            }
        }
        finally {
            a$h0.a();
        }
        throw t.k(class0);
    }

    @Override  // io.realm.internal.t
    public boolean y() {
        return true;
    }

    @Override  // io.realm.internal.t
    public void z(F0 f00, X0 x00, X0 x01, Map map0, Set set0) {
        Class class0 = x01.getClass().getSuperclass();
        if(class0.equals(B0.class)) {
            throw t.n("com.dcinside.app.realm.YoutubeSearchCache");
        }
        if(class0.equals(A0.class)) {
            throw t.n("com.dcinside.app.realm.VoiceArchive");
        }
        if(class0.equals(z0.class)) {
            throw t.n("com.dcinside.app.realm.UserNoticeInfo");
        }
        if(class0.equals(y0.class)) {
            throw t.n("com.dcinside.app.realm.UserFavorite");
        }
        if(class0.equals(x0.class)) {
            throw t.n("com.dcinside.app.realm.SearchGalleryItem");
        }
        if(class0.equals(w0.class)) {
            throw t.n("com.dcinside.app.realm.SearchGalleryCategory");
        }
        if(class0.equals(v0.class)) {
            throw t.n("com.dcinside.app.realm.ReplyHistory");
        }
        if(class0.equals(u0.class)) {
            throw t.n("com.dcinside.app.realm.RecentSearch");
        }
        if(class0.equals(s0.class)) {
            throw t.n("com.dcinside.app.realm.Recent");
        }
        if(class0.equals(k0.class)) {
            throw t.n("com.dcinside.app.realm.PostWrite");
        }
        if(class0.equals(j0.class)) {
            throw t.n("com.dcinside.app.realm.PostTemp");
        }
        if(class0.equals(h0.class)) {
            throw t.n("com.dcinside.app.realm.PostSeriesItem");
        }
        if(class0.equals(g0.class)) {
            throw t.n("com.dcinside.app.realm.PostSeries");
        }
        if(class0.equals(f0.class)) {
            throw t.n("com.dcinside.app.realm.PostHistory");
        }
        if(class0.equals(e0.class)) {
            throw t.n("com.dcinside.app.realm.PostArticle");
        }
        if(class0.equals(d0.class)) {
            throw t.n("com.dcinside.app.realm.PostArchive");
        }
        if(class0.equals(c0.class)) {
            throw t.n("com.dcinside.app.realm.Policy");
        }
        if(class0.equals(b0.class)) {
            throw t.n("com.dcinside.app.realm.MatchOtp");
        }
        if(class0.equals(U.class)) {
            throw t.n("com.dcinside.app.realm.ManagerBlockImage");
        }
        if(class0.equals(B.class)) {
            throw t.n("com.dcinside.app.realm.Login");
        }
        if(class0.equals(A.class)) {
            throw t.n("com.dcinside.app.realm.LastManagerSituation");
        }
        if(class0.equals(z.class)) {
            throw t.n("com.dcinside.app.realm.ImageDownloadInfo");
        }
        if(class0.equals(y.class)) {
            throw t.n("com.dcinside.app.realm.HateWord");
        }
        if(class0.equals(com.dcinside.app.realm.t.class)) {
            throw t.n("com.dcinside.app.realm.GuestUserInfo");
        }
        if(class0.equals(s.class)) {
            throw t.n("com.dcinside.app.realm.GalleryZipInfo");
        }
        if(class0.equals(r.class)) {
            throw t.n("com.dcinside.app.realm.GalleryTextOption");
        }
        if(class0.equals(q.class)) {
            throw t.n("com.dcinside.app.realm.GalleryParams");
        }
        if(class0.equals(o.class)) {
            throw t.n("com.dcinside.app.realm.GalleryOptions");
        }
        if(class0.equals(n.class)) {
            throw t.n("com.dcinside.app.realm.FcmMsg");
        }
        if(class0.equals(m.class)) {
            throw t.n("com.dcinside.app.realm.FavoriteGallery");
        }
        if(class0.equals(l.class)) {
            throw t.n("com.dcinside.app.realm.DefaultImage");
        }
        if(class0.equals(k.class)) {
            throw t.n("com.dcinside.app.realm.DcconGuestHistory");
        }
        if(class0.equals(j.class)) {
            throw t.n("com.dcinside.app.realm.BlockReportedPost");
        }
        if(class0.equals(h.class)) {
            throw t.n("com.dcinside.app.realm.BlockPostImage");
        }
        if(class0.equals(g.class)) {
            throw t.n("com.dcinside.app.realm.BlockDCConItem");
        }
        if(class0.equals(f.class)) {
            throw t.n("com.dcinside.app.realm.BlockDCCon");
        }
        if(class0.equals(e.class)) {
            throw t.n("com.dcinside.app.realm.Block");
        }
        if(class0.equals(d.class)) {
            throw t.n("com.dcinside.app.realm.ArchiveFolderParent");
        }
        if(class0.equals(c.class)) {
            throw t.n("com.dcinside.app.realm.ArchiveFolderChild");
        }
        if(class0.equals(b.class)) {
            throw t.n("com.dcinside.app.realm.AiPromptHistory");
        }
        if(class0.equals(com.dcinside.app.memo.q.class)) {
            throw t.n("com.dcinside.app.memo.UserMemoItem");
        }
        if(class0.equals(com.dcinside.app.memo.n.class)) {
            throw t.n("com.dcinside.app.memo.UserMemo");
        }
        if(class0.equals(com.dcinside.app.memo.m.class)) {
            throw t.n("com.dcinside.app.memo.RecentAddUserMemo");
        }
        if(class0.equals(com.dcinside.app.dccon.setting.tag.b.class)) {
            throw t.n("com.dcinside.app.dccon.setting.tag.DcconTagItem");
        }
        if(!class0.equals(a.class)) {
            throw t.k(class0);
        }
        throw t.n("com.dcinside.app.dccon.setting.tag.DcconTagGroup");
    }
}

