package io.realm.internal;

import io.realm.P0;
import io.realm.Q;
import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class p implements u {
    public interface b {
        void a(u arg1);
    }

    private OsSharedRealm a;
    private OsResults b;
    private P0 c;
    private WeakReference d;
    private boolean e;
    private static final String f = "The pending query has not been executed.";
    private static final String g = "The \'frontEnd\' has not been set.";
    private static final String h = "The query has been executed. This \'PendingRow\' is not valid anymore.";

    public p(OsSharedRealm osSharedRealm0, TableQuery tableQuery0, boolean z) {
        class a implements P0 {
            final p a;

            @Override  // io.realm.P0
            public void M(Object object0) {
                this.a(((p)object0));
            }

            public void a(p p0) {
                p.this.v();
            }
        }

        this.a = osSharedRealm0;
        this.b = OsResults.l(osSharedRealm0, tableQuery0);
        a p$a0 = new a(this);
        this.c = p$a0;
        this.b.d(this, p$a0);
        this.e = z;
        osSharedRealm0.addPendingRow(this);
    }

    @Override  // io.realm.internal.u
    public void A(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public long B(String s) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public OsMap C(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public boolean D(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public RealmFieldType E(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public long F() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void G(long v, float f) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public long H(long v, RealmFieldType realmFieldType0) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public OsMap I(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void J(long v, ObjectId objectId0) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void K(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public long L(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public float M(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void N(long v, Date date0) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public OsSet O(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public boolean P(String s) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public boolean Q(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public Date R(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void S(long v, Decimal128 decimal1280) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void T() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public String U(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public OsMap V(long v, RealmFieldType realmFieldType0) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void W(long v, double f) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public u X(OsSharedRealm osSharedRealm0) {
        return Q.a;
    }

    @Override  // io.realm.internal.u
    public void a(long v, String s) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public Table b() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public UUID c(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void d(long v, long v1) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void e(long v, long v1) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public boolean e0() {
        return false;
    }

    @Override  // io.realm.internal.u
    public boolean f(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public OsSet g(long v, RealmFieldType realmFieldType0) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public long getColumnCount() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public String[] getColumnNames() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public NativeRealmAny h(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public byte[] i(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public double j(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void k(long v, UUID uUID0) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public OsList l(long v, RealmFieldType realmFieldType0) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void m(long v, byte[] arr_b) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public Decimal128 n(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void p(long v, boolean z) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    private void q() {
        this.b.E(this, this.c);
        this.b = null;
        this.c = null;
        this.a.removePendingRow(this);
    }

    @Override  // io.realm.internal.u
    public OsSet r(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public boolean s() {
        return false;
    }

    public void t() {
        if(this.b == null) {
            throw new IllegalStateException("The query has been executed. This \'PendingRow\' is not valid anymore.");
        }
        this.v();
    }

    @Override  // io.realm.internal.u
    public ObjectId u(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    private void v() {
        WeakReference weakReference0 = this.d;
        if(weakReference0 == null) {
            throw new IllegalStateException("The \'frontEnd\' has not been set.");
        }
        b p$b0 = (b)weakReference0.get();
        if(p$b0 == null) {
            this.q();
            return;
        }
        if(this.b.z()) {
            UncheckedRow uncheckedRow0 = this.b.r();
            this.q();
            if(uncheckedRow0 != null) {
                if(this.e) {
                    uncheckedRow0 = CheckedRow.x(uncheckedRow0);
                }
                p$b0.a(uncheckedRow0);
                return;
            }
            p$b0.a(i.a);
            return;
        }
        this.q();
    }

    @Override  // io.realm.internal.u
    public long w(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public void x(b p$b0) {
        this.d = new WeakReference(p$b0);
    }

    @Override  // io.realm.internal.u
    public OsList y(long v) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override  // io.realm.internal.u
    public void z(long v, long v1) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
}

