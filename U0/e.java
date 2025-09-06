package U0;

import W0.m;
import android.net.Uri;
import androidx.compose.foundation.c;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.drawee.drawable.t.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public interface e {
    public static final class a {
        public static b a(e e0, m m0, U0.a a0, d t$d0, Object object0, ContextChain contextChain0, boolean z, int v, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: modifyUri");
            }
            if((v & 16) != 0) {
                contextChain0 = null;
            }
            return (v & 0x20) == 0 ? e0.a(m0, a0, t$d0, object0, contextChain0, z) : e0.a(m0, a0, t$d0, object0, contextChain0, false);
        }
    }

    public static abstract class b {
        public static final class U0.e.b.a extends b {
            @y4.m
            private final Integer b;

            public U0.e.b.a(@l String s) {
                L.p(s, "comment");
                super("Disabled:" + s, null);
            }

            @Override  // U0.e$b
            @y4.m
            public Integer a() {
                return this.b;
            }
        }

        public static final class U0.e.b.b extends b {
            private final boolean b;
            @y4.m
            private final Integer c;

            public U0.e.b.b(boolean z) {
                super("FallbackToMbpDiskCache(isBestSize=" + z, null);
                this.b = z;
            }

            @Override  // U0.e$b
            @y4.m
            public Integer a() {
                return this.c;
            }

            public final boolean b() {
                return this.b;
            }

            @l
            public final U0.e.b.b c(boolean z) {
                return new U0.e.b.b(z);
            }

            public static U0.e.b.b d(U0.e.b.b e$b$b0, boolean z, int v, Object object0) {
                if((v & 1) != 0) {
                    z = e$b$b0.b;
                }
                return e$b$b0.c(z);
            }

            public final boolean e() {
                return this.b;
            }

            @Override
            public boolean equals(@y4.m Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof U0.e.b.b ? this.b == ((U0.e.b.b)object0).b : false;
            }

            @Override
            public int hashCode() {
                return c.a(this.b);
            }

            @Override  // U0.e$b
            @l
            public String toString() {
                return "FallbackToMbpDiskCache(isBestSize=" + this.b + ")";
            }
        }

        public static final class U0.e.b.c extends b {
            @l
            private final String b;
            @y4.m
            private final Integer c;

            public U0.e.b.c(@l String s) {
                L.p(s, "isBestSize");
                super("FallbackToMbpMemoryCache(" + s, null);
                this.b = s;
            }

            @Override  // U0.e$b
            @y4.m
            public Integer a() {
                return this.c;
            }

            @l
            public final String b() {
                return this.b;
            }

            @l
            public final U0.e.b.c c(@l String s) {
                L.p(s, "isBestSize");
                return new U0.e.b.c(s);
            }

            public static U0.e.b.c d(U0.e.b.c e$b$c0, String s, int v, Object object0) {
                if((v & 1) != 0) {
                    s = e$b$c0.b;
                }
                return e$b$c0.c(s);
            }

            @l
            public final String e() {
                return this.b;
            }

            @Override
            public boolean equals(@y4.m Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof U0.e.b.c ? L.g(this.b, ((U0.e.b.c)object0).b) : false;
            }

            @Override
            public int hashCode() {
                return this.b.hashCode();
            }

            @Override  // U0.e$b
            @l
            public String toString() {
                return "FallbackToMbpMemoryCache(isBestSize=" + this.b + ")";
            }
        }

        public static final class U0.e.b.d extends b {
            @y4.m
            private final Integer b;

            public U0.e.b.d(@y4.m Integer integer0) {
                super("FallbackToOriginalUrl", null);
                this.b = integer0;
            }

            @Override  // U0.e$b
            @y4.m
            public Integer a() {
                return this.b;
            }

            @y4.m
            public final Integer b() {
                return this.b;
            }

            @l
            public final U0.e.b.d c(@y4.m Integer integer0) {
                return new U0.e.b.d(integer0);
            }

            public static U0.e.b.d d(U0.e.b.d e$b$d0, Integer integer0, int v, Object object0) {
                if((v & 1) != 0) {
                    integer0 = e$b$d0.b;
                }
                return e$b$d0.c(integer0);
            }

            @Override
            public boolean equals(@y4.m Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof U0.e.b.d ? L.g(this.b, ((U0.e.b.d)object0).b) : false;
            }

            @Override
            public int hashCode() {
                return this.b == null ? 0 : this.b.hashCode();
            }

            @Override  // U0.e$b
            @l
            public String toString() {
                return "FallbackToOriginalUrl(bestAllowlistedSize=" + this.b + ")";
            }
        }

        public static abstract class U0.e.b.e extends b {
            public static final class U0.e.b.e.a extends U0.e.b.e {
                @y4.m
                private final Integer c;

                public U0.e.b.e.a(@l Uri uri0, @y4.m Integer integer0) {
                    L.p(uri0, "newUrl");
                    super(uri0, "ModifiedToAllowlistedSize", null);
                    this.c = integer0;
                }

                @Override  // U0.e$b
                @y4.m
                public Integer a() {
                    return this.c;
                }
            }

            public static final class U0.e.b.e.b extends U0.e.b.e {
                @y4.m
                private final Integer c;

                public U0.e.b.e.b(@l Uri uri0, @y4.m Integer integer0) {
                    L.p(uri0, "newUrl");
                    super(uri0, "ModifiedToMaxDimens", null);
                    this.c = integer0;
                }

                @Override  // U0.e$b
                @y4.m
                public Integer a() {
                    return this.c;
                }
            }

            @l
            private final Uri b;

            private U0.e.b.e(Uri uri0, String s) {
                super(s, null);
                this.b = uri0;
            }

            public U0.e.b.e(Uri uri0, String s, w w0) {
                this(uri0, s);
            }

            @l
            public final Uri b() {
                return this.b;
            }
        }

        public static final class f extends b {
            @l
            private final String b;
            @y4.m
            private final Integer c;

            public f(@l String s, @y4.m Integer integer0) {
                L.p(s, "reason");
                super("Unmodified(reason=\'" + s + "\'", null);
                this.b = s;
                this.c = integer0;
            }

            @Override  // U0.e$b
            @y4.m
            public Integer a() {
                return this.c;
            }

            @l
            public final String b() {
                return this.b;
            }

            @y4.m
            public final Integer c() {
                return this.c;
            }

            @l
            public final f d(@l String s, @y4.m Integer integer0) {
                L.p(s, "reason");
                return new f(s, integer0);
            }

            public static f e(f e$b$f0, String s, Integer integer0, int v, Object object0) {
                if((v & 1) != 0) {
                    s = e$b$f0.b;
                }
                if((v & 2) != 0) {
                    integer0 = e$b$f0.c;
                }
                return e$b$f0.d(s, integer0);
            }

            @Override
            public boolean equals(@y4.m Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof f)) {
                    return false;
                }
                return L.g(this.b, ((f)object0).b) ? L.g(this.c, ((f)object0).c) : false;
            }

            @l
            public final String f() {
                return this.b;
            }

            @Override
            public int hashCode() {
                int v = this.b.hashCode();
                return this.c == null ? v * 0x1F : v * 0x1F + this.c.hashCode();
            }

            @Override  // U0.e$b
            @l
            public String toString() {
                return "Unmodified(reason=" + this.b + ", bestAllowlistedSize=" + this.c + ")";
            }
        }

        @l
        private final String a;

        private b(String s) {
            this.a = s;
        }

        public b(String s, w w0) {
            this(s);
        }

        @y4.m
        public abstract Integer a();

        @Override
        @l
        public String toString() {
            return this.a;
        }
    }

    @l
    b a(@l m arg1, @y4.m U0.a arg2, @y4.m d arg3, @y4.m Object arg4, @y4.m ContextChain arg5, boolean arg6);

    @y4.m
    Uri b(@l Uri arg1, @y4.m Object arg2);

    void c(@l Uri arg1);
}

