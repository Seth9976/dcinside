package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import J2.a.c;
import J2.a.d;
import K2.a;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class f extends a {
    public final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.f.a {
        public static final int[] a;

        static {
            int[] arr_v = new int[d.values().length];
            try {
                arr_v[d.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.f.a.a = arr_v;
        }
    }

    private boolean a;
    private boolean b;
    @m
    private c c;
    @m
    private String d;
    private float e;

    @Override  // K2.a
    public void a(@l J2.c c0, float f) {
        L.p(c0, "youTubePlayer");
        this.e = f;
    }

    @Override  // K2.a
    public void e(@l J2.c c0, @l String s) {
        L.p(c0, "youTubePlayer");
        L.p(s, "videoId");
        this.d = s;
    }

    @Override  // K2.a
    public void f(@l J2.c c0, @l d a$d0) {
        L.p(c0, "youTubePlayer");
        L.p(a$d0, "state");
        switch(a$d0) {
            case 1: 
            case 2: {
                this.b = false;
                return;
            }
            case 3: {
                this.b = true;
            }
        }
    }

    @Override  // K2.a
    public void g(@l J2.c c0, @l c a$c0) {
        L.p(c0, "youTubePlayer");
        L.p(a$c0, "error");
        if(a$c0 == c.c) {
            this.c = a$c0;
        }
    }

    public final void k() {
        this.a = true;
    }

    public final void l() {
        this.a = false;
    }

    public final void m(@l J2.c c0) {
        L.p(c0, "youTubePlayer");
        String s = this.d;
        if(s == null) {
            return;
        }
        boolean z = this.b;
        if(z && this.c == c.c) {
            h.b(c0, this.a, s, this.e);
        }
        else if(!z && this.c == c.c) {
            c0.l(s, this.e);
        }
        this.c = null;
    }
}

