package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.DiagnosticEventKt.Dsl;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import y4.l;
import y4.m;

@s0({"SMAP\nGetDiagnosticEventRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetDiagnosticEventRequest.kt\ncom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest\n+ 2 DiagnosticEventKt.kt\ngatewayprotocol/v1/DiagnosticEventKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,42:1\n10#2:43\n1#3:44\n1#3:50\n198#4,5:45\n*S KotlinDebug\n*F\n+ 1 GetDiagnosticEventRequest.kt\ncom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest\n*L\n27#1:43\n27#1:44\n28#1:45,5\n*E\n"})
public final class GetDiagnosticEventRequest {
    @l
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    @l
    private final E uniqueId;

    public GetDiagnosticEventRequest(@l GetSharedDataTimestamps getSharedDataTimestamps0) {
        L.p(getSharedDataTimestamps0, "getSharedDataTimestamps");
        super();
        this.getSharedDataTimestamps = getSharedDataTimestamps0;
        this.uniqueId = W.a(-1);
    }

    @l
    public final DiagnosticEvent invoke(@l String s, @m Map map0, @m Map map1, @m Double double0, @m Boolean boolean0, @m ByteString byteString0, @m String s1, @m DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0) {
        Integer integer0;
        L.p(s, "eventName");
        Builder diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0 = DiagnosticEvent.newBuilder();
        L.o(diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0, "newBuilder()");
        Dsl diagnosticEventKt$Dsl0 = Dsl.Companion._create(diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0);
        E e0 = this.uniqueId;
        do {
            Object object0 = e0.getValue();
            integer0 = (int)(((Number)object0).intValue() + 1);
        }
        while(!e0.compareAndSet(object0, integer0));
        diagnosticEventKt$Dsl0.setEventId(integer0.intValue());
        diagnosticEventKt$Dsl0.setEventType(DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        diagnosticEventKt$Dsl0.setTimestamps(this.getSharedDataTimestamps.invoke());
        diagnosticEventKt$Dsl0.setCustomEventType(s);
        if(map0 != null) {
            diagnosticEventKt$Dsl0.putAllStringTags(diagnosticEventKt$Dsl0.getStringTagsMap(), map0);
        }
        if(map1 != null) {
            diagnosticEventKt$Dsl0.putAllIntTags(diagnosticEventKt$Dsl0.getIntTagsMap(), map1);
        }
        if(double0 != null) {
            diagnosticEventKt$Dsl0.setTimeValue(double0.doubleValue());
        }
        if(boolean0 != null) {
            diagnosticEventKt$Dsl0.setIsHeaderBidding(boolean0.booleanValue());
        }
        if(byteString0 != null) {
            diagnosticEventKt$Dsl0.setImpressionOpportunityId(byteString0);
        }
        if(s1 != null) {
            diagnosticEventKt$Dsl0.setPlacementId(s1);
        }
        if(diagnosticEventRequestOuterClass$DiagnosticAdType0 != null) {
            diagnosticEventKt$Dsl0.setAdType(diagnosticEventRequestOuterClass$DiagnosticAdType0);
        }
        return diagnosticEventKt$Dsl0._build();
    }
}

