package com.dcinside.app.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.dcinside.app.Application;
import com.google.gson.annotations.c;
import java.util.Locale;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class i0 {
    public static enum a {
        PLAY_STORE,
        ONE_STORE,
        UNKNOWN;

        private static final a[] d;
        private static final kotlin.enums.a e;

        static {
            a.d = arr_i0$a;
            L.p(arr_i0$a, "entries");
            a.e = new d(arr_i0$a);
        }

        private static final a[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return a.e;
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[a.values().length];
            try {
                arr_v[a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @c("to")
    @m
    private final String a;
    @c("id")
    @m
    private final String b;

    public i0(@m String s, @m String s1) {
        this.a = s;
        this.b = s1;
    }

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String b() {
        return this.a;
    }

    @l
    public final a c() {
        String s1;
        String s = this.a;
        if(s == null) {
            s1 = null;
        }
        else {
            s1 = s.toLowerCase(Locale.ROOT);
            L.o(s1, "toLowerCase(...)");
        }
        if(L.g(s1, "play_store")) {
            return a.a;
        }
        return L.g(s1, "one_store") ? a.b : a.c;
    }

    public final boolean d() {
        Context context0 = Application.e.c();
        switch(this.c()) {
            case 1: {
                try {
                    Intent intent0 = new Intent("android.intent.action.VIEW");
                    intent0.setData(Uri.parse(("market://details?id=" + this.b)));
                    intent0.setFlags(0x10000000);
                    context0.startActivity(intent0);
                }
                catch(ActivityNotFoundException unused_ex) {
                    Intent intent1 = new Intent("android.intent.action.VIEW");
                    intent1.setData(Uri.parse(("http://play.google.com/store/apps/details?id=" + this.b)));
                    intent1.setFlags(0x10000000);
                    context0.startActivity(intent1);
                }
                return true;
            }
            case 2: {
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(("onestore://common/product/" + this.b)));
                    intent2.setFlags(0x10000000);
                    context0.startActivity(intent2);
                }
                catch(ActivityNotFoundException unused_ex) {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setData(Uri.parse(("https://onesto.re/" + this.b)));
                    intent3.setFlags(0x10000000);
                    context0.startActivity(intent3);
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

