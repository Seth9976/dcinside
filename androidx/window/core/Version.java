package androidx.window.core;

import A3.a;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.n;

public final class Version implements Comparable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Version a() {
            return Version.j;
        }

        @l
        public final Version b() {
            return Version.g;
        }

        @l
        public final Version c() {
            return Version.h;
        }

        @l
        public final Version d() {
            return Version.i;
        }

        @m
        @n
        public final Version e(@m String s) {
            if(s != null && !v.x3(s)) {
                Matcher matcher0 = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(s);
                if(!matcher0.matches()) {
                    return null;
                }
                String s1 = matcher0.group(1);
                Integer integer0 = s1 == null ? null : Integer.parseInt(s1);
                if(integer0 == null) {
                    return null;
                }
                int v = (int)integer0;
                String s2 = matcher0.group(2);
                Integer integer1 = s2 == null ? null : Integer.parseInt(s2);
                if(integer1 == null) {
                    return null;
                }
                int v1 = (int)integer1;
                String s3 = matcher0.group(3);
                Integer integer2 = s3 == null ? null : Integer.parseInt(s3);
                if(integer2 == null) {
                    return null;
                }
                String s4 = matcher0.group(4) == null ? "" : matcher0.group(4);
                L.o(s4, "description");
                return new Version(v, v1, ((int)integer2), s4, null);
            }
            return null;
        }
    }

    private final int a;
    private final int b;
    private final int c;
    @l
    private final String d;
    @l
    private final D e;
    @l
    public static final Companion f = null;
    @l
    private static final Version g = null;
    @l
    private static final Version h = null;
    @l
    private static final Version i = null;
    @l
    private static final Version j = null;
    @l
    private static final String k = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    static {
        Version.f = new Companion(null);
        Version.g = new Version(0, 0, 0, "");
        Version.h = new Version(0, 1, 0, "");
        Version version0 = new Version(1, 0, 0, "");
        Version.i = version0;
        Version.j = version0;
    }

    private Version(int v, int v1, int v2, String s) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
        this.e = E.a(new a() {
            final Version e;

            {
                this.e = version0;
                super(0);
            }

            public final BigInteger b() {
                return BigInteger.valueOf(this.e.h()).shiftLeft(0x20).or(BigInteger.valueOf(this.e.i())).shiftLeft(0x20).or(BigInteger.valueOf(this.e.j()));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    public Version(int v, int v1, int v2, String s, w w0) {
        this(v, v1, v2, s);
    }

    @Override
    public int compareTo(Object object0) {
        return this.e(((Version)object0));
    }

    public int e(@l Version version0) {
        L.p(version0, "other");
        return this.f().compareTo(version0.f());
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof Version ? this.a == ((Version)object0).a && this.b == ((Version)object0).b && this.c == ((Version)object0).c : false;
    }

    private final BigInteger f() {
        Object object0 = this.e.getValue();
        L.o(object0, "<get-bigInteger>(...)");
        return (BigInteger)object0;
    }

    @l
    public final String g() {
        return this.d;
    }

    public final int h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return ((this.a + 0x20F) * 0x1F + this.b) * 0x1F + this.c;
    }

    public final int i() {
        return this.b;
    }

    public final int j() {
        return this.c;
    }

    @m
    @n
    public static final Version k(@m String s) {
        return Version.f.e(s);
    }

    @Override
    @l
    public String toString() {
        return v.x3(this.d) ? this.a + '.' + this.b + '.' + this.c + "" : this.a + '.' + this.b + '.' + this.c + ("-" + this.d);
    }
}

