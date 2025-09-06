package g0;

import V.b;
import V.i;
import V.o;
import V.v;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class f {
    @s0({"SMAP\nPushDataResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushDataResult.kt\ncom/dcinside/app/push/data/PushDataResult$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,126:1\n1863#2,2:127\n1863#2:131\n1864#2:134\n1863#2,2:137\n1863#2:141\n1557#2:142\n1628#2,3:143\n1864#2:146\n37#3,2:129\n37#3,2:132\n37#3,2:135\n37#3,2:139\n37#3,2:147\n*S KotlinDebug\n*F\n+ 1 PushDataResult.kt\ncom/dcinside/app/push/data/PushDataResult$Companion\n*L\n75#1:127,2\n95#1:131\n95#1:134\n108#1:137,2\n116#1:141\n117#1:142\n117#1:143,3\n116#1:146\n90#1:129,2\n97#1:132,2\n100#1:135,2\n111#1:139,2\n122#1:147,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final b[] a(@m List list0) {
            ArrayList arrayList0 = new ArrayList();
            if(list0 != null) {
                for(Object object0: list0) {
                    String s = ((g0.f.b)object0).e();
                    Integer integer0 = ((g0.f.b)object0).a();
                    String s1 = ((g0.f.b)object0).g();
                    String s2 = ((g0.f.b)object0).d();
                    String s3 = ((g0.f.b)object0).h();
                    String s4 = ((g0.f.b)object0).k();
                    String s5 = ((g0.f.b)object0).b();
                    if(s5 == null) {
                        s5 = "U";
                    }
                    String s6 = ((g0.f.b)object0).j();
                    String s7 = ((g0.f.b)object0).i();
                    if(s7 == null) {
                        s7 = "A";
                    }
                    arrayList0.add(new b(s, integer0, s1, s2, s3, s4, s5, s6, s7));
                }
            }
            return (b[])arrayList0.toArray(new b[0]);
        }

        @l
        public final i[] b(@m Map map0) {
            ArrayList arrayList0 = new ArrayList();
            if(map0 != null) {
                Collection collection0 = map0.values();
                if(collection0 != null) {
                    for(Object object0: collection0) {
                        List list0 = ((g0.f.b)object0).f();
                        arrayList0.add(new i(((g0.f.b)object0).e(), ((g0.f.b)object0).d(), (list0 == null ? null : ((String[])list0.toArray(new String[0])))));
                    }
                }
            }
            return (i[])arrayList0.toArray(new i[0]);
        }

        @l
        public final o[] c(@m List list0) {
            ArrayList arrayList0 = new ArrayList();
            if(list0 != null) {
                for(Object object0: list0) {
                    arrayList0.add(new o(((g0.f.b)object0).e(), ((g0.f.b)object0).d(), null));
                }
            }
            return (o[])arrayList0.toArray(new o[0]);
        }

        @l
        public final o[] d(@m List list0) {
            ArrayList arrayList1;
            ArrayList arrayList0 = new ArrayList();
            if(list0 != null) {
                for(Object object0: list0) {
                    List list1 = ((g0.f.b)object0).l();
                    if(list1 == null) {
                        arrayList1 = null;
                    }
                    else {
                        arrayList1 = new ArrayList(u.b0(list1, 10));
                        for(Object object1: list1) {
                            arrayList1.add(new v(((d)object1).b(), ((d)object1).a()));
                        }
                    }
                    arrayList0.add(new o(((g0.f.b)object0).e(), ((g0.f.b)object0).d(), arrayList1));
                }
            }
            return (o[])arrayList0.toArray(new o[0]);
        }
    }

    public static final class g0.f.b {
        @c(alternate = {"gallery_id"}, value = "id")
        @m
        private String a;
        @c(alternate = {"gall_ko_name"}, value = "ko_name")
        @m
        private String b;
        @c("keyword")
        @m
        private List c;
        @c("idx")
        @m
        private Integer d;
        @c("content_no")
        @m
        private String e;
        @c("title")
        @m
        private String f;
        @c("nickname")
        @m
        private String g;
        @c("reg_date")
        @m
        private String h;
        @c("article_type")
        @m
        private String i;
        @c("comment_no")
        @m
        private String j;
        @c("type")
        @m
        private String k;
        @c("user")
        @m
        private List l;

        public g0.f.b() {
            this.d = 0;
        }

        @m
        public final Integer a() {
            return this.d;
        }

        @m
        public final String b() {
            return this.i;
        }

        @m
        public final String c() {
            return this.h;
        }

        @m
        public final String d() {
            return this.a;
        }

        @m
        public final String e() {
            return this.b;
        }

        @m
        public final List f() {
            return this.c;
        }

        @m
        public final String g() {
            return this.g;
        }

        @m
        public final String h() {
            return this.e;
        }

        @m
        public final String i() {
            return this.k;
        }

        @m
        public final String j() {
            return this.j;
        }

        @m
        public final String k() {
            return this.f;
        }

        @m
        public final List l() {
            return this.l;
        }

        public final void m(@m Integer integer0) {
            this.d = integer0;
        }

        public final void n(@m String s) {
            this.i = s;
        }

        public final void o(@m String s) {
            this.h = s;
        }

        public final void p(@m String s) {
            this.a = s;
        }

        public final void q(@m String s) {
            this.b = s;
        }

        public final void r(@m List list0) {
            this.c = list0;
        }

        public final void s(@m String s) {
            this.g = s;
        }

        public final void t(@m String s) {
            this.e = s;
        }

        public final void u(@m String s) {
            this.k = s;
        }

        public final void v(@m String s) {
            this.j = s;
        }

        public final void w(@m String s) {
            this.f = s;
        }

        public final void x(@m List list0) {
            this.l = list0;
        }
    }

    public static final class g0.f.c {
        @c("lists")
        @m
        private List a;
        @c("total")
        private int b;

        @m
        public final List a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final void c(@m List list0) {
            this.a = list0;
        }

        public final void d(int v) {
            this.b = v;
        }
    }

    public static final class d {
        @c("user_id")
        @m
        private String a;
        @c("nickname")
        @m
        private String b;

        @m
        public final String a() {
            return this.b;
        }

        @m
        public final String b() {
            return this.a;
        }

        public final void c(@m String s) {
            this.b = s;
        }

        public final void d(@m String s) {
            this.a = s;
        }
    }

    @c("lists")
    @m
    private Map a;
    @c("total")
    private int b;
    @l
    public static final a c;

    static {
        f.c = new a(null);
    }

    @m
    public final Map a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final void c(@m Map map0) {
        this.a = map0;
    }

    public final void d(int v) {
        this.b = v;
    }
}

