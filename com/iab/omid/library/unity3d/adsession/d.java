package com.iab.omid.library.unity3d.adsession;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.utils.g;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {
    private final m a;
    private final WebView b;
    private final List c;
    private final Map d;
    private final String e;
    private final String f;
    @Nullable
    private final String g;
    private final e h;

    private d(m m0, WebView webView0, String s, List list0, @Nullable String s1, String s2, e e0) {
        ArrayList arrayList0 = new ArrayList();
        this.c = arrayList0;
        this.d = new HashMap();
        this.a = m0;
        this.b = webView0;
        this.e = s;
        this.h = e0;
        if(list0 != null) {
            arrayList0.addAll(list0);
            for(Object object0: list0) {
                this.d.put("2019974a-822a-404a-8439-5c48970eca92", ((o)object0));
            }
        }
        this.g = s1;
        this.f = s2;
    }

    public static d a(m m0, WebView webView0, @Nullable String s, String s1) {
        g.d(m0, "Partner is null");
        g.d(webView0, "WebView is null");
        if(s1 != null) {
            g.e(s1, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new d(m0, webView0, null, null, s, s1, e.b);
    }

    public static d b(m m0, WebView webView0, @Nullable String s, String s1) {
        g.d(m0, "Partner is null");
        g.d(webView0, "WebView is null");
        if(s1 != null) {
            g.e(s1, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new d(m0, webView0, null, null, s, s1, e.d);
    }

    public static d c(m m0, String s, List list0, @Nullable String s1, String s2) {
        g.d(m0, "Partner is null");
        g.d(s, "OM SDK JS script content is null");
        g.d(list0, "VerificationScriptResources is null");
        if(s2 != null) {
            g.e(s2, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new d(m0, null, s, list0, s1, s2, e.c);
    }

    public e d() {
        return this.h;
    }

    @Nullable
    public String e() {
        return this.g;
    }

    public String f() {
        return this.f;
    }

    public Map g() {
        return DesugarCollections.unmodifiableMap(this.d);
    }

    public String h() {
        return this.e;
    }

    public m i() {
        return this.a;
    }

    public List j() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    public WebView k() {
        return this.b;
    }
}

