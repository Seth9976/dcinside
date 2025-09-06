package com.unity3d.ads.core.domain.work;

import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.kotlin.DslList;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent;
import gatewayprotocol.v1.UniversalRequestKt.Dsl;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nDiagnosticEventRequestWorkModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticEventRequestWorkModifier.kt\ncom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier\n+ 2 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DiagnosticEventRequestKt.kt\ngatewayprotocol/v1/DiagnosticEventRequestKtKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 DiagnosticEventKt.kt\ngatewayprotocol/v1/DiagnosticEventKtKt\n*L\n1#1,32:1\n874#2:33\n901#2:35\n1#3:34\n1#3:36\n1#3:38\n1#3:43\n131#4:37\n1549#5:39\n1620#5,2:40\n1622#5:44\n503#6:42\n*S KotlinDebug\n*F\n+ 1 DiagnosticEventRequestWorkModifier.kt\ncom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier\n*L\n17#1:33\n18#1:35\n17#1:34\n18#1:36\n19#1:38\n21#1:43\n19#1:37\n20#1:39\n20#1:40,2\n20#1:44\n21#1:42\n*E\n"})
public final class DiagnosticEventRequestWorkModifier {
    @l
    private final LifecycleDataSource lifecycleDataSource;
    @l
    private final SessionRepository sessionRepository;

    public DiagnosticEventRequestWorkModifier(@l SessionRepository sessionRepository0, @l LifecycleDataSource lifecycleDataSource0) {
        L.p(sessionRepository0, "sessionRepository");
        L.p(lifecycleDataSource0, "lifecycleDataSource");
        super();
        this.sessionRepository = sessionRepository0;
        this.lifecycleDataSource = lifecycleDataSource0;
    }

    @l
    public final UniversalRequest invoke(@l UniversalRequest universalRequestOuterClass$UniversalRequest0) {
        L.p(universalRequestOuterClass$UniversalRequest0, "universalRequest");
        Builder generatedMessageLite$Builder0 = universalRequestOuterClass$UniversalRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl universalRequestKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder)generatedMessageLite$Builder0));
        Builder generatedMessageLite$Builder1 = universalRequestKt$Dsl0.getPayload().toBuilder();
        L.o(generatedMessageLite$Builder1, "this.toBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl universalRequestKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion._create(((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder)generatedMessageLite$Builder1));
        Builder generatedMessageLite$Builder2 = universalRequestKt$PayloadKt$Dsl0.getDiagnosticEventRequest().toBuilder();
        L.o(generatedMessageLite$Builder2, "this.toBuilder()");
        gatewayprotocol.v1.DiagnosticEventRequestKt.Dsl diagnosticEventRequestKt$Dsl0 = gatewayprotocol.v1.DiagnosticEventRequestKt.Dsl.Companion._create(((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder)generatedMessageLite$Builder2));
        DslList dslList0 = diagnosticEventRequestKt$Dsl0.getBatch();
        ArrayList arrayList0 = new ArrayList(u.b0(dslList0, 10));
        for(Object object0: dslList0) {
            Builder generatedMessageLite$Builder3 = ((DiagnosticEvent)object0).toBuilder();
            L.o(generatedMessageLite$Builder3, "this.toBuilder()");
            gatewayprotocol.v1.DiagnosticEventKt.Dsl diagnosticEventKt$Dsl0 = gatewayprotocol.v1.DiagnosticEventKt.Dsl.Companion._create(((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder)generatedMessageLite$Builder3));
            diagnosticEventKt$Dsl0.putStringTags(diagnosticEventKt$Dsl0.getStringTagsMap(), "same_session", String.valueOf(L.g(universalRequestOuterClass$UniversalRequest0.getSharedData().getSessionToken(), this.sessionRepository.getSessionToken())));
            diagnosticEventKt$Dsl0.putStringTags(diagnosticEventKt$Dsl0.getStringTagsMap(), "app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
            arrayList0.add(diagnosticEventKt$Dsl0._build());
        }
        diagnosticEventRequestKt$Dsl0.clearBatch(diagnosticEventRequestKt$Dsl0.getBatch());
        diagnosticEventRequestKt$Dsl0.addAllBatch(diagnosticEventRequestKt$Dsl0.getBatch(), arrayList0);
        universalRequestKt$PayloadKt$Dsl0.setDiagnosticEventRequest(diagnosticEventRequestKt$Dsl0._build());
        universalRequestKt$Dsl0.setPayload(universalRequestKt$PayloadKt$Dsl0._build());
        return universalRequestKt$Dsl0._build();
    }
}

