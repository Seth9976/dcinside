package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R.attr;
import com.google.android.material.R.color;
import com.google.android.material.R.dimen;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.internal.K;
import com.google.android.material.internal.M;
import com.google.android.material.motion.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

abstract class BaseSlider extends View {
    static class SliderState extends View.BaseSavedState {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            @NonNull
            public SliderState a(@NonNull Parcel parcel0) {
                return new SliderState(parcel0, null);
            }

            @NonNull
            public SliderState[] b(int v) {
                return new SliderState[v];
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        float a;
        float b;
        ArrayList c;
        float d;
        boolean e;

        static {
            SliderState.CREATOR = new a();
        }

        private SliderState(@NonNull Parcel parcel0) {
            super(parcel0);
            this.a = parcel0.readFloat();
            this.b = parcel0.readFloat();
            ArrayList arrayList0 = new ArrayList();
            this.c = arrayList0;
            parcel0.readList(arrayList0, Float.class.getClassLoader());
            this.d = parcel0.readFloat();
            this.e = parcel0.createBooleanArray()[0];
        }

        SliderState(Parcel parcel0, com.google.android.material.slider.BaseSlider.a baseSlider$a0) {
            this(parcel0);
        }

        SliderState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeFloat(this.a);
            parcel0.writeFloat(this.b);
            parcel0.writeList(this.c);
            parcel0.writeFloat(this.d);
            parcel0.writeBooleanArray(new boolean[]{this.e});
        }
    }

    static class c {
        static final int[] a;

