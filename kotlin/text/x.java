package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.internal.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.p;
import y4.l;

@s0({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1577#3,11:127\n1872#3,2:138\n1874#3:151\n1588#3:152\n774#3:155\n865#3,2:156\n1557#3:158\n1628#3,3:159\n1577#3,11:164\n1872#3,2:175\n1874#3:182\n1588#3:183\n1577#3,11:192\n1872#3,2:203\n1874#3:206\n1588#3:207\n158#4,6:144\n158#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
class x extends w {
    private static final Function1 g(String s) {
        static final class a extends N implements Function1 {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(1);
            }

            public final String b(String s) {
                L.p(s, "line");
                return s;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }


        static final class b extends N implements Function1 {
            final String e;

            b(String s) {
                this.e = s;
                super(1);
            }

            public final String b(String s) {
                L.p(s, "line");
                return this.e + s;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }

        return s.length() == 0 ? a.e : new b(s);
    }

    private static final int h(String s) {
        int v = s.length();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(!c.r(s.charAt(v1))) {
                break;
            }
        }
        return v1 == -1 ? s.length() : v1;
    }

    @l
    public static final String i(@l String s, @l String s1) {
        static final class kotlin.text.x.c extends N implements Function1 {
            final String e;

            kotlin.text.x.c(String s) {
                this.e = s;
                super(1);
            }

            public final String b(String s) {
                L.p(s, "it");
                if(v.x3(s)) {
                    return s.length() >= this.e.length() ? s : this.e;
                }
                return this.e + s;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }

        L.p(s, "<this>");
        L.p(s1, "indent");
        return p.e1(p.k1(v.M3(s), new kotlin.text.x.c(s1)), "\n", null, null, 0, null, null, 62, null);
    }

    public static String j(String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s1 = "    ";
        }
        return x.i(s, s1);
    }

    private static final String k(List list0, int v, Function1 function10, Function1 function11) {
        int v1 = u.J(list0);
        ArrayList arrayList0 = new ArrayList();
        int v2 = 0;
        for(Object object0: list0) {
            if(v2 < 0) {
                u.Z();
            }
            String s = (String)object0;
            if(v2 != 0 && v2 != v1 || !v.x3(s)) {
                String s1 = (String)function11.invoke(s);
                if(s1 != null) {
                    String s2 = (String)function10.invoke(s1);
                    if(s2 != null) {
                        s = s2;
                    }
                }
            }
            else {
                s = null;
            }
            if(s != null) {
                arrayList0.add(s);
            }
            ++v2;
        }
        String s3 = ((StringBuilder)u.k3(arrayList0, new StringBuilder(v), "\n", null, null, 0, null, null, 0x7C, null)).toString();
        L.o(s3, "toString(...)");
        return s3;
    }

    @l
    public static final String l(@l String s, @l String s1) {
        L.p(s, "<this>");
        L.p(s1, "newIndent");
        List list0 = v.N3(s);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(!v.x3(((String)object0))) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(x.h(((String)object1)));
        }
        Integer integer0 = (Integer)u.h4(arrayList1);
        int v = 0;
        int v1 = integer0 == null ? 0 : ((int)integer0);
        int v2 = s.length();
        int v3 = s1.length();
        int v4 = list0.size();
        Function1 function10 = x.g(s1);
        int v5 = u.J(list0);
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: list0) {
            if(v < 0) {
                u.Z();
            }
            String s2 = (String)object2;
            if(v != 0 && v != v5 || !v.x3(s2)) {
                String s3 = v.C6(s2, v1);
                if(s3 != null) {
                    String s4 = (String)function10.invoke(s3);
                    if(s4 != null) {
                        s2 = s4;
                    }
                }
            }
            else {
                s2 = null;
            }
            if(s2 != null) {
                arrayList2.add(s2);
            }
            ++v;
        }
        String s5 = ((StringBuilder)u.k3(arrayList2, new StringBuilder(v2 + v3 * v4), "\n", null, null, 0, null, null, 0x7C, null)).toString();
        L.o(s5, "toString(...)");
        return s5;
    }

    public static String m(String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s1 = "";
        }
        return x.l(s, s1);
    }

    @l
    public static final String n(@l String s, @l String s1, @l String s2) {
        int v7;
        L.p(s, "<this>");
        L.p(s1, "newIndent");
        L.p(s2, "marginPrefix");
        if(v.x3(s2)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List list0 = v.N3(s);
        int v = s.length();
        int v1 = s1.length();
        int v2 = list0.size();
        Function1 function10 = x.g(s1);
        int v3 = u.J(list0);
        ArrayList arrayList0 = new ArrayList();
        int v4 = 0;
        for(Object object0: list0) {
            if(v4 < 0) {
                u.Z();
            }
            String s3 = (String)object0;
            String s4 = null;
            if(v4 != 0 && v4 != v3 || !v.x3(s3)) {
                int v5 = s3.length();
                int v6 = 0;
                while(true) {
                    v7 = -1;
                    if(v6 < v5) {
                        if(c.r(s3.charAt(v6))) {
                            ++v6;
                            continue;
                        }
                        else {
                            v7 = v6;
                        }
                    }
                    break;
                }
                if(v7 != -1 && v.u2(s3, s2, v7, false, 4, null)) {
                    L.n(s3, "null cannot be cast to non-null type java.lang.String");
                    s4 = s3.substring(v7 + s2.length());
                    L.o(s4, "substring(...)");
                }
                if(s4 != null) {
                    String s5 = (String)function10.invoke(s4);
                    if(s5 != null) {
                        s3 = s5;
                    }
                }
            }
            else {
                s3 = null;
            }
            if(s3 != null) {
                arrayList0.add(s3);
            }
            ++v4;
        }
        String s6 = ((StringBuilder)u.k3(arrayList0, new StringBuilder(v + v1 * v2), "\n", null, null, 0, null, null, 0x7C, null)).toString();
        L.o(s6, "toString(...)");
        return s6;
    }

    public static String o(String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s1 = "";
        }
        if((v & 2) != 0) {
            s2 = "|";
        }
        return x.n(s, s1, s2);
    }

    @g
    @l
    public static String p(@l String s) {
        L.p(s, "<this>");
        return x.l(s, "");
    }

    @g
    @l
    public static final String q(@l String s, @l String s1) {
        L.p(s, "<this>");
        L.p(s1, "marginPrefix");
        return x.n(s, "", s1);
    }

    public static String r(String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s1 = "|";
        }
        return x.q(s, s1);
    }
}

