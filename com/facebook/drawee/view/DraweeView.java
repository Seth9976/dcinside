package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.facebook.common.internal.l;
import o3.h;

@Deprecated
public class DraweeView extends ImageView {
    private final a a;
    private float b;
    private b c;
    private boolean d;
    private boolean e;
    @h
    private Object f;
    private static boolean g = false;

    static {
    }

    public DraweeView(Context context0) {
        super(context0);
        this.a = new a();
        this.b = 0.0f;
        this.d = false;
        this.e = false;
        this.f = null;
        this.e(context0);
    }

    public DraweeView(Context context0, @h AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new a();
        this.b = 0.0f;
        this.d = false;
        this.e = false;
        this.f = null;
        this.e(context0);
    }

    public DraweeView(Context context0, @h AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new a();
        this.b = 0.0f;
        this.d = false;
        this.e = false;
        this.f = null;
        this.e(context0);
    }

    @TargetApi(21)
    public DraweeView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = new a();
        this.b = 0.0f;
        this.d = false;
        this.e = false;
        this.f = null;
        this.e(context0);
    }

    protected void a() {
        this.c.m();
    }

    protected void b() {
        this.c.n();
    }

    public boolean c() {
        return this.c.e() != null;
    }

    public boolean d() {
        return this.c.j();
    }

    private void e(Context context0) {
        try {
            if(com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("DraweeView#init");
            }
        }
        catch(Throwable throwable0) {
            goto label_17;
        }
        if(this.d) {
            if(com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return;
        }
        try {
            boolean z = true;
            this.d = true;
            this.c = b.c(null, context0);
            ColorStateList colorStateList0 = this.getImageTintList();
            if(colorStateList0 != null) {
                this.setColorFilter(colorStateList0.getDefaultColor());
                if(!DraweeView.g) {
                    z = false;
                }
                this.e = z;
                goto label_20;
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
        }
    label_17:
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        throw throwable0;
    label_20:
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return;
    label_23:
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    private void f() {
        if(this.e) {
            Drawable drawable0 = this.getDrawable();
            if(drawable0 != null) {
                drawable0.setVisible(this.getVisibility() == 0, false);
            }
        }
    }

    protected void g() {
        this.a();
    }

    public float getAspectRatio() {
        return this.b;
    }

    @h
    public E0.a getController() {
        return this.c.e();
    }

    @h
    public Object getExtraData() {
        return this.f;
    }

    public E0.b getHierarchy() {
        return this.c.g();
    }

    @h
    public Drawable getTopLevelDrawable() {
        return this.c.h();
    }

    protected void h() {
        this.b();
    }

    public void i() {
        this.setController(null);
    }

    @Override  // android.widget.ImageView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f();
        this.g();
    }

    @Override  // android.widget.ImageView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f();
        this.h();
    }

    @Override  // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f();
        this.g();
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int v, int v1) {
        this.a.a = v;
        this.a.b = v1;
        float f = this.b;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        int v2 = this.getPaddingLeft();
        int v3 = this.getPaddingRight();
        int v4 = this.getPaddingTop();
        int v5 = this.getPaddingBottom();
        com.facebook.drawee.view.a.b(this.a, f, viewGroup$LayoutParams0, v2 + v3, v4 + v5);
        super.onMeasure(this.a.a, this.a.b);
    }

    @Override  // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f();
        this.h();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.c.o(motionEvent0) ? true : super.onTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        this.f();
    }

    public void setAspectRatio(float f) {
        if(f == this.b) {
            return;
        }
        this.b = f;
        this.requestLayout();
    }

    public void setController(@h E0.a a0) {
        this.c.r(a0);
        super.setImageDrawable(this.c.h());
    }

    public void setExtraData(@h Object object0) {
        this.f = object0;
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        DraweeView.g = z;
    }

    public void setHierarchy(E0.b b0) {
        this.c.s(b0);
        super.setImageDrawable(this.c.h());
    }

    @Override  // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap0) {
        this.e(this.getContext());
        this.c.q();
        super.setImageBitmap(bitmap0);
    }

    @Override  // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(@h Drawable drawable0) {
        this.e(this.getContext());
        this.c.q();
        super.setImageDrawable(drawable0);
    }

    @Override  // android.widget.ImageView
    @Deprecated
    public void setImageResource(int v) {
        this.e(this.getContext());
        this.c.q();
        super.setImageResource(v);
    }

    @Override  // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri0) {
        this.e(this.getContext());
        this.c.q();
        super.setImageURI(uri0);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.e = z;
    }

    @Override  // android.view.View
    public String toString() {
        com.facebook.common.internal.l.a l$a0 = l.e(this);
        b b0 = this.c;
        return b0 == null ? l$a0.f("holder", "<no holder set>").toString() : l$a0.f("holder", b0.toString()).toString();
    }
}

