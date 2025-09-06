package com.google.common.io;

import J1.b;
import J1.d;
import com.google.common.base.H;
import com.google.common.base.c;
import j..util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import o3.a;

@b(emulated = true)
@q
public abstract class com.google.common.io.b {
    static final class f {
        private final String a;
        private final char[] b;
        final int c;
        final int d;
        final int e;
        final int f;
        private final byte[] g;
        private final boolean[] h;
        private final boolean i;

        f(String s, char[] arr_c) {
            this(s, arr_c, f.c(arr_c), false);
        }

        private f(String s, char[] arr_c, byte[] arr_b, boolean z) {
            int v;
            this.a = (String)H.E(s);
            this.b = (char[])H.E(arr_c);
            try {
                v = com.google.common.math.f.p(arr_c.length, RoundingMode.UNNECESSARY);
                this.d = v;
            }
            catch(ArithmeticException arithmeticException0) {
                throw new IllegalArgumentException("Illegal alphabet length " + arr_c.length, arithmeticException0);
            }
            int v1 = Integer.numberOfTrailingZeros(v);
            int v2 = 1 << 3 - v1;
            this.e = v2;
            this.f = v >> v1;
            this.c = arr_c.length - 1;
            this.g = arr_b;
            boolean[] arr_z = new boolean[v2];
            for(int v3 = 0; v3 < this.f; ++v3) {
                arr_z[com.google.common.math.f.g(v3 * 8, this.d, RoundingMode.CEILING)] = true;
            }
            this.h = arr_z;
            this.i = z;
        }

        boolean b(char c) {
            return c <= 0x7F && this.g[c] != -1;
        }

        private static byte[] c(char[] arr_c) {
            byte[] arr_b = new byte[0x80];
            Arrays.fill(arr_b, -1);
            for(int v = 0; v < arr_c.length; ++v) {
                int v1 = arr_c[v];
                boolean z = true;
                H.f(v1 < 0x80, "Non-ASCII character: %s", ((char)v1));
                if(arr_b[v1] != -1) {
                    z = false;
                }
                H.f(z, "Duplicate character: %s", ((char)v1));
                arr_b[v1] = (byte)v;
            }
            return arr_b;
        }

