package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import J2.a.d;
import J2.c;
import K2.a;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class g extends a {
    @l
    private d a;
    private float b;
    private float c;
    @m
    private String d;

    public g() {
        this.a = d.a;
    }

    @Override  // K2.a
    public void a(@l c c0, float f) {
        L.p(c0, "youTubePlayer");
        this.b = f;
    }

    @Override  // K2.a
    public void e(@l c c0, @l String s) {
        L.p(c0, "youTubePlayer");
        L.p(s, "videoId");
        this.d = s;
    }

    @Override  // K2.a
    public void f(@l c c0, @l d a$d0) {
        L.p(c0, "youTubePlayer");
        L.p(a$d0, "state");
        this.a = a$d0;
    }

    @Override  // K2.a
    public void i(@l c c0, float f) {
        L.p(c0, "youTubePlayer");
        this.c = f;
    }

    public final float k() {
        return this.b;
    }

    @l
    public final d l() {
        return this.a;
    }

    public final float m() {
        return this.c;
    }

    @m
    public final String n() {
        return this.d;
    }
}

