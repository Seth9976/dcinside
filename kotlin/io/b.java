package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.c0;
import kotlin.collections.s;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import z3.i;

@i(name = "ByteStreamsKt")
public final class b {
    @f
    private static final BufferedInputStream a(InputStream inputStream0, int v) {
        L.p(inputStream0, "<this>");
        return inputStream0 instanceof BufferedInputStream ? ((BufferedInputStream)inputStream0) : new BufferedInputStream(inputStream0, v);
    }

    @f
    private static final BufferedOutputStream b(OutputStream outputStream0, int v) {
        L.p(outputStream0, "<this>");
        return outputStream0 instanceof BufferedOutputStream ? ((BufferedOutputStream)outputStream0) : new BufferedOutputStream(outputStream0, v);
    }

    static BufferedInputStream c(InputStream inputStream0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x2000;
        }
        L.p(inputStream0, "<this>");
        return inputStream0 instanceof BufferedInputStream ? ((BufferedInputStream)inputStream0) : new BufferedInputStream(inputStream0, v);
    }

    static BufferedOutputStream d(OutputStream outputStream0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x2000;
        }
        L.p(outputStream0, "<this>");
        return outputStream0 instanceof BufferedOutputStream ? ((BufferedOutputStream)outputStream0) : new BufferedOutputStream(outputStream0, v);
    }

    @f
    private static final BufferedReader e(InputStream inputStream0, Charset charset0) {
        L.p(inputStream0, "<this>");
        L.p(charset0, "charset");
        return new BufferedReader(new InputStreamReader(inputStream0, charset0), 0x2000);
    }

    static BufferedReader f(InputStream inputStream0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = kotlin.text.f.b;
        }
        L.p(inputStream0, "<this>");
        L.p(charset0, "charset");
        return new BufferedReader(new InputStreamReader(inputStream0, charset0), 0x2000);
    }

    @f
    private static final BufferedWriter g(OutputStream outputStream0, Charset charset0) {
        L.p(outputStream0, "<this>");
        L.p(charset0, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream0, charset0), 0x2000);
    }

    static BufferedWriter h(OutputStream outputStream0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = kotlin.text.f.b;
        }
        L.p(outputStream0, "<this>");
        L.p(charset0, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream0, charset0), 0x2000);
    }

    @f
    private static final ByteArrayInputStream i(String s, Charset charset0) {
        L.p(s, "<this>");
        L.p(charset0, "charset");
        byte[] arr_b = s.getBytes(charset0);
        L.o(arr_b, "getBytes(...)");
        return new ByteArrayInputStream(arr_b);
    }

    static ByteArrayInputStream j(String s, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = kotlin.text.f.b;
        }
        L.p(s, "<this>");
        L.p(charset0, "charset");
        byte[] arr_b = s.getBytes(charset0);
        L.o(arr_b, "getBytes(...)");
        return new ByteArrayInputStream(arr_b);
    }

    public static final long k(@l InputStream inputStream0, @l OutputStream outputStream0, int v) {
        L.p(inputStream0, "<this>");
        L.p(outputStream0, "out");
        byte[] arr_b = new byte[v];
        int v1 = inputStream0.read(arr_b);
        long v2 = 0L;
        while(v1 >= 0) {
            outputStream0.write(arr_b, 0, v1);
            v2 += (long)v1;
            v1 = inputStream0.read(arr_b);
        }
        return v2;
    }

    public static long l(InputStream inputStream0, OutputStream outputStream0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x2000;
        }
        return b.k(inputStream0, outputStream0, v);
    }

    @f
    private static final ByteArrayInputStream m(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return new ByteArrayInputStream(arr_b);
    }

    @f
    private static final ByteArrayInputStream n(byte[] arr_b, int v, int v1) {
        L.p(arr_b, "<this>");
        return new ByteArrayInputStream(arr_b, v, v1);
    }

    @l
    public static final s o(@l BufferedInputStream bufferedInputStream0) {
        public static final class a extends s {
            private int a;
            private boolean b;
            private boolean c;
            final BufferedInputStream d;

            a(BufferedInputStream bufferedInputStream0) {
                this.d = bufferedInputStream0;
                super();
                this.a = -1;
            }

            public final boolean b() {
                return this.c;
            }

            public final int c() {
                return this.a;
            }

            public final boolean d() {
                return this.b;
            }

            private final void f() {
                if(!this.b && !this.c) {
                    int v = this.d.read();
                    this.a = v;
                    boolean z = true;
                    this.b = true;
                    if(v != -1) {
                        z = false;
                    }
                    this.c = z;
                }
            }

            public final void g(boolean z) {
                this.c = z;
            }

            public final void h(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                this.f();
                return !this.c;
            }

            public final void i(boolean z) {
                this.b = z;
            }

            @Override  // kotlin.collections.s
            public byte nextByte() {
                this.f();
                if(this.c) {
                    throw new NoSuchElementException("Input stream is over.");
                }
                this.b = false;
                return (byte)this.a;
            }
        }

        L.p(bufferedInputStream0, "<this>");
        return new a(bufferedInputStream0);
    }

    @h0(version = "1.3")
    @l
    public static final byte[] p(@l InputStream inputStream0) {
        L.p(inputStream0, "<this>");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(Math.max(0x2000, inputStream0.available()));
        b.l(inputStream0, byteArrayOutputStream0, 0, 2, null);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        L.o(arr_b, "toByteArray(...)");
        return arr_b;
    }

    @k(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @c0(expression = "readBytes()", imports = {}))
    @kotlin.l(errorSince = "1.5", warningSince = "1.3")
    @l
    public static final byte[] q(@l InputStream inputStream0, int v) {
        L.p(inputStream0, "<this>");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(Math.max(v, inputStream0.available()));
        b.l(inputStream0, byteArrayOutputStream0, 0, 2, null);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        L.o(arr_b, "toByteArray(...)");
        return arr_b;
    }

    public static byte[] r(InputStream inputStream0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x2000;
        }
        return b.q(inputStream0, v);
    }

    @f
    private static final InputStreamReader s(InputStream inputStream0, Charset charset0) {
        L.p(inputStream0, "<this>");
        L.p(charset0, "charset");
        return new InputStreamReader(inputStream0, charset0);
    }

    static InputStreamReader t(InputStream inputStream0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = kotlin.text.f.b;
        }
        L.p(inputStream0, "<this>");
        L.p(charset0, "charset");
        return new InputStreamReader(inputStream0, charset0);
    }

    @f
    private static final OutputStreamWriter u(OutputStream outputStream0, Charset charset0) {
        L.p(outputStream0, "<this>");
        L.p(charset0, "charset");
        return new OutputStreamWriter(outputStream0, charset0);
    }

    static OutputStreamWriter v(OutputStream outputStream0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = kotlin.text.f.b;
        }
        L.p(outputStream0, "<this>");
        L.p(charset0, "charset");
        return new OutputStreamWriter(outputStream0, charset0);
    }
}

