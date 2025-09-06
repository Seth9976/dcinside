package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.WebViewApp;

public class WebViewHandler implements IAdUnitViewHandler {
    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean create(IAdUnitActivity iAdUnitActivity0) {
        return true;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean destroy() {
        if(WebViewApp.getCurrentApp() != null && WebViewApp.getCurrentApp().getWebView() != null) {
            ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
        }
        return true;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public View getView() {
        return WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().getWebView() : null;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onCreate(IAdUnitActivity iAdUnitActivity0, Bundle bundle0) {
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onDestroy(IAdUnitActivity iAdUnitActivity0) {
        this.destroy();
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onPause(IAdUnitActivity iAdUnitActivity0) {
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onResume(IAdUnitActivity iAdUnitActivity0) {
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStart(IAdUnitActivity iAdUnitActivity0) {
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStop(IAdUnitActivity iAdUnitActivity0) {
    }
}

