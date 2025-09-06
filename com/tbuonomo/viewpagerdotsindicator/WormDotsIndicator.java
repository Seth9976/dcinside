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
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@StabilityInferred(parameters = 0)
public final class WormDotsIndicator extends BaseDotsIndicator {
    @m
    private ImageView k;
    @m
    private View l;
    private float m;
    private int n;
    private int o;
    @m
    private SpringAnimation p;
    @m
    private SpringAnimation q;
    @l
    private final LinearLayout r;
    public static final int s = 8;

    static {
    }

    @j
    public WormDotsIndicator(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public WormDotsIndicator(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public WormDotsIndicator(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        LinearLayout linearLayout0 = new LinearLayout(context0);
        this.r = linearLayout0;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        int v1 = this.i(24);
        this.setPadding(v1, 0, v1, 0);
        this.setClipToPadding(false);
        linearLayout0.setLayoutParams(frameLayout$LayoutParams0);
        linearLayout0.setOrientation(0);
        this.addView(linearLayout0);
        this.m = this.j(2.0f);
        int v2 = f.b(context0);
        this.n = v2;
        this.o = v2;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.WormDotsIndicator);
            L.o(typedArray0, "getContext().obtainStyle…leable.WormDotsIndicator)");
            int v3 = typedArray0.getColor(styleable.WormDotsIndicator_dotsColor, this.n);
            this.n = v3;
            this.o = typedArray0.getColor(styleable.WormDotsIndicator_dotsStrokeColor, v3);
            this.m = typedArray0.getDimension(styleable.WormDotsIndicator_dotsStrokeWidth, this.m);
            typedArray0.recycle();
        }
        if(this.isInEditMode()) {
            this.e(5);
            this.addView(this.A(false));
        }
        this.C();
    }

