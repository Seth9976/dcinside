package com.iab.omid.library.vungle.adsession;

import C2.a;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat.WebMessageListener;
import androidx.webkit.WebViewFeature;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import com.iab.omid.library.vungle.utils.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public class k {
    public interface c {
        void onTearDown(boolean arg1);
    }

    private final n a;
    private final WebView b;
    private final boolean c;
    private a d;
    private final HashMap e;
    private final f f;
    private static String g = "method";
    private static String h = "data";
    private static String i = "omidJsSessionService";
    private static String j = "startSession";
    private static String k = "finishSession";
    private static String l = "adSessionId";
    private static i m;

    static {
        k.m = new i();
    }

    private k(n n0, WebView webView0, boolean z) {
        this.e = new HashMap();
        this.f = new f();
        g.a();
        g.d(n0, "Partner is null");
        g.d(webView0, "WebView is null");
        this.a = n0;
        this.b = webView0;
        this.c = z;
        if(z) {
            this.s(webView0);
        }
        this.j();
    }

    // 去混淆评级： 低(20)
    static String b() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static String c() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static String d() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static String e() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static String g() [...] // 潜在的解密器

    public void i(View view0, com.iab.omid.library.vungle.adsession.i i0, @Nullable String s) {
        for(Object object0: this.e.values()) {
            ((b)object0).a(view0, i0, s);
        }
        this.f.c(view0, i0, s);
    }

    private void j() {
        class com.iab.omid.library.vungle.adsession.k.b implements WebMessageListener {
            final k a;

            @Override  // androidx.webkit.WebViewCompat$WebMessageListener
            public void onPostMessage(WebView webView0, WebMessageCompat webMessageCompat0, Uri uri0, boolean z, JavaScriptReplyProxy javaScriptReplyProxy0) {
                String s = webMessageCompat0.c();
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    String s1 = jSONObject0.getString("method");
                    String s2 = jSONObject0.getJSONObject("data").getString("adSessionId");
                    if(s1.equals("startSession")) {
                        k.this.t(s2);
                        return;
                    }
                    if(s1.equals("finishSession")) {
                        k.this.n(s2);
                        return;
                    }
                    d.c(("Unexpected method in JavaScriptSessionService: " + s1));
                    return;
                }
                catch(JSONException jSONException0) {
                }
                d.b("Error parsing JS message in JavaScriptSessionService.", jSONException0);
            }
        }

        if(!WebViewFeature.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        this.r();
        com.iab.omid.library.vungle.adsession.k.b k$b0 = new com.iab.omid.library.vungle.adsession.k.b(this);
        i i0 = k.m;
        HashSet hashSet0 = new HashSet(Arrays.asList(new String[]{"*"}));
        i0.b(this.b, "omidJsSessionService", hashSet0, k$b0);
    }

    public static k k(n n0, WebView webView0, boolean z) {
        return new k(n0, webView0, z);
    }

    private com.iab.omid.library.vungle.adsession.c l() {
        return com.iab.omid.library.vungle.adsession.c.a(com.iab.omid.library.vungle.adsession.f.b, j.b, m.c, m.c, false);
    }

    // 去混淆评级： 低(20)
    private com.iab.omid.library.vungle.adsession.d m() {
        return this.c ? com.iab.omid.library.vungle.adsession.d.a(this.a, this.b, null, null) : com.iab.omid.library.vungle.adsession.d.b(this.a, this.b, null, null);
    }

    private void n(String s) {
        b b0 = (b)this.e.get(s);
        if(b0 != null) {
            b0.d();
            this.e.remove(s);
        }
    }

    @Nullable
    View o() {
        return this.d == null ? null : ((View)this.d.get());
    }

    public void p() {
        for(Object object0: this.e.values()) {
            ((b)object0).h();
        }
        this.f.f();
    }

    public void q(View view0) {
        for(Object object0: this.e.values()) {
            ((b)object0).i(view0);
        }
        this.f.g(view0);
    }

    private void r() {
        k.m.a(this.b, "omidJsSessionService");
    }

    public void s(@Nullable View view0) {
        if(this.o() == view0) {
            return;
        }
        for(Object object0: this.e.values()) {
            ((b)object0).g(view0);
        }
        this.d = new a(view0);
    }

    private void t(String s) {
        q q0 = new q(this.l(), this.m(), s);
        this.e.put(s, q0);
        q0.g(this.o());
        for(Object object0: this.f.a()) {
            q0.a(((View)((e)object0).c().get()), ((e)object0).b(), ((e)object0).a());
        }
        q0.k();
    }

    public void u(c k$c0) {
        class com.iab.omid.library.vungle.adsession.k.a extends TimerTask {
            final c a;
            final Timer b;
            final k c;

            com.iab.omid.library.vungle.adsession.k.a(c k$c0, Timer timer0) {
                this.a = k$c0;
                this.b = timer0;
                super();
            }

            @Override
            public void run() {
                k.this.r();
                this.a.onTearDown(true);
                this.b.cancel();
            }
        }

        for(Object object0: this.e.values()) {
            ((b)object0).d();
        }
        Timer timer0 = new Timer();
        timer0.schedule(new com.iab.omid.library.vungle.adsession.k.a(this, k$c0, timer0), 1000L);
    }
}

