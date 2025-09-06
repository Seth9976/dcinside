package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

@DecorView
public class PagerTitleStrip extends ViewGroup {
    class PageListener extends DataSetObserver implements OnAdapterChangeListener, OnPageChangeListener {
        private int a;
        final PagerTitleStrip b;

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void a(int v, float f, int v1) {
            if(f > 0.5f) {
                ++v;
            }
            PagerTitleStrip.this.d(v, f, false);
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void b(int v) {
            this.a = v;
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnAdapterChangeListener
        public void c(ViewPager viewPager0, PagerAdapter pagerAdapter0, PagerAdapter pagerAdapter1) {
            PagerTitleStrip.this.b(pagerAdapter0, pagerAdapter1);
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void d(int v) {
            if(this.a == 0) {
                PagerTitleStrip.this.c(PagerTitleStrip.this.a.getCurrentItem(), PagerTitleStrip.this.a.getAdapter());
                PagerTitleStrip.this.d(PagerTitleStrip.this.a.getCurrentItem(), (PagerTitleStrip.this.f >= 0.0f ? PagerTitleStrip.this.f : 0.0f), true);
            }
        }

        @Override  // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip.this.c(PagerTitleStrip.this.a.getCurrentItem(), PagerTitleStrip.this.a.getAdapter());
            PagerTitleStrip.this.d(PagerTitleStrip.this.a.getCurrentItem(), (PagerTitleStrip.this.f >= 0.0f ? PagerTitleStrip.this.f : 0.0f), true);
        }
    }

    static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        private Locale a;

        SingleLineAllCapsTransform(Context context0) {
            this.a = context0.getResources().getConfiguration().locale;
        }

        @Override  // android.text.method.ReplacementTransformationMethod
        public CharSequence getTransformation(CharSequence charSequence0, View view0) {
            CharSequence charSequence1 = super.getTransformation(charSequence0, view0);
            return charSequence1 != null ? charSequence1.toString().toUpperCase(this.a) : null;
        }
    }

    ViewPager a;
    TextView b;
    TextView c;
    TextView d;
    private int e;
    float f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private final PageListener k;
    private WeakReference l;
    private int m;
    int n;
    private static final int[] o = null;
    private static final int[] p = null;
    private static final float q = 0.6f;
    private static final int r = 16;

    static {
        PagerTitleStrip.o = new int[]{0x1010034, 0x1010095, 0x1010098, 0x10100AF};
        PagerTitleStrip.p = new int[]{0x101038C};
    }

    public PagerTitleStrip(@NonNull Context context0) {
        this(context0, null);
    }

    public PagerTitleStrip(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.e = -1;
        this.f = -1.0f;
        this.k = new PageListener(this);
        TextView textView0 = new TextView(context0);
        this.b = textView0;
        this.addView(textView0);
        TextView textView1 = new TextView(context0);
        this.c = textView1;
        this.addView(textView1);
        TextView textView2 = new TextView(context0);
        this.d = textView2;
        this.addView(textView2);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, PagerTitleStrip.o);
        boolean z = false;
        int v = typedArray0.getResourceId(0, 0);
        if(v != 0) {
            TextViewCompat.D(this.b, v);
            TextViewCompat.D(this.c, v);
            TextViewCompat.D(this.d, v);
        }
        int v1 = typedArray0.getDimensionPixelSize(1, 0);
        if(v1 != 0) {
            this.a(0, ((float)v1));
        }
        if(typedArray0.hasValue(2)) {
            int v2 = typedArray0.getColor(2, 0);
            this.b.setTextColor(v2);
            this.c.setTextColor(v2);
            this.d.setTextColor(v2);
        }
        this.h = typedArray0.getInteger(3, 80);
        typedArray0.recycle();
        this.n = this.c.getTextColors().getDefaultColor();
        this.setNonPrimaryAlpha(0.6f);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        this.b.setEllipsize(textUtils$TruncateAt0);
        this.c.setEllipsize(textUtils$TruncateAt0);
        this.d.setEllipsize(textUtils$TruncateAt0);
        if(v != 0) {
            TypedArray typedArray1 = context0.obtainStyledAttributes(v, PagerTitleStrip.p);
            z = typedArray1.getBoolean(0, false);
            typedArray1.recycle();
        }
        if(z) {
            PagerTitleStrip.setSingleLineAllCaps(this.b);
            PagerTitleStrip.setSingleLineAllCaps(this.c);
            PagerTitleStrip.setSingleLineAllCaps(this.d);
        }
        else {
            this.b.setSingleLine();
            this.c.setSingleLine();
            this.d.setSingleLine();
        }
        this.g = (int)(context0.getResources().getDisplayMetrics().density * 16.0f);
    }

