package org.jsoup.nodes;

import j..util.Spliterator;
import j..util.Spliterators;
import j..util.stream.Stream;
import j..util.stream.StreamSupport;
import java.util.Iterator;
import java.util.List;
import org.jsoup.helper.i;
import org.jsoup.helper.k;
import org.jsoup.parser.b;
import org.jsoup.parser.g;

final class v {
    static a a(t t0) {
        f f0 = t0.W();
        return f0 == null ? new f("").s3() : f0.s3();
    }

    static g b(t t0) {
        f f0 = t0.W();
        return f0 == null || f0.v3() == null ? new g(new b()) : f0.v3();
    }

    static List c(String s, o o0, Class class0) {
        i.l(s);
        i.o(o0);
        i.o(class0);
        k k0 = new k().l(false);
        return k0.q(k0.p(s, k0.e(k0.j(o0))), class0);
    }

    static Spliterator d(Iterator iterator0) {
        return Spliterators.spliteratorUnknownSize(iterator0, 273);
    }

    static Stream e(t t0, Class class0) {
        return StreamSupport.stream(v.d(new u(t0, class0)), false);
    }
}

