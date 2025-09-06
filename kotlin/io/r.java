package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import jeb.synthetic.FIN;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class r {
    @l
    public static final r a = null;
    private static final int b = 0x20;
    private static CharsetDecoder c;
    private static boolean d;
    @l
    private static final byte[] e;
    @l
    private static final char[] f;
    @l
    private static final ByteBuffer g;
    @l
    private static final CharBuffer h;
    @l
    private static final StringBuilder i;

    static {
        r.a = new r();
        byte[] arr_b = new byte[0x20];
        r.e = arr_b;
        char[] arr_c = new char[0x20];
        r.f = arr_c;
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        L.o(byteBuffer0, "wrap(...)");
        r.g = byteBuffer0;
        CharBuffer charBuffer0 = CharBuffer.wrap(arr_c);
        L.o(charBuffer0, "wrap(...)");
        r.h = charBuffer0;
        r.i = new StringBuilder();
    }

    private final int a() {
        r.g.compact();
        r.g.position(0);
        return r.g.position();
    }

    private final int b(boolean z) {
        int v;
        while(true) {
            CharsetDecoder charsetDecoder0 = r.c;
            if(charsetDecoder0 == null) {
                L.S("decoder");
                charsetDecoder0 = null;
            }
            CharBuffer charBuffer0 = r.h;
            CoderResult coderResult0 = charsetDecoder0.decode(r.g, charBuffer0, z);
            L.o(coderResult0, "decode(...)");
            if(coderResult0.isError()) {
                this.e();
                coderResult0.throwException();
            }
            v = charBuffer0.position();
            if(!coderResult0.isOverflow()) {
                break;
            }
            r.i.append(r.f, 0, v - 1);
            charBuffer0.position(0);
            charBuffer0.limit(0x20);
            charBuffer0.put(r.f[v - 1]);
        }
        return v;
    }

    private final int c(int v, int v1) {
        ByteBuffer byteBuffer0 = r.g;
        byteBuffer0.limit(v);
        r.h.position(v1);
        int v2 = this.b(true);
        CharsetDecoder charsetDecoder0 = r.c;
        if(charsetDecoder0 == null) {
            L.S("decoder");
            charsetDecoder0 = null;
        }
        charsetDecoder0.reset();
        byteBuffer0.position(0);
        return v2;
    }

    @m
    public final String d(@l InputStream inputStream0, @l Charset charset0) {
        int v4;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        L.p(inputStream0, "inputStream");
        L.p(charset0, "charset");
        CharsetDecoder charsetDecoder0 = r.c;
        if(charsetDecoder0 == null) {
            this.g(charset0);
        }
        else {
            if(charsetDecoder0 == null) {
                L.S("decoder");
                charsetDecoder0 = null;
            }
            if(!L.g(charsetDecoder0.charset(), charset0)) {
                this.g(charset0);
            }
        }
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int v3 = inputStream0.read();
            if(v3 == -1) {
                if(r.i.length() == 0 && v1 == 0 && v2 == 0) {
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(this);
                    FIN.finallyCodeEnd$NT(v);
                    return null;
                }
                v4 = this.c(v1, v2);
            }
            else {
                r.e[v1] = (byte)v3;
                if(v3 == 10 || v1 + 1 == 0x20 || !r.d) {
                    ByteBuffer byteBuffer0 = r.g;
                    byteBuffer0.limit(v1 + 1);
                    r.h.position(v2);
                    v2 = this.b(false);
                    if(v2 <= 0 || r.f[v2 - 1] != 10) {
                        goto label_52;
                    }
                    else {
                        byteBuffer0.position(0);
                        v4 = v2;
                    }
                }
                else {
                    ++v1;
                    continue;
                }
            }
            if(v4 > 0) {
                char[] arr_c = r.f;
                if(arr_c[v4 - 1] == 10) {
                    v4 = v4 - 1 <= 0 || arr_c[v4 - 2] != 13 ? v4 - 1 : v4 - 2;
                }
            }
            StringBuilder stringBuilder0 = r.i;
            if(stringBuilder0.length() == 0) {
                String s = new String(r.f, 0, v4);
                FIN.finallyExec$NT(v);
                return s;
            }
            stringBuilder0.append(r.f, 0, v4);
            String s1 = stringBuilder0.toString();
            L.o(s1, "toString(...)");
            if(stringBuilder0.length() > 0x20) {
                this.f();
            }
            stringBuilder0.setLength(0);
            FIN.finallyExec$NT(v);
            return s1;
        label_52:
            v1 = this.a();
        }
    }

    private final void e() {
        CharsetDecoder charsetDecoder0 = r.c;
        if(charsetDecoder0 == null) {
            L.S("decoder");
            charsetDecoder0 = null;
        }
        charsetDecoder0.reset();
        r.g.position(0);
        r.i.setLength(0);
    }

    private final void f() {
        r.i.setLength(0x20);
        r.i.trimToSize();
    }

    private final void g(Charset charset0) {
        CharsetDecoder charsetDecoder0 = charset0.newDecoder();
        L.o(charsetDecoder0, "newDecoder(...)");
        r.c = charsetDecoder0;
        ByteBuffer byteBuffer0 = r.g;
        byteBuffer0.clear();
        CharBuffer charBuffer0 = r.h;
        charBuffer0.clear();
        byteBuffer0.put(10);
        byteBuffer0.flip();
        CharsetDecoder charsetDecoder1 = r.c;
        if(charsetDecoder1 == null) {
            L.S("decoder");
            charsetDecoder1 = null;
        }
        boolean z = false;
        charsetDecoder1.decode(byteBuffer0, charBuffer0, false);
        if(charBuffer0.position() == 1 && charBuffer0.get(0) == 10) {
            z = true;
        }
        r.d = z;
        this.e();
    }
}

