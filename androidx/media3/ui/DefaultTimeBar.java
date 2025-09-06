package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Collections;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

@UnstableApi
public class DefaultTimeBar extends View implements TimeBar {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    public static final int M8 = 4;
    @Nullable
    private long[] N;
    public static final int N8 = 12;
    @Nullable
    private boolean[] O;
    public static final int O8 = 0;
    public static final int P = 4;
    public static final int P8 = 16;
    public static final int Q = 26;
    public static final int Q8 = -1;
    public static final int R8 = 0x33FFFFFF;
    public static final int S8 = 0xCCFFFFFF;
    public static final int T8 = -1;
    public static final int U8 = 0xB2FFFF00;
    public static final int V8 = 0x33FFFF00;
    public static final int W8 = 0;
    public static final int X8 = 1;
    private static final int Y8 = -50;
    private static final int Z8 = 3;
    private final Rect a;
    private static final long a9 = 1000L;
    private final Rect b;
    private static final int b9 = 20;
    private final Rect c;
    private static final float c9 = 1.0f;
    private final Rect d;
    private static final float d9 = 0.0f;
    private final Paint e;
    private static final String e9 = "android.widget.SeekBar";
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    @Nullable
    private final Drawable k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final StringBuilder u;
    private final Formatter v;
    private final Runnable w;
    private final CopyOnWriteArraySet x;
    private final Point y;
    private final float z;

    public DefaultTimeBar(Context context0) {
        this(context0, null);
    }

    public DefaultTimeBar(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public DefaultTimeBar(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, attributeSet0);
    }

    public DefaultTimeBar(Context context0, @Nullable AttributeSet attributeSet0, int v, @Nullable AttributeSet attributeSet1) {
        this(context0, attributeSet0, v, attributeSet1, 0);
    }

