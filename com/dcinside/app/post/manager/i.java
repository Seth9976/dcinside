package com.dcinside.app.post.manager;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final i a(int v) {
            switch(v) {
                case 0: {
                    return i.c;
                }
                case 1: {
                    return i.d;
                }
                case 2: {
                    return i.e;
                }
                default: {
                    return i.f;
                }
            }
        }
    }

    ACCEPT(0),
    REJECT(1),
    LATER(2),
    CANCEL(3);

    private final int a;
    @l
    public static final a b;
    private static final i[] g;
    private static final kotlin.enums.a h;

    static {
        i.g = arr_i;
        L.p(arr_i, "entries");
        i.h = new d(arr_i);
        i.b = new a(null);
    }

    private i(int v1) {
        this.a = v1;
    }

    private static final i[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return i.h;
    }

    public final int c() {
        return this.a;
    }
}

