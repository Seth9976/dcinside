package com.dcinside.app.view;

import A3.p;
import Q.c;
import Q.e;
import Y.K6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.A;
import com.dcinside.app.model.Q;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.rx.a;
import com.dcinside.app.rx.bus.S;
import com.dcinside.app.rx.bus.k0;
import com.dcinside.app.type.I;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.wv.f;
import io.realm.F0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import rx.o;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nPostReadFooterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadFooterView.kt\ncom/dcinside/app/view/PostReadFooterView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n257#2,2:520\n278#2,2:522\n257#2,2:524\n257#2,2:526\n257#2,2:528\n257#2,2:530\n257#2,2:532\n255#2,4:552\n257#2,2:556\n12#3:534\n295#4,2:535\n1611#4,9:539\n1863#4:548\n1864#4:550\n1620#4:551\n60#5:537\n1#6:538\n1#6:549\n*S KotlinDebug\n*F\n+ 1 PostReadFooterView.kt\ncom/dcinside/app/view/PostReadFooterView\n*L\n141#1:520,2\n143#1:522,2\n144#1:524,2\n146#1:526,2\n147#1:528,2\n151#1:530,2\n155#1:532,2\n511#1:552,4\n515#1:556,2\n204#1:534\n204#1:535,2\n423#1:539,9\n423#1:548\n423#1:550\n423#1:551\n215#1:537\n423#1:549\n*E\n"})
public final class PostReadFooterView extends ConstraintLayout implements a, f {
    public final class n {
        public static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            try {
                arr_v[e.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.k.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.n.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.p.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.r.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            n.a = arr_v;
        }
    }

    private final a a;
    @l
    private final K6 b;
    @l
    private c c;
    @m
    private com.dcinside.app.read.C.a d;
    @m
    private com.dcinside.app.read.C.a e;
    @m
    private com.dcinside.app.ad.util.c f;
    @m
    private com.dcinside.app.ad.util.c g;
    private boolean h;
    @m
    private o i;
    @m
    private com.dcinside.app.view.tool.e j;
    @m
    private Q k;
    @m
    private o l;

