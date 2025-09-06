package com.dcinside.app.write;

import A3.p;
import A3.q;
import Y.f4;
import Z.d;
import android.content.Context;
import android.graphics.Paint.FontMetricsInt;
import android.text.Editable;
import android.text.Layout;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.e;
import com.dcinside.app.dccon.j;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.k0;
import com.dcinside.app.rx.bus.n0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Wk;
import com.dcinside.app.util.Yk;
import com.dcinside.app.util.vk;
import com.dcinside.rich.RichEditText;
import com.dcinside.rich.spans.HashSpan;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.enums.a;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nPostWriteTextHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteTextHolder.kt\ncom/dcinside/app/write/PostWriteTextHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,327:1\n1#2:328\n20#3:329\n20#3:348\n20#3:350\n20#3:352\n25#4:330\n25#4:349\n25#4:351\n25#4:353\n257#5,2:331\n255#5:333\n257#5,2:334\n327#5,4:336\n257#5,2:342\n257#5,2:344\n257#5,2:346\n183#6,2:340\n*S KotlinDebug\n*F\n+ 1 PostWriteTextHolder.kt\ncom/dcinside/app/write/PostWriteTextHolder\n*L\n93#1:329\n261#1:348\n281#1:350\n302#1:352\n93#1:330\n261#1:349\n281#1:351\n302#1:353\n126#1:331,2\n128#1:333\n129#1:334,2\n172#1:336,4\n223#1:342,2\n226#1:344,2\n252#1:346,2\n178#1:340,2\n*E\n"})
public final class y2 extends e implements d {
    public static enum com.dcinside.app.write.y2.e {
        NORMAL,
        HASH;

        private static final com.dcinside.app.write.y2.e[] c;
        private static final a d;

        static {
            com.dcinside.app.write.y2.e.c = arr_y2$e;
            L.p(arr_y2$e, "entries");
            com.dcinside.app.write.y2.e.d = new kotlin.enums.d(arr_y2$e);
        }

        private static final com.dcinside.app.write.y2.e[] a() [...] // Inlined contents

        @l
        public static a b() {
            return com.dcinside.app.write.y2.e.d;
        }
    }

    public final class f {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.write.y2.e.values().length];
            try {
                arr_v[com.dcinside.app.write.y2.e.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.y2.e.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            f.a = arr_v;
        }
    }

    @l
    private final RichEditText a;
    @l
    private final View b;
    @l
    private final View c;
    @l
    private final ViewStub d;
    private f4 e;
    @m
    private j f;
    private boolean g;
    @l
    private com.dcinside.app.write.y2.e h;

