package com.dcinside.app.view.dccon;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final e a(@l String s) {
            L.p(s, "value");
            switch(s) {
                case "already": {
                    return e.c;
                }
                case "not enabled": {
                    return e.d;
                }
                case "updated": {
                    return e.b;
                }
                default: {
                    return e.d;
                }
            }
        }
    }

    UPDATED,
    ALREADY_UPDATED,
    FAILED;

    @l
    public static final a a;
    private static final e[] e;
    private static final kotlin.enums.a f;

    static {
        e.e = arr_e;
        L.p(arr_e, "entries");
        e.f = new d(arr_e);
        e.a = new a(null);
    }

    private static final e[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return e.f;
    }
}

