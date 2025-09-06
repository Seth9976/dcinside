package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.RequiresApi;
import com.facebook.common.internal.q;
import com.facebook.common.internal.r;
import com.facebook.common.memory.j;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.e;
import com.facebook.imagepipeline.decoder.c;
import com.facebook.imagepipeline.decoder.f;
import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.J;
import com.facebook.imagepipeline.producers.K;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.O;
import com.facebook.imagepipeline.producers.P;
import com.facebook.imagepipeline.producers.U;
import com.facebook.imagepipeline.producers.V;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.Z;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.c0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.g;
import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.h;
import com.facebook.imagepipeline.producers.i;
import com.facebook.imagepipeline.producers.k;
import com.facebook.imagepipeline.producers.l;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.t;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.producers.w0;
import com.facebook.imagepipeline.producers.w;
import com.facebook.imagepipeline.producers.x;
import com.facebook.imagepipeline.producers.y0;
import com.facebook.imagepipeline.producers.z0;
import com.facebook.imagepipeline.producers.z;
import com.facebook.imagepipeline.transcoder.d;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;

@n(a.a)
public class s0 {
    protected ContentResolver a;
    protected Resources b;
    protected AssetManager c;
    protected final com.facebook.common.memory.a d;
    protected final c e;
    protected final f f;
    protected final com.facebook.imagepipeline.core.n g;
    protected final boolean h;
    protected final boolean i;
    protected final p j;
    protected final j k;
    protected final q l;
    protected final B m;
    protected final B n;
    protected final com.facebook.imagepipeline.cache.n o;
    protected final e p;
    protected final e q;
    protected final com.facebook.imagepipeline.bitmaps.e r;
    protected final int s;
    protected final int t;
    protected boolean u;
    protected final com.facebook.imagepipeline.core.a v;
    protected final int w;
    protected final boolean x;
    private static final int y = 5;

    public s0(Context context0, com.facebook.common.memory.a a0, c c0, f f0, com.facebook.imagepipeline.core.n n0, boolean z, boolean z1, p p0, j j0, B b0, B b1, q q0, com.facebook.imagepipeline.cache.n n1, com.facebook.imagepipeline.bitmaps.e e0, int v, int v1, boolean z2, int v2, com.facebook.imagepipeline.core.a a1, boolean z3, int v3) {
        this.a = context0.getApplicationContext().getContentResolver();
        this.b = context0.getApplicationContext().getResources();
        this.c = context0.getApplicationContext().getAssets();
        this.d = a0;
        this.e = c0;
        this.f = f0;
        this.g = n0;
        this.h = z;
        this.i = z1;
        this.j = p0;
        this.k = j0;
        this.n = b0;
        this.m = b1;
        this.l = q0;
        this.o = n1;
        this.r = e0;
        this.p = new e(v3);
        this.q = new e(v3);
        this.s = v;
        this.t = v1;
        this.u = z2;
        this.w = v2;
        this.v = a1;
        this.x = z3;
    }

    @Deprecated
    public s0(Context context0, com.facebook.common.memory.a a0, c c0, f f0, boolean z, boolean z1, boolean z2, p p0, j j0, B b0, B b1, q q0, com.facebook.imagepipeline.cache.n n0, com.facebook.imagepipeline.bitmaps.e e0, int v, int v1, boolean z3, int v2, com.facebook.imagepipeline.core.a a1, boolean z4, int v3) {
        this(context0, a0, c0, f0, (z ? com.facebook.imagepipeline.core.n.a : com.facebook.imagepipeline.core.n.b), z1, z2, p0, j0, b0, b1, q0, n0, e0, v, v1, z3, v2, a1, z4, v3);
    }

    public c0 A(h0 h00) {
        return new c0(this.n, this.o, h00);
    }

    public d0 B(h0 h00) {
        Executor executor0 = this.j.b();
        return new d0(h00, this.r, executor0);
    }

    public n0 C() {
        return new n0(this.j.c(), this.k, this.a);
    }

    public p0 D(h0 h00, boolean z, d d0) {
        return new p0(this.j.b(), this.k, h00, z, d0);
    }

    public com.facebook.imagepipeline.producers.s0 E(h0 h00) {
        return new com.facebook.imagepipeline.producers.s0(h00);
    }

    public w0 F(h0 h00) {
        return new w0(5, this.j.a(), h00);
    }

    public y0 G(z0[] arr_z0) {
        return new y0(arr_z0);
    }

    public static com.facebook.imagepipeline.producers.a a(h0 h00) {
        return new com.facebook.imagepipeline.producers.a(h00);
    }

    public h0 b(h0 h00, u0 u00) {
        return new t0(h00, u00);
    }

    public g c(h0 h00) {
        return new g(this.n, this.o, h00);
    }

    public h d(h0 h00) {
        return new h(this.o, h00);
    }

    public i e(h0 h00) {
        return new i(this.n, this.o, h00);
    }

    public com.facebook.imagepipeline.producers.j f(h0 h00) {
        return new com.facebook.imagepipeline.producers.j(h00, this.s, this.t, this.u);
    }

    public k g(h0 h00) {
        return new k(this.m, this.l, this.o, this.p, this.q, h00);
    }

    public static l h(h0 h00, h0 h01) {
        return new l(h00, h01);
    }

    public com.facebook.imagepipeline.producers.p i() {
        return new com.facebook.imagepipeline.producers.p(this.k);
    }

    public com.facebook.imagepipeline.producers.q j(h0 h00) {
        Executor executor0 = this.j.g();
        return new com.facebook.imagepipeline.producers.q(this.d, executor0, this.e, this.f, this.g, this.h, this.i, h00, this.w, this.v, null, r.b);
    }

    public t k(h0 h00) {
        return new t(h00, this.j.f());
    }

    public w l(h0 h00) {
        return new w(this.l, this.o, h00);
    }

    public x m(h0 h00) {
        return new x(this.l, this.o, h00);
    }

    public z n(h0 h00) {
        return new z(this.o, this.x, h00);
    }

    public h0 o(h0 h00) {
        return new A(this.m, this.o, h00);
    }

    public com.facebook.imagepipeline.producers.B p(h0 h00) {
        return new com.facebook.imagepipeline.producers.B(this.l, this.o, this.p, this.q, h00);
    }

    public I q() {
        return new I(this.j.c(), this.k, this.c);
    }

    public J r() {
        return new J(this.j.c(), this.k, this.a);
    }

    public K s() {
        return new K(this.j.c(), this.k, this.a);
    }

    public LocalExifThumbnailProducer t() {
        return new LocalExifThumbnailProducer(this.j.d(), this.k, this.a);
    }

    public O u() {
        return new O(this.j.c(), this.k);
    }

    public P v() {
        return new P(this.j.c(), this.k, this.b);
    }

    @RequiresApi(29)
    public U w() {
        return new U(this.j.b(), this.a);
    }

    public V x() {
        return new V(this.j.c(), this.a);
    }

    public h0 y(Z z0) {
        return new Y(this.k, this.d, z0);
    }

    public a0 z(h0 h00) {
        return new a0(this.l, this.o, this.k, this.d, h00);
    }
}

