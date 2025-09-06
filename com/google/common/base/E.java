package com.google.common.base;

import J1.b;
import J1.c;
import J1.d;
import java.util.Arrays;
import java.util.BitSet;

@b(emulated = true)
@k
public abstract class e implements I {
    static class A extends e {
        private final String b;
        private final char[] c;
        private final char[] d;

        A(String s, char[] arr_c, char[] arr_c1) {
            this.b = s;
            this.c = arr_c;
            this.d = arr_c1;
            H.d(arr_c.length == arr_c1.length);
            for(int v = 0; v < arr_c.length; ++v) {
                H.d(arr_c[v] <= arr_c1[v]);
                if(v + 1 < arr_c.length) {
                    H.d(arr_c1[v] < arr_c[v + 1]);
                }
            }
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            int v = Arrays.binarySearch(this.c, c);
            return v < 0 ? ~v - 1 >= 0 && c <= this.d[~v - 1] : true;
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return this.b;
        }
    }

    static final class B extends A {
        static final e e;

        static {
            B.e = new B();
        }

        private B() {
            super("CharMatcher.singleWidth()", "\u0000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61".toCharArray(), "\u04F9\u05BE\u05EA\u05F4\u06FF\u077F\u0E7F\u20AF\u213A\uFDFF\uFEFF\uFFDC".toCharArray());
        }
    }

    @J1.e
    static final class C extends v {
        static final String c = " 　\r\u0085   　 \u000B　   　 \t     \f 　 　　 \n 　";
        static final int d = 0x6449BF0A;
        static final int e;
        static final e f;

        static {
            C.e = 27;
            C.f = new C();
        }

        C() {
            super("CharMatcher.whitespace()");
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return " 　\r\u0085   　 \u000B　   　 \t     \f 　 　　 \n 　".charAt(0x6449BF0A * c >>> C.e) == c;
        }

        @Override  // com.google.common.base.e
        @c
        @d
        void Q(BitSet bitSet0) {
            for(int v = 0; v < 0x20; ++v) {
                bitSet0.set(" 　\r\u0085   　 \u000B　   　 \t     \f 　 　　 \n 　".charAt(v));
            }
        }
    }

    static final class com.google.common.base.e.b extends e {
        final e b;
        final e c;

        com.google.common.base.e.b(e e0, e e1) {
            this.b = (e)H.E(e0);
            this.c = (e)H.E(e1);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return this.b.B(c) && this.c.B(c);
        }

        @Override  // com.google.common.base.e
        @c
        @d
        void Q(BitSet bitSet0) {
            BitSet bitSet1 = new BitSet();
            this.b.Q(bitSet1);
            BitSet bitSet2 = new BitSet();
            this.c.Q(bitSet2);
            bitSet1.and(bitSet2);
            bitSet0.or(bitSet1);
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.and(" + this.b + ", " + this.c + ")";
        }
    }

    static final class com.google.common.base.e.c extends v {
        static final e c;

        static {
            com.google.common.base.e.c.c = new com.google.common.base.e.c();
        }

        private com.google.common.base.e.c() {
            super("CharMatcher.any()");
        }

        @Override  // com.google.common.base.e
        public int A(CharSequence charSequence0) {
            return charSequence0.length() - 1;
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return true;
        }

        @Override  // com.google.common.base.e
        public boolean C(CharSequence charSequence0) {
            H.E(charSequence0);
            return true;
        }

        @Override  // com.google.common.base.e
        public boolean E(CharSequence charSequence0) {
            return charSequence0.length() == 0;
        }

        @Override  // com.google.common.base.e$i
        public e F() {
            return e.G();
        }

        @Override  // com.google.common.base.e
        public e I(e e0) {
            H.E(e0);
            return this;
        }

        @Override  // com.google.common.base.e
        public String M(CharSequence charSequence0) {
            H.E(charSequence0);
            return "";
        }

