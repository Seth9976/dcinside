package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.bridge.SharedInstances;

public class AdUnitTransparentActivity extends AdUnitActivity {
    @Override  // com.unity3d.services.ads.adunit.AdUnitActivity
    protected AdUnitActivityController createController() {
        AdUnitViewHandlerFactory adUnitViewHandlerFactory0 = new AdUnitViewHandlerFactory();
        return new AdUnitTransparentActivityController(this, SharedInstances.INSTANCE.getWebViewEventSender(), adUnitViewHandlerFactory0);
    }

    @Override  // com.unity3d.services.ads.adunit.AdUnitActivity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ViewUtilities.setBackground(this._controller._layout, new ColorDrawable(0));
    }
}

