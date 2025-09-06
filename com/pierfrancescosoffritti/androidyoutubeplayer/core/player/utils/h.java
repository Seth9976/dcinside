package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import J2.c;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "YouTubePlayerUtils")
public final class h {
    public static final void a(@l c c0, @l Lifecycle lifecycle0, @l String s, float f) {
        L.p(c0, "<this>");
        L.p(lifecycle0, "lifecycle");
        L.p(s, "videoId");
        h.b(c0, lifecycle0.b() == State.e, s, f);
    }

    public static final void b(c c0, boolean z, String s, float f) {
        L.p(c0, "<this>");
        L.p(s, "videoId");
        if(z) {
            c0.o(s, f);
            return;
        }
        c0.l(s, f);
    }
}