        @Override  // com.google.common.base.e
        public String N(CharSequence charSequence0, char c) {
            char[] arr_c = new char[charSequence0.length()];
            Arrays.fill(arr_c, c);
            return new String(arr_c);
        }

        @Override  // com.google.common.base.e
        public String O(CharSequence charSequence0, CharSequence charSequence1) {
            StringBuilder stringBuilder0 = new StringBuilder(charSequence0.length() * charSequence1.length());
            for(int v = 0; v < charSequence0.length(); ++v) {
                stringBuilder0.append(charSequence1);
            }
            return stringBuilder0.toString();
        }

        @Override  // com.google.common.base.e
        public String U(CharSequence charSequence0) {
            H.E(charSequence0);
            return "";
        }

        @Override  // com.google.common.base.e
        public e b(e e0) {
            return (e)H.E(e0);
        }

        @Override  // com.google.common.base.e
        public String h(CharSequence charSequence0, char c) {
            return charSequence0.length() == 0 ? "" : String.valueOf(c);
        }

        @Override  // com.google.common.base.e
        public int i(CharSequence charSequence0) {
            return charSequence0.length();
        }

        @Override  // com.google.common.base.e
        public int n(CharSequence charSequence0) {
            return charSequence0.length() == 0 ? -1 : 0;
        }

        @Override  // com.google.common.base.e
        public int o(CharSequence charSequence0, int v) {
            int v1 = charSequence0.length();
            H.d0(v, v1);
            return v == v1 ? -1 : v;
        }
    }

    static final class com.google.common.base.e.d extends e {
        private final char[] b;

        public com.google.common.base.e.d(CharSequence charSequence0) {
            char[] arr_c = charSequence0.toString().toCharArray();
            this.b = arr_c;
            Arrays.sort(arr_c);
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return Arrays.binarySearch(this.b, c) >= 0;
        }

        @Override  // com.google.common.base.e
        @c
        @d
        void Q(BitSet bitSet0) {
            char[] arr_c = this.b;
            for(int v = 0; v < arr_c.length; ++v) {
                bitSet0.set(((int)arr_c[v]));
            }
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("CharMatcher.anyOf(\"");
            char[] arr_c = this.b;
            for(int v = 0; v < arr_c.length; ++v) {
                stringBuilder0.append(e.R(arr_c[v]));
            }
            stringBuilder0.append("\")");
            return stringBuilder0.toString();
        }
    }

    static final class com.google.common.base.e.e extends v {
        static final e c;

        static {
            com.google.common.base.e.e.c = new com.google.common.base.e.e();
        }

        com.google.common.base.e.e() {
            super("CharMatcher.ascii()");
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return c <= 0x7F;
        }
    }

    @c
    @d
    static final class f extends v {
        private final BitSet c;

        private f(BitSet bitSet0, String s) {
            super(s);
            if(bitSet0.length() + 0x40 < bitSet0.size()) {
                bitSet0 = (BitSet)bitSet0.clone();
            }
            this.c = bitSet0;
        }

        f(BitSet bitSet0, String s, a e$a0) {
            this(bitSet0, s);
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return this.c.get(((int)c));
        }

        @Override  // com.google.common.base.e
        void Q(BitSet bitSet0) {
            bitSet0.or(this.c);
        }
    }

    static final class g extends e {
        static final e b;

