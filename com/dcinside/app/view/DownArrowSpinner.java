package com.dcinside.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.content.ContextCompat;
import com.dcinside.app.util.vk;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class DownArrowSpinner extends AppCompatSpinner {
    @l
    private final D o;
    @l
    private final D p;
    @l
    private final D q;

    @j
    public DownArrowSpinner(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public DownArrowSpinner(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public DownArrowSpinner(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class a extends N implements A3.a {
            final Context e;

            a(Context context0) {
                this.e = context0;
                super(0);
            }

            @m
            public final Drawable b() {
                Drawable drawable0 = ContextCompat.getDrawable(this.e, 0x7F08024F);  // drawable:ic_down_arrow_spinner
                if(drawable0 != null) {
                    vk.i(this.e, 0x7F040158, new Drawable[]{drawable0});  // attr:colorPrimary
                    return drawable0;
                }
                return null;
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


        static final class c extends N implements A3.a {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
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
        this.o = E.a(b.e);
        this.p = E.a(c.e);
        this.q = E.a(new a(context0));
    }

    public DownArrowSpinner(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void c(int v, int v1, Canvas canvas0) {
        Drawable drawable0 = this.getArrow();
        if(drawable0 != null) {
            int v2 = v - (this.getSize() + this.getArrowPadding());
            int v3 = v1 / 2 - this.getSize() / 2;
            drawable0.setBounds(v2, v3, this.getSize() + v2, this.getSize() + v3);
            drawable0.draw(canvas0);
        }
    }

    @Override  // android.view.View
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        super.draw(canvas0);
        this.c(this.getMeasuredWidth(), this.getMeasuredHeight(), canvas0);
    }

    private final Drawable getArrow() {
        return (Drawable)this.q.getValue();
    }

    private final int getArrowPadding() {
        return ((Number)this.o.getValue()).intValue();
    }

    private final int getSize() {
        return ((Number)this.p.getValue()).intValue();
    }
}

