package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@StabilityInferred(parameters = 0)
public final class SpringDotsIndicator extends BaseDotsIndicator {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private View k;
    private float l;
    private int m;
    private int n;
    private float o;
    private float p;
    private final float q;
    @m
    private SpringAnimation r;
    @l
    private final LinearLayout s;
    @l
    public static final a t = null;
    public static final int u = 0;
    private static final float v = 0.5f;
    private static final int w = 300;

    static {
        SpringDotsIndicator.t = new a(null);
        SpringDotsIndicator.u = 8;
    }

    @j
    public SpringDotsIndicator(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public SpringDotsIndicator(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public SpringDotsIndicator(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        LinearLayout linearLayout0 = new LinearLayout(context0);
        this.s = linearLayout0;
        float f = this.j(24.0f);
        this.setClipToPadding(false);
        this.setPadding(((int)f), 0, ((int)f), 0);
        linearLayout0.setOrientation(0);
        this.addView(linearLayout0, -2, -2);
        this.l = this.j(2.0f);
        int v1 = f.b(context0);
        this.n = v1;
        this.m = v1;
        this.o = 300.0f;
        this.p = 0.5f;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.SpringDotsIndicator);
            L.o(typedArray0, "getContext().obtainStyle…able.SpringDotsIndicator)");
            int v2 = typedArray0.getColor(styleable.SpringDotsIndicator_dotsColor, this.n);
            this.n = v2;
            this.m = typedArray0.getColor(styleable.SpringDotsIndicator_dotsStrokeColor, v2);
            this.o = typedArray0.getFloat(styleable.SpringDotsIndicator_stiffness, this.o);
            this.p = typedArray0.getFloat(styleable.SpringDotsIndicator_dampingRatio, this.p);
            this.l = typedArray0.getDimension(styleable.SpringDotsIndicator_dotsStrokeWidth, this.l);
            typedArray0.recycle();
        }
        this.q = this.getDotsSize();
        if(this.isInEditMode()) {
            this.e(5);
            this.addView(this.y(false));
        }
        this.A();
    }

    public SpringDotsIndicator(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void A() {
        b baseDotsIndicator$b0 = this.getPager();
        if(baseDotsIndicator$b0 != null && baseDotsIndicator$b0.isEmpty()) {
            return;
        }
        if(this.k != null && this.indexOfChild(this.k) != -1) {
            this.removeView(this.k);
        }
        ViewGroup viewGroup0 = this.y(false);
        this.k = viewGroup0;
        this.addView(viewGroup0);
        this.r = new SpringAnimation(this.k, DynamicAnimation.m);
        SpringForce springForce0 = new SpringForce(0.0f);
        springForce0.g(this.p);
        springForce0.i(this.o);
        SpringAnimation springAnimation0 = this.r;
        L.m(springAnimation0);
        springAnimation0.D(springForce0);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void d(int v) {
        ViewGroup viewGroup0 = this.y(true);
        viewGroup0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            if(this.getDotsClickable()) {
                b baseDotsIndicator$b0 = this.getPager();
                if(v < (baseDotsIndicator$b0 == null ? 0 : baseDotsIndicator$b0.getCount())) {
                    b baseDotsIndicator$b1 = this.getPager();
                    L.m(baseDotsIndicator$b1);
                    baseDotsIndicator$b1.a(v, true);
                }
            }
        });
        View view0 = viewGroup0.findViewById(id.spring_dot);
        L.n(view0, "null cannot be cast to non-null type android.widget.ImageView");
        this.a.add(((ImageView)view0));
        this.s.addView(viewGroup0);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    @l
    public c getType() {
        return c.j;
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    @l
    public g h() {
        public static final class com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator.b extends g {
            final SpringDotsIndicator d;

            com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator.b(SpringDotsIndicator springDotsIndicator0) {
                this.d = springDotsIndicator0;
                super();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.g
            public int a() {
                return this.d.a.size();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.g
            public void c(int v, int v1, float f) {
                ViewParent viewParent0 = ((ImageView)this.d.a.get(v)).getParent();
                L.n(viewParent0, "null cannot be cast to non-null type android.view.ViewGroup");
                float f1 = ((float)((ViewGroup)viewParent0).getLeft()) + (this.d.getDotsSize() + this.d.getDotsSpacing() * 2.0f) * f;
                SpringAnimation springAnimation0 = this.d.r;
                if(springAnimation0 != null) {
                    springAnimation0.z(f1);
                }
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.g
            public void d(int v) {
            }
        }

        return new com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator.b(this);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void m(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "dots[index]");
        this.z(true, ((View)object0));
    }

    public final void setDotIndicatorColor(int v) {
        View view0 = this.k;
        if(view0 != null) {
            this.n = v;
            L.m(view0);
            this.z(false, view0);
        }
    }

    public final void setDotsStrokeWidth(float f) {
        this.l = f;
        for(Object object0: this.a) {
            L.o(((ImageView)object0), "v");
            this.z(true, ((ImageView)object0));
        }
    }

    public final void setStrokeDotsIndicatorColor(int v) {
        this.m = v;
        for(Object object0: this.a) {
            L.o(((ImageView)object0), "v");
            this.z(true, ((ImageView)object0));
        }
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void t() {
        int v = this.s.getChildCount();
        this.s.removeViewAt(v - 1);
        this.a.remove(this.a.size() - 1);
    }

    // 检测为 Lambda 实现
    private static final void x(SpringDotsIndicator springDotsIndicator0, int v, View view0) [...]

    private final ViewGroup y(boolean z) {
        View view0 = LayoutInflater.from(this.getContext()).inflate(layout.spring_dot_layout, this, false);
        L.n(view0, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup)view0).setLayoutDirection(0);
        ImageView imageView0 = (ImageView)((ViewGroup)view0).findViewById(id.spring_dot);
        imageView0.setBackgroundResource((z ? drawable.spring_dot_stroke_background : drawable.spring_dot_background));
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
        L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        float f = z ? this.getDotsSize() : this.q;
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).height = (int)f;
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).width = (int)f;
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(15, -1);
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).setMargins(((int)this.getDotsSpacing()), 0, ((int)this.getDotsSpacing()), 0);
        L.o(imageView0, "dotView");
        this.z(z, imageView0);
        return (ViewGroup)view0;
    }

    private final void z(boolean z, View view0) {
        Drawable drawable0 = view0.findViewById(id.spring_dot).getBackground();
        L.n(drawable0, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        if(z) {
            ((GradientDrawable)drawable0).setStroke(((int)this.l), this.m);
        }
        else {
            ((GradientDrawable)drawable0).setColor(this.n);
        }
        ((GradientDrawable)drawable0).setCornerRadius(this.getDotsCornerRadius());
    }
}

