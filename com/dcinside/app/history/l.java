package com.dcinside.app.history;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.realm.f0;
import com.dcinside.app.util.Bk;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.g1;
import io.realm.r1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.D;
import kotlin.E;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import y4.m;

@s0({"SMAP\nPostHistoryItemManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHistoryItemManager.kt\ncom/dcinside/app/history/PostHistoryItemManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,256:1\n1#2:257\n177#3,9:258\n37#4:267\n37#4:272\n37#5,2:268\n37#5,2:270\n*S KotlinDebug\n*F\n+ 1 PostHistoryItemManager.kt\ncom/dcinside/app/history/PostHistoryItemManager\n*L\n100#1:258,9\n203#1:267\n231#1:272\n211#1:268,2\n217#1:270,2\n*E\n"})
public final class l {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @y4.l
    private final Context a;
    private final boolean b;
    private final boolean c;
    private final int d;
    @y4.l
    private final D e;
    @y4.l
    private final D f;
    @y4.l
    private final D g;
    @y4.l
    private final D h;
    @y4.l
    private List i;
    @y4.l
    private Map j;
    private boolean k;
    @y4.l
    private HashSet l;
    @y4.l
    private Map m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    @y4.l
    public static final a r = null;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    public static final int x = 5;
    public static final long y = 30L;

    static {
        l.r = new a(null);
    }

