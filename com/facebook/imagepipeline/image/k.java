package com.facebook.imagepipeline.image;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.s0;
import y4.m;

@s0({"SMAP\nDefaultCloseableXml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCloseableXml.kt\ncom/facebook/imagepipeline/image/DefaultCloseableXml\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class k extends i implements h {
    @m
    private Drawable e;
    private boolean f;

    public k(@m Drawable drawable0) {
        this.e = drawable0;
    }

    @Override  // com.facebook.imagepipeline.image.e
    public void close() {
        this.e = null;
        this.f = true;
    }

    @Override  // com.facebook.imagepipeline.image.e
    public int getHeight() {
        Drawable drawable0 = this.e;
        if(drawable0 != null) {
            Integer integer0 = drawable0.getIntrinsicHeight();
            if(integer0.intValue() < 0) {
                integer0 = null;
            }
            return integer0 == null ? 0 : ((int)integer0);
        }
        return 0;
    }

    @Override  // com.facebook.imagepipeline.image.e
    public int getWidth() {
        Drawable drawable0 = this.e;
        if(drawable0 != null) {
            Integer integer0 = drawable0.getIntrinsicWidth();
            if(integer0.intValue() < 0) {
                integer0 = null;
            }
            return integer0 == null ? 0 : ((int)integer0);
        }
        return 0;
    }

    @Override  // com.facebook.imagepipeline.image.e
    public boolean isClosed() {
        return this.f;
    }

    @Override  // com.facebook.imagepipeline.image.h
    @m
    public Drawable u3() {
        Drawable drawable0 = this.e;
        if(drawable0 != null) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            return drawable$ConstantState0 == null ? null : drawable$ConstantState0.newDrawable();
        }
        return null;
    }

    @Override  // com.facebook.imagepipeline.image.e
    public int z() {
        return this.getWidth() * this.getHeight() * 4;
    }
}

