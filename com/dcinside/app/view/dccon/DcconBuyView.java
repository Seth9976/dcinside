package com.dcinside.app.view.dccon;

import A3.p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.image.o;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.o.b;
import com.dcinside.app.model.u;
import com.dcinside.app.perform.e;
import com.dcinside.app.read.G;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.PageIndicator;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@SuppressLint({"ClickableViewAccessibility"})
@s0({"SMAP\nDcconBuyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconBuyView.kt\ncom/dcinside/app/view/dccon/DcconBuyView\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,239:1\n177#2,9:240\n*S KotlinDebug\n*F\n+ 1 DcconBuyView.kt\ncom/dcinside/app/view/dccon/DcconBuyView\n*L\n128#1:240,9\n*E\n"})
public final class DcconBuyView extends ScrollView {
    static final class c extends Adapter {
        public static final class a {
            private a() {
            }

            public a(w w0) {
            }
        }

        @m
        private List a;
        private int b;
        @l
        public static final a c = null;
        private static final float d = 12.0f;

        static {
            c.c = new a(null);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.b;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.v(((d)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.w(viewGroup0, v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onViewRecycled(ViewHolder recyclerView$ViewHolder0) {
            this.x(((d)recyclerView$ViewHolder0));
        }

        public void v(@l d dcconBuyView$d0, int v) {
            L.p(dcconBuyView$d0, "holder");
            List list0 = this.a;
            if(list0 == null) {
                return;
            }
            int v1 = list0.size();
            ImageView[] arr_imageView = dcconBuyView$d0.e();
            for(int v2 = 0; v2 < arr_imageView.length; ++v2) {
                ImageView imageView0 = dcconBuyView$d0.e()[v2];
                int v3 = v2 + ((int)(((float)v) * 12.0f));
                if(v3 < v1) {
                    String s = ((com.dcinside.app.model.o.a)list0.get(v3)).a();
                    o.a.e(imageView0, s).h().j().apply();
                    imageView0.setTag(0x7F0B0345, s);  // id:dccon_holder_ic_picked
                }
                else {
                    o.a.a(imageView0);
                    imageView0.setTag(0x7F0B0345, null);  // id:dccon_holder_ic_picked
                }
            }
        }

        @l
        public d w(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01B9, viewGroup0, false);  // layout:view_dccon_buy_item
            L.m(view0);
            return new d(view0);
        }

        public void x(@l d dcconBuyView$d0) {
            L.p(dcconBuyView$d0, "holder");
            super.onViewRecycled(dcconBuyView$d0);
            ImageView[] arr_imageView = dcconBuyView$d0.e();
            for(int v = 0; v < arr_imageView.length; ++v) {
                o.a.a(dcconBuyView$d0.e()[v]);
            }
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public final void y(@m List list0) {
            this.a = list0;
            this.b = list0 == null ? 0 : ((int)Math.ceil(((float)list0.size()) / 12.0f));
            this.notifyDataSetChanged();
        }
    }

    static final class d extends ViewHolder {
        @l
        private final ImageView[] a;

        public d(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            ImageView[] arr_imageView = new ImageView[12];
            View view1 = view0.findViewById(0x7F0B0336);  // id:dccon_buy_item0
            L.o(view1, "findViewById(...)");
            arr_imageView[0] = view1;
            View view2 = view0.findViewById(0x7F0B0337);  // id:dccon_buy_item1
            L.o(view2, "findViewById(...)");
            arr_imageView[1] = view2;
            View view3 = view0.findViewById(0x7F0B033A);  // id:dccon_buy_item2
            L.o(view3, "findViewById(...)");
            arr_imageView[2] = view3;
            View view4 = view0.findViewById(0x7F0B033B);  // id:dccon_buy_item3
            L.o(view4, "findViewById(...)");
            arr_imageView[3] = view4;
            View view5 = view0.findViewById(0x7F0B033C);  // id:dccon_buy_item4
            L.o(view5, "findViewById(...)");
            arr_imageView[4] = view5;
            View view6 = view0.findViewById(0x7F0B033D);  // id:dccon_buy_item5
            L.o(view6, "findViewById(...)");
            arr_imageView[5] = view6;
            View view7 = view0.findViewById(0x7F0B033E);  // id:dccon_buy_item6
            L.o(view7, "findViewById(...)");
            arr_imageView[6] = view7;
            View view8 = view0.findViewById(0x7F0B033F);  // id:dccon_buy_item7
            L.o(view8, "findViewById(...)");
            arr_imageView[7] = view8;
            View view9 = view0.findViewById(0x7F0B0340);  // id:dccon_buy_item8
            L.o(view9, "findViewById(...)");
            arr_imageView[8] = view9;
            View view10 = view0.findViewById(0x7F0B0341);  // id:dccon_buy_item9
            L.o(view10, "findViewById(...)");
            arr_imageView[9] = view10;
            View view11 = view0.findViewById(0x7F0B0338);  // id:dccon_buy_item10
            L.o(view11, "findViewById(...)");
            arr_imageView[10] = view11;
            View view12 = view0.findViewById(0x7F0B0339);  // id:dccon_buy_item11
            L.o(view12, "findViewById(...)");
            arr_imageView[11] = view12;
            this.a = arr_imageView;
        }

        @l
        public final ImageView[] e() {
            return this.a;
        }
    }

    @l
    private final TextView a;
    @l
    private final ImageView b;
    @l
    private final TextView c;
    @l
    private final TextView d;
    @l
    private final TextView e;
    @l
    private final TextView f;
    @l
    private final TextView g;
    @l
    private final RecyclerViewPager h;
    @l
    private final PageIndicator i;
    @l
    private final c j;
    @m
    private b k;
    @m
    private String l;
    private rx.o m;

    public DcconBuyView(@l Context context0) {
        @f(c = "com.dcinside.app.view.dccon.DcconBuyView$1", f = "DcconBuyView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.dccon.DcconBuyView.a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final DcconBuyView l;

            com.dcinside.app.view.dccon.DcconBuyView.a(DcconBuyView dcconBuyView0, kotlin.coroutines.d d0) {
                this.l = dcconBuyView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.view.dccon.DcconBuyView.a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.k();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.dccon.DcconBuyView$2", f = "DcconBuyView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.dccon.DcconBuyView.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final DcconBuyView l;

            com.dcinside.app.view.dccon.DcconBuyView.b(DcconBuyView dcconBuyView0, kotlin.coroutines.d d0) {
                this.l = dcconBuyView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.view.dccon.DcconBuyView.b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.j();
                return S0.a;
            }
        }

        L.p(context0, "context");
        super(context0);
        this.j = new c();
        this.m = rx.subscriptions.f.e();
        View.inflate(this.getContext(), 0x7F0E01B8, this);  // layout:view_dccon_buy
        View view0 = this.findViewById(0x7F0B032D);  // id:dccon_buy_header
        L.o(view0, "findViewById(...)");
        this.a = (TextView)view0;
        View view1 = this.findViewById(0x7F0B0342);  // id:dccon_buy_main_img
        L.o(view1, "findViewById(...)");
        this.b = (ImageView)view1;
        View view2 = this.findViewById(0x7F0B0344);  // id:dccon_buy_title
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.findViewById(0x7F0B032C);  // id:dccon_buy_desc
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        View view4 = this.findViewById(0x7F0B032B);  // id:dccon_buy_confirm
        L.o(view4, "findViewById(...)");
        this.e = (TextView)view4;
        View view5 = this.findViewById(0x7F0B0343);  // id:dccon_buy_pager
        L.o(view5, "findViewById(...)");
        this.h = (RecyclerViewPager)view5;
        View view6 = this.findViewById(0x7F0B032F);  // id:dccon_buy_indicator
        L.o(view6, "findViewById(...)");
        this.i = (PageIndicator)view6;
        View view7 = this.findViewById(0x7F0B0333);  // id:dccon_buy_info_nickname
        L.o(view7, "findViewById(...)");
        this.f = (TextView)view7;
        View view8 = this.findViewById(0x7F0B0331);  // id:dccon_buy_info_date
        L.o(view8, "findViewById(...)");
        this.g = (TextView)view8;
        r.M(((TextView)view4), null, new com.dcinside.app.view.dccon.DcconBuyView.a(this, null), 1, null);
        View view9 = this.findViewById(0x7F0B032A);  // id:dccon_buy_close
        L.o(view9, "findViewById(...)");
        r.M(view9, null, new com.dcinside.app.view.dccon.DcconBuyView.b(this, null), 1, null);
        ((TextView)view3).setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            L.m(view0);
            L.m(motionEvent0);
            return this.n(view0, motionEvent0);
        });
    }

    public DcconBuyView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        this.j = new c();
        this.m = rx.subscriptions.f.e();
        View.inflate(this.getContext(), 0x7F0E01B8, this);  // layout:view_dccon_buy
        View view0 = this.findViewById(0x7F0B032D);  // id:dccon_buy_header
        L.o(view0, "findViewById(...)");
        this.a = (TextView)view0;
        View view1 = this.findViewById(0x7F0B0342);  // id:dccon_buy_main_img
        L.o(view1, "findViewById(...)");
        this.b = (ImageView)view1;
        View view2 = this.findViewById(0x7F0B0344);  // id:dccon_buy_title
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.findViewById(0x7F0B032C);  // id:dccon_buy_desc
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        View view4 = this.findViewById(0x7F0B032B);  // id:dccon_buy_confirm
        L.o(view4, "findViewById(...)");
        this.e = (TextView)view4;
        View view5 = this.findViewById(0x7F0B0343);  // id:dccon_buy_pager
        L.o(view5, "findViewById(...)");
        this.h = (RecyclerViewPager)view5;
        View view6 = this.findViewById(0x7F0B032F);  // id:dccon_buy_indicator
        L.o(view6, "findViewById(...)");
        this.i = (PageIndicator)view6;
        View view7 = this.findViewById(0x7F0B0333);  // id:dccon_buy_info_nickname
        L.o(view7, "findViewById(...)");
        this.f = (TextView)view7;
        View view8 = this.findViewById(0x7F0B0331);  // id:dccon_buy_info_date
        L.o(view8, "findViewById(...)");
        this.g = (TextView)view8;
        r.M(((TextView)view4), null, new com.dcinside.app.view.dccon.DcconBuyView.a(this, null), 1, null);
        View view9 = this.findViewById(0x7F0B032A);  // id:dccon_buy_close
        L.o(view9, "findViewById(...)");
        r.M(view9, null, new com.dcinside.app.view.dccon.DcconBuyView.b(this, null), 1, null);
        ((TextView)view3).setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            L.m(view0);
            L.m(motionEvent0);
            return this.n(view0, motionEvent0);
        });
    }

