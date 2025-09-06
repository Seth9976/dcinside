package com.dcinside.app.internal;

import kotlin.jvm.internal.w;
import y4.l;

public final class g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final Void a() {
            throw new h("Property does not have a getter");
        }
    }

    @l
    public static final a a = null;
    @l
    public static final String b = "Property does not have a getter";

    static {
        g.a = new a(null);
    }
}

