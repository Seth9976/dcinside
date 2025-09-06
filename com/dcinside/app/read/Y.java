package com.dcinside.app.read;

import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.core.content.ContextCompat;
import com.dcinside.app.internal.t;
import com.dcinside.app.read.holder.d;
import com.dcinside.app.util.dl;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nContentAdapterGuider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAdapterGuider.kt\ncom/dcinside/app/read/ContentAdapterGuider\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,164:1\n147#2:165\n*S KotlinDebug\n*F\n+ 1 ContentAdapterGuider.kt\ncom/dcinside/app/read/ContentAdapterGuider\n*L\n49#1:165\n*E\n"})
public final class y {
    static final class a extends PopupWindow {
        private final Resources a;
        private final float b;
        private final int c;
        private int d;

        public a(@l View view0, int v, int v1, boolean z) {
            L.p(view0, "view");
            super(view0, v, v1, z);
            Resources resources0 = this.getContentView().getContext().getResources();
            this.a = resources0;
            this.b = resources0.getDimension(0x7F070109);  // dimen:image_note_input_min
            this.c = 0;
        }

        @Override  // android.widget.PopupWindow
        public void update(int v, int v1, int v2, int v3, boolean z) {
            int v4 = Math.max(this.d, this.getContentView().getHeight());
            this.d = v4;
            int v5 = this.c;
            if(((float)v1) + this.b + ((float)v4) > ((float)v5)) {
                super.update(v, v5 + 300, v2, v3, z);
                return;
            }
            super.update(v, v1, v2, v3, z);
        }
    }

    private boolean a;
    @m
    private PopupWindow b;
    @m
    private Long c;
    @m
    private I0 d;
    @l
    private t e;

    public y(@l O o0) {
        L.p(o0, "lifecycleScope");
        super();
        this.a = !dl.a.F2();
        this.e = new t(o0);
    }

    private final void f(d d0) {
        dl.a.R3(true);
        dl.a.S3(true);
        dl.a.u3(true);
        d0.h();
    }

    public final boolean g() {
        return this.a;
    }