    @j
    public PostReadFooterView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, null, 14, null);
    }

    @j
    public PostReadFooterView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, null, 12, null);
    }

    @j
    public PostReadFooterView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        this(context0, attributeSet0, v, null, 8, null);
    }

    @j
    public PostReadFooterView(@l Context context0, @m AttributeSet attributeSet0, int v, @l a a0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$10", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.PostReadFooterView.a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            com.dcinside.app.view.PostReadFooterView.a(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.PostReadFooterView.a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.j0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$11", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            b(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.o0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$12", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.PostReadFooterView.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            com.dcinside.app.view.PostReadFooterView.c(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.PostReadFooterView.c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.s0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$13", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.PostReadFooterView.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            com.dcinside.app.view.PostReadFooterView.d(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.PostReadFooterView.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$1", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.PostReadFooterView.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            com.dcinside.app.view.PostReadFooterView.e(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.PostReadFooterView.e(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.q0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$2", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.PostReadFooterView.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            com.dcinside.app.view.PostReadFooterView.f(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.PostReadFooterView.f(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.q0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$3", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadFooterView m;

            g(PostReadFooterView postReadFooterView0, d d0) {
                this.m = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                g postReadFooterView$g0 = new g(this.m, d0);
                postReadFooterView$g0.l = view0;
                return postReadFooterView$g0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.k0(((View)this.l));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$4", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            h(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.n0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$5", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            i(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new i(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.n0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$6", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.PostReadFooterView.j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            com.dcinside.app.view.PostReadFooterView.j(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.PostReadFooterView.j(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.l0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$7", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            k(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new k(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.l0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$8", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.PostReadFooterView.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            com.dcinside.app.view.PostReadFooterView.l(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.PostReadFooterView.l(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.r0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$9", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.PostReadFooterView.m extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadFooterView l;

            com.dcinside.app.view.PostReadFooterView.m(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.PostReadFooterView.m(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.j0();
                return S0.a;
            }
        }

        L.p(context0, "context");
        L.p(a0, "scope");
        super(context0, attributeSet0, v);
        this.a = a0;
        this.c = new c(false);
        K6 k60 = K6.b(LayoutInflater.from(context0), this);
        L.o(k60, "inflate(...)");
        this.b = k60;
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Drawable drawable0 = ContextCompat.getDrawable(this.getContext(), 0x7F080367);  // drawable:icon_nick1
        if(drawable0 != null) {
            drawable0.setBounds(0, 0, 0, 0);
        }
        k60.p.setCompoundDrawables(drawable0, null, null, null);
        this.j = new com.dcinside.app.view.tool.e(k60.i, k60.k, k60.j, null, k60.l);
        L.o(k60.v, "readFooterSearchNick");
        com.dcinside.app.view.PostReadFooterView.e postReadFooterView$e0 = new com.dcinside.app.view.PostReadFooterView.e(this, null);
        r.M(k60.v, null, postReadFooterView$e0, 1, null);
        L.o(k60.u, "readFooterSearchLink");
        com.dcinside.app.view.PostReadFooterView.f postReadFooterView$f0 = new com.dcinside.app.view.PostReadFooterView.f(this, null);
        r.M(k60.u, null, postReadFooterView$f0, 1, null);
        L.o(k60.k, "readFooterCodeInput");
        g postReadFooterView$g0 = new g(this, null);
        r.M(k60.k, null, postReadFooterView$g0, 1, null);
        L.o(k60.o, "readFooterLikeIc");
        h postReadFooterView$h0 = new h(this, null);
        r.M(k60.o, null, postReadFooterView$h0, 1, null);
        L.o(k60.r, "readFooterLikeTexts");
        i postReadFooterView$i0 = new i(this, null);
        r.M(k60.r, null, postReadFooterView$i0, 1, null);
        L.o(k60.m, "readFooterDislikeIc");
        com.dcinside.app.view.PostReadFooterView.j postReadFooterView$j0 = new com.dcinside.app.view.PostReadFooterView.j(this, null);
        r.M(k60.m, null, postReadFooterView$j0, 1, null);
        L.o(k60.n, "readFooterDislikeText");
        k postReadFooterView$k0 = new k(this, null);
        r.M(k60.n, null, postReadFooterView$k0, 1, null);
        L.o(k60.w, "readFooterShare");
        com.dcinside.app.view.PostReadFooterView.l postReadFooterView$l0 = new com.dcinside.app.view.PostReadFooterView.l(this, null);
        r.M(k60.w, null, postReadFooterView$l0, 1, null);
        L.o(k60.e, "readFooterArchive");
        com.dcinside.app.view.PostReadFooterView.m postReadFooterView$m0 = new com.dcinside.app.view.PostReadFooterView.m(this, null);
        r.M(k60.e, null, postReadFooterView$m0, 1, null);
        L.o(k60.f, "readFooterArchiveManager");
        com.dcinside.app.view.PostReadFooterView.a postReadFooterView$a0 = new com.dcinside.app.view.PostReadFooterView.a(this, null);
        r.M(k60.f, null, postReadFooterView$a0, 1, null);
        L.o(k60.t, "readFooterReportPost");
        b postReadFooterView$b0 = new b(this, null);
        r.M(k60.t, null, postReadFooterView$b0, 1, null);
        L.o(k60.y, "readFooterShieldIc");
        com.dcinside.app.view.PostReadFooterView.c postReadFooterView$c0 = new com.dcinside.app.view.PostReadFooterView.c(this, null);
        r.M(k60.y, null, postReadFooterView$c0, 1, null);
        L.o(k60.x, "readFooterShieldHeadGuide");
        com.dcinside.app.view.PostReadFooterView.d postReadFooterView$d0 = new com.dcinside.app.view.PostReadFooterView.d(this, null);
        r.M(k60.x, null, postReadFooterView$d0, 1, null);
    }

    public PostReadFooterView(Context context0, AttributeSet attributeSet0, int v, a a0, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            a0 = new com.dcinside.app.rx.h(null, 1, null);
        }
        this(context0, attributeSet0, v, a0);
    }

    // 检测为 Lambda 实现
    private static final Boolean A0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void B0(Function1 function10, Object object0) [...]

    private final boolean C0(Q q0) {
        if(q0 != null && q0.x1()) {
            List list0 = q0.M0();
            PostHead postHead0 = null;
            if(list0 != null) {
                for(Object object0: list0) {
                    Integer integer0 = q0.L0();
                    if(integer0 != null && ((PostHead)object0).i() == ((int)integer0)) {
                        postHead0 = object0;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(postHead0 != null && postHead0.q()) {
                int v = dl.a.q2().m() ? 0x7F0802E1 : 0x7F0802E2;  // drawable:ic_shield_dark
                this.b.y.setImageResource(v);
                return true;
            }
        }
        return false;
    }

    private final rx.g W(boolean z, Q q0, V v0) {
        rx.g g0;
        String s = q0.G0();
        int v1 = q0.c1();
        if(v0 != null) {
            String s1 = (String)v0.e();
            if(s1 != null && s1.length() > 0) {
                g0 = uk.DF(z, s, v1, ((String)v0.f()), ((String)v0.e()));
                L.m(g0);
                return g0;
            }
        }
        g0 = uk.CF(z, s, v1);
        L.m(g0);
        return g0;
    }

    public final void X(@m Q q0) {
        int v3;
        int v2;
        int v1;
        this.k = q0;
        this.c = q0 == null ? new c(false) : new c(q0);
        L.o(this.b.x, "readFooterShieldHeadGuide");
        this.b.x.setVisibility(8);
        if(q0 == null || !q0.K0()) {
            L.o(this.b.s, "readFooterLikes");
            this.b.s.setVisibility(0);
            L.o(this.b.f, "readFooterArchiveManager");
            this.b.f.setVisibility(8);
            if(Q.n0.d(q0)) {
                this.b.o.setImageResource(0x7F0802CD);  // drawable:ic_read_like_recommend_tinted
                this.b.o.setBackgroundResource(0x7F0805CC);  // drawable:rounded_like_bg_left_recommend
                L.o(this.b.y, "readFooterShieldIc");
                this.b.y.setVisibility(8);
            }
            else {
                this.b.o.setImageResource(0x7F0802CB);  // drawable:ic_read_like_normal_tinted
                this.b.o.setBackgroundResource(0x7F0805CB);  // drawable:rounded_like_bg_left_normal
                L.o(this.b.y, "readFooterShieldIc");
                int v = this.C0(q0) ? 0 : 8;
                this.b.y.setVisibility(v);
            }
            if(q0 == null || !q0.E0()) {
                this.b.n.setVisibility(0);
                this.b.m.setVisibility(0);
            }
            else {
                this.b.n.setVisibility(8);
                this.b.m.setVisibility(8);
            }
        }
        else {
            L.o(this.b.s, "readFooterLikes");
            this.b.s.setVisibility(4);
            L.o(this.b.f, "readFooterArchiveManager");
            this.b.f.setVisibility(0);
        }
        if(q0 == null) {
            v1 = 0;
            v2 = 0;
            v3 = 0;
        }
        else {
            int[] arr_v = q0.R0();
            v2 = arr_v[0];
            v3 = arr_v[1];
            v1 = arr_v[2];
        }
        this.b.q.setText(String.valueOf(v2));
        this.b.p.setText(String.valueOf(v3));
        this.b.n.setText(String.valueOf(v1));
        String s = q0 == null ? "" : Dl.M(q0.X0());
        this.b.v.setVisibility(0);
        String s1 = this.b.v.getContext().getString(0x7F15091A, new Object[]{s});  // string:search_nick_tagged "%1$s"
        this.b.v.setText(s1);
        Context context0 = this.b.u.getContext();
        L.o(context0, "getContext(...)");
        String s2 = com.dcinside.app.internal.c.i(vk.b(context0, 0x7F04013E));  // attr:colorFocus
        this.b.u.setVisibility(0);
        Spanned spanned0 = Dl.c(this.b.u.getContext().getString(0x7F150917, new Object[]{s2}));  // string:search_link_tagged "님의 <font color=%s>[작성글 검색]</font>"
        this.b.u.setText(spanned0);
        com.dcinside.app.view.tool.e e0 = this.j;
        if(e0 != null) {
            e0.c(q0, com.dcinside.app.type.f.b);
        }
        this.t0();
    }

    private final List Z(List list0, LinearLayout linearLayout0, LifecycleOwner lifecycleOwner0) {
        String s7;
        String s5;
        String s2;
        List list1 = new ArrayList();
        for(Object object0: list0) {
            Q.a a0 = (Q.a)object0;
            com.dcinside.app.ad.util.d d0 = null;
            switch(a0.c()) {
                case 1: {
                    d0 = new com.dcinside.app.ad.util.d(linearLayout0, a0.a());
                    break;
                }
                case 2: {
                    d0 = new com.dcinside.app.ad.util.e(linearLayout0, a0.a(), this.c);
                    break;
                }
                case 3: {
                    d0 = new com.dcinside.app.ad.util.g(linearLayout0, a0.a());
                    break;
                }
                case 4: {
                    d0 = new com.dcinside.app.ad.util.i(linearLayout0, a0.a());
                    break;
                }
                case 5: {
                    d0 = new com.dcinside.app.ad.util.f(linearLayout0, a0.a());
                    break;
                }
                case 6: {
                    if(lifecycleOwner0 != null) {
                        Q q0 = this.k;
                        Integer integer0 = q0 == null ? "" : q0.A0();
                        String s = String.valueOf(integer0);
                        Q q1 = this.k;
                        if(q1 == null) {
                            s2 = "";
                        }
                        else {
                            String s1 = q1.G0();
                            if(s1 != null) {
                                s2 = s1;
                            }
                        }
                        Q q2 = this.k;
                        Integer integer1 = q2 == null ? "" : q2.c1();
                        String s3 = String.valueOf(integer1);
                        Q q3 = this.k;
                        if(q3 == null) {
                            s5 = "";
                        }
                        else {
                            String s4 = q3.k1();
                            if(s4 != null) {
                                s5 = s4;
                            }
                        }
                        Q q4 = this.k;
                        if(q4 == null) {
                            s7 = "";
                        }
                        else {
                            String s6 = q4.W0();
                            if(s6 != null) {
                                s7 = s6;
                            }
                        }
                        d0 = new com.dcinside.app.ad.util.l(lifecycleOwner0, linearLayout0, new com.dcinside.app.ad.naver.d("view", s, s2, s3, s5, s7, null, null, 0xC0, null), null, 8, null);
                    }
                }
            }
            if(d0 != null) {
                list1.add(d0);
            }
        }
        return list1;
    }

    static List a0(PostReadFooterView postReadFooterView0, List list0, LinearLayout linearLayout0, LifecycleOwner lifecycleOwner0, int v, Object object0) {
        if((v & 4) != 0) {
            lifecycleOwner0 = null;
        }
        return postReadFooterView0.Z(list0, linearLayout0, lifecycleOwner0);
    }

    private final boolean b0(Q q0, boolean z) {
        String s = q0.h1();
        if(s != null) {
            switch(s.hashCode()) {
                case 68: {
                    return !s.equals("D") || !z;
                }
                case 85: {
                    return s.equals("U") ? z : true;
                }
                default: {
                    return true;
                }
            }
        }
        return true;
    }

    public final void c0(@m com.dcinside.app.read.C.a c$a0) {
        static final class com.dcinside.app.view.PostReadFooterView.o extends N implements A3.a {
            final PostReadFooterView e;

            com.dcinside.app.view.PostReadFooterView.o(PostReadFooterView postReadFooterView0) {
                this.e = postReadFooterView0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$loadBanner$1$1", f = "PostReadFooterView.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.view.PostReadFooterView.o.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostReadFooterView l;

                    com.dcinside.app.view.PostReadFooterView.o.a(PostReadFooterView postReadFooterView0, d d0) {
                        this.l = postReadFooterView0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.view.PostReadFooterView.o.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.view.PostReadFooterView.o.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                long v = TimeUnit.SECONDS.toMillis(jl.a.e());
                                this.k = 1;
                                if(a0.b(v, this) == object1) {
                                    return object1;
                                }
                                break;
                            }
                            case 1: {
                                f0.n(object0);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        this.l.d = null;
                        this.l.c0(this.l.d);
                        return S0.a;
                    }
                }

                com.dcinside.app.view.PostReadFooterView.o.a postReadFooterView$o$a0 = new com.dcinside.app.view.PostReadFooterView.o.a(this.e, null);
                kotlinx.coroutines.k.f(this.e, h0.e(), null, postReadFooterView$o$a0, 2, null);
            }
        }

        if(this.h) {
            return;
        }
        LinearLayout linearLayout0 = this.b.g;
        L.o(linearLayout0, "readFooterBannerContainer");
        if(!L.g(this.d, c$a0)) {
            this.d = c$a0;
            com.dcinside.app.ad.util.c c0 = this.g;
            if(c0 != null) {
                c0.onDestroy();
            }
            int v = Dk.b(0x7F070058);  // dimen:ad_minimum_height
            linearLayout0.setVisibility(0);
            linearLayout0.setMinimumHeight(v);
            List list0 = jl.a.l();
            com.dcinside.app.ad.util.c c1 = new com.dcinside.app.ad.util.c(PostReadFooterView.a0(this, Q.a.d.a(list0), linearLayout0, null, 4, null), new com.dcinside.app.view.PostReadFooterView.o(this));
            c1.c();
            this.g = c1;
        }
    }

    public static void d0(PostReadFooterView postReadFooterView0, com.dcinside.app.read.C.a c$a0, int v, Object object0) {
        if((v & 1) != 0) {
            c$a0 = null;
        }
        postReadFooterView0.c0(c$a0);
    }

    public final void e0(@l LifecycleOwner lifecycleOwner0, @m com.dcinside.app.read.C.a c$a0) {
        L.p(lifecycleOwner0, "lifecycleOwner");
        if(this.h) {
            return;
        }
        if(!L.g(this.e, c$a0)) {
            this.e = c$a0;
            com.dcinside.app.ad.util.c c0 = this.f;
            if(c0 != null) {
                c0.onDestroy();
            }
            L.o(this.b.d, "readFooterAdContainer");
            this.b.d.setVisibility(0);
            int v = Dk.b(0x7F0703D6);  // dimen:read_ad_minimum_height
            this.b.d.setMinimumHeight(v);
            List list0 = jl.a.v();
            com.dcinside.app.ad.util.c c1 = new com.dcinside.app.ad.util.c(this.Z(Q.a.d.a(list0), this.b.d, lifecycleOwner0), null, 2, null);
            c1.c();
            this.f = c1;
        }
    }

    public static void f0(PostReadFooterView postReadFooterView0, LifecycleOwner lifecycleOwner0, com.dcinside.app.read.C.a c$a0, int v, Object object0) {
        if((v & 2) != 0) {
            c$a0 = null;
        }
        postReadFooterView0.e0(lifecycleOwner0, c$a0);
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    private final boolean g0(Q q0) {
        return q0.Y0() > 0;
    }

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    // 检测为 Lambda 实现
    private static final void h0(Function1 function10, Object object0) [...]

    private final void i0(com.dcinside.app.rx.bus.g g0) {
        this.t0();
    }

    private final void j0() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        com.dcinside.app.rx.bus.c.a(context0, new k0("archive"));
    }

    private final void k0(View view0) {
        ViewParent viewParent0 = this.getParent();
        ViewParent viewParent1 = viewParent0 == null ? null : viewParent0.getParent();
        if(viewParent1 == null) {
            return;
        }
        if(viewParent1 instanceof ViewGroup) {
            ((ViewGroup)viewParent1).setDescendantFocusability(0x40000);
            view0.requestFocus();
            ((ViewGroup)viewParent1).setDescendantFocusability(0x60000);
            Nk.a.f(view0);
        }
    }

    private final void l0() {
        static final class q extends N implements p {
            final PostReadFooterView e;

            q(PostReadFooterView postReadFooterView0) {
                this.e = postReadFooterView0;
                super(3);
            }

            public final void a(@l Q q0, @l A a0, @m com.dcinside.app.view.tool.e e0) {
                static final class com.dcinside.app.view.PostReadFooterView.q.a extends N implements Function1 {
                    public static final com.dcinside.app.view.PostReadFooterView.q.a e;

                    static {
                        com.dcinside.app.view.PostReadFooterView.q.a.e = new com.dcinside.app.view.PostReadFooterView.q.a();
                    }

                    com.dcinside.app.view.PostReadFooterView.q.a() {
                        super(1);
                    }

                    public final void a(@l com.dcinside.app.realm.f0 f00) {
                        L.p(f00, "it");
                        f00.m6(true);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.dcinside.app.realm.f0)object0));
                        return S0.a;
                    }
                }

                L.p(q0, "info");
                L.p(a0, "result");
                int[] arr_v = q0.R0();
                int v = arr_v[2] + 1;
                q0.m2(new int[]{arr_v[0], arr_v[1], v});
                this.e.b.n.setText(String.valueOf(v));
                if(a0.f()) {
                    this.e.b.o.setImageResource(0x7F0802CD);  // drawable:ic_read_like_recommend_tinted
                    this.e.b.o.setBackgroundResource(0x7F0805CC);  // drawable:rounded_like_bg_left_recommend
                }
                else if(a0.c()) {
                    this.e.b.o.setImageResource(0x7F0802CB);  // drawable:ic_read_like_normal_tinted
                    this.e.b.o.setBackgroundResource(0x7F0805CB);  // drawable:rounded_like_bg_left_normal
                }
                com.dcinside.app.realm.helper.a.a.r(q0, com.dcinside.app.view.PostReadFooterView.q.a.e);
                if(e0 != null) {
                    e0.n(true);
                }
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((Q)object0), ((A)object1), ((com.dcinside.app.view.tool.e)object2));
                return S0.a;
            }
        }

        Q q0 = this.k;
        if(q0 == null) {
            return;
        }
        if(this.g0(q0)) {
            this.z0(0x7F1506EA);  // string:need_member_use_this "멤버만 이용할 수 있습니다."
            return;
        }
        this.u0(false, new q(this));
    }

    private final void m0() {
        L.o(this.b.x, "readFooterShieldHeadGuide");
        this.b.x.setVisibility(8);
    }

    private final void n0() {
        static final class com.dcinside.app.view.PostReadFooterView.r extends N implements p {
            final PostReadFooterView e;

            com.dcinside.app.view.PostReadFooterView.r(PostReadFooterView postReadFooterView0) {
                this.e = postReadFooterView0;
                super(3);
            }

            public final void a(@l Q q0, @l A a0, @m com.dcinside.app.view.tool.e e0) {
                static final class com.dcinside.app.view.PostReadFooterView.r.a extends N implements Function1 {
                    public static final com.dcinside.app.view.PostReadFooterView.r.a e;

                    static {
                        com.dcinside.app.view.PostReadFooterView.r.a.e = new com.dcinside.app.view.PostReadFooterView.r.a();
                    }

                    com.dcinside.app.view.PostReadFooterView.r.a() {
                        super(1);
                    }

                    public final void a(@l com.dcinside.app.realm.f0 f00) {
                        L.p(f00, "it");
                        f00.s6(true);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.dcinside.app.realm.f0)object0));
                        return S0.a;
                    }
                }

                L.p(q0, "info");
                L.p(a0, "result");
                int[] arr_v = q0.R0();
                int v = arr_v[0] + 1;
                int v1 = arr_v[1] + A.f.a(a0);
                q0.m2(new int[]{v, v1, arr_v[2]});
                this.e.b.q.setText(String.valueOf(v));
                this.e.b.p.setText(String.valueOf(v1));
                if(a0.f()) {
                    this.e.b.o.setImageResource(0x7F0802CD);  // drawable:ic_read_like_recommend_tinted
                    this.e.b.o.setBackgroundResource(0x7F0805CC);  // drawable:rounded_like_bg_left_recommend
                }
                else if(a0.c()) {
                    this.e.b.o.setImageResource(0x7F0802CB);  // drawable:ic_read_like_normal_tinted
                    this.e.b.o.setBackgroundResource(0x7F0805CB);  // drawable:rounded_like_bg_left_normal
                }
                com.dcinside.app.realm.helper.a.a.r(q0, com.dcinside.app.view.PostReadFooterView.r.a.e);
                if(e0 != null) {
                    e0.n(true);
                }
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((Q)object0), ((A)object1), ((com.dcinside.app.view.tool.e)object2));
                return S0.a;
            }
        }

        Q q0 = this.k;
        if(q0 == null) {
            return;
        }
        if(this.g0(q0)) {
            this.z0(0x7F1506EA);  // string:need_member_use_this "멤버만 이용할 수 있습니다."
            return;
        }
        this.u0(true, new com.dcinside.app.view.PostReadFooterView.r(this));
    }

    private final void o0() {
        static final class s extends N implements Function1 {
            final PostReadFooterView e;

            s(PostReadFooterView postReadFooterView0) {
                this.e = postReadFooterView0;
                super(1);
            }

            public final void b(String s) {
                Context context0 = this.e.getContext();
                AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
                if(appCompatActivity0 == null) {
                    return;
                }
                if(com.dcinside.app.internal.c.o(appCompatActivity0)) {
                    return;
                }
                com.dcinside.app.main.a.j(appCompatActivity0, s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        Q q0 = this.k;
        if(q0 == null) {
            return;
        }
        uk.tG(q0.G0(), q0.c1()).x5((Object object0) -> {
            L.p(new s(this), "$tmp0");
            new s(this).invoke(object0);
        });
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        static final class com.dcinside.app.view.PostReadFooterView.p extends N implements Function1 {
            final PostReadFooterView e;

            com.dcinside.app.view.PostReadFooterView.p(PostReadFooterView postReadFooterView0) {
                this.e = postReadFooterView0;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.g g0) {
                L.m(g0);
                this.e.i0(g0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.g)object0));
                return S0.a;
            }
        }

        super.onAttachedToWindow();
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        this.l = com.dcinside.app.rx.bus.c.c(context0, com.dcinside.app.rx.bus.g.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.view.PostReadFooterView.p(this), "$tmp0");
            new com.dcinside.app.view.PostReadFooterView.p(this).invoke(object0);
        });
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.t();
        this.h = true;
        com.dcinside.app.ad.util.c c0 = this.g;
        if(c0 != null) {
            c0.onDestroy();
        }
        this.g = null;
        com.dcinside.app.ad.util.c c1 = this.f;
        if(c1 != null) {
            c1.onDestroy();
        }
        this.f = null;
        com.dcinside.app.ad.util.s.c(this.b.g);
        kl.b(new o[]{this.i, this.l});
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kl.b(new o[]{this.i, this.l});
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        com.dcinside.app.ad.util.c c0 = this.g;
        if(c0 != null) {
            c0.onPause();
        }
        com.dcinside.app.ad.util.c c1 = this.f;
        if(c1 != null) {
            c1.onPause();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        com.dcinside.app.ad.util.c c0 = this.g;
        if(c0 != null) {
            c0.onResume();
        }
        com.dcinside.app.ad.util.c c1 = this.f;
        if(c1 != null) {
            c1.onResume();
        }
    }

    // 检测为 Lambda 实现
    private static final void p0(Function1 function10, Object object0) [...]

    private final void q0() {
        Q q0 = this.k;
        if(q0 == null) {
            return;
        }
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        com.dcinside.app.rx.bus.c.a(context0, new S(q0.G0(), I.f, q0.X0()));
    }

    private final void r0() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        com.dcinside.app.rx.bus.c.a(context0, new k0("dialog"));
    }

    private final void s0() {
        L.o(this.b.x, "readFooterShieldHeadGuide");
        L.o(this.b.x, "readFooterShieldHeadGuide");
        int v = this.b.x.getVisibility() == 0 ? 8 : 0;
        this.b.x.setVisibility(v);
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.a.t();
    }

    private final I0 t0() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$refreshArchiveStatus$1", f = "PostReadFooterView.kt", i = {}, l = {0xF2}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadFooterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadFooterView.kt\ncom/dcinside/app/view/PostReadFooterView$refreshArchiveStatus$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n120#2,3:520\n124#2:524\n1#3:523\n*S KotlinDebug\n*F\n+ 1 PostReadFooterView.kt\ncom/dcinside/app/view/PostReadFooterView$refreshArchiveStatus$1\n*L\n237#1:520,3\n237#1:524\n237#1:523\n*E\n"})
        static final class t extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostReadFooterView l;

            t(PostReadFooterView postReadFooterView0, d d0) {
                this.l = postReadFooterView0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new t(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((t)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.view.PostReadFooterView$refreshArchiveStatus$1$1", f = "PostReadFooterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.view.PostReadFooterView.t.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final int l;
                    final PostReadFooterView m;

                    com.dcinside.app.view.PostReadFooterView.t.a(int v, PostReadFooterView postReadFooterView0, d d0) {
                        this.l = v;
                        this.m = postReadFooterView0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.view.PostReadFooterView.t.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.view.PostReadFooterView.t.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        vk.h(this.l, new View[]{this.m.b.e});
                        vk.h(this.l, new View[]{this.m.b.f});
                        return S0.a;
                    }
                }

                boolean z;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        Q q0 = this.l.k;
                        F0 f00 = F0.g4();
                        try {
                            L.m(f00);
                            z = false;
                            if(q0 != null && com.dcinside.app.realm.helper.a.a.h(f00, q0.G0(), q0.c1()) != null) {
                                z = true;
                            }
                        }
                        catch(Throwable throwable0) {
                            kotlin.io.c.a(f00, throwable0);
                            throw throwable0;
                        }
                        kotlin.io.c.a(f00, null);
                        com.dcinside.app.view.PostReadFooterView.t.a postReadFooterView$t$a0 = new com.dcinside.app.view.PostReadFooterView.t.a((z ? 0x7F04013E : 0x7F04032A), this.l, null);  // attr:colorFocus
                        this.k = 1;
                        return kotlinx.coroutines.i.h(h0.e(), postReadFooterView$t$a0, this) == object1 ? object1 : S0.a;
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

        return kotlinx.coroutines.k.f(this, null, null, new t(this, null), 3, null);
    }

    private final void u0(boolean z, p p0) {
        static final class u extends N implements Function1 {
            public static final u e;

            static {
                u.e = new u();
            }

            u() {
                super(1);
            }

            @l
            public final Boolean a(@l com.dcinside.app.realm.f0 f00) {
                L.p(f00, "it");
                return Boolean.valueOf(f00.b6());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.realm.f0)object0));
            }
        }


        static final class v extends N implements Function1 {
            public static final v e;

            static {
                v.e = new v();
            }

            v() {
                super(1);
            }

            @l
            public final Boolean a(@l com.dcinside.app.realm.f0 f00) {
                L.p(f00, "it");
                return Boolean.valueOf(f00.V5());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.realm.f0)object0));
            }
        }


        static final class com.dcinside.app.view.PostReadFooterView.w extends N implements Function1 {
            final p e;
            final Q f;
            final com.dcinside.app.view.tool.e g;

            com.dcinside.app.view.PostReadFooterView.w(p p0, Q q0, com.dcinside.app.view.tool.e e0) {
                this.e = p0;
                this.f = q0;
                this.g = e0;
                super(1);
            }

            public final void a(A a0) {
                L.m(a0);
                this.e.invoke(this.f, a0, this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((A)object0));
                return S0.a;
            }
        }


        static final class x extends N implements Function1 {
            final String e;

            x(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class y extends N implements Function1 {
            public static final y e;

            static {
                y.e = new y();
            }

            y() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class z extends N implements Function1 {
            public static final z e;

            static {
                z.e = new z();
            }

            z() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        if(!kl.a(new o[]{this.i})) {
            Dl.D(this.getContext(), 0x7F1504F8);  // string:in_progress "처리중입니다."
            return;
        }
        Q q0 = this.k;
        if(q0 == null) {
            return;
        }
        if(z) {
            if(L.g(com.dcinside.app.realm.helper.a.a.j(q0.G0(), q0.c1(), u.e), Boolean.TRUE)) {
                Dl.D(this.getContext(), 0x7F15052B);  // string:like_only_once "추천은 1일 1회만 가능합니다."
                return;
            }
        }
        else if(L.g(com.dcinside.app.realm.helper.a.a.j(q0.G0(), q0.c1(), v.e), Boolean.TRUE)) {
            Dl.D(this.getContext(), 0x7F150285);  // string:dislike_only_once "비추천은 1일 1회만 가능합니다."
            return;
        }
        com.dcinside.app.view.tool.e e0 = this.j;
        V v0 = null;
        if(e0 == null || !e0.l() || !this.b0(q0, z)) {
            e0 = null;
        }
        if(e0 != null) {
            if(e0.h()) {
                v0 = r0.a(e0.i(), e0.j());
                this.i = this.W(z, q0, v0).y5((Object object0) -> {
                    L.p(new com.dcinside.app.view.PostReadFooterView.w(p0, q0, e0), "$tmp0");
                    new com.dcinside.app.view.PostReadFooterView.w(p0, q0, e0).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this, "this$0");
                    L.p(q0, "$info");
                    if(throwable0 instanceof com.dcinside.app.http.q) {
                        Context context0 = this.getContext();
                        L.o(context0, "getContext(...)");
                        String s = throwable0.getMessage();
                        if(s == null) {
                            s = "";
                        }
                        com.dcinside.app.rx.bus.c.a(context0, new com.dcinside.app.rx.bus.i(s, q0.G0()));
                        return;
                    }
                    AppCompatActivity appCompatActivity0 = null;
                    String s1 = throwable0.getMessage();
                    if(s1 != null) {
                        if(s1.length() <= 0) {
                            s1 = null;
                        }
                        if(s1 != null) {
                            Context context1 = this.getContext();
                            if(context1 instanceof AppCompatActivity) {
                                appCompatActivity0 = (AppCompatActivity)context1;
                            }
                            if(appCompatActivity0 == null) {
                                return;
                            }
                            com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new x(s1)).z(0x7F15034A).b().Z1((Object object0) -> {
                                L.p(y.e, "$tmp0");
                                return (Boolean)y.e.invoke(object0);
                            }).x5((Object object0) -> {
                                L.p(z.e, "$tmp0");
                                z.e.invoke(object0);
                            });
                        }
                    }
                });
                return;
            }
            Dl.D(this.getContext(), 0x7F15078D);  // string:please_code_input "코드를 입력해 주세요."
            return;
        }
        this.i = this.W(z, q0, v0).y5((Object object0) -> {
            L.p(new com.dcinside.app.view.PostReadFooterView.w(p0, q0, e0), "$tmp0");
            new com.dcinside.app.view.PostReadFooterView.w(p0, q0, e0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(q0, "$info");
            if(throwable0 instanceof com.dcinside.app.http.q) {
                Context context0 = this.getContext();
                L.o(context0, "getContext(...)");
                String s = throwable0.getMessage();
                if(s == null) {
                    s = "";
                }
                com.dcinside.app.rx.bus.c.a(context0, new com.dcinside.app.rx.bus.i(s, q0.G0()));
                return;
            }
            AppCompatActivity appCompatActivity0 = null;
            String s1 = throwable0.getMessage();
            if(s1 != null) {
                if(s1.length() <= 0) {
                    s1 = null;
                }
                if(s1 != null) {
                    Context context1 = this.getContext();
                    if(context1 instanceof AppCompatActivity) {
                        appCompatActivity0 = (AppCompatActivity)context1;
                    }
                    if(appCompatActivity0 == null) {
                        return;
                    }
                    com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new x(s1)).z(0x7F15034A).b().Z1((Object object0) -> {
                        L.p(y.e, "$tmp0");
                        return (Boolean)y.e.invoke(object0);
                    }).x5((Object object0) -> {
                        L.p(z.e, "$tmp0");
                        z.e.invoke(object0);
                    });
                }
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void v0(PostReadFooterView postReadFooterView0, Q q0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final Boolean w0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void y0(Function1 function10, Object object0) [...]

    private final void z0(int v) {
        static final class com.dcinside.app.view.PostReadFooterView.A extends N implements Function1 {
            final int e;

            com.dcinside.app.view.PostReadFooterView.A(int v) {
                this.e = v;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class B extends N implements Function1 {
            public static final B e;

            static {
                B.e = new B();
            }

            B() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class C extends N implements Function1 {
            public static final C e;

            static {
                C.e = new C();
            }

            C() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        Context context0 = this.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new com.dcinside.app.view.PostReadFooterView.A(v)).z(0x7F15034A).b().Z1((Object object0) -> {
            L.p(B.e, "$tmp0");
            return (Boolean)B.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(C.e, "$tmp0");
            C.e.invoke(object0);
        });
    }
}