    public l(@y4.l Context context0, boolean z, boolean z1, int v) {
        static final class b extends N implements A3.a {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(0);
            }

            @y4.l
            public final k b() {
                return new k(3, "");
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class c extends N implements A3.a {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(0);
            }

            @y4.l
            public final k b() {
                return new k(5, "");
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class d extends N implements A3.a {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(0);
            }

            @y4.l
            public final k b() {
                return new k(2, "");
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class e extends N implements A3.a {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(0);
            }

            @y4.l
            public final k b() {
                return new k(4, "");
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super();
        this.a = context0;
        this.b = z;
        this.c = z1;
        this.d = v;
        this.e = E.a(d.e);
        this.f = E.a(e.e);
        this.g = E.a(b.e);
        this.h = E.a(c.e);
        this.i = new ArrayList();
        this.j = new LinkedHashMap();
        this.l = new HashSet();
        this.m = new LinkedHashMap();
    }

    public l(Context context0, boolean z, boolean z1, int v, int v1, w w0) {
        if((v1 & 4) != 0) {
            z1 = false;
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(context0, z, z1, v);
    }

    public final boolean A(int v) {
        k k0 = this.n(v);
        if(k0 != null) {
            String s = k0.a();
            if(s != null) {
                boolean z = this.v(s);
                this.m.put(s, Boolean.valueOf(!z));
                return !z;
            }
        }
        return false;
    }

    public final void a(@y4.l List list0, boolean z) {
        String s1;
        L.p(list0, "list");
        this.q = z;
        k k0 = (k)u.v3(this.i);
        if(k0 != null && k0.b() == 4) {
            this.i.remove(u.J(this.i));
        }
        k k1 = (k)u.v3(this.i);
        if(k1 != null && k1.b() == 2) {
            this.i.remove(u.J(this.i));
        }
        if(this.b) {
            k k2 = this.c ? this.m() : this.l();
            String s = k2.a();
            if(this.i.isEmpty()) {
                this.i.add(k2);
            }
            List list1 = (List)this.j.get(s);
            if(list1 == null) {
                list1 = new ArrayList();
                this.j.put(s, list1);
            }
            else if(!v0.F(list1)) {
                list1 = new ArrayList();
                this.j.put(s, list1);
            }
            for(Object object0: list0) {
                list1.addAll(((List)object0));
            }
        }
        else {
            for(Object object1: list0) {
                List list2 = (List)object1;
                if(!list2.isEmpty()) {
                    try {
                        long v = ((f0)u.B2(list2)).h6();
                        s1 = null;
                        s1 = Bk.a.B(v);
                    }
                    catch(Exception unused_ex) {
                    }
                    if(s1 == null) {
                        s1 = "";
                    }
                    k k3 = new k(0, s1);
                    if(((List)this.j.get(k3.a())) == null) {
                        this.i.add(k3);
                        this.j.put(k3.a(), list2);
                    }
                }
            }
        }
        if(!this.b && this.i.size() > 0) {
            this.i.add(this.q());
        }
        if(!z) {
            this.i.add(this.r());
        }
    }

    public final void b(int v, int v1, boolean z) {
        AppCompatActivity appCompatActivity0 = null;
        f0 f00 = this.i(v, v1);
        if(f00 != null) {
            if(!f00.s()) {
                f00 = null;
            }
            if(f00 != null) {
                String s = f00.a6();
                if(s != null) {
                    if(this.k) {
                        if(!z) {
                            this.l.add(s);
                            return;
                        }
                        this.l.remove(s);
                        return;
                    }
                    if(z) {
                        if(!this.c) {
                            this.l.add(s);
                            return;
                        }
                        if(this.f() < this.d) {
                            this.l.add(s);
                            return;
                        }
                        Context context0 = this.a;
                        if(context0 instanceof AppCompatActivity) {
                            appCompatActivity0 = (AppCompatActivity)context0;
                        }
                        if(appCompatActivity0 != null) {
                            com.dcinside.app.internal.c.v(appCompatActivity0, 0x7F15094E);  // string:series_post_append_limit "추가할 수 있는 게시물 개수를 초과했습니다."
                        }
                    }
                    else {
                        this.l.remove(s);
                    }
                }
            }
        }
    }

    public final void c(boolean z) {
        this.k = z;
        this.l.clear();
    }

    public final void d() {
        this.q = false;
        this.k = false;
        if(!this.c) {
            this.l.clear();
        }
        this.i.clear();
        this.j.clear();
        this.m.clear();
    }

    @y4.l
    public final List e(@y4.l F0 f00, long v, long v1) {
        L.p(f00, "realm");
        RealmQuery realmQuery0 = f00.C4(f0.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        RealmQuery realmQuery1 = realmQuery0.b0("read", Boolean.TRUE).b0("hide", Boolean.FALSE);
        if(this.n) {
            realmQuery1 = realmQuery1.b0("write", Boolean.TRUE);
        }
        if(this.o) {
            realmQuery1 = realmQuery1.b0("reply", Boolean.TRUE);
        }
        if(this.p) {
            realmQuery1 = realmQuery1.b0("like", Boolean.TRUE);
        }
        g1 g10 = realmQuery1.K0("time", v).m1("time", v1).g2("time", r1.c).p0();
        L.o(g10, "findAll(...)");
        return u.Y5(g10);
    }

    public final int f() {
        return this.l.size();
    }

    @y4.l
    public final ArrayList g() {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(this.l);
        return arrayList0;
    }

    @m
    public final g1 h(@y4.l F0 f00) {
        L.p(f00, "realm");
        HashSet hashSet0 = this.l;
        RealmQuery realmQuery0 = f00.C4(f0.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        RealmQuery realmQuery1 = realmQuery0.b0("read", Boolean.TRUE).b0("hide", Boolean.FALSE);
        if(this.n) {
            realmQuery1 = realmQuery1.b0("write", Boolean.TRUE);
        }
        if(this.o) {
            realmQuery1 = realmQuery1.b0("reply", Boolean.TRUE);
        }
        if(this.p) {
            realmQuery1 = realmQuery1.b0("like", Boolean.TRUE);
        }
        if(this.k) {
            return hashSet0.isEmpty() ? realmQuery1.p0() : realmQuery1.M1().Y0("key", ((String[])hashSet0.toArray(new String[0]))).p0();
        }
        return hashSet0.isEmpty() ? null : realmQuery1.Y0("key", ((String[])hashSet0.toArray(new String[0]))).p0();
    }

    @m
    public final f0 i(int v, int v1) {
        k k0 = this.n(v);
        if(k0 != null) {
            String s = k0.a();
            if(s != null) {
                List list0 = (List)this.j.get(s);
                return list0 == null ? null : ((f0)u.W2(list0, v1));
            }
        }
        return null;
    }

    public final int j(int v) {
        k k0 = this.n(v);
        if(k0 == null) {
            return 0;
        }
        switch(k0.b()) {
            case 2: 
            case 4: {
                return 0;
            }
            default: {
                List list0 = (List)this.j.get(k0.a());
                return list0 == null ? 0 : list0.size();
            }
        }
    }

    @y4.l
    public final Context k() {
        return this.a;
    }

    private final k l() {
        return (k)this.g.getValue();
    }

    private final k m() {
        return (k)this.h.getValue();
    }

    @m
    public final k n(int v) {
        return (k)u.W2(this.i, v);
    }

    public final int o() {
        return this.i.size();
    }

    public final int p() {
        return this.d;
    }

    private final k q() {
        return (k)this.e.getValue();
    }

    private final k r() {
        return (k)this.f.getValue();
    }

    public final boolean s(@m String s) {
        if(s != null) {
            return this.k ? !this.l.contains(s) : this.l.contains(s);
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public final boolean t() {
        return this.l.isEmpty() ? this.k : false;
    }

    public final boolean u(int v) {
        k k0 = this.n(v);
        if(k0 != null) {
            String s = k0.a();
            return s == null ? false : this.v(s);
        }
        return false;
    }

    public final boolean v(@y4.l String s) {
        L.p(s, "head");
        Boolean boolean0 = this.m.get(s);
        if(boolean0 == null) {
            boolean0 = Boolean.FALSE;
        }
        return boolean0.booleanValue();
    }

    public final boolean w() {
        return this.q;
    }

    public final boolean x() {
        return this.b;
    }

    public final boolean y() {
        return this.c;
    }

    public final void z(boolean z, boolean z1, boolean z2) {
        this.n = z;
        this.o = z1;
        this.p = z2;
    }
}

