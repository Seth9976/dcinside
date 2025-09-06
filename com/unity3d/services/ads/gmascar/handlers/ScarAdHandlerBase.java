package com.unity3d.services.ads.gmascar.handlers;

import P2.d;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.e;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;

public abstract class ScarAdHandlerBase implements e {
    protected final EventSubject _eventSubject;
    protected final GMAEventSender _gmaEventSender;
    protected final d _scarAdMetadata;

    public ScarAdHandlerBase(d d0, EventSubject eventSubject0, GMAEventSender gMAEventSender0) {
        this._scarAdMetadata = d0;
        this._eventSubject = eventSubject0;
        this._gmaEventSender = gMAEventSender0;
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdClicked() {
        this._gmaEventSender.send(c.B, new Object[0]);
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdClosed() {
        this._gmaEventSender.send(c.E, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdFailedToLoad(int v, String s) {
        Object[] arr_object = {this._scarAdMetadata.c(), this._scarAdMetadata.d(), s, v};
        this._gmaEventSender.send(c.p, arr_object);
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdLoaded() {
        Object[] arr_object = {this._scarAdMetadata.c(), this._scarAdMetadata.d()};
        this._gmaEventSender.send(c.k, arr_object);
    }

    @Override  // com.unity3d.scar.adapter.common.e
    public void onAdOpened() {
        this._gmaEventSender.send(c.r, new Object[0]);
        com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.1 scarAdHandlerBase$10 = new IEventListener() {
            public void onNextEvent(c c0) {
                ScarAdHandlerBase.this._gmaEventSender.send(c0, new Object[0]);
            }

            @Override  // com.unity3d.services.core.misc.IEventListener
            public void onNextEvent(Object object0) {
                this.onNextEvent(((c)object0));
            }
        };
        this._eventSubject.subscribe(scarAdHandlerBase$10);
    }
}

