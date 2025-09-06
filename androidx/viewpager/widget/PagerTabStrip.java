package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class PagerTabStrip extends PagerTitleStrip {
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean E;
    private float F;
    private float G;
    private int H;
    private static final String I = "PagerTabStrip";
    private static final int J = 3;
    private static final int K = 6;
    private static final int L = 16;
    private static final int M = 0x20;
    private static final int N = 0x40;
    private static final int O = 1;
    private static final int P = 0x20;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private final Paint y;
    private final Rect z;

    public PagerTabStrip(@NonNull Context context0) {
        this(context0, null);
    }

    public PagerTabStrip(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        Paint paint0 = new Paint();
        this.y = paint0;
        this.z = new Rect();
        this.A = 0xFF;
        this.B = false;
        this.C = false;
        this.s = this.n;
        paint0.setColor(this.n);
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        this.t = (int)(3.0f * displayMetrics0.density + 0.5f);
        this.u = (int)(6.0f * displayMetrics0.density + 0.5f);
        this.v = (int)(64.0f * displayMetrics0.density);
        this.x = (int)(16.0f * displayMetrics0.density + 0.5f);
        this.D = (int)(1.0f * displayMetrics0.density + 0.5f);
        this.w = (int)(displayMetrics0.density * 32.0f + 0.5f);
        this.H = ViewConfiguration.get(context0).getScaledTouchSlop();
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        this.setTextSpacing(this.getTextSpacing());
        this.setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new View.OnClickListener() {
            final PagerTabStrip a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                ViewPager viewPager0 = PagerTabStrip.this.a;
                viewPager0.setCurrentItem(viewPager0.getCurrentItem() - 1);
            }
        });
        this.d.setFocusable(true);
        this.d.setOnClickListener(new View.OnClickListener() {
            final PagerTabStrip a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                ViewPager viewPager0 = PagerTabStrip.this.a;
                viewPager0.setCurrentItem(viewPager0.getCurrentItem() + 1);
            }
        });
        if(this.getBackground() == null) {
            this.B = true;
        }
    }

    @Override  // androidx.viewpager.widget.PagerTitleStrip
    void d(int v, float f, boolean z) {
        int v1 = this.getHeight();
        int v2 = this.c.getLeft() - this.x;
        int v3 = this.c.getRight();
        int v4 = v1 - this.t;
        this.z.set(v2, v4, v3 + this.x, v1);
        super.d(v, f, z);
        this.A = (int)(Math.abs(f - 0.5f) * 510.0f);
        int v5 = this.c.getLeft() - this.x;
        int v6 = this.c.getRight();
        this.z.union(v5, v4, v6 + this.x, v1);
        this.invalidate(this.z);
    }

    public boolean getDrawFullUnderline() {
        return this.B;
    }

    @Override  // androidx.viewpager.widget.PagerTitleStrip
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.w);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.s;
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.getHeight();
        int v1 = this.c.getLeft() - this.x;
        int v2 = this.c.getRight() + this.x;
        int v3 = v - this.t;
        this.y.setColor(this.A << 24 | this.s & 0xFFFFFF);
        canvas0.drawRect(((float)v1), ((float)v3), ((float)v2), ((float)v), this.y);
        if(this.B) {
            this.y.setColor(0xFF000000 | this.s);
            canvas0.drawRect(((float)this.getPaddingLeft()), ((float)(v - this.D)), ((float)(this.getWidth() - this.getPaddingRight())), ((float)v), this.y);
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        if(v != 0 && this.E) {
            return false;
        }
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        switch(v) {
            case 0: {
                this.F = f;
                this.G = f1;
                this.E = false;
                return true;
            label_11:
                if(v == 2 && (Math.abs(f - this.F) > ((float)this.H) || Math.abs(f1 - this.G) > ((float)this.H))) {
                    this.E = true;
                    return true;
                }
                break;
            }
            case 1: {
                if(f < ((float)(this.c.getLeft() - this.x))) {
                    this.a.setCurrentItem(this.a.getCurrentItem() - 1);
                    return true;
                }
                if(f > ((float)(this.c.getRight() + this.x))) {
                    this.a.setCurrentItem(this.a.getCurrentItem() + 1);
                    return true;
                }
                break;
            }
            default: {
                goto label_11;
            }
        }
        return true;
    }

    @Override  // android.view.View
    public void setBackgroundColor(@ColorInt int v) {
        super.setBackgroundColor(v);
        if(!this.C) {
            this.B = (v & 0xFF000000) == 0;
        }
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        if(!this.C) {
            this.B = drawable0 == null;
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        if(!this.C) {
            this.B = v == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.B = z;
        this.C = true;
        this.invalidate();
    }

    @Override  // android.view.View
    public void setPadding(int v, int v1, int v2, int v3) {
        int v4 = this.u;
        if(v3 < v4) {
            v3 = v4;
        }
        super.setPadding(v, v1, v2, v3);
    }

    public void setTabIndicatorColor(@ColorInt int v) {
        this.s = v;
        this.y.setColor(v);
        this.invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int v) {
        this.setTabIndicatorColor(ContextCompat.getColor(this.getContext(), v));
    }

    @Override  // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int v) {
        int v1 = this.v;
        if(v < v1) {
            v = v1;
        }
        super.setTextSpacing(v);
    }
}

