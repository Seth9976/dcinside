package org.jsoup.helper;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.jsoup.nodes.d;
import org.jsoup.nodes.f;
import org.jsoup.nodes.o;
import org.jsoup.nodes.t;
import org.jsoup.nodes.z;
import org.jsoup.parser.g;
import org.jsoup.parser.h;

public final class e {
    static class a {
        private final String a;
        private final boolean b;

        public a(String s, boolean z) {
            this.a = s;
            this.b = z;
        }
    }

    static class b {
        Charset a;
        InputStream b;
        f c;
        boolean d;

        b(Charset charset0, f f0, InputStream inputStream0, boolean z) {
            this.a = charset0;
            this.b = inputStream0;
            this.c = f0;
            this.d = z;
        }
    }

    private static final Pattern a = null;
    public static final Charset b = null;
    static final String c = null;
    private static final int d = 0x1400;
    private static final char[] e = null;
    static final int f = 0x20;

    static {
        e.a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"\'])?([^\\s,;\"\']*)");
        e.b = Charset.forName("UTF-8");
        e.c = "UTF-8";
        e.e = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    static void a(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = new byte[0x8000];
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            outputStream0.write(arr_b, 0, v);
        }
    }

    static b b(InputStream inputStream0, String s, String s1, g g0) throws IOException {
        z z2;
        f f1;
        boolean z = false;
        org.jsoup.internal.a a0 = org.jsoup.internal.a.j(inputStream0, 0x8000, 0);
        a0.mark(0x8000);
        ByteBuffer byteBuffer0 = e.q(a0, 0x13FF);
        boolean z1 = a0.read() == -1;
        a0.reset();
        a e$a0 = e.c(byteBuffer0);
        if(e$a0 != null) {
            s = e$a0.a;
        }
        f f0 = null;
        if(s == null) {
            try {
                CharBuffer charBuffer0 = e.b.decode(byteBuffer0);
                f1 = charBuffer0.hasArray() ? g0.n(new CharArrayReader(charBuffer0.array(), charBuffer0.arrayOffset(), charBuffer0.limit()), s1) : g0.o(charBuffer0.toString(), s1);
            }
            catch(UncheckedIOException uncheckedIOException0) {
                throw uncheckedIOException0.getCause();
            }
            String s2 = null;
            for(Object object0: f1.E2("meta[http-equiv=content-type], meta[charset]")) {
                o o0 = (o)object0;
                if(o0.D("http-equiv")) {
                    s2 = e.e(o0.g("content"));
                }
                if(s2 == null && o0.D("charset")) {
                    s2 = o0.g("charset");
                }
                if(s2 != null) {
                    break;
                }
            }
            if(s2 == null && f1.p() > 0) {
                t t0 = f1.o(0);
                if(t0 instanceof z) {
                    z2 = (z)t0;
                }
                else {
                    z2 = !(t0 instanceof d) || !((d)t0).B0() ? null : ((d)t0).y0();
                }
                if(z2 != null && z2.B0().equalsIgnoreCase("xml")) {
                    s2 = z2.g("encoding");
                }
            }
            String s3 = e.s(s2);
            if(s3 != null && !s3.equalsIgnoreCase("UTF-8")) {
                s = s3.trim().replaceAll("[\"\']", "");
            }
            else if(z1) {
                f0 = f1;
            }
        }
        else {
            i.m(s, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if(s == null) {
            s = "UTF-8";
        }
        Charset charset0 = s.equals("UTF-8") ? e.b : Charset.forName(s);
        if(e$a0 != null && e$a0.b) {
            z = true;
        }
        return new b(charset0, f0, a0, z);
    }

    private static a c(ByteBuffer byteBuffer0) {
        byteBuffer0.mark();
        byte[] arr_b = new byte[4];
        if(byteBuffer0.remaining() >= 4) {
            byteBuffer0.get(arr_b);
            byteBuffer0.rewind();
        }
        int v = arr_b[0];
        if(v == 0 && arr_b[1] == 0 && arr_b[2] == -2 && arr_b[3] == -1 || v == -1 && arr_b[1] == -2 && arr_b[2] == 0 && arr_b[3] == 0) {
            return new a("UTF-32", false);
        }
        if(v == -2 && arr_b[1] == -1 || v == -1 && arr_b[1] == -2) {
            return new a("UTF-16", false);
        }
        return v != -17 || arr_b[1] != -69 || arr_b[2] != -65 ? null : new a("UTF-8", true);
    }

    static ByteBuffer d() {
        return ByteBuffer.allocate(0);
    }

    static String e(String s) {
        if(s == null) {
            return null;
        }
        Matcher matcher0 = e.a.matcher(s);
        return matcher0.find() ? e.s(matcher0.group(1).trim().replace("charset=", "")) : null;
    }

    public static f f(File file0, String s, String s1) throws IOException {
        return e.j(file0.toPath(), s, s1);
    }

    public static f g(File file0, String s, String s1, g g0) throws IOException {
        return e.k(file0.toPath(), s, s1, g0);
    }

    public static f h(InputStream inputStream0, String s, String s1) throws IOException {
        return e.o(inputStream0, s, s1, g.d());
    }

    public static f i(InputStream inputStream0, String s, String s1, g g0) throws IOException {
        return e.o(inputStream0, s, s1, g0);
    }

    public static f j(Path path0, String s, String s1) throws IOException {
        return e.k(path0, s, s1, g.d());
    }

    public static f k(Path path0, String s, String s1, g g0) throws IOException {
        return e.o(e.n(path0), s, s1, g0);
    }

    static void l(Reader reader0, b e$b0) throws IOException {
        if(e$b0.d) {
            i.h(reader0.skip(1L) == 1L);
        }
    }

    static String m() [...] // 潜在的解密器

    private static InputStream n(Path path0) throws IOException {
        boolean z = false;
        SeekableByteChannel seekableByteChannel0 = Files.newByteChannel(path0, new OpenOption[0]);
        InputStream inputStream0 = Channels.newInputStream(seekableByteChannel0);
        String s = org.jsoup.internal.g.a(path0.getFileName().toString());
        if(s.endsWith(".gz") || s.endsWith(".z")) {
            if(inputStream0.read() == 0x1F && inputStream0.read() == 0x8B) {
                z = true;
            }
            seekableByteChannel0.position(0L);
            if(z) {
                return new GZIPInputStream(inputStream0);
            }
        }
        return inputStream0;
    }

    static f o(InputStream inputStream0, String s, String s1, g g0) throws IOException {
        f f0;
        b e$b0;
        if(inputStream0 == null) {
            return new f(s1);
        }
        try {
            e$b0 = null;
            e$b0 = e.b(inputStream0, s, s1, g0);
            f0 = e.p(e$b0, s1, g0);
        }
        catch(Throwable throwable0) {
            if(e$b0 != null) {
                e$b0.b.close();
            }
            throw throwable0;
        }
        if(e$b0 != null) {
            e$b0.b.close();
        }
        return f0;
    }

    static f p(b e$b0, String s, g g0) throws IOException {
        f f1;
        f f0 = e$b0.c;
        if(f0 != null) {
            return f0;
        }
        try {
            InputStream inputStream0 = e$b0.b;
            i.o(inputStream0);
            Charset charset0 = e$b0.a;
            try(BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, charset0), 0x8000)) {
                e.l(bufferedReader0, e$b0);
                try {
                    f1 = g0.n(bufferedReader0, s);
                }
                catch(UncheckedIOException uncheckedIOException0) {
                    throw uncheckedIOException0.getCause();
                }
                f1.s3().c(charset0);
                if(!charset0.canEncode()) {
                    f1.e3(e.b);
                    return f1;
                }
                return f1;
            }
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }

    public static ByteBuffer q(InputStream inputStream0, int v) throws IOException {
        return org.jsoup.internal.a.f(inputStream0, v);
    }

    public static h r(Path path0, Charset charset0, String s, g g0) throws IOException {
        h h0 = new h(g0);
        b e$b0 = e.b(e.n(path0), (charset0 == null ? null : charset0.name()), s, g0);
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(e$b0.b, e$b0.a), 0x8000);
        e.l(bufferedReader0, e$b0);
        h0.n(bufferedReader0, s);
        return h0;
    }

    private static String s(String s) {
        if(s != null && s.length() != 0) {
            String s1 = s.trim().replaceAll("[\"\']", "");
            try {
                if(Charset.isSupported(s1)) {
                    return s1;
                }
                String s2 = s1.toUpperCase(Locale.ENGLISH);
                if(Charset.isSupported(s2)) {
                    return s2;
                }
            }
            catch(IllegalCharsetNameException unused_ex) {
            }
        }
        return null;
    }
}