        static {
            int[] arr_v = new int[f.values().length];
            c.a = arr_v;
            try {
                arr_v[f.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[f.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[f.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[f.a.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class d implements Runnable {
        int a;
        final BaseSlider b;

        private d() {
            this.a = -1;
        }

        d(com.google.android.material.slider.BaseSlider.a baseSlider$a0) {
        }

        void a(int v) {
            this.a = v;
        }

        @Override
        public void run() {
            BaseSlider.this.h.Y(this.a, 4);
        }
    }

    static class e extends ExploreByTouchHelper {
        private final BaseSlider t;
        final Rect u;

        e(BaseSlider baseSlider0) {
            super(baseSlider0);
            this.u = new Rect();
            this.t = baseSlider0;
        }

        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected int C(float f, float f1) {
            for(int v = 0; v < this.t.getValues().size(); ++v) {
                this.t.z0(v, this.u);
                if(this.u.contains(((int)f), ((int)f1))) {
                    return v;
                }
            }
            return -1;
        }

        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected void D(List list0) {
            for(int v = 0; v < this.t.getValues().size(); ++v) {
                list0.add(v);
            }
        }

        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected boolean N(int v, int v1, Bundle bundle0) {
            if(!this.t.isEnabled()) {
                return false;
            }
            if(v1 != 0x1000 && v1 != 0x2000) {
                if(v1 != 0x102003D) {
                    return false;
                }
                if(bundle0 != null && bundle0.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    float f = bundle0.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                    if(this.t.x0(v, f)) {
                        this.t.A0();
                        this.t.postInvalidate();
                        this.G(v);
                        return true;
                    }
                }
                return false;
            }
            float f1 = this.t.n(20);
            if(v1 == 0x2000) {
                f1 = -f1;
            }
            if(this.t.V()) {
                f1 = -f1;
            }
            float f2 = MathUtils.d(((float)(((Float)this.t.getValues().get(v)))) + f1, this.t.getValueFrom(), this.t.getValueTo());
            if(this.t.x0(v, f2)) {
                this.t.A0();
                this.t.postInvalidate();
                this.G(v);
                return true;
            }
            return false;
        }

        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected void R(int v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.M);
            List list0 = this.t.getValues();
            float f = (float)(((Float)list0.get(v)));
            float f1 = this.t.getValueFrom();
            float f2 = this.t.getValueTo();
            if(this.t.isEnabled()) {
                if(f > f1) {
                    accessibilityNodeInfoCompat0.a(0x2000);
                }
                if(f < f2) {
                    accessibilityNodeInfoCompat0.a(0x1000);
                }
            }
            accessibilityNodeInfoCompat0.V1(RangeInfoCompat.e(1, f1, f2, f));
            accessibilityNodeInfoCompat0.k1("android.widget.SeekBar");
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.t.getContentDescription() != null) {
                stringBuilder0.append(this.t.getContentDescription());
                stringBuilder0.append(",");
            }
            String s = this.t.F(f);
            String s1 = this.t.getContext().getString(string.material_slider_value);
            if(list0.size() > 1) {
                s1 = this.a0(v);
            }
            stringBuilder0.append(String.format(Locale.US, "%s, %s", s1, s));
            accessibilityNodeInfoCompat0.p1(stringBuilder0.toString());
            this.t.z0(v, this.u);
            accessibilityNodeInfoCompat0.e1(this.u);
        }

        @NonNull
        private String a0(int v) {
            if(v == this.t.getValues().size() - 1) {
                return this.t.getContext().getString(string.material_slider_range_end);
            }
            return v == 0 ? this.t.getContext().getString(string.material_slider_range_start) : "";
        }
    }

    static enum f {
        BOTH,
        LEFT,
        RIGHT,
        NONE;

    }

    private int A;
    private static final double A9 = 0.0001;
    private int B;
    private static final float B9 = 0.5f;
    private int C;
    static final int C9 = 0;
    private int D;
    static final int D9 = 1;
    private int E;
    static final int E9 = 0;
    private int F;
    private static final int F9 = 83;
    private int G;
    private static final int G9 = 0x75;
    private int H;
    private static final int H9 = 0;
    private int I;
    private static final int I9 = 0;
    private int J;
    private static final int J9 = 0;
    private int K;
    private static final int K9 = 0;
    private int L;
    @Dimension(unit = 0)
    private static final int L9 = 0x30;
    private int M;
    private float M8;
    private float N;
    private float N8;
    private MotionEvent O;
    private ArrayList O8;
    private com.google.android.material.slider.e P;
    private int P8;
    private boolean Q;
    private int Q8;
    private float R8;
    private float[] S8;
    private boolean T8;
    private int U8;
    private int V8;
    private int W8;
    private boolean X8;
    private boolean Y8;
    private boolean Z8;
    @NonNull
    private final Paint a;
    @NonNull
    private ColorStateList a9;
    @NonNull
    private final Paint b;
    @NonNull
    private ColorStateList b9;
    @NonNull
    private final Paint c;
    @NonNull
    private ColorStateList c9;
    @NonNull
    private final Paint d;
    @NonNull
    private ColorStateList d9;
    @NonNull
    private final Paint e;
    @NonNull
    private ColorStateList e9;
    @NonNull
    private final Paint f;
    @NonNull
    private final Path f9;
    @NonNull
    private final Paint g;
    @NonNull
    private final RectF g9;
    @NonNull
    private final e h;
    @NonNull
    private final RectF h9;
    private final AccessibilityManager i;
    @NonNull
    private final k i9;
    private d j;
    @Nullable
    private Drawable j9;
    private int k;
    @NonNull
    private List k9;
    @NonNull
    private final List l;
    private float l9;
    @NonNull
    private final List m;
    private int m9;
    @NonNull
    private final List n;
    @NonNull
    private final ViewTreeObserver.OnScrollChangedListener n9;
    private boolean o;
    private static final String o9 = "BaseSlider";
    private ValueAnimator p;
    private static final String p9 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private ValueAnimator q;
    private static final String q9 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private final int r;
    private static final String r9 = "valueFrom(%s) must be smaller than valueTo(%s)";
    private int s;
    private static final String s9 = "valueTo(%s) must be greater than valueFrom(%s)";
    private int t;
    private static final String t9 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private int u;
    private static final String u9 = "minSeparation(%s) must be greater or equal to 0";
    private int v;
    private static final String v9 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private int w;
    private static final String w9 = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private int x;
    private static final String x9 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    @Px
    private int y;
    private static final int y9 = 200;
    private int z;
    private static final int z9 = 0x3F;

    static {
        BaseSlider.C9 = style.Widget_MaterialComponents_Slider;
        BaseSlider.H9 = attr.motionDurationMedium4;
        BaseSlider.I9 = attr.motionDurationShort3;
        BaseSlider.J9 = attr.motionEasingEmphasizedInterpolator;
        BaseSlider.K9 = attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    public BaseSlider(@NonNull Context context0) {
        this(context0, null);
    }

    public BaseSlider(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.sliderStyle);
    }

    public BaseSlider(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, BaseSlider.C9), attributeSet0, v);
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = false;
        this.I = -1;
        this.J = -1;
        this.Q = false;
        this.O8 = new ArrayList();
        this.P8 = -1;
        this.Q8 = -1;
        this.R8 = 0.0f;
        this.T8 = true;
        this.Y8 = false;
        this.f9 = new Path();
        this.g9 = new RectF();
        this.h9 = new RectF();
        k k0 = new k();
        this.i9 = k0;
        this.k9 = Collections.emptyList();
        this.m9 = 0;
        this.n9 = () -> switch(this.B) {
            case 0: 
            case 1: {
                if(this.P8 != -1 && this.isEnabled()) {
                    this.B();
                    return;
                }
                this.C();
                return;
            }
            case 2: {
                this.C();
                return;
            }
            case 3: {
                if(this.isEnabled() && this.W()) {
                    this.B();
                    return;
                }
                this.C();
                return;
            }
            default: {
                throw new IllegalArgumentException("Unexpected labelBehavior: " + this.B);
            }
        };
        Context context1 = this.getContext();
        this.a = new Paint();
        this.b = new Paint();
        Paint paint0 = new Paint(1);
        this.c = paint0;
        Paint.Style paint$Style0 = Paint.Style.FILL;
        paint0.setStyle(paint$Style0);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint1 = new Paint(1);
        this.d = paint1;
        paint1.setStyle(paint$Style0);
        Paint paint2 = new Paint();
        this.e = paint2;
        Paint.Style paint$Style1 = Paint.Style.STROKE;
        paint2.setStyle(paint$Style1);
        Paint.Cap paint$Cap0 = Paint.Cap.ROUND;
        paint2.setStrokeCap(paint$Cap0);
        Paint paint3 = new Paint();
        this.f = paint3;
        paint3.setStyle(paint$Style1);
        paint3.setStrokeCap(paint$Cap0);
        Paint paint4 = new Paint();
        this.g = paint4;
        paint4.setStyle(paint$Style0);
        paint4.setStrokeCap(paint$Cap0);
        this.Y(context1.getResources());
        this.n0(context1, attributeSet0, v);
        this.setFocusable(true);
        this.setClickable(true);
        k0.y0(2);
        this.r = ViewConfiguration.get(context1).getScaledTouchSlop();
        e baseSlider$e0 = new e(this);
        this.h = baseSlider$e0;
        ViewCompat.J1(this, baseSlider$e0);
        this.i = (AccessibilityManager)this.getContext().getSystemService("accessibility");
    }

    private void A(@NonNull Canvas canvas0, int v, int v1) {
        for(int v2 = 0; v2 < this.O8.size(); ++v2) {
            float f = (float)(((Float)this.O8.get(v2)));
            Drawable drawable0 = this.j9;
            if(drawable0 != null) {
                this.z(canvas0, v, v1, f, drawable0);
            }
            else if(v2 < this.k9.size()) {
                this.z(canvas0, v, v1, f, ((Drawable)this.k9.get(v2)));
            }
            else {
                if(!this.isEnabled()) {
                    canvas0.drawCircle(((float)this.D) + this.h0(f) * ((float)v), ((float)v1), ((float)this.getThumbRadius()), this.c);
                }
                this.z(canvas0, v, v1, f, this.i9);
            }
        }
    }

    private void A0() {
        if(!this.u0() && this.getMeasuredWidth() > 0) {
            Drawable drawable0 = this.getBackground();
            if(drawable0 instanceof RippleDrawable) {
                int v = (int)(this.h0(((float)(((Float)this.O8.get(this.Q8))))) * ((float)this.W8) + ((float)this.D));
                int v1 = this.o();
                DrawableCompat.l(drawable0, v - this.G, v1 - this.G, v + this.G, v1 + this.G);
            }
        }
    }

    private void B() {
        if(!this.o) {
            this.o = true;
            ValueAnimator valueAnimator0 = this.r(true);
            this.p = valueAnimator0;
            this.q = null;
            valueAnimator0.start();
        }
        Iterator iterator0 = this.l.iterator();
        for(int v = 0; v < this.O8.size() && iterator0.hasNext(); ++v) {
            if(v != this.Q8) {
                Object object0 = iterator0.next();
                this.r0(((com.google.android.material.tooltip.a)object0), ((float)(((Float)this.O8.get(v)))));
            }
        }
        if(!iterator0.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", this.l.size(), this.O8.size()));
        }
        Object object1 = iterator0.next();
        this.r0(((com.google.android.material.tooltip.a)object1), ((float)(((Float)this.O8.get(this.Q8)))));
    }

    // 检测为 Lambda 实现
    private void B0() [...]

    private void C() {
        class b extends AnimatorListenerAdapter {
            final BaseSlider a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                K k0 = M.m(BaseSlider.this);
                for(Object object0: BaseSlider.this.l) {
                    k0.a(((com.google.android.material.tooltip.a)object0));
                }
            }
        }

        if(this.o) {
            this.o = false;
            ValueAnimator valueAnimator0 = this.r(false);
            this.q = valueAnimator0;
            this.p = null;
            valueAnimator0.addListener(new b(this));
            this.q.start();
        }
    }

    private void C0(Canvas canvas0, Paint paint0, RectF rectF0, f baseSlider$f0) {
        float f = ((float)this.C) / 2.0f;
        float f1 = ((float)this.C) / 2.0f;
        int[] arr_v = c.a;
        switch(arr_v[baseSlider$f0.ordinal()]) {
            case 1: {
                f = (float)this.L;
                f1 = (float)this.L;
                break;
            }
            case 2: {
                f1 = (float)this.L;
                break;
            }
            case 3: {
                f = (float)this.L;
            }
        }
        paint0.setStyle(Paint.Style.FILL);
        paint0.setStrokeCap(Paint.Cap.BUTT);
        paint0.setAntiAlias(true);
        this.f9.reset();
        if(rectF0.width() >= f + f1) {
            this.f9.addRoundRect(rectF0, this.K(f, f1), Path.Direction.CW);
            canvas0.drawPath(this.f9, paint0);
            return;
        }
        float f2 = Math.min(f, f1);
        float f3 = Math.max(f, f1);
        canvas0.save();
        this.f9.addRoundRect(rectF0, f2, f2, Path.Direction.CW);
        canvas0.clipPath(this.f9);
        switch(arr_v[baseSlider$f0.ordinal()]) {
            case 2: {
                this.h9.set(rectF0.left, rectF0.top, 2.0f * f3 + rectF0.left, rectF0.bottom);
                break;
            }
            case 3: {
                this.h9.set(rectF0.right - 2.0f * f3, rectF0.top, rectF0.right, rectF0.bottom);
                break;
            }
            default: {
                float f4 = rectF0.centerX();
                float f5 = rectF0.top;
                float f6 = rectF0.centerX();
                this.h9.set(f4 - f3, f5, f6 + f3, rectF0.bottom);
            }
        }
        canvas0.drawRoundRect(this.h9, f3, f3, paint0);
        canvas0.restore();
    }

    private void D(int v) {
        switch(v) {
            case 1: {
                this.f0(0x7FFFFFFF);
                return;
            }
            case 2: {
                this.f0(0x80000000);
                return;
            }
            case 17: {
                this.g0(0x7FFFFFFF);
                return;
            }
            case 66: {
                this.g0(0x80000000);
            }
        }
    }

    private void D0(int v) {
        this.W8 = Math.max(v - this.D * 2, 0);
        this.Z();
    }

    @VisibleForTesting
    void E(boolean z) {
        this.X8 = z;
    }

    private void E0() {
        boolean z = this.e0();
        boolean z1 = this.d0();
        if(z) {
            this.requestLayout();
            return;
        }
        if(z1) {
            this.postInvalidate();
        }
    }

    private String F(float f) {
        if(this.O()) {
            return this.P.a(f);
        }
        return ((float)(((int)f))) == f ? String.format("%.0f", f) : String.format("%.2f", f);
    }

    private void F0() {
        if(this.Z8) {
            this.I0();
            this.J0();
            this.H0();
            this.K0();
            this.G0();
            this.N0();
            this.Z8 = false;
        }
    }

    private float[] G() {
        float f = (float)(((Float)this.O8.get(0)));
        float f1 = (float)(((Float)this.O8.get(this.O8.size() - 1)));
        if(this.O8.size() == 1) {
            f = this.M8;
        }
        float f2 = this.h0(f);
        float f3 = this.h0(f1);
        return this.V() ? new float[]{f3, f2} : new float[]{f2, f3};
    }

    private void G0() {
        float f = this.getMinSeparation();
        if(f < 0.0f) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", f));
        }
        float f1 = this.R8;
        if(f1 > 0.0f && f > 0.0f) {
            if(this.m9 != 1) {
                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", f, this.R8));
            }
            if(f < f1 || !this.T(((double)f))) {
                throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", f, this.R8, this.R8));
            }
        }
    }

