package org.jsoup.select;

import org.jsoup.nodes.t;

public interface i {
    public static enum a {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP;

        private static a[] a() [...] // Inlined contents
    }

    a a(t arg1, int arg2);

    a b(t arg1, int arg2);
}

