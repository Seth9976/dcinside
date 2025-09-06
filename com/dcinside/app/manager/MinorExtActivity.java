package com.dcinside.app.manager;

import A3.p;
import Y.K;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout.LayoutParams;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.j;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.X;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import rx.g;
import y4.l;
import y4.m;

@s0({"SMAP\nMinorExtActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinorExtActivity.kt\ncom/dcinside/app/manager/MinorExtActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,224:1\n1#2:225\n257#3,2:226\n257#3,2:228\n257#3,2:230\n*S KotlinDebug\n*F\n+ 1 MinorExtActivity.kt\ncom/dcinside/app/manager/MinorExtActivity\n*L\n136#1:226,2\n143#1:228,2\n150#1:230,2\n*E\n"})
public final class MinorExtActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Activity activity0, @m String s, int v, int v1) {
            L.p(activity0, "activity");
            Intent intent0 = new Intent(activity0, MinorExtActivity.class);
            intent0.setAction("action_block");
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", v);
            if(v1 > 0) {
                intent0.putExtra("com.dcinside.app.extra.REPLY_NUMBER", v1);
                activity0.startActivityForResult(intent0, 0x408);
                return;
            }
            activity0.startActivityForResult(intent0, 0x407);
        }

        public static void b(a minorExtActivity$a0, Activity activity0, String s, int v, int v1, int v2, Object object0) {
            if((v2 & 8) != 0) {
                v1 = 0;
            }
            minorExtActivity$a0.a(activity0, s, v, v1);
        }

        public final void c(@l Activity activity0, @m String s, int v) {
            L.p(activity0, "activity");
            Intent intent0 = new Intent(activity0, MinorExtActivity.class);
            intent0.setAction("action_post_manage");
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", v);
            activity0.startActivityForResult(intent0, 0x407);
        }
    }

    private K u;
    @m
    private VideoEnabledWebView v;
    @m
    private I0 w;
    @l
    public static final a x = null;
    @l
    private static final String y = "action_block";
    @l
    private static final String z = "action_post_manage";

    static {
        MinorExtActivity.x = new a(null);
    }

    private final void K1(Throwable throwable0) {
        @f(c = "com.dcinside.app.manager.MinorExtActivity$errorLoadWeb$1", f = "MinorExtActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.o {
            int k;
            final MinorExtActivity l;
            final Throwable m;

            b(MinorExtActivity minorExtActivity0, Throwable throwable0, kotlin.coroutines.d d0) {
                this.l = minorExtActivity0;
                this.m = throwable0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new b(this.l, this.m, d0);
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
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Dl.G(this.l, this.m.getMessage());
                this.l.finish();
                return S0.a;
            }
        }

        I0 i00 = this.w;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.w = k.b(LifecycleOwnerKt.a(this), h0.e(), null, new b(this, throwable0, null), 2, null);
    }

    private final void L1() {
        VideoEnabledWebView videoEnabledWebView0 = this.v;
        if(videoEnabledWebView0 == null) {
            return;
        }
        com.dcinside.app.wv.m.b.j.b(videoEnabledWebView0, new Object[0]);
    }

    private final void M1() {
        VideoEnabledWebView videoEnabledWebView0 = new VideoEnabledWebView(this);
        K k0 = this.u;
        if(k0 == null) {
            L.S("binding");
            k0 = null;
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        k0.d.addView(videoEnabledWebView0, frameLayout$LayoutParams0);
        this.v = videoEnabledWebView0;
        j.b(videoEnabledWebView0);
    }

    private final void N1() {
        static final class com.dcinside.app.manager.MinorExtActivity.d extends N implements Function1 {
            final MinorExtActivity e;

            com.dcinside.app.manager.MinorExtActivity.d(MinorExtActivity minorExtActivity0) {
                this.e = minorExtActivity0;
                super(1);
            }

            public final void b(String s) {
                @f(c = "com.dcinside.app.manager.MinorExtActivity$onLoadWeb$1$1", f = "MinorExtActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.manager.MinorExtActivity.d.a extends o implements A3.o {
                    int k;
                    final MinorExtActivity l;
                    final String m;

                    com.dcinside.app.manager.MinorExtActivity.d.a(MinorExtActivity minorExtActivity0, String s, kotlin.coroutines.d d0) {
                        this.l = minorExtActivity0;
                        this.m = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.manager.MinorExtActivity.d.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.manager.MinorExtActivity.d.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        VideoEnabledWebView videoEnabledWebView0 = this.l.v;
                        if(videoEnabledWebView0 != null) {
                            videoEnabledWebView0.loadUrl(this.m);
                        }
                        this.l.setResult(-1);
                        return S0.a;
                    }
                }

                I0 i00 = this.e.w;
                if(i00 != null) {
                    kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                }
                X x0 = k.b(LifecycleOwnerKt.a(this.e), h0.e(), null, new com.dcinside.app.manager.MinorExtActivity.d.a(this.e, s, null), 2, null);
                this.e.w = x0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        Intent intent0 = this.getIntent();
        K k0 = null;
        String s = intent0 == null ? null : intent0.getAction();
        if(s == null) {
        label_26:
            K k3 = this.u;
            if(k3 == null) {
                L.S("binding");
                k3 = null;
            }
            L.o(k3.b, "minorExtQuickBlock");
            k3.b.setVisibility(8);
        }
        else {
            switch(s) {
                case "action_block": {
                    this.setTitle(0x7F150679);  // string:minor_user_block "차단"
                    K k2 = this.u;
                    if(k2 == null) {
                        L.S("binding");
                    }
                    else {
                        k0 = k2;
                    }
                    L.o(k0.b, "minorExtQuickBlock");
                    k0.b.setVisibility(0);
                    k0 = uk.Oj(intent0.getStringExtra("com.dcinside.app.extra.GALLERY_ID"), intent0.getIntExtra("com.dcinside.app.extra.POST_NUMBER", 0), intent0.getIntExtra("com.dcinside.app.extra.REPLY_NUMBER", 0));
                    break;
                }
                case "action_post_manage": {
                    K k1 = this.u;
                    if(k1 == null) {
                        L.S("binding");
                    }
                    else {
                        k0 = k1;
                    }
                    L.o(k0.b, "minorExtQuickBlock");
                    k0.b.setVisibility(8);
                    this.setTitle(0x7F1507BA);  // string:post_head_mini_manage "게시물 관리"
                    k0 = uk.NF(intent0.getStringExtra("com.dcinside.app.extra.GALLERY_ID"), intent0.getIntExtra("com.dcinside.app.extra.POST_NUMBER", 0));
                    break;
                }
                default: {
                    goto label_26;
                }
            }
        }
        if(k0 == null) {
            Dl.D(this, 0x7F150B29);  // string:unsupported_msg "지원하지 않는 기능이 요청되었습니다."
            this.finish();
            return;
        }
        ((g)k0).y5((Object object0) -> {
            L.p(new com.dcinside.app.manager.MinorExtActivity.d(this), "$tmp0");
            new com.dcinside.app.manager.MinorExtActivity.d(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.m(throwable0);
            this.K1(throwable0);
        });
    }

    // 检测为 Lambda 实现
    private static final void O1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void P1(MinorExtActivity minorExtActivity0, Throwable throwable0) [...]

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void Q1() {
        VideoEnabledWebView videoEnabledWebView0 = this.v;
        if(videoEnabledWebView0 == null) {
            return;
        }
        WebSettings webSettings0 = videoEnabledWebView0.getSettings();
        L.o(webSettings0, "getSettings(...)");
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setDatabaseEnabled(true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setBuiltInZoomControls(false);
        webSettings0.setSupportMultipleWindows(false);
        webSettings0.setSupportZoom(false);
        webSettings0.setBlockNetworkImage(false);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setAllowFileAccess(true);
        webSettings0.setLoadWithOverviewMode(true);
        webSettings0.setUserAgentString("Mozilla/5.0 (Linux; U; Android 4.0.3; ko-kr; LG-L160L Build/IML74K) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30 dcinside.app");
        webSettings0.setCacheMode(-1);
        CookieManager cookieManager0 = CookieManager.getInstance();
        cookieManager0.setAcceptCookie(true);
        cookieManager0.setAcceptThirdPartyCookies(videoEnabledWebView0, true);
        webSettings0.setMixedContentMode(0);
        videoEnabledWebView0.setWebViewClient(new com.dcinside.app.manager.g());
        videoEnabledWebView0.setWebChromeClient(new com.dcinside.app.manager.f());
        videoEnabledWebView0.setHorizontalScrollBarEnabled(false);
        videoEnabledWebView0.setVerticalScrollBarEnabled(false);
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        VideoEnabledWebView videoEnabledWebView0 = this.v;
        if(videoEnabledWebView0 != null && videoEnabledWebView0.canGoBack()) {
            videoEnabledWebView0.goBack();
            return;
        }
        super.onBackPressed();
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.manager.MinorExtActivity$onCreate$1", f = "MinorExtActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final MinorExtActivity l;

            c(MinorExtActivity minorExtActivity0, kotlin.coroutines.d d0) {
                this.l = minorExtActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.L1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        K k0 = K.c(this.getLayoutInflater());
        L.o(k0, "inflate(...)");
        this.u = k0;
        if(k0 == null) {
            L.S("binding");
            k0 = null;
        }
        this.setContentView(k0.b());
        K k1 = this.u;
        if(k1 == null) {
            L.S("binding");
            k1 = null;
        }
        this.S0(k1.c);
        kr.bhbfhfb.designcompat.a.d(this);
        this.M1();
        this.Q1();
        this.N1();
        K k2 = this.u;
        if(k2 == null) {
            L.S("binding");
            k2 = null;
        }
        L.o(k2.b, "minorExtQuickBlock");
        c minorExtActivity$c0 = new c(this, null);
        r.M(k2.b, null, minorExtActivity$c0, 1, null);
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        VideoEnabledWebView videoEnabledWebView0 = this.v;
        if(videoEnabledWebView0 != null) {
            ViewParent viewParent0 = videoEnabledWebView0.getParent();
            ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
            if(viewGroup0 != null) {
                viewGroup0.removeView(videoEnabledWebView0);
            }
            j.h(this.v);
            VideoEnabledWebView videoEnabledWebView1 = this.v;
            if(videoEnabledWebView1 != null) {
                videoEnabledWebView1.destroy();
            }
            this.v = null;
        }
        I0 i00 = this.w;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.w = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onPause() {
        super.onPause();
        VideoEnabledWebView videoEnabledWebView0 = this.v;
        if(videoEnabledWebView0 != null) {
            videoEnabledWebView0.onPause();
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onResume() {
        super.onResume();
        VideoEnabledWebView videoEnabledWebView0 = this.v;
        if(videoEnabledWebView0 != null) {
            videoEnabledWebView0.onResume();
        }
    }
}