        int d(char c) throws i {
            if(c > 0x7F) {
                throw new i("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            int v = this.g[c];
            if(v == -1) {
                throw c <= 0x20 || c == 0x7F ? new i("Unrecognized character: 0x" + Integer.toHexString(c)) : new i("Unrecognized character: " + c);
            }
            return v;
        }

        char e(int v) {
            return this.b[v];
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@a Object object0) {
            return object0 instanceof f && this.i == ((f)object0).i && Arrays.equals(this.b, ((f)object0).b);
        }

        private boolean f() {
            char[] arr_c = this.b;
            for(int v = 0; v < arr_c.length; ++v) {
                if(c.c(arr_c[v])) {
                    return true;
                }
            }
            return false;
        }

        private boolean g() {
            char[] arr_c = this.b;
            for(int v = 0; v < arr_c.length; ++v) {
                if(c.d(arr_c[v])) {
                    return true;
                }
            }
            return false;
        }

        f h() {
            if(this.i) {
                return this;
            }
            byte[] arr_b = Arrays.copyOf(this.g, this.g.length);
            for(int v = 65; true; ++v) {
                boolean z = true;
                if(v > 90) {
                    break;
                }
                byte b = this.g[v];
                byte b1 = this.g[v | 0x20];
                if(b == -1) {
                    arr_b[v] = b1;
                }
                else {
                    if(b1 != -1) {
                        z = false;
                    }
                    H.j0(z, "Can\'t ignoreCase() since \'%s\' and \'%s\' encode different values", ((char)v), ((char)(v | 0x20)));
                    arr_b[v | 0x20] = b;
                }
            }
            return new f(this.a + ".ignoreCase()", this.b, arr_b, true);
        }

        @Override
        public int hashCode() {
            int v = Arrays.hashCode(this.b);
            return this.i ? v + 0x4CF : v + 0x4D5;
        }

        boolean i(int v) {
            return this.h[v % this.e];
        }

        f j() {
            if(!this.g()) {
                return this;
            }
            H.h0(!this.f(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] arr_c = new char[this.b.length];
            for(int v = 0; true; ++v) {
                char[] arr_c1 = this.b;
                if(v >= arr_c1.length) {
                    break;
                }
                arr_c[v] = c.e(arr_c1[v]);
            }
            f b$f0 = new f(this.a + ".lowerCase()", arr_c);
            return this.i ? b$f0.h() : b$f0;
        }

        public boolean k(char c) {
            return c < this.g.length && this.g[c] != -1;
        }

        f l() {
            if(!this.f()) {
                return this;
            }
            H.h0(!this.g(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] arr_c = new char[this.b.length];
            for(int v = 0; true; ++v) {
                char[] arr_c1 = this.b;
                if(v >= arr_c1.length) {
                    break;
                }
                arr_c[v] = c.h(arr_c1[v]);
            }
            f b$f0 = new f(this.a + ".upperCase()", arr_c);
            return this.i ? b$f0.h() : b$f0;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    static final class g extends k {
        final char[] k;

        private g(f b$f0) {
            super(b$f0, null);
            this.k = new char[0x200];
            H.d(b$f0.b.length == 16);
            for(int v = 0; v < 0x100; ++v) {
                this.k[v] = b$f0.e(v >>> 4);
                this.k[v | 0x100] = b$f0.e(v & 15);
            }
        }

        g(String s, String s1) {
            this(new f(s, s1.toCharArray()));
        }

        @Override  // com.google.common.io.b$k
        com.google.common.io.b E(f b$f0, @a Character character0) {
            return new g(b$f0);
        }

        @Override  // com.google.common.io.b$k
        int i(byte[] arr_b, CharSequence charSequence0) throws i {
            H.E(arr_b);
            if(charSequence0.length() % 2 == 1) {
                throw new i("Invalid input length " + charSequence0.length());
            }
            int v = 0;
            int v1;
            for(v1 = 0; v < charSequence0.length(); ++v1) {
                int v2 = charSequence0.charAt(v);
                int v3 = this.f.d(((char)v2));
                int v4 = charSequence0.charAt(v + 1);
                arr_b[v1] = (byte)(v3 << 4 | this.f.d(((char)v4)));
                v += 2;
            }
            return v1;
        }

        @Override  // com.google.common.io.b$k
        void n(Appendable appendable0, byte[] arr_b, int v, int v1) throws IOException {
            H.E(appendable0);
            H.f0(v, v + v1, arr_b.length);
            for(int v2 = 0; v2 < v1; ++v2) {
                int v3 = arr_b[v + v2] & 0xFF;
                appendable0.append(this.k[v3]);
                appendable0.append(this.k[v3 | 0x100]);
            }
        }
    }

    static final class h extends k {
        private h(f b$f0, @a Character character0) {
            super(b$f0, character0);
            H.d(b$f0.b.length == 0x40);
        }

        h(String s, String s1, @a Character character0) {
            this(new f(s, s1.toCharArray()), character0);
        }

        @Override  // com.google.common.io.b$k
        com.google.common.io.b E(f b$f0, @a Character character0) {
            return new h(b$f0, character0);
        }

        @Override  // com.google.common.io.b$k
        int i(byte[] arr_b, CharSequence charSequence0) throws i {
            H.E(arr_b);
            CharSequence charSequence1 = this.z(charSequence0);
            int v = charSequence1.length();
            if(!this.f.i(v)) {
                throw new i("Invalid input length " + charSequence1.length());
            }
            int v1 = 0;
            int v2 = 0;
            while(v1 < charSequence1.length()) {
                int v3 = charSequence1.charAt(v1);
                int v4 = this.f.d(((char)v3));
                int v5 = charSequence1.charAt(v1 + 1);
                int v6 = v4 << 18 | this.f.d(((char)v5)) << 12;
                arr_b[v2] = (byte)(v6 >>> 16);
                if(v1 + 2 < charSequence1.length()) {
                    int v7 = v1 + 3;
                    int v8 = charSequence1.charAt(v1 + 2);
                    int v9 = v6 | this.f.d(((char)v8)) << 6;
                    int v10 = v2 + 2;
                    arr_b[v2 + 1] = (byte)(v9 >>> 8 & 0xFF);
                    if(v7 < charSequence1.length()) {
                        v1 += 4;
                        int v11 = charSequence1.charAt(v7);
                        v2 += 3;
                        arr_b[v10] = (byte)((v9 | this.f.d(((char)v11))) & 0xFF);
                    }
                    else {
                        v2 = v10;
                        v1 = v7;
                    }
                }
                else {
                    ++v2;
                    v1 += 2;
                }
            }
            return v2;
        }

        @Override  // com.google.common.io.b$k
        void n(Appendable appendable0, byte[] arr_b, int v, int v1) throws IOException {
            H.E(appendable0);
            int v2 = v + v1;
            H.f0(v, v2, arr_b.length);
            while(v1 >= 3) {
                int v3 = v + 2;
                int v4 = (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v] & 0xFF) << 16;
                v += 3;
                int v5 = v4 | arr_b[v3] & 0xFF;
                appendable0.append(this.f.e(v5 >>> 18));
                appendable0.append(this.f.e(v5 >>> 12 & 0x3F));
                appendable0.append(this.f.e(v5 >>> 6 & 0x3F));
                appendable0.append(this.f.e(v5 & 0x3F));
                v1 -= 3;
            }
            if(v < v2) {
                this.D(appendable0, arr_b, v, v2 - v);
            }
        }
    }

    public static final class i extends IOException {
        i(String s) {
            super(s);
        }

        i(Throwable throwable0) {
            super(throwable0);
        }
    }

    static final class j extends com.google.common.io.b {
        private final com.google.common.io.b f;
        private final String g;
        private final int h;

        j(com.google.common.io.b b0, String s, int v) {
            this.f = (com.google.common.io.b)H.E(b0);
            this.g = (String)H.E(s);
            this.h = v;
            H.k(v > 0, "Cannot add a separator after every %s chars", v);
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b A() {
            return this.f.A().C(this.g, this.h);
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b B(char c) {
            return this.f.B(c).C(this.g, this.h);
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b C(String s, int v) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        @Override  // com.google.common.io.b
        public boolean f(CharSequence charSequence0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < charSequence0.length(); ++v) {
                int v1 = charSequence0.charAt(v);
                if(this.g.indexOf(v1) < 0) {
                    stringBuilder0.append(((char)v1));
                }
            }
            return this.f.f(stringBuilder0);
        }

        @Override  // com.google.common.io.b
        int i(byte[] arr_b, CharSequence charSequence0) throws i {
            StringBuilder stringBuilder0 = new StringBuilder(charSequence0.length());
            for(int v = 0; v < charSequence0.length(); ++v) {
                int v1 = charSequence0.charAt(v);
                if(this.g.indexOf(v1) < 0) {
                    stringBuilder0.append(((char)v1));
                }
            }
            return this.f.i(arr_b, stringBuilder0);
        }

        @Override  // com.google.common.io.b
        @J1.c
        @d
        public InputStream k(Reader reader0) {
            Reader reader1 = com.google.common.io.b.s(reader0, this.g);
            return this.f.k(reader1);
        }

        @Override  // com.google.common.io.b
        void n(Appendable appendable0, byte[] arr_b, int v, int v1) throws IOException {
            Appendable appendable1 = com.google.common.io.b.x(appendable0, this.g, this.h);
            this.f.n(appendable1, arr_b, v, v1);
        }

        @Override  // com.google.common.io.b
        @J1.c
        @d
        public OutputStream p(Writer writer0) {
            Writer writer1 = com.google.common.io.b.y(writer0, this.g, this.h);
            return this.f.p(writer1);
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b r() {
            return this.f.r().C(this.g, this.h);
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b t() {
            return this.f.t().C(this.g, this.h);
        }

        @Override
        public String toString() {
            return this.f + ".withSeparator(\"" + this.g + "\", " + this.h + ")";
        }

        @Override  // com.google.common.io.b
        int u(int v) {
            return this.f.u(v);
        }

        @Override  // com.google.common.io.b
        int v(int v) {
            int v1 = this.f.v(v);
            int v2 = com.google.common.math.f.g(Math.max(0, v1 - 1), this.h, RoundingMode.FLOOR);
            return v1 + this.g.length() * v2;
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b w() {
            return this.f.w().C(this.g, this.h);
        }

        @Override  // com.google.common.io.b
        CharSequence z(CharSequence charSequence0) {
            return this.f.z(charSequence0);
        }
    }

    static class k extends com.google.common.io.b {
        final f f;
        @a
        final Character g;
        @P1.b
        @a
        private volatile com.google.common.io.b h;
        @P1.b
        @a
        private volatile com.google.common.io.b i;
        @P1.b
        @a
        private volatile com.google.common.io.b j;

        k(f b$f0, @a Character character0) {
            this.f = (f)H.E(b$f0);
            H.u(character0 == null || !b$f0.k(character0.charValue()), "Padding character %s was already in alphabet", character0);
            this.g = character0;
        }

        k(String s, String s1, @a Character character0) {
            this(new f(s, s1.toCharArray()), character0);
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b A() {
            com.google.common.io.b b0 = this.h;
            if(b0 == null) {
                f b$f0 = this.f.l();
                b0 = b$f0 == this.f ? this : this.E(b$f0, this.g);
                this.h = b0;
            }
            return b0;
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b B(char c) {
            return 8 % this.f.d != 0 && (this.g == null || this.g.charValue() != c) ? this.E(this.f, Character.valueOf(c)) : this;
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b C(String s, int v) {
            boolean z = false;
            for(int v1 = 0; v1 < s.length(); ++v1) {
                H.u(!this.f.k(s.charAt(v1)), "Separator (%s) cannot contain alphabet characters", s);
            }
            Character character0 = this.g;
            if(character0 != null) {
                if(s.indexOf(character0.charValue()) < 0) {
                    z = true;
                }
                H.u(z, "Separator (%s) cannot contain padding character", s);
            }
            return new j(this, s, v);
        }

        void D(Appendable appendable0, byte[] arr_b, int v, int v1) throws IOException {
            H.E(appendable0);
            H.f0(v, v + v1, arr_b.length);
            int v2 = 0;
            H.d(v1 <= this.f.f);
            long v3 = 0L;
            for(int v4 = 0; v4 < v1; ++v4) {
                v3 = (v3 | ((long)(arr_b[v + v4] & 0xFF))) << 8;
            }
            int v5 = (v1 + 1) * 8 - this.f.d;
            while(v2 < v1 * 8) {
                appendable0.append(this.f.e(((int)(v3 >>> v5 - v2)) & this.f.c));
                v2 += this.f.d;
            }
            if(this.g != null) {
                while(v2 < this.f.f * 8) {
                    appendable0.append(this.g.charValue());
                    v2 += this.f.d;
                }
            }
        }

        com.google.common.io.b E(f b$f0, @a Character character0) {
            return new k(b$f0, character0);
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(@a Object object0) {
            return object0 instanceof k && this.f.equals(((k)object0).f) && Objects.equals(this.g, ((k)object0).g);
        }

        @Override  // com.google.common.io.b
        public boolean f(CharSequence charSequence0) {
            H.E(charSequence0);
            CharSequence charSequence1 = this.z(charSequence0);
            int v = charSequence1.length();
            if(!this.f.i(v)) {
                return false;
            }
            for(int v1 = 0; v1 < charSequence1.length(); ++v1) {
                int v2 = charSequence1.charAt(v1);
                if(!this.f.b(((char)v2))) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            return this.f.hashCode() ^ Objects.hashCode(this.g);
        }

        @Override  // com.google.common.io.b
        int i(byte[] arr_b, CharSequence charSequence0) throws i {
            f b$f0;
            H.E(arr_b);
            CharSequence charSequence1 = this.z(charSequence0);
            int v = charSequence1.length();
            if(!this.f.i(v)) {
                throw new i("Invalid input length " + charSequence1.length());
            }
            int v2 = 0;
            for(int v1 = 0; v1 < charSequence1.length(); v1 += this.f.e) {
                long v3 = 0L;
                int v5 = 0;
                for(int v4 = 0; true; ++v4) {
                    b$f0 = this.f;
                    if(v4 >= b$f0.e) {
                        break;
                    }
                    v3 <<= b$f0.d;
                    if(v1 + v4 < charSequence1.length()) {
                        int v6 = charSequence1.charAt(v5 + v1);
                        v3 |= (long)this.f.d(((char)v6));
                        ++v5;
                    }
                }
                int v7 = b$f0.f * 8 - v5 * b$f0.d;
                int v8 = (b$f0.f - 1) * 8;
                while(v8 >= v7) {
                    arr_b[v2] = (byte)(((int)(v3 >>> v8 & 0xFFL)));
                    v8 -= 8;
                    ++v2;
                }
            }
            return v2;
        }

        @Override  // com.google.common.io.b
        @J1.c
        @d
        public InputStream k(Reader reader0) {
            class com.google.common.io.b.k.b extends InputStream {
                int a;
                int b;
                int c;
                boolean d;
                final Reader e;
                final k f;

                com.google.common.io.b.k.b(Reader reader0) {
                    this.e = reader0;
                    super();
                    this.a = 0;
                    this.b = 0;
                    this.c = 0;
                    this.d = false;
                }

                @Override
                public void close() throws IOException {
                    this.e.close();
                }

                @Override
                public int read() throws IOException {
                    int v;
                    while(true) {
                        v = this.e.read();
                        if(v == -1) {
                            if(!this.d && !k.this.f.i(this.c)) {
                                throw new i("Invalid input length " + this.c);
                            }
                            return -1;
                        }
                        ++this.c;
                        Character character0 = k.this.g;
                        if(character0 != null && character0.charValue() == ((char)v)) {
                            if(!this.d && (this.c == 1 || !k.this.f.i(this.c - 1))) {
                                throw new i("Padding cannot start at index " + this.c);
                            }
                            this.d = true;
                        }
                        else {
                            if(this.d) {
                                break;
                            }
                            int v1 = this.a << k.this.f.d;
                            this.a = v1;
                            int v2 = k.this.f.d(((char)v)) | v1;
                            this.a = v2;
                            int v3 = this.b + k.this.f.d;
                            this.b = v3;
                            if(v3 >= 8) {
                                this.b = v3 - 8;
                                return v2 >> v3 - 8 & 0xFF;
                            }
                        }
                    }
                    throw new i("Expected padding character but found \'" + ((char)v) + "\' at index " + this.c);
                }

                @Override
                public int read(byte[] arr_b, int v, int v1) throws IOException {
                    int v2 = v1 + v;
                    H.f0(v, v2, arr_b.length);
                    int v3;
                    for(v3 = v; v3 < v2; ++v3) {
                        int v4 = this.read();
                        if(v4 == -1) {
                            int v5 = v3 - v;
                            return v5 == 0 ? -1 : v5;
                        }
                        arr_b[v3] = (byte)v4;
                    }
                    return v3 - v;
                }
            }

            H.E(reader0);
            return new com.google.common.io.b.k.b(this, reader0);
        }

        @Override  // com.google.common.io.b
        void n(Appendable appendable0, byte[] arr_b, int v, int v1) throws IOException {
            H.E(appendable0);
            H.f0(v, v + v1, arr_b.length);
            for(int v2 = 0; v2 < v1; v2 += this.f.f) {
                this.D(appendable0, arr_b, v + v2, Math.min(this.f.f, v1 - v2));
            }
        }

        @Override  // com.google.common.io.b
        @J1.c
        @d
        public OutputStream p(Writer writer0) {
            class com.google.common.io.b.k.a extends OutputStream {
                int a;
                int b;
                int c;
                final Writer d;
                final k e;

                com.google.common.io.b.k.a(Writer writer0) {
                    this.d = writer0;
                    super();
                    this.a = 0;
                    this.b = 0;
                    this.c = 0;
                }

                @Override
                public void close() throws IOException {
                    int v = this.b;
                    if(v > 0) {
                        int v1 = k.this.f.e(this.a << k.this.f.d - v & k.this.f.c);
                        this.d.write(v1);
                        ++this.c;
                        if(k.this.g != null) {
                            while(true) {
                                k b$k0 = k.this;
                                if(this.c % b$k0.f.e == 0) {
                                    break;
                                }
                                this.d.write(b$k0.g.charValue());
                                ++this.c;
                            }
                        }
                    }
                    this.d.close();
                }

                @Override
                public void flush() throws IOException {
                    this.d.flush();
                }

                @Override
                public void write(int v) throws IOException {
                    this.a = v & 0xFF | this.a << 8;
                    this.b += 8;
                    while(true) {
                        int v1 = this.b;
                        f b$f0 = k.this.f;
                        int v2 = b$f0.d;
                        if(v1 < v2) {
                            break;
                        }
                        int v3 = b$f0.e(this.a >> v1 - v2 & b$f0.c);
                        this.d.write(v3);
                        ++this.c;
                        this.b -= k.this.f.d;
                    }
                }
            }

            H.E(writer0);
            return new com.google.common.io.b.k.a(this, writer0);
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b r() {
            com.google.common.io.b b0 = this.j;
            if(b0 == null) {
                f b$f0 = this.f.h();
                b0 = b$f0 == this.f ? this : this.E(b$f0, this.g);
                this.j = b0;
            }
            return b0;
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b t() {
            com.google.common.io.b b0 = this.i;
            if(b0 == null) {
                f b$f0 = this.f.j();
                b0 = b$f0 == this.f ? this : this.E(b$f0, this.g);
                this.i = b0;
            }
            return b0;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("BaseEncoding.");
            stringBuilder0.append(this.f);
            if(8 % this.f.d != 0) {
                if(this.g == null) {
                    stringBuilder0.append(".omitPadding()");
                    return stringBuilder0.toString();
                }
                stringBuilder0.append(".withPadChar(\'");
                stringBuilder0.append(this.g);
                stringBuilder0.append("\')");
            }
            return stringBuilder0.toString();
        }

        @Override  // com.google.common.io.b
        int u(int v) {
            return (int)((((long)this.f.d) * ((long)v) + 7L) / 8L);
        }

        @Override  // com.google.common.io.b
        int v(int v) {
            int v1 = com.google.common.math.f.g(v, this.f.f, RoundingMode.CEILING);
            return this.f.e * v1;
        }

        @Override  // com.google.common.io.b
        public com.google.common.io.b w() {
            return this.g == null ? this : this.E(this.f, null);
        }

        @Override  // com.google.common.io.b
        CharSequence z(CharSequence charSequence0) {
            H.E(charSequence0);
            Character character0 = this.g;
            if(character0 == null) {
                return charSequence0;
            }
            int v = character0.charValue();
            int v1;
            for(v1 = charSequence0.length() - 1; v1 >= 0 && charSequence0.charAt(v1) == v; --v1) {
            }
            return charSequence0.subSequence(0, v1 + 1);
        }
    }

    private static final com.google.common.io.b a;
    private static final com.google.common.io.b b;
    private static final com.google.common.io.b c;
    private static final com.google.common.io.b d;
    private static final com.google.common.io.b e;

    static {
        com.google.common.io.b.a = new h("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
        com.google.common.io.b.b = new h("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
        com.google.common.io.b.c = new k("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
        com.google.common.io.b.d = new k("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
        com.google.common.io.b.e = new g("base16()", "0123456789ABCDEF");
    }

    public abstract com.google.common.io.b A();

    public abstract com.google.common.io.b B(char arg1);

    public abstract com.google.common.io.b C(String arg1, int arg2);

    public static com.google.common.io.b a() {
        return com.google.common.io.b.e;
    }

    public static com.google.common.io.b b() {
        return com.google.common.io.b.c;
    }

    public static com.google.common.io.b c() {
        return com.google.common.io.b.d;
    }

    public static com.google.common.io.b d() {
        return com.google.common.io.b.a;
    }

    public static com.google.common.io.b e() {
        return com.google.common.io.b.b;
    }

    public abstract boolean f(CharSequence arg1);

    public final byte[] g(CharSequence charSequence0) {
        try {
            return this.h(charSequence0);
        }
        catch(i b$i0) {
            throw new IllegalArgumentException(b$i0);
        }
    }

    final byte[] h(CharSequence charSequence0) throws i {
        CharSequence charSequence1 = this.z(charSequence0);
        byte[] arr_b = new byte[this.u(charSequence1.length())];
        return com.google.common.io.b.q(arr_b, this.i(arr_b, charSequence1));
    }

    abstract int i(byte[] arg1, CharSequence arg2) throws i;

    @J1.c
    @d
    public final com.google.common.io.g j(com.google.common.io.k k0) {
        class com.google.common.io.b.b extends com.google.common.io.g {
            final com.google.common.io.k a;
            final com.google.common.io.b b;

            com.google.common.io.b.b(com.google.common.io.k k0) {
                this.a = k0;
                super();
            }

            @Override  // com.google.common.io.g
            public InputStream m() throws IOException {
                Reader reader0 = this.a.m();
                return com.google.common.io.b.this.k(reader0);
            }
        }

        H.E(k0);
        return new com.google.common.io.b.b(this, k0);
    }

    @J1.c
    @d
    public abstract InputStream k(Reader arg1);

    public String l(byte[] arr_b) {
        return this.m(arr_b, 0, arr_b.length);
    }

    public final String m(byte[] arr_b, int v, int v1) {
        H.f0(v, v + v1, arr_b.length);
        StringBuilder stringBuilder0 = new StringBuilder(this.v(v1));
        try {
            this.n(stringBuilder0, arr_b, v, v1);
            return stringBuilder0.toString();
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    abstract void n(Appendable arg1, byte[] arg2, int arg3, int arg4) throws IOException;

    @J1.c
    @d
    public final com.google.common.io.f o(com.google.common.io.j j0) {
        class com.google.common.io.b.a extends com.google.common.io.f {
            final com.google.common.io.j a;
            final com.google.common.io.b b;

            com.google.common.io.b.a(com.google.common.io.j j0) {
                this.a = j0;
                super();
            }

            @Override  // com.google.common.io.f
            public OutputStream c() throws IOException {
                Writer writer0 = this.a.b();
                return com.google.common.io.b.this.p(writer0);
            }
        }

        H.E(j0);
        return new com.google.common.io.b.a(this, j0);
    }

    @J1.c
    @d
    public abstract OutputStream p(Writer arg1);

    private static byte[] q(byte[] arr_b, int v) {
        if(v == arr_b.length) {
            return arr_b;
        }
        byte[] arr_b1 = new byte[v];
        System.arraycopy(arr_b, 0, arr_b1, 0, v);
        return arr_b1;
    }

    public abstract com.google.common.io.b r();

    @J1.c
    @d
    static Reader s(Reader reader0, String s) {
        class com.google.common.io.b.c extends Reader {
            final Reader a;
            final String b;

            com.google.common.io.b.c(Reader reader0, String s) {
                this.b = s;
                super();
            }

            @Override
            public void close() throws IOException {
                this.a.close();
            }

            @Override
            public int read() throws IOException {
                int v;
                do {
                    v = this.a.read();
                }
                while(v != -1 && this.b.indexOf(((int)(((char)v)))) >= 0);
                return v;
            }

            @Override
            public int read(char[] arr_c, int v, int v1) throws IOException {
                throw new UnsupportedOperationException();
            }
        }

        H.E(reader0);
        H.E(s);
        return new com.google.common.io.b.c(reader0, s);
    }

    public abstract com.google.common.io.b t();

    abstract int u(int arg1);

    abstract int v(int arg1);

    public abstract com.google.common.io.b w();

    static Appendable x(Appendable appendable0, String s, int v) {
        class com.google.common.io.b.d implements Appendable {
            int a;
            final int b;
            final Appendable c;
            final String d;

            com.google.common.io.b.d(int v, Appendable appendable0, String s) {
                this.c = appendable0;
                this.d = s;
                super();
                this.a = v;
            }

            @Override
            public Appendable append(char c) throws IOException {
                if(this.a == 0) {
                    this.c.append(this.d);
                    this.a = this.b;
                }
                this.c.append(c);
                --this.a;
                return this;
            }

            @Override
            public Appendable append(@a CharSequence charSequence0) {
                throw new UnsupportedOperationException();
            }

            @Override
            public Appendable append(@a CharSequence charSequence0, int v, int v1) {
                throw new UnsupportedOperationException();
            }
        }

        H.E(appendable0);
        H.E(s);
        H.d(v > 0);
        return new com.google.common.io.b.d(v, appendable0, s);
    }

    @J1.c
    @d
    static Writer y(Writer writer0, String s, int v) {
        class e extends Writer {
            final Appendable a;
            final Writer b;

            e(Appendable appendable0, Writer writer0) {
                this.b = writer0;
                super();
            }

            @Override
            public void close() throws IOException {
                this.b.close();
            }

            @Override
            public void flush() throws IOException {
                this.b.flush();
            }

            @Override
            public void write(int v) throws IOException {
                this.a.append(((char)v));
            }

            @Override
            public void write(char[] arr_c, int v, int v1) throws IOException {
                throw new UnsupportedOperationException();
            }
        }

        return new e(com.google.common.io.b.x(writer0, s, v), writer0);
    }

    CharSequence z(CharSequence charSequence0) {
        return (CharSequence)H.E(charSequence0);
    }
}

