package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.ads.webplayer.WebPlayerView;
import com.unity3d.services.ads.webplayer.WebPlayerViewCache;
import com.unity3d.services.core.misc.ViewUtilities;

public class WebPlayerHandler implements IAdUnitViewHandler {
    private WebPlayerView _webPlayerView;
    private static String webPlayerViewId = "webplayer";

    static {
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean create(IAdUnitActivity iAdUnitActivity0) {
        if(this._webPlayerView == null) {
            WebPlayerSettingsCache webPlayerSettingsCache0 = WebPlayerSettingsCache.getInstance();
            WebPlayerView webPlayerView0 = new WebPlayerView(iAdUnitActivity0.getContext(), "webplayer", webPlayerSettingsCache0.getWebSettings("webplayer"), webPlayerSettingsCache0.getWebPlayerSettings("webplayer"));
            this._webPlayerView = webPlayerView0;
            webPlayerView0.setEventSettings(webPlayerSettingsCache0.getWebPlayerEventSettings("webplayer"));
            WebPlayerViewCache.getInstance().addWebPlayer("webplayer", this._webPlayerView);
        }
        return true;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean destroy() {
        WebPlayerView webPlayerView0 = this._webPlayerView;
        if(webPlayerView0 != null) {
            ViewUtilities.removeViewFromParent(webPlayerView0);
            this._webPlayerView.destroy();
        }
        WebPlayerViewCache.getInstance().removeWebPlayer("webplayer");
        this._webPlayerView = null;
        return true;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public View getView() {
        return this._webPlayerView;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onCreate(IAdUnitActivity iAdUnitActivity0, Bundle bundle0) {
        this.create(iAdUnitActivity0);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onDestroy(IAdUnitActivity iAdUnitActivity0) {
        if(iAdUnitActivity0.isFinishing()) {
            this.destroy();
        }
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