    public WormDotsIndicator(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final ViewGroup A(boolean z) {
        View view0 = LayoutInflater.from(this.getContext()).inflate(layout.worm_dot_layout, this, false);
        L.n(view0, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup)view0).setLayoutDirection(0);
        View view1 = ((ViewGroup)view0).findViewById(id.worm_dot);
        view1.setBackgroundResource((z ? drawable.worm_dot_stroke_background : drawable.worm_dot_background));
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int v = (int)this.getDotsSize();
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).height = v;
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).width = v;
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).addRule(15, -1);
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).setMargins(((int)this.getDotsSpacing()), 0, ((int)this.getDotsSpacing()), 0);
        L.o(view1, "dotImageView");
        this.B(z, view1);
        return (ViewGroup)view0;
    }

    private final void B(boolean z, View view0) {
        Drawable drawable0 = view0.getBackground();
        L.n(drawable0, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        if(z) {
            ((GradientDrawable)drawable0).setStroke(((int)this.m), this.o);
        }
        else {
            ((GradientDrawable)drawable0).setColor(this.n);
        }
        ((GradientDrawable)drawable0).setCornerRadius(this.getDotsCornerRadius());
    }

    private final void C() {
        public static final class b extends FloatPropertyCompat {
            final WormDotsIndicator b;

            b(WormDotsIndicator wormDotsIndicator0) {
                this.b = wormDotsIndicator0;
                super("DotsWidth");
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(@l View view0) {
                L.p(view0, "object");
                ImageView imageView0 = this.b.k;
                L.m(imageView0);
                return (float)imageView0.getLayoutParams().width;
            }

            public void e(@l View view0, float f) {
                L.p(view0, "object");
                ImageView imageView0 = this.b.k;
                L.m(imageView0);
                imageView0.getLayoutParams().width = (int)f;
                ImageView imageView1 = this.b.k;
                L.m(imageView1);
                imageView1.requestLayout();
            }
        }

        com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b baseDotsIndicator$b0 = this.getPager();
        if(baseDotsIndicator$b0 != null && baseDotsIndicator$b0.isEmpty()) {
            return;
        }
        if(this.k != null && this.indexOfChild(this.k) != -1) {
            this.removeView(this.k);
        }
        ViewGroup viewGroup0 = this.A(false);
        this.l = viewGroup0;
        L.m(viewGroup0);
        this.k = (ImageView)viewGroup0.findViewById(id.worm_dot);
        this.addView(this.l);
        this.p = new SpringAnimation(this.l, DynamicAnimation.m);
        SpringForce springForce0 = new SpringForce(0.0f);
        springForce0.g(1.0f);
        springForce0.i(300.0f);
        SpringAnimation springAnimation0 = this.p;
        L.m(springAnimation0);
        springAnimation0.D(springForce0);
        b wormDotsIndicator$b0 = new b(this);
        this.q = new SpringAnimation(this.l, wormDotsIndicator$b0);
        SpringForce springForce1 = new SpringForce(0.0f);
        springForce1.g(1.0f);
        springForce1.i(300.0f);
        SpringAnimation springAnimation1 = this.q;
        L.m(springAnimation1);
        springAnimation1.D(springForce1);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void d(int v) {
        ViewGroup viewGroup0 = this.A(true);
        viewGroup0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            if(this.getDotsClickable()) {
                com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b baseDotsIndicator$b0 = this.getPager();
                if(v < (baseDotsIndicator$b0 == null ? 0 : baseDotsIndicator$b0.getCount())) {
                    com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b baseDotsIndicator$b1 = this.getPager();
                    L.m(baseDotsIndicator$b1);
                    baseDotsIndicator$b1.a(v, true);
                }
            }
        });
        View view0 = viewGroup0.findViewById(id.worm_dot);
        L.n(view0, "null cannot be cast to non-null type android.widget.ImageView");
        this.a.add(((ImageView)view0));
        this.r.addView(viewGroup0);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    @l
    public c getType() {
        return c.k;
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    @l
    public g h() {
        public static final class a extends g {
            final WormDotsIndicator d;

            a(WormDotsIndicator wormDotsIndicator0) {
                this.d = wormDotsIndicator0;
                super();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.g
            public int a() {
                return this.d.a.size();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.g
            public void c(int v, int v1, float f) {
                float f3;
                ViewParent viewParent0 = ((ImageView)this.d.a.get(v)).getParent();
                L.n(viewParent0, "null cannot be cast to non-null type android.view.ViewGroup");
                float f1 = (float)((ViewGroup)viewParent0).getLeft();
                ArrayList arrayList0 = this.d.a;
                if(v1 != -1) {
                    v = v1;
                }
                ViewParent viewParent1 = ((ImageView)arrayList0.get(v)).getParent();
                L.n(viewParent1, "null cannot be cast to non-null type android.view.ViewGroup");
                float f2 = (float)((ViewGroup)viewParent1).getLeft();
                if(0.0f <= f && f <= 0.1f) {
                    f3 = this.d.getDotsSize();
                }
                else if(0.1f > f || f > 0.9f) {
                    f1 = f2;
                    f3 = this.d.getDotsSize();
                }
                else {
                    f3 = f2 - f1 + this.d.getDotsSize();
                }
                SpringAnimation springAnimation0 = this.d.p;
                if(springAnimation0 != null) {
                    springAnimation0.z(f1);
                }
                SpringAnimation springAnimation1 = this.d.q;
                if(springAnimation1 != null) {
                    springAnimation1.z(f3);
                }
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.g
            public void d(int v) {
            }
        }

        return new a(this);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void m(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "dots[index]");
        this.B(true, ((View)object0));
    }

    public final void setDotIndicatorColor(int v) {
        ImageView imageView0 = this.k;
        if(imageView0 != null) {
            this.n = v;
            L.m(imageView0);
            this.B(false, imageView0);
        }
    }

    public final void setDotsStrokeWidth(float f) {
        this.m = f;
        for(Object object0: this.a) {
            L.o(((ImageView)object0), "v");
            this.B(true, ((ImageView)object0));
        }
    }

    public final void setStrokeDotsIndicatorColor(int v) {
        this.o = v;
        for(Object object0: this.a) {
            L.o(((ImageView)object0), "v");
            this.B(true, ((ImageView)object0));
        }
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void t() {
        int v = this.r.getChildCount();
        this.r.removeViewAt(v - 1);
        this.a.remove(this.a.size() - 1);
    }

    // 检测为 Lambda 实现
    private static final void z(WormDotsIndicator wormDotsIndicator0, int v, View view0) [...]
}

