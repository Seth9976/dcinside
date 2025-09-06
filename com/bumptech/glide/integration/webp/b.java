package com.bumptech.glide.integration.webp;

public class b {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;

    b(int v, WebpFrame webpFrame0) {
        this.a = v;
        this.b = webpFrame0.getXOffest();
        this.c = webpFrame0.getYOffest();
        this.d = webpFrame0.getWidth();
        this.e = webpFrame0.getHeight();
        this.f = webpFrame0.getDurationMs();
        this.g = webpFrame0.isBlendWithPreviousFrame();
        this.h = webpFrame0.shouldDisposeToBackgroundColor();
    }

    @Override
    public String toString() {
        return "frameNumber=" + this.a + ", xOffset=" + this.b + ", yOffset=" + this.c + ", width=" + this.d + ", height=" + this.e + ", duration=" + this.f + ", blendPreviousFrame=" + this.g + ", disposeBackgroundColor=" + this.h;
    }
}

