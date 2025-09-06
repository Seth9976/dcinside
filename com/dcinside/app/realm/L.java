package com.dcinside.app.realm;

import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.d1;
import io.realm.f2;
import io.realm.g1;
import io.realm.internal.s;
import io.realm.r1;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.random.f;
import timber.log.b;
import y4.m;
import z3.n;

public class l extends d1 implements f2 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        @n
        public final l a(@m F0 f00, @m String s, boolean z) {
            Class class0 = l.class;
            if(f00 != null && s != null) {
                try {
                    RealmQuery realmQuery0 = f00.C4(class0).i0("galleryId", "__DC_GLOBAL_DEF_IMAGE_ID");
                    if(!z) {
                        realmQuery0.g1("promptData");
                    }
                    r1 r10 = r1.c;
                    g1 g10 = realmQuery0.g2("pick", r10).p0();
                    L.m(g10);
                    l l0 = (l)u.G2(g10);
                    boolean z1 = false;
                    boolean z2 = l0 == null ? false : l0.W5();
                    RealmQuery realmQuery1 = f00.C4(class0).i0("galleryId", s);
                    if(!z) {
                        realmQuery1.g1("promptData");
                    }
                    g1 g11 = realmQuery1.g2("pick", r10).p0();
                    L.m(g11);
                    l l1 = (l)u.G2(g11);
                    if(l1 != null) {
                        z1 = l1.W5();
                    }
                    if(z2) {
                        l0 = (l)u.K4(g10, f.a);
                    }
                    if(z1) {
                        l1 = (l)u.K4(g11, f.a);
                    }
                    return l1 == null ? l0 : l1;
                }
                catch(Exception exception0) {
                }
                b.a.y(exception0);
            }
            return null;
        }
    }

    @m
    private String d;
    @m
    private String e;
    @m
    private String f;
    private boolean g;
    private boolean h;
    @m
    private String i;
    @y4.l
    public static final a j;

    static {
        l.j = new a(null);
    }

    public l() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.f2
    public void A3(boolean z) {
        this.h = z;
    }

    @Override  // io.realm.f2
    public String P4() {
        return this.f;
    }

    @m
    @n
    public static final l Q5(@m F0 f00, @m String s, boolean z) {
        return l.j.a(f00, s, z);
    }

    @m
    public String R5() {
        return this.a();
    }

    @m
    public String S5() {
        return this.j();
    }

    @m
    public String T5() {
        return this.P4();
    }

    public boolean U5() {
        return this.p4();
    }

    @m
    public String V5() {
        return this.l0();
    }

    public boolean W5() {
        return this.j4();
    }

    public void X5(@m String s) {
        this.b(s);
    }

    @Override  // io.realm.f2
    public void Y1(String s) {
        this.f = s;
    }

    public void Y5(@m String s) {
        this.h(s);
    }

    @Override  // io.realm.f2
    public void Z2(String s) {
        this.i = s;
    }

    public void Z5(@m String s) {
        this.Y1(s);
    }

    @Override  // io.realm.f2
    public String a() {
        return this.d;
    }

    public void a6(boolean z) {
        this.h3(z);
    }

    @Override  // io.realm.f2
    public void b(String s) {
        this.d = s;
    }

    public void b6(@m String s) {
        this.Z2(s);
    }

    public void c6(boolean z) {
        this.A3(z);
    }

    @Override  // io.realm.f2
    public void h(String s) {
        this.e = s;
    }

    @Override  // io.realm.f2
    public void h3(boolean z) {
        this.g = z;
    }

    @Override  // io.realm.f2
    public String j() {
        return this.e;
    }

    @Override  // io.realm.f2
    public boolean j4() {
        return this.h;
    }

    @Override  // io.realm.f2
    public String l0() {
        return this.i;
    }

    @Override  // io.realm.f2
    public boolean p4() {
        return this.g;
    }
}

