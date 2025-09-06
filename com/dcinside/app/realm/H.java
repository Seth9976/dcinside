package com.dcinside.app.realm;

import android.content.Context;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.W;
import io.realm.X1;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class h extends d1 implements X1 {
    @s0({"SMAP\nBlockPostImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockPostImage.kt\ncom/dcinside/app/realm/BlockPostImage$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n112#2,3:76\n129#2,15:80\n116#2:95\n129#2,15:96\n120#2,3:111\n124#2:115\n1#3:79\n1#3:114\n*S KotlinDebug\n*F\n+ 1 BlockPostImage.kt\ncom/dcinside/app/realm/BlockPostImage$Companion\n*L\n44#1:76,3\n44#1:80,15\n44#1:95\n44#1:96,15\n64#1:111,3\n64#1:115\n44#1:79\n64#1:114\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @m String s, @m String s1, @m String s2) {
            Class class0;
            L.p(context0, "context");
            if(s == null) {
                return;
            }
            if(s1 == null) {
                return;
            }
            if(s2 == null) {
                return;
            }
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = h.class;
            if(z) {
                goto label_30;
            }
            else {
                f00.beginTransaction();
                goto label_13;
            }
            goto label_49;
            try {
            label_13:
                h h0 = (h)f00.C4(class0).i0("fileName", s1).i0("fileSize", s2).r0();
                if(h0 == null) {
                    h h1 = new h();
                    h1.X5(s);
                    h1.V5(s1);
                    h1.W5(s2);
                    h1.U5(System.currentTimeMillis());
                    f00.o2(h1, new W[0]);
                }
                else {
                    h0.U5(System.currentTimeMillis());
                }
                Dl.D(context0, 0x7F1509F1);  // string:success_block_image "차단되었습니다."
                f00.p();
                goto label_49;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_30:
                h h2 = (h)f00.C4(class0).i0("fileName", s1).i0("fileSize", s2).r0();
                if(h2 == null) {
                    h h3 = new h();
                    h3.X5(s);
                    h3.V5(s1);
                    h3.W5(s2);
                    h3.U5(System.currentTimeMillis());
                    f00.o2(h3, new W[0]);
                }
                else {
                    h2.U5(System.currentTimeMillis());
                }
                Dl.D(context0, 0x7F1509F1);  // string:success_block_image "차단되었습니다."
                goto label_49;
            }
            catch(Throwable throwable2) {
            }
            try {
                throw throwable2;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable3) {
                c.a(f00, throwable0);
                throw throwable3;
            }
        label_49:
            c.a(f00, null);
        }

        public final boolean b(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "size");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                RealmQuery realmQuery0 = f00.C4(h.class);
                realmQuery0.i0("fileSize", s1);
                if(dl.a.k1() == com.dcinside.app.type.w.d.d()) {
                    realmQuery0.d2().i0("fileName", s);
                }
                if(realmQuery0.r0() == null) {
                    goto label_17;
                }
                else {
                    goto label_15;
                }
                goto label_18;
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
        label_15:
            boolean z = true;
            goto label_18;
        label_17:
            z = false;
        label_18:
            c.a(f00, null);
            return z;
        }
    }

    @m
    private String d;
    @m
    private String e;
    @m
    private String f;
    private long g;
    @l
    public static final a h;

    static {
        h.h = new a(null);
    }

    public h() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.X("");
        this.a3("");
        this.o2("");
    }

    @Override  // io.realm.X1
    public String E() [...] // 潜在的解密器

    @Override  // io.realm.X1
    public String M4() [...] // 潜在的解密器

    public long Q5() {
        return this.u();
    }

    // 去混淆评级： 低(20)
    @m
    public String R5() {
        return "";
    }

    // 去混淆评级： 低(20)
    @m
    public String S5() {
        return "";
    }

    // 去混淆评级： 低(20)
    @m
    public String T5() [...] // 潜在的解密器

    public void U5(long v) {
        this.y(v);
    }

    @Override  // io.realm.X1
    public String V2() [...] // 潜在的解密器

    public void V5(@m String s) {
        this.a3(s);
    }

    public void W5(@m String s) {
        this.o2(s);
    }

    @Override  // io.realm.X1
    public void X(String s) {
        this.d = s;
    }

    public void X5(@m String s) {
        this.X(s);
    }

    @Override  // io.realm.X1
    public void a3(String s) {
        this.e = s;
    }

    @Override  // io.realm.X1
    public void o2(String s) {
        this.f = s;
    }

    @Override  // io.realm.X1
    public long u() {
        return this.g;
    }

    @Override  // io.realm.X1
    public void y(long v) {
        this.g = v;
    }
}

