package com.dcinside.app.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.annotation.ArrayRes;
import com.dcinside.app.R.styleable;
import java.util.ArrayList;
import java.util.List;

public class ColorSeekBar extends View {
    public interface a {
        void q(int arg1, int arg2, int arg3);
    }

    public interface b {
        void c();
    }

    private Paint A;
    private Paint B;
    private Paint C;
    private Paint D;
    private int[] a;
    private int b;
    private a c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private float i;
    private int j;
    private Rect k;
    private Paint l;
    private int m;
    private int n;
    private Rect o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private List u;
    private int v;
    private boolean w;
    private boolean x;
    private b y;
    private boolean z;

    public ColorSeekBar(Context context0) {
        super(context0);
        this.a = new int[]{0xFF000000, -1, 0xFF9900FF, 0xFF0000FF, 0xFF00FF00, 0xFF00FFFF, 0xFFFF0000, 0xFFFFFF00, 0xFFFF00FF};
        this.d = false;
        this.h = 20;
        this.j = 2;
        this.k = new Rect();
        this.l = new Paint();
        this.o = new Rect();
        this.r = 5;
        this.s = 0;
        this.t = 0xFF;
        this.u = new ArrayList();
        this.v = -1;
        this.w = false;
        this.x = true;
        this.z = false;
        this.A = new Paint();
        this.B = new Paint();
        this.C = new Paint();
        this.D = new Paint();
        this.i(context0, null, 0, 0);
    }

    public ColorSeekBar(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new int[]{0xFF000000, -1, 0xFF9900FF, 0xFF0000FF, 0xFF00FF00, 0xFF00FFFF, 0xFFFF0000, 0xFFFFFF00, 0xFFFF00FF};
        this.d = false;
        this.h = 20;
        this.j = 2;
        this.k = new Rect();
        this.l = new Paint();
        this.o = new Rect();
        this.r = 5;
        this.s = 0;
        this.t = 0xFF;
        this.u = new ArrayList();
        this.v = -1;
        this.w = false;
        this.x = true;
        this.z = false;
        this.A = new Paint();
        this.B = new Paint();
        this.C = new Paint();
        this.D = new Paint();
        this.i(context0, attributeSet0, 0, 0);
    }

    public ColorSeekBar(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new int[]{0xFF000000, -1, 0xFF9900FF, 0xFF0000FF, 0xFF00FF00, 0xFF00FFFF, 0xFFFF0000, 0xFFFFFF00, 0xFFFF00FF};
        this.d = false;
        this.h = 20;
        this.j = 2;
        this.k = new Rect();
        this.l = new Paint();
        this.o = new Rect();
        this.r = 5;
        this.s = 0;
        this.t = 0xFF;
        this.u = new ArrayList();
        this.v = -1;
        this.w = false;
        this.x = true;
        this.z = false;
        this.A = new Paint();
        this.B = new Paint();
        this.C = new Paint();
        this.D = new Paint();
        this.i(context0, attributeSet0, v, 0);
    }

    @TargetApi(21)
    public ColorSeekBar(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = new int[]{0xFF000000, -1, 0xFF9900FF, 0xFF0000FF, 0xFF00FF00, 0xFF00FFFF, 0xFFFF0000, 0xFFFFFF00, 0xFFFF00FF};
        this.d = false;
        this.h = 20;
        this.j = 2;
        this.k = new Rect();
        this.l = new Paint();
        this.o = new Rect();
        this.r = 5;
        this.s = 0;
        this.t = 0xFF;
        this.u = new ArrayList();
        this.v = -1;
        this.w = false;
        this.x = true;
        this.z = false;
        this.A = new Paint();
        this.B = new Paint();
        this.C = new Paint();
        this.D = new Paint();
        this.i(context0, attributeSet0, v, v1);
    }

    public void a(int v) {
        this.b(this.getContext(), null, 0, v);
    }

