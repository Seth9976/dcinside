package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.u;
import kotlin.comparisons.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.i;

@Immutable
@s0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,1126:1\n1045#2:1127\n33#3,6:1128\n33#3,4:1138\n38#3:1144\n101#3,2:1146\n33#3,6:1148\n103#3:1154\n33#3,4:1158\n38#3:1164\n33#3,4:1169\n38#3:1175\n33#3,4:1180\n38#3:1186\n1#4:1134\n35#5,3:1135\n38#5,2:1142\n40#5:1145\n35#5,3:1155\n38#5,2:1162\n40#5:1165\n35#5,3:1166\n38#5,2:1173\n40#5:1176\n35#5,3:1177\n38#5,2:1184\n40#5:1187\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n86#1:1127\n86#1:1128,6\n159#1:1138,4\n159#1:1144\n167#1:1146,2\n167#1:1148,6\n167#1:1154\n182#1:1158,4\n182#1:1164\n197#1:1169,4\n197#1:1175\n213#1:1180,4\n213#1:1186\n159#1:1135,3\n159#1:1142,2\n159#1:1145\n182#1:1155,3\n182#1:1162,2\n182#1:1165\n197#1:1166,3\n197#1:1173,2\n197#1:1176\n213#1:1177,3\n213#1:1184,2\n213#1:1187\n*E\n"})
public final class AnnotatedString implements CharSequence {
    @StabilityInferred(parameters = 0)
    @s0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,6:1133\n33#2,6:1139\n33#2,6:1145\n33#2,6:1151\n33#2,6:1157\n151#2,3:1164\n33#2,4:1167\n154#2,2:1171\n38#2:1173\n156#2:1174\n151#2,3:1175\n33#2,4:1178\n154#2,2:1182\n38#2:1184\n156#2:1185\n151#2,3:1186\n33#2,4:1189\n154#2,2:1193\n38#2:1195\n156#2:1196\n1#3:1163\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n396#1:1127,6\n399#1:1133,6\n403#1:1139,6\n423#1:1145,6\n426#1:1151,6\n430#1:1157,6\n640#1:1164,3\n640#1:1167,4\n640#1:1171,2\n640#1:1173\n640#1:1174\n643#1:1175,3\n643#1:1178,4\n643#1:1182,2\n643#1:1184\n643#1:1185\n646#1:1186,3\n646#1:1189,4\n646#1:1193,2\n646#1:1195\n646#1:1196\n*E\n"})
    public static final class Builder implements Appendable {
        @s0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
        static final class MutableRange {
            private final Object a;
            private final int b;
            private int c;
            @l
            private final String d;

            public MutableRange(Object object0, int v, int v1, @l String s) {
                L.p(s, "tag");
                super();
                this.a = object0;
                this.b = v;
                this.c = v1;
                this.d = s;
            }

            public MutableRange(Object object0, int v, int v1, String s, int v2, w w0) {
                if((v2 & 4) != 0) {
                    v1 = 0x80000000;
                }
                if((v2 & 8) != 0) {
                    s = "";
                }
                this(object0, v, v1, s);
            }

            public final Object a() {
                return this.a;
            }

            public final int b() {
                return this.b;
            }

            public final int c() {
                return this.c;
            }

            @l
            public final String d() {
                return this.d;
            }

            @l
            public final MutableRange e(Object object0, int v, int v1, @l String s) {
                L.p(s, "tag");
                return new MutableRange(object0, v, v1, s);
            }

            @Override
            public boolean equals(@m Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof MutableRange)) {
                    return false;
                }
                if(!L.g(this.a, ((MutableRange)object0).a)) {
                    return false;
                }
                if(this.b != ((MutableRange)object0).b) {
                    return false;
                }
                return this.c == ((MutableRange)object0).c ? L.g(this.d, ((MutableRange)object0).d) : false;
            }

