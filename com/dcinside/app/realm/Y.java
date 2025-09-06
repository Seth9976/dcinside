package com.dcinside.app.realm;

import h3.e;
import io.realm.F0;
import io.realm.T0;
import io.realm.X0;
import io.realm.d1;
import io.realm.internal.s;
import io.realm.v2;
import java.util.Collection;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import timber.log.b;
import y4.l;
import y4.m;

@s0({"SMAP\nHateWord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HateWord.kt\ncom/dcinside/app/realm/HateWord\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1755#2,3:86\n*S KotlinDebug\n*F\n+ 1 HateWord.kt\ncom/dcinside/app/realm/HateWord\n*L\n37#1:86,3\n*E\n"})
public class y extends d1 implements v2 {
    @s0({"SMAP\nHateWord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HateWord.kt\ncom/dcinside/app/realm/HateWord$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,85:1\n120#2,3:86\n124#2:90\n120#2,3:91\n124#2:95\n120#2,3:96\n124#2:100\n1#3:89\n1#3:94\n1#3:99\n81#4:101\n81#4:102\n*S KotlinDebug\n*F\n+ 1 HateWord.kt\ncom/dcinside/app/realm/HateWord$Companion\n*L\n45#1:86,3\n45#1:90\n63#1:91,3\n63#1:95\n74#1:96,3\n74#1:100\n45#1:89\n63#1:94\n74#1:99\n52#1:101\n77#1:102\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void e(@l String s, @l Function1 function10) {
            L.p(s, "galleryId");
            L.p(function10, "async");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                y y0 = (y)f00.C4(y.class).i0("galleryId", s).r0();
                if(y0 != null) {
                    function10.invoke(y0);
                    goto label_7;
                }
                goto label_9;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
        label_7:
            c.a(f00, null);
            return;
            try {
            label_9:
                f00.c4((F0 f00) -> {
                    L.p(s, "$galleryId");
                    L.m(f00);
                    L.o(f00.n3(y.class, s), "this.createObject(T::class.java, primaryKeyValue)");
                }, () -> {
                    L.p(function10, "$async");
                    L.p(f00, "$realm");
                    L.p(s, "$galleryId");
                    function10.invoke(f00.C4(y.class).i0("galleryId", s).r0());
                }, (Throwable throwable0) -> {
                    L.p(function10, "$async");
                    b.a.y(throwable0);
                    function10.invoke(null);
                });
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
        }

        // 检测为 Lambda 实现
        private static final void f(String s, F0 f00) [...]

        // 检测为 Lambda 实现
        private static final void g(Function1 function10, F0 f00, String s) [...]

        // 检测为 Lambda 实现
        private static final void h(Function1 function10, Throwable throwable0) [...]

        @l
        public final y i(@l String s) {
            y y1;
            L.p(s, "gallId");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                y y0 = (y)f00.C4(y.class).i0("galleryId", s).r0();
                y1 = y0 == null ? null : ((y)y0.B5());
                if(y1 == null) {
                    y1 = new y();
                    y1.V5(s);
                }
                goto label_14;
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
        label_14:
            c.a(f00, null);
            return y1;
        }

        public final void j(@l String s, @l Function1 function10) {
            L.p(s, "galleryId");
            L.p(function10, "update");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                f00.Z3((F0 f00) -> {
                    L.p(s, "$galleryId");
                    L.p(function10, "$update");
                    Class class0 = y.class;
                    y y0 = (y)f00.C4(class0).i0("galleryId", s).r0();
                    if(y0 == null) {
                        L.m(f00);
                        X0 x00 = f00.n3(class0, s);
                        L.o(x00, "this.createObject(T::class.java, primaryKeyValue)");
                        y0 = (y)x00;
                        if(y0 == null) {
                            return;
                        }
                    }
                    function10.invoke(y0);
                });
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
        }

        // 检测为 Lambda 实现
        private static final void k(String s, Function1 function10, F0 f00) [...]
    }

    @e
    @m
    private String d;
    private boolean e;
    private int f;
    @l
    private T0 g;
    @l
    public static final a h = null;
    public static final int i = 0;
    public static final int j = 1;

    static {
        y.h = new a(null);
    }

    public y() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.D0(true);
        this.G(new T0());
    }

    @Override  // io.realm.v2
    public void D0(boolean z) {
        this.e = z;
    }

    @Override  // io.realm.v2
    public int D3() {
        return this.f;
    }

    @Override  // io.realm.v2
    public T0 F() {
        return this.g;
    }

    @Override  // io.realm.v2
    public void G(T0 t00) {
        this.g = t00;
    }

    @m
    public String Q5() {
        return this.a();
    }

    public boolean R5() {
        return this.g3();
    }

    public int S5() {
        return this.D3();
    }

    @l
    public T0 T5() {
        return this.F();
    }

    public final boolean U5(@l String s) {
        L.p(s, "word");
        T0 t00 = this.T5();
        if(!(t00 instanceof Collection) || !t00.isEmpty()) {
            for(Object object0: t00) {
                L.m(((String)object0));
                if(v.W2(s, ((String)object0), false, 2, null)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public void V5(@m String s) {
        this.b(s);
    }

    public void W5(boolean z) {
        this.D0(z);
    }

    public void X5(int v) {
        this.i3(v);
    }

    public void Y5(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.G(t00);
    }

    @Override  // io.realm.v2
    public String a() {
        return this.d;
    }

    @Override  // io.realm.v2
    public void b(String s) {
        this.d = s;
    }

    @Override  // io.realm.v2
    public boolean g3() {
        return this.e;
    }

    @Override  // io.realm.v2
    public void i3(int v) {
        this.f = v;
    }
}

