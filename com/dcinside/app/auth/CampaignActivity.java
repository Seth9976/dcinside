package com.dcinside.app.auth;

import A3.p;
import Y.o;
import android.os.Bundle;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.dcinside.app.base.d;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.c0;
import com.dcinside.app.util.Dl;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nCampaignActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignActivity.kt\ncom/dcinside/app/auth/CampaignActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n257#2,2:96\n257#2,2:98\n257#2,2:100\n1#3:102\n*S KotlinDebug\n*F\n+ 1 CampaignActivity.kt\ncom/dcinside/app/auth/CampaignActivity\n*L\n54#1:96,2\n55#1:98,2\n56#1:100,2\n*E\n"})
public final class CampaignActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static final int A = 1;
    public static final int B = 2;
    private o u;
    @m
    private String v;
    @m
    private Integer w;
    @l
    public static final a x = null;
    @l
    public static final String y = "com.dcinside.app.auth.CampaignActivity.EXTRA_ID";
    @l
    public static final String z = "com.dcinside.app.auth.CampaignActivity.EXTRA_CAMPAIGN";

    static {
        CampaignActivity.x = new a(null);
    }

    private final void F1(View view0) {
        if(view0 == null) {
            return;
        }
        switch(view0.getId()) {
            case 0x7F0B026F: {  // id:campaign_change
                Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this);
                if(awesomeWebView$Builder0 != null) {
                    Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
                    if(awesomeWebView$Builder1 != null) {
                        awesomeWebView$Builder1.y5(view0.getTag().toString());
                    }
                }
                break;
            }
            case 0x7F0B0275: {  // id:campaign_later
                Calendar calendar0 = Calendar.getInstance();
                calendar0.setTimeInMillis(TimeUnit.DAYS.toMillis(30L) + System.currentTimeMillis());
                calendar0.set(11, 0);
                calendar0.set(12, 0);
                calendar0.set(13, 0);
                calendar0.set(14, 0);
                long v = calendar0.getTimeInMillis();
                c0.h.f(this.v, v);
            }
        }
        this.finish();
    }

    private final void G1() {
        this.v = this.getIntent().getStringExtra("com.dcinside.app.auth.CampaignActivity.EXTRA_ID");
        this.w = this.getIntent().getIntExtra("com.dcinside.app.auth.CampaignActivity.EXTRA_CAMPAIGN", 0);
    }

    private final void H1() {
        o o0 = this.u;
        o o1 = null;
        if(o0 == null) {
            L.S("binding");
            o0 = null;
        }
        this.S0(o0.m);
        kr.bhbfhfb.designcompat.a.d(this);
        o o2 = this.u;
        if(o2 == null) {
            L.S("binding");
            o2 = null;
        }
        o2.m.setNavigationIcon(0x7F08012F);  // drawable:btn_close
        o o3 = this.u;
        if(o3 == null) {
            L.S("binding");
            o3 = null;
        }
        L.o(o3.l, "campaignPatternParent");
        int v = 0;
        o3.l.setVisibility((this.w == null || ((int)this.w) != 1 ? 0 : 8));
        o o4 = this.u;
        if(o4 == null) {
            L.S("binding");
            o4 = null;
        }
        L.o(o4.g, "campaignExpireParent");
        o4.g.setVisibility((this.w == null || ((int)this.w) != 2 ? 0 : 8));
        o o5 = this.u;
        if(o5 == null) {
            L.S("binding");
            o5 = null;
        }
        TextView textView0 = o5.i;
        L.o(textView0, "campaignLater");
        if(this.w == null || ((int)this.w) != 2) {
            v = 8;
        }
        textView0.setVisibility(v);
        o o6 = this.u;
        if(o6 == null) {
            L.S("binding");
            o6 = null;
        }
        Spanned spanned0 = Dl.c("<u><font color=#FF0000>비밀번호 규칙이 변경</font>되었습니다.</u>");
        o6.k.setText(spanned0);
        o o7 = this.u;
        if(o7 == null) {
            L.S("binding");
        }
        else {
            o1 = o7;
        }
        Spanned spanned1 = Dl.c("같은 비밀번호를 <font color=#FF0000><b>90일 이상 사용</b></font>하고 계십니다.");
        o1.f.setText(spanned1);
    }

    private final void I1() {
        @f(c = "com.dcinside.app.auth.CampaignActivity$setupListener$1", f = "CampaignActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final CampaignActivity m;

            b(CampaignActivity campaignActivity0, kotlin.coroutines.d d0) {
                this.m = campaignActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                b campaignActivity$b0 = new b(this.m, d0);
                campaignActivity$b0.l = view0;
                return campaignActivity$b0.invokeSuspend(S0.a);
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
                this.m.F1(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.CampaignActivity$setupListener$2", f = "CampaignActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final CampaignActivity m;

            c(CampaignActivity campaignActivity0, kotlin.coroutines.d d0) {
                this.m = campaignActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                c campaignActivity$c0 = new c(this.m, d0);
                campaignActivity$c0.l = view0;
                return campaignActivity$c0.invokeSuspend(S0.a);
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
                this.m.F1(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.CampaignActivity$setupListener$3", f = "CampaignActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.auth.CampaignActivity.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final CampaignActivity m;

            com.dcinside.app.auth.CampaignActivity.d(CampaignActivity campaignActivity0, kotlin.coroutines.d d0) {
                this.m = campaignActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.auth.CampaignActivity.d campaignActivity$d0 = new com.dcinside.app.auth.CampaignActivity.d(this.m, d0);
                campaignActivity$d0.l = view0;
                return campaignActivity$d0.invokeSuspend(S0.a);
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
                this.m.F1(((View)this.l));
                return S0.a;
            }
        }

        o o0 = this.u;
        if(o0 == null) {
            L.S("binding");
            o0 = null;
        }
        L.o(o0.c, "campaignChange");
        b campaignActivity$b0 = new b(this, null);
        r.M(o0.c, null, campaignActivity$b0, 1, null);
        o o1 = this.u;
        if(o1 == null) {
            L.S("binding");
            o1 = null;
        }
        L.o(o1.j, "campaignNext");
        c campaignActivity$c0 = new c(this, null);
        r.M(o1.j, null, campaignActivity$c0, 1, null);
        o o2 = this.u;
        if(o2 == null) {
            L.S("binding");
            o2 = null;
        }
        L.o(o2.i, "campaignLater");
        com.dcinside.app.auth.CampaignActivity.d campaignActivity$d0 = new com.dcinside.app.auth.CampaignActivity.d(this, null);
        r.M(o2.i, null, campaignActivity$d0, 1, null);
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        o o0 = o.c(this.getLayoutInflater());
        L.o(o0, "inflate(...)");
        this.u = o0;
        if(o0 == null) {
            L.S("binding");
            o0 = null;
        }
        this.setContentView(o0.b());
        this.G1();
        this.H1();
        this.I1();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // com.dcinside.app.base.d
    public boolean t1() {
        return false;
    }
}