    public void a(int v, float f) {
        this.b.setTextSize(v, f);
        this.c.setTextSize(v, f);
        this.d.setTextSize(v, f);
    }

    void b(PagerAdapter pagerAdapter0, PagerAdapter pagerAdapter1) {
        if(pagerAdapter0 != null) {
            pagerAdapter0.u(this.k);
            this.l = null;
        }
        if(pagerAdapter1 != null) {
            pagerAdapter1.m(this.k);
            this.l = new WeakReference(pagerAdapter1);
        }
        ViewPager viewPager0 = this.a;
        if(viewPager0 != null) {
            this.e = -1;
            this.f = -1.0f;
            this.c(viewPager0.getCurrentItem(), pagerAdapter1);
            this.requestLayout();
        }
    }

    void c(int v, PagerAdapter pagerAdapter0) {
        int v1 = pagerAdapter0 == null ? 0 : pagerAdapter0.e();
        this.i = true;
        CharSequence charSequence0 = null;
        this.b.setText((v < 1 || pagerAdapter0 == null ? null : pagerAdapter0.g(v - 1)));
        this.c.setText((pagerAdapter0 == null || v >= v1 ? null : pagerAdapter0.g(v)));
        if(v + 1 < v1 && pagerAdapter0 != null) {
            charSequence0 = pagerAdapter0.g(v + 1);
        }
        this.d.setText(charSequence0);
        int v2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((int)(((float)(this.getWidth() - this.getPaddingLeft() - this.getPaddingRight())) * 0.8f))), 0x80000000);
        int v3 = View.MeasureSpec.makeMeasureSpec(Math.max(0, this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()), 0x80000000);
        this.b.measure(v2, v3);
        this.c.measure(v2, v3);
        this.d.measure(v2, v3);
        this.e = v;
        if(!this.j) {
            this.d(v, this.f, false);
        }
        this.i = false;
    }

    void d(int v, float f, boolean z) {
        int v23;
        int v22;
        int v21;
        int v24;
        if(v != this.e) {
            this.c(v, this.a.getAdapter());
        }
        else if(!z && f == this.f) {
            return;
        }
        this.j = true;
        int v1 = this.b.getMeasuredWidth();
        int v2 = this.c.getMeasuredWidth();
        int v3 = this.d.getMeasuredWidth();
        int v4 = this.getWidth();
        int v5 = this.getHeight();
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingRight();
        int v8 = this.getPaddingTop();
        int v9 = this.getPaddingBottom();
        int v10 = v7 + v2 / 2;
        float f1 = f + 0.5f;
        int v11 = v4 - v10 - ((int)(((float)(v4 - (v6 + v2 / 2) - v10)) * (f1 > 1.0f ? f1 - 1.0f : f + 0.5f))) - v2 / 2;
        int v12 = v2 + v11;
        int v13 = this.b.getBaseline();
        int v14 = this.c.getBaseline();
        int v15 = this.d.getBaseline();
        int v16 = Math.max(Math.max(v13, v14), v15);
        int v17 = v16 - v13;
        int v18 = v16 - v14;
        int v19 = v16 - v15;
        int v20 = Math.max(Math.max(this.b.getMeasuredHeight() + v17, this.c.getMeasuredHeight() + v18), this.d.getMeasuredHeight() + v19);
        switch(this.h & 0x70) {
            case 16: {
                v24 = (v5 - v8 - v9 - v20) / 2;
                v21 = v17 + v24;
                v22 = v18 + v24;
                v23 = v24 + v19;
                break;
            }
            case 80: {
                v24 = v5 - v9 - v20;
                v21 = v17 + v24;
                v22 = v18 + v24;
                v23 = v24 + v19;
                break;
            }
            default: {
                v21 = v17 + v8;
                v22 = v18 + v8;
                v23 = v8 + v19;
            }
        }
        this.c.layout(v11, v22, v12, this.c.getMeasuredHeight() + v22);
        int v25 = Math.min(v6, v11 - this.g - v1);
        this.b.layout(v25, v21, v1 + v25, this.b.getMeasuredHeight() + v21);
        int v26 = Math.max(v4 - v7 - v3, v12 + this.g);
        this.d.layout(v26, v23, v26 + v3, this.d.getMeasuredHeight() + v23);
        this.f = f;
        this.j = false;
    }

    int getMinHeight() {
        Drawable drawable0 = this.getBackground();
        return drawable0 == null ? 0 : drawable0.getIntrinsicHeight();
    }

    public int getTextSpacing() {
        return this.g;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent viewParent0 = this.getParent();
        if(!(viewParent0 instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ((ViewPager)viewParent0).V(this.k);
        ((ViewPager)viewParent0).b(this.k);
        this.a = (ViewPager)viewParent0;
        this.b((this.l == null ? null : ((PagerAdapter)this.l.get())), ((ViewPager)viewParent0).getAdapter());
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager0 = this.a;
        if(viewPager0 != null) {
            this.b(viewPager0.getAdapter(), null);
            this.a.V(null);
            this.a.N(this.k);
            this.a = null;
        }
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        if(this.a != null) {
            this.d(this.e, (this.f >= 0.0f ? this.f : 0.0f), true);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v6;
        if(View.MeasureSpec.getMode(v) != 0x40000000) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int v2 = this.getPaddingTop() + this.getPaddingBottom();
        int v3 = ViewGroup.getChildMeasureSpec(v1, v2, -2);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = ViewGroup.getChildMeasureSpec(v, ((int)(((float)v4) * 0.2f)), -2);
        this.b.measure(v5, v3);
        this.c.measure(v5, v3);
        this.d.measure(v5, v3);
        if(View.MeasureSpec.getMode(v1) == 0x40000000) {
            v6 = View.MeasureSpec.getSize(v1);
        }
        else {
            int v7 = this.c.getMeasuredHeight();
            v6 = Math.max(this.getMinHeight(), v7 + v2);
        }
        this.setMeasuredDimension(v4, View.resolveSizeAndState(v6, v1, this.c.getMeasuredState() << 16));
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if(!this.i) {
            super.requestLayout();
        }
    }

    public void setGravity(int v) {
        this.h = v;
        this.requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0, to = 1.0) float f) {
        int v = ((int)(f * 255.0f)) & 0xFF;
        this.m = v;
        int v1 = v << 24 | this.n & 0xFFFFFF;
        this.b.setTextColor(v1);
        this.d.setTextColor(v1);
    }

    private static void setSingleLineAllCaps(TextView textView0) {
        textView0.setTransformationMethod(new SingleLineAllCapsTransform(textView0.getContext()));
    }

    public void setTextColor(@ColorInt int v) {
        this.n = v;
        this.c.setTextColor(v);
        int v1 = this.m << 24 | this.n & 0xFFFFFF;
        this.b.setTextColor(v1);
        this.d.setTextColor(v1);
    }

    public void setTextSpacing(int v) {
        this.g = v;
        this.requestLayout();
    }
}