    private static float H(ValueAnimator valueAnimator0, float f) {
        if(valueAnimator0 != null && valueAnimator0.isRunning()) {
            f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            valueAnimator0.cancel();
        }
        return f;
    }

    private void H0() {
        if(this.R8 > 0.0f && !this.L0(this.N8)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", this.R8, this.M8, this.N8));
        }
    }

    private float I(int v, float f) {
        float f1 = this.getMinSeparation();
        if(this.m9 == 0) {
            f1 = this.u(f1);
        }
        if(this.V()) {
            f1 = -f1;
        }
        float f2 = v + 1 < this.O8.size() ? ((float)(((Float)this.O8.get(v + 1)))) - f1 : this.N8;
        return v - 1 >= 0 ? MathUtils.d(f, ((float)(((Float)this.O8.get(v - 1)))) + f1, f2) : MathUtils.d(f, this.M8, f2);
    }

    private void I0() {
        if(this.M8 >= this.N8) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", this.M8, this.N8));
        }
    }

    @ColorInt
    private int J(@NonNull ColorStateList colorStateList0) {
        return colorStateList0.getColorForState(this.getDrawableState(), colorStateList0.getDefaultColor());
    }

    private void J0() {
        if(this.N8 <= this.M8) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", this.N8, this.M8));
        }
    }

    private float[] K(float f, float f1) {
        return new float[]{f, f, f1, f1, f1, f1, f, f};
    }

    private void K0() {
        for(Object object0: this.O8) {
            Float float0 = (Float)object0;
            if(((float)float0) < this.M8 || ((float)float0) > this.N8) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", float0, this.M8, this.N8));
            }
            if(this.R8 > 0.0f && !this.L0(((float)float0))) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", float0, this.M8, this.R8, this.R8));
            }
        }
    }

    private float L() {
        double f = this.w0(this.l9);
        if(this.V()) {
            f = 1.0 - f;
        }
        return (float)(f * ((double)(this.N8 - this.M8)) + ((double)this.M8));
    }

    private boolean L0(float f) {
        return this.T(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.M8)), MathContext.DECIMAL64).doubleValue());
    }

    private float M() {
        float f = this.l9;
        return (this.V() ? 1.0f - f : this.l9) * (this.N8 - this.M8) + this.M8;
    }

    private float M0(float f) {
        return this.h0(f) * ((float)this.W8) + ((float)this.D);
    }

    private boolean N() {
        return this.H > 0;
    }

    private void N0() {
        float f = this.R8;
        if(f == 0.0f) {
            return;
        }
        if(((float)(((int)f))) != f) {
            Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", f));
        }
        float f1 = this.M8;
        if(((float)(((int)f1))) != f1) {
            Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", f1));
        }
        float f2 = this.N8;
        if(((float)(((int)f2))) != f2) {
            Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", f2));
        }
    }

    public boolean O() {
        return this.P != null;
    }

    private Drawable P(Drawable drawable0) {
        Drawable drawable1 = drawable0.mutate().getConstantState().newDrawable();
        this.j(drawable1);
        return drawable1;
    }

    private void Q() {
        this.a.setStrokeWidth(((float)this.C));
        this.b.setStrokeWidth(((float)this.C));
    }

    private boolean R() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 instanceof ViewGroup; viewParent0 = viewParent0.getParent()) {
            if((((ViewGroup)viewParent0).canScrollVertically(1) || ((ViewGroup)viewParent0).canScrollVertically(-1)) && ((ViewGroup)viewParent0).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private static boolean S(MotionEvent motionEvent0) {
        return motionEvent0.getToolType(0) == 3;
    }

    private boolean T(double f) {
        double f1 = new BigDecimal(Double.toString(f)).divide(new BigDecimal(Float.toString(this.R8)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double)Math.round(f1)) - f1) < 0.0001;
    }

    // 去混淆评级： 低(20)
    private boolean U(MotionEvent motionEvent0) {
        return !BaseSlider.S(motionEvent0) && this.R();
    }

    final boolean V() {
        return ViewCompat.e0(this) == 1;
    }

    private boolean W() {
        Rect rect0 = new Rect();
        M.l(this).getHitRect(rect0);
        return this.getLocalVisibleRect(rect0);
    }

    public boolean X() {
        return this.T8;
    }

    private void Y(@NonNull Resources resources0) {
        this.z = resources0.getDimensionPixelSize(dimen.mtrl_slider_widget_height);
        int v = resources0.getDimensionPixelOffset(dimen.mtrl_slider_track_side_padding);
        this.s = v;
        this.D = v;
        this.t = resources0.getDimensionPixelSize(dimen.mtrl_slider_thumb_radius);
        this.u = resources0.getDimensionPixelSize(dimen.mtrl_slider_track_height);
        this.v = resources0.getDimensionPixelSize(dimen.mtrl_slider_tick_radius);
        this.w = resources0.getDimensionPixelSize(dimen.mtrl_slider_tick_radius);
        this.x = resources0.getDimensionPixelSize(dimen.mtrl_slider_tick_min_spacing);
        this.M = resources0.getDimensionPixelSize(dimen.mtrl_slider_label_padding);
    }

    private void Z() {
        if(this.R8 <= 0.0f) {
            return;
        }
        this.F0();
        int v = Math.min(((int)((this.N8 - this.M8) / this.R8 + 1.0f)), this.W8 / this.x + 1);
        if(this.S8 == null || this.S8.length != v * 2) {
            this.S8 = new float[v * 2];
        }
        float f = ((float)this.W8) / ((float)(v - 1));
        for(int v1 = 0; v1 < v * 2; v1 += 2) {
            float[] arr_f = this.S8;
            arr_f[v1] = ((float)this.D) + ((float)v1) / 2.0f * f;
            arr_f[v1 + 1] = (float)this.o();
        }
    }

    private void a0(@NonNull Canvas canvas0, int v, int v1) {
        if(this.u0()) {
            int v2 = (int)(((float)this.D) + this.h0(((float)(((Float)this.O8.get(this.Q8))))) * ((float)v));
            if(Build.VERSION.SDK_INT < 28) {
                canvas0.clipRect(((float)(v2 - this.G)), ((float)(v1 - this.G)), ((float)(v2 + this.G)), ((float)(this.G + v1)), Region.Op.UNION);
            }
            canvas0.drawCircle(((float)v2), ((float)v1), ((float)this.G), this.d);
        }
    }

    private void b0(@NonNull Canvas canvas0, int v) {
        if(this.K <= 0) {
            return;
        }
        if(this.O8.size() >= 1) {
            float f = (float)(((Float)this.O8.get(this.O8.size() - 1)));
            float f1 = this.N8;
            if(f < f1) {
                canvas0.drawPoint(this.M0(f1), ((float)v), this.g);
            }
        }
        if(this.O8.size() > 1) {
            float f2 = (float)(((Float)this.O8.get(0)));
            float f3 = this.M8;
            if(f2 > f3) {
                canvas0.drawPoint(this.M0(f3), ((float)v), this.g);
            }
        }
    }

    private void c0(@NonNull Canvas canvas0) {
        if(this.T8 && this.R8 > 0.0f) {
            float[] arr_f = this.G();
            int v = (int)Math.ceil(arr_f[0] * (((float)this.S8.length) / 2.0f - 1.0f));
            int v1 = (int)Math.floor(arr_f[1] * (((float)this.S8.length) / 2.0f - 1.0f));
            if(v > 0) {
                canvas0.drawPoints(this.S8, 0, v * 2, this.e);
            }
            if(v <= v1) {
                canvas0.drawPoints(this.S8, v * 2, (v1 - v + 1) * 2, this.f);
            }
            int v2 = (v1 + 1) * 2;
            float[] arr_f1 = this.S8;
            if(v2 < arr_f1.length) {
                canvas0.drawPoints(arr_f1, v2, arr_f1.length - v2, this.e);
            }
        }
    }

    private boolean d0() {
        int v = this.s + Math.max(Math.max(Math.max(this.E / 2 - this.t, 0), Math.max((this.C - this.u) / 2, 0)), Math.max(Math.max(this.U8 - this.v, 0), Math.max(this.V8 - this.w, 0)));
        if(this.D == v) {
            return false;
        }
        this.D = v;
        if(ViewCompat.a1(this)) {
            this.D0(this.getWidth());
        }
        return true;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent0) {
        return this.h.v(motionEvent0) || super.dispatchHoverEvent(motionEvent0);
    }

    @Override  // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int v = this.J(this.e9);
        this.a.setColor(v);
        int v1 = this.J(this.d9);
        this.b.setColor(v1);
        int v2 = this.J(this.c9);
        this.e.setColor(v2);
        int v3 = this.J(this.b9);
        this.f.setColor(v3);
        int v4 = this.J(this.d9);
        this.g.setColor(v4);
        for(Object object0: this.l) {
            com.google.android.material.tooltip.a a0 = (com.google.android.material.tooltip.a)object0;
            if(a0.isStateful()) {
                a0.setState(this.getDrawableState());
            }
        }
        if(this.i9.isStateful()) {
            int[] arr_v = this.getDrawableState();
            this.i9.setState(arr_v);
        }
        int v5 = this.J(this.a9);
        this.d.setColor(v5);
        this.d.setAlpha(0x3F);
    }

    private boolean e0() {
        int v = this.getPaddingTop();
        int v1 = this.getPaddingBottom();
        int v2 = Math.max(this.C + (v + v1), this.F + this.getPaddingTop() + this.getPaddingBottom());
        int v3 = Math.max(this.z, v2);
        if(v3 == this.A) {
            return false;
        }
        this.A = v3;
        return true;
    }

    private boolean f0(int v) {
        int v1 = this.Q8;
        int v2 = (int)MathUtils.f(((long)v1) + ((long)v), 0L, this.O8.size() - 1);
        this.Q8 = v2;
        if(v2 == v1) {
            return false;
        }
        if(this.P8 != -1) {
            this.P8 = v2;
        }
        this.A0();
        this.postInvalidate();
        return true;
    }

    private boolean g0(int v) {
        if(this.V()) {
            if(v == 0x80000000) {
                return this.f0(0x7FFFFFFF);
            }
            v = -v;
        }
        return this.f0(v);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return "android.widget.SeekBar";
    }

    @VisibleForTesting
    final int getAccessibilityFocusedVirtualViewId() {
        return this.h.x();
    }

    public int getActiveThumbIndex() {
        return this.P8;
    }

    public int getFocusedThumbIndex() {
        return this.Q8;
    }

    @Px
    public int getHaloRadius() {
        return this.G;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.a9;
    }

    public int getLabelBehavior() {
        return this.B;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.R8;
    }

    public float getThumbElevation() {
        return this.i9.y();
    }

    @Px
    public int getThumbHeight() {
        return this.F;
    }

    @Px
    public int getThumbRadius() {
        return this.E / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.i9.O();
    }

    public float getThumbStrokeWidth() {
        return this.i9.R();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.i9.z();
    }

    public int getThumbTrackGapSize() {
        return this.H;
    }

    @Px
    public int getThumbWidth() {
        return this.E;
    }

    @Px
    public int getTickActiveRadius() {
        return this.U8;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.b9;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.V8;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.c9;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if(!this.c9.equals(this.b9)) {
            throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        }
        return this.b9;
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.d9;
    }

    @Px
    public int getTrackHeight() {
        return this.C;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.e9;
    }

    public int getTrackInsideCornerSize() {
        return this.L;
    }

    @Px
    public int getTrackSidePadding() {
        return this.D;
    }

    public int getTrackStopIndicatorSize() {
        return this.K;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if(!this.e9.equals(this.d9)) {
            throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        }
        return this.d9;
    }

    @Px
    public int getTrackWidth() {
        return this.W8;
    }

    public float getValueFrom() {
        return this.M8;
    }

    public float getValueTo() {
        return this.N8;
    }

    @NonNull
    List getValues() {
        return new ArrayList(this.O8);
    }

    public void h(@NonNull com.google.android.material.slider.a a0) {
        this.m.add(a0);
    }

    private float h0(float f) {
        float f1 = (f - this.M8) / (this.N8 - this.M8);
        return this.V() ? 1.0f - f1 : f1;
    }

    public void i(@NonNull com.google.android.material.slider.b b0) {
        this.n.add(b0);
    }

    @Nullable
    private Boolean i0(int v, @NonNull KeyEvent keyEvent0) {
        switch(v) {
            case 21: {
                this.g0(-1);
                return true;
            }
            case 22: {
                this.g0(1);
                return true;
            }
            case 61: {
                if(keyEvent0.hasNoModifiers()) {
                    return Boolean.valueOf(this.f0(1));
                }
                return keyEvent0.isShiftPressed() ? Boolean.valueOf(this.f0(-1)) : false;
            }
            case 23: 
            case 66: {
                this.P8 = this.Q8;
                this.postInvalidate();
                return true;
            }
            case 69: {
                this.f0(-1);
                return true;
            }
            case 70: 
            case 81: {
                this.f0(1);
                return true;
            }
            default: {
                return null;
            }
        }
    }

    private void j(Drawable drawable0) {
        int v = drawable0.getIntrinsicWidth();
        int v1 = drawable0.getIntrinsicHeight();
        if(v == -1 && v1 == -1) {
            drawable0.setBounds(0, 0, this.E, this.F);
            return;
        }
        float f = ((float)Math.max(this.E, this.F)) / ((float)Math.max(v, v1));
        drawable0.setBounds(0, 0, ((int)(((float)v) * f)), ((int)(((float)v1) * f)));
    }

    private void j0() {
        for(Object object0: this.n) {
            ((com.google.android.material.slider.b)object0).a(this);
        }
    }

    private void k(com.google.android.material.tooltip.a a0) {
        a0.l1(M.l(this));
    }

    private void k0() {
        for(Object object0: this.n) {
            ((com.google.android.material.slider.b)object0).b(this);
        }
    }

    @Nullable
    private Float l(int v) {
        float f = this.Y8 ? this.n(20) : this.m();
        switch(v) {
            case 21: {
                if(!this.V()) {
                    f = -f;
                }
                return f;
            }
            case 22: {
                if(this.V()) {
                    f = -f;
                }
                return f;
            }
            case 69: {
                return (float)(-f);
            }
            case 70: 
            case 81: {
                return f;
            }
            default: {
                return null;
            }
        }
    }

    protected boolean l0() {
        boolean z;
        if(this.P8 != -1) {
            return true;
        }
        float f = this.M();
        float f1 = this.M0(f);
        this.P8 = 0;
        float f2 = Math.abs(((float)(((Float)this.O8.get(0)))) - f);
        for(int v = 1; v < this.O8.size(); ++v) {
            float f3 = Math.abs(((float)(((Float)this.O8.get(v)))) - f);
            float f4 = this.M0(((float)(((Float)this.O8.get(v)))));
            if(Float.compare(f3, f2) > 0) {
                break;
            }
            if(!this.V()) {
                if(f4 - f1 < 0.0f) {
                    z = true;
                }
            }
            else if(f4 - f1 > 0.0f) {
                z = true;
            }
            else {
                z = false;
            }
            if(Float.compare(f3, f2) < 0) {
                this.P8 = v;
                f2 = f3;
            }
            else if(Float.compare(f3, f2) == 0) {
                if(Math.abs(f4 - f1) < ((float)this.r)) {
                    this.P8 = -1;
                    return false;
                }
                if(z) {
                    this.P8 = v;
                    f2 = f3;
                }
            }
        }
        return this.P8 != -1;
    }

    private float m() {
        return this.R8 == 0.0f ? 1.0f : this.R8;
    }

    private void m0(com.google.android.material.tooltip.a a0, float f) {
        int v = this.D + ((int)(this.h0(f) * ((float)this.W8))) - a0.getIntrinsicWidth() / 2;
        int v1 = this.o() - (this.M + this.F / 2);
        a0.setBounds(v, v1 - a0.getIntrinsicHeight(), a0.getIntrinsicWidth() + v, v1);
        Rect rect0 = new Rect(a0.getBounds());
        com.google.android.material.internal.d.c(M.l(this), this, rect0);
        a0.setBounds(rect0);
    }

    private float n(int v) {
        float f = this.m();
        float f1 = (this.N8 - this.M8) / f;
        return f1 <= ((float)v) ? f : ((float)Math.round(f1 / ((float)v))) * f;
    }

    private void n0(Context context0, AttributeSet attributeSet0, int v) {
        TypedArray typedArray0 = D.k(context0, attributeSet0, styleable.Slider, v, BaseSlider.C9, new int[0]);
        this.k = typedArray0.getResourceId(styleable.Slider_labelStyle, style.Widget_MaterialComponents_Tooltip);
        this.M8 = typedArray0.getFloat(styleable.Slider_android_valueFrom, 0.0f);
        this.N8 = typedArray0.getFloat(styleable.Slider_android_valueTo, 1.0f);
        this.setValues(new Float[]{this.M8});
        this.R8 = typedArray0.getFloat(styleable.Slider_android_stepSize, 0.0f);
        float f = (float)Math.ceil(M.i(this.getContext(), 0x30));
        this.y = (int)Math.ceil(typedArray0.getDimension(styleable.Slider_minTouchTargetSize, f));
        int v1 = styleable.Slider_trackColor;
        boolean z = typedArray0.hasValue(v1);
        int v2 = z ? 24 : styleable.Slider_trackColorInactive;
        if(!z) {
            v1 = styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList0 = com.google.android.material.resources.d.a(context0, typedArray0, v2);
        if(colorStateList0 == null) {
            colorStateList0 = AppCompatResources.a(context0, color.material_slider_inactive_track_color);
        }
        this.setTrackInactiveTintList(colorStateList0);
        ColorStateList colorStateList1 = com.google.android.material.resources.d.a(context0, typedArray0, v1);
        if(colorStateList1 == null) {
            colorStateList1 = AppCompatResources.a(context0, color.material_slider_active_track_color);
        }
        this.setTrackActiveTintList(colorStateList1);
        ColorStateList colorStateList2 = com.google.android.material.resources.d.a(context0, typedArray0, styleable.Slider_thumbColor);
        this.i9.p0(colorStateList2);
        if(typedArray0.hasValue(styleable.Slider_thumbStrokeColor)) {
            this.setThumbStrokeColor(com.google.android.material.resources.d.a(context0, typedArray0, 14));
        }
        this.setThumbStrokeWidth(typedArray0.getDimension(styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = com.google.android.material.resources.d.a(context0, typedArray0, styleable.Slider_haloColor);
        if(colorStateList3 == null) {
            colorStateList3 = AppCompatResources.a(context0, color.material_slider_halo_color);
        }
        this.setHaloTintList(colorStateList3);
        this.T8 = typedArray0.getBoolean(styleable.Slider_tickVisible, true);
        int v3 = styleable.Slider_tickColor;
        boolean z1 = typedArray0.hasValue(v3);
        int v4 = z1 ? 18 : styleable.Slider_tickColorInactive;
        if(!z1) {
            v3 = styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = com.google.android.material.resources.d.a(context0, typedArray0, v4);
        if(colorStateList4 == null) {
            colorStateList4 = AppCompatResources.a(context0, color.material_slider_inactive_tick_marks_color);
        }
        this.setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = com.google.android.material.resources.d.a(context0, typedArray0, v3);
        if(colorStateList5 == null) {
            colorStateList5 = AppCompatResources.a(context0, color.material_slider_active_tick_marks_color);
        }
        this.setTickActiveTintList(colorStateList5);
        this.setThumbTrackGapSize(typedArray0.getDimensionPixelSize(styleable.Slider_thumbTrackGapSize, 0));
        this.setTrackStopIndicatorSize(typedArray0.getDimensionPixelSize(styleable.Slider_trackStopIndicatorSize, 0));
        this.setTrackInsideCornerSize(typedArray0.getDimensionPixelSize(styleable.Slider_trackInsideCornerSize, 0));
        int v5 = typedArray0.getDimensionPixelSize(styleable.Slider_thumbRadius, 0);
        int v6 = typedArray0.getDimensionPixelSize(styleable.Slider_thumbWidth, v5 * 2);
        int v7 = typedArray0.getDimensionPixelSize(styleable.Slider_thumbHeight, v5 * 2);
        this.setThumbWidth(v6);
        this.setThumbHeight(v7);
        this.setHaloRadius(typedArray0.getDimensionPixelSize(styleable.Slider_haloRadius, 0));
        this.setThumbElevation(typedArray0.getDimension(styleable.Slider_thumbElevation, 0.0f));
        this.setTrackHeight(typedArray0.getDimensionPixelSize(styleable.Slider_trackHeight, 0));
        this.setTickActiveRadius(typedArray0.getDimensionPixelSize(styleable.Slider_tickRadiusActive, this.K / 2));
        this.setTickInactiveRadius(typedArray0.getDimensionPixelSize(styleable.Slider_tickRadiusInactive, this.K / 2));
        this.setLabelBehavior(typedArray0.getInt(styleable.Slider_labelBehavior, 0));
        if(!typedArray0.getBoolean(styleable.Slider_android_enabled, true)) {
            this.setEnabled(false);
        }
        typedArray0.recycle();
    }

    // 去混淆评级： 低(20)
    private int o() {
        return this.A / 2 + (this.B != 1 && !this.t0() ? 0 : ((com.google.android.material.tooltip.a)this.l.get(0)).getIntrinsicHeight());
    }

    public void o0(@NonNull com.google.android.material.slider.a a0) {
        this.m.remove(a0);
    }

    @Override  // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getViewTreeObserver().addOnScrollChangedListener(this.n9);
        for(Object object0: this.l) {
            this.k(((com.google.android.material.tooltip.a)object0));
        }
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        d baseSlider$d0 = this.j;
        if(baseSlider$d0 != null) {
            this.removeCallbacks(baseSlider$d0);
        }
        this.o = false;
        for(Object object0: this.l) {
            this.t(((com.google.android.material.tooltip.a)object0));
        }
        this.getViewTreeObserver().removeOnScrollChangedListener(this.n9);
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    protected void onDraw(@NonNull Canvas canvas0) {
        if(this.Z8) {
            this.F0();
            this.Z();
        }
        super.onDraw(canvas0);
        int v = this.o();
        float f = (float)(((Float)this.O8.get(0)));
        float f1 = (float)(((Float)this.O8.get(this.O8.size() - 1)));
        if(f1 < this.N8 || this.O8.size() > 1 && f > this.M8) {
            this.y(canvas0, this.W8, v);
        }
        if(f1 > this.M8) {
            this.x(canvas0, this.W8, v);
        }
        this.c0(canvas0);
        this.b0(canvas0, v);
        if((this.Q || this.isFocused()) && this.isEnabled()) {
            this.a0(canvas0, this.W8, v);
        }
        this.B0();
        this.A(canvas0, this.W8, v);
    }

    @Override  // android.view.View
    protected void onFocusChanged(boolean z, int v, @Nullable Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(!z) {
            this.P8 = -1;
            this.h.o(this.Q8);
            return;
        }
        this.D(v);
        this.h.X(this.Q8);
    }

    @Override  // android.view.View
    public boolean onKeyDown(int v, @NonNull KeyEvent keyEvent0) {
        if(!this.isEnabled()) {
            return super.onKeyDown(v, keyEvent0);
        }
        if(this.O8.size() == 1) {
            this.P8 = 0;
        }
        if(this.P8 == -1) {
            Boolean boolean0 = this.i0(v, keyEvent0);
            return boolean0 == null ? super.onKeyDown(v, keyEvent0) : boolean0.booleanValue();
        }
        this.Y8 |= keyEvent0.isLongPress();
        Float float0 = this.l(v);
        if(float0 != null) {
            if(this.v0(((float)(((Float)this.O8.get(this.P8)))) + ((float)float0))) {
                this.A0();
                this.postInvalidate();
            }
            return true;
        }
        switch(v) {
            case 61: {
                if(keyEvent0.hasNoModifiers()) {
                    return this.f0(1);
                }
                return keyEvent0.isShiftPressed() ? this.f0(-1) : false;
            }
            case 23: 
            case 66: {
                this.P8 = -1;
                this.postInvalidate();
                return true;
            }
            default: {
                return super.onKeyDown(v, keyEvent0);
            }
        }
    }

    @Override  // android.view.View
    public boolean onKeyUp(int v, @NonNull KeyEvent keyEvent0) {
        this.Y8 = false;
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(this.A + (this.B != 1 && !this.t0() ? 0 : ((com.google.android.material.tooltip.a)this.l.get(0)).getIntrinsicHeight()), 0x40000000));
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(((SliderState)parcelable0).getSuperState());
        this.M8 = ((SliderState)parcelable0).a;
        this.N8 = ((SliderState)parcelable0).b;
        this.s0(((SliderState)parcelable0).c);
        this.R8 = ((SliderState)parcelable0).d;
        if(((SliderState)parcelable0).e) {
            this.requestFocus();
        }
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SliderState(super.onSaveInstanceState());
        parcelable0.a = this.M8;
        parcelable0.b = this.N8;
        parcelable0.c = new ArrayList(this.O8);
        parcelable0.d = this.R8;
        parcelable0.e = this.hasFocus();
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        this.D0(v);
        this.A0();
    }

    @Override  // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        if(!this.isEnabled()) {
            return false;
        }
        float f = motionEvent0.getX();
        this.l9 = Math.min(1.0f, Math.max(0.0f, (f - ((float)this.D)) / ((float)this.W8)));
        int v = motionEvent0.getActionMasked();
        switch(v) {
            case 0: {
                this.N = f;
                if(!this.U(motionEvent0)) {
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    if(this.l0()) {
                        this.requestFocus();
                        this.Q = true;
                        this.y0();
                        this.A0();
                        if(this.N()) {
                            this.I = this.E;
                            this.J = this.H;
                            int v1 = Math.round(((float)this.E) * 0.5f);
                            int v2 = this.E - v1;
                            this.setThumbWidth(v1);
                            this.setThumbTrackGapSize(this.H - v2 / 2);
                        }
                        this.invalidate();
                        this.j0();
                    }
                }
                break;
            }
            case 1: {
            label_26:
                this.Q = false;
                if(this.O != null && this.O.getActionMasked() == 0 && Math.abs(this.O.getX() - motionEvent0.getX()) <= ((float)this.r) && Math.abs(this.O.getY() - motionEvent0.getY()) <= ((float)this.r) && this.l0()) {
                    this.j0();
                }
                if(this.P8 != -1) {
                    this.y0();
                    this.A0();
                    if(this.N()) {
                        int v3 = this.I;
                        if(v3 != -1 && this.J != -1) {
                            this.setThumbWidth(v3);
                            this.setThumbTrackGapSize(this.J);
                        }
                    }
                    this.P8 = -1;
                    this.k0();
                }
                this.invalidate();
                break;
            }
            case 2: {
                if(!this.Q) {
                    if(this.U(motionEvent0) && Math.abs(f - this.N) < ((float)this.r)) {
                        return false;
                    }
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    this.j0();
                }
                if(this.l0()) {
                    this.Q = true;
                    this.y0();
                    this.A0();
                    this.invalidate();
                }
                break;
            }
            default: {
                if(v == 3) {
                    goto label_26;
                }
            }
        }
        this.setPressed(this.Q);
        this.O = MotionEvent.obtain(motionEvent0);
        return true;
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(@NonNull View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(v != 0) {
            K k0 = M.m(this);
            if(k0 == null) {
                return;
            }
            for(Object object0: this.l) {
                k0.a(((com.google.android.material.tooltip.a)object0));
            }
        }
    }

    public void p() {
        this.m.clear();
    }

    public void p0(@NonNull com.google.android.material.slider.b b0) {
        this.n.remove(b0);
    }

    public void q() {
        this.n.clear();
    }

    private void q0(int v) {
        d baseSlider$d0 = this.j;
        if(baseSlider$d0 == null) {
            this.j = new d(this, null);
        }
        else {
            this.removeCallbacks(baseSlider$d0);
        }
        this.j.a(v);
        this.postDelayed(this.j, 200L);
    }

    private ValueAnimator r(boolean z) {
        class com.google.android.material.slider.BaseSlider.a implements ValueAnimator.AnimatorUpdateListener {
            final BaseSlider a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                for(Object object0: BaseSlider.this.l) {
                    ((com.google.android.material.tooltip.a)object0).m1(f);
                }
                ViewCompat.v1(BaseSlider.this);
            }
        }

        TimeInterpolator timeInterpolator0;
        int v;
        float f = 1.0f;
        float f1 = BaseSlider.H((z ? this.q : this.p), (z ? 0.0f : 1.0f));
        if(!z) {
            f = 0.0f;
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{f1, f});
        if(z) {
            v = j.f(this.getContext(), BaseSlider.H9, 83);
            timeInterpolator0 = j.g(this.getContext(), BaseSlider.J9, com.google.android.material.animation.b.e);
        }
        else {
            v = j.f(this.getContext(), BaseSlider.I9, 0x75);
            timeInterpolator0 = j.g(this.getContext(), BaseSlider.K9, com.google.android.material.animation.b.c);
        }
        valueAnimator0.setDuration(((long)v));
        valueAnimator0.setInterpolator(timeInterpolator0);
        valueAnimator0.addUpdateListener(new com.google.android.material.slider.BaseSlider.a(this));
        return valueAnimator0;
    }

    private void r0(com.google.android.material.tooltip.a a0, float f) {
        a0.n1(this.F(f));
        this.m0(a0, f);
        M.m(this).b(a0);
    }

    private void s() {
        int v;
        if(this.l.size() > this.O8.size()) {
            List list0 = this.l.subList(this.O8.size(), this.l.size());
            for(Object object0: list0) {
                com.google.android.material.tooltip.a a0 = (com.google.android.material.tooltip.a)object0;
                if(ViewCompat.T0(this)) {
                    this.t(a0);
                }
            }
            list0.clear();
        }
        while(true) {
            v = 0;
            if(this.l.size() >= this.O8.size()) {
                break;
            }
            com.google.android.material.tooltip.a a1 = com.google.android.material.tooltip.a.W0(this.getContext(), null, 0, this.k);
            this.l.add(a1);
            if(ViewCompat.T0(this)) {
                this.k(a1);
            }
        }
        if(this.l.size() != 1) {
            v = 1;
        }
        for(Object object1: this.l) {
            ((com.google.android.material.tooltip.a)object1).J0(((float)v));
        }
    }

    private void s0(@NonNull ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList0);
        if(this.O8.size() == arrayList0.size() && this.O8.equals(arrayList0)) {
            return;
        }
        this.O8 = arrayList0;
        this.Z8 = true;
        this.Q8 = 0;
        this.A0();
        this.s();
        this.w();
        this.postInvalidate();
    }

    protected void setActiveThumbIndex(int v) {
        this.P8 = v;
    }

    void setCustomThumbDrawable(@DrawableRes int v) {
        this.setCustomThumbDrawable(this.getResources().getDrawable(v));
    }

    void setCustomThumbDrawable(@NonNull Drawable drawable0) {
        this.j9 = this.P(drawable0);
        this.k9.clear();
        this.postInvalidate();
    }

    void setCustomThumbDrawablesForValues(@DrawableRes @NonNull int[] arr_v) {
        Drawable[] arr_drawable = new Drawable[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_drawable[v] = this.getResources().getDrawable(arr_v[v]);
        }
        this.setCustomThumbDrawablesForValues(arr_drawable);
    }

    void setCustomThumbDrawablesForValues(@NonNull Drawable[] arr_drawable) {
        this.j9 = null;
        this.k9 = new ArrayList();
        for(int v = 0; v < arr_drawable.length; ++v) {
            this.k9.add(this.P(arr_drawable[v]));
        }
        this.postInvalidate();
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.setLayerType((z ? 0 : 2), null);
    }

    public void setFocusedThumbIndex(int v) {
        if(v < 0 || v >= this.O8.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.Q8 = v;
        this.h.X(v);
        this.postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = 0L) @Px int v) {
        if(v == this.G) {
            return;
        }
        this.G = v;
        Drawable drawable0 = this.getBackground();
        if(!this.u0() && drawable0 instanceof RippleDrawable) {
            com.google.android.material.drawable.f.m(((RippleDrawable)drawable0), this.G);
            return;
        }
        this.postInvalidate();
    }

    public void setHaloRadiusResource(@DimenRes int v) {
        this.setHaloRadius(this.getResources().getDimensionPixelSize(v));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.a9)) {
            return;
        }
        this.a9 = colorStateList0;
        Drawable drawable0 = this.getBackground();
        if(!this.u0() && drawable0 instanceof RippleDrawable) {
            ((RippleDrawable)drawable0).setColor(colorStateList0);
            return;
        }
        int v = this.J(colorStateList0);
        this.d.setColor(v);
        this.d.setAlpha(0x3F);
        this.invalidate();
    }

    public void setLabelBehavior(int v) {
        if(this.B != v) {
            this.B = v;
            this.requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable com.google.android.material.slider.e e0) {
        this.P = e0;
    }

    protected void setSeparationUnit(int v) {
        this.m9 = v;
        this.Z8 = true;
        this.postInvalidate();
    }

    public void setStepSize(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", f, this.M8, this.N8));
        }
        if(this.R8 != f) {
            this.R8 = f;
            this.Z8 = true;
            this.postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.i9.o0(f);
    }

    public void setThumbElevationResource(@DimenRes int v) {
        this.setThumbElevation(this.getResources().getDimension(v));
    }

    public void setThumbHeight(@IntRange(from = 0L) @Px int v) {
        if(v == this.F) {
            return;
        }
        this.F = v;
        this.i9.setBounds(0, 0, this.E, v);
        Drawable drawable0 = this.j9;
        if(drawable0 != null) {
            this.j(drawable0);
        }
        for(Object object0: this.k9) {
            this.j(((Drawable)object0));
        }
        this.E0();
    }

    public void setThumbHeightResource(@DimenRes int v) {
        this.setThumbHeight(this.getResources().getDimensionPixelSize(v));
    }

    public void setThumbRadius(@IntRange(from = 0L) @Px int v) {
        this.setThumbWidth(v * 2);
        this.setThumbHeight(v * 2);
    }

    public void setThumbRadiusResource(@DimenRes int v) {
        this.setThumbRadius(this.getResources().getDimensionPixelSize(v));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList0) {
        this.i9.G0(colorStateList0);
        this.postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int v) {
        if(v != 0) {
            this.setThumbStrokeColor(AppCompatResources.a(this.getContext(), v));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.i9.J0(f);
        this.postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int v) {
        if(v != 0) {
            this.setThumbStrokeWidth(this.getResources().getDimension(v));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.i9.z())) {
            return;
        }
        this.i9.p0(colorStateList0);
        this.invalidate();
    }

    public void setThumbTrackGapSize(@Px int v) {
        if(this.H == v) {
            return;
        }
        this.H = v;
        this.invalidate();
    }

    public void setThumbWidth(@IntRange(from = 0L) @Px int v) {
        if(v == this.E) {
            return;
        }
        this.E = v;
        p p0 = p.a().q(0, ((float)this.E) / 2.0f).m();
        this.i9.setShapeAppearanceModel(p0);
        this.i9.setBounds(0, 0, this.E, this.F);
        Drawable drawable0 = this.j9;
        if(drawable0 != null) {
            this.j(drawable0);
        }
        for(Object object0: this.k9) {
            this.j(((Drawable)object0));
        }
        this.E0();
    }

    public void setThumbWidthResource(@DimenRes int v) {
        this.setThumbWidth(this.getResources().getDimensionPixelSize(v));
    }

    public void setTickActiveRadius(@IntRange(from = 0L) @Px int v) {
        if(this.U8 != v) {
            this.U8 = v;
            this.f.setStrokeWidth(((float)(v * 2)));
            this.E0();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.b9)) {
            return;
        }
        this.b9 = colorStateList0;
        int v = this.J(colorStateList0);
        this.f.setColor(v);
        this.invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = 0L) @Px int v) {
        if(this.V8 != v) {
            this.V8 = v;
            this.e.setStrokeWidth(((float)(v * 2)));
            this.E0();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.c9)) {
            return;
        }
        this.c9 = colorStateList0;
        int v = this.J(colorStateList0);
        this.e.setColor(v);
        this.invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList0) {
        this.setTickInactiveTintList(colorStateList0);
        this.setTickActiveTintList(colorStateList0);
    }

    public void setTickVisible(boolean z) {
        if(this.T8 != z) {
            this.T8 = z;
            this.postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.d9)) {
            return;
        }
        this.d9 = colorStateList0;
        int v = this.J(colorStateList0);
        this.b.setColor(v);
        int v1 = this.J(this.d9);
        this.g.setColor(v1);
        this.invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0L) @Px int v) {
        if(this.C != v) {
            this.C = v;
            this.Q();
            this.E0();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.e9)) {
            return;
        }
        this.e9 = colorStateList0;
        int v = this.J(colorStateList0);
        this.a.setColor(v);
        this.invalidate();
    }

    public void setTrackInsideCornerSize(@Px int v) {
        if(this.L == v) {
            return;
        }
        this.L = v;
        this.invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int v) {
        if(this.K == v) {
            return;
        }
        this.K = v;
        this.g.setStrokeWidth(((float)v));
        this.invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList0) {
        this.setTrackInactiveTintList(colorStateList0);
        this.setTrackActiveTintList(colorStateList0);
    }

    public void setValueFrom(float f) {
        this.M8 = f;
        this.Z8 = true;
        this.postInvalidate();
    }

    public void setValueTo(float f) {
        this.N8 = f;
        this.Z8 = true;
        this.postInvalidate();
    }

    void setValues(@NonNull List list0) {
        this.s0(new ArrayList(list0));
    }

    void setValues(@NonNull Float[] arr_float) {
        ArrayList arrayList0 = new ArrayList();
        Collections.addAll(arrayList0, arr_float);
        this.s0(arrayList0);
    }

    private void t(com.google.android.material.tooltip.a a0) {
        K k0 = M.m(this);
        if(k0 != null) {
            k0.a(a0);
            a0.Y0(M.l(this));
        }
    }

    private boolean t0() {
        return this.B == 3;
    }

    private float u(float f) {
        return f == 0.0f ? 0.0f : (f - ((float)this.D)) / ((float)this.W8) * (this.M8 - this.N8) + this.M8;
    }

    // 去混淆评级： 低(20)
    private boolean u0() {
        return this.X8 || !(this.getBackground() instanceof RippleDrawable);
    }

    private void v(int v) {
        for(Object object0: this.m) {
            ((com.google.android.material.slider.a)object0).a(this, ((float)(((Float)this.O8.get(v)))), true);
        }
        if(this.i != null && this.i.isEnabled()) {
            this.q0(v);
        }
    }

    private boolean v0(float f) {
        return this.x0(this.P8, f);
    }

    private void w() {
        for(Object object0: this.m) {
            com.google.android.material.slider.a a0 = (com.google.android.material.slider.a)object0;
            for(Object object1: this.O8) {
                a0.a(this, ((float)(((Float)object1))), false);
            }
        }
    }

    private double w0(float f) {
        float f1 = this.R8;
        if(f1 > 0.0f) {
            int v = (int)((this.N8 - this.M8) / f1);
            return ((double)Math.round(f * ((float)v))) / ((double)v);
        }
        return (double)f;
    }

    private void x(@NonNull Canvas canvas0, int v, int v1) {
        float[] arr_f = this.G();
        int v2 = this.D;
        float f = ((float)v2) + arr_f[1] * ((float)v);
        float f1 = ((float)v2) + arr_f[0] * ((float)v);
        if(this.N()) {
            f baseSlider$f0 = f.d;
            if(this.O8.size() == 1) {
                baseSlider$f0 = this.V() ? f.c : f.b;
            }
            for(int v3 = 0; v3 < this.O8.size(); ++v3) {
                if(this.O8.size() > 1) {
                    if(v3 > 0) {
                        f1 = this.M0(((float)(((Float)this.O8.get(v3 - 1)))));
                    }
                    float f2 = this.M0(((float)(((Float)this.O8.get(v3)))));
                    if(this.V()) {
                        f = f1;
                        f1 = f2;
                    }
                    else {
                        f = f2;
                    }
                }
                switch(baseSlider$f0) {
                    case 1: {
                        f1 += (float)this.H;
                        f -= (float)this.H;
                        break;
                    }
                    case 2: {
                        f1 -= ((float)this.C) / 2.0f;
                        f -= (float)this.H;
                        break;
                    }
                    case 3: {
                        f1 += (float)this.H;
                        f += ((float)this.C) / 2.0f;
                    }
                }
                if(f1 < f) {
                    this.g9.set(f1, ((float)v1) - ((float)this.C) / 2.0f, f, ((float)v1) + ((float)this.C) / 2.0f);
                    this.C0(canvas0, this.b, this.g9, baseSlider$f0);
                }
            }
            return;
        }
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeCap(Paint.Cap.ROUND);
        canvas0.drawLine(f1, ((float)v1), f, ((float)v1), this.b);
    }

    private boolean x0(int v, float f) {
        this.Q8 = v;
        if(((double)Math.abs(f - ((float)(((Float)this.O8.get(v)))))) < 0.0001) {
            return false;
        }
        Float float0 = this.I(v, f);
        this.O8.set(v, float0);
        this.v(v);
        return true;
    }

    private void y(@NonNull Canvas canvas0, int v, int v1) {
        float[] arr_f = this.G();
        int v2 = this.D;
        float f = ((float)v2) + arr_f[1] * ((float)v);
        if(f < ((float)(v2 + v))) {
            if(this.N()) {
                this.g9.set(f + ((float)this.H), ((float)v1) - ((float)this.C) / 2.0f, ((float)(this.D + v)) + ((float)this.C) / 2.0f, ((float)v1) + ((float)this.C) / 2.0f);
                this.C0(canvas0, this.a, this.g9, f.c);
            }
            else {
                this.a.setStyle(Paint.Style.STROKE);
                this.a.setStrokeCap(Paint.Cap.ROUND);
                canvas0.drawLine(f, ((float)v1), ((float)(this.D + v)), ((float)v1), this.a);
            }
        }
        int v3 = this.D;
        float f1 = ((float)v3) + arr_f[0] * ((float)v);
        if(f1 > ((float)v3)) {
            if(this.N()) {
                this.g9.set(((float)this.D) - ((float)this.C) / 2.0f, ((float)v1) - ((float)this.C) / 2.0f, f1 - ((float)this.H), ((float)v1) + ((float)this.C) / 2.0f);
                this.C0(canvas0, this.a, this.g9, f.b);
                return;
            }
            this.a.setStyle(Paint.Style.STROKE);
            this.a.setStrokeCap(Paint.Cap.ROUND);
            canvas0.drawLine(((float)this.D), ((float)v1), f1, ((float)v1), this.a);
        }
    }

    private boolean y0() {
        return this.v0(this.L());
    }

    private void z(@NonNull Canvas canvas0, int v, int v1, float f, @NonNull Drawable drawable0) {
        canvas0.save();
        canvas0.translate(((float)(this.D + ((int)(this.h0(f) * ((float)v))))) - ((float)drawable0.getBounds().width()) / 2.0f, ((float)v1) - ((float)drawable0.getBounds().height()) / 2.0f);
        drawable0.draw(canvas0);
        canvas0.restore();
    }

    void z0(int v, Rect rect0) {
        int v1 = this.D + ((int)(this.h0(((float)(((Float)this.getValues().get(v))))) * ((float)this.W8)));
        int v2 = this.o();
        int v3 = Math.max(this.E / 2, this.y / 2);
        int v4 = Math.max(this.F / 2, this.y / 2);
        rect0.set(v1 - v3, v2 - v4, v1 + v3, v2 + v4);
    }
}

