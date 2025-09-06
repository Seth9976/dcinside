package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    @l
    private final DiagnosticEventRepository diagnosticEventRepository;
    @l
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;

    public AndroidSendDiagnosticEvent(@l DiagnosticEventRepository diagnosticEventRepository0, @l GetDiagnosticEventRequest getDiagnosticEventRequest0) {
        L.p(diagnosticEventRepository0, "diagnosticEventRepository");
        L.p(getDiagnosticEventRequest0, "getDiagnosticEventRequest");
        super();
        this.diagnosticEventRepository = diagnosticEventRepository0;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest0;
    }

    @Override  // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(@l String s, @m Double double0, @m Map map0, @m Map map1, @m AdObject adObject0) {
        Map map2;
        L.p(s, "event");
        DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0 = null;
        Boolean boolean0 = adObject0 == null ? null : Boolean.valueOf(adObject0.isHeaderBidding());
        ByteString byteString0 = adObject0 == null ? null : adObject0.getOpportunityId();
        String s1 = adObject0 == null ? null : adObject0.getPlacementId();
        if(adObject0 != null) {
            diagnosticEventRequestOuterClass$DiagnosticAdType0 = adObject0.getAdType();
        }
        if(map0 == null) {
            map2 = new LinkedHashMap();
        }
        else {
            map2 = Y.J0(map0);
            if(map2 == null) {
                map2 = new LinkedHashMap();
            }
        }
        if(adObject0 != null && adObject0.isScarAd()) {
            map2.put("scar", "true");
        }
        if(adObject0 != null && adObject0.isOfferwallAd()) {
            map2.put("offerwall", "true");
        }
        DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0 = this.getDiagnosticEventRequest.invoke(s, map2, map1, double0, boolean0, byteString0, s1, diagnosticEventRequestOuterClass$DiagnosticAdType0);
        this.diagnosticEventRepository.addDiagnosticEvent(diagnosticEventRequestOuterClass$DiagnosticEvent0);
    }
}

