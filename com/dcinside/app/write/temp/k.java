package com.dcinside.app.write.temp;

import com.dcinside.app.base.i;
import com.dcinside.app.internal.t;
import com.dcinside.app.realm.j0;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import io.realm.r1;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPostTempItemManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTempItemManager.kt\ncom/dcinside/app/write/temp/PostTempItemManager\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,165:1\n147#2:166\n1#3:167\n37#4,2:168\n37#4,2:170\n*S KotlinDebug\n*F\n+ 1 PostTempItemManager.kt\ncom/dcinside/app/write/temp/PostTempItemManager\n*L\n22#1:166\n112#1:168,2\n117#1:170,2\n*E\n"})
public final class k implements i, P0 {
    public interface a {
        void D(@l k arg1, int arg2);

        void H(@l k arg1);

        void V(@l k arg1, boolean arg2);
    }

    @l
    private t a;
    @m
    private F0 b;
    private boolean c;
    @l
    private Set d;
    @m
    private g1 e;
    private boolean f;

    public k(@l a k$a0) {
        L.p(k$a0, "listener");
        g1 g10;
        super();
        this.a = new t(k$a0);
        this.b = F0.g4();
        this.d = new LinkedHashSet();
        F0 f00 = this.b;
        if(f00 == null) {
            g10 = null;
        }
        else {
            RealmQuery realmQuery0 = f00.C4(j0.class);
            if(realmQuery0 == null) {
                g10 = null;
            }
            else {
                RealmQuery realmQuery1 = realmQuery0.g2("time", r1.c);
                g10 = realmQuery1 == null ? null : realmQuery1.p0();
            }
        }
        this.e = g10;
        if(g10 != null) {
            g10.l(this);
        }
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.l(((g1)object0));
    }

    private final void b() {
        this.p(false);
        this.d.clear();
        a k$a0 = (a)this.a.a();
        if(k$a0 != null) {
            k$a0.H(this);
        }
    }

    public final int c() {
        g1 g11;
        g1 g10 = this.e;
        if(g10 == null) {
            return 0;
        }
        if(this.j()) {
            int v = this.g();
            F0 f00 = g10.h();
            L.o(f00, "getRealm(...)");
            j0.h.b(f00, g10);
            return v;
        }
        if(this.f) {
            g11 = this.d.size() <= 0 ? g10 : g10.x4().M1().W0("time", ((Long[])this.d.toArray(new Long[0]))).p0();
            L.m(g11);
        }
        else if(this.d.size() > 0) {
            g11 = g10.x4().W0("time", ((Long[])this.d.toArray(new Long[0]))).p0();
            L.m(g11);
        }
        else {
            return 0;
        }
        g10.h().Y3((F0 f00) -> {
            L.p(g11, "$deleteItems");
            F0 f01 = g11.h();
            L.o(f01, "getRealm(...)");
            j0.h.b(f01, g11);
        });
        return g11.size();
    }

    // 检测为 Lambda 实现
    private static final void d(g1 g10, F0 f00) [...]

    // 去混淆评级： 低(20)
    public final int e() {
        return this.f ? this.g() - this.d.size() : this.d.size();
    }

    @m
    public final j0 f(int v) {
        g1 g10 = this.e;
        if(g10 != null) {
            if(v < 0 || v >= g10.size()) {
                g10 = null;
            }
            return g10 == null ? null : ((j0)g10.get(v));
        }
        return null;
    }

    public final int g() {
        g1 g10 = this.e;
        if(g10 != null) {
            int v = g10.size();
            if(v != 0) {
                return this.c ? v : v + 1;
            }
        }
        return 0;
    }

    public final int h() {
        return this.e == null ? 0 : this.e.size();
    }

    public final boolean i(@l j0 j00) {
        L.p(j00, "item");
        return this.f ? !this.d.contains(j00.T5()) : this.d.contains(j00.T5());
    }

    public final boolean j() {
        if(this.g() != 0) {
            return this.f ? this.d.size() == 0 : this.d.size() == this.g();
        }
        return false;
    }

    public final boolean k() {
        return this.c;
    }

    public void l(@l g1 g10) {
        L.p(g10, "t");
        this.b();
        a k$a0 = (a)this.a.a();
        if(k$a0 != null) {
            k$a0.D(this, (this.e == null ? 0 : this.e.size()));
        }
    }

    public final void m(boolean z, @l j0 j00) {
        L.p(j00, "item");
        if(!this.f) {
            if(z) {
                this.d.add(j00.T5());
            }
            else {
                this.d.remove(j00.T5());
            }
        }
        else if(!z) {
            this.d.add(j00.T5());
        }
        else {
            this.d.remove(j00.T5());
        }
        a k$a0 = (a)this.a.a();
        if(k$a0 != null) {
            k$a0.H(this);
        }
    }

    public final void n(boolean z) {
        if(this.g() == 0) {
            z = false;
        }
        this.p(z);
    }

    public final void o(boolean z) {
        this.c = z;
        this.b();
        a k$a0 = (a)this.a.a();
        if(k$a0 != null) {
            k$a0.V(this, z);
        }
    }

    private final void p(boolean z) {
        this.f = z;
        this.d.clear();
        a k$a0 = (a)this.a.a();
        if(k$a0 != null) {
            k$a0.H(this);
        }
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        g1 g10 = this.e;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.e = null;
        F0 f00 = this.b;
        if(f00 != null) {
            if(f00.isClosed()) {
                f00 = null;
            }
            if(f00 != null) {
                f00.close();
            }
        }
        this.b = null;
    }
}

