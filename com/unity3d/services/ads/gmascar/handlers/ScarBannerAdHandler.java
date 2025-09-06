package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.g;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.bridge.BannerBridge.BannerEvent;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;

public class ScarBannerAdHandler implements g {
    private final IEventSender _eventSender;
    private final String _operationId;

    public ScarBannerAdHandler(IEventSender iEventSender0, String s) {
        this._eventSender = iEventSender0;
        this._operationId = s;
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdClicked() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_CLICKED, new Object[]{this._operationId});
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdClosed() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_CLOSED, new Object[]{this._operationId});
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdFailedToLoad(int v, String s) {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_LOAD_FAILED, new Object[]{this._operationId, v, s});
    }

    @Override  // com.unity3d.scar.adapter.common.g
    public void onAdImpression() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_IMPRESSION, new Object[]{this._operationId});
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdLoaded() {
        BannerViewCache.getInstance().addScarContainer(this._operationId);
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_LOADED, new Object[]{this._operationId});
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdOpened() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_OPENED, new Object[]{this._operationId});
    }
}

