package com.dcinside.app.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dcinside.app.R.styleable;
import com.dcinside.app.util.vk;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public class DividerConstraintLayout extends ConstraintLayout {
    @l
    private final D a;
    @l
    private final D b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    @j
    public DividerConstraintLayout(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public DividerConstraintLayout(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public DividerConstraintLayout(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class a extends N implements A3.a {
            final Context e;

            a(Context context0) {
                this.e = context0;
                super(0);
            }

            @m
            public final Drawable b() {
                return vk.e(this.e, 0x7F040242);  // attr:divide_n
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class b extends N implements A3.a {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(0);
            }

            // 去混淆评级： 低(20)
            @l
            public final Integer b() {
                return 0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = E.a(new a(context0));
        this.b = E.a(b.e);
        this.c = 0;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.DividerConstraintLayout, v, 0);
            L.o(typedArray0, "obtainStyledAttributes(...)");
            this.d = typedArray0.getBoolean(1, false);
            this.e = typedArray0.getBoolean(2, false);
            this.f = typedArray0.getBoolean(0, false);
            typedArray0.recycle();
            this.C();
        }
    }

    public DividerConstraintLayout(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    protected void A(int v, int v1, @l Canvas canvas0) {
        L.p(canvas0, "canvas");
        Drawable drawable0 = this.getLine();
        if(drawable0 != null) {
            int v2 = this.getDrawPadding() ? this.getPaddingLR() : 0;
            if(this.getDrawPadding()) {
                v -= this.getPaddingLR();
            }
            if(this.getDrawTop()) {
                drawable0.setBounds(v2, 0, v, this.c);
                drawable0.draw(canvas0);
            }
            if(this.getDrawBottom()) {
                drawable0.setBounds(v2, v1 - this.c, v, v1);
                drawable0.draw(canvas0);
            }
        }
    }

    // 去混淆评级： 低(20)
    protected boolean B() {
        return this.getDrawTop() || this.getDrawBottom();
    }

    protected final void C() {
        if(this.B()) {
            this.setWillNotDraw(false);
            return;
        }
        this.setWillNotDraw(true);
    }

    @Override  // android.view.View
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        super.draw(canvas0);
        this.A(this.getMeasuredWidth(), this.getMeasuredHeight(), canvas0);
    }

    public final boolean getDrawBottom() {
        return this.f;
    }

    public final boolean getDrawPadding() {
        return this.d;
    }

    public final boolean getDrawTop() {
        return this.e;
    }

    private final Drawable getLine() {
        return (Drawable)this.a.getValue();
    }

    public final int getLineSize() {
        return this.c;
    }

    private final int getPaddingLR() {
        return ((Number)this.b.getValue()).intValue();
    }

    public final void setDrawBottom(boolean z) {
        if(this.f != z) {
            this.f = z;
            this.C();
            this.invalidate();
        }
    }

    public final void setDrawPadding(boolean z) {
        if(this.d != z) {
            this.d = z;
            this.invalidate();
        }
    }

    public final void setDrawTop(boolean z) {
        if(this.e != z) {
            this.e = z;
            this.C();
            this.invalidate();
        }
    }

    public final void setLineSize(int v) {
        this.c = v;
    }
}

