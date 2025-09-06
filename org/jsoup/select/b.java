package org.jsoup.select;

import j..util.stream.Collectors;
import org.jsoup.nodes.o;

public class b {
    public static e a(g g0, o o0) {
        g0.f();
        return (e)o0.N2().filter(g0.b(o0)).collect(Collectors.toCollection(new a()));
    }

    public static o b(g g0, o o0) {
        g0.f();
        return (o)o0.N2().filter(g0.b(o0)).findFirst().orElse(null);
    }
}

