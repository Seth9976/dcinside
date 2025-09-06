package com.facebook.imagepipeline.common;

import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import com.facebook.common.internal.l;
import com.facebook.imagepipeline.decoder.c;
import k1.n.a;
import k1.n;
import o3.h;
import p3.b;

@n(a.a)
@b
public class d {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Bitmap.Config h;
    public final Bitmap.Config i;
    @h
    public final c j;
    @h
    public final h1.a k;
    @h
    public final ColorSpace l;
    private final boolean m;
    private static final d n;

    static {
        d.n = d.b().a();
    }

    public d(e e0) {
        this.a = e0.l();
        this.b = e0.k();
        this.c = e0.h();
        this.d = e0.o();
        this.e = e0.n();
        this.f = e0.g();
        this.g = e0.j();
        this.h = e0.c();
        this.i = e0.b();
        this.j = e0.f();
        this.k = e0.d();
        this.l = e0.e();
        this.m = e0.i();
    }

    public static d a() {
        return d.n;
    }

    public static e b() {
        return new e();
    }

    protected com.facebook.common.internal.l.a c() {
        return l.e(this).d("minDecodeIntervalMs", this.a).d("maxDimensionPx", this.b).g("decodePreviewFrame", this.c).g("useLastFrameForPreview", this.d).g("useEncodedImageForPreview", this.e).g("decodeAllFrames", this.f).g("forceStaticImage", this.g).f("bitmapConfigName", this.h.name()).f("animatedBitmapConfigName", this.i.name()).f("customImageDecoder", this.j).f("bitmapTransformation", this.k).f("colorSpace", this.l);
    }

    @Override
    public boolean equals(@h Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.a != ((d)object0).a) {
            return false;
        }
        if(this.b != ((d)object0).b) {
            return false;
        }
        if(this.c != ((d)object0).c) {
            return false;
        }
        if(this.d != ((d)object0).d) {
            return false;
        }
        if(this.e != ((d)object0).e) {
            return false;
        }
        if(this.f != ((d)object0).f) {
            return false;
        }
        if(this.g != ((d)object0).g) {
            return false;
        }
        boolean z = this.m;
        if(!z && this.h != ((d)object0).h) {
            return false;
        }
        if(!z && this.i != ((d)object0).i) {
            return false;
        }
        if(this.j != ((d)object0).j) {
            return false;
        }
        return this.k == ((d)object0).k ? this.l == ((d)object0).l : false;
    }

    @Override
    public int hashCode() {
        int v = this.m ? (((((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g : ((((((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h.ordinal();
        int v1 = 0;
        if(!this.m) {
            v = v * 0x1F + (this.i == null ? 0 : this.i.ordinal());
        }
        int v2 = this.j == null ? 0 : this.j.hashCode();
        int v3 = this.k == null ? 0 : this.k.hashCode();
        ColorSpace colorSpace0 = this.l;
        if(colorSpace0 != null) {
            v1 = colorSpace0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return "ImageDecodeOptions{" + this.c().toString() + "}";
    }
}

