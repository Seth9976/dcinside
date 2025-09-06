package com.dcinside.app.read.reply.more;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum a {
    public static final class com.dcinside.app.read.reply.more.a.a {
        private com.dcinside.app.read.reply.more.a.a() {
        }

        public com.dcinside.app.read.reply.more.a.a(w w0) {
        }

        @l
        public final a a(int v) {
            switch(v) {
                case 0: {
                    return a.d;
                }
                case 1: {
                    return a.e;
                }
                case 2: {
                    return a.f;
                }
                case 3: {
                    return a.g;
                }
                case 4: {
                    return a.h;
                }
                case 5: {
                    return a.i;
                }
                case 6: {
                    return a.j;
                }
                case 7: {
                    return a.k;
                }
                case 8: {
                    return a.l;
                }
                case 9: {
                    return a.m;
                }
                default: {
                    return a.c;
                }
            }
        }
    }

    NONE(-1),
    GALLOG(0),
    REPLY_UNDER(1),
    COPY_TEXT(2),
    SEARCH_NAME(3),
    MEMO(4),
    BLOCK_CHANGED(5),
    DELETE(6),
    MANAGER_BLOCK(7),
    DOWN_VOICE(8),
    ARCHIVE_VOICE(9);

    private final int a;
    @l
    public static final com.dcinside.app.read.reply.more.a.a b;
    private static final a[] n;
    private static final kotlin.enums.a o;

    static {
        a.n = arr_a;
        L.p(arr_a, "entries");
        a.o = new d(arr_a);
        a.b = new com.dcinside.app.read.reply.more.a.a(null);
    }

    private a(int v1) {
        this.a = v1;
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.o;
    }

    public final int c() {
        return this.a;
    }
}

