package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.a;
import com.iab.omid.library.unity3d.adsession.b;
import com.iab.omid.library.unity3d.adsession.c;
import com.iab.omid.library.unity3d.adsession.d;
import com.iab.omid.library.unity3d.adsession.f;
import com.iab.omid.library.unity3d.adsession.j;
import y4.l;
import y4.m;

public interface OmidManager {
    void activate(@l Context arg1);

    @l
    a createAdEvents(@l b arg1);

    @l
    b createAdSession(@l c arg1, @l d arg2);

    @l
    c createAdSessionConfiguration(@l f arg1, @l j arg2, @l com.iab.omid.library.unity3d.adsession.l arg3, @l com.iab.omid.library.unity3d.adsession.l arg4, boolean arg5);

    @l
    d createHtmlAdSessionContext(@m com.iab.omid.library.unity3d.adsession.m arg1, @m WebView arg2, @m String arg3, @m String arg4);

    @l
    d createJavaScriptAdSessionContext(@m com.iab.omid.library.unity3d.adsession.m arg1, @m WebView arg2, @m String arg3, @m String arg4);

    @l
    String getVersion();

    boolean isActive();
}

