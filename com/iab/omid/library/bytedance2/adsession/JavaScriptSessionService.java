package com.iab.omid.library.bytedance2.adsession;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat.WebMessageListener;
import androidx.webkit.WebViewFeature;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import com.iab.omid.library.bytedance2.utils.i;
import com.iab.omid.library.bytedance2.weakreference.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public class JavaScriptSessionService {
    public interface TearDownHandler {
        void onTearDown(boolean arg1);
    }

    private static String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    private static String JS_MESSAGE_KEY_DATA = "data";
    private static String JS_MESSAGE_KEY_METHOD = "method";
    private static String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    private static String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    private static String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private final HashMap adSessions;
    private final f friendlyObstructions;
    private final boolean isHtmlAdView;
    private final Partner partner;
    private a weakAdView;
    private final WebView webView;
    private static i webViewUtil;

    static {
        JavaScriptSessionService.webViewUtil = new i();
    }

    private JavaScriptSessionService(Partner partner0, WebView webView0, boolean z) {
        this.adSessions = new HashMap();
        this.friendlyObstructions = new f();
        g.a();
        g.a(partner0, "Partner is null");
        g.a(webView0, "WebView is null");
        this.partner = partner0;
        this.webView = webView0;
        this.isHtmlAdView = z;
        this.addWebViewListener();
    }

    // 去混淆评级： 低(20)
    static String access$100() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static String access$200() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static String access$300() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static String access$400() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    static String access$600() [...] // 潜在的解密器

    public void addFriendlyObstruction(View view0, FriendlyObstructionPurpose friendlyObstructionPurpose0, @Nullable String s) {
        for(Object object0: this.adSessions.values()) {
            ((AdSession)object0).addFriendlyObstruction(view0, friendlyObstructionPurpose0, s);
        }
        this.friendlyObstructions.a(view0, friendlyObstructionPurpose0, s);
    }

    private void addWebViewListener() {
        if(!WebViewFeature.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        this.removeWebViewListener();
        com.iab.omid.library.bytedance2.adsession.JavaScriptSessionService.2 javaScriptSessionService$20 = new WebMessageListener() {
            @Override  // androidx.webkit.WebViewCompat$WebMessageListener
            public void onPostMessage(WebView webView0, WebMessageCompat webMessageCompat0, Uri uri0, boolean z, JavaScriptReplyProxy javaScriptReplyProxy0) {
                String s = webMessageCompat0.c();
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    String s1 = jSONObject0.getString("method");
                    String s2 = jSONObject0.getJSONObject("data").getString("adSessionId");
                    if(s1.equals("startSession")) {
                        JavaScriptSessionService.this.startSession(s2);
                        return;
                    }
                    if(s1.equals("finishSession")) {
                        JavaScriptSessionService.this.finishSession(s2);
                        return;
                    }
                    d.b(("Unexpected method in JavaScriptSessionService: " + s1));
                    return;
                }
                catch(JSONException jSONException0) {
                }
                d.a("Error parsing JS message in JavaScriptSessionService.", jSONException0);
            }
        };
        i i0 = JavaScriptSessionService.webViewUtil;
        HashSet hashSet0 = new HashSet(Arrays.asList(new String[]{"*"}));
        i0.a(this.webView, "omidJsSessionService", hashSet0, javaScriptSessionService$20);
    }

    public static JavaScriptSessionService create(Partner partner0, WebView webView0, boolean z) {
        return new JavaScriptSessionService(partner0, webView0, z);
    }

    private AdSessionConfiguration createAdSessionConfiguration() {
        return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.DEFINED_BY_JAVASCRIPT, ImpressionType.DEFINED_BY_JAVASCRIPT, Owner.JAVASCRIPT, Owner.JAVASCRIPT, false);
    }

    // 去混淆评级： 低(20)
    private AdSessionContext createAdSessionContext() {
        return this.isHtmlAdView ? AdSessionContext.createHtmlAdSessionContext(this.partner, this.webView, null, null) : AdSessionContext.createJavascriptAdSessionContext(this.partner, this.webView, null, null);
    }

    private void finishSession(String s) {
        AdSession adSession0 = (AdSession)this.adSessions.get(s);
        if(adSession0 != null) {
            adSession0.finish();
            this.adSessions.remove(s);
        }
    }

    @Nullable
    View getAdView() {
        return this.weakAdView == null ? null : ((View)this.weakAdView.get());
    }

    public void removeAllFriendlyObstructions() {
        for(Object object0: this.adSessions.values()) {
            ((AdSession)object0).removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.b();
    }

    public void removeFriendlyObstruction(View view0) {
        for(Object object0: this.adSessions.values()) {
            ((AdSession)object0).removeFriendlyObstruction(view0);
        }
        this.friendlyObstructions.c(view0);
    }

    private void removeWebViewListener() {
        JavaScriptSessionService.webViewUtil.a(this.webView, "omidJsSessionService");
    }

    public void setAdView(View view0) {
        if(this.isHtmlAdView) {
            if(view0 != this.webView) {
                throw new UnsupportedOperationException("For HTML-rendered ads, the ad view is automatically set to the web view and cannot be changed.");
            }
            return;
        }
        for(Object object0: this.adSessions.values()) {
            ((AdSession)object0).registerAdView(view0);
        }
        this.weakAdView = new a(view0);
    }

    private void startSession(String s) {
        com.iab.omid.library.bytedance2.adsession.a a0 = new com.iab.omid.library.bytedance2.adsession.a(this.createAdSessionConfiguration(), this.createAdSessionContext(), s);
        this.adSessions.put(s, a0);
        View view0 = this.isHtmlAdView ? this.webView : this.getAdView();
        a0.registerAdView(view0);
        for(Object object0: this.friendlyObstructions.a()) {
            a0.addFriendlyObstruction(((View)((e)object0).c().get()), ((e)object0).b(), ((e)object0).a());
        }
        a0.start();
    }

    public void tearDown(TearDownHandler javaScriptSessionService$TearDownHandler0) {
        for(Object object0: this.adSessions.values()) {
            ((AdSession)object0).finish();
        }
        Timer timer0 = new Timer();
        timer0.schedule(new TimerTask() {
            @Override
            public void run() {
                JavaScriptSessionService.this.removeWebViewListener();
                javaScriptSessionService$TearDownHandler0.onTearDown(true);
                timer0.cancel();
            }
        }, 1000L);
    }
}

