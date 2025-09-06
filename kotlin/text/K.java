package kotlin.text;

import kotlin.b0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r;
import y4.l;
import y4.m;

@h0(version = "1.9")
@r
public final class k {
    public static final class a {
        private boolean a;
        @m
        private kotlin.text.k.b.a b;
        @m
        private kotlin.text.k.d.a c;

        @b0
        public a() {
            this.a = k.d.a().e();
        }

        @b0
        @l
        public final k a() {
            b k$b0;
            boolean z = this.a;
            kotlin.text.k.b.a k$b$a0 = this.b;
            if(k$b$a0 == null) {
                k$b0 = b.j.a();
            }
            else {
                k$b0 = k$b$a0.a();
                if(k$b0 == null) {
                    k$b0 = b.j.a();
                }
            }
            kotlin.text.k.d.a k$d$a0 = this.c;
            if(k$d$a0 != null) {
                d k$d0 = k$d$a0.a();
                return k$d0 == null ? new k(z, k$b0, d.f.a()) : new k(z, k$b0, k$d0);
            }
            return new k(z, k$b0, d.f.a());
        }

        @f
        private final void b(Function1 function10) {
            L.p(function10, "builderAction");
            function10.invoke(this.c());
        }

        @l
        public final kotlin.text.k.b.a c() {
            if(this.b == null) {
                this.b = new kotlin.text.k.b.a();
            }
            kotlin.text.k.b.a k$b$a0 = this.b;
            L.m(k$b$a0);
            return k$b$a0;
        }

        @l
        public final kotlin.text.k.d.a d() {
            if(this.c == null) {
                this.c = new kotlin.text.k.d.a();
            }
            kotlin.text.k.d.a k$d$a0 = this.c;
            L.m(k$d$a0);
            return k$d$a0;
        }

        public final boolean e() {
            return this.a;
        }

        @f
        private final void f(Function1 function10) {
            L.p(function10, "builderAction");
            function10.invoke(this.d());
        }

        public final void g(boolean z) {
            this.a = z;
        }
    }

    public static final class b {
        public static final class kotlin.text.k.b.a {
            private int a;
            private int b;
            @l
            private String c;
            @l
            private String d;
            @l
            private String e;
            @l
            private String f;

            public kotlin.text.k.b.a() {
                this.a = b.j.a().g();
                this.b = b.j.a().f();
                this.c = "  ";
                this.d = "";
                this.e = "";
                this.f = "";
            }

            @l
            public final b a() {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f);
            }

            @l
            public final String b() {
                return this.e;
            }

            @l
            public final String c() {
                return this.d;
            }

            @l
            public final String d() {
                return this.f;
            }

            public final int e() {
                return this.b;
            }

            public final int f() {
                return this.a;
            }

            @l
            public final String g() {
                return this.c;
            }

            public final void h(@l String s) {
                L.p(s, "value");
                if(v.V2(s, '\n', false, 2, null) || v.V2(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + s);
                }
                this.e = s;
            }

            public final void i(@l String s) {
                L.p(s, "value");
                if(v.V2(s, '\n', false, 2, null) || v.V2(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + s);
                }
                this.d = s;
            }

            public final void j(@l String s) {
                L.p(s, "value");
                if(v.V2(s, '\n', false, 2, null) || v.V2(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + s);
                }
                this.f = s;
            }

            public final void k(int v) {
                if(v <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + v);
                }
                this.b = v;
            }

