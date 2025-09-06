package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.signals.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;

public class SignalsHandler implements b {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender0) {
        this._gmaEventSender = gMAEventSender0;
    }

    @Override  // com.unity3d.scar.adapter.common.signals.b
    public void onSignalsCollected(String s) {
        this._gmaEventSender.send(c.h, new Object[]{s});
    }

    @Override  // com.unity3d.scar.adapter.common.signals.b
    public void onSignalsCollectionFailed(String s) {
        this._gmaEventSender.send(c.i, new Object[]{s});
    }
}

