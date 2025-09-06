package kotlin.text;

import A3.o;
import j..util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.S0;
import kotlin.W0;
import kotlin.b0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.f0;
import kotlin.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n22#2,3:398\n1#3:401\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:398,3\n*E\n"})
public final class r implements Serializable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final int b(int v) {
            return (v & 2) == 0 ? v : v | 0x40;
        }

        @l
        public final String c(@l String s) {
            L.p(s, "literal");
            String s1 = Pattern.quote(s);
            L.o(s1, "quote(...)");
            return s1;
        }

        @l
        public final String d(@l String s) {
            L.p(s, "literal");
            String s1 = Matcher.quoteReplacement(s);
            L.o(s1, "quoteReplacement(...)");
            return s1;
        }

        @l
        public final r e(@l String s) {
            L.p(s, "literal");
            return new r(s, t.e);
        }
    }

    static final class b implements Serializable {
        public static final class kotlin.text.r.b.a {
            private kotlin.text.r.b.a() {
            }

            public kotlin.text.r.b.a(w w0) {
            }
        }

        @l
        private final String a;
        private final int b;
        @l
        public static final kotlin.text.r.b.a c;
        private static final long d;

        static {
            b.c = new kotlin.text.r.b.a(null);
        }

        public b(@l String s, int v) {
            L.p(s, "pattern");
            super();
            this.a = s;
            this.b = v;
        }

        public final int a() {
            return this.b;
        }

        @l
        public final String b() {
            return this.a;
        }

        private final Object c() {
            Pattern pattern0 = Pattern.compile(this.a, this.b);
            L.o(pattern0, "compile(...)");
            return new r(pattern0);
        }
    }

    @l
    private final Pattern a;
    @m
    private Set b;
    @l
    public static final a c;

    static {
        r.c = new a(null);
    }

    public r(@l String s) {
        L.p(s, "pattern");
        Pattern pattern0 = Pattern.compile(s);
        L.o(pattern0, "compile(...)");
        this(pattern0);
    }

    public r(@l String s, @l Set set0) {
        L.p(s, "pattern");
        L.p(set0, "options");
        int v = s.k(set0);
        Pattern pattern0 = Pattern.compile(s, r.c.b(v));
        L.o(pattern0, "compile(...)");
        this(pattern0);
    }

    public r(@l String s, @l t t0) {
        L.p(s, "pattern");
        L.p(t0, "option");
        Pattern pattern0 = Pattern.compile(s, r.c.b(t0.getValue()));
        L.o(pattern0, "compile(...)");
        this(pattern0);
    }

    @b0
    public r(@l Pattern pattern0) {
        L.p(pattern0, "nativePattern");
        super();
        this.a = pattern0;
    }

    public final boolean b(@l CharSequence charSequence0) {
        L.p(charSequence0, "input");
        return this.a.matcher(charSequence0).find();
    }

    @m
    public final p c(@l CharSequence charSequence0, int v) {
        L.p(charSequence0, "input");
        Matcher matcher0 = this.a.matcher(charSequence0);
        L.o(matcher0, "matcher(...)");
        return s.f(matcher0, v, charSequence0);
    }

    public static p d(r r0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return r0.c(charSequence0, v);
    }

    @l
    public final kotlin.sequences.m e(@l CharSequence charSequence0, int v) {
        static final class c extends N implements A3.a {
            final r e;
            final CharSequence f;
            final int g;

            c(r r0, CharSequence charSequence0, int v) {
                this.e = r0;
                this.f = charSequence0;
                this.g = v;
                super(0);
            }

            public final p b() {
                return this.e.c(this.f, this.g);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        final class d extends H implements Function1 {
            public static final d a;

            static {
                d.a = new d();
            }

            d() {
                super(1, p.class, "next", "next()Lkotlin/text/MatchResult;", 0);
            }

            public final p a(p p0) {
                L.p(p0, "p0");
                return p0.next();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((p)object0));
            }
        }

        L.p(charSequence0, "input");
        if(v < 0 || v > charSequence0.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + v + ", input length: " + charSequence0.length());
        }
        return kotlin.sequences.p.m(new c(this, charSequence0, v), d.a);
    }

    public static kotlin.sequences.m f(r r0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return r0.e(charSequence0, v);
    }

    @l
    public final Set g() {
        public static final class e extends N implements Function1 {
            final int e;

            public e(int v) {
                this.e = v;
                super(1);
            }

            public final Boolean a(Enum enum0) {
                int v = ((i)enum0).a();
                int v1 = ((i)enum0).getValue();
                return (this.e & v) == v1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Enum)object0));
            }
        }

        Set set0 = this.b;
        if(set0 == null) {
            int v = this.a.flags();
            EnumSet enumSet0 = EnumSet.allOf(t.class);
            L.m(enumSet0);
            u.Q0(enumSet0, new e(v));
            set0 = DesugarCollections.unmodifiableSet(enumSet0);
            L.o(set0, "unmodifiableSet(...)");
            this.b = set0;
        }
        return set0;
    }

    @l
    public final String h() {
        String s = this.a.pattern();
        L.o(s, "pattern(...)");
        return s;
    }

    @W0(markerClass = {kotlin.r.class})
    @h0(version = "1.7")
    @m
    public final p i(@l CharSequence charSequence0, int v) {
        L.p(charSequence0, "input");
        Matcher matcher0 = this.a.matcher(charSequence0).useAnchoringBounds(false).useTransparentBounds(true).region(v, charSequence0.length());
        if(matcher0.lookingAt()) {
            L.m(matcher0);
            return new q(matcher0, charSequence0);
        }
        return null;
    }

    @m
    public final p j(@l CharSequence charSequence0) {
        L.p(charSequence0, "input");
        Matcher matcher0 = this.a.matcher(charSequence0);
        L.o(matcher0, "matcher(...)");
        return s.h(matcher0, charSequence0);
    }

    public final boolean k(@l CharSequence charSequence0) {
        L.p(charSequence0, "input");
        return this.a.matcher(charSequence0).matches();
    }

    @W0(markerClass = {kotlin.r.class})
    @h0(version = "1.7")
    public final boolean l(@l CharSequence charSequence0, int v) {
        L.p(charSequence0, "input");
        return this.a.matcher(charSequence0).useAnchoringBounds(false).useTransparentBounds(true).region(v, charSequence0.length()).lookingAt();
    }

    @l
    public final String m(@l CharSequence charSequence0, @l String s) {
        L.p(charSequence0, "input");
        L.p(s, "replacement");
        String s1 = this.a.matcher(charSequence0).replaceAll(s);
        L.o(s1, "replaceAll(...)");
        return s1;
    }

    @l
    public final String n(@l CharSequence charSequence0, @l Function1 function10) {
        L.p(charSequence0, "input");
        L.p(function10, "transform");
        int v = 0;
        p p0 = r.d(this, charSequence0, 0, 2, null);
        if(p0 == null) {
            return charSequence0.toString();
        }
        int v1 = charSequence0.length();
        StringBuilder stringBuilder0 = new StringBuilder(v1);
        do {
            stringBuilder0.append(charSequence0, v, ((int)p0.N0().q()));
            stringBuilder0.append(((CharSequence)function10.invoke(p0)));
            v = ((int)p0.N0().p()) + 1;
            p0 = p0.next();
        }
        while(v < v1 && p0 != null);
        if(v < v1) {
            stringBuilder0.append(charSequence0, v, v1);
        }
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    @l
    public final String o(@l CharSequence charSequence0, @l String s) {
        L.p(charSequence0, "input");
        L.p(s, "replacement");
        String s1 = this.a.matcher(charSequence0).replaceFirst(s);
        L.o(s1, "replaceFirst(...)");
        return s1;
    }

    @l
    public final List p(@l CharSequence charSequence0, int v) {
        int v1 = 10;
        L.p(charSequence0, "input");
        F.O4(v);
        Matcher matcher0 = this.a.matcher(charSequence0);
        if(v != 1 && matcher0.find()) {
            if(v > 0) {
                v1 = kotlin.ranges.s.B(v, 10);
            }
            List list0 = new ArrayList(v1);
            int v2 = 0;
            do {
                ((ArrayList)list0).add(charSequence0.subSequence(v2, matcher0.start()).toString());
                v2 = matcher0.end();
            }
            while((v - 1 < 0 || ((ArrayList)list0).size() != v - 1) && matcher0.find());
            ((ArrayList)list0).add(charSequence0.subSequence(v2, charSequence0.length()).toString());
            return list0;
        }
        return u.k(charSequence0.toString());
    }

    public static List q(r r0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return r0.p(charSequence0, v);
    }

    @W0(markerClass = {kotlin.r.class})
    @h0(version = "1.6")
    @l
    public final kotlin.sequences.m r(@l CharSequence charSequence0, int v) {
        @f(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {275, 283, 0x11F}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
        static final class kotlin.text.r.f extends k implements o {
            Object l;
            int m;
            int n;
            private Object o;
            final r p;
            final CharSequence q;
            final int r;

            kotlin.text.r.f(r r0, CharSequence charSequence0, int v, kotlin.coroutines.d d0) {
                this.p = r0;
                this.q = charSequence0;
                this.r = v;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, kotlin.coroutines.d d0) {
                return ((kotlin.text.r.f)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new kotlin.text.r.f(this.p, this.q, this.r, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                int v1;
                Matcher matcher1;
                kotlin.sequences.o o1;
                int v;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        kotlin.sequences.o o0 = (kotlin.sequences.o)this.o;
                        Matcher matcher0 = this.p.a.matcher(this.q);
                        if(this.r != 1 && matcher0.find()) {
                            v = 0;
                            o1 = o0;
                            matcher1 = matcher0;
                            v1 = 0;
                            goto label_36;
                        }
                        this.n = 1;
                        return o0.a(this.q.toString(), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        v1 = this.m;
                        Matcher matcher2 = (Matcher)this.l;
                        o1 = (kotlin.sequences.o)this.o;
                        f0.n(object0);
                        matcher1 = matcher2;
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                do {
                    v = matcher1.end();
                    ++v1;
                    if(v1 == this.r - 1 || !matcher1.find()) {
                        int v2 = this.q.length();
                        String s = this.q.subSequence(v, v2).toString();
                        this.o = null;
                        this.l = null;
                        this.n = 3;
                        return o1.a(s, this) == object1 ? object1 : S0.a;
                    }
                label_36:
                    int v3 = matcher1.start();
                    String s1 = this.q.subSequence(v, v3).toString();
                    this.o = o1;
                    this.l = matcher1;
                    this.m = v1;
                    this.n = 2;
                }
                while(o1.a(s1, this) != object1);
                return object1;
            }
        }

        L.p(charSequence0, "input");
        F.O4(v);
        return kotlin.sequences.p.b(new kotlin.text.r.f(this, charSequence0, v, null));
    }

    public static kotlin.sequences.m s(r r0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return r0.r(charSequence0, v);
    }

    @Override
    @l
    public String toString() {
        String s = this.a.toString();
        L.o(s, "toString(...)");
        return s;
    }

    @l
    public final Pattern u() {
        return this.a;
    }

    private final Object w() {
        String s = this.a.pattern();
        L.o(s, "pattern(...)");
        return new b(s, this.a.flags());
    }
}

