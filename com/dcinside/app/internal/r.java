package com.dcinside.app.internal;

import A3.p;
import A3.q;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.dcinside.app.image.edit.ImageEditorView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import kotlin.y;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import y4.l;

@s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n147#1:344\n147#1:345\n147#1:346\n147#1:347\n1#2:337\n11132#3:338\n11467#3,3:339\n1863#4,2:342\n*S KotlinDebug\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n180#1:344\n191#1:345\n203#1:346\n214#1:347\n306#1:338\n306#1:339,3\n306#1:342,2\n*E\n"})
public final class r {
    public static final int a = -1;
    public static final int b = -2;

    public static final int A(@l View view0) {
        L.p(view0, "<this>");
        return view0.getPaddingRight();
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int B(@l TextView textView0) {
        L.p(textView0, "<this>");
        g.a.a();
        throw new y();
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int C(@l TextView textView0) {
        L.p(textView0, "<this>");
        g.a.a();
        throw new y();
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int D(@l TextView textView0) {
        L.p(textView0, "<this>");
        g.a.a();
        throw new y();
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int E(@l TextView textView0) {
        L.p(textView0, "<this>");
        g.a.a();
        throw new y();
    }

    public static final int F(@l View view0) {
        L.p(view0, "<this>");
        return view0.getPaddingTop();
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int G(@l View view0) {
        L.p(view0, "<this>");
        g.a.a();
        throw new y();
    }

    public static final boolean H(@l TextView textView0) {
        L.p(textView0, "<this>");
        return textView0.isTextSelectable();
    }

    public static final void I(@l CompoundButton compoundButton0, @l kotlin.coroutines.g g0, @l q q0) {
        @f(c = "com.dcinside.app.internal.ViewExtensionKt$onCheckedChange$1$1", f = "ViewExtension.kt", i = {}, l = {0xD7}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.o {
            int k;
            private Object l;
            final q m;
            final t n;
            final boolean o;

            b(q q0, t t0, boolean z, d d0) {
                this.m = q0;
                this.n = t0;
                this.o = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new b(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        q q0 = this.m;
                        CompoundButton compoundButton0 = (CompoundButton)this.n.a();
                        if(compoundButton0 == null) {
                            return S0.a;
                        }
                        this.k = 1;
                        return q0.T0(o0, compoundButton0, kotlin.coroutines.jvm.internal.b.a(this.o), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(compoundButton0, "<this>");
        L.p(g0, "context");
        L.p(q0, "handler");
        compoundButton0.setOnCheckedChangeListener((CompoundButton compoundButton0, boolean z) -> {
            L.p(g0, "$context");
            L.p(q0, "$handler");
            b r$b0 = new b(q0, new t(compoundButton0), z, null);
            kotlinx.coroutines.k.f(() -> i.a, g0, null, r$b0, 2, null);
        });
    }

    public static void J(CompoundButton compoundButton0, kotlin.coroutines.g g0, q q0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.e();
        }
        r.I(compoundButton0, g0, q0);
    }

    // 检测为 Lambda 实现
    private static final void K(kotlin.coroutines.g g0, q q0, CompoundButton compoundButton0, boolean z) [...]

    public static final void L(@l View view0, @l kotlin.coroutines.g g0, @l p p0) {
        @f(c = "com.dcinside.app.internal.ViewExtensionKt$onClick$1$1", f = "ViewExtension.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.o {
            int k;
            private Object l;
            final p m;
            final t n;

            c(p p0, t t0, d d0) {
                this.m = p0;
                this.n = t0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new c(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        p p0 = this.m;
                        View view0 = (View)this.n.a();
                        if(view0 == null) {
                            return S0.a;
                        }
                        this.k = 1;
                        return p0.invoke(o0, view0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(view0, "<this>");
        L.p(g0, "context");
        L.p(p0, "handler");
        view0.setOnClickListener((View view0) -> {
            L.p(g0, "$context");
            L.p(p0, "$handler");
            c r$c0 = new c(p0, new t(view0), null);
            kotlinx.coroutines.k.f(() -> i.a, g0, null, r$c0, 2, null);
        });
    }

    public static void M(View view0, kotlin.coroutines.g g0, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.e();
        }
        r.L(view0, g0, p0);
    }

    // 检测为 Lambda 实现
    private static final void N(kotlin.coroutines.g g0, p p0, View view0) [...]

    public static final void O(@l View view0, @l kotlin.coroutines.g g0, @l q q0) {
        @f(c = "com.dcinside.app.internal.ViewExtensionKt$onFocusChange$1$1", f = "ViewExtension.kt", i = {}, l = {0xB6}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.internal.r.d extends o implements A3.o {
            int k;
            private Object l;
            final q m;
            final t n;
            final boolean o;

            com.dcinside.app.internal.r.d(q q0, t t0, boolean z, d d0) {
                this.m = q0;
                this.n = t0;
                this.o = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new com.dcinside.app.internal.r.d(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((com.dcinside.app.internal.r.d)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        q q0 = this.m;
                        View view0 = (View)this.n.a();
                        if(view0 == null) {
                            return S0.a;
                        }
                        this.k = 1;
                        return q0.T0(o0, view0, kotlin.coroutines.jvm.internal.b.a(this.o), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(view0, "<this>");
        L.p(g0, "context");
        L.p(q0, "handler");
        view0.setOnFocusChangeListener((View view0, boolean z) -> {
            L.p(g0, "$context");
            L.p(q0, "$handler");
            com.dcinside.app.internal.r.d r$d0 = new com.dcinside.app.internal.r.d(q0, new t(view0), z, null);
            kotlinx.coroutines.k.f(() -> i.a, g0, null, r$d0, 2, null);
        });
    }

    public static void P(View view0, kotlin.coroutines.g g0, q q0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.e();
        }
        r.O(view0, g0, q0);
    }

    // 检测为 Lambda 实现
    private static final void Q(kotlin.coroutines.g g0, q q0, View view0, boolean z) [...]

    public static final void R(@l View view0, @l kotlin.coroutines.g g0, boolean z, @l p p0) {
        @f(c = "com.dcinside.app.internal.ViewExtensionKt$onLongClick$1$1", f = "ViewExtension.kt", i = {}, l = {0xC1}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements A3.o {
            int k;
            private Object l;
            final p m;
            final t n;

            e(p p0, t t0, d d0) {
                this.m = p0;
                this.n = t0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new e(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        p p0 = this.m;
                        View view0 = (View)this.n.a();
                        if(view0 == null) {
                            return S0.a;
                        }
                        this.k = 1;
                        return p0.invoke(o0, view0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(view0, "<this>");
        L.p(g0, "context");
        L.p(p0, "handler");
        view0.setOnLongClickListener((View view0) -> {
            L.p(g0, "$context");
            L.p(p0, "$handler");
            e r$e0 = new e(p0, new t(view0), null);
            kotlinx.coroutines.k.f(() -> i.a, g0, null, r$e0, 2, null);
            return z;
        });
    }

    public static void S(View view0, kotlin.coroutines.g g0, boolean z, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.e();
        }
        if((v & 2) != 0) {
            z = false;
        }
        r.R(view0, g0, z, p0);
    }

    // 检测为 Lambda 实现
    private static final boolean T(kotlin.coroutines.g g0, boolean z, p p0, View view0) [...]

    public static final void U(@l SeekBar seekBar0, @l kotlin.coroutines.g g0, @l Function1 function10) {
        L.p(seekBar0, "<this>");
        L.p(g0, "context");
        L.p(function10, "init");
        j j0 = new j(g0);
        function10.invoke(j0);
        seekBar0.setOnSeekBarChangeListener(j0);
    }

    public static void V(SeekBar seekBar0, kotlin.coroutines.g g0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.e();
        }
        r.U(seekBar0, g0, function10);
    }

    public static final void W(@l TextView textView0, boolean z) {
        L.p(textView0, "<this>");
        textView0.setAllCaps(z);
    }

    public static final void X(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setBackgroundColor(view0.getContext().getResources().getColor(v));
    }

    public static final void Y(@l View view0, @y4.m Drawable drawable0) {
        L.p(view0, "<this>");
        view0.setBackgroundDrawable(drawable0);
    }

    public static final void Z(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(view0.getPaddingLeft(), view0.getPaddingTop(), view0.getPaddingRight(), v);
    }

    public static final void a0(@l TextView textView0, int v) {
        L.p(textView0, "<this>");
        textView0.setEms(v);
    }

    public static final void b0(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(v, view0.getPaddingTop(), v, view0.getPaddingBottom());
    }

    public static final void c0(@l ImageView imageView0, @y4.m Drawable drawable0) {
        L.p(imageView0, "<this>");
        imageView0.setImageDrawable(drawable0);
    }

    public static final void d0(@l ImageView imageView0, int v) {
        L.p(imageView0, "<this>");
        imageView0.setImageResource(v);
    }

    public static final void e0(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(v, view0.getPaddingTop(), view0.getPaddingRight(), view0.getPaddingBottom());
    }

    public static final void f(@l Activity activity0, @IdRes @l int[] arr_v, @l Function1 function10) {
        @f(c = "com.dcinside.app.internal.ViewExtensionKt$applyClicks$2$1", f = "ViewExtension.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt$applyClicks$2$1\n*L\n1#1,336:1\n*E\n"})
        public static final class a extends o implements p {
            int k;
            Object l;
            final Function1 m;

            public a(Function1 function10, d d0) {
                this.m = function10;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                a r$a0 = new a(this.m, d0);
                r$a0.l = view0;
                return r$a0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.invoke(((View)this.l));
                return S0.a;
            }

            @y4.m
            public final Object invokeSuspend$$forInline(@l Object object0) {
                this.m.invoke(((View)this.l));
                return S0.a;
            }
        }

        L.p(activity0, "<this>");
        L.p(arr_v, "ids");
        L.p(function10, "listener");
        if(com.dcinside.app.internal.c.o(activity0)) {
            activity0 = null;
        }
        if(activity0 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            arrayList0.add(activity0.findViewById(arr_v[v]));
        }
        for(Object object0: arrayList0) {
            L.m(((View)object0));
            r.M(((View)object0), null, new a(function10, null), 1, null);
        }
    }

    public static final void f0(@l View view0, @y4.m Integer integer0, @y4.m Integer integer1, @y4.m Integer integer2, @y4.m Integer integer3) {
        int v1;
        L.p(view0, "<this>");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        int v = 1;
        if(viewGroup$MarginLayoutParams0 == null) {
            return;
        }
        if(integer0 == null || viewGroup$MarginLayoutParams0.topMargin == ((int)integer0)) {
            v1 = 0;
        }
        else {
            viewGroup$MarginLayoutParams0.topMargin = (int)integer0;
            v1 = 1;
        }
        if(integer1 != null && viewGroup$MarginLayoutParams0.bottomMargin != ((int)integer1)) {
            viewGroup$MarginLayoutParams0.bottomMargin = (int)integer1;
            v1 = 1;
        }
        if(integer2 != null && viewGroup$MarginLayoutParams0.getMarginStart() != ((int)integer2)) {
            viewGroup$MarginLayoutParams0.setMarginStart(((int)integer2));
            v1 = 1;
        }
        if(integer3 == null || viewGroup$MarginLayoutParams0.getMarginEnd() == ((int)integer3)) {
            v = v1;
        }
        else {
            viewGroup$MarginLayoutParams0.setMarginEnd(((int)integer3));
        }
        if(v != 0) {
            view0.setLayoutParams(viewGroup$MarginLayoutParams0);
        }
    }

    public static final t g(Object object0) {
        return new t(object0);
    }

    public static void g0(View view0, Integer integer0, Integer integer1, Integer integer2, Integer integer3, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = null;
        }
        if((v & 2) != 0) {
            integer1 = null;
        }
        if((v & 4) != 0) {
            integer2 = null;
        }
        if((v & 8) != 0) {
            integer3 = null;
        }
        r.f0(view0, integer0, integer1, integer2, integer3);
    }

    public static final void h(@l ImageEditorView imageEditorView0) {
        L.p(imageEditorView0, "<this>");
        imageEditorView0.post(() -> {
            L.p(imageEditorView0, "$this_fitSize");
            int v = imageEditorView0.getMeasuredWidth();
            int v1 = imageEditorView0.getMeasuredHeight();
            if(v > 0 && v1 > 0) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageEditorView0.getLayoutParams();
                viewGroup$LayoutParams0.width = v;
                viewGroup$LayoutParams0.height = v1;
                imageEditorView0.requestLayout();
            }
        });
    }

    public static final void h0(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(v, v, v, v);
    }

    // 检测为 Lambda 实现
    private static final void i(ImageEditorView imageEditorView0) [...]

    public static final void i0(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(v, view0.getPaddingTop(), v, view0.getPaddingBottom());
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final boolean j(@l TextView textView0) {
        L.p(textView0, "<this>");
        g.a.a();
        throw new y();
    }

    public static final void j0(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(view0.getPaddingLeft(), v, view0.getPaddingRight(), v);
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int k(@l View view0) {
        L.p(view0, "<this>");
        g.a.a();
        throw new y();
    }

    public static final void k0(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(view0.getPaddingLeft(), view0.getPaddingTop(), v, view0.getPaddingBottom());
    }

    @y4.m
    public static final Drawable l(@l View view0) {
        L.p(view0, "<this>");
        return view0.getBackground();
    }

    public static final void l0(@l TextView textView0, boolean z) {
        L.p(textView0, "<this>");
        textView0.setTextIsSelectable(z);
    }

    public static final int m(@l View view0) {
        L.p(view0, "<this>");
        return view0.getPaddingBottom();
    }

    public static final void m0(@l TextView textView0, int v) {
        L.p(textView0, "<this>");
        if(Build.VERSION.SDK_INT >= 23) {
            textView0.setTextAppearance(v);
            return;
        }
        textView0.setTextAppearance(textView0.getContext(), v);
    }

    @l
    public static final Configuration n(@l Context context0) {
        L.p(context0, "<this>");
        Configuration configuration0 = context0.getResources().getConfiguration();
        L.o(configuration0, "getConfiguration(...)");
        return configuration0;
    }

    public static final void n0(@l TextView textView0, int v) {
        L.p(textView0, "<this>");
        textView0.setTextColor(textView0.getContext().getResources().getColor(v));
    }

    @y4.m
    public static final View o(@l Activity activity0) {
        L.p(activity0, "<this>");
        ViewGroup viewGroup0 = (ViewGroup)activity0.findViewById(0x1020002);
        return viewGroup0 == null ? null : viewGroup0.getChildAt(0);
    }

    public static final void o0(@l TextView textView0, int v) {
        L.p(textView0, "<this>");
        textView0.setText(v);
    }

    @l
    public static final DisplayMetrics p(@l Context context0) {
        L.p(context0, "<this>");
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        L.o(displayMetrics0, "getDisplayMetrics(...)");
        return displayMetrics0;
    }

    public static final void p0(@l TextView textView0, int v) {
        L.p(textView0, "<this>");
        textView0.setTextSize(0, textView0.getContext().getResources().getDimension(v));
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int q(@l TextView textView0) {
        L.p(textView0, "<this>");
        g.a.a();
        throw new y();
    }

    public static final void q0(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(view0.getPaddingLeft(), v, view0.getPaddingRight(), view0.getPaddingBottom());
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int r(@l View view0) {
        L.p(view0, "<this>");
        g.a.a();
        throw new y();
    }

    public static final void r0(@l ViewPager2 viewPager20, float f) {
        L.p(viewPager20, "<this>");
        try {
            Field field0 = ViewPager2.class.getDeclaredField("j");
            L.o(field0, "getDeclaredField(...)");
            field0.setAccessible(true);
            RecyclerView recyclerView0 = viewPager20.j;
            L.n(recyclerView0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            Field field1 = RecyclerView.class.getDeclaredField("mTouchSlop");
            L.o(field1, "getDeclaredField(...)");
            field1.setAccessible(true);
            recyclerView0.mTouchSlop = (int)(((float)ViewConfiguration.get(viewPager20.getContext()).getScaledTouchSlop()) * f);
        }
        catch(Exception exception0) {
            timber.log.b.a.x("setTouchSensitivity: An error occurred: " + exception0.getMessage(), new Object[0]);
        }
    }

    @y4.m
    public static final Drawable s(@l ImageView imageView0) {
        L.p(imageView0, "<this>");
        return imageView0.getDrawable();
    }

    public static final void s0(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(view0.getPaddingLeft(), v, view0.getPaddingRight(), v);
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int t(@l ImageView imageView0) {
        L.p(imageView0, "<this>");
        g.a.a();
        throw new y();
    }

    public static final t t0() {
        return new t(null);
    }

    public static final int u(@l View view0) {
        L.p(view0, "<this>");
        return view0.getPaddingLeft();
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int v(@l View view0) {
        L.p(view0, "<this>");
        g.a.a();
        throw new y();
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int w(@l View view0) {
        L.p(view0, "<this>");
        g.a.a();
        throw new y();
    }

    @k(message = "Use horizontalPadding instead", replaceWith = @c0(expression = "horizontalPadding", imports = {}))
    public static void x(View view0) {
    }

    @k(level = m.b, message = "Property does not have a getter")
    public static final int y(@l View view0) {
        L.p(view0, "<this>");
        g.a.a();
        throw new y();
    }

    @k(message = "Use verticalPadding instead", replaceWith = @c0(expression = "verticalPadding", imports = {}))
    public static void z(View view0) {
    }
}

