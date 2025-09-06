package androidx.compose.ui.text;

import A3.o;
import A3.p;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,4:1136\n38#2:1142\n151#2,3:1144\n33#2,4:1147\n154#2,2:1151\n38#2:1153\n156#2:1154\n33#2,4:1158\n38#2:1164\n151#2,3:1166\n33#2,4:1169\n154#2,2:1173\n38#2:1175\n156#2:1176\n33#2,4:1180\n38#2:1186\n151#2,3:1188\n33#2,4:1191\n154#2,2:1195\n38#2:1197\n156#2:1198\n151#2,3:1199\n33#2,4:1202\n154#2,2:1206\n38#2:1208\n156#2:1209\n33#2,4:1214\n38#2:1220\n151#2,5:1222\n38#2:1227\n156#2:1228\n35#3,3:1133\n38#3,2:1140\n40#3:1143\n35#3,3:1155\n38#3,2:1162\n40#3:1165\n35#3,3:1177\n38#3,2:1184\n40#3:1187\n35#3,3:1211\n38#3,2:1218\n40#3:1221\n1#4:1210\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n676#1:1127,6\n712#1:1136,4\n712#1:1142\n713#1:1144,3\n713#1:1147,4\n713#1:1151,2\n713#1:1153\n713#1:1154\n739#1:1158,4\n739#1:1164\n740#1:1166,3\n740#1:1169,4\n740#1:1173,2\n740#1:1175\n740#1:1176\n766#1:1180,4\n766#1:1186\n767#1:1188,3\n767#1:1191,4\n767#1:1195,2\n767#1:1197\n767#1:1198\n803#1:1199,3\n803#1:1202,4\n803#1:1206,2\n803#1:1208\n803#1:1209\n1049#1:1214,4\n1049#1:1220\n1049#1:1222,5\n1049#1:1227\n1049#1:1228\n712#1:1133,3\n712#1:1140,2\n712#1:1143\n739#1:1155,3\n739#1:1162,2\n739#1:1165\n766#1:1177,3\n766#1:1184,2\n766#1:1187\n1049#1:1211,3\n1049#1:1218,2\n1049#1:1221\n*E\n"})
public final class AnnotatedStringKt {
    @l
    private static final AnnotatedString a;

    static {
        AnnotatedStringKt.a = new AnnotatedString("", null, null, 6, null);
    }

