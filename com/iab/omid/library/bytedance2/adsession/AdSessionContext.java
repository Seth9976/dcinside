package com.iab.omid.library.bytedance2.adsession;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.utils.g;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AdSessionContext {
    private final AdSessionContextType adSessionContextType;
    @Nullable
    private final String contentUrl;
    @Nullable
    private final String customReferenceData;
    private final Map injectedResourcesMap;
    private final String omidJsScriptContent;
    private final Partner partner;
    private final List verificationScriptResources;
    private final WebView webView;

    private AdSessionContext(Partner partner0, WebView webView0, String s, List list0, @Nullable String s1, @Nullable String s2, AdSessionContextType adSessionContextType0) {
        ArrayList arrayList0 = new ArrayList();
        this.verificationScriptResources = arrayList0;
        this.injectedResourcesMap = new HashMap();
        this.partner = partner0;
        this.webView = webView0;
        this.omidJsScriptContent = s;
        this.adSessionContextType = adSessionContextType0;
        if(list0 != null) {
            arrayList0.addAll(list0);
            for(Object object0: list0) {
                this.injectedResourcesMap.put("95845dd1-853b-4e17-bcf5-585017740db5", ((VerificationScriptResource)object0));
            }
        }
        this.contentUrl = s1;
        this.customReferenceData = s2;
    }

    public static AdSessionContext createHtmlAdSessionContext(Partner partner0, WebView webView0, @Nullable String s, @Nullable String s1) {
        g.a(partner0, "Partner is null");
        g.a(webView0, "WebView is null");
        if(s1 != null) {
            g.a(s1, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner0, webView0, null, null, s, s1, AdSessionContextType.HTML);
    }

    public static AdSessionContext createJavascriptAdSessionContext(Partner partner0, WebView webView0, @Nullable String s, @Nullable String s1) {
        g.a(partner0, "Partner is null");
        g.a(webView0, "WebView is null");
        if(s1 != null) {
            g.a(s1, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner0, webView0, null, null, s, s1, AdSessionContextType.JAVASCRIPT);
    }

    public static AdSessionContext createNativeAdSessionContext(Partner partner0, String s, List list0, @Nullable String s1, @Nullable String s2) {
        g.a(partner0, "Partner is null");
        g.a(s, "OM SDK JS script content is null");
        g.a(list0, "VerificationScriptResources is null");
        if(s2 != null) {
            g.a(s2, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner0, null, s, list0, s1, s2, AdSessionContextType.NATIVE);
    }

    public AdSessionContextType getAdSessionContextType() {
        return this.adSessionContextType;
    }

    @Nullable
    public String getContentUrl() {
        return this.contentUrl;
    }

    @Nullable
    public String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public Map getInjectedResourcesMap() {
        return DesugarCollections.unmodifiableMap(this.injectedResourcesMap);
    }

    public String getOmidJsScriptContent() {
        return this.omidJsScriptContent;
    }

    public Partner getPartner() {
        return this.partner;
    }

    public List getVerificationScriptResources() {
        return DesugarCollections.unmodifiableList(this.verificationScriptResources);
    }

    public WebView getWebView() {
        return this.webView;
    }
}

