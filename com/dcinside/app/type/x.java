package com.dcinside.app.type;

import android.content.Context;
import com.dcinside.app.util.dl;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public enum x {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        // 去混淆评级： 低(20)
        public final boolean a(@m String s) {
            return L.g(s, "hit") ? true : L.g(s, "dcbest");
        }

        @l
        public final x b(@m String s) {
            x x0;
            if(L.g(s, "hit")) {
                int v = dl.a.M0();
                x0 = x.c;
                if(v == x0.c()) {
                    return x0;
                }
                return v == x.d.c() ? x.d : x0;
            }
            if(L.g(s, "dcbest")) {
                int v1 = dl.a.N0();
                x0 = x.c;
                if(v1 != x0.c()) {
                    return v1 == x.d.c() ? x.d : x0;
                }
                return x0;
            }
            return x.c;
        }

        @l
        public final x c(int v) {
            x x0 = x.c;
            if(v != x0.c()) {
                return v == x.d.c() ? x.d : x0;
            }
            return x0;
        }

        @m
        public final String d(@l String s, @l Context context0) {
            L.p(s, "id");
            L.p(context0, "context");
            if(this.a(s)) {
                if(L.g(s, "hit")) {
                    dl dl0 = dl.a;
                    if(!dl0.O0()) {
                        dl0.G4(true);
                        return "HIT";
                    }
                }
                else if(L.g(s, "dcbest")) {
                    dl dl1 = dl.a;
                    if(!dl1.P0()) {
                        dl1.H4(true);
                        return "실시간 베스트";
                    }
                }
            }
            return null;
        }

        public final void e(@m x x0, @m String s) {
            if(x0 != null) {
                int v = x0.c();
                if(L.g(s, "hit")) {
                    dl.a.E4(v);
                    return;
                }
                if(L.g(s, "dcbest")) {
                    dl.a.F4(v);
                }
            }
        }
    }

    SUBJECT(0),
    THUMBNAIL(1);

    private final int a;
    @l
    public static final a b;
    private static final x[] e;
    private static final kotlin.enums.a f;

    static {
        x.e = arr_x;
        L.p(arr_x, "entries");
        x.f = new d(arr_x);
        x.b = new a(null);
    }

    private x(int v1) {
        this.a = v1;
    }

    private static final x[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return x.f;
    }

    public final int c() {
        return this.a;
    }
}

