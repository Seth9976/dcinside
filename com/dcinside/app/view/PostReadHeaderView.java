package com.dcinside.app.view;

import A3.p;
import Y.L6;
import Y.N6;
import Y.O6;
import Y.u5;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannedString;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dcinside.app.Application;
import com.dcinside.app.head.e.b;
import com.dcinside.app.head.e.c;
import com.dcinside.app.head.e;
import com.dcinside.app.internal.r;
import com.dcinside.app.manager.MinorExtActivity;
import com.dcinside.app.model.K;
import com.dcinside.app.model.Q;
import com.dcinside.app.post.o0;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.rx.bus.D;
import com.dcinside.app.rx.bus.E;
import com.dcinside.app.rx.bus.H;
import com.dcinside.app.rx.bus.T;
import com.dcinside.app.rx.bus.W;
import com.dcinside.app.type.k;
import com.dcinside.app.type.t;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kr.better.widget.BetterTextView;
import rx.o;
import y4.l;
import y4.m;

@SuppressLint({"ClickableViewAccessibility"})
@s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView\n+ 2 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,510:1\n12#2:511\n12#2:514\n12#2:519\n295#3,2:512\n295#3,2:515\n295#3,2:520\n60#4:517\n1#5:518\n1310#6,2:522\n255#7,4:524\n257#7,2:528\n*S KotlinDebug\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView\n*L\n117#1:511\n121#1:514\n214#1:519\n117#1:512,2\n121#1:515,2\n214#1:520,2\n172#1:517\n258#1:522,2\n265#1:524,4\n282#1:528,2\n*E\n"})
public final class PostReadHeaderView extends DividerLinearLayout implements b, c {
    public interface i {
        void a();
    }

    public interface j {
        void a(@l PostReadHeaderView arg1, @l k arg2);
    }

    @m
    private o g;
    @m
    private k h;
    @m
    private j i;
    @m
    private i j;
    @m
    private Q k;
    @m
    private e l;
    @m
    private String m;
    @m
    private o n;
    @l
    private final L6 o;
    private u5 p;
    private N6 q;
    private O6 r;
    @l
    private final GestureDetector s;