    protected void b(Context context0, AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ColorSeekBar, v, v1);
        int v2 = typedArray0.getResourceId(5, 0);
        this.n = typedArray0.getInteger(8, 100);
        this.p = typedArray0.getInteger(4, 0);
        this.q = typedArray0.getInteger(0, this.s);
        this.e = typedArray0.getBoolean(7, false);
        this.d = typedArray0.getBoolean(9, false);
        int v3 = typedArray0.getColor(3, 0);
        this.j = (int)typedArray0.getDimension(1, ((float)this.d(2.0f)));
        this.h = (int)typedArray0.getDimension(10, ((float)this.d(30.0f)));
        this.r = (int)typedArray0.getDimension(2, ((float)this.d(5.0f)));
        this.z = typedArray0.getBoolean(6, false);
        typedArray0.recycle();
        if(v2 != 0) {
            this.a = this.g(v2);
        }
        this.setBackgroundColor(v3);
    }

    private void c() {
        if(this.m < 1) {
            return;
        }
        this.u.clear();
        for(int v = 0; v <= this.n; ++v) {
            this.u.add(this.o(v));
        }
    }

    public int d(float f) {
        return (int)(f * this.getContext().getResources().getDisplayMetrics().density + 0.5f);
    }

    public int e(boolean z) {
        if(this.p >= this.u.size()) {
            int v = this.o(this.p);
            return z ? v : Color.argb(this.getAlphaValue(), Color.red(v), Color.green(v), Color.blue(v));
        }
        int v1 = (int)(((Integer)this.u.get(this.p)));
        return z ? Color.argb(this.getAlphaValue(), Color.red(v1), Color.green(v1), Color.blue(v1)) : v1;
    }

    public int f(int v) {
        return this.u.indexOf(Color.argb(0xFF, Color.red(v), Color.green(v), Color.blue(v)));
    }

    private int[] g(@ArrayRes int v) {
        int v1 = 0;
        if(this.isInEditMode()) {
            String[] arr_s = this.getContext().getResources().getStringArray(v);
            int[] arr_v = new int[arr_s.length];
            while(v1 < arr_s.length) {
                arr_v[v1] = Color.parseColor(arr_s[v1]);
                ++v1;
            }
            return arr_v;
        }
        TypedArray typedArray0 = this.getContext().getResources().obtainTypedArray(v);
        int[] arr_v1 = new int[typedArray0.length()];
        while(v1 < typedArray0.length()) {
            arr_v1[v1] = typedArray0.getColor(v1, 0xFF000000);
            ++v1;
        }
        typedArray0.recycle();
        return arr_v1;
    }

    public int getAlphaBarPosition() {
        return this.q;
    }

    public int getAlphaMaxPosition() {
        return this.t;
    }

    public int getAlphaMinPosition() {
        return this.s;
    }

    public int getAlphaValue() {
        return this.b;
    }

    public int getBarHeight() {
        return this.j;
    }

    public int getBarMargin() {
        return this.r;
    }

    public int getColor() {
        return this.e(this.d);
    }

    public int getColorBarPosition() {
        return this.p;
    }

    public float getColorBarValue() {
        return (float)this.p;
    }

    public List getColors() {
        return this.u;
    }

    public int getMaxValue() {
        return this.n;
    }

    public int getThumbHeight() {
        return this.h;
    }

    private void h() {
        float f = (float)(this.h / 2);
        this.i = f;
        int v = this.getMeasuredHeight() - this.getPaddingBottom() - ((int)f);
        int v1 = this.getMeasuredWidth();
        int v2 = this.getPaddingRight();
        int v3 = this.getPaddingLeft() + ((int)f);
        if(!this.e) {
            v = v1 - v2 - ((int)f);
        }
        int v4 = this.getPaddingTop() + ((int)f);
        this.m = v - v3;
        this.k.set(v3, v4, v, this.j + v4);
        int v5 = (int)(((float)this.h) + this.i + ((float)this.j) + ((float)this.r));
        this.o.set(v3, v5, v, this.j + v5);
        this.c();
        this.q();
    }

    protected void i(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.b(context0, attributeSet0, v, v1);
        this.l.setAntiAlias(true);
        this.A.setAntiAlias(true);
        this.C.setAntiAlias(true);
        this.B.setAntiAlias(true);
        this.D.setAntiAlias(true);
    }

    private boolean j(Rect rect0, float f, float f1) {
        return ((float)rect0.left) - this.i < f && f < ((float)rect0.right) + this.i && ((float)rect0.top) - this.i < f1 && f1 < ((float)rect0.bottom) + this.i;
    }

    public boolean k() {
        return this.d;
    }

    public boolean l() {
        return this.e;
    }

    private int m(int v, int v1, float f) {
        return v + Math.round(f * ((float)(v1 - v)));
    }

    private int n(float f) {
        float f1 = f / ((float)this.m);
        if(((double)f1) <= 0.0) {
            return this.a[0];
        }
        if(f1 >= 1.0f) {
            return this.a[this.a.length - 1];
        }
        int[] arr_v = this.a;
        float f2 = f1 * ((float)(arr_v.length - 1));
        float f3 = f2 - ((float)(((int)f2)));
        int v = arr_v[((int)f2)];
        int v1 = arr_v[((int)f2) + 1];
        return Color.rgb(this.m(Color.red(v), Color.red(v1), f3), this.m(Color.green(v), Color.green(v1), f3), this.m(Color.blue(v), Color.blue(v1), f3));
    }

    private int o(int v) {
        return this.n(((float)v) / ((float)this.n) * ((float)this.m));
    }

    @Override  // android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(Canvas canvas0) {
        if(this.z) {
            super.onDraw(canvas0);
            return;
        }
        if(this.e) {
            canvas0.rotate(-90.0f);
            canvas0.translate(((float)(-this.getHeight())), 0.0f);
            canvas0.scale(-1.0f, 1.0f, ((float)(this.getHeight() / 2)), ((float)(this.getWidth() / 2)));
        }
        int v = this.e(false);
        Paint paint0 = this.l;
        float f = (float)this.k.width();
        float f1 = Math.max(this.u.size(), 1.0f);
        float f2 = (float)this.k.top;
        float f3 = (float)this.k.bottom;
        float f4 = (float)this.k.left;
        for(Object object0: this.u) {
            paint0.setColor(((int)(((Integer)object0))));
            float f5 = f4 + f / f1;
            canvas0.drawRect(f4, f2, f5, f3, paint0);
            f4 = f5;
        }
        this.A.setColor(v);
        Rect rect0 = this.k;
        float f6 = ((float)this.p) / ((float)this.n) * ((float)this.m) + ((float)rect0.left);
        float f7 = (float)(rect0.top + rect0.height() / 2);
        canvas0.drawCircle(f6, f7, ((float)(this.j / 2 + 5)), this.A);
        int[] arr_v = {Color.argb(this.t, Color.red(v), Color.green(v), Color.blue(v)), Color.argb(this.s, Color.red(v), Color.green(v), Color.blue(v))};
        Shader.TileMode shader$TileMode0 = Shader.TileMode.MIRROR;
        RadialGradient radialGradient0 = new RadialGradient(f6, f7, this.i, arr_v, null, shader$TileMode0);
        this.D.setShader(radialGradient0);
        canvas0.drawCircle(f6, f7, ((float)(this.h / 2)), this.D);
        if(this.d) {
            LinearGradient linearGradient0 = new LinearGradient(0.0f, 0.0f, ((float)this.o.width()), 0.0f, arr_v, null, Shader.TileMode.CLAMP);
            this.C.setShader(linearGradient0);
            canvas0.drawRect(this.o, this.C);
            Rect rect1 = this.o;
            float f8 = ((float)(this.q - this.s)) / ((float)(this.t - this.s)) * ((float)this.m) + ((float)rect1.left);
            float f9 = (float)(rect1.top + rect1.height() / 2);
            canvas0.drawCircle(f8, f9, ((float)(this.j / 2 + 5)), this.A);
            RadialGradient radialGradient1 = new RadialGradient(f8, f9, this.i, arr_v, null, shader$TileMode0);
            this.B.setShader(radialGradient1);
            canvas0.drawCircle(f8, f9, ((float)(this.h / 2)), this.B);
        }
        if(this.x) {
            this.x = false;
            a colorSeekBar$a0 = this.c;
            if(colorSeekBar$a0 != null) {
                colorSeekBar$a0.q(this.p, this.q, this.getColor());
            }
            b colorSeekBar$b0 = this.y;
            if(colorSeekBar$b0 != null) {
                colorSeekBar$b0.c();
            }
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = this.d ? this.j * 2 : this.j;
        int v5 = this.d ? this.h * 2 : this.h;
        if(this.l()) {
            if(v2 == 0x80000000 || v2 == 0) {
                this.setMeasuredDimension(v5 + v4 + this.r, v1);
            }
        }
        else if(v3 == 0x80000000 || v3 == 0) {
            this.setMeasuredDimension(v, v5 + v4 + this.r);
        }
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.h();
        this.w = true;
        int v4 = this.v;
        if(v4 != -1) {
            this.setColor(v4);
        }
    }

    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        float f = this.e ? motionEvent0.getY() : motionEvent0.getX();
        float f1 = this.e ? motionEvent0.getX() : motionEvent0.getY();
        int v = motionEvent0.getAction();
        switch(v) {
            case 0: {
                if(this.j(this.k, f, f1)) {
                    this.f = true;
                    this.setColorBarPosition(((int)((f - ((float)this.k.left)) / ((float)this.m) * ((float)this.n))));
                    return true;
                }
                if(this.d && this.j(this.o, f, f1)) {
                    this.g = true;
                }
                break;
            }
            case 1: {
                this.f = false;
                this.g = false;
                return true;
            label_8:
                if(v == 2) {
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    if(this.f) {
                        this.setColorBarPosition(((int)((f - ((float)this.k.left)) / ((float)this.m) * ((float)this.n))));
                    }
                    else if(this.d && this.g) {
                        int v1 = this.t;
                        int v2 = this.s;
                        int v3 = (int)((f - ((float)this.k.left)) / ((float)this.m) * ((float)(v1 - v2)) + ((float)v2));
                        this.q = v3;
                        if(v3 < v2) {
                            this.q = v2;
                        }
                        else if(v3 > v1) {
                            this.q = v1;
                        }
                        this.q();
                    }
                    a colorSeekBar$a0 = this.c;
                    if(colorSeekBar$a0 != null && (this.g || this.f)) {
                        colorSeekBar$a0.q(this.p, this.q, this.getColor());
                    }
                    this.invalidate();
                    return true;
                }
                break;
            }
            default: {
                goto label_8;
            }
        }
        return true;
    }

    private void p() {
        this.setLayoutParams(this.getLayoutParams());
    }

    private void q() {
        this.b = 0xFF - this.q;
    }

    public void setAlphaBarPosition(int v) {
        this.q = v;
        this.q();
        this.invalidate();
    }

    public void setAlphaMaxPosition(int v) {
        this.t = v;
        if(v > 0xFF) {
            this.t = 0xFF;
        }
        else {
            int v1 = this.s;
            if(v <= v1) {
                this.t = v1 + 1;
            }
        }
        if(this.q > this.s) {
            this.q = this.t;
        }
        this.invalidate();
    }

    public void setAlphaMinPosition(int v) {
        this.s = v;
        int v1 = this.t;
        if(v >= v1) {
            this.s = v1 - 1;
        }
        else if(v < 0) {
            this.s = 0;
        }
        int v2 = this.s;
        if(this.q < v2) {
            this.q = v2;
        }
        this.invalidate();
    }

    public void setBarHeight(float f) {
        this.j = this.d(f);
        this.p();
        this.invalidate();
    }

    public void setBarHeightPx(int v) {
        this.j = v;
        this.p();
        this.invalidate();
    }

    public void setBarMargin(float f) {
        this.r = this.d(f);
        this.p();
        this.invalidate();
    }

    public void setBarMarginPx(int v) {
        this.r = v;
        this.p();
        this.invalidate();
    }

    public void setColor(int v) {
        int v1 = Color.rgb(Color.red(v), Color.green(v), Color.blue(v));
        if(this.w) {
            this.setColorBarPosition(this.u.indexOf(v1));
            return;
        }
        this.v = v;
    }

    public void setColorBarPosition(int v) {
        this.p = v;
        int v1 = this.n;
        if(v > v1) {
            v = v1;
        }
        this.p = v;
        if(v < 0) {
            v = 0;
        }
        this.p = v;
        this.invalidate();
        a colorSeekBar$a0 = this.c;
        if(colorSeekBar$a0 != null) {
            colorSeekBar$a0.q(this.p, this.q, this.getColor());
        }
    }

    public void setColorSeeds(@ArrayRes int v) {
        this.setColorSeeds(this.g(v));
    }

    public void setColorSeeds(int[] arr_v) {
        this.a = arr_v;
        this.h();
        this.invalidate();
        a colorSeekBar$a0 = this.c;
        if(colorSeekBar$a0 != null) {
            colorSeekBar$a0.q(this.p, this.q, this.getColor());
        }
    }

    public void setMaxPosition(int v) {
        this.n = v;
        this.invalidate();
        this.c();
    }

    public void setOnColorChangeListener(a colorSeekBar$a0) {
        this.c = colorSeekBar$a0;
    }

    public void setOnInitDoneListener(b colorSeekBar$b0) {
        this.y = colorSeekBar$b0;
    }

    public void setShowAlphaBar(boolean z) {
        this.d = z;
        this.p();
        this.invalidate();
        a colorSeekBar$a0 = this.c;
        if(colorSeekBar$a0 != null) {
            colorSeekBar$a0.q(this.p, this.q, this.getColor());
        }
    }

    public void setThumbHeight(float f) {
        int v = this.d(f);
        this.h = v;
        this.i = (float)(v / 2);
        this.p();
        this.invalidate();
    }

    public void setThumbHeightPx(int v) {
        this.h = v;
        this.i = (float)(v / 2);
        this.p();
        this.invalidate();
    }
}