    public DcconBuyView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.j = new c();
        this.m = rx.subscriptions.f.e();
        View.inflate(this.getContext(), 0x7F0E01B8, this);  // layout:view_dccon_buy
        View view0 = this.findViewById(0x7F0B032D);  // id:dccon_buy_header
        L.o(view0, "findViewById(...)");
        this.a = (TextView)view0;
        View view1 = this.findViewById(0x7F0B0342);  // id:dccon_buy_main_img
        L.o(view1, "findViewById(...)");
        this.b = (ImageView)view1;
        View view2 = this.findViewById(0x7F0B0344);  // id:dccon_buy_title
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        View view3 = this.findViewById(0x7F0B032C);  // id:dccon_buy_desc
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        View view4 = this.findViewById(0x7F0B032B);  // id:dccon_buy_confirm
        L.o(view4, "findViewById(...)");
        this.e = (TextView)view4;
        View view5 = this.findViewById(0x7F0B0343);  // id:dccon_buy_pager
        L.o(view5, "findViewById(...)");
        this.h = (RecyclerViewPager)view5;
        View view6 = this.findViewById(0x7F0B032F);  // id:dccon_buy_indicator
        L.o(view6, "findViewById(...)");
        this.i = (PageIndicator)view6;
        View view7 = this.findViewById(0x7F0B0333);  // id:dccon_buy_info_nickname
        L.o(view7, "findViewById(...)");
        this.f = (TextView)view7;
        View view8 = this.findViewById(0x7F0B0331);  // id:dccon_buy_info_date
        L.o(view8, "findViewById(...)");
        this.g = (TextView)view8;
        r.M(((TextView)view4), null, new com.dcinside.app.view.dccon.DcconBuyView.a(this, null), 1, null);
        View view9 = this.findViewById(0x7F0B032A);  // id:dccon_buy_close
        L.o(view9, "findViewById(...)");
        r.M(view9, null, new com.dcinside.app.view.dccon.DcconBuyView.b(this, null), 1, null);
        ((TextView)view3).setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            L.m(view0);
            L.m(motionEvent0);
            return this.n(view0, motionEvent0);
        });
    }

    // 检测为 Lambda 实现
    private static final boolean e(DcconBuyView dcconBuyView0, View view0, MotionEvent motionEvent0) [...]

    public final void h(@l com.dcinside.app.model.o o0, @m String s) {
        L.p(o0, "dcConBuyLayer");
        Context context0 = this.getContext();
        this.l = s;
        List list0 = o0.c();
        String s1 = null;
        b o$b0 = list0 == null ? null : ((b)list0.get(0));
        this.k = o$b0;
        o.a.e(this.b, (o$b0 == null ? null : o$b0.b())).apply();
        this.c.setText((this.k == null ? null : this.k.g()));
        this.d.setText(Dl.c((this.k == null ? null : this.k.a())));
        this.f.setText((this.k == null ? null : this.k.d()));
        this.g.setText((this.k == null ? null : this.k.h()));
        ScrollingMovementMethod scrollingMovementMethod0 = new ScrollingMovementMethod();
        this.d.setMovementMethod(scrollingMovementMethod0);
        b o$b1 = this.k;
        if(o$b1 != null) {
            s1 = o$b1.f();
        }
        if(L.g("N", s1)) {
            this.e.setEnabled(true);
            this.e.setText(0x7F150242);  // string:dccon_buy "사용하기"
            L.m(context0);
            Drawable drawable0 = vk.e(context0, 0x7F04052E);  // attr:roundedAccent
            this.e.setBackground(drawable0);
        }
        else {
            this.e.setEnabled(false);
            this.e.setText(0x7F150247);  // string:dccon_paid "이미 사용 중입니다."
            int v = ContextCompat.getColor(context0, 0x7F06012A);  // color:grey2
            this.e.setTextColor(v);
            this.e.setBackgroundResource(0x7F080190);  // drawable:dccon_buy_button_disable
        }
        this.j.y(o0.b());
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        this.h.setLayoutManager(nonPredictiveLayoutManager0);
        this.h.setAdapter(this.j);
        v v1 = (int v, int v1) -> {
            L.p(this, "this$0");
            this.o(v1);
        };
        this.h.U(v1);
        this.o(this.h.getCurrentPosition());
    }

    // 检测为 Lambda 实现
    private static final void i(DcconBuyView dcconBuyView0, int v, int v1) [...]

    private final void j() {
        try {
            Context context0 = this.getContext();
            AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
            if(appCompatActivity0 == null) {
                return;
            }
            e.e.a(appCompatActivity0).o();
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    private final void k() {
        static final class com.dcinside.app.view.dccon.DcconBuyView.e extends N implements Function1 {
            final DcconBuyView e;

            com.dcinside.app.view.dccon.DcconBuyView.e(DcconBuyView dcconBuyView0) {
                this.e = dcconBuyView0;
                super(1);
            }

            public final void a(u u0) {
                Dl.D(this.e.getContext(), 0x7F150243);  // string:dccon_buy_alert_success "디시콘 목록에 추가되었습니다."
                G.b();
                this.e.j();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((u)object0));
                return S0.a;
            }
        }

        if(this.m != null && !this.m.j()) {
            return;
        }
        if(B.E.k0() == null) {
            Context context0 = Dl.b(this);
            L.n(context0, "null cannot be cast to non-null type android.app.Activity");
            LoginActivity.x.a(((Activity)context0), this.l);
            return;
        }
        this.m = uk.ak((this.k == null ? null : this.k.e())).y5((Object object0) -> {
            L.p(new com.dcinside.app.view.dccon.DcconBuyView.e(this), "$tmp0");
            new com.dcinside.app.view.dccon.DcconBuyView.e(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(throwable0, "error");
            throwable0.printStackTrace();
            String s = throwable0.getMessage();
            if(s != null && s.length() > 0) {
                Dl.G(this.getContext(), throwable0.getMessage());
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void l(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void m(DcconBuyView dcconBuyView0, Throwable throwable0) [...]

    private final boolean n(View view0, MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        boolean z = true;
        switch(v) {
            case 0: {
                if(!view0.canScrollVertically(-1) && !view0.canScrollVertically(1)) {
                    z = false;
                }
                this.requestDisallowInterceptTouchEvent(z);
                break;
            }
            case 1: {
                this.requestDisallowInterceptTouchEvent(false);
                return false;
            }
            default: {
                if(v == 3 || v == 4) {
                    this.requestDisallowInterceptTouchEvent(false);
                    return false;
                }
            }
        }
        return false;
    }

    private final void o(int v) {
        int v1 = this.j.getItemCount();
        this.i.f(v, v1);
    }

    @Override  // android.widget.ScrollView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            this.h.X();
        }
        catch(Exception unused_ex) {
        }
        rx.o o0 = this.m;
        if(o0 != null) {
            o0.l();
        }
    }
}

