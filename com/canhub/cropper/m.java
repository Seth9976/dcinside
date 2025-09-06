package com.canhub.cropper;

import android.net.Uri;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

@k(message = "\n  This ActivityResultContract is deprecated.\n  Please either roll your own ActivityResultContract with the desired behavior or copy paste this.\n")
public final class m {
    @y4.m
    private final Uri a;
    @l
    private final CropImageOptions b;

    public m(@y4.m Uri uri0, @l CropImageOptions cropImageOptions0) {
        L.p(cropImageOptions0, "cropImageOptions");
        super();
        this.a = uri0;
        this.b = cropImageOptions0;
    }

    @y4.m
    public final Uri a() {
        return this.a;
    }

    @l
    public final CropImageOptions b() {
        return this.b;
    }

    @l
    public final m c(@y4.m Uri uri0, @l CropImageOptions cropImageOptions0) {
        L.p(cropImageOptions0, "cropImageOptions");
        return new m(uri0, cropImageOptions0);
    }

    public static m d(m m0, Uri uri0, CropImageOptions cropImageOptions0, int v, Object object0) {
        if((v & 1) != 0) {
            uri0 = m0.a;
        }
        if((v & 2) != 0) {
            cropImageOptions0 = m0.b;
        }
        return m0.c(uri0, cropImageOptions0);
    }

    @l
    public final CropImageOptions e() {
        return this.b;
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        return L.g(this.a, ((m)object0).a) ? L.g(this.b, ((m)object0).b) : false;
    }

    @y4.m
    public final Uri f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? this.b.hashCode() : this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "CropImageContractOptions(uri=" + this.a + ", cropImageOptions=" + this.b + ")";
    }
}

