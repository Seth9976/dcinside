package com.dcinside.app.ad.util;

import android.content.Context;
import android.util.Base64;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.ad.naver.b;
import com.dcinside.app.ad.naver.d;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.vk;
import com.dcinside.app.wv.B;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.WebViews;
import com.dcinside.app.wv.f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.zip.GZIPInputStream;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.io.c;
import kotlin.io.y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import org.jsoup.nodes.t;
import y4.m;

@s0({"SMAP\nAdSequentialNaverScriptAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSequentialNaverScriptAd.kt\ncom/dcinside/app/ad/util/AdSequentialNaverScriptAd\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,175:1\n278#2,2:176\n257#2,2:178\n278#2,2:180\n*S KotlinDebug\n*F\n+ 1 AdSequentialNaverScriptAd.kt\ncom/dcinside/app/ad/util/AdSequentialNaverScriptAd\n*L\n50#1:176,2\n166#1:178,2\n169#1:180,2\n*E\n"})
public final class l extends a implements b {
    @y4.l
    private final d c;
    @y4.l
    private WeakReference d;
    @y4.l
    private WeakReference e;
    @y4.l
    private WeakReference f;
    @m
    private f g;
    private boolean h;
    @m
    private I0 i;

    public l(@y4.l LifecycleOwner lifecycleOwner0, @m ViewGroup viewGroup0, @y4.l d d0, @m com.dcinside.app.ad.naver.a a0) {
        L.p(lifecycleOwner0, "lifecycleOwner");
        L.p(d0, "adParams");
        super();
        this.c = d0;
        this.d = new WeakReference(viewGroup0);
        this.e = new WeakReference(lifecycleOwner0);
        this.f = new WeakReference(a0);
    }

    public l(LifecycleOwner lifecycleOwner0, ViewGroup viewGroup0, d d0, com.dcinside.app.ad.naver.a a0, int v, w w0) {
        if((v & 8) != 0) {
            a0 = null;
        }
        this(lifecycleOwner0, viewGroup0, d0, a0);
    }

    @Override  // com.dcinside.app.ad.util.a
    public boolean a() {
        return this.h;
    }

    @Override  // com.dcinside.app.ad.util.a
    public void e() {
        this.i(true);
        I0 i00 = this.i;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.i = null;
        f f0 = this.g;
        if(f0 != null) {
            f0.onDestroy();
        }
        this.g = null;
        this.d.clear();
        this.e.clear();
        this.f.clear();
    }

    @Override  // com.dcinside.app.ad.util.a
    public void f() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.ad.util.AdSequentialNaverScriptAd$onLoad$1", f = "AdSequentialNaverScriptAd.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nAdSequentialNaverScriptAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSequentialNaverScriptAd.kt\ncom/dcinside/app/ad/util/AdSequentialNaverScriptAd$onLoad$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
        static final class com.dcinside.app.ad.util.l.a extends o implements A3.o {
            int k;
            final String l;
            final l m;
            final ViewGroup n;

