package X0;

import com.facebook.common.internal.b;
import com.facebook.common.internal.d;
import com.facebook.common.internal.s;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nImageFormatChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageFormatChecker.kt\ncom/facebook/imageformat/ImageFormatChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1863#2,2:170\n*S KotlinDebug\n*F\n+ 1 ImageFormatChecker.kt\ncom/facebook/imageformat/ImageFormatChecker\n*L\n59#1:170,2\n*E\n"})
public final class e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final c b(@l InputStream inputStream0) throws IOException {
            L.p(inputStream0, "is");
            return this.e().c(inputStream0);
        }

        @l
        @n
        public final c c(@m String s) {
            FileInputStream fileInputStream0 = null;
            try {
                fileInputStream0 = new FileInputStream(s);
                return this.b(fileInputStream0);
            }
            catch(IOException unused_ex) {
                return c.d;
            }
            finally {
                d.b(fileInputStream0);
            }
        }

        @l
        @n
        public final c d(@l InputStream inputStream0) {
            L.p(inputStream0, "is");
            try {
                return this.b(inputStream0);
            }
            catch(IOException iOException0) {
                throw s.d(iOException0);
            }
        }

        @l
        @n
        public final e e() {
            return (e)e.f.getValue();
        }

        private final int f(int v, InputStream inputStream0, byte[] arr_b) throws IOException {
            if(arr_b.length < v) {
                throw new IllegalStateException("Check failed.");
            }
            if(inputStream0.markSupported()) {
                try {
                    inputStream0.mark(v);
                    return b.b(inputStream0, arr_b, 0, v);
                }
                finally {
                    inputStream0.reset();
                }
            }
            return b.b(inputStream0, arr_b, 0, v);
        }
    }

    private int a;
    @m
    private List b;
    @l
    private final X0.a c;
    private boolean d;
    @l
    public static final a e;
    @l
    private static final D f;

    static {
        e.e = new a(null);
        X0.d d0 = () -> new e();
        e.f = E.c(H.a, d0);
    }

    private e() {
        this.c = new X0.a();
        this.k();
    }

    @l
    public final c c(@l InputStream inputStream0) throws IOException {
        L.p(inputStream0, "is");
        int v = this.a;
        byte[] arr_b = new byte[v];
        int v1 = e.e.f(v, inputStream0, arr_b);
        c c0 = this.c.a(arr_b, v1);
        if(L.g(c0, X0.b.n) && !this.d) {
            c0 = c.d;
        }
        if(c0 != c.d) {
            return c0;
        }
        List list0 = this.b;
        if(list0 != null) {
            for(Object object0: list0) {
                c c1 = ((X0.c.b)object0).a(arr_b, v1);
                if(c1 != c.d) {
                    return c1;
                }
                if(false) {
                    break;
                }
            }
        }
        return c.d;
    }

    @l
    @n
    public static final c d(@l InputStream inputStream0) throws IOException {
        return e.e.b(inputStream0);
    }

    @l
    @n
    public static final c e(@m String s) {
        return e.e.c(s);
    }

    @l
    @n
    public static final c f(@l InputStream inputStream0) {
        return e.e.d(inputStream0);
    }

    @l
    @n
    public static final e g() {
        return e.e.e();
    }

    // 检测为 Lambda 实现
    private static final e h() [...]

    @l
    public final e i(boolean z) {
        this.d = z;
        return this;
    }

    @l
    public final e j(@m List list0) {
        this.b = list0;
        this.k();
        return this;
    }

    private final void k() {
        this.a = this.c.b();
        List list0 = this.b;
        if(list0 != null) {
            L.m(list0);
            for(Object object0: list0) {
                this.a = Math.max(this.a, ((X0.c.b)object0).b());
            }
        }
    }
}

