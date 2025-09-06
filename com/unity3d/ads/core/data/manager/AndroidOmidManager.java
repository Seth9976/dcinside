package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.a;
import com.iab.omid.library.unity3d.adsession.b;
import com.iab.omid.library.unity3d.adsession.c;
import com.iab.omid.library.unity3d.adsession.d;
import com.iab.omid.library.unity3d.adsession.f;
import com.iab.omid.library.unity3d.adsession.j;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidOmidManager implements OmidManager {
    @Override  // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(@l Context context0) {
        L.p(context0, "context");
        a.a(context0);
    }

    @Override  // com.unity3d.ads.core.data.manager.OmidManager
    @l
    public com.iab.omid.library.unity3d.adsession.a createAdEvents(@l b b0) {
        L.p(b0, "adSession");
        com.iab.omid.library.unity3d.adsession.a a0 = com.iab.omid.library.unity3d.adsession.a.a(b0);
        L.o(a0, "createAdEvents(adSession)");
        return a0;
    }

    @Override  // com.unity3d.ads.core.data.manager.OmidManager
    @l
    public b createAdSession(@l c c0, @l d d0) {
        L.p(c0, "adSessionConfiguration");
        L.p(d0, "context");
        b b0 = b.b(c0, d0);
        L.o(b0, "createAdSession(adSessionConfiguration, context)");
        return b0;
    }

    @Override  // com.unity3d.ads.core.data.manager.OmidManager
    @l
    public c createAdSessionConfiguration(@l f f0, @l j j0, @l com.iab.omid.library.unity3d.adsession.l l0, @l com.iab.omid.library.unity3d.adsession.l l1, boolean z) {
        L.p(f0, "creativeType");
        L.p(j0, "impressionType");
        L.p(l0, "owner");
        L.p(l1, "mediaEventsOwner");
        c c0 = c.a(f0, j0, l0, l1, z);
        L.o(c0, "createAdSessionConfigura…VerificationScripts\n    )");
        return c0;
    }

    @Override  // com.unity3d.ads.core.data.manager.OmidManager
    @l
    public d createHtmlAdSessionContext(@m com.iab.omid.library.unity3d.adsession.m m0, @m WebView webView0, @m String s, @m String s1) {
        d d0 = d.a(m0, webView0, s, s1);
        L.o(d0, "createHtmlAdSessionConte…customReferenceData\n    )");
        return d0;
    }

    @Override  // com.unity3d.ads.core.data.manager.OmidManager
    @l
    public d createJavaScriptAdSessionContext(@m com.iab.omid.library.unity3d.adsession.m m0, @m WebView webView0, @m String s, @m String s1) {
        d d0 = d.b(m0, webView0, s, s1);
        L.o(d0, "createJavascriptAdSessio…customReferenceData\n    )");
        return d0;
    }

    // 去混淆评级： 低(30)
    @Override  // com.unity3d.ads.core.data.manager.OmidManager
    @l
    public String getVersion() {
        L.o("1.4.9-Unity3d", "getVersion()");
        return "1.4.9-Unity3d";
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return false;
    }
}