            com.dcinside.app.ad.util.l.a(String s, l l0, ViewGroup viewGroup0, kotlin.coroutines.d d0) {
                this.l = s;
                this.m = l0;
                this.n = viewGroup0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.l
            public final kotlin.coroutines.d create(@m Object object0, @y4.l kotlin.coroutines.d d0) {
                return new com.dcinside.app.ad.util.l.a(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@y4.l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.ad.util.l.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.ad.util.AdSequentialNaverScriptAd$onLoad$1$1", f = "AdSequentialNaverScriptAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.ad.util.l.a.a extends o implements A3.o {
                    int k;
                    final ViewGroup l;
                    final l m;
                    final String n;

                    com.dcinside.app.ad.util.l.a.a(ViewGroup viewGroup0, l l0, String s, kotlin.coroutines.d d0) {
                        this.l = viewGroup0;
                        this.m = l0;
                        this.n = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.l
                    public final kotlin.coroutines.d create(@m Object object0, @y4.l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.ad.util.l.a.a(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@y4.l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.ad.util.l.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Context context0 = this.l.getContext();
                        VideoEnabledWebView videoEnabledWebView0 = new VideoEnabledWebView(context0);
                        L.m(context0);
                        videoEnabledWebView0.setBackgroundColor(vk.b(context0, 0x7F0406F5));  // attr:windowBackgroundColor
                        int v = 1;
                        videoEnabledWebView0.setTag(0x7F0B10CA, kotlin.coroutines.jvm.internal.b.a(true));  // id:web_fixed_size
                        videoEnabledWebView0.setTag(0x7F0B02F6, this.m);  // id:content_wv_context_callback
                        if(L.g("list", "list")) {
                            v = Dk.b(0x7F070058);  // dimen:ad_minimum_height
                        }
                        else if(L.g("list", "view")) {
                            v = Dk.b(0x7F0703D6);  // dimen:read_ad_minimum_height
                        }
                        else if(L.g("off", "on")) {
                            v = this.l.getHeight();
                        }
                        videoEnabledWebView0.setLayoutParams(new ViewGroup.LayoutParams(-1, v));
                        this.l.addView(videoEnabledWebView0);
                        f f0 = B.a.e(videoEnabledWebView0);
                        this.m.g = f0;
                        WebViews.r(videoEnabledWebView0, this.n);
                        return S0.a;
                    }
                }

                String s2;
                String s;
                GZIPInputStream gZIPInputStream0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        try {
                            byte[] arr_b = Base64.decode(this.l, 0);
                            L.m(arr_b);
                            gZIPInputStream0 = new GZIPInputStream(new ByteArrayInputStream(arr_b));
                        }
                        catch(Exception exception0) {
                            this.m.m(exception0);
                            l.n(this.m, null, 1, null);
                            return S0.a;
                        }
                        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(gZIPInputStream0, kotlin.text.f.b), 0x2000);
                        try {
                            s = y.k(bufferedReader0);
                        }
                        catch(Throwable throwable0) {
                            c.a(bufferedReader0, throwable0);
                            throw throwable0;
                        }
                        c.a(bufferedReader0, null);
                        String s1 = dl.a.q2().m() ? "on" : "off";
                        if(dl.a.q2().m()) {
                            Context context0 = this.n.getContext();
                            L.o(context0, "getContext(...)");
                            s2 = com.dcinside.app.internal.c.i(vk.b(context0, 0x7F0406F5));  // attr:windowBackgroundColor
                        }
                        else {
                            s2 = "";
                        }
                        org.jsoup.nodes.f f0 = Dl.A(s);
                        f0.p3().C0("<meta http-equiv=\'Content-Type\' content=\'text/html; charset=utf-8\' /><meta name=\'viewport\' content=\'user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width\' /><meta name=\'format-detection\' content=\'telephone=no\' /><link rel=\'icon\' type=\'image/png\' href=\'data:image/png;base64,iVBORw0KGgo=\' />");
                        f0.c3().L0("style", "margin:0;padding:0;max-width:100%%;word-wrap:break-word;");
                        String s3 = v.p(("\n            window.dcAdContent = {\n                darkmode: \"" + s1 + "\",\n                darkmode_color: \"" + s2 + "\",\n                mode: \"" + "list" + "\",\n                category: \"" + "" + "\",\n                id: \"" + "" + "\",\n                no: \"" + "" + "\",\n                subject: \"" + "" + "\",  \n                keywords: \"" + "" + "\",\n                adsmall: \"" + "off" + "\"\n            };\n            "));
                        org.jsoup.nodes.o o0 = f0.j3("script").L0("type", "text/javascript").C0(s3);
                        o0.C0("window.addEventListener(\"message\", function(e) {\nvar data = e.data;\nvar eventKey = data.dcKey;\nif (eventKey == \'naveradframe\') {\n    DcJsCallback.naver_ad_frame(data.height);\n}\n});");
                        f0.p3().Z1(0, new t[]{o0});
                        String s4 = f0.T1();
                        com.dcinside.app.ad.util.l.a.a l$a$a0 = new com.dcinside.app.ad.util.l.a.a(this.n, this.m, s4, null);
                        this.k = 1;
                        return i.h(h0.e(), l$a$a0, this) == object1 ? object1 : S0.a;
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

        if(this.a()) {
            return;
        }
        ViewGroup viewGroup0 = (ViewGroup)this.d.get();
        if(viewGroup0 == null) {
            l.n(this, null, 1, null);
            return;
        }
        String s = jl.a.u();
        viewGroup0.setVisibility((s.length() == 0 ? 4 : 0));
        s.c(viewGroup0);
        LifecycleOwner lifecycleOwner0 = (LifecycleOwner)this.e.get();
        if(lifecycleOwner0 != null) {
            LifecycleCoroutineScope lifecycleCoroutineScope0 = LifecycleOwnerKt.a(lifecycleOwner0);
            if(lifecycleCoroutineScope0 != null) {
                I0 i00 = this.i;
                if(i00 != null) {
                    kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                }
                this.i = k.f(lifecycleCoroutineScope0, h0.a(), null, new com.dcinside.app.ad.util.l.a(s, this, viewGroup0, null), 2, null);
                return;
            }
        }
        l.n(this, null, 1, null);
    }

    @Override  // com.dcinside.app.ad.util.a
    public void g() {
        f f0 = this.g;
        if(f0 != null) {
            f0.onPause();
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void h() {
        f f0 = this.g;
        if(f0 != null) {
            f0.onResume();
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void i(boolean z) {
        this.h = z;
    }

    public static final d j(l l0) {
        return l0.c;
    }

    private final void m(Throwable throwable0) {
        String s;
        if(this.a()) {
            return;
        }
        if(throwable0 == null) {
            s = "script failed";
        }
        else {
            s = throwable0.getMessage();
            if(s == null) {
                s = "script failed";
            }
        }
        this.c(s);
    }

    static void n(l l0, Throwable throwable0, int v, Object object0) {
        if((v & 1) != 0) {
            throwable0 = null;
        }
        l0.m(throwable0);
    }

    @Override  // com.dcinside.app.ad.naver.b
    public void onAdLoaded(int v) {
        ViewGroup viewGroup0 = (ViewGroup)this.d.get();
        if(viewGroup0 == null) {
            return;
        }
        com.dcinside.app.ad.naver.a a0 = (com.dcinside.app.ad.naver.a)this.f.get();
        if(a0 != null) {
            a0.O(v);
        }
        if(v > 0) {
            viewGroup0.setTag(null);
            return;
        }
        if(L.g("list", "list")) {
            l.n(this, null, 1, null);
            return;
        }
        if(L.g("list", "view")) {
            viewGroup0.setMinimumHeight(0);
            viewGroup0.setVisibility(8);
            return;
        }
        viewGroup0.setVisibility(4);
    }
}

