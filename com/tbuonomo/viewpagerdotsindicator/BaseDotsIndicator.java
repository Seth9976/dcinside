package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.StyleableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.tbuonomo.viewpagerdotsindicator.attacher.d;
import com.tbuonomo.viewpagerdotsindicator.attacher.e;
import java.util.ArrayList;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nBaseDotsIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDotsIndicator.kt\ncom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1855#2,2:229\n*S KotlinDebug\n*F\n+ 1 BaseDotsIndicator.kt\ncom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator\n*L\n172#1:229,2\n*E\n"})
public abstract class BaseDotsIndicator extends FrameLayout {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public interface b {
        void a(int arg1, boolean arg2);

        int b();

        void c(@l g arg1);

        void d();

        boolean e();

        int getCount();

        boolean isEmpty();
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class c extends Enum {
        private final float a;
        private final float b;
        @l
        private final int[] c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        public static final enum c i;
        public static final enum c j;
        public static final enum c k;
        private static final c[] l;

        static {
            if(styleable.SpringDotsIndicator == null) {
                throw (NullPointerException)L.A(new NullPointerException("SpringDotsIndicator must not be null"));
            }
            c.i = new c("DEFAULT", 0, 16.0f, 8.0f, styleable.SpringDotsIndicator, styleable.SpringDotsIndicator_dotsColor, styleable.SpringDotsIndicator_dotsSize, styleable.SpringDotsIndicator_dotsSpacing, styleable.SpringDotsIndicator_dotsCornerRadius, styleable.SpringDotsIndicator_dotsClickable);
            if(styleable.DotsIndicator == null) {
                throw (NullPointerException)L.A(new NullPointerException("DotsIndicator must not be null"));
            }
            c.j = new c("SPRING", 1, 16.0f, 4.0f, styleable.DotsIndicator, styleable.DotsIndicator_dotsColor, styleable.DotsIndicator_dotsSize, styleable.DotsIndicator_dotsSpacing, styleable.DotsIndicator_dotsCornerRadius, styleable.SpringDotsIndicator_dotsClickable);
            if(styleable.WormDotsIndicator == null) {
                throw (NullPointerException)L.A(new NullPointerException("WormDotsIndicator must not be null"));
            }
            c.k = new c("WORM", 2, 16.0f, 4.0f, styleable.WormDotsIndicator, styleable.WormDotsIndicator_dotsColor, styleable.WormDotsIndicator_dotsSize, styleable.WormDotsIndicator_dotsSpacing, styleable.WormDotsIndicator_dotsCornerRadius, styleable.SpringDotsIndicator_dotsClickable);
            c.l = new c[]{c.i, c.j, c.k};
        }

        private c(String s, int v, @StyleableRes float f, @StyleableRes float f1, @StyleableRes int[] arr_v, @StyleableRes int v1, @StyleableRes int v2, @StyleableRes int v3, int v4, int v5) {
            super(s, v);
            this.a = f;
            this.b = f1;
            this.c = arr_v;
            this.d = v1;
            this.e = v2;
            this.f = v3;
            this.g = v4;
            this.h = v5;
        }

        private static final c[] a() [...] // Inlined contents

        public final float b() {
            return this.a;
        }

        public final float c() {
            return this.b;
        }

        public final int d() {
            return this.h;
        }

        public final int e() {
            return this.d;
        }

        public final int f() {
            return this.g;
        }

        public final int g() {
            return this.e;
        }

        public final int h() {
            return this.f;
        }

        @l
        public final int[] i() {
            return this.c;
        }

        public static c valueOf(String s) {
            return (c)Enum.valueOf(c.class, s);
        }

        public static c[] values() {
            return (c[])c.l.clone();
        }
    }

    @l
    @f
    protected final ArrayList a;
    private boolean b;
    private int c;
    private float d;
    private float e;
    private float f;
    @m
    private b g;
    @l
    public static final a h = null;
    public static final int i = 0;
    public static final int j = 0xFF00FFFF;

    static {
        BaseDotsIndicator.h = new a(null);
        BaseDotsIndicator.i = 8;
    }

    @j
    public BaseDotsIndicator(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public BaseDotsIndicator(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public BaseDotsIndicator(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = new ArrayList();
        this.b = true;
        this.c = 0xFF00FFFF;
        float f = this.j(this.getType().b());
        this.d = f;
        this.e = f / 2.0f;
        this.f = this.j(this.getType().c());
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, this.getType().i());
            L.o(typedArray0, "context.obtainStyledAttr…(attrs, type.styleableId)");
            this.setDotsColor(typedArray0.getColor(this.getType().e(), 0xFF00FFFF));
            this.d = typedArray0.getDimension(this.getType().g(), this.d);
            this.e = typedArray0.getDimension(this.getType().f(), this.e);
            this.f = typedArray0.getDimension(this.getType().h(), this.f);
            this.b = typedArray0.getBoolean(this.getType().d(), true);
            typedArray0.recycle();
        }
    }

    public BaseDotsIndicator(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public abstract void d(int arg1);

    protected final void e(int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            this.d(v1);
        }
    }

