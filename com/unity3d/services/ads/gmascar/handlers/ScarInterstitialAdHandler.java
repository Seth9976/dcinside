package com.unity3d.services.ads.gmascar.handlers;

import P2.d;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;

public class ScarInterstitialAdHandler extends ScarAdHandlerBase implements h {
    public ScarInterstitialAdHandler(d d0, EventSubject eventSubject0, GMAEventSender gMAEventSender0) {
        super(d0, eventSubject0, gMAEventSender0);
    }

    @Override  // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.e
    public void onAdClosed() {
        if(!this._eventSubject.eventQueueIsEmpty()) {
            this.onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override  // com.unity3d.scar.adapter.common.h
    public void onAdFailedToShow(int v, String s) {
        this._gmaEventSender.send(c.v, new Object[]{this._scarAdMetadata.c(), this._scarAdMetadata.d(), s, v});
    }

    @Override  // com.unity3d.scar.adapter.common.h
    public void onAdImpression() {
        this._gmaEventSender.send(c.l, new Object[0]);
    }

    @Override  // com.unity3d.scar.adapter.common.h
    public void onAdLeftApplication() {
        this._gmaEventSender.send(c.D, new Object[0]);
    }

    @Override  // com.unity3d.scar.adapter.common.h
    public void onAdSkipped() {
        this._gmaEventSender.send(c.C, new Object[0]);
    }
}

