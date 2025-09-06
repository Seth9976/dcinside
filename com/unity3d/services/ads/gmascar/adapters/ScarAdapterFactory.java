package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.v2100.b;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.log.DeviceLog;

public class ScarAdapterFactory {
    public f createScarAdapter(ScarAdapterVersion scarAdapterVersion0, d d0) {
        switch(scarAdapterVersion0) {
            case 1: {
                return new b(d0, "4.14.1");
            }
            case 2: {
                return new com.unity3d.scar.adapter.v2300.b(d0, "4.14.1");
            }
            default: {
                this.reportAdapterFailure(scarAdapterVersion0, d0);
                return null;
            }
        }
    }

    private void reportAdapterFailure(ScarAdapterVersion scarAdapterVersion0, d d0) {
        String s = String.format("SCAR version %s is not supported.", scarAdapterVersion0.name());
        d0.handleError(com.unity3d.scar.adapter.common.b.b(s));
        DeviceLog.debug(s);
    }
}