        static {
            g.b = new g();
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            switch(c) {
                case 0x2007: {
                    return false;
                }
                case 0x20: 
                case 0x85: 
                case 5760: 
                case 0x2028: 
                case 0x2029: 
                case 0x205F: 
                case 0x3000: {
                    return true;
                }
                default: {
                    return c == 9 || c == 10 || c == 11 || c == 12 || c == 13 || c >= 0x2000 && c <= 0x200A;
                }
            }
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    static final class h extends A {
        private static final String e = "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0DE6\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1A80\u1A90\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uA9D0\uA9F0\uAA50\uABF0\uFF10";
        static final e f;

        static {
            h.f = new h();
        }

        private h() {
            super("CharMatcher.digit()", h.Z(), h.Y());
        }

        private static char[] Y() {
            char[] arr_c = new char[37];
            for(int v = 0; v < 37; ++v) {
                arr_c[v] = (char)("0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0DE6\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1A80\u1A90\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uA9D0\uA9F0\uAA50\uABF0\uFF10".charAt(v) + 9);
            }
            return arr_c;
        }

        private static char[] Z() {
            return "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0DE6\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1A80\u1A90\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uA9D0\uA9F0\uAA50\uABF0\uFF10".toCharArray();
        }
    }

    static abstract class i extends e {
        @Override  // com.google.common.base.e
        public e F() {
            return new x(this);
        }

        @Override  // com.google.common.base.e
        public final e J() {
            return this;
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }
    }

    static final class j extends e {
        private final I b;

        j(I i0) {
            this.b = (I)H.E(i0);
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return this.b.apply(Character.valueOf(c));
        }

        @Override  // com.google.common.base.e
        public boolean apply(Object object0) {
            return this.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public boolean e(Character character0) {
            Object object0 = H.E(character0);
            return this.b.apply(object0);
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.forPredicate(" + this.b + ")";
        }
    }

    static final class com.google.common.base.e.k extends i {
        private final char b;
        private final char c;

        com.google.common.base.e.k(char c, char c1) {
            H.d(c1 >= c);
            this.b = c;
            this.c = c1;
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return this.b <= c && c <= this.c;
        }

        @Override  // com.google.common.base.e
        @c
        @d
        void Q(BitSet bitSet0) {
            bitSet0.set(((int)this.b), this.c + 1);
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.inRange(\'" + e.R(this.b) + "\', \'" + e.R(this.c) + "\')";
        }
    }

    static final class l extends A {
        private static final String e = "\u0000\u007F\u00AD\u0600\u061C\u06DD\u070F\u0890\u08E2\u1680\u180E\u2000\u2028\u205F\u2066\u3000\uD800\uFEFF\uFFF9";
        private static final String f = " \u00A0\u00AD\u0605\u061C\u06DD\u070F\u0891\u08E2\u1680\u180E\u200F\u202F\u2064\u206F\u3000\uF8FF\uFEFF\uFFFB";
        static final e g;

        static {
            l.g = new l();
        }

        private l() {
            super("CharMatcher.invisible()", "\u0000\u007F\u00AD\u0600\u061C\u06DD\u070F\u0890\u08E2\u1680\u180E\u2000\u2028\u205F\u2066\u3000\uD800\uFEFF\uFFF9".toCharArray(), " \u00A0\u00AD\u0605\u061C\u06DD\u070F\u0891\u08E2\u1680\u180E\u200F\u202F\u2064\u206F\u3000\uF8FF\uFEFF\uFFFB".toCharArray());
        }
    }

    static final class m extends i {
        private final char b;

        m(char c) {
            this.b = c;
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return c == this.b;
        }

        @Override  // com.google.common.base.e$i
        public e F() {
            return e.s(this.b);
        }

        @Override  // com.google.common.base.e
        public e I(e e0) {
            return e0.B(this.b) ? e0 : super.I(e0);
        }

        @Override  // com.google.common.base.e
        public String N(CharSequence charSequence0, char c) {
            return charSequence0.toString().replace(this.b, c);
        }

        @Override  // com.google.common.base.e
        @c
        @d
        void Q(BitSet bitSet0) {
            bitSet0.set(((int)this.b));
        }

        @Override  // com.google.common.base.e
        public e b(e e0) {
            return e0.B(this.b) ? this : e.G();
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.is(\'" + e.R(this.b) + "\')";
        }
    }

    static final class n extends i {
        private final char b;
        private final char c;

        n(char c, char c1) {
            this.b = c;
            this.c = c1;
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return c == this.b || c == this.c;
        }

        @Override  // com.google.common.base.e
        @c
        @d
        void Q(BitSet bitSet0) {
            bitSet0.set(((int)this.b));
            bitSet0.set(((int)this.c));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.anyOf(\"" + e.R(this.b) + e.R(this.c) + "\")";
        }
    }

    static final class o extends i {
        private final char b;

        o(char c) {
            this.b = c;
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return c != this.b;
        }

        @Override  // com.google.common.base.e$i
        public e F() {
            return e.q(this.b);
        }

        @Override  // com.google.common.base.e
        public e I(e e0) {
            return e0.B(this.b) ? e.c() : this;
        }

        @Override  // com.google.common.base.e
        @c
        @d
        void Q(BitSet bitSet0) {
            bitSet0.set(0, ((int)this.b));
            bitSet0.set(this.b + 1, 0x10000);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.e
        public e b(e e0) {
            return e0.B(this.b) ? super.b(e0) : e0;
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.isNot(\'" + e.R(this.b) + "\')";
        }
    }

    static final class p extends e {
        static final e b;

        static {
            p.b = new p();
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return Character.isDigit(c);
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    static final class q extends v {
        static final e c;

        static {
            q.c = new q();
        }

        private q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return c <= 0x1F || c >= 0x7F && c <= 0x9F;
        }
    }

    static final class r extends e {
        static final e b;

        static {
            r.b = new r();
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return Character.isLetter(c);
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    static final class s extends e {
        static final e b;

        static {
            s.b = new s();
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return Character.isLetterOrDigit(c);
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    static final class t extends e {
        static final e b;

        static {
            t.b = new t();
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return Character.isLowerCase(c);
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    static final class u extends e {
        static final e b;

        static {
            u.b = new u();
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return Character.isUpperCase(c);
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    static abstract class v extends i {
        private final String b;

        v(String s) {
            this.b = (String)H.E(s);
        }

        @Override  // com.google.common.base.e
        public final String toString() {
            return this.b;
        }
    }

    static class w extends e {
        final e b;

        w(e e0) {
            this.b = (e)H.E(e0);
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return !this.b.B(c);
        }

        @Override  // com.google.common.base.e
        public boolean C(CharSequence charSequence0) {
            return this.b.E(charSequence0);
        }

        @Override  // com.google.common.base.e
        public boolean E(CharSequence charSequence0) {
            return this.b.C(charSequence0);
        }

        @Override  // com.google.common.base.e
        public e F() {
            return this.b;
        }

        @Override  // com.google.common.base.e
        @c
        @d
        void Q(BitSet bitSet0) {
            BitSet bitSet1 = new BitSet();
            this.b.Q(bitSet1);
            bitSet1.flip(0, 0x10000);
            bitSet0.or(bitSet1);
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public int i(CharSequence charSequence0) {
            return charSequence0.length() - this.b.i(charSequence0);
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return this.b + ".negate()";
        }
    }

    static class x extends w {
        x(e e0) {
            super(e0);
        }

        @Override  // com.google.common.base.e
        public final e J() {
            return this;
        }
    }

    static final class y extends v {
        static final e c;

        static {
            y.c = new y();
        }

        private y() {
            super("CharMatcher.none()");
        }

        @Override  // com.google.common.base.e
        public int A(CharSequence charSequence0) {
            H.E(charSequence0);
            return -1;
        }

        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return false;
        }

        @Override  // com.google.common.base.e
        public boolean C(CharSequence charSequence0) {
            return charSequence0.length() == 0;
        }

        @Override  // com.google.common.base.e
        public boolean E(CharSequence charSequence0) {
            H.E(charSequence0);
            return true;
        }

        @Override  // com.google.common.base.e$i
        public e F() {
            return e.c();
        }

        @Override  // com.google.common.base.e
        public e I(e e0) {
            return (e)H.E(e0);
        }

        @Override  // com.google.common.base.e
        public String M(CharSequence charSequence0) {
            return charSequence0.toString();
        }

        @Override  // com.google.common.base.e
        public String N(CharSequence charSequence0, char c) {
            return charSequence0.toString();
        }

        @Override  // com.google.common.base.e
        public String O(CharSequence charSequence0, CharSequence charSequence1) {
            H.E(charSequence1);
            return charSequence0.toString();
        }

        @Override  // com.google.common.base.e
        public String U(CharSequence charSequence0) {
            return charSequence0.toString();
        }

        @Override  // com.google.common.base.e
        public String V(CharSequence charSequence0) {
            return charSequence0.toString();
        }

        @Override  // com.google.common.base.e
        public String W(CharSequence charSequence0) {
            return charSequence0.toString();
        }

        @Override  // com.google.common.base.e
        public e b(e e0) {
            H.E(e0);
            return this;
        }

        @Override  // com.google.common.base.e
        public String h(CharSequence charSequence0, char c) {
            return charSequence0.toString();
        }

        @Override  // com.google.common.base.e
        public int i(CharSequence charSequence0) {
            H.E(charSequence0);
            return 0;
        }

        @Override  // com.google.common.base.e
        public int n(CharSequence charSequence0) {
            H.E(charSequence0);
            return -1;
        }

        @Override  // com.google.common.base.e
        public int o(CharSequence charSequence0, int v) {
            H.d0(v, charSequence0.length());
            return -1;
        }
    }

    static final class z extends e {
        final e b;
        final e c;

        z(e e0, e e1) {
            this.b = (e)H.E(e0);
            this.c = (e)H.E(e1);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.e
        public boolean B(char c) {
            return this.b.B(c) || this.c.B(c);
        }

        @Override  // com.google.common.base.e
        @c
        @d
        void Q(BitSet bitSet0) {
            this.b.Q(bitSet0);
            this.c.Q(bitSet0);
        }

        @Override  // com.google.common.base.e
        @Deprecated
        public boolean apply(Object object0) {
            return super.e(((Character)object0));
        }

        @Override  // com.google.common.base.e
        public String toString() {
            return "CharMatcher.or(" + this.b + ", " + this.c + ")";
        }
    }

    private static final int a = 0x10000;

    public int A(CharSequence charSequence0) {
        for(int v = charSequence0.length() - 1; v >= 0; --v) {
            if(this.B(charSequence0.charAt(v))) {
                return v;
            }
        }
        return -1;
    }

    public abstract boolean B(char arg1);

    public boolean C(CharSequence charSequence0) {
        for(int v = charSequence0.length() - 1; v >= 0; --v) {
            if(!this.B(charSequence0.charAt(v))) {
                return false;
            }
        }
        return true;
    }

    public boolean D(CharSequence charSequence0) {
        return !this.E(charSequence0);
    }

    public boolean E(CharSequence charSequence0) {
        return this.n(charSequence0) == -1;
    }

    public e F() {
        return new w(this);
    }

    public static e G() {
        return y.c;
    }

    public static e H(CharSequence charSequence0) {
        return e.d(charSequence0).F();
    }

    public e I(e e0) {
        return new z(this, e0);
    }

    public e J() {
        return G.h(this);
    }

    @c
    @d
    e K() {
        class a extends x {
            final String c;

            a(e e1, String s) {
                this.c = s;
                super(e1);
            }

            @Override  // com.google.common.base.e$w
            public String toString() {
                return this.c;
            }
        }

        BitSet bitSet0 = new BitSet();
        this.Q(bitSet0);
        int v = bitSet0.cardinality();
        if(v * 2 <= 0x10000) {
            return e.L(v, bitSet0, "jebdyn.dexdec.irsb.Object_146d32eb@6d7b1f1e");
        }
        bitSet0.flip(0, 0x10000);
        return new a(this, e.L(0x10000 - v, bitSet0, "jebdyn.dexdec.irsb.Object_146d32eb@6d7b1f1e.negate()"), "jebdyn.dexdec.irsb.Object_146d32eb@6d7b1f1e");
    }

    @c
    @d
    private static e L(int v, BitSet bitSet0, String s) {
        switch(v) {
            case 0: {
                return e.G();
            }
            case 1: {
                return e.q(((char)bitSet0.nextSetBit(0)));
            }
            case 2: {
                int v1 = (char)bitSet0.nextSetBit(0);
                return e.r(((char)v1), ((char)bitSet0.nextSetBit(v1 + 1)));
            }
            default: {
                return e.t(v, bitSet0.length()) ? L.a0(bitSet0, s) : new f(bitSet0, s, null);
            }
        }
    }

    public String M(CharSequence charSequence0) {
        String s = charSequence0.toString();
        int v = this.n(s);
        if(v == -1) {
            return s;
        }
        char[] arr_c = s.toCharArray();
        int v1 = 1;
    alab1:
        while(true) {
            ++v;
            while(true) {
                if(v == arr_c.length) {
                    break alab1;
                }
                if(this.B(arr_c[v])) {
                    ++v1;
                    break;
                }
                arr_c[v - v1] = arr_c[v];
                ++v;
            }
        }
        return new String(arr_c, 0, v - v1);
    }

    public String N(CharSequence charSequence0, char c) {
        String s = charSequence0.toString();
        int v = this.n(s);
        if(v == -1) {
            return s;
        }
        char[] arr_c = s.toCharArray();
        arr_c[v] = c;
        while(true) {
            ++v;
            if(v >= arr_c.length) {
                break;
            }
            if(this.B(arr_c[v])) {
                arr_c[v] = c;
            }
        }
        return new String(arr_c);
    }

    public String O(CharSequence charSequence0, CharSequence charSequence1) {
        int v = 0;
        int v1 = charSequence1.length();
        if(v1 == 0) {
            return this.M(charSequence0);
        }
        if(v1 == 1) {
            return this.N(charSequence0, charSequence1.charAt(0));
        }
        String s = charSequence0.toString();
        int v2 = this.n(s);
        if(v2 == -1) {
            return s;
        }
        int v3 = s.length();
        StringBuilder stringBuilder0 = new StringBuilder(v3 * 3 / 2 + 16);
        do {
            stringBuilder0.append(s, v, v2);
            stringBuilder0.append(charSequence1);
            v = v2 + 1;
            v2 = this.o(s, v);
        }
        while(v2 != -1);
        stringBuilder0.append(s, v, v3);
        return stringBuilder0.toString();
    }

    public String P(CharSequence charSequence0) {
        return this.F().M(charSequence0);
    }

    @c
    @d
    void Q(BitSet bitSet0) {
        for(int v = 0xFFFF; v >= 0; --v) {
            if(this.B(((char)v))) {
                bitSet0.set(v);
            }
        }
    }

    private static String R(char c) {
        char[] arr_c = {'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        for(int v = 0; v < 4; ++v) {
            arr_c[5 - v] = "0123456789ABCDEF".charAt(c & 15);
            c = (char)(c >> 4);
        }
        return String.copyValueOf(arr_c);
    }

    @Deprecated
    public static e S() {
        return B.e;
    }

    public String T(CharSequence charSequence0, char c) {
        int v = charSequence0.length();
        int v1;
        for(v1 = 0; v1 < v && this.B(charSequence0.charAt(v1)); ++v1) {
        }
        int v2;
        for(v2 = v - 1; v2 > v1 && this.B(charSequence0.charAt(v2)); --v2) {
        }
        return v1 != 0 || v2 != v - 1 ? this.k(charSequence0, v1, v2 + 1, c, new StringBuilder(v2 + 1 - v1), false) : this.h(charSequence0, c);
    }

    public String U(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1;
        for(v1 = 0; v1 < v && this.B(charSequence0.charAt(v1)); ++v1) {
        }
        int v2;
        for(v2 = v - 1; v2 > v1 && this.B(charSequence0.charAt(v2)); --v2) {
        }
        return charSequence0.subSequence(v1, v2 + 1).toString();
    }

    public String V(CharSequence charSequence0) {
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.B(charSequence0.charAt(v1))) {
                return charSequence0.subSequence(v1, v).toString();
            }
        }
        return "";
    }

    public String W(CharSequence charSequence0) {
        for(int v = charSequence0.length() - 1; v >= 0; --v) {
            if(!this.B(charSequence0.charAt(v))) {
                return charSequence0.subSequence(0, v + 1).toString();
            }
        }
        return "";
    }

    public static e X() {
        return C.f;
    }

    @Override  // com.google.common.base.I
    @Deprecated
    public boolean apply(Object object0) {
        return this.e(((Character)object0));
    }

    public e b(e e0) {
        return new com.google.common.base.e.b(this, e0);
    }

    public static e c() {
        return com.google.common.base.e.c.c;
    }

    public static e d(CharSequence charSequence0) {
        switch(charSequence0.length()) {
            case 0: {
                return e.G();
            }
            case 1: {
                return e.q(charSequence0.charAt(0));
            }
            case 2: {
                return e.r(charSequence0.charAt(0), charSequence0.charAt(1));
            }
            default: {
                return new com.google.common.base.e.d(charSequence0);
            }
        }
    }

    @Deprecated
    public boolean e(Character character0) {
        return this.B(character0.charValue());
    }

    public static e f() {
        return com.google.common.base.e.e.c;
    }

    public static e g() {
        return g.b;
    }

    public String h(CharSequence charSequence0, char c) {
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = charSequence0.charAt(v1);
            if(this.B(((char)v2))) {
                if(v2 == c && (v1 == v - 1 || !this.B(charSequence0.charAt(v1 + 1)))) {
                    ++v1;
                    continue;
                }
                StringBuilder stringBuilder0 = new StringBuilder(v);
                stringBuilder0.append(charSequence0, 0, v1);
                stringBuilder0.append(c);
                return this.k(charSequence0, v1 + 1, v, c, stringBuilder0, true);
            }
        }
        return charSequence0.toString();
    }

    public int i(CharSequence charSequence0) {
        int v1 = 0;
        for(int v = 0; v < charSequence0.length(); ++v) {
            if(this.B(charSequence0.charAt(v))) {
                ++v1;
            }
        }
        return v1;
    }

    @Deprecated
    public static e j() {
        return h.f;
    }

    private String k(CharSequence charSequence0, int v, int v1, char c, StringBuilder stringBuilder0, boolean z) {
        while(v < v1) {
            int v2 = charSequence0.charAt(v);
            if(!this.B(((char)v2))) {
                stringBuilder0.append(((char)v2));
                z = false;
            }
            else if(!z) {
                stringBuilder0.append(c);
                z = true;
            }
            ++v;
        }
        return stringBuilder0.toString();
    }

    public static e l(I i0) {
        return i0 instanceof e ? ((e)i0) : new j(i0);
    }

    public static e m(char c, char c1) [...] // Inlined contents

    public int n(CharSequence charSequence0) {
        return this.o(charSequence0, 0);
    }

    public int o(CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        H.d0(v, v1);
        while(v < v1) {
            if(this.B(charSequence0.charAt(v))) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    @Deprecated
    public static e p() {
        return l.g;
    }

    public static e q(char c) [...] // Inlined contents

    private static n r(char c, char c1) {
        return new n(c, c1);
    }

    public static e s(char c) {
        return new o(c);
    }

    @c
    @d
    private static boolean t(int v, int v1) {
        return v <= 0x3FF && v1 > v * 0x40;
    }

    @Override
    public String toString() [...] // 潜在的解密器

    @Deprecated
    public static e u() {
        return p.b;
    }

    public static e v() {
        return q.c;
    }

    @Deprecated
    public static e w() {
        return r.b;
    }

    @Deprecated
    public static e x() {
        return s.b;
    }

    @Deprecated
    public static e y() {
        return t.b;
    }

    @Deprecated
    public static e z() {
        return u.b;
    }
}

