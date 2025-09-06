package com.vungle.ads.internal.ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.vungle.ads.internal.omsdk.g;
import kotlinx.serialization.json.y;
import y4.l;
import y4.m;

public interface c {
    public interface a {
        boolean processCommand(@l String arg1, @l y arg2);
    }

    public interface b {
        void onReceivedError(@l String arg1, boolean arg2);

        void onRenderProcessUnresponsive(@m WebView arg1, @m WebViewRenderProcess arg2);

        boolean onWebRenderingProcessGone(@m WebView arg1, @m Boolean arg2);
    }

    void notifyPropertiesChange(boolean arg1);

    void setAdVisibility(boolean arg1);

    void setConsentStatus(boolean arg1, @m String arg2, @m String arg3, @m String arg4, @m String arg5);

    void setErrorHandler(@l b arg1);

    void setMraidDelegate(@m a arg1);

    void setWebViewObserver(@m g arg1);
}