    public DefaultTimeBar(Context context0, @Nullable AttributeSet attributeSet0, int v, @Nullable AttributeSet attributeSet1, int v1) {
        super(context0, attributeSet0, v);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint0 = new Paint();
        this.e = paint0;
        Paint paint1 = new Paint();
        this.f = paint1;
        Paint paint2 = new Paint();
        this.g = paint2;
        Paint paint3 = new Paint();
        this.h = paint3;
        Paint paint4 = new Paint();
        this.i = paint4;
        Paint paint5 = new Paint();
        this.j = paint5;
        paint5.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet();
        this.y = new Point();
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        this.z = displayMetrics0.density;
        this.t = (int)(-50.0f * displayMetrics0.density + 0.5f);
        int v2 = (int)(4.0f * displayMetrics0.density + 0.5f);
        int v3 = (int)(26.0f * displayMetrics0.density + 0.5f);
        int v4 = (int)(4.0f * displayMetrics0.density + 0.5f);
        int v5 = (int)(12.0f * displayMetrics0.density + 0.5f);
        int v6 = (int)(0.0f * displayMetrics0.density + 0.5f);
        int v7 = (int)(16.0f * displayMetrics0.density + 0.5f);
        if(attributeSet1 == null) {
            this.l = v2;
            this.m = v3;
            this.n = 0;
            this.o = v4;
            this.p = v5;
            this.q = v6;
            this.r = v7;
            paint0.setColor(-1);
            paint5.setColor(-1);
            paint1.setColor(0xCCFFFFFF);
            paint2.setColor(0x33FFFFFF);
            paint3.setColor(0xB2FFFF00);
            paint4.setColor(0x33FFFF00);
            this.k = null;
        }
        else {
            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet1, styleable.DefaultTimeBar, v, v1);
            try {
                Drawable drawable0 = typedArray0.getDrawable(styleable.DefaultTimeBar_scrubber_drawable);
                this.k = drawable0;
                if(drawable0 != null) {
                    this.r(drawable0);
                    v3 = Math.max(drawable0.getMinimumHeight(), v3);
                }
                this.l = typedArray0.getDimensionPixelSize(styleable.DefaultTimeBar_bar_height, v2);
                this.m = typedArray0.getDimensionPixelSize(styleable.DefaultTimeBar_touch_target_height, v3);
                this.n = typedArray0.getInt(styleable.DefaultTimeBar_bar_gravity, 0);
                this.o = typedArray0.getDimensionPixelSize(styleable.DefaultTimeBar_ad_marker_width, v4);
                this.p = typedArray0.getDimensionPixelSize(styleable.DefaultTimeBar_scrubber_enabled_size, v5);
                this.q = typedArray0.getDimensionPixelSize(styleable.DefaultTimeBar_scrubber_disabled_size, v6);
                this.r = typedArray0.getDimensionPixelSize(styleable.DefaultTimeBar_scrubber_dragged_size, v7);
                int v9 = typedArray0.getInt(styleable.DefaultTimeBar_played_color, -1);
                int v10 = typedArray0.getInt(styleable.DefaultTimeBar_scrubber_color, -1);
                int v11 = typedArray0.getInt(styleable.DefaultTimeBar_buffered_color, 0xCCFFFFFF);
                int v12 = typedArray0.getInt(styleable.DefaultTimeBar_unplayed_color, 0x33FFFFFF);
                int v13 = typedArray0.getInt(styleable.DefaultTimeBar_ad_marker_color, 0xB2FFFF00);
                int v14 = typedArray0.getInt(styleable.DefaultTimeBar_played_ad_marker_color, 0x33FFFF00);
                paint0.setColor(v9);
                paint5.setColor(v10);
                paint1.setColor(v11);
                paint2.setColor(v12);
                paint3.setColor(v13);
                paint4.setColor(v14);
            }
            finally {
                typedArray0.recycle();
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        this.u = stringBuilder0;
        this.v = new Formatter(stringBuilder0, Locale.getDefault());
        this.w = () -> this.x(false);
        Drawable drawable1 = this.k;
        this.s = drawable1 == null ? (Math.max(this.q, Math.max(this.p, this.r)) + 1) / 2 : (drawable1.getMinimumWidth() + 1) / 2;
        this.F = 1.0f;
        ValueAnimator valueAnimator0 = new ValueAnimator();
        this.E = valueAnimator0;
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            this.F = (float)(((Float)valueAnimator0.getAnimatedValue()));
            this.invalidate(this.a);
        });
        this.J = 0x8000000000000001L;
        this.B = 0x8000000000000001L;
        this.A = 20;
        this.setFocusable(true);
        if(this.getImportantForAccessibility() == 0) {
            this.setImportantForAccessibility(1);
        }
    }

    private void A(long v) {
        if(this.I == v) {
            return;
        }
        this.I = v;
        for(Object object0: this.x) {
            ((OnScrubListener)object0).G(this, v);
        }
    }

    @Override  // androidx.media3.ui.TimeBar
    public void a(OnScrubListener timeBar$OnScrubListener0) {
        this.x.remove(timeBar$OnScrubListener0);
    }

    @Override  // androidx.media3.ui.TimeBar
    public void b(@Nullable long[] arr_v, @Nullable boolean[] arr_z, int v) {
        Assertions.a(v == 0 || arr_v != null && arr_z != null);
        this.M = v;
        this.N = arr_v;
        this.O = arr_z;
        this.y();
    }

    @Override  // androidx.media3.ui.TimeBar
    public void c(OnScrubListener timeBar$OnScrubListener0) {
        Assertions.g(timeBar$OnScrubListener0);
        this.x.add(timeBar$OnScrubListener0);
    }

    @Override  // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.z();
    }

    private static int f(float f, int v) [...] // Inlined contents

    private void g(Canvas canvas0) {
        int v2;
        if(this.J <= 0L) {
            return;
        }
        int v = Util.w(this.d.right, this.d.left, this.b.right);
        int v1 = this.d.centerY();
        Drawable drawable0 = this.k;
        if(drawable0 == null) {
            if(this.H || this.isFocused()) {
                v2 = this.r;
            }
            else if(this.isEnabled()) {
                v2 = this.p;
            }
            else {
                v2 = this.q;
            }
            canvas0.drawCircle(((float)v), ((float)v1), ((float)(((int)(((float)v2) * this.F / 2.0f)))), this.j);
            return;
        }
        int v3 = (int)(((float)drawable0.getIntrinsicWidth()) * this.F);
        int v4 = ((int)(((float)this.k.getIntrinsicHeight()) * this.F)) / 2;
        this.k.setBounds(v - v3 / 2, v1 - v4, v + v3 / 2, v1 + v4);
        this.k.draw(canvas0);
    }

    private long getPositionIncrement() {
        long v = this.B;
        if(v == 0x8000000000000001L) {
            return this.J == 0x8000000000000001L ? 0L : this.J / ((long)this.A);
        }
        return v;
    }

    @Override  // androidx.media3.ui.TimeBar
    public long getPreferredUpdateDelay() {
        int v = (int)(((float)this.b.width()) / this.z);
        if(v != 0) {
            return this.J == 0L || this.J == 0x8000000000000001L ? 0x7FFFFFFFFFFFFFFFL : this.J / ((long)v);
        }
        return 0x7FFFFFFFFFFFFFFFL;
    }

    private String getProgressText() {
        return Util.H0(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        return this.b.width() <= 0 || this.J == 0x8000000000000001L ? 0L : ((long)this.d.width()) * this.J / ((long)this.b.width());
    }

    private void h(Canvas canvas0) {
        int v = this.b.height();
        int v1 = this.b.centerY() - v / 2;
        int v2 = v + v1;
        if(this.J <= 0L) {
            canvas0.drawRect(((float)this.b.left), ((float)v1), ((float)this.b.right), ((float)v2), this.g);
            return;
        }
        int v3 = this.c.left;
        int v4 = this.c.right;
        int v5 = Math.max(Math.max(this.b.left, v4), this.d.right);
        int v6 = this.b.right;
        if(v5 < v6) {
            canvas0.drawRect(((float)v5), ((float)v1), ((float)v6), ((float)v2), this.g);
        }
        int v7 = Math.max(v3, this.d.right);
        if(v4 > v7) {
            canvas0.drawRect(((float)v7), ((float)v1), ((float)v4), ((float)v2), this.f);
        }
        if(this.d.width() > 0) {
            canvas0.drawRect(((float)this.d.left), ((float)v1), ((float)this.d.right), ((float)v2), this.e);
        }
        if(this.M == 0) {
            return;
        }
        long[] arr_v = (long[])Assertions.g(this.N);
        boolean[] arr_z = (boolean[])Assertions.g(this.O);
        int v8 = this.o / 2;
        for(int v9 = 0; v9 < this.M; ++v9) {
            long v10 = Util.x(arr_v[v9], 0L, this.J);
            int v11 = ((int)(((long)this.b.width()) * v10 / this.J)) - v8;
            int v12 = this.b.left + Math.min(this.b.width() - this.o, Math.max(0, v11));
            canvas0.drawRect(((float)v12), ((float)v1), ((float)(v12 + this.o)), ((float)v2), (arr_z[v9] ? this.i : this.h));
        }
    }

    public void i(long v) {
        if(this.E.isStarted()) {
            this.E.cancel();
        }
        this.E.setFloatValues(new float[]{this.F, 0.0f});
        this.E.setDuration(v);
        this.E.start();
    }

    public void j(boolean z) {
        if(this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = z;
        this.F = 0.0f;
        this.invalidate(this.a);
    }

    @Override  // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
    }

    private boolean k(float f, float f1) {
        return this.a.contains(((int)f), ((int)f1));
    }

    // 检测为 Lambda 实现
    private void l() [...]

    // 检测为 Lambda 实现
    private void m(ValueAnimator valueAnimator0) [...]

    private void n(float f) {
        this.d.right = Util.w(((int)f), this.b.left, this.b.right);
    }

    private static int o(float f, int v) [...] // Inlined contents

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        canvas0.save();
        this.h(canvas0);
        this.g(canvas0);
        canvas0.restore();
    }

    @Override  // android.view.View
    protected void onFocusChanged(boolean z, int v, @Nullable Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(this.H && !z) {
            this.x(false);
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        if(accessibilityEvent0.getEventType() == 4) {
            accessibilityEvent0.getText().add(this.getProgressText());
        }
        accessibilityEvent0.setClassName("android.widget.SeekBar");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo0.setContentDescription(this.getProgressText());
        if(this.J <= 0L) {
            return;
        }
        if(Util.a >= 21) {
            accessibilityNodeInfo0.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo0.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo0.addAction(0x1000);
        accessibilityNodeInfo0.addAction(0x2000);
    }

    @Override  // android.view.View
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(this.isEnabled()) {
            long v1 = this.getPositionIncrement();
            if(v == 66) {
            label_10:
                if(this.H) {
                    this.x(false);
                    return true;
                }
            }
            else {
                switch(v) {
                    case 21: {
                        v1 = -v1;
                        goto label_6;
                    }
                    case 22: {
                    label_6:
                        if(this.q(v1)) {
                            this.removeCallbacks(this.w);
                            this.postDelayed(this.w, 1000L);
                            return true;
                        }
                        break;
                    }
                    case 23: {
                        goto label_10;
                    }
                    default: {
                        return super.onKeyDown(v, keyEvent0);
                    }
                }
            }
        }
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v10;
        int v9;
        int v4 = v2 - v;
        int v5 = v3 - v1;
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingRight();
        int v8 = this.G ? 0 : this.s;
        if(this.n == 1) {
            v9 = v5 - this.getPaddingBottom() - this.m;
            v10 = v5 - this.getPaddingBottom() - this.l - Math.max(v8 - this.l / 2, 0);
        }
        else {
            v9 = (v5 - this.m) / 2;
            v10 = (v5 - this.l) / 2;
        }
        this.a.set(v6, v9, v4 - v7, this.m + v9);
        this.b.set(this.a.left + v8, v10, this.a.right - v8, this.l + v10);
        if(Util.a >= 29) {
            this.t(v4, v5);
        }
        this.y();
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v1);
        int v3 = View.MeasureSpec.getSize(v1);
        if(v2 == 0) {
            v3 = this.m;
        }
        else if(v2 != 0x40000000) {
            v3 = Math.min(this.m, v3);
        }
        this.setMeasuredDimension(View.MeasureSpec.getSize(v), v3);
        this.z();
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        if(this.k != null && DefaultTimeBar.s(this.k, v)) {
            this.invalidate();
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = false;
        if(this.isEnabled() && this.J > 0L) {
            Point point0 = this.p(motionEvent0);
            int v = point0.x;
            int v1 = point0.y;
            switch(motionEvent0.getAction()) {
                case 0: {
                    if(this.k(((float)v), ((float)v1))) {
                        this.n(((float)v));
                        this.w(this.getScrubberPosition());
                        this.y();
                        this.invalidate();
                        return true;
                    }
                    break;
                }
                case 2: {
                    if(this.H) {
                        if(v1 < this.t) {
                            this.n(((float)(this.C + (v - this.C) / 3)));
                        }
                        else {
                            this.C = v;
                            this.n(((float)v));
                        }
                        this.A(this.getScrubberPosition());
                        this.y();
                        this.invalidate();
                        return true;
                    }
                    break;
                }
                case 1: 
                case 3: {
                    if(this.H) {
                        if(motionEvent0.getAction() == 3) {
                            z = true;
                        }
                        this.x(z);
                        return true;
                    }
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    private Point p(MotionEvent motionEvent0) {
        int v = (int)motionEvent0.getX();
        int v1 = (int)motionEvent0.getY();
        this.y.set(v, v1);
        return this.y;
    }

    @Override  // android.view.View
    public boolean performAccessibilityAction(int v, @Nullable Bundle bundle0) {
        if(super.performAccessibilityAction(v, bundle0)) {
            return true;
        }
        if(this.J <= 0L) {
            return false;
        }
        switch(v) {
            case 0x1000: {
                if(this.q(this.getPositionIncrement())) {
                    this.x(false);
                }
                break;
            }
            case 0x2000: {
                if(this.q(-this.getPositionIncrement())) {
                    this.x(false);
                }
                break;
            }
            default: {
                return false;
            }
        }
        this.sendAccessibilityEvent(4);
        return true;
    }

    private boolean q(long v) {
        long v1 = this.J;
        if(v1 <= 0L) {
            return false;
        }
        long v2 = this.H ? this.I : this.K;
        long v3 = Util.x(v2 + v, 0L, v1);
        if(v3 == v2) {
            return false;
        }
        if(this.H) {
            this.A(v3);
        }
        else {
            this.w(v3);
        }
        this.y();
        return true;
    }

    private boolean r(Drawable drawable0) {
        return Util.a >= 23 && DefaultTimeBar.s(drawable0, this.getLayoutDirection());
    }

    private static boolean s(Drawable drawable0, int v) {
        return Util.a >= 23 && drawable0.setLayoutDirection(v);
    }

    public void setAdMarkerColor(@ColorInt int v) {
        this.h.setColor(v);
        this.invalidate(this.a);
    }

    public void setBufferedColor(@ColorInt int v) {
        this.f.setColor(v);
        this.invalidate(this.a);
    }

    @Override  // androidx.media3.ui.TimeBar
    public void setBufferedPosition(long v) {
        if(this.L == v) {
            return;
        }
        this.L = v;
        this.y();
    }

    @Override  // androidx.media3.ui.TimeBar
    public void setDuration(long v) {
        if(this.J == v) {
            return;
        }
        this.J = v;
        if(this.H && v == 0x8000000000000001L) {
            this.x(true);
        }
        this.y();
    }

    @Override  // android.view.View, androidx.media3.ui.TimeBar
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if(this.H && !z) {
            this.x(true);
        }
    }

    @Override  // androidx.media3.ui.TimeBar
    public void setKeyCountIncrement(int v) {
        Assertions.a(v > 0);
        this.A = v;
        this.B = 0x8000000000000001L;
    }

    @Override  // androidx.media3.ui.TimeBar
    public void setKeyTimeIncrement(long v) {
        Assertions.a(v > 0L);
        this.A = -1;
        this.B = v;
    }

    public void setPlayedAdMarkerColor(@ColorInt int v) {
        this.i.setColor(v);
        this.invalidate(this.a);
    }

    public void setPlayedColor(@ColorInt int v) {
        this.e.setColor(v);
        this.invalidate(this.a);
    }

    @Override  // androidx.media3.ui.TimeBar
    public void setPosition(long v) {
        if(this.K == v) {
            return;
        }
        this.K = v;
        this.setContentDescription(this.getProgressText());
        this.y();
    }

    public void setScrubberColor(@ColorInt int v) {
        this.j.setColor(v);
        this.invalidate(this.a);
    }

    public void setUnplayedColor(@ColorInt int v) {
        this.g.setColor(v);
        this.invalidate(this.a);
    }

    @RequiresApi(29)
    private void t(int v, int v1) {
        if(this.D != null && this.D.width() == v && this.D.height() == v1) {
            return;
        }
        Rect rect0 = new Rect(0, 0, v, v1);
        this.D = rect0;
        this.setSystemGestureExclusionRects(Collections.singletonList(rect0));
    }

    public void u() {
        if(this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.F = 1.0f;
        this.invalidate(this.a);
    }

    public void v(long v) {
        if(this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.E.setFloatValues(new float[]{this.F, 1.0f});
        this.E.setDuration(v);
        this.E.start();
    }

    private void w(long v) {
        this.I = v;
        this.H = true;
        this.setPressed(true);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(true);
        }
        for(Object object0: this.x) {
            ((OnScrubListener)object0).u(this, v);
        }
    }

    private void x(boolean z) {
        this.removeCallbacks(this.w);
        this.H = false;
        this.setPressed(false);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(false);
        }
        this.invalidate();
        for(Object object0: this.x) {
            ((OnScrubListener)object0).K(this, this.I, z);
        }
    }

    private void y() {
        this.c.set(this.b);
        this.d.set(this.b);
        long v = this.H ? this.I : this.K;
        if(this.J > 0L) {
            long v1 = (long)this.b.width();
            this.c.right = Math.min(this.b.left + ((int)(v1 * this.L / this.J)), this.b.right);
            long v2 = ((long)this.b.width()) * v;
            this.d.right = Math.min(this.b.left + ((int)(v2 / this.J)), this.b.right);
        }
        else {
            this.c.right = this.b.left;
            this.d.right = this.b.left;
        }
        this.invalidate(this.a);
    }

    private void z() {
        if(this.k != null && this.k.isStateful()) {
            int[] arr_v = this.getDrawableState();
            if(this.k.setState(arr_v)) {
                this.invalidate();
            }
        }
    }
}

