package com.dcinside.app.view.colorpicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.memo.d;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.g0;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.vk;
import java.util.Arrays;
import kotlin.S0;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import rx.g;
import rx.o;
import rx.subscriptions.b;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nSelectedColorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectedColorView.kt\ncom/dcinside/app/view/colorpicker/SelectedColorView\n+ 2 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,84:1\n60#2:85\n1#3:86\n192#4,7:87\n*S KotlinDebug\n*F\n+ 1 SelectedColorView.kt\ncom/dcinside/app/view/colorpicker/SelectedColorView\n*L\n38#1:85\n50#1:87,7\n*E\n"})
public final class SelectedColorView extends View {
    @m
    private d a;
    @m
    private b b;
    @m
    private Integer c;
    private boolean d;

    @j
    public SelectedColorView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public SelectedColorView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public SelectedColorView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class a extends N implements Function1 {
            final SelectedColorView e;

            a(SelectedColorView selectedColorView0) {
                this.e = selectedColorView0;
                super(1);
            }

            public final void a(g0 g00) {
                Integer integer0 = g00.a();
                this.e.g(integer0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((g0)object0));
                return S0.a;
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.setBackgroundResource(0x7F080667);  // drawable:selected_color_border
        Context context1 = Al.h(context0);
        b b0 = this.b;
        if(b0 != null) {
            b0.c();
        }
        if(context1 != null) {
            g g0 = c.c(context1, g0.class);
            if(g0 != null) {
                o o0 = g0.x5((Object object0) -> {
                    L.p(new a(this), "$tmp0");
                    new a(this).invoke(object0);
                });
                if(o0 != null) {
                    b b1 = this.b;
                    if(b1 != null) {
                        b1.a(o0);
                    }
                }
            }
        }
        this.setColor(this.c);
    }

    public SelectedColorView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    // 检测为 Lambda 实现
    private static final void c(Function1 function10, Object object0) [...]

    public final void e() {
        this.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.d = true;
            Context context0 = this.getContext();
            d d0 = null;
            com.dcinside.app.base.g g0 = context0 instanceof com.dcinside.app.base.g ? ((com.dcinside.app.base.g)context0) : null;
            d d1 = this.a;
            if(d1 != null) {
                d1.dismissAllowingStateLoss();
            }
            if(g0 != null) {
                V[] arr_v = {r0.a("EXTRA_SELECTED_COLOR", this.c)};
                FragmentManager fragmentManager0 = g0.getSupportFragmentManager();
                L.o(fragmentManager0, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                ClassLoader classLoader0 = d.class.getClassLoader();
                L.m(classLoader0);
                Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.memo.d");
                if(fragment0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.memo.ColorPickerDialogFragment");
                }
                ((d)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
                ((d)fragment0).show(fragmentManager0, "com.dcinside.app.memo.d");
                d0 = (d)fragment0;
            }
            this.a = d0;
        });
    }

    // 检测为 Lambda 实现
    private static final void f(SelectedColorView selectedColorView0, View view0) [...]

    private final void g(Integer integer0) {
        if(this.d) {
            this.setCurrentColor(integer0);
            this.d = false;
        }
    }

    @m
    public final Integer getCurrentColor() {
        return this.c;
    }

    public final int getDefaultColor() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        return vk.b(context0, 0x1010038);
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b b0 = this.b;
        if(b0 != null) {
            b0.l();
        }
        this.b = null;
    }

    private final void setColor(Integer integer0) {
        Drawable drawable0 = this.getBackground();
        GradientDrawable gradientDrawable0 = drawable0 instanceof GradientDrawable ? ((GradientDrawable)drawable0) : null;
        if(gradientDrawable0 == null) {
            return;
        }
        if(integer0 == null) {
            gradientDrawable0.setColor(this.getDefaultColor());
            return;
        }
        gradientDrawable0.setColor(((int)integer0));
    }

    public final void setCurrentColor(@m Integer integer0) {
        this.c = integer0;
        this.setColor(integer0);
    }
}

