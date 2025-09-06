package com.dcinside.app.realm;

import android.text.TextUtils;
import com.dcinside.app.model.N;
import com.dcinside.app.model.s;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Yk;
import com.dcinside.app.util.uk;
import com.dcinside.app.write.i;
import com.dcinside.app.write.menu.video.VideoInfoData;
import h3.b;
import io.realm.V2;
import io.realm.d1;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import kotlin.text.v;
import org.jsoup.nodes.f;
import org.jsoup.nodes.o;
import org.jsoup.select.e;
import y4.l;
import y4.m;

public class k0 extends d1 implements V2 {
    @s0({"SMAP\nPostWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWrite.kt\ncom/dcinside/app/realm/PostWrite$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,465:1\n739#2,9:466\n37#3,2:475\n1#4:477\n*S KotlinDebug\n*F\n+ 1 PostWrite.kt\ncom/dcinside/app/realm/PostWrite$Companion\n*L\n139#1:466,9\n140#1:475,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final boolean A(@m k0 k00) {
            return k00 != null && k00.c6() == 10;
        }

        public final boolean B(@m k0 k00) {
            if(k00 == null) {
                return false;
            }
            int v = k00.c6();
            return v == 0 ? k00.V5() != null : v == 2 || v == 3 || v == 4;
        }

        public final boolean C(@m k0 k00) {
            if(k00 == null) {
                return false;
            }
            int v = k00.c6();
            if(v == 0) {
                if(this.B(k00)) {
                    String s = k00.U5();
                    return s != null && s.length() > 0;
                }
                return false;
            }
            return v == 4;
        }

        public final boolean D(@m k0 k00) {
            if(k00 == null) {
                return false;
            }
            int v = k00.c6();
            if(v == 0) {
                if(this.B(k00)) {
                    String s = k00.V5();
                    return s != null && v.v2(s, "http", false, 2, null);
                }
                return false;
            }
            return v == 2 || v == 4;
        }

        public final boolean E(@m k0 k00) {
            if(k00 == null) {
                return false;
            }
            int v = k00.c6();
            return v == 0 ? k00.V5() != null : v == 3;
        }

        public final boolean F(@m k0 k00) {
            return k00 != null && k00.c6() == 9;
        }

        public final boolean G(@m k0 k00) {
            return k00 != null && k00.c6() == 11;
        }

        public final boolean H(@m k0 k00) {
            return k00 != null && k00.c6() == 8;
        }

        public final boolean I(@m k0 k00) {
            if(k00 == null) {
                return false;
            }
            int v = k00.c6();
            return v == 0 ? k00.V5() == null : v == 7;
        }

        public final boolean J(@m k0 k00) {
            if(k00 == null) {
                return false;
            }
            int v = k00.c6();
            return v == 0 ? k00.V5() == null : v == 1;
        }

        public final boolean K(@m k0 k00) {
            if(this.J(k00) && k00 != null) {
                String s = k00.b6();
                return s != null && s.length() == 0;
            }
            return false;
        }

        public final boolean L(@m k0 k00) {
            if(this.J(k00) && k00 != null) {
                String s = k00.b6();
                return s != null && s.length() > 0;
            }
            return false;
        }

        public final boolean M(@m k0 k00) {
            return k00 != null && k00.c6() == 6;
        }

        public final boolean N(@m k0 k00) {
            return k00 != null && k00.c6() == 5;
        }

        @l
        public final String O(@l String[] arr_s) {
            L.p(arr_s, "texts");
            String s = TextUtils.join(".sep.", arr_s);
            L.o(s, "join(...)");
            return s;
        }

        @l
        public final String[] P(@m String s) {
            if(s == null) {
                return new String[0];
            }
            List list0 = new r("\\.sep\\.").p(s, 0);
            if(!list0.isEmpty()) {
                ListIterator listIterator0 = list0.listIterator(list0.size());
                while(listIterator0.hasPrevious()) {
                    if(((String)listIterator0.previous()).length() != 0) {
                        return (String[])u.J5(list0, listIterator0.nextIndex() + 1).toArray(new String[0]);
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return (String[])u.H().toArray(new String[0]);
        }

        @l
        public final k0 a(@l String s, boolean z, @m String s1, @m String s2, boolean z1, boolean z2) {
            L.p(s, "data");
            k0 k00 = new k0();
            k00.q6((z2 ? 15 : 12));
            k00.j6(s1);
            k00.i6(s);
            k00.h6(z);
            k00.e6(s2);
            k00.m6(z1);
            return k00;
        }

        public static k0 b(a k0$a0, String s, boolean z, String s1, String s2, boolean z1, boolean z2, int v, Object object0) {
            String s3 = (v & 4) == 0 ? s1 : null;
            String s4 = (v & 8) == 0 ? s2 : null;
            boolean z3 = (v & 16) == 0 ? z1 : false;
            return (v & 0x20) == 0 ? k0$a0.a(s, z, s3, s4, z3, z2) : k0$a0.a(s, z, s3, s4, z3, false);
        }

        @m
        public final k0 c(@l String s, int v) {
            L.p(s, "uri");
            if(!v.v2(s, "http", false, 2, null)) {
                return null;
            }
            k0 k00 = new k0();
            k00.q6(16);
            k00.j6(s);
            k00.f6(v);
            return k00;
        }

        @l
        public final k0 d(@l String s, @l String s1, int v) {
            L.p(s, "autoImageType");
            L.p(s1, "uri");
            k0 k00 = new k0();
            k00.q6(16);
            k00.i6(s);
            if(!v.v2(s1, "http", false, 2, null)) {
                s1 = null;
            }
            k00.j6(s1);
            k00.f6(v);
            return k00;
        }

        public static k0 e(a k0$a0, String s, String s1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                s1 = "";
            }
            if((v1 & 4) != 0) {
                v = 0;
            }
            return k0$a0.d(s, s1, v);
        }

        @l
        public final k0 f(@l String s, @l V v0, boolean z) {
            L.p(s, "url");
            L.p(v0, "detailIndexes");
            k0 k00 = new k0();
            k00.q6(4);
            k00.j6(s);
            Integer integer0 = (Integer)v0.f();
            if(integer0 != null) {
                k00.f6(((int)integer0));
                k00.g6(((Number)v0.e()).intValue());
                List list0 = v.V4(s, new String[]{"|dccon|"}, false, 0, 6, null);
                k00.i6((z ? "<img src=\'" + u.B2(list0) + "\' class=\'bigdccon\'/><img src=\'" + u.p3(list0) + "\' class=\'bigdccon\'/>" : "<img src=\'" + u.B2(list0) + "\'/><img src=\'" + u.p3(list0) + "\'/>"));
                return k00;
            }
            k00.f6(((Number)v0.e()).intValue());
            k00.i6((z ? "<img src=\'" + s + "\' class=\'bigdccon\'/>" : "<img src=\'" + s + "\'/>"));
            return k00;
        }

        @l
        public final k0 g(@l V v0, boolean z) {
            L.p(v0, "uses");
            k0 k00 = new k0();
            k00.q6(4);
            String s = ((s)v0.e()).d();
            String s1 = a.h(z, ((s)v0.e()));
            k00.f6(((s)v0.e()).a());
            s s2 = (s)v0.f();
            if(s2 != null) {
                k.g.b(s2.e(), s2.a());
                s = s2.d() + "|dccon|" + s;
                s1 = a.h(z, s2) + s1;
                k00.g6(s2.a());
            }
            k.g.b(((s)v0.e()).e(), ((s)v0.e()).a());
            k00.j6(s);
            k00.i6(s1);
            return k00;
        }

        private static final String h(boolean z, s s0) {
            String s2;
            if(!z) {
                String s1 = s0.c();
                return s1 == null ? "" : s1;
            }
            f f0 = Dl.A(s0.c());
            if(f0 != null) {
                e e0 = f0.I1("img");
                if(e0 != null) {
                    o o0 = e0.u();
                    if(o0 != null) {
                        o0.z0("bigdccon");
                        s2 = o0.S();
                        if(s2 != null) {
                            return s2;
                        }
                    }
                }
            }
            s2 = s0.c();
            return s2 == null ? "" : s2;
        }

        @l
        public final k0 i(@l String s) {
            L.p(s, "url");
            k0 k00 = new k0();
            k00.q6(11);
            k00.j6(s);
            return k00;
        }

        @l
        public final k0 j() {
            k0 k00 = new k0();
            k00.q6(1);
            k00.p6("");
            return k00;
        }

        @l
        public final k0 k(@l N n0) {
            L.p(n0, "info");
            k0 k00 = new k0();
            String s = n0.n();
            if(s == null) {
                s = "";
            }
            k00.q6(11);
            k00.p6(i.a.e(n0, s));
            k00.j6(s);
            return k00;
        }

        @l
        public final k0 l(@m String s) {
            k0 k00 = new k0();
            k00.q6(7);
            k00.p6(s);
            return k00;
        }

        @l
        public final k0 m(@l String s) {
            L.p(s, "json");
            k0 k00 = new k0();
            k00.q6(14);
            k00.n6(s);
            return k00;
        }

        @l
        public final k0 n(@l String s, @m String s1) {
            L.p(s, "html");
            k0 k00 = new k0();
            k00.q6(10);
            k00.i6(s1);
            k00.p6(s);
            return k00;
        }

        @l
        public final k0 o(@l String s) {
            L.p(s, "text");
            String s1 = Dl.M(s);
            L.o(s1, "unescapeHtml(...)");
            String s2 = new r("<br\\s?/>").m(s1, "\r\n");
            k0 k00 = new k0();
            k00.q6(1);
            k00.p6(s2);
            return k00;
        }

        @l
        public final k0 p(@l String s) {
            L.p(s, "text");
            String s1 = new r("<br\\s?/>").m(s, "\r\n");
            k0 k00 = new k0();
            k00.q6(1);
            k00.p6(s1);
            return k00;
        }

        @m
        public final k0 q(@l String s, long v) {
            L.p(s, "uri");
            int v1 = 2;
            if(!v.v2(s, "http", false, 2, null)) {
                if(new File(s).length() > v) {
                    return null;
                }
                v1 = 3;
            }
            k0 k00 = new k0();
            k00.q6(v1);
            k00.j6(s);
            return k00;
        }

        @l
        public final k0 r(@l String s, @l String s1, boolean z) {
            L.p(s, "uri");
            L.p(s1, "size");
            k0 k00 = new k0();
            k00.q6((v.v2(s, "http", false, 2, null) ? 2 : 3));
            k00.j6(s);
            k00.p6(s1);
            k00.k6(Boolean.valueOf(z));
            return k00;
        }

        @l
        public final k0 s(@l String s, @m VideoInfoData videoInfoData0) {
            L.p(s, "imageUrl");
            k0 k00 = new k0();
            k00.q6((videoInfoData0 == null ? 8 : 9));
            k00.j6(s);
            k00.i6((videoInfoData0 == null ? null : uk.a.D(videoInfoData0)));
            return k00;
        }

        @l
        public final k0 t(@l String s) {
            L.p(s, "iframe");
            k0 k00 = new k0();
            k00.q6(6);
            k00.p6(s);
            return k00;
        }

        @l
        public final k0 u(@l String s) {
            L.p(s, "youtubeId");
            String s1 = Yk.b(Yk.c(("https://www.youtube.com/watch?v=" + s), true));
            k0 k00 = new k0();
            k00.q6(5);
            k00.r6(s);
            k00.p6(s1);
            return k00;
        }

        public final boolean v(@m k0 k00) {
            return k00 != null && k00.c6() == 15;
        }

        public final boolean w(@m k0 k00) {
            return k00 != null && k00.c6() == 12;
        }

        // 去混淆评级： 低(30)
        public final boolean x(@m k0 k00) {
            return this.w(k00) || this.z(k00) || this.v(k00);
        }

        public final boolean y(@m k0 k00) {
            return k00 != null && k00.c6() == 16;
        }

        public final boolean z(@m k0 k00) {
            return k00 != null && k00.c6() == 14;
        }
    }

    public static final int A = 8;
    public static final int B = 9;
    public static final int C = 10;
    public static final int D = 11;
    public static final int E = 12;
    public static final int F = 13;
    public static final int G = 14;
    public static final int H = 15;
    public static final int I = 16;
    @l
    public static final String J = "post_write_empty_auto_image";
    @l
    public static final String K = "post_write_changed_auto_image";
    private int d;
    @m
    private String e;
    @m
    private String f;
    @m
    private String g;
    @m
    private Boolean h;
    private int i;
    private int j;
    @m
    private String k;
    private int l;
    @b
    private boolean m;
    @b
    private int n;
    @b
    @m
    private String o;
    @b
    @m
    private String p;
    @b
    private boolean q;
    @l
    public static final a r = null;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    public static final int x = 5;
    public static final int y = 6;
    public static final int z = 7;

    static {
        k0.r = new a(null);
    }

    public k0() {
        if(this instanceof io.realm.internal.s) {
            ((io.realm.internal.s)this).m2();
        }
        this.e3(Boolean.FALSE);
        this.n = -1;
    }

    @Override  // io.realm.V2
    public int A() {
        return this.i;
    }

    @Override  // io.realm.V2
    public void B0(int v) {
        this.j = v;
    }

    @Override  // io.realm.V2
    public String D() {
        return this.e;
    }

    @Override  // io.realm.V2
    public String H0() {
        return this.k;
    }

    @Override  // io.realm.V2
    public void P2(int v) {
        this.l = v;
    }

    @m
    public String Q5() {
        return this.p;
    }

    @Override  // io.realm.V2
    public int R4() {
        return this.j;
    }

    public int R5() {
        return this.A();
    }

    public int S5() {
        return this.R4();
    }

    public boolean T5() {
        return this.m;
    }

    @Override  // io.realm.V2
    public int U1() {
        return this.l;
    }

    @m
    public String U5() {
        return this.w2();
    }

    @m
    public String V5() {
        return this.f1();
    }

    @Override  // io.realm.V2
    public void W(String s) {
        this.e = s;
    }

    @m
    public Boolean W5() {
        return this.X2();
    }

    @Override  // io.realm.V2
    public Boolean X2() {
        return this.h;
    }

    public int X5() {
        return this.U1();
    }

    @Override  // io.realm.V2
    public void Y2(String s) {
        this.k = s;
    }

    public boolean Y5() {
        return this.q;
    }

    @m
    public String Z5() {
        return this.o;
    }

    public int a6() {
        return this.n;
    }

    @Override  // io.realm.V2
    public void b3(String s) {
        this.f = s;
    }

    @m
    public String b6() {
        return this.D();
    }

    public int c6() {
        return this.v();
    }

    @m
    public String d6() {
        return this.H0();
    }

    @Override  // io.realm.V2
    public void e3(Boolean boolean0) {
        this.h = boolean0;
    }

    public void e6(@m String s) {
        this.p = s;
    }

    @Override  // io.realm.V2
    public String f1() {
        return this.f;
    }

    public void f6(int v) {
        this.x(v);
    }

    public void g6(int v) {
        this.B0(v);
    }

    public void h6(boolean z) {
        this.m = z;
    }

    public void i6(@m String s) {
        this.p5(s);
    }

    public void j6(@m String s) {
        this.b3(s);
    }

    public void k6(@m Boolean boolean0) {
        this.e3(boolean0);
    }

    public void l6(int v) {
        this.P2(v);
    }

    public void m6(boolean z) {
        this.q = z;
    }

    public void n6(@m String s) {
        this.o = s;
    }

    public void o6(int v) {
        this.n = v;
    }

    @Override  // io.realm.V2
    public void p5(String s) {
        this.g = s;
    }

    public void p6(@m String s) {
        this.W(s);
    }

    public void q6(int v) {
        this.z(v);
    }

    public void r6(@m String s) {
        this.Y2(s);
    }

    @Override  // io.realm.V2
    public int v() {
        return this.d;
    }

    @Override  // io.realm.V2
    public String w2() {
        return this.g;
    }

    @Override  // io.realm.V2
    public void x(int v) {
        this.i = v;
    }

    @Override  // io.realm.V2
    public void z(int v) {
        this.d = v;
    }
}

