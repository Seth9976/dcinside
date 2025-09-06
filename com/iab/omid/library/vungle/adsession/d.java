package com.iab.omid.library.vungle.adsession;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.utils.g;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {
    private final n a;
    private final WebView b;
    private final List c;
    private final Map d;
    private final String e;
    @Nullable
    private final String f;
    @Nullable
    private final String g;
    private final e h;

    private d(n n0, WebView webView0, String s, List list0, @Nullable String s1, @Nullable String s2, e e0) {
        ArrayList arrayList0 = new ArrayList();
        this.c = arrayList0;
        this.d = new HashMap();
        this.a = n0;
        this.b = webView0;
        this.e = s;
        this.h = e0;
        if(list0 != null) {
            arrayList0.addAll(list0);
            for(Object object0: list0) {
                this.d.put("474a246a-4e10-4317-9656-39d2546e0a3b", ((p)object0));
            }
        }
        this.g = s1;
        this.f = s2;
    }

    public static d a(n n0, WebView webView0, @Nullable String s, @Nullable String s1) {
        g.d(n0, "Partner is null");
        g.d(webView0, "WebView is null");
        if(s1 != null) {
            g.e(s1, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new d(n0, webView0, null, null, s, s1, e.b);
    }

    public static d b(n n0, WebView webView0, @Nullable String s, @Nullable String s1) {
        g.d(n0, "Partner is null");
        g.d(webView0, "WebView is null");
        if(s1 != null) {
            g.e(s1, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new d(n0, webView0, null, null, s, s1, e.d);
    }

    public static d c(n n0, String s, List list0, @Nullable String s1, @Nullable String s2) {
        g.d(n0, "Partner is null");
        g.d(s, "OM SDK JS script content is null");
        g.d(list0, "VerificationScriptResources is null");
        if(s2 != null) {
            g.e(s2, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new d(n0, null, s, list0, s1, s2, e.c);
    }

    public e d() {
        return this.h;
    }

    @Nullable
    public String e() {
        return this.g;
    }

    @Nullable
    public String f() {
        return this.f;
    }

    public Map g() {
        return DesugarCollections.unmodifiableMap(this.d);
    }

    public String h() {
        return this.e;
    }

    public n i() {
        return this.a;
    }

    public List j() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    public WebView k() {
        return this.b;
    }
}

