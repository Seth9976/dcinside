package androidx.core.view;

import A3.a;
import A3.o;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Px;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.m;
import kotlin.sequences.p;
import y4.l;
import z3.i;

@s0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,415:1\n37#1,2:416\n55#1:418\n327#1,4:422\n41#2,3:419\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n70#1:416,2\n70#1:418\n311#1:422,4\n233#1:419,3\n*E\n"})
public final class ViewKt {
    public static final void A(@l View view0, @l Function1 function10) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        function10.invoke(viewGroup$LayoutParams0);
        view0.setLayoutParams(viewGroup$LayoutParams0);
    }

    @i(name = "updateLayoutParamsTyped")
    public static final void B(View view0, Function1 function10) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        L.y(1, "T");
        function10.invoke(viewGroup$LayoutParams0);
        view0.setLayoutParams(viewGroup$LayoutParams0);
    }

    public static final void C(@l View view0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        view0.setPadding(v, v1, v2, v3);
    }

    public static void D(View view0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = view0.getPaddingLeft();
        }
        if((v4 & 2) != 0) {
            v1 = view0.getPaddingTop();
        }
        if((v4 & 4) != 0) {
            v2 = view0.getPaddingRight();
        }
        if((v4 & 8) != 0) {
            v3 = view0.getPaddingBottom();
        }
        view0.setPadding(v, v1, v2, v3);
    }

    public static final void E(@l View view0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        view0.setPaddingRelative(v, v1, v2, v3);
    }

    public static void F(View view0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = view0.getPaddingStart();
        }
        if((v4 & 2) != 0) {
            v1 = view0.getPaddingTop();
        }
        if((v4 & 4) != 0) {
            v2 = view0.getPaddingEnd();
        }
        if((v4 & 8) != 0) {
            v3 = view0.getPaddingBottom();
        }
        view0.setPaddingRelative(v, v1, v2, v3);
    }

    public static final void b(@l View view0, @l Function1 function10) {
        if(view0.isAttachedToWindow()) {
            function10.invoke(view0);
            return;
        }
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                view0.removeOnAttachStateChangeListener(this);
                function10.invoke(view0);
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
            }
        });
    }

    public static final void c(@l View view0, @l Function1 function10) {
        if(!view0.isAttachedToWindow()) {
            function10.invoke(view0);
            return;
        }
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                view0.removeOnAttachStateChangeListener(this);
                function10.invoke(view0);
            }
        });
    }

    public static final void d(@l View view0, @l Function1 function10) {
        if(view0.isLaidOut() && !view0.isLayoutRequested()) {
            function10.invoke(view0);
            return;
        }
        view0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                view0.removeOnLayoutChangeListener(this);
                function10.invoke(view0);
            }
        });
    }

    public static final void e(@l View view0, @l Function1 function10) {
        view0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                view0.removeOnLayoutChangeListener(this);
                function10.invoke(view0);
            }
        });
    }

    @l
    public static final OneShotPreDrawListener f(@l View view0, @l Function1 function10) {
        return OneShotPreDrawListener.a(view0, new Runnable() {
            @Override
            public final void run() {
                function10.invoke(view0);
            }
        });
    }

    @l
    public static final Bitmap g(@l View view0, @l Bitmap.Config bitmap$Config0) {
        if(!view0.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmap0 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), bitmap$Config0);
        Canvas canvas0 = new Canvas(bitmap0);
        canvas0.translate(-((float)view0.getScrollX()), -((float)view0.getScrollY()));
        view0.draw(canvas0);
        return bitmap0;
    }

    public static Bitmap h(View view0, Bitmap.Config bitmap$Config0, int v, Object object0) {
        if((v & 1) != 0) {
            bitmap$Config0 = Bitmap.Config.ARGB_8888;
        }
        return ViewKt.g(view0, bitmap$Config0);
    }

    @l
    public static final m i(@l View view0) {
        return p.b(new o(view0, null) {
            int l;
            private Object m;
            final View n;

            {
                this.n = view0;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, d d0) {
                return ((androidx.core.view.ViewKt.allViews.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new androidx.core.view.ViewKt.allViews.1(this.n, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                kotlin.sequences.o o0;
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        o0 = (kotlin.sequences.o)this.m;
                        this.m = o0;
                        this.l = 1;
                        if(o0.a(this.n, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        o0 = (kotlin.sequences.o)this.m;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                View view0 = this.n;
                if(view0 instanceof ViewGroup) {
                    m m0 = ViewGroupKt.f(((ViewGroup)view0));
                    this.m = null;
                    this.l = 2;
                    if(o0.f(m0, this) == object1) {
                        return object1;
                    }
                }
                return S0.a;
            }
        });
    }

    @l
    public static final m j(@l View view0) {
        return p.n(view0.getParent(), androidx.core.view.ViewKt.ancestors.1.a);

        final class androidx.core.view.ViewKt.ancestors.1 extends H implements Function1 {
            public static final androidx.core.view.ViewKt.ancestors.1 a;

            static {
                androidx.core.view.ViewKt.ancestors.1.a = new androidx.core.view.ViewKt.ancestors.1();
            }

            androidx.core.view.ViewKt.ancestors.1() {
                super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
            }

            public final ViewParent a(ViewParent viewParent0) {
                return viewParent0.getParent();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((ViewParent)object0));
            }
        }

    }

    public static final int k(@l View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        return viewGroup$MarginLayoutParams0 == null ? 0 : viewGroup$MarginLayoutParams0.bottomMargin;
    }

    public static final int l(@l View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginEnd() : 0;
    }

    public static final int m(@l View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        return viewGroup$MarginLayoutParams0 == null ? 0 : viewGroup$MarginLayoutParams0.leftMargin;
    }

    public static final int n(@l View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        return viewGroup$MarginLayoutParams0 == null ? 0 : viewGroup$MarginLayoutParams0.rightMargin;
    }

    public static final int o(@l View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginStart() : 0;
    }

    public static final int p(@l View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        return viewGroup$MarginLayoutParams0 == null ? 0 : viewGroup$MarginLayoutParams0.topMargin;
    }

    public static final boolean q(@l View view0) {
        return view0.getVisibility() == 8;
    }

    public static final boolean r(@l View view0) {
        return view0.getVisibility() == 4;
    }

    public static final boolean s(@l View view0) {
        return view0.getVisibility() == 0;
    }

    @l
    public static final Runnable t(@l View view0, long v, @l a a0) {
        Runnable runnable0 = new Runnable() {
            @Override
            public final void run() {
                a0.invoke();
            }
        };
        view0.postDelayed(runnable0, v);
        return runnable0;
    }

    @l
    public static final Runnable u(@l View view0, long v, @l a a0) {
        Runnable runnable0 = () -> a0.invoke();
        view0.postOnAnimationDelayed(runnable0, v);
        return runnable0;
    }

    // 检测为 Lambda 实现
    private static final void v(a a0) [...]

    public static final void w(@l View view0, boolean z) {
        view0.setVisibility((z ? 8 : 0));
    }

    public static final void x(@l View view0, boolean z) {
        view0.setVisibility((z ? 4 : 0));
    }

    public static final void y(@l View view0, @Px int v) {
        view0.setPadding(v, v, v, v);
    }

    public static final void z(@l View view0, boolean z) {
        view0.setVisibility((z ? 0 : 8));
    }
}