    public final void h(@m d d0) {
        I0 i00 = this.d;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            this.d = null;
        }
        if(this.b != null) {
            if(L.g(this.c, (d0 == null ? null : d0.l()))) {
                PopupWindow popupWindow0 = this.b;
                if(popupWindow0 != null) {
                    popupWindow0.dismiss();
                }
                this.b = null;
                return;
            }
            if(d0 == null) {
                PopupWindow popupWindow1 = this.b;
                if(popupWindow1 != null) {
                    popupWindow1.dismiss();
                }
                this.b = null;
            }
        }
    }

    public final void i(@l d d0, @m ViewGroup viewGroup0, boolean z) {
        @f(c = "com.dcinside.app.read.ContentAdapterGuider$showFilterGuide$1", f = "ContentAdapterGuider.kt", i = {}, l = {56, 57}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.o {
            int k;
            final ViewGroup l;
            final d m;
            final y n;
            final boolean o;

            b(ViewGroup viewGroup0, d d0, y y0, boolean z, kotlin.coroutines.d d1) {
                this.l = viewGroup0;
                this.m = d0;
                this.n = y0;
                this.o = z;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new b(this.l, this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.read.ContentAdapterGuider$showFilterGuide$1$1", f = "ContentAdapterGuider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nContentAdapterGuider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAdapterGuider.kt\ncom/dcinside/app/read/ContentAdapterGuider$showFilterGuide$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n327#2,4:165\n*S KotlinDebug\n*F\n+ 1 ContentAdapterGuider.kt\ncom/dcinside/app/read/ContentAdapterGuider$showFilterGuide$1$1\n*L\n87#1:165,4\n*E\n"})
                static final class com.dcinside.app.read.y.b.a extends o implements A3.o {
                    int k;
                    final ViewGroup l;
                    final d m;
                    final y n;
                    final boolean o;

                    com.dcinside.app.read.y.b.a(ViewGroup viewGroup0, d d0, y y0, boolean z, kotlin.coroutines.d d1) {
                        this.l = viewGroup0;
                        this.m = d0;
                        this.n = y0;
                        this.o = z;
                        super(2, d1);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.y.b.a(this.l, this.m, this.n, this.o, d0);
                    }

                    // 检测为 Lambda 实现
                    private static final void g(y y0, View view0) [...]

                    // 检测为 Lambda 实现
                    private static final void h(y y0, d d0, View view0) [...]

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.y.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        public static final class com.dcinside.app.read.y.b.a.a extends ViewOutlineProvider {
                            @Override  // android.view.ViewOutlineProvider
                            public void getOutline(@l View view0, @l Outline outline0) {
                                L.p(view0, "view");
                                L.p(outline0, "outline");
                                Path path0 = new Path();
                                float f = (float)view0.getWidth();
                                float f1 = (float)view0.getHeight();
                                path0.moveTo(0.0f, f1);
                                path0.lineTo(f / 2.0f, 0.0f);
                                path0.lineTo(f, f1);
                                if(Build.VERSION.SDK_INT >= 30) {
                                    outline0.setPath(path0);
                                    return;
                                }
                                outline0.setConvexPath(path0);
                            }
                        }

                        a y$a0;
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        if(this.l == null) {
                            return S0.a;
                        }
                        View view0 = LayoutInflater.from(this.m.itemView.getContext()).inflate(0x7F0E02B4, this.l, false);  // layout:view_word_filter_guide
                        L.o(view0, "inflate(...)");
                        TextView textView0 = (TextView)view0.findViewById(0x7F0B10EE);  // id:word_filter_guide_title
                        View view1 = view0.findViewById(0x7F0B10EC);  // id:word_filter_guide_close
                        View view2 = view0.findViewById(0x7F0B04AA);  // id:filter_guide_filter_container
                        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(textView0.getText());
                        spannableStringBuilder0.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.l.getContext(), 0x7F06001A)), 0, 6, 33);  // color:accent1
                        textView0.setText(spannableStringBuilder0);
                        View view3 = view0.findViewById(0x7F0B10ED);  // id:word_filter_guide_tip
                        view3.setOutlineProvider(new com.dcinside.app.read.y.b.a.a());
                        L.m(view3);
                        boolean z = this.o;
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view3.getLayoutParams();
                        if(viewGroup$LayoutParams0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        ((LayoutParams)viewGroup$LayoutParams0).G = z ? 0.53f : 0.9f;
                        view3.setLayoutParams(((LayoutParams)viewGroup$LayoutParams0));
                        try {
                            y$a0 = new a(view0, -2, -2, false);
                            y$a0.setAnimationStyle(0x1030000);
                            y$a0.setTouchable(true);
                            y$a0.setBackgroundDrawable(new ColorDrawable(0));
                            y$a0.showAsDropDown(this.m.k(), 0, -10, 80);
                            view1.setOnClickListener((View view0) -> {
                                PopupWindow popupWindow0 = this.n.b;
                                if(popupWindow0 != null) {
                                    popupWindow0.dismiss();
                                }
                                this.n.a = false;
                                dl.a.s6(true);
                            });
                            view2.setOnClickListener((View view0) -> {
                                PopupWindow popupWindow0 = this.n.b;
                                if(popupWindow0 != null) {
                                    popupWindow0.dismiss();
                                }
                                this.n.a = false;
                                dl.a.s6(true);
                                this.n.f(this.m);
                            });
                        }
                        catch(Exception exception0) {
                            timber.log.b.a.y(exception0);
                            y$a0 = null;
                        }
                        this.n.b = y$a0;
                        this.n.c = kotlin.coroutines.jvm.internal.b.g(this.m.l());
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        if(a0.b(300L, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
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
                com.dcinside.app.read.y.b.a y$b$a0 = new com.dcinside.app.read.y.b.a(this.l, this.m, this.n, this.o, null);
                this.k = 2;
                return i.h(h0.e(), y$b$a0, this) == object1 ? object1 : S0.a;
            }
        }

        L.p(d0, "holder");
        PopupWindow popupWindow0 = this.b;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
        I0 i00 = null;
        this.b = null;
        I0 i01 = this.d;
        if(i01 != null) {
            kotlinx.coroutines.I0.a.b(i01, null, 1, null);
        }
        Object object0 = this.e.a();
        if(((O)object0) != null) {
            i00 = k.f(((O)object0), h0.a(), null, new b(viewGroup0, d0, this, z, null), 2, null);
        }
        this.d = i00;
    }
}

