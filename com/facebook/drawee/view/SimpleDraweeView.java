package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import com.facebook.common.internal.n;
import com.facebook.common.internal.q;
import com.facebook.drawee.R.styleable;
import com.facebook.drawee.controller.b;
import com.facebook.drawee.generic.a;
import com.facebook.imagepipeline.request.d;
import o3.h;

@Deprecated
public class SimpleDraweeView extends GenericDraweeView {
    private b h;
    @h
    private static q i;

    public SimpleDraweeView(Context context0) {
        super(context0);
        this.k(context0, null);
    }

    public SimpleDraweeView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.k(context0, attributeSet0);
    }

    public SimpleDraweeView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.k(context0, attributeSet0);
    }

    @TargetApi(21)
    public SimpleDraweeView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.k(context0, attributeSet0);
    }

    public SimpleDraweeView(Context context0, a a0) {
        super(context0, a0);
        this.k(context0, null);
    }

    public b getControllerBuilder() {
        return this.h;
    }

    private void k(Context context0, @h AttributeSet attributeSet0) {
        try {
            if(com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("SimpleDraweeView#init");
            }
            if(this.isInEditMode()) {
                this.getTopLevelDrawable().setVisible(true, false);
                this.getTopLevelDrawable().invalidateSelf();
            }
            else {
                n.j(SimpleDraweeView.i, "SimpleDraweeView was not initialized!");
                this.h = (b)SimpleDraweeView.i.get();
            }
            if(attributeSet0 != null) {
                TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.SimpleDraweeView);
                try {
                    if(typedArray0.hasValue(styleable.SimpleDraweeView_actualImageUri)) {
                        this.n(Uri.parse(typedArray0.getString(1)), null);
                    }
                    else if(typedArray0.hasValue(styleable.SimpleDraweeView_actualImageResource)) {
                        int v1 = typedArray0.getResourceId(0, -1);
                        if(v1 != -1) {
                            if(this.isInEditMode()) {
                                this.setImageResource(v1);
                            }
                            else {
                                this.setActualImageResource(v1);
                            }
                        }
                    }
                }
                catch(Throwable throwable0) {
                    typedArray0.recycle();
                    throw throwable0;
                }
                typedArray0.recycle();
            }
        }
        finally {
            if(com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    public static void l(q q0) {
        SimpleDraweeView.i = q0;
    }

    public void m(@DrawableRes int v, @h Object object0) {
        this.n(com.facebook.common.util.h.i(v), object0);
    }

    public void n(Uri uri0, @h Object object0) {
        this.setController(this.h.J(object0).c(uri0).b(this.getController()).build());
    }

    public void o(@h String s, @h Object object0) {
        this.n((s == null ? null : Uri.parse(s)), object0);
    }

    public static void p() {
        SimpleDraweeView.i = null;
    }

    public void setActualImageResource(@DrawableRes int v) {
        this.m(v, null);
    }

    public void setImageRequest(d d0) {
        this.setController(this.h.Q(d0).U(this.getController()).e());
    }

    @Override  // com.facebook.drawee.view.DraweeView
    public void setImageResource(int v) {
        super.setImageResource(v);
    }

    @Override  // com.facebook.drawee.view.DraweeView
    public void setImageURI(Uri uri0) {
        this.n(uri0, null);
    }

    public void setImageURI(@h String s) {
        this.o(s, null);
    }
}