    @z3.j
    public PostReadHeaderView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @z3.j
    public PostReadHeaderView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @z3.j
    public PostReadHeaderView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        public static final class A extends GestureDetector.SimpleOnGestureListener {
            final PostReadHeaderView a;

            A(PostReadHeaderView postReadHeaderView0) {
                this.a = postReadHeaderView0;
                super();
            }

            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onSingleTapUp(@l MotionEvent motionEvent0) {
                L.p(motionEvent0, "e");
                return this.a.i0(motionEvent0);
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$2", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            a(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                a postReadHeaderView$a0 = new a(this.m, d0);
                postReadHeaderView$a0.l = view0;
                return postReadHeaderView$a0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.P();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$3", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class com.dcinside.app.view.PostReadHeaderView.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            com.dcinside.app.view.PostReadHeaderView.b(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.PostReadHeaderView.b postReadHeaderView$b0 = new com.dcinside.app.view.PostReadHeaderView.b(this.m, d0);
                postReadHeaderView$b0.l = view0;
                return postReadHeaderView$b0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.b0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$4", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class com.dcinside.app.view.PostReadHeaderView.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            com.dcinside.app.view.PostReadHeaderView.c(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.PostReadHeaderView.c postReadHeaderView$c0 = new com.dcinside.app.view.PostReadHeaderView.c(this.m, d0);
                postReadHeaderView$c0.l = view0;
                return postReadHeaderView$c0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.b0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$5", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class com.dcinside.app.view.PostReadHeaderView.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            com.dcinside.app.view.PostReadHeaderView.d(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.PostReadHeaderView.d postReadHeaderView$d0 = new com.dcinside.app.view.PostReadHeaderView.d(this.m, d0);
                postReadHeaderView$d0.l = view0;
                return postReadHeaderView$d0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.b0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$6", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class com.dcinside.app.view.PostReadHeaderView.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            com.dcinside.app.view.PostReadHeaderView.e(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.PostReadHeaderView.e postReadHeaderView$e0 = new com.dcinside.app.view.PostReadHeaderView.e(this.m, d0);
                postReadHeaderView$e0.l = view0;
                return postReadHeaderView$e0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.a0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$7", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class com.dcinside.app.view.PostReadHeaderView.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            com.dcinside.app.view.PostReadHeaderView.f(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.PostReadHeaderView.f postReadHeaderView$f0 = new com.dcinside.app.view.PostReadHeaderView.f(this.m, d0);
                postReadHeaderView$f0.l = view0;
                return postReadHeaderView$f0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.P();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$8", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadHeaderView l;

            g(PostReadHeaderView postReadHeaderView0, d d0) {
                this.l = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.O();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$9", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadHeaderView l;

            h(PostReadHeaderView postReadHeaderView0, d d0) {
                this.l = postReadHeaderView0;
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
                this.l.h0();
                return S0.a;
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.s = new GestureDetector(context0, new A(this));
        L6 l60 = L6.b(LayoutInflater.from(context0), this);
        L.o(l60, "inflate(...)");
        this.o = l60;
        this.setOrientation(1);
        this.setPadding(0, 0, 0, 0);
        l60.t.setClickable(true);
        com.dcinside.app.view.O o0 = (View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            return this.s.onTouchEvent(motionEvent0);
        };
        l60.t.setOnTouchListener(o0);
        L.o(l60.b, "readHeaderContent");
        a postReadHeaderView$a0 = new a(this, null);
        r.M(l60.b, null, postReadHeaderView$a0, 1, null);
        L.o(l60.k, "readHeaderName");
        com.dcinside.app.view.PostReadHeaderView.b postReadHeaderView$b0 = new com.dcinside.app.view.PostReadHeaderView.b(this, null);
        r.M(l60.k, null, postReadHeaderView$b0, 1, null);
        L.o(l60.h, "readHeaderGallog");
        com.dcinside.app.view.PostReadHeaderView.c postReadHeaderView$c0 = new com.dcinside.app.view.PostReadHeaderView.c(this, null);
        r.M(l60.h, null, postReadHeaderView$c0, 1, null);
        L.o(l60.j, "readHeaderMemberIc");
        com.dcinside.app.view.PostReadHeaderView.d postReadHeaderView$d0 = new com.dcinside.app.view.PostReadHeaderView.d(this, null);
        r.M(l60.j, null, postReadHeaderView$d0, 1, null);
        L.o(l60.o, "readHeaderReplyCountWrap");
        com.dcinside.app.view.PostReadHeaderView.e postReadHeaderView$e0 = new com.dcinside.app.view.PostReadHeaderView.e(this, null);
        r.M(l60.o, null, postReadHeaderView$e0, 1, null);
        L.o(l60.d, "readHeaderDeleteDate");
        com.dcinside.app.view.PostReadHeaderView.f postReadHeaderView$f0 = new com.dcinside.app.view.PostReadHeaderView.f(this, null);
        r.M(l60.d, null, postReadHeaderView$f0, 1, null);
        L.o(l60.e, "readHeaderDeleteRemainTime");
        g postReadHeaderView$g0 = new g(this, null);
        r.M(l60.e, null, postReadHeaderView$g0, 1, null);
        L.o(l60.g, "readHeaderEnablePush");
        h postReadHeaderView$h0 = new h(this, null);
        r.M(l60.g, null, postReadHeaderView$h0, 1, null);
        this.l0(dl.a.M1());
    }

    public PostReadHeaderView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void M(Q q0) {
        N6 n60 = this.q;
        PostHead postHead0 = null;
        if(n60 == null) {
            L.S("managerBinding");
            n60 = null;
        }
        BetterTextView betterTextView0 = n60.d;
        L.o(betterTextView0, "readHeaderConfigHead");
        com.dcinside.app.head.f.a f$a0 = com.dcinside.app.head.f.h;
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        List list0 = q0.M0();
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
        e e0 = f$a0.c(context0, q0, betterTextView0, postHead0, this);
        e0.l(this);
        this.l = e0;
    }

    public final void N(@l Q q0, boolean z, @m String s) {
        int v;
        PostHead postHead1;
        L.p(q0, "info");
        Context context0 = this.getContext();
        this.o.d.setVisibility(8);
        String s1 = q0.G0();
        String s2 = q0.l1();
        com.dcinside.app.span.i i0 = o0.a.b(q0);
        String s3 = null;
        if(q0.K0()) {
            context0.getString(0x7F1509EA);  // string:state_gallery_manager "매니저"
        }
        else {
            List list0 = q0.M0();
            if(list0 != null) {
                for(Object object0: list0) {
                    Integer integer0 = q0.L0();
                    if(integer0 == null || ((PostHead)object0).i() != ((int)integer0)) {
                        continue;
                    }
                    goto label_19;
                }
                object0 = null;
            label_19:
                PostHead postHead0 = (PostHead)object0;
            }
        }
        TextView textView0 = this.o.t;
        L.o(textView0, "readHeaderSubject");
        List list1 = q0.M0();
        if(list1 == null) {
            postHead1 = null;
        }
        else {
            for(Object object1: list1) {
                Integer integer1 = q0.L0();
                if(integer1 == null || ((PostHead)object1).i() != ((int)integer1)) {
                    continue;
                }
                goto label_31;
            }
            object1 = null;
        label_31:
            postHead1 = (PostHead)object1;
        }
        if(postHead1 != null) {
            s3 = postHead1.m();
        }
        textView0.setText(com.dcinside.app.span.g.y(textView0, s3, Dl.t(q0.k1()), 0, 0, null, i0, null, null, null, null, false, false, q0.K0(), 8120, null));
        String s4 = q0.s0();
        String s5 = q0.r0();
        if(s4 == null || s4.length() == 0) {
            this.o.e.setVisibility(8);
        }
        else {
            this.o.e.setVisibility(0);
        }
        this.o.e.setText(s4);
        String s6 = this.getContext().getString(0x7F150118, new Object[]{s5});  // string:auto_delete_post_date "%s 자동 삭제"
        this.o.d.setText(s6);
        String s7 = m0.a.a.l(q0.P0(), "**", "*");
        L.m(context0);
        Spannable spannable0 = com.dcinside.app.span.g.q(context0, null, q0.X0(), s7, q0.Q0(), null, null, s2, false);
        this.o.c.setText(q0.D0());
        ImageView imageView0 = this.o.h;
        if(s7 != null && !v.x3(s7) == 1) {
            v = 8;
        }
        else if(s2 != null && s2.length() != 0) {
            v = 0;
        }
        else {
            v = 8;
        }
        imageView0.setVisibility(v);
        this.o.k.setText(spannable0);
        L.o(this.o.j, "readHeaderMemberIc");
        t.c.b(q0, this.o.j);
        CharSequence charSequence0 = com.dcinside.app.span.g.A(context0, s7, s1, s2);
        TextView textView1 = this.o.u;
        L.o(textView1, "readHeaderUserMemo");
        if(charSequence0 == null || charSequence0.length() <= 0) {
            textView1.setVisibility(8);
        }
        else {
            textView1.setText(charSequence0);
            textView1.setVisibility(0);
        }
        String s8 = context0.getString(0x7F1507C2, new Object[]{q0.N0()});  // string:post_info_hit_counts "조회 %1$d"
        this.o.i.setText(s8);
        this.o.n.setText(String.valueOf(q0.i1()));
        this.setHateWord(z);
        this.Q(q0, false);
        this.m = s;
    }

    private final void O() {
        CharSequence charSequence0 = this.o.d.getText();
        if(charSequence0 != null && charSequence0.length() != 0) {
            int v = this.o.d.getVisibility() == 0 ? 8 : 0;
            this.o.d.setVisibility(v);
        }
    }

    private final void P() {
        this.o.d.setVisibility(8);
    }

    private final void Q(Q q0, boolean z) {
        String s = B.E.k0();
        List list0 = q0.M0();
        boolean z1 = list0 != null && !list0.isEmpty() == 1;
        boolean z2 = L.g(this.k, q0);
        this.k = q0;
        boolean z3 = Q.n0.b(q0, s);
        if(q0.K0()) {
            this.o.s.setVisibility(8);
            this.o.r.setVisibility(8);
            return;
        }
        if(z3) {
            if(q0.F0() == com.dcinside.app.type.m.i) {
                this.setManagerMiniView(q0);
                return;
            }
            this.p0(q0, z, z1, !z2);
            return;
        }
        this.o.s.setVisibility(8);
        this.o.r.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final void R(Function1 function10, Object object0) [...]

    private final void S() {
        Context context0 = this.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        Q q0 = this.k;
        if(q0 == null) {
            return;
        }
        com.dcinside.app.manager.MinorExtActivity.a.b(MinorExtActivity.x, appCompatActivity0, q0.G0(), q0.c1(), 0, 8, null);
    }

    private final void T() {
        static final class com.dcinside.app.view.PostReadHeaderView.l extends N implements Function1 {
            final PostReadHeaderView e;

            com.dcinside.app.view.PostReadHeaderView.l(PostReadHeaderView postReadHeaderView0) {
                this.e = postReadHeaderView0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n("이 글을 끌올하시겠습니까?");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.view.PostReadHeaderView.m extends N implements Function1 {
            public static final com.dcinside.app.view.PostReadHeaderView.m e;

            static {
                com.dcinside.app.view.PostReadHeaderView.m.e = new com.dcinside.app.view.PostReadHeaderView.m();
            }

            com.dcinside.app.view.PostReadHeaderView.m() {
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


        static final class n extends N implements Function1 {
            final PostReadHeaderView e;

            n(PostReadHeaderView postReadHeaderView0) {
                this.e = postReadHeaderView0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.s0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Context context0 = this.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new com.dcinside.app.view.PostReadHeaderView.l(this)).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.view.PostReadHeaderView.m.e, "$tmp0");
            return (Boolean)com.dcinside.app.view.PostReadHeaderView.m.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new n(this), "$tmp0");
            new n(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean U(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void V(Function1 function10, Object object0) [...]

    private final void W() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        com.dcinside.app.rx.bus.c.a(context0, new D(1));
    }

    private final void X() {
        static final class com.dcinside.app.view.PostReadHeaderView.o extends N implements Function1 {
            final Q e;
            final PostReadHeaderView f;

            com.dcinside.app.view.PostReadHeaderView.o(Q q0, PostReadHeaderView postReadHeaderView0) {
                this.e = q0;
                this.f = postReadHeaderView0;
                super(1);
            }

            public final void a(K k0) {
                int v;
                if(L.g("recomm_up", k0.g())) {
                    this.e.C2("Y");
                    v = 0x7F150624;  // string:manager_recom_registered "개념글로 등록되었습니다."
                }
                else {
                    this.e.C2("N");
                    v = 0x7F150626;  // string:manager_recom_unregistered "개념글에서 취소되었습니다."
                }
                Dl.D(this.f.getContext(), v);
                this.f.Q(this.e, false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((K)object0));
                return S0.a;
            }
        }

        if(!kl.a(new o[]{this.g})) {
            return;
        }
        Q q0 = this.k;
        if(q0 == null) {
            return;
        }
        this.Q(q0, true);
        this.g = uk.WF(q0.G0(), q0.c1(), "recommend").y5((Object object0) -> {
            L.p(new com.dcinside.app.view.PostReadHeaderView.o(q0, this), "$tmp0");
            new com.dcinside.app.view.PostReadHeaderView.o(q0, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(q0, "$postInfo");
            Dl.G(this.getContext(), throwable0.getMessage());
            this.Q(q0, false);
        });
    }

    // 检测为 Lambda 实现
    private static final void Y(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Z(PostReadHeaderView postReadHeaderView0, Q q0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.head.e$b
    @l
    public CharSequence a(@m CharSequence charSequence0) {
        return charSequence0 == null ? this.v0(0x7F15060A) : com.dcinside.app.span.g.z(charSequence0);  // string:manager_head_register "말머리 선택"
    }

    private final void a0() {
        i postReadHeaderView$i0 = this.j;
        if(postReadHeaderView$i0 != null) {
            postReadHeaderView$i0.a();
        }
    }

    @Override  // com.dcinside.app.head.e$c
    public boolean b(@m PostHead postHead0, @m PostHead postHead1) {
        static final class q extends N implements Function1 {
            final Q e;
            final PostHead f;
            final PostReadHeaderView g;

            q(Q q0, PostHead postHead0, PostReadHeaderView postReadHeaderView0) {
                this.e = q0;
                this.f = postHead0;
                this.g = postReadHeaderView0;
                super(1);
            }

            public final void a(K k0) {
                this.e.g2(this.f.i());
                e e0 = this.g.l;
                if(e0 != null) {
                    e.n(e0, this.f, false, 2, null);
                }
                Dl.D(Application.e.c(), 0x7F15060B);  // string:manager_head_registered "말머리가 변경되었습니다."
                this.g.Q(this.e, false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((K)object0));
                return S0.a;
            }
        }

        Q q0 = this.k;
        if(q0 == null) {
            return false;
        }
        if(postHead1 == null) {
            return false;
        }
        if(!kl.a(new o[]{this.g})) {
            return false;
        }
        this.Q(q0, true);
        this.g = uk.VF(q0.G0(), q0.c1(), postHead1.i()).y5((Object object0) -> {
            L.p(new q(q0, postHead1, this), "$tmp0");
            new q(q0, postHead1, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(q0, "$info");
            e e0 = this.l;
            if(e0 != null) {
                e.n(e0, postHead0, false, 2, null);
            }
            Dl.G(Application.e.c(), throwable0.getMessage());
            this.Q(q0, false);
        });
        return false;
    }

    private final void b0() {
        static final class com.dcinside.app.view.PostReadHeaderView.p extends N implements Function1 {
            final PostReadHeaderView e;

            com.dcinside.app.view.PostReadHeaderView.p(PostReadHeaderView postReadHeaderView0) {
                this.e = postReadHeaderView0;
                super(1);
            }

            public final void b(String s) {
                Context context0 = this.e.getContext();
                L.o(context0, "getContext(...)");
                com.dcinside.app.rx.bus.c.a(context0, new H(1, s));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        Q q0 = this.k;
        if(q0 != null) {
            String s = q0.l1();
            if(s != null) {
                uk.uk(s).y5((Object object0) -> {
                    L.p(new com.dcinside.app.view.PostReadHeaderView.p(this), "$tmp0");
                    new com.dcinside.app.view.PostReadHeaderView.p(this).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this, "this$0");
                    Dl.G(this.getContext(), throwable0.getMessage());
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void c0(PostReadHeaderView postReadHeaderView0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void d0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void e0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void f0(PostReadHeaderView postReadHeaderView0, PostHead postHead0, Q q0, Throwable throwable0) [...]

    private final void g0() {
        Context context0 = this.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        Q q0 = this.k;
        if(q0 == null) {
            return;
        }
        MinorExtActivity.x.c(appCompatActivity0, q0.G0(), q0.c1());
    }

    private final void h0() {
        Context context0 = this.getContext();
        if(context0 != null) {
            com.dcinside.app.rx.bus.c.a(context0, new T());
        }
    }

    private final boolean i0(MotionEvent motionEvent0) {
        L.o(this.o.t, "readHeaderSubject");
        float f = motionEvent0.getX() - ((float)this.o.t.getTotalPaddingLeft()) + ((float)this.o.t.getScrollX());
        float f1 = motionEvent0.getY() - ((float)this.o.t.getTotalPaddingTop()) + ((float)this.o.t.getScrollY());
        Layout layout0 = this.o.t.getLayout();
        L.o(layout0, "getLayout(...)");
        int v = layout0.getOffsetForHorizontal(layout0.getLineForVertical(((int)f1)), f);
        CharSequence charSequence0 = this.o.t.getText();
        L.n(charSequence0, "null cannot be cast to non-null type android.text.SpannedString");
        Object[] arr_object = ((SpannedString)charSequence0).getSpans(v, v, com.dcinside.app.span.b.class);
        L.o(arr_object, "getSpans(...)");
        for(int v1 = 0; true; ++v1) {
            com.dcinside.app.span.b b0 = null;
            if(v1 >= ((com.dcinside.app.span.b[])arr_object).length) {
                break;
            }
            com.dcinside.app.span.b b1 = ((com.dcinside.app.span.b[])arr_object)[v1];
            if(b1.b() == 0x7F080283) {  // drawable:ic_list_head_live_blue_lite_tinted
                b0 = b1;
                break;
            }
        }
        if(b0 == null) {
            return false;
        }
        this.j0();
        return true;
    }

    private final void j0() {
        @f(c = "com.dcinside.app.view.PostReadHeaderView$onToggleSubjectLiveBestMessage$1$1", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.PostReadHeaderView.r extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final PostReadHeaderView l;

            com.dcinside.app.view.PostReadHeaderView.r(PostReadHeaderView postReadHeaderView0, d d0) {
                this.l = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.PostReadHeaderView.r(this.l, d0).invokeSuspend(S0.a);
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

        u5 u50 = null;
        u5 u51 = this.p;
        if(u51 != null) {
            if(u51 == null) {
                L.S("liveBestMessageBinding");
                u51 = null;
            }
            ConstraintLayout constraintLayout0 = u51.b();
            L.o(constraintLayout0, "getRoot(...)");
            u5 u52 = this.p;
            if(u52 == null) {
                L.S("liveBestMessageBinding");
            }
            else {
                u50 = u52;
            }
            ConstraintLayout constraintLayout1 = u50.b();
            L.o(constraintLayout1, "getRoot(...)");
            constraintLayout0.setVisibility((constraintLayout1.getVisibility() == 0 ? 8 : 0));
            return;
        }
        C c0 = (ViewStub viewStub0, View view0) -> {
            L.p(this, "this$0");
            u5 u50 = u5.a(view0);
            L.o(u50, "bind(...)");
            this.p = u50;
            if(u50 == null) {
                L.S("liveBestMessageBinding");
                u50 = null;
            }
            ConstraintLayout constraintLayout0 = u50.b();
            L.o(constraintLayout0, "getRoot(...)");
            r.M(constraintLayout0, null, new com.dcinside.app.view.PostReadHeaderView.r(this, null), 1, null);
        };
        this.o.q.setOnInflateListener(c0);
        this.o.q.inflate();
    }

    // 检测为 Lambda 实现
    private static final void k0(PostReadHeaderView postReadHeaderView0, ViewStub viewStub0, View view0) [...]

    private final void l0(k k0) {
        if(this.h != k0) {
            j postReadHeaderView$j0 = this.i;
            if(postReadHeaderView$j0 != null) {
                postReadHeaderView$j0.a(this, k0);
            }
        }
    }

    private final void m0(boolean z, boolean z1, boolean z2) {
        int v = 0;
        N6 n60 = null;
        if(z) {
            N6 n61 = this.q;
            if(n61 == null) {
                L.S("managerBinding");
                n61 = null;
            }
            n61.f.setVisibility(0);
            N6 n62 = this.q;
            if(n62 == null) {
                L.S("managerBinding");
                n62 = null;
            }
            n62.e.setVisibility(8);
            N6 n63 = this.q;
            if(n63 == null) {
                L.S("managerBinding");
                n63 = null;
            }
            n63.g.setVisibility(8);
            N6 n64 = this.q;
            if(n64 == null) {
                L.S("managerBinding");
                n64 = null;
            }
            n64.c.setVisibility(8);
            N6 n65 = this.q;
            if(n65 == null) {
                L.S("managerBinding");
                n65 = null;
            }
            n65.b.setVisibility(8);
            N6 n66 = this.q;
            if(n66 == null) {
                L.S("managerBinding");
            }
            else {
                n60 = n66;
            }
            n60.d.setVisibility(8);
            return;
        }
        N6 n67 = this.q;
        if(n67 == null) {
            L.S("managerBinding");
            n67 = null;
        }
        n67.f.setVisibility(8);
        N6 n68 = this.q;
        if(n68 == null) {
            L.S("managerBinding");
            n68 = null;
        }
        n68.e.setVisibility(0);
        N6 n69 = this.q;
        if(n69 == null) {
            L.S("managerBinding");
            n69 = null;
        }
        n69.g.setVisibility(0);
        N6 n610 = this.q;
        if(n610 == null) {
            L.S("managerBinding");
            n610 = null;
        }
        n610.c.setVisibility(0);
        N6 n611 = this.q;
        if(n611 == null) {
            L.S("managerBinding");
            n611 = null;
        }
        n611.b.setVisibility((z2 ? 8 : 0));
        N6 n612 = this.q;
        if(n612 == null) {
            L.S("managerBinding");
        }
        else {
            n60 = n612;
        }
        BetterTextView betterTextView0 = n60.d;
        if(!z1) {
            v = 8;
        }
        betterTextView0.setVisibility(v);
    }

    static void n0(PostReadHeaderView postReadHeaderView0, boolean z, boolean z1, boolean z2, int v, Object object0) {
        if((v & 2) != 0) {
            z1 = false;
        }
        if((v & 4) != 0) {
            z2 = false;
        }
        postReadHeaderView0.m0(z, z1, z2);
    }

    // 检测为 Lambda 实现
    private static final void o0(PostReadHeaderView postReadHeaderView0, boolean z, ViewStub viewStub0, View view0) [...]

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        static final class com.dcinside.app.view.PostReadHeaderView.k extends N implements Function1 {
            final PostReadHeaderView e;

            com.dcinside.app.view.PostReadHeaderView.k(PostReadHeaderView postReadHeaderView0) {
                this.e = postReadHeaderView0;
                super(1);
            }

            public final void a(E e0) {
                this.e.Q(e0.a(), e0.b());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((E)object0));
                return S0.a;
            }
        }

        super.onAttachedToWindow();
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        this.n = com.dcinside.app.rx.bus.c.c(context0, E.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.view.PostReadHeaderView.k(this), "$tmp0");
            new com.dcinside.app.view.PostReadHeaderView.k(this).invoke(object0);
        });
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o o0 = this.n;
        if(o0 != null) {
            o0.l();
        }
        this.n = null;
        o o1 = this.g;
        if(o1 != null) {
            o1.l();
        }
        this.g = null;
    }

    private final void p0(Q q0, boolean z, boolean z1, boolean z2) {
        @f(c = "com.dcinside.app.view.PostReadHeaderView$setManagerView$1$1", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$setManagerView$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class com.dcinside.app.view.PostReadHeaderView.v extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            com.dcinside.app.view.PostReadHeaderView.v(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.PostReadHeaderView.v postReadHeaderView$v0 = new com.dcinside.app.view.PostReadHeaderView.v(this.m, d0);
                postReadHeaderView$v0.l = view0;
                return postReadHeaderView$v0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.W();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$setManagerView$1$2", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$setManagerView$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class com.dcinside.app.view.PostReadHeaderView.w extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            com.dcinside.app.view.PostReadHeaderView.w(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.PostReadHeaderView.w postReadHeaderView$w0 = new com.dcinside.app.view.PostReadHeaderView.w(this.m, d0);
                postReadHeaderView$w0.l = view0;
                return postReadHeaderView$w0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.X();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$setManagerView$1$3", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$setManagerView$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class x extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            x(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                x postReadHeaderView$x0 = new x(this.m, d0);
                postReadHeaderView$x0.l = view0;
                return postReadHeaderView$x0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.S();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$setManagerView$1$4", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$setManagerView$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class y extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            y(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                y postReadHeaderView$y0 = new y(this.m, d0);
                postReadHeaderView$y0.l = view0;
                return postReadHeaderView$y0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.T();
                return S0.a;
            }
        }

        boolean z3 = Q.n0.c(q0);
        if(this.q != null) {
            View view0 = this.o.r.getRootView();
            L.o(view0, "getRootView(...)");
            view0.setVisibility(0);
            if(z) {
                PostReadHeaderView.n0(this, true, false, false, 6, null);
                return;
            }
            this.r0(q0, z2);
            this.m0(false, z1, z3);
            return;
        }
        com.dcinside.app.view.L l0 = (ViewStub viewStub0, View view0) -> {
            L.p(this, "this$0");
            L.p(q0, "$info");
            N6 n60 = N6.a(view0);
            L.o(n60, "bind(...)");
            this.q = n60;
            if(z) {
                PostReadHeaderView.n0(this, true, false, false, 6, null);
                return;
            }
            if(n60 == null) {
                L.S("managerBinding");
                n60 = null;
            }
            L.o(n60.e, "readHeaderConfigNotice");
            com.dcinside.app.view.PostReadHeaderView.v postReadHeaderView$v0 = new com.dcinside.app.view.PostReadHeaderView.v(this, null);
            r.M(n60.e, null, postReadHeaderView$v0, 1, null);
            N6 n61 = this.q;
            if(n61 == null) {
                L.S("managerBinding");
                n61 = null;
            }
            L.o(n61.g, "readHeaderConfigRecom");
            com.dcinside.app.view.PostReadHeaderView.w postReadHeaderView$w0 = new com.dcinside.app.view.PostReadHeaderView.w(this, null);
            r.M(n61.g, null, postReadHeaderView$w0, 1, null);
            N6 n62 = this.q;
            if(n62 == null) {
                L.S("managerBinding");
                n62 = null;
            }
            L.o(n62.c, "readHeaderConfigBlock");
            x postReadHeaderView$x0 = new x(this, null);
            r.M(n62.c, null, postReadHeaderView$x0, 1, null);
            N6 n63 = this.q;
            if(n63 == null) {
                L.S("managerBinding");
                n63 = null;
            }
            L.o(n63.b, "readHeaderBump");
            y postReadHeaderView$y0 = new y(this, null);
            r.M(n63.b, null, postReadHeaderView$y0, 1, null);
            this.r0(q0, z2);
            this.m0(false, z1, z3);
        };
        this.o.r.setOnInflateListener(l0);
        this.o.r.inflate();
    }

    // 检测为 Lambda 实现
    private static final void q0(PostReadHeaderView postReadHeaderView0, boolean z, Q q0, boolean z1, boolean z2, boolean z3, ViewStub viewStub0, View view0) [...]

    private final void r0(Q q0, boolean z) {
        N6 n60 = this.q;
        N6 n61 = null;
        if(n60 == null) {
            L.S("managerBinding");
            n60 = null;
        }
        com.dcinside.app.model.Q.a q$a0 = Q.n0;
        int v = q$a0.c(q0) ? 0x7F15060F : 0x7F15060C;  // string:manager_notice_unregister "공지 해제"
        n60.e.setText(this.v0(v));
        N6 n62 = this.q;
        if(n62 == null) {
            L.S("managerBinding");
            n62 = null;
        }
        int v1 = q$a0.d(q0) ? 0x7F150625 : 0x7F150623;  // string:manager_recom_unregister "개념글 취소"
        n62.g.setText(this.v0(v1));
        N6 n63 = this.q;
        if(n63 == null) {
            L.S("managerBinding");
            n63 = null;
        }
        Spannable spannable0 = this.v0(0x7F150675);  // string:minor_action_block "차단하기"
        n63.c.setText(spannable0);
        N6 n64 = this.q;
        if(n64 == null) {
            L.S("managerBinding");
        }
        else {
            n61 = n64;
        }
        Spannable spannable1 = this.v0(0x7F1507B9);  // string:post_head_mini_bump "끌올"
        n61.b.setText(spannable1);
        if(z) {
            this.M(q0);
        }
    }

    private final void s0() {
        static final class z extends N implements Function1 {
            final PostReadHeaderView e;
            final Q f;
            final String g;
            final int h;

            z(PostReadHeaderView postReadHeaderView0, Q q0, String s, int v) {
                this.e = postReadHeaderView0;
                this.f = q0;
                this.g = s;
                this.h = v;
                super(1);
            }

            public final void a(K k0) {
                Dl.D(this.e.getContext(), 0x7F150211);  // string:complete_bump "끌올되었습니다."
                this.e.Q(this.f, false);
                Context context0 = this.e.getContext();
                L.o(context0, "getContext(...)");
                com.dcinside.app.rx.bus.c.a(context0, new W(4, this.g, this.h, 0, 8, null));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((K)object0));
                return S0.a;
            }
        }

        if(!kl.a(new o[]{this.g})) {
            return;
        }
        Q q0 = this.k;
        if(q0 == null) {
            return;
        }
        String s = q0.G0();
        int v = q0.c1();
        this.g = uk.WF(s, v, "bump").y5((Object object0) -> {
            L.p(new z(this, q0, s, v), "$tmp0");
            new z(this, q0, s, v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(q0, "$postInfo");
            Dl.G(this.getContext(), throwable0.getMessage());
            this.Q(q0, false);
        });
    }

    private final void setHateWord(boolean z) {
        this.o.p.setVisibility((z ? 0 : 8));
    }

    private final void setManagerMiniView(Q q0) {
        @f(c = "com.dcinside.app.view.PostReadHeaderView$setManagerMiniView$1$1", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$setManagerMiniView$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class s extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            s(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                s postReadHeaderView$s0 = new s(this.m, d0);
                postReadHeaderView$s0.l = view0;
                return postReadHeaderView$s0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.S();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$setManagerMiniView$1$2", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$setManagerMiniView$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class com.dcinside.app.view.PostReadHeaderView.t extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            com.dcinside.app.view.PostReadHeaderView.t(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.PostReadHeaderView.t postReadHeaderView$t0 = new com.dcinside.app.view.PostReadHeaderView.t(this.m, d0);
                postReadHeaderView$t0.l = view0;
                return postReadHeaderView$t0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.g0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadHeaderView$setManagerMiniView$1$3", f = "PostReadHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostReadHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadHeaderView.kt\ncom/dcinside/app/view/PostReadHeaderView$setManagerMiniView$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
        static final class u extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PostReadHeaderView m;

            u(PostReadHeaderView postReadHeaderView0, d d0) {
                this.m = postReadHeaderView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                u postReadHeaderView$u0 = new u(this.m, d0);
                postReadHeaderView$u0.l = view0;
                return postReadHeaderView$u0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                this.m.T();
                return S0.a;
            }
        }

        boolean z = Q.n0.c(q0);
        if(this.r != null) {
            int v = 0;
            this.o.s.getRootView().setVisibility(0);
            O6 o60 = this.r;
            O6 o61 = null;
            if(o60 == null) {
                L.S("managerMiniBinding");
                o60 = null;
            }
            o60.b.setVisibility(0);
            O6 o62 = this.r;
            if(o62 == null) {
                L.S("managerMiniBinding");
            }
            else {
                o61 = o62;
            }
            TextView textView0 = o61.c;
            if(z) {
                v = 8;
            }
            textView0.setVisibility(v);
            return;
        }
        com.dcinside.app.view.K k0 = (ViewStub viewStub0, View view0) -> {
            L.p(this, "this$0");
            O6 o60 = O6.a(view0);
            L.o(o60, "bind(...)");
            this.r = o60;
            O6 o61 = null;
            if(o60 == null) {
                L.S("managerMiniBinding");
                o60 = null;
            }
            L.o(o60.b, "readHeaderMiniBlock");
            s postReadHeaderView$s0 = new s(this, null);
            r.M(o60.b, null, postReadHeaderView$s0, 1, null);
            O6 o62 = this.r;
            if(o62 == null) {
                L.S("managerMiniBinding");
                o62 = null;
            }
            L.o(o62.e, "readHeaderMiniPostManage");
            com.dcinside.app.view.PostReadHeaderView.t postReadHeaderView$t0 = new com.dcinside.app.view.PostReadHeaderView.t(this, null);
            r.M(o62.e, null, postReadHeaderView$t0, 1, null);
            O6 o63 = this.r;
            if(o63 == null) {
                L.S("managerMiniBinding");
                o63 = null;
            }
            L.o(o63.c, "readHeaderMiniBump");
            u postReadHeaderView$u0 = new u(this, null);
            r.M(o63.c, null, postReadHeaderView$u0, 1, null);
            O6 o64 = this.r;
            if(o64 == null) {
                L.S("managerMiniBinding");
                o64 = null;
            }
            int v = 0;
            o64.b.setVisibility(0);
            O6 o65 = this.r;
            if(o65 == null) {
                L.S("managerMiniBinding");
            }
            else {
                o61 = o65;
            }
            TextView textView0 = o61.c;
            if(z) {
                v = 8;
            }
            textView0.setVisibility(v);
        };
        this.o.s.setOnInflateListener(k0);
        this.o.s.inflate();
    }

    public final void setOnCountClickListener(@l i postReadHeaderView$i0) {
        L.p(postReadHeaderView$i0, "onCountClickListener");
        this.j = postReadHeaderView$i0;
    }

    public final void setOnReadTextSizeChangeListener(@l j postReadHeaderView$j0) {
        L.p(postReadHeaderView$j0, "l");
        this.i = postReadHeaderView$j0;
    }

    // 检测为 Lambda 实现
    private static final void t0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void u0(PostReadHeaderView postReadHeaderView0, Q q0, Throwable throwable0) [...]

    private final Spannable v0(@StringRes int v) {
        return com.dcinside.app.span.g.z(this.getContext().getString(v));
    }

    // 检测为 Lambda 实现
    private static final boolean w(PostReadHeaderView postReadHeaderView0, View view0, MotionEvent motionEvent0) [...]
}

