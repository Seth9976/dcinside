package com.kakao.adfit.ads.na;

import android.graphics.drawable.Drawable;
import com.kakao.adfit.e.d;
import kotlin.jvm.internal.L;

public final class i implements f {
    private final d a;
    private Drawable b;
    private final int c;
    private final int d;

    public i(d d0, b m$b0) {
        L.p(d0, "view");
        L.p(m$b0, "image");
        super();
        this.a = d0;
        this.c = m$b0.c();
        this.d = m$b0.a();
    }

    @Override  // com.kakao.adfit.e.e
    public Drawable a() {
        return this.b;
    }

    public void a(Drawable drawable0) {
        if(!L.g(this.b, drawable0)) {
            this.b = drawable0;
            this.a.updateImageAdImage();
        }
    }

    @Override  // com.kakao.adfit.e.e
    public int b() {
        return this.d;
    }

    @Override  // com.kakao.adfit.e.e
    public int c() {
        return this.c;
    }

    @Override  // com.kakao.adfit.e.f
    public int i() {
        return 1;
    }
}

