package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.DiagnosticEventRequestKt.Dsl;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nGetDiagnosticEventBatchRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetDiagnosticEventBatchRequest.kt\ncom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest\n+ 2 DiagnosticEventRequestKt.kt\ngatewayprotocol/v1/DiagnosticEventRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n10#2:16\n1#3:17\n*S KotlinDebug\n*F\n+ 1 GetDiagnosticEventBatchRequest.kt\ncom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest\n*L\n11#1:16\n11#1:17\n*E\n"})
public final class GetDiagnosticEventBatchRequest {
    @l
    public final DiagnosticEventRequest invoke(@l List list0) {
        L.p(list0, "diagnosticEvents");
        Builder diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0 = DiagnosticEventRequest.newBuilder();
        L.o(diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0, "newBuilder()");
        Dsl diagnosticEventRequestKt$Dsl0 = Dsl.Companion._create(diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0);
        diagnosticEventRequestKt$Dsl0.addAllBatch(diagnosticEventRequestKt$Dsl0.getBatch(), list0);
        return diagnosticEventRequestKt$Dsl0._build();
    }
}

