package com.tbuonomo.viewpagerdotsindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.j;

@StabilityInferred(parameters = 0)
public final class DotsIndicator extends BaseDotsIndicator {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private LinearLayout k;
    private float l;
    private boolean m;
    private float n;
    private int o;
    @l
    private final ArgbEvaluator p;
    @l
    public static final a q = null;
    public static final int r = 0;
    public static final float s = 2.5f;

    static {
        DotsIndicator.q = new a(null);
        DotsIndicator.r = 8;
    }

    @j
    public DotsIndicator(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public DotsIndicator(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public DotsIndicator(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.p = new ArgbEvaluator();
        this.A(attributeSet0);
    }

    public DotsIndicator(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void A(AttributeSet attributeSet0) {
        LinearLayout linearLayout0 = new LinearLayout(this.getContext());
        this.k = linearLayout0;
        linearLayout0.setOrientation(0);
        LinearLayout linearLayout1 = this.k;
        if(linearLayout1 == null) {
            L.S("linearLayout");
            linearLayout1 = null;
        }
        this.addView(linearLayout1, -2, -2);
        this.l = 2.5f;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.DotsIndicator);
            L.o(typedArray0, "context.obtainStyledAttr….styleable.DotsIndicator)");
            this.setSelectedDotColor(typedArray0.getColor(styleable.DotsIndicator_selectedDotColor, 0xFF00FFFF));
            float f = typedArray0.getFloat(styleable.DotsIndicator_dotsWidthFactor, 2.5f);
            this.l = f;
            if(f < 1.0f) {
                Log.w("DotsIndicator", "The dotsWidthFactor can\'t be set under 1.0f, please set an higher value");
                this.l = 1.0f;
            }
            this.m = typedArray0.getBoolean(styleable.DotsIndicator_progressMode, false);
            this.n = typedArray0.getDimension(styleable.DotsIndicator_dotsElevation, 0.0f);
            typedArray0.recycle();
        }
        if(this.isInEditMode()) {
            this.e(5);
            this.n();
        }
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void d(int v) {
        View view0 = LayoutInflater.from(this.getContext()).inflate(layout.dot_layout, this, false);
        ImageView imageView0 = (ImageView)view0.findViewById(id.dot);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
        L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        view0.setLayoutDirection(0);
        int v1 = (int)this.getDotsSize();
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).height = v1;
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).width = v1;
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).setMargins(((int)this.getDotsSpacing()), 0, ((int)this.getDotsSpacing()), 0);
        d d0 = new d();
        d0.setCornerRadius(this.getDotsCornerRadius());
        if(this.isInEditMode()) {
            d0.setColor((v == 0 ? this.o : this.getDotsColor()));
        }
        else {
            b baseDotsIndicator$b0 = this.getPager();
            L.m(baseDotsIndicator$b0);
            d0.setColor((baseDotsIndicator$b0.b() == v ? this.o : this.getDotsColor()));
        }
        L.o(imageView0, "imageView");
        f.j(imageView0, d0);
        view0.setOnClickListener((View view0) -> {
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
        L.o(view0, "dot");
        f.k(view0, ((int)(this.n * 0.8f)));
        f.l(view0, ((int)(this.n * 2.0f)));
        imageView0.setElevation(this.n);
        this.a.add(imageView0);
        LinearLayout linearLayout0 = this.k;
        if(linearLayout0 == null) {
            L.S("linearLayout");
            linearLayout0 = null;
        }
        linearLayout0.addView(view0);
    }

    public final int getSelectedDotColor() {
        return this.o;
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    @l
    public c getType() {
        return c.i;
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    @l
    public g h() {
        public static final class com.tbuonomo.viewpagerdotsindicator.DotsIndicator.b extends g {
            final DotsIndicator d;

            com.tbuonomo.viewpagerdotsindicator.DotsIndicator.b(DotsIndicator dotsIndicator0) {
                this.d = dotsIndicator0;
                super();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.g
            public int a() {
                return this.d.a.size();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.g
            public void c(int v, int v1, float f) {
                Object object0 = this.d.a.get(v);
                L.o(object0, "dots[selectedPosition]");
                f.m(((ImageView)object0), ((int)(this.d.getDotsSize() + this.d.getDotsSize() * (this.d.l - 1.0f) * (1.0f - f))));
                if(f.e(this.d.a, v1)) {
                    Object object1 = this.d.a.get(v1);
                    L.o(object1, "dots[nextPosition]");
                    f.m(((ImageView)object1), ((int)(this.d.getDotsSize() + this.d.getDotsSize() * (this.d.l - 1.0f) * f)));
                    Drawable drawable0 = ((ImageView)object0).getBackground();
                    L.n(drawable0, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
                    Drawable drawable1 = ((ImageView)object1).getBackground();
                    L.n(drawable1, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
                    if(this.d.getSelectedDotColor() != this.d.getDotsColor()) {
                        Object object2 = this.d.p.evaluate(f, this.d.getSelectedDotColor(), this.d.getDotsColor());
                        L.n(object2, "null cannot be cast to non-null type kotlin.Int");
                        int v2 = (int)(((Integer)object2));
                        Object object3 = this.d.p.evaluate(f, this.d.getDotsColor(), this.d.getSelectedDotColor());
                        L.n(object3, "null cannot be cast to non-null type kotlin.Int");
                        ((d)drawable1).setColor(((int)(((Integer)object3))));
                        if(this.d.m) {
                            b baseDotsIndicator$b0 = this.d.getPager();
                            L.m(baseDotsIndicator$b0);
                            if(v <= baseDotsIndicator$b0.b()) {
                                ((d)drawable0).setColor(this.d.getSelectedDotColor());
                            }
                            else {
                                ((d)drawable0).setColor(v2);
                            }
                        }
                        else {
                            ((d)drawable0).setColor(v2);
                        }
                    }
                }
                this.d.invalidate();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.g
            public void d(int v) {
                Object object0 = this.d.a.get(v);
                L.o(object0, "dots[position]");
                f.m(((View)object0), ((int)this.d.getDotsSize()));
                this.d.m(v);
            }
        }

        return new com.tbuonomo.viewpagerdotsindicator.DotsIndicator.b(this);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void m(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "dots[index]");
        Drawable drawable0 = ((ImageView)object0).getBackground();
        d d0 = drawable0 instanceof d ? ((d)drawable0) : null;
        if(d0 != null) {
            b baseDotsIndicator$b0 = this.getPager();
            L.m(baseDotsIndicator$b0);
            if(v == baseDotsIndicator$b0.b()) {
                d0.setColor(this.o);
            }
            else if(this.m) {
                b baseDotsIndicator$b1 = this.getPager();
                L.m(baseDotsIndicator$b1);
                if(v >= baseDotsIndicator$b1.b()) {
                    d0.setColor(this.getDotsColor());
                }
                else {
                    d0.setColor(this.o);
                }
            }
            else {
                d0.setColor(this.getDotsColor());
            }
        }
        f.j(((ImageView)object0), d0);
        ((ImageView)object0).invalidate();
    }

    public final void setSelectedDotColor(int v) {
        this.o = v;
        this.p();
    }

    @k(message = "Use setSelectedDotColor() instead", replaceWith = @c0(expression = "setSelectedDotColor()", imports = {}))
    public final void setSelectedPointColor(int v) {
        this.setSelectedDotColor(v);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void t() {
        LinearLayout linearLayout0 = this.k;
        LinearLayout linearLayout1 = null;
        if(linearLayout0 == null) {
            L.S("linearLayout");
            linearLayout0 = null;
        }
        LinearLayout linearLayout2 = this.k;
        if(linearLayout2 == null) {
            L.S("linearLayout");
        }
        else {
            linearLayout1 = linearLayout2;
        }
        linearLayout0.removeViewAt(linearLayout1.getChildCount() - 1);
        this.a.remove(this.a.size() - 1);
    }

    // 检测为 Lambda 实现
    private static final void z(DotsIndicator dotsIndicator0, int v, View view0) [...]
}

