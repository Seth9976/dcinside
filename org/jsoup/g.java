package org.jsoup;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import org.jsoup.helper.e;
import org.jsoup.nodes.f;
import org.jsoup.safety.a;
import org.jsoup.safety.b;

public class g {
    public static String a(String s, String s1, b b0) {
        f f0 = g.w(s, s1);
        return new a(b0).c(f0).c3().T1();
    }

    public static String b(String s, String s1, b b0, org.jsoup.nodes.f.a f$a0) {
        f f0 = g.w(s, s1);
        f f1 = new a(b0).c(f0);
        f1.t3(f$a0);
        return f1.c3().T1();
    }

    public static String c(String s, b b0) {
        return g.a(s, "", b0);
    }

    public static org.jsoup.b d(String s) {
        return org.jsoup.helper.f.P(s);
    }

    public static boolean e(String s, b b0) {
        return new a(b0).g(s);
    }

    public static org.jsoup.b f() {
        return new org.jsoup.helper.f();
    }

    public static f g(File file0) throws IOException {
        return e.f(file0, null, file0.getAbsolutePath());
    }

    public static f h(File file0, String s) throws IOException {
        return e.f(file0, s, file0.getAbsolutePath());
    }

    public static f i(File file0, String s, String s1) throws IOException {
        return e.f(file0, s, s1);
    }

    public static f j(File file0, String s, String s1, org.jsoup.parser.g g0) throws IOException {
        return e.g(file0, s, s1, g0);
    }

    public static f k(InputStream inputStream0, String s, String s1) throws IOException {
        return e.h(inputStream0, s, s1);
    }

    public static f l(InputStream inputStream0, String s, String s1, org.jsoup.parser.g g0) throws IOException {
        return e.i(inputStream0, s, s1, g0);
    }

    public static f m(String s) {
        return org.jsoup.parser.g.i(s, "");
    }

    public static f n(String s, String s1) {
        return org.jsoup.parser.g.i(s, s1);
    }

    public static f o(String s, String s1, org.jsoup.parser.g g0) {
        return g0.o(s, s1);
    }

    public static f p(String s, org.jsoup.parser.g g0) {
        return g0.o(s, "");
    }

    public static f q(URL uRL0, int v) throws IOException {
        org.jsoup.b b0 = org.jsoup.helper.f.Q(uRL0);
        b0.d(v);
        return b0.get();
    }

    public static f r(Path path0) throws IOException {
        return e.j(path0, null, path0.toAbsolutePath().toString());
    }

    public static f s(Path path0, String s) throws IOException {
        return e.j(path0, s, path0.toAbsolutePath().toString());
    }

    public static f t(Path path0, String s, String s1) throws IOException {
        return e.j(path0, s, s1);
    }

    public static f u(Path path0, String s, String s1, org.jsoup.parser.g g0) throws IOException {
        return e.k(path0, s, s1, g0);
    }

    public static f v(String s) {
        return org.jsoup.parser.g.j(s, "");
    }

    public static f w(String s, String s1) {
        return org.jsoup.parser.g.j(s, s1);
    }
}