            public final void l(int v) {
                if(v <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + v);
                }
                this.a = v;
            }

            public final void m(@l String s) {
                L.p(s, "<set-?>");
                this.c = s;
            }
        }

        public static final class kotlin.text.k.b.b {
            private kotlin.text.k.b.b() {
            }

            public kotlin.text.k.b.b(w w0) {
            }

            @l
            public final b a() {
                return b.k;
            }
        }

        private final int a;
        private final int b;
        @l
        private final String c;
        @l
        private final String d;
        @l
        private final String e;
        @l
        private final String f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        @l
        public static final kotlin.text.k.b.b j;
        @l
        private static final b k;

        static {
            b.j = new kotlin.text.k.b.b(null);
            b.k = new b(0x7FFFFFFF, 0x7FFFFFFF, "  ", "", "", "");
        }

        public b(int v, int v1, @l String s, @l String s1, @l String s2, @l String s3) {
            L.p(s, "groupSeparator");
            L.p(s1, "byteSeparator");
            L.p(s2, "bytePrefix");
            L.p(s3, "byteSuffix");
            super();
            this.a = v;
            this.b = v1;
            this.c = s;
            this.d = s1;
            this.e = s2;
            this.f = s3;
            boolean z = false;
            this.g = v == 0x7FFFFFFF && v1 == 0x7FFFFFFF;
            this.h = s2.length() == 0 && s3.length() == 0 && s1.length() <= 1;
            if(kotlin.text.l.c(s) || kotlin.text.l.c(s1) || kotlin.text.l.c(s2) || kotlin.text.l.c(s3)) {
                z = true;
            }
            this.i = z;
        }

        @l
        public final StringBuilder b(@l StringBuilder stringBuilder0, @l String s) {
            L.p(stringBuilder0, "sb");
            L.p(s, "indent");
            stringBuilder0.append(s);
            stringBuilder0.append("bytesPerLine = ");
            stringBuilder0.append(this.a);
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append(",");
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("bytesPerGroup = ");
            stringBuilder0.append(this.b);
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append(",");
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("groupSeparator = \"");
            stringBuilder0.append(this.c);
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("byteSeparator = \"");
            stringBuilder0.append(this.d);
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("bytePrefix = \"");
            stringBuilder0.append(this.e);
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("byteSuffix = \"");
            stringBuilder0.append(this.f);
            stringBuilder0.append("\"");
            return stringBuilder0;
        }

        @l
        public final String c() {
            return this.e;
        }

        @l
        public final String d() {
            return this.d;
        }

        @l
        public final String e() {
            return this.f;
        }

        public final int f() {
            return this.b;
        }

        public final int g() {
            return this.a;
        }

        @l
        public final String h() {
            return this.c;
        }

        public final boolean i() {
            return this.i;
        }

        public final boolean j() {
            return this.g;
        }

        public final boolean k() {
            return this.h;
        }

        @Override
        @l
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("BytesHexFormat(");
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(...)");
            StringBuilder stringBuilder1 = this.b(stringBuilder0, "    ");
            stringBuilder1.append('\n');
            L.o(stringBuilder1, "append(...)");
            stringBuilder0.append(")");
            String s = stringBuilder0.toString();
            L.o(s, "toString(...)");
            return s;
        }
    }

    public static final class c {
        private c() {
        }

        public c(w w0) {
        }

        @l
        public final k a() {
            return k.e;
        }

        @l
        public final k b() {
            return k.f;
        }
    }

    public static final class d {
        public static final class kotlin.text.k.d.a {
            @l
            private String a;
            @l
            private String b;
            private boolean c;

            public kotlin.text.k.d.a() {
                this.a = "";
                this.b = "";
                this.c = d.f.a().e();
            }

            @l
            public final d a() {
                return new d(this.a, this.b, this.c);
            }

            @l
            public final String b() {
                return this.a;
            }

            public final boolean c() {
                return this.c;
            }

            @l
            public final String d() {
                return this.b;
            }

            public final void e(@l String s) {
                L.p(s, "value");
                if(v.V2(s, '\n', false, 2, null) || v.V2(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + s);
                }
                this.a = s;
            }

            public final void f(boolean z) {
                this.c = z;
            }

            public final void g(@l String s) {
                L.p(s, "value");
                if(v.V2(s, '\n', false, 2, null) || v.V2(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + s);
                }
                this.b = s;
            }
        }

        public static final class kotlin.text.k.d.b {
            private kotlin.text.k.d.b() {
            }

            public kotlin.text.k.d.b(w w0) {
            }

            @l
            public final d a() {
                return d.g;
            }
        }

        @l
        private final String a;
        @l
        private final String b;
        private final boolean c;
        private final boolean d;
        private final boolean e;
        @l
        public static final kotlin.text.k.d.b f;
        @l
        private static final d g;

        static {
            d.f = new kotlin.text.k.d.b(null);
            d.g = new d("", "", false);
        }

        public d(@l String s, @l String s1, boolean z) {
            L.p(s, "prefix");
            L.p(s1, "suffix");
            super();
            this.a = s;
            this.b = s1;
            this.c = z;
            boolean z1 = false;
            this.d = s.length() == 0 && s1.length() == 0;
            if(kotlin.text.l.c(s) || kotlin.text.l.c(s1)) {
                z1 = true;
            }
            this.e = z1;
        }

        @l
        public final StringBuilder b(@l StringBuilder stringBuilder0, @l String s) {
            L.p(stringBuilder0, "sb");
            L.p(s, "indent");
            stringBuilder0.append(s);
            stringBuilder0.append("prefix = \"");
            stringBuilder0.append(this.a);
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("suffix = \"");
            stringBuilder0.append(this.b);
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("removeLeadingZeros = ");
            stringBuilder0.append(this.c);
            return stringBuilder0;
        }

        public final boolean c() {
            return this.e;
        }

        @l
        public final String d() {
            return this.a;
        }

        public final boolean e() {
            return this.c;
        }

        @l
        public final String f() {
            return this.b;
        }

        public final boolean g() {
            return this.d;
        }

        @Override
        @l
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("NumberHexFormat(");
            L.o(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(...)");
            StringBuilder stringBuilder1 = this.b(stringBuilder0, "    ");
            stringBuilder1.append('\n');
            L.o(stringBuilder1, "append(...)");
            stringBuilder0.append(")");
            String s = stringBuilder0.toString();
            L.o(s, "toString(...)");
            return s;
        }
    }

    private final boolean a;
    @l
    private final b b;
    @l
    private final d c;
    @l
    public static final c d;
    @l
    private static final k e;
    @l
    private static final k f;

    static {
        k.d = new c(null);
        k.e = new k(false, b.j.a(), d.f.a());
        k.f = new k(true, b.j.a(), d.f.a());
    }

    public k(boolean z, @l b k$b0, @l d k$d0) {
        L.p(k$b0, "bytes");
        L.p(k$d0, "number");
        super();
        this.a = z;
        this.b = k$b0;
        this.c = k$d0;
    }

    @l
    public final b c() {
        return this.b;
    }

    @l
    public final d d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("HexFormat(");
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append("    upperCase = ");
        stringBuilder0.append(this.a);
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append(",");
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append("    bytes = BytesHexFormat(");
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        L.o(stringBuilder0, "append(...)");
        StringBuilder stringBuilder1 = this.b.b(stringBuilder0, "        ");
        stringBuilder1.append('\n');
        L.o(stringBuilder1, "append(...)");
        stringBuilder0.append("    ),");
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append("    number = NumberHexFormat(");
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        L.o(stringBuilder0, "append(...)");
        StringBuilder stringBuilder2 = this.c.b(stringBuilder0, "        ");
        stringBuilder2.append('\n');
        L.o(stringBuilder2, "append(...)");
        stringBuilder0.append("    )");
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        L.o(stringBuilder0, "append(...)");
        stringBuilder0.append(")");
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }
}