            public static MutableRange f(MutableRange annotatedString$Builder$MutableRange0, Object object0, int v, int v1, String s, int v2, Object object1) {
                if((v2 & 1) != 0) {
                    object0 = annotatedString$Builder$MutableRange0.a;
                }
                if((v2 & 2) != 0) {
                    v = annotatedString$Builder$MutableRange0.b;
                }
                if((v2 & 4) != 0) {
                    v1 = annotatedString$Builder$MutableRange0.c;
                }
                if((v2 & 8) != 0) {
                    s = annotatedString$Builder$MutableRange0.d;
                }
                return annotatedString$Builder$MutableRange0.e(object0, v, v1, s);
            }

            public final int g() {
                return this.c;
            }

            public final Object h() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a == null ? (this.b * 0x1F + this.c) * 0x1F + this.d.hashCode() : ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d.hashCode();
            }

            public final int i() {
                return this.b;
            }

            @l
            public final String j() {
                return this.d;
            }

            public final void k(int v) {
                this.c = v;
            }

            @l
            public final Range l(int v) {
                int v1 = this.c;
                if(v1 != 0x80000000) {
                    v = v1;
                }
                if(v == 0x80000000) {
                    throw new IllegalStateException("Item.end should be set first");
                }
                return new Range(this.a, this.b, v, this.d);
            }

            public static Range m(MutableRange annotatedString$Builder$MutableRange0, int v, int v1, Object object0) {
                if((v1 & 1) != 0) {
                    v = 0x80000000;
                }
                return annotatedString$Builder$MutableRange0.l(v);
            }

            @Override
            @l
            public String toString() {
                return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
            }
        }

        @l
        private final StringBuilder a;
        @l
        private final List b;
        @l
        private final List c;
        @l
        private final List d;
        @l
        private final List e;
        public static final int f = 8;

        static {
        }

        public Builder() {
            this(0, 1, null);
        }

        public Builder(int v) {
            this.a = new StringBuilder(v);
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public Builder(int v, int v1, w w0) {
            if((v1 & 1) != 0) {
                v = 16;
            }
            this(v);
        }

        public Builder(@l AnnotatedString annotatedString0) {
            L.p(annotatedString0, "text");
            this(0, 1, null);
            this.j(annotatedString0);
        }

        public Builder(@l String s) {
            L.p(s, "text");
            this(0, 1, null);
            this.l(s);
        }

        public final void a(@l String s, @l String s1, int v, int v1) {
            L.p(s, "tag");
            L.p(s1, "annotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(s1, v, v1, s);
            this.d.add(annotatedString$Builder$MutableRange0);
        }

        @Override
        public Appendable append(char c) {
            return this.f(c);
        }

        @Override
        public Appendable append(CharSequence charSequence0) {
            return this.g(charSequence0);
        }

        @Override
        public Appendable append(CharSequence charSequence0, int v, int v1) {
            return this.h(charSequence0, v, v1);
        }

        public final void b(@l ParagraphStyle paragraphStyle0, int v, int v1) {
            L.p(paragraphStyle0, "style");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(paragraphStyle0, v, v1, null, 8, null);
            this.c.add(annotatedString$Builder$MutableRange0);
        }

        public final void c(@l SpanStyle spanStyle0, int v, int v1) {
            L.p(spanStyle0, "style");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(spanStyle0, v, v1, null, 8, null);
            this.b.add(annotatedString$Builder$MutableRange0);
        }

        @ExperimentalTextApi
        public final void d(@l TtsAnnotation ttsAnnotation0, int v, int v1) {
            L.p(ttsAnnotation0, "ttsAnnotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(ttsAnnotation0, v, v1, null, 8, null);
            this.d.add(annotatedString$Builder$MutableRange0);
        }

        @ExperimentalTextApi
        public final void e(@l UrlAnnotation urlAnnotation0, int v, int v1) {
            L.p(urlAnnotation0, "urlAnnotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(urlAnnotation0, v, v1, null, 8, null);
            this.d.add(annotatedString$Builder$MutableRange0);
        }

        @l
        public Builder f(char c) {
            this.a.append(c);
            return this;
        }

        @l
        public Builder g(@m CharSequence charSequence0) {
            if(charSequence0 instanceof AnnotatedString) {
                this.j(((AnnotatedString)charSequence0));
                return this;
            }
            this.a.append(charSequence0);
            return this;
        }

        @l
        public Builder h(@m CharSequence charSequence0, int v, int v1) {
            if(charSequence0 instanceof AnnotatedString) {
                this.k(((AnnotatedString)charSequence0), v, v1);
                return this;
            }
            this.a.append(charSequence0, v, v1);
            return this;
        }

        @k(level = kotlin.m.c, message = "Replaced by the append(Char) method that returns an Appendable. This method must be kept around for binary compatibility.")
        @i(name = "append")
        public final void i(char c) {
            this.f(c);
        }

        public final void j(@l AnnotatedString annotatedString0) {
            L.p(annotatedString0, "text");
            int v = this.a.length();
            this.a.append(annotatedString0.j());
            List list0 = annotatedString0.g();
            if(list0 != null) {
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    Range annotatedString$Range0 = (Range)list0.get(v3);
                    this.c(((SpanStyle)annotatedString$Range0.h()), annotatedString$Range0.i() + v, annotatedString$Range0.g() + v);
                }
            }
            List list1 = annotatedString0.e();
            if(list1 != null) {
                int v4 = list1.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Range annotatedString$Range1 = (Range)list1.get(v5);
                    this.b(((ParagraphStyle)annotatedString$Range1.h()), annotatedString$Range1.i() + v, annotatedString$Range1.g() + v);
                }
            }
            List list2 = annotatedString0.b();
            if(list2 != null) {
                int v6 = list2.size();
                for(int v1 = 0; v1 < v6; ++v1) {
                    Range annotatedString$Range2 = (Range)list2.get(v1);
                    MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(annotatedString$Range2.h(), annotatedString$Range2.i() + v, annotatedString$Range2.g() + v, annotatedString$Range2.j());
                    this.d.add(annotatedString$Builder$MutableRange0);
                }
            }
        }

        public final void k(@l AnnotatedString annotatedString0, int v, int v1) {
            L.p(annotatedString0, "text");
            int v2 = this.a.length();
            this.a.append(annotatedString0.j(), v, v1);
            List list0 = AnnotatedStringKt.s(annotatedString0, v, v1);
            if(list0 != null) {
                int v4 = list0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Range annotatedString$Range0 = (Range)list0.get(v5);
                    this.c(((SpanStyle)annotatedString$Range0.h()), annotatedString$Range0.i() + v2, annotatedString$Range0.g() + v2);
                }
            }
            List list1 = AnnotatedStringKt.r(annotatedString0, v, v1);
            if(list1 != null) {
                int v6 = list1.size();
                for(int v7 = 0; v7 < v6; ++v7) {
                    Range annotatedString$Range1 = (Range)list1.get(v7);
                    this.b(((ParagraphStyle)annotatedString$Range1.h()), annotatedString$Range1.i() + v2, annotatedString$Range1.g() + v2);
                }
            }
            List list2 = AnnotatedStringKt.q(annotatedString0, v, v1);
            if(list2 != null) {
                int v8 = list2.size();
                for(int v3 = 0; v3 < v8; ++v3) {
                    Range annotatedString$Range2 = (Range)list2.get(v3);
                    MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(annotatedString$Range2.h(), annotatedString$Range2.i() + v2, annotatedString$Range2.g() + v2, annotatedString$Range2.j());
                    this.d.add(annotatedString$Builder$MutableRange0);
                }
            }
        }

        public final void l(@l String s) {
            L.p(s, "text");
            this.a.append(s);
        }

        public final int m() {
            return this.a.length();
        }

        public final void n() {
            if(this.e.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            ((MutableRange)this.e.remove(this.e.size() - 1)).k(this.a.length());
        }

        public final void o(int v) {
            if(v >= this.e.size()) {
                throw new IllegalStateException((v + " should be less than " + this.e.size()).toString());
            }
            while(this.e.size() - 1 >= v) {
                this.n();
            }
        }

        public final int p(@l String s, @l String s1) {
            L.p(s, "tag");
            L.p(s1, "annotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(s1, this.a.length(), 0, s, 4, null);
            this.e.add(annotatedString$Builder$MutableRange0);
            this.d.add(annotatedString$Builder$MutableRange0);
            return this.e.size() - 1;
        }

        public final int q(@l ParagraphStyle paragraphStyle0) {
            L.p(paragraphStyle0, "style");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(paragraphStyle0, this.a.length(), 0, null, 12, null);
            this.e.add(annotatedString$Builder$MutableRange0);
            this.c.add(annotatedString$Builder$MutableRange0);
            return this.e.size() - 1;
        }

        public final int r(@l SpanStyle spanStyle0) {
            L.p(spanStyle0, "style");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(spanStyle0, this.a.length(), 0, null, 12, null);
            this.e.add(annotatedString$Builder$MutableRange0);
            this.b.add(annotatedString$Builder$MutableRange0);
            return this.e.size() - 1;
        }

        public final int s(@l TtsAnnotation ttsAnnotation0) {
            L.p(ttsAnnotation0, "ttsAnnotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(ttsAnnotation0, this.a.length(), 0, null, 12, null);
            this.e.add(annotatedString$Builder$MutableRange0);
            this.d.add(annotatedString$Builder$MutableRange0);
            return this.e.size() - 1;
        }

        @ExperimentalTextApi
        public final int t(@l UrlAnnotation urlAnnotation0) {
            L.p(urlAnnotation0, "urlAnnotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(urlAnnotation0, this.a.length(), 0, null, 12, null);
            this.e.add(annotatedString$Builder$MutableRange0);
            this.d.add(annotatedString$Builder$MutableRange0);
            return this.e.size() - 1;
        }

        @l
        public final AnnotatedString u() {
            ArrayList arrayList1;
            String s = this.a.toString();
            L.o(s, "text.toString()");
            List list0 = this.b;
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v = list0.size();
            for(int v2 = 0; true; ++v2) {
                arrayList1 = null;
                if(v2 >= v) {
                    break;
                }
                arrayList0.add(((MutableRange)list0.get(v2)).l(this.a.length()));
            }
            if(arrayList0.isEmpty()) {
                arrayList0 = null;
            }
            List list1 = this.c;
            ArrayList arrayList2 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList2.add(((MutableRange)list1.get(v4)).l(this.a.length()));
            }
            if(arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List list2 = this.d;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int v5 = list2.size();
            for(int v1 = 0; v1 < v5; ++v1) {
                arrayList3.add(((MutableRange)list2.get(v1)).l(this.a.length()));
            }
            if(!arrayList3.isEmpty()) {
                arrayList1 = arrayList3;
            }
            return new AnnotatedString(s, arrayList0, arrayList2, arrayList1);
        }
    }

    @Immutable
    @s0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
    public static final class Range {
        private final Object a;
        private final int b;
        private final int c;
        @l
        private final String d;
        public static final int e;

        static {
        }

        public Range(Object object0, int v, int v1) {
            this(object0, v, v1, "");
        }

        public Range(Object object0, int v, int v1, @l String s) {
            L.p(s, "tag");
            super();
            this.a = object0;
            this.b = v;
            this.c = v1;
            this.d = s;
            if(v > v1) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final Object a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        @l
        public final String d() {
            return this.d;
        }

        @l
        public final Range e(Object object0, int v, int v1, @l String s) {
            L.p(s, "tag");
            return new Range(object0, v, v1, s);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Range)) {
                return false;
            }
            if(!L.g(this.a, ((Range)object0).a)) {
                return false;
            }
            if(this.b != ((Range)object0).b) {
                return false;
            }
            return this.c == ((Range)object0).c ? L.g(this.d, ((Range)object0).d) : false;
        }

        public static Range f(Range annotatedString$Range0, Object object0, int v, int v1, String s, int v2, Object object1) {
            if((v2 & 1) != 0) {
                object0 = annotatedString$Range0.a;
            }
            if((v2 & 2) != 0) {
                v = annotatedString$Range0.b;
            }
            if((v2 & 4) != 0) {
                v1 = annotatedString$Range0.c;
            }
            if((v2 & 8) != 0) {
                s = annotatedString$Range0.d;
            }
            return annotatedString$Range0.e(object0, v, v1, s);
        }

        public final int g() {
            return this.c;
        }

        public final Object h() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? (this.b * 0x1F + this.c) * 0x1F + this.d.hashCode() : ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d.hashCode();
        }

        public final int i() {
            return this.b;
        }

        @l
        public final String j() {
            return this.d;
        }

        @Override
        @l
        public String toString() {
            return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
        }
    }

    @l
    private final String a;
    @m
    private final List b;
    @m
    private final List c;
    @m
    private final List d;
    public static final int e;

    static {
    }

    public AnnotatedString(@l String s, @l List list0, @l List list1) {
        L.p(s, "text");
        L.p(list0, "spanStyles");
        L.p(list1, "paragraphStyles");
        Collection collection0 = list0;
        if(collection0.isEmpty()) {
            collection0 = null;
        }
        Collection collection1 = list1;
        if(collection1.isEmpty()) {
            collection1 = null;
        }
        this(s, ((List)collection0), ((List)collection1), null);
    }

    public AnnotatedString(String s, List list0, List list1, int v, w w0) {
        if((v & 2) != 0) {
            list0 = u.H();
        }
        if((v & 4) != 0) {
            list1 = u.H();
        }
        this(s, list0, list1);
    }

    public AnnotatedString(@l String s, @m List list0, @m List list1, @m List list2) {
        L.p(s, "text");
        super();
        this.a = s;
        this.b = list0;
        this.c = list1;
        this.d = list2;
        if(list1 != null) {
            List list3 = u.u5(list1, new androidx.compose.ui.text.AnnotatedString.special..inlined.sortedBy.1());
            if(list3 != null) {
                int v = list3.size();
                int v1 = -1;
                for(int v2 = 0; v2 < v; ++v2) {
                    Range annotatedString$Range0 = (Range)list3.get(v2);
                    if(annotatedString$Range0.i() < v1) {
                        throw new IllegalArgumentException("ParagraphStyle should not overlap");
                    }
                    if(annotatedString$Range0.g() > this.a.length()) {
                        throw new IllegalArgumentException(("ParagraphStyle range [" + annotatedString$Range0.i() + ", " + annotatedString$Range0.g() + ") is out of boundary").toString());
                    }
                    v1 = annotatedString$Range0.g();
                }
            }
        }

        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n1#1,328:1\n86#2:329\n*E\n"})
        public final class androidx.compose.ui.text.AnnotatedString.special..inlined.sortedBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return a.l(((Range)object0).i(), ((Range)object1).i());
            }
        }

    }

    public AnnotatedString(String s, List list0, List list1, List list2, int v, w w0) {
        if((v & 2) != 0) {
            list0 = null;
        }
        if((v & 4) != 0) {
            list1 = null;
        }
        if((v & 8) != 0) {
            list2 = null;
        }
        this(s, list0, list1, list2);
    }

    public char a(int v) {
        return this.a.charAt(v);
    }

    @m
    public final List b() {
        return this.d;
    }

    public int c() {
        return this.a.length();
    }

    @Override
    public final char charAt(int v) {
        return this.a(v);
    }

    @l
    public final List d() {
        return this.c == null ? u.H() : this.c;
    }

    @m
    public final List e() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AnnotatedString)) {
            return false;
        }
        if(!L.g(this.a, ((AnnotatedString)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((AnnotatedString)object0).b)) {
            return false;
        }
        return L.g(this.c, ((AnnotatedString)object0).c) ? L.g(this.d, ((AnnotatedString)object0).d) : false;
    }

    @l
    public final List f() {
        return this.b == null ? u.H() : this.b;
    }

    @m
    public final List g() {
        return this.b;
    }

    @l
    public final List h(int v, int v1) {
        List list1;
        List list0 = this.d;
        if(list0 == null) {
            list1 = u.H();
        }
        else {
            list1 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.h() instanceof String && AnnotatedStringKt.t(v, v1, annotatedString$Range0.i(), annotatedString$Range0.g())) {
                    list1.add(object0);
                }
            }
        }
        L.n(list1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list1;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        List list0 = this.d;
        if(list0 != null) {
            v1 = list0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @l
    public final List i(@l String s, int v, int v1) {
        List list1;
        L.p(s, "tag");
        List list0 = this.d;
        if(list0 == null) {
            list1 = u.H();
        }
        else {
            list1 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.h() instanceof String && L.g(s, annotatedString$Range0.j()) && AnnotatedStringKt.t(v, v1, annotatedString$Range0.i(), annotatedString$Range0.g())) {
                    list1.add(object0);
                }
            }
        }
        L.n(list1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list1;
    }

    @l
    public final String j() {
        return this.a;
    }

    @l
    public final List k(int v, int v1) {
        List list1;
        List list0 = this.d;
        if(list0 == null) {
            list1 = u.H();
        }
        else {
            list1 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.h() instanceof TtsAnnotation && AnnotatedStringKt.t(v, v1, annotatedString$Range0.i(), annotatedString$Range0.g())) {
                    list1.add(object0);
                }
            }
        }
        L.n(list1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return list1;
    }

    @ExperimentalTextApi
    @l
    public final List l(int v, int v1) {
        List list1;
        List list0 = this.d;
        if(list0 == null) {
            list1 = u.H();
        }
        else {
            list1 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.h() instanceof UrlAnnotation && AnnotatedStringKt.t(v, v1, annotatedString$Range0.i(), annotatedString$Range0.g())) {
                    list1.add(object0);
                }
            }
        }
        L.n(list1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return list1;
    }

    @Override
    public final int length() {
        return this.c();
    }

    public final boolean m(@l String s, int v, int v1) {
        L.p(s, "tag");
        List list0 = this.d;
        if(list0 != null) {
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Range annotatedString$Range0 = (Range)list0.get(v3);
                if(annotatedString$Range0.h() instanceof String && L.g(s, annotatedString$Range0.j()) && AnnotatedStringKt.t(v, v1, annotatedString$Range0.i(), annotatedString$Range0.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Stable
    @l
    public final AnnotatedString n(@l AnnotatedString annotatedString0) {
        L.p(annotatedString0, "other");
        Builder annotatedString$Builder0 = new Builder(this);
        annotatedString$Builder0.j(annotatedString0);
        return annotatedString$Builder0.u();
    }

    @l
    public AnnotatedString o(int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException(("start (" + v + ") should be less or equal to end (" + v1 + ')').toString());
        }
        if(v == 0 && v1 == this.a.length()) {
            return this;
        }
        String s = this.a.substring(v, v1);
        L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
        return new AnnotatedString(s, AnnotatedStringKt.p(this.b, v, v1), AnnotatedStringKt.p(this.c, v, v1), AnnotatedStringKt.p(this.d, v, v1));
    }

    @l
    public final AnnotatedString p(long v) {
        return this.o(TextRange.l(v), TextRange.k(v));
    }

    @Override
    public CharSequence subSequence(int v, int v1) {
        return this.o(v, v1);
    }

    @Override
    @l
    public String toString() {
        return this.a;
    }
}