    public y2(@l ViewGroup viewGroup0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteTextHolder$3", f = "PostWriteTextHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.y2.a extends o implements p {
            int k;
            final y2 l;

            com.dcinside.app.write.y2.a(y2 y20, kotlin.coroutines.d d0) {
                this.l = y20;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.y2.a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.F();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteTextHolder$4", f = "PostWriteTextHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements q {
            int k;
            boolean l;
            final y2 m;

            b(y2 y20, kotlin.coroutines.d d0) {
                this.m = y20;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((View)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l View view0, boolean z, @m kotlin.coroutines.d d0) {
                b y2$b0 = new b(this.m, d0);
                y2$b0.l = z;
                return y2$b0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.G(this.l);
                return S0.a;
            }
        }


        static final class c extends N implements Function1 {
            final y2 e;

            c(y2 y20) {
                this.e = y20;
                super(1);
            }

            public final void a(@l RichEditText richEditText0) {
                L.p(richEditText0, "it");
                this.e.E(richEditText0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((RichEditText)object0));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteTextHolder$6", f = "PostWriteTextHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.y2.d extends o implements p {
            int k;
            final y2 l;

            com.dcinside.app.write.y2.d(y2 y20, kotlin.coroutines.d d0) {
                this.l = y20;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.y2.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.I();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E02BE);  // layout:view_write_item_text
        View view0 = this.itemView.findViewById(0x7F0B0BBC);  // id:post_write_item_text
        L.o(view0, "findViewById(...)");
        this.a = (RichEditText)view0;
        View view1 = this.itemView.findViewById(0x7F0B0BAF);  // id:post_write_item_move
        L.o(view1, "findViewById(...)");
        this.b = view1;
        View view2 = this.itemView.findViewById(0x7F0B0BBD);  // id:post_write_item_text_hint
        L.o(view2, "findViewById(...)");
        this.c = view2;
        View view3 = this.itemView.findViewById(0x7F0B0B68);  // id:post_write_dccon_tag_search_stub
        L.o(view3, "findViewById(...)");
        this.d = (ViewStub)view3;
        this.h = com.dcinside.app.write.y2.e.a;
        v2 v20 = (View view0, boolean z) -> {
            L.p(this, "this$0");
            if(z) {
                this.g = false;
                this.a.setEnabled(false);
                this.a.setEnabled(true);
                return;
            }
            this.d.setVisibility(8);
        };
        com.dcinside.app.util.ql.a.a(this.itemView, v20);
        Context context0 = Dl.b(this.itemView);
        PostWriteActivity postWriteActivity0 = context0 instanceof PostWriteActivity ? ((PostWriteActivity)context0) : null;
        ((RichEditText)view0).setToolbar((postWriteActivity0 == null ? null : postWriteActivity0.N6()));
        ((RichEditText)view0).setOnKeyListener((View view0, int v, KeyEvent keyEvent0) -> {
            L.p(this, "this$0");
            L.m(view0);
            L.m(keyEvent0);
            return this.H(view0, v, keyEvent0);
        });
        r.M(((RichEditText)view0), null, new com.dcinside.app.write.y2.a(this, null), 1, null);
        r.P(((RichEditText)view0), null, new b(this, null), 1, null);
        ((RichEditText)view0).setOnStyleApplyListener(new c(this));
        r.M(view2, null, new com.dcinside.app.write.y2.d(this, null), 1, null);
        view1.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            return this.D(motionEvent0);
        });
    }

    @m
    public final j A() {
        return this.f;
    }

    private final void B(String s, int v) {
        int v1;
        f4 f40 = null;
        Context context0 = this.itemView.getContext();
        L.o(context0, "getContext(...)");
        com.dcinside.app.rx.bus.c.a(context0, new n0(true));
        if(this.e == null) {
            if(s == null || s.length() == 0) {
                v1 = 0;
            }
            else {
                t2 t20 = (ViewStub viewStub0, View view0) -> {
                    L.p(this, "this$0");
                    f4 f40 = f4.a(view0);
                    L.o(f40, "bind(...)");
                    this.e = f40;
                    Context context0 = this.itemView.getContext();
                    L.o(context0, "getContext(...)");
                    j j0 = new j(context0);
                    this.f = j0;
                    f4 f41 = this.e;
                    f4 f42 = null;
                    if(f41 == null) {
                        L.S("dcconTagSearchBinding");
                        f41 = null;
                    }
                    L.o(f41.b, "dcconTagPreview");
                    j0.n(f41.b);
                    j j1 = this.f;
                    if(j1 != null) {
                        f4 f43 = this.e;
                        if(f43 == null) {
                            L.S("dcconTagSearchBinding");
                            f43 = null;
                        }
                        L.o(f43.c, "dcconTagPreviewProgress");
                        j1.m(f43.c);
                    }
                    j j2 = this.f;
                    if(j2 != null) {
                        f4 f44 = this.e;
                        if(f44 == null) {
                            L.S("dcconTagSearchBinding");
                        }
                        else {
                            f42 = f44;
                        }
                        L.o(f42.d, "dcconTagTextEmpty");
                        j2.l(f42.d);
                    }
                    this.K(s, v);
                };
                this.d.setOnInflateListener(t20);
                this.d.inflate();
                v1 = 1;
            }
        }
        else if(s != null && s.length() != 0) {
            f4 f41 = this.e;
            if(f41 == null) {
                L.S("dcconTagSearchBinding");
                f41 = null;
            }
            ConstraintLayout constraintLayout0 = f41.b();
            L.o(constraintLayout0, "getRoot(...)");
            v1 = (constraintLayout0.getVisibility() == 0 ? 1 : 0) ^ 1;
            f4 f42 = this.e;
            if(f42 == null) {
                L.S("dcconTagSearchBinding");
            }
            else {
                f40 = f42;
            }
            ConstraintLayout constraintLayout1 = f40.b();
            L.o(constraintLayout1, "getRoot(...)");
            constraintLayout1.setVisibility(0);
            this.K(s, v);
        }
        else {
            f4 f43 = this.e;
            if(f43 == null) {
                L.S("dcconTagSearchBinding");
            }
            else {
                f40 = f43;
            }
            ConstraintLayout constraintLayout2 = f40.b();
            L.o(constraintLayout2, "getRoot(...)");
            constraintLayout2.setVisibility(8);
            v1 = 0;
        }
        if(v1 != 0) {
            Editable editable0 = this.a.getText();
            if(editable0 != null) {
                Character character0 = v.x7(editable0);
                if(character0 != null && kotlin.text.c.r(character0.charValue())) {
                    this.M(editable0);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void C(y2 y20, String s, int v, ViewStub viewStub0, View view0) [...]

    private final boolean D(MotionEvent motionEvent0) {
        d1 d10;
        if(motionEvent0 == null) {
            return false;
        }
        if(motionEvent0.getActionMasked() == 0) {
            RecyclerView recyclerView0 = this.e();
            if(recyclerView0 == null) {
                return false;
            }
            RecyclerView recyclerView1 = this.e();
            PostWriteActivity postWriteActivity0 = null;
            if(recyclerView1 == null) {
                d10 = null;
            }
            else {
                Adapter recyclerView$Adapter0 = recyclerView1.getAdapter();
                if(!(recyclerView$Adapter0 instanceof d1)) {
                    recyclerView$Adapter0 = null;
                }
                d10 = (d1)recyclerView$Adapter0;
            }
            if(d10 == null) {
                return false;
            }
            Context context0 = Dl.b(recyclerView0);
            if(context0 instanceof PostWriteActivity) {
                postWriteActivity0 = (PostWriteActivity)context0;
            }
            if(postWriteActivity0 == null) {
                return false;
            }
            Nk.a.a(postWriteActivity0);
            Wk wk0 = (Wk)d10.J().a();
            if(wk0 != null) {
                wk0.u(this);
            }
            return true;
        }
        return false;
    }

    private final void E(RichEditText richEditText0) {
        Integer integer0 = this.getBindingAdapterPosition();
        Adapter recyclerView$Adapter0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            RecyclerView recyclerView0 = this.e();
            if(recyclerView0 != null) {
                Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
                if(recyclerView$Adapter1 instanceof d1) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                recyclerView$Adapter0 = (d1)recyclerView$Adapter0;
            }
            if(recyclerView$Adapter0 == null) {
                return;
            }
            Object object0 = ((d1)recyclerView$Adapter0).S().get(v);
            L.o(object0, "get(...)");
            ((k0)object0).p6(richEditText0.getHtml());
            this.u(String.valueOf(richEditText0.getText()));
        }
    }

    private final void F() {
        RecyclerView recyclerView0 = this.e();
        if(recyclerView0 == null) {
            return;
        }
        Context context0 = Dl.b(recyclerView0);
        PostWriteActivity postWriteActivity0 = context0 instanceof PostWriteActivity ? ((PostWriteActivity)context0) : null;
        if(postWriteActivity0 == null) {
            return;
        }
        postWriteActivity0.H5();
        Nk.a.f(this.a);
        if(this.h == com.dcinside.app.write.y2.e.a) {
            this.u(String.valueOf(this.a.getText()));
        }
    }

    private final void G(boolean z) {
        RecyclerView recyclerView0 = this.e();
        if(recyclerView0 == null) {
            return;
        }
        Context context0 = Dl.b(this.e());
        Adapter recyclerView$Adapter0 = null;
        PostWriteActivity postWriteActivity0 = context0 instanceof PostWriteActivity ? ((PostWriteActivity)context0) : null;
        if(postWriteActivity0 == null) {
            return;
        }
        Integer integer0 = this.getBindingAdapterPosition();
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            RecyclerView recyclerView1 = this.e();
            if(recyclerView1 != null) {
                Adapter recyclerView$Adapter1 = recyclerView1.getAdapter();
                if(recyclerView$Adapter1 instanceof d1) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                recyclerView$Adapter0 = (d1)recyclerView$Adapter0;
            }
            if(recyclerView$Adapter0 == null) {
                return;
            }
            if(z) {
                postWriteActivity0.H5();
                postWriteActivity0.o6();
                Nk.a.f(this.a);
                this.u(String.valueOf(this.a.getText()));
                return;
            }
            this.d.setVisibility(8);
            if(!recyclerView0.isComputingLayout()) {
                Editable editable0 = this.a.getText();
                if((editable0 == null || editable0.length() <= 0) && ((d1)recyclerView$Adapter0).S().size() > 1 && !((d1)recyclerView$Adapter0).W()) {
                    ((d1)recyclerView$Adapter0).q(v);
                }
            }
        }
    }

    private final boolean H(View view0, int v, KeyEvent keyEvent0) {
        Integer integer0 = this.getBindingAdapterPosition();
        Adapter recyclerView$Adapter0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v1 = (int)integer0;
            RecyclerView recyclerView0 = this.e();
            if(recyclerView0 != null) {
                Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
                if(recyclerView$Adapter1 instanceof d1) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                recyclerView$Adapter0 = (d1)recyclerView$Adapter0;
            }
            if(recyclerView$Adapter0 == null) {
                return false;
            }
            if(v1 == 0 && ((d1)recyclerView$Adapter0).S().size() == 1) {
                return false;
            }
            if(v == 67) {
                L.n(view0, "null cannot be cast to non-null type android.widget.TextView");
                CharSequence charSequence0 = ((TextView)view0).getText();
                L.o(charSequence0, "getText(...)");
                if(charSequence0.length() == 0) {
                    if(this.g) {
                        this.g = false;
                        Nk.a.c(view0);
                        ((d1)recyclerView$Adapter0).q(v1);
                        return true;
                    }
                    this.g = true;
                    return true;
                }
            }
            this.g = false;
        }
        return false;
    }

    private final void I() {
        this.c.setVisibility(8);
        this.N(null);
        this.F();
    }

    public final void J() {
        this.a.setRichTextWatcher(null);
    }

    private final void K(String s, int v) {
        j j0 = this.f;
        if(j0 != null) {
            j0.g(s);
        }
        this.O(v);
    }

    private final void L(com.dcinside.app.write.y2.e y2$e0) {
        if(this.h != y2$e0) {
            this.h = y2$e0;
            Context context0 = this.itemView.getContext();
            if(f.a[this.h.ordinal()] == 1) {
                L.m(context0);
                int v = vk.b(context0, 0x1010036);
                this.a.setTextColor(v);
                this.d.setVisibility(8);
            }
        }
    }

    private final void M(Editable editable0) {
        int v = editable0.length();
        if(v == 0) {
            return;
        }
        int v1;
        for(v1 = v; v1 > 0 && kotlin.text.c.r(editable0.charAt(v1 - 1)); --v1) {
        }
        if(v1 < v) {
            editable0.delete(v1, v);
        }
    }

    public final void N(@m String s) {
        if(s == null || s.length() == 0) {
            this.a.setHint("내용");
            this.c.setVisibility(8);
        }
        else {
            Spanned spanned0 = HtmlCompat.a(s, 0x3F);
            this.a.setHint(spanned0);
            this.c.setVisibility(0);
        }
        this.a.requestLayout();
    }

    private final void O(int v) {
        int v1;
        View view0;
        float f = this.z(v);
        f4 f40 = this.e;
        f4 f41 = null;
        if(f40 == null) {
            L.S("dcconTagSearchBinding");
            f40 = null;
        }
        ConstraintLayout constraintLayout0 = f40.b();
        L.o(constraintLayout0, "getRoot(...)");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = constraintLayout0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin = (int)f;
        constraintLayout0.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
        ViewParent viewParent0 = this.itemView.getParent();
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        ViewParent viewParent1 = recyclerView0.getParent();
        ViewGroup viewGroup0 = viewParent1 instanceof ViewGroup ? ((ViewGroup)viewParent1) : null;
        if(viewGroup0 == null) {
            return;
        }
        ViewParent viewParent2 = viewGroup0.getParent();
        ViewGroup viewGroup1 = viewParent2 instanceof ViewGroup ? ((ViewGroup)viewParent2) : null;
        if(viewGroup1 == null) {
            view0 = null;
        }
        else {
            kotlin.sequences.m m0 = ViewGroupKt.e(viewGroup1);
            if(m0 == null) {
                view0 = null;
            }
            else {
                Object object0 = null;
                for(Object object1: m0) {
                    if(((View)object1) instanceof AppBarLayout) {
                        object0 = object1;
                        break;
                    }
                }
                view0 = (View)object0;
            }
        }
        AppBarLayout appBarLayout0 = view0 instanceof AppBarLayout ? ((AppBarLayout)view0) : null;
        if(appBarLayout0 == null) {
            return;
        }
        f4 f42 = this.e;
        if(f42 == null) {
            L.S("dcconTagSearchBinding");
            f42 = null;
        }
        if(f42.b().getHeight() == 0) {
            f4 f43 = this.e;
            if(f43 == null) {
                L.S("dcconTagSearchBinding");
            }
            else {
                f41 = f43;
            }
            v1 = f41.b.getLayoutParams().height;
        }
        else {
            v1 = 0;
        }
        if(viewGroup0.getTop() - (appBarLayout0.getHeight() - appBarLayout0.getTotalScrollRange()) > 0) {
            appBarLayout0.setExpanded(false);
        }
        recyclerView0.postDelayed(() -> {
            L.p(recyclerView0, "$parentRv");
            L.p(this, "this$0");
            int v1 = recyclerView0.computeVerticalScrollOffset() + recyclerView0.computeVerticalScrollExtent();
            int v2 = recyclerView0.computeVerticalScrollOffset() + this.itemView.getTop() + this.itemView.getHeight() + v1;
            if(v2 > v1) {
                recyclerView0.scrollBy(0, v2 - v1);
            }
        }, 200L);
    }

    // 检测为 Lambda 实现
    private static final void P(RecyclerView recyclerView0, y2 y20, int v) [...]

    @Override  // Z.d
    public void a() {
        this.itemView.setBackgroundColor(0xFFCCCCCC);
        this.itemView.setAlpha(0.7f);
    }

    @Override  // Z.d
    public void c() {
        this.itemView.setBackgroundColor(0);
        this.itemView.setAlpha(1.0f);
    }

    // 检测为 Lambda 实现
    private static final void m(y2 y20, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final boolean n(y2 y20, View view0, int v, KeyEvent keyEvent0) [...]

    // 检测为 Lambda 实现
    private static final boolean o(y2 y20, View view0, MotionEvent motionEvent0) [...]

    public final void t() {
        Context context0 = Dl.b(this.itemView);
        PostWriteActivity postWriteActivity0 = context0 instanceof PostWriteActivity ? ((PostWriteActivity)context0) : null;
        if(postWriteActivity0 == null) {
            return;
        }
        this.a.setRichTextWatcher(postWriteActivity0.I6());
    }

    private final void u(String s) {
        Editable editable0 = this.a.getText();
        HashSpan[] arr_hashSpan = editable0 == null ? null : ((HashSpan[])editable0.getSpans(0, s.length(), HashSpan.class));
        if(arr_hashSpan != null) {
            Iterator iterator0 = i.a(arr_hashSpan);
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                HashSpan hashSpan0 = (HashSpan)object0;
                Editable editable1 = this.a.getText();
                if(editable1 != null) {
                    editable1.removeSpan(hashSpan0);
                }
            }
        }
        Matcher matcher0 = Yk.a.j().matcher(s);
        if(matcher0.find()) {
            Context context0 = this.itemView.getContext();
            L.o(context0, "getContext(...)");
            int v = vk.b(context0, 0x7F0401F8);  // attr:dcBodyLinkColor
            Editable editable2 = this.a.getText();
            if(editable2 != null) {
                editable2.setSpan(new HashSpan(v), matcher0.start(), matcher0.end(), 33);
            }
            this.L(com.dcinside.app.write.y2.e.b);
            this.B(matcher0.group(1), matcher0.start());
            return;
        }
        this.L(com.dcinside.app.write.y2.e.a);
        this.d.setVisibility(8);
        Context context1 = this.itemView.getContext();
        L.o(context1, "getContext(...)");
        com.dcinside.app.rx.bus.c.a(context1, new n0(false));
    }

    public final void v(@l String s) {
        L.p(s, "recentTag");
        Editable editable0 = this.a.getText();
        if(editable0 == null) {
            return;
        }
        Matcher matcher0 = Yk.a.j().matcher(editable0);
        if(matcher0.find()) {
            int v = matcher0.start(1);
            Editable editable1 = editable0.replace(v, matcher0.end(1), s);
            this.a.setText(editable1);
            this.a.setSelection(s.length() + v);
            this.O(v);
        }
    }

    @l
    public final ViewStub w() {
        return this.d;
    }

    @l
    public final RichEditText x() {
        return this.a;
    }

    @l
    public final View y() {
        return this.b;
    }

    private final float z(int v) {
        Layout layout0 = this.a.getLayout();
        L.o(layout0, "getLayout(...)");
        int v1 = layout0.getLineForOffset(v);
        int v2 = layout0.getLineBaseline(v1);
        int v3 = layout0.getLineAscent(v1);
        Paint.FontMetricsInt paint$FontMetricsInt0 = this.a.getPaint().getFontMetricsInt();
        return ((float)(v2 + v3)) + ((float)(paint$FontMetricsInt0.bottom - paint$FontMetricsInt0.top)) + 0.0f;
    }
}

