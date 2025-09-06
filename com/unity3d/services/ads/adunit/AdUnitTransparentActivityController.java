package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.bridge.IEventSender;

public class AdUnitTransparentActivityController extends AdUnitActivityController {
    public AdUnitTransparentActivityController(IAdUnitActivity iAdUnitActivity0, IEventSender iEventSender0, IAdUnitViewHandlerFactory iAdUnitViewHandlerFactory0) {
        super(iAdUnitActivity0, iEventSender0, iAdUnitViewHandlerFactory0);
    }

    @Override  // com.unity3d.services.ads.adunit.AdUnitActivityController
    protected void createLayout() {
        super.createLayout();
        ViewUtilities.setBackground(this._layout, new ColorDrawable(0));
    }
}