    public final void f(@l ViewPager viewPager0) {
        L.p(viewPager0, "viewPager");
        new e().d(this, viewPager0);
    }

    public final void g(@l ViewPager2 viewPager20) {
        L.p(viewPager20, "viewPager2");
        new d().d(this, viewPager20);
    }

    public final boolean getDotsClickable() {
        return this.b;
    }

    public final int getDotsColor() {
        return this.c;
    }

    protected final float getDotsCornerRadius() {
        return this.e;
    }

    protected final float getDotsSize() {
        return this.d;
    }

    protected final float getDotsSpacing() {
        return this.f;
    }

    @m
    public final b getPager() {
        return this.g;
    }

    @l
    public abstract c getType();

    @l
    public abstract g h();

    protected final int i(int v) {
        return (int)(this.getContext().getResources().getDisplayMetrics().density * ((float)v));
    }

    protected final float j(float f) {
        return this.getContext().getResources().getDisplayMetrics().density * f;
    }

    // 检测为 Lambda 实现
    private static final void k(BaseDotsIndicator baseDotsIndicator0) [...]

    // 检测为 Lambda 实现
    private static final void l(BaseDotsIndicator baseDotsIndicator0) [...]

    public abstract void m(int arg1);

    public final void n() {
        if(this.g == null) {
            return;
        }
        this.post(() -> {
            L.p(this, "this$0");
            this.q();
            this.p();
            this.r();
            this.s();
        });
    }

    // 检测为 Lambda 实现
    private static final void o(BaseDotsIndicator baseDotsIndicator0) [...]

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.post(() -> {
            L.p(this, "this$0");
            this.n();
        });
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.getLayoutDirection() == 1) {
            this.setLayoutDirection(0);
            this.setRotation(180.0f);
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(@m Parcelable parcelable0) {
        super.onRestoreInstanceState(parcelable0);
        this.post(() -> {
            L.p(this, "this$0");
            this.n();
        });
    }

    protected final void p() {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.m(v1);
        }
    }

    private final void q() {
        b baseDotsIndicator$b0 = this.g;
        L.m(baseDotsIndicator$b0);
        int v = baseDotsIndicator$b0.getCount();
        if(this.a.size() < v) {
            b baseDotsIndicator$b1 = this.g;
            L.m(baseDotsIndicator$b1);
            this.e(baseDotsIndicator$b1.getCount() - this.a.size());
            return;
        }
        b baseDotsIndicator$b2 = this.g;
        L.m(baseDotsIndicator$b2);
        int v1 = baseDotsIndicator$b2.getCount();
        if(this.a.size() > v1) {
            b baseDotsIndicator$b3 = this.g;
            L.m(baseDotsIndicator$b3);
            int v2 = baseDotsIndicator$b3.getCount();
            this.u(this.a.size() - v2);
        }
    }

    private final void r() {
        for(Object object0: this.a) {
            com.tbuonomo.viewpagerdotsindicator.f.m(((ImageView)object0), ((int)this.d));
        }
    }

    private final void s() {
        b baseDotsIndicator$b0 = this.g;
        L.m(baseDotsIndicator$b0);
        if(baseDotsIndicator$b0.e()) {
            b baseDotsIndicator$b1 = this.g;
            L.m(baseDotsIndicator$b1);
            baseDotsIndicator$b1.d();
            g g0 = this.h();
            b baseDotsIndicator$b2 = this.g;
            L.m(baseDotsIndicator$b2);
            baseDotsIndicator$b2.c(g0);
            b baseDotsIndicator$b3 = this.g;
            L.m(baseDotsIndicator$b3);
            g0.b(baseDotsIndicator$b3.b(), 0.0f);
        }
    }

    public final void setDotsClickable(boolean z) {
        this.b = z;
    }

    public final void setDotsColor(int v) {
        this.c = v;
        this.p();
    }

    protected final void setDotsCornerRadius(float f) {
        this.e = f;
    }

    protected final void setDotsSize(float f) {
        this.d = f;
    }

    protected final void setDotsSpacing(float f) {
        this.f = f;
    }

    public final void setPager(@m b baseDotsIndicator$b0) {
        this.g = baseDotsIndicator$b0;
    }

    @k(message = "Use setDotsColors(color) instead", replaceWith = @c0(expression = "setDotsColors(color)", imports = {}))
    public final void setPointsColor(int v) {
        this.setDotsColor(v);
        this.p();
    }

    @k(message = "Use attachTo(viewPager) instead", replaceWith = @c0(expression = "attachTo(viewPager)", imports = {}))
    public final void setViewPager(@l ViewPager viewPager0) {
        L.p(viewPager0, "viewPager");
        new e().d(this, viewPager0);
    }

    @k(message = "Use attachTo(viewPager) instead", replaceWith = @c0(expression = "attachTo(viewPager)", imports = {}))
    public final void setViewPager2(@l ViewPager2 viewPager20) {
        L.p(viewPager20, "viewPager2");
        new d().d(this, viewPager20);
    }

    public abstract void t();

    private final void u(int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            this.t();
        }
    }
}

