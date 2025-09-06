package com.dcinside.app.post.fragments;

import com.dcinside.app.internal.t;
import com.dcinside.app.realm.f0;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import j..util.concurrent.ConcurrentHashMap;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPostListReadStatusHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListReadStatusHelper.kt\ncom/dcinside/app/post/fragments/PostListReadStatusHelper\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 5 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,63:1\n147#2:64\n1#3:65\n1#3:70\n37#4:66\n37#4:71\n120#5,3:67\n124#5:72\n*S KotlinDebug\n*F\n+ 1 PostListReadStatusHelper.kt\ncom/dcinside/app/post/fragments/PostListReadStatusHelper\n*L\n26#1:64\n47#1:70\n39#1:66\n48#1:71\n47#1:67,3\n47#1:72\n*E\n"})
public final class u1 implements P0 {
    @l
    private t a;
    @m
    private g1 b;
    @l
    private String c;
    @l
    private ConcurrentHashMap d;

    public u1() {
        this.a = new t(null, 1, null);
        this.c = "";
        this.d = new ConcurrentHashMap();
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.c(((g1)object0));
    }

    public final void a(@l String s, @m F0 f00) {
        L.p(s, "galleryId");
        if(L.g(this.c, s)) {
            return;
        }
        this.c = s;
        this.d.clear();
        g1 g10 = this.b;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        if(L.g(s, "") || f00 == null || f00.isClosed()) {
            this.b = null;
        }
        else {
            RealmQuery realmQuery0 = f00.C4(f0.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            g1 g11 = realmQuery0.i0("galleryId", s).p0();
            this.b = g11;
            if(g11 != null) {
                g11.l(this);
            }
        }
    }

    public final boolean b(int v) {
        Boolean boolean1;
        Boolean boolean0 = (Boolean)this.d.get(v);
        if(boolean0 == null) {
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                RealmQuery realmQuery0 = f00.C4(f0.class);
                L.o(realmQuery0, "this.where(T::class.java)");
                RealmQuery realmQuery1 = realmQuery0.i0("key", f0.t.d(this.c, v));
                boolean z = false;
                if(realmQuery1 != null) {
                    f0 f01 = (f0)realmQuery1.r0();
                    if(f01 != null && f01.e6()) {
                        z = true;
                    }
                }
                boolean1 = Boolean.valueOf(z);
                goto label_19;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                c.a(f00, throwable0);
                throw throwable1;
            }
        label_19:
            c.a(f00, null);
            this.d.put(v, boolean1);
            return boolean1.booleanValue();
        }
        return boolean0.booleanValue();
    }

    public void c(@l g1 g10) {
        L.p(g10, "results");
        for(Object object0: g10) {
            this.d.put(((f0)object0).d6(), Boolean.valueOf(((f0)object0).e6()));
        }
        U u0 = (U)this.a.a();
        if(u0 != null) {
            u0.b();
        }
    }

    public final void d(@l U u0) {
        L.p(u0, "listener");
        this.a = new t(u0);
    }
}