    public static AnnotatedString A(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.c.a();
        }
        return AnnotatedStringKt.z(annotatedString0, localeList0);
    }

    @ExperimentalTextApi
    @l
    public static final Object B(@l Builder annotatedString$Builder0, @l TtsAnnotation ttsAnnotation0, @l Function1 function10) {
        L.p(annotatedString$Builder0, "<this>");
        L.p(ttsAnnotation0, "ttsAnnotation");
        L.p(function10, "block");
        int v = annotatedString$Builder0.s(ttsAnnotation0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.o(v);
        }
    }

    @ExperimentalTextApi
    @l
    public static final Object C(@l Builder annotatedString$Builder0, @l UrlAnnotation urlAnnotation0, @l Function1 function10) {
        L.p(annotatedString$Builder0, "<this>");
        L.p(urlAnnotation0, "urlAnnotation");
        L.p(function10, "block");
        int v = annotatedString$Builder0.t(urlAnnotation0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.o(v);
        }
    }

    @ExperimentalTextApi
    @l
    public static final Object D(@l Builder annotatedString$Builder0, @l String s, @l String s1, @l Function1 function10) {
        L.p(annotatedString$Builder0, "<this>");
        L.p(s, "tag");
        L.p(s1, "annotation");
        L.p(function10, "block");
        int v = annotatedString$Builder0.p(s, s1);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.o(v);
        }
    }

    @l
    public static final Object E(@l Builder annotatedString$Builder0, @l ParagraphStyle paragraphStyle0, @l Function1 function10) {
        L.p(annotatedString$Builder0, "<this>");
        L.p(paragraphStyle0, "style");
        L.p(function10, "block");
        int v = annotatedString$Builder0.q(paragraphStyle0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.o(v);
        }
    }

    @l
    public static final Object F(@l Builder annotatedString$Builder0, @l SpanStyle spanStyle0, @l Function1 function10) {
        L.p(annotatedString$Builder0, "<this>");
        L.p(spanStyle0, "style");
        L.p(function10, "block");
        int v = annotatedString$Builder0.r(spanStyle0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.o(v);
        }
    }

    @l
    public static final AnnotatedString a(@l String s, @l ParagraphStyle paragraphStyle0) {
        L.p(s, "text");
        L.p(paragraphStyle0, "paragraphStyle");
        return new AnnotatedString(s, u.H(), u.k(new Range(paragraphStyle0, 0, s.length())));
    }

    @l
    public static final AnnotatedString b(@l String s, @l SpanStyle spanStyle0, @m ParagraphStyle paragraphStyle0) {
        L.p(s, "text");
        L.p(spanStyle0, "spanStyle");
        List list0 = u.k(new Range(spanStyle0, 0, s.length()));
        return paragraphStyle0 == null ? new AnnotatedString(s, list0, u.H()) : new AnnotatedString(s, list0, u.k(new Range(paragraphStyle0, 0, s.length())));
    }

    public static AnnotatedString c(String s, SpanStyle spanStyle0, ParagraphStyle paragraphStyle0, int v, Object object0) {
        if((v & 4) != 0) {
            paragraphStyle0 = null;
        }
        return AnnotatedStringKt.b(s, spanStyle0, paragraphStyle0);
    }

    @l
    public static final AnnotatedString i(@l Function1 function10) {
        L.p(function10, "builder");
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        function10.invoke(annotatedString$Builder0);
        return annotatedString$Builder0.u();
    }

    @l
    public static final AnnotatedString j(@l AnnotatedString annotatedString0, @l LocaleList localeList0) {
        L.p(annotatedString0, "<this>");
        L.p(localeList0, "localeList");
        return JvmAnnotatedString_jvmKt.b(annotatedString0, new p(localeList0) {
            final LocaleList e;

            {
                this.e = localeList0;
                super(3);
            }

            @l
            public final String a(@l String s, int v, int v1) {
                L.p(s, "str");
                if(v == 0) {
                    String s1 = s.substring(0, v1);
                    L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.b(s1, this.e);
                }
                String s2 = s.substring(v, v1);
                L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                return s2;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((String)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }
        });
    }

    public static AnnotatedString k(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.c.a();
        }
        return AnnotatedStringKt.j(annotatedString0, localeList0);
    }

    public static final boolean l(int v, int v1, int v2, int v3) {
        if(v <= v2 && v3 <= v1) {
            return v1 == v3 ? (v2 == v3 ? 1 : 0) == (v == v1 ? 1 : 0) : true;
        }
        return false;
    }

    @l
    public static final AnnotatedString m(@l AnnotatedString annotatedString0, @l LocaleList localeList0) {
        L.p(annotatedString0, "<this>");
        L.p(localeList0, "localeList");
        return JvmAnnotatedString_jvmKt.b(annotatedString0, new p(localeList0) {
            final LocaleList e;

            {
                this.e = localeList0;
                super(3);
            }

            @l
            public final String a(@l String s, int v, int v1) {
                L.p(s, "str");
                if(v == 0) {
                    String s1 = s.substring(0, v1);
                    L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.d(s1, this.e);
                }
                String s2 = s.substring(v, v1);
                L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                return s2;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((String)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }
        });
    }

    public static AnnotatedString n(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.c.a();
        }
        return AnnotatedStringKt.m(annotatedString0, localeList0);
    }

    @l
    public static final AnnotatedString o() {
        return AnnotatedStringKt.a;
    }

    private static final List p(List list0, int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException(("start (" + v + ") should be less than or equal to end (" + v1 + ')').toString());
        }
        if(list0 == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            Object object0 = list0.get(v4);
            if(AnnotatedStringKt.t(v, v1, ((Range)object0).i(), ((Range)object0).g())) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v5 = arrayList0.size();
        for(int v3 = 0; v3 < v5; ++v3) {
            Range annotatedString$Range0 = (Range)arrayList0.get(v3);
            arrayList1.add(new Range(annotatedString$Range0.h(), Math.max(v, annotatedString$Range0.i()) - v, Math.min(v1, annotatedString$Range0.g()) - v, annotatedString$Range0.j()));
        }
        return !arrayList1.isEmpty() ? arrayList1 : null;
    }

    private static final List q(AnnotatedString annotatedString0, int v, int v1) {
        if(v == v1) {
            return null;
        }
        List list0 = annotatedString0.b();
        if(list0 == null) {
            return null;
        }
        if(v == 0 && v1 >= annotatedString0.j().length()) {
            return list0;
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            Object object0 = list0.get(v4);
            if(AnnotatedStringKt.t(v, v1, ((Range)object0).i(), ((Range)object0).g())) {
                arrayList0.add(object0);
            }
        }
        List list1 = new ArrayList(arrayList0.size());
        int v5 = arrayList0.size();
        for(int v3 = 0; v3 < v5; ++v3) {
            Range annotatedString$Range0 = (Range)arrayList0.get(v3);
            list1.add(new Range(annotatedString$Range0.h(), s.I(annotatedString$Range0.i(), v, v1) - v, s.I(annotatedString$Range0.g(), v, v1) - v, annotatedString$Range0.j()));
        }
        return list1;
    }

    private static final List r(AnnotatedString annotatedString0, int v, int v1) {
        if(v == v1) {
            return null;
        }
        List list0 = annotatedString0.e();
        if(list0 == null) {
            return null;
        }
        if(v == 0 && v1 >= annotatedString0.j().length()) {
            return list0;
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            Object object0 = list0.get(v4);
            if(AnnotatedStringKt.t(v, v1, ((Range)object0).i(), ((Range)object0).g())) {
                arrayList0.add(object0);
            }
        }
        List list1 = new ArrayList(arrayList0.size());
        int v5 = arrayList0.size();
        for(int v3 = 0; v3 < v5; ++v3) {
            Range annotatedString$Range0 = (Range)arrayList0.get(v3);
            list1.add(new Range(annotatedString$Range0.h(), s.I(annotatedString$Range0.i(), v, v1) - v, s.I(annotatedString$Range0.g(), v, v1) - v));
        }
        return list1;
    }

    private static final List s(AnnotatedString annotatedString0, int v, int v1) {
        if(v == v1) {
            return null;
        }
        List list0 = annotatedString0.g();
        if(list0 == null) {
            return null;
        }
        if(v == 0 && v1 >= annotatedString0.j().length()) {
            return list0;
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            Object object0 = list0.get(v4);
            if(AnnotatedStringKt.t(v, v1, ((Range)object0).i(), ((Range)object0).g())) {
                arrayList0.add(object0);
            }
        }
        List list1 = new ArrayList(arrayList0.size());
        int v5 = arrayList0.size();
        for(int v3 = 0; v3 < v5; ++v3) {
            Range annotatedString$Range0 = (Range)arrayList0.get(v3);
            list1.add(new Range(annotatedString$Range0.h(), s.I(annotatedString$Range0.i(), v, v1) - v, s.I(annotatedString$Range0.g(), v, v1) - v));
        }
        return list1;
    }

    // 去混淆评级： 低(20)
    public static final boolean t(int v, int v1, int v2, int v3) {
        return Math.max(v, v2) < Math.min(v1, v3) || AnnotatedStringKt.l(v, v1, v2, v3) || AnnotatedStringKt.l(v2, v3, v, v1);
    }

    @l
    public static final List u(@l AnnotatedString annotatedString0, @l ParagraphStyle paragraphStyle0, @l o o0) {
        L.p(annotatedString0, "<this>");
        L.p(paragraphStyle0, "defaultParagraphStyle");
        L.p(o0, "block");
        List list0 = AnnotatedStringKt.v(annotatedString0, paragraphStyle0);
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Range annotatedString$Range0 = (Range)list0.get(v1);
            list1.add(o0.invoke(AnnotatedStringKt.w(annotatedString0, annotatedString$Range0.i(), annotatedString$Range0.g()), annotatedString$Range0));
        }
        return list1;
    }

    @l
    public static final List v(@l AnnotatedString annotatedString0, @l ParagraphStyle paragraphStyle0) {
        L.p(annotatedString0, "<this>");
        L.p(paragraphStyle0, "defaultParagraphStyle");
        int v = annotatedString0.j().length();
        List list0 = annotatedString0.e() == null ? u.H() : annotatedString0.e();
        List list1 = new ArrayList();
        int v1 = list0.size();
        int v2 = 0;
        int v3;
        for(v3 = 0; v2 < v1; v3 = v5) {
            Range annotatedString$Range0 = (Range)list0.get(v2);
            ParagraphStyle paragraphStyle1 = (ParagraphStyle)annotatedString$Range0.a();
            int v4 = annotatedString$Range0.b();
            int v5 = annotatedString$Range0.c();
            if(v4 != v3) {
                list1.add(new Range(paragraphStyle0, v3, v4));
            }
            list1.add(new Range(paragraphStyle0.v(paragraphStyle1), v4, v5));
            ++v2;
        }
        if(v3 != v) {
            list1.add(new Range(paragraphStyle0, v3, v));
        }
        if(list1.isEmpty()) {
            list1.add(new Range(paragraphStyle0, 0, 0));
        }
        return list1;
    }

    private static final AnnotatedString w(AnnotatedString annotatedString0, int v, int v1) {
        if(v != v1) {
            String s = annotatedString0.j().substring(v, v1);
            L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
            return new AnnotatedString(s, AnnotatedStringKt.s(annotatedString0, v, v1), null, null, 12, null);
        }
        return new AnnotatedString("", AnnotatedStringKt.s(annotatedString0, v, v1), null, null, 12, null);
    }

    @l
    public static final AnnotatedString x(@l AnnotatedString annotatedString0, @l LocaleList localeList0) {
        L.p(annotatedString0, "<this>");
        L.p(localeList0, "localeList");
        return JvmAnnotatedString_jvmKt.b(annotatedString0, new p(localeList0) {
            final LocaleList e;

            {
                this.e = localeList0;
                super(3);
            }

            @l
            public final String a(@l String s, int v, int v1) {
                L.p(s, "str");
                String s1 = s.substring(v, v1);
                L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.f(s1, this.e);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((String)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }
        });
    }

    public static AnnotatedString y(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.c.a();
        }
        return AnnotatedStringKt.x(annotatedString0, localeList0);
    }

    @l
    public static final AnnotatedString z(@l AnnotatedString annotatedString0, @l LocaleList localeList0) {
        L.p(annotatedString0, "<this>");
        L.p(localeList0, "localeList");
        return JvmAnnotatedString_jvmKt.b(annotatedString0, new p(localeList0) {
            final LocaleList e;

            {
                this.e = localeList0;
                super(3);
            }

            @l
            public final String a(@l String s, int v, int v1) {
                L.p(s, "str");
                String s1 = s.substring(v, v1);
                L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.h(s1, this.e);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((String)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }
        });
    }
}

