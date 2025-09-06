package com.facebook.imagepipeline.common;

import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.decoder.c;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class e {
    private int a;
    private int b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Bitmap.Config h;
    private Bitmap.Config i;
    @h
    private c j;
    @h
    private h1.a k;
    @h
    private ColorSpace l;
    private boolean m;

    public e() {
        this.a = 100;
        this.b = 0x7FFFFFFF;
        this.h = Bitmap.Config.ARGB_8888;
        this.i = Bitmap.Config.ARGB_8888;
    }

    public e A(int v) {
        this.a = v;
        return this;
    }

    public e B(boolean z) {
        this.e = z;
        return this;
    }

    public e C(boolean z) {
        this.d = z;
        return this.m();
    }

    public d a() {
        return new d(this);
    }

    public Bitmap.Config b() {
        return this.i;
    }

    public Bitmap.Config c() {
        return this.h;
    }

    @h
    public h1.a d() {
        return this.k;
    }

    @h
    public ColorSpace e() {
        return this.l;
    }

    @h
    public c f() {
        return this.j;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.c;
    }

    public boolean i() {
        return this.m;
    }

    public boolean j() {
        return this.g;
    }

    public int k() {
        return this.b;
    }

    public int l() {
        return this.a;
    }

    protected e m() [...] // Inlined contents

    public boolean n() {
        return this.e;
    }

    public boolean o() {
        return this.d;
    }

    public e p(Bitmap.Config bitmap$Config0) {
        this.i = bitmap$Config0;
        return this;
    }

    public e q(Bitmap.Config bitmap$Config0) {
        this.h = bitmap$Config0;
        return this;
    }

    public e r(@h h1.a a0) {
        this.k = a0;
        return this;
    }

    public e s(ColorSpace colorSpace0) {
        this.l = colorSpace0;
        return this;
    }

    public e t(@h c c0) {
        this.j = c0;
        return this;
    }

    public e u(boolean z) {
        this.f = z;
        return this.m();
    }

    public e v(boolean z) {
        this.c = z;
        return this;
    }

    public e w(boolean z) {
        this.m = z;
        return this;
    }

    public e x(boolean z) {
        this.g = z;
        return this.m();
    }

    public e y(d d0) {
        this.a = d0.a;
        this.b = d0.b;
        this.c = d0.c;
        this.d = d0.d;
        this.f = d0.f;
        this.g = d0.g;
        this.h = d0.h;
        this.i = d0.i;
        this.j = d0.j;
        this.k = d0.k;
        this.l = d0.l;
        return this;
    }

    public e z(int v) {
        this.b = v;
        return this;
    }
}

