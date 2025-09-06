package com.unity3d.ads.core.domain.scar;

import A3.o;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.time.s.b.a;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    @l
    private final HandleGetTokenRequest handleGetTokenRequest;
    @l
    private final ScarManager scarManager;
    @l
    private final O scope;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;

    public AndroidFetchSignalsAndSendUseCase(@l O o0, @l SessionRepository sessionRepository0, @l ScarManager scarManager0, @l HandleGetTokenRequest handleGetTokenRequest0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(o0, "scope");
        L.p(sessionRepository0, "sessionRepository");
        L.p(scarManager0, "scarManager");
        L.p(handleGetTokenRequest0, "handleGetTokenRequest");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.scope = o0;
        this.sessionRepository = sessionRepository0;
        this.scarManager = scarManager0;
        this.handleGetTokenRequest = handleGetTokenRequest0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    private final Map getTags() {
        Map map0 = new LinkedHashMap();
        List list0 = this.sessionRepository.getScarEligibleFormats();
        if(list0.contains(AdFormat.AD_FORMAT_BANNER)) {
            map0.put("banner", "true");
        }
        if(list0.contains(AdFormat.AD_FORMAT_REWARDED)) {
            map0.put("rewarded", "true");
        }
        if(list0.contains(AdFormat.AD_FORMAT_INTERSTITIAL)) {
            map0.put("interstitial", "true");
        }
        return map0;
    }

    @Override  // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    @m
    public Object invoke(@l ByteString byteString0, @l d d0) {
        com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase.invoke.2 androidFetchSignalsAndSendUseCase$invoke$20 = new o(byteString0, null) {
            final ByteString $tokenId;
            long J$0;
            private Object L$0;
            int label;

            {
                AndroidFetchSignalsAndSendUseCase.this = androidFetchSignalsAndSendUseCase0;
                this.$tokenId = byteString0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase.invoke.2(AndroidFetchSignalsAndSendUseCase.this, this.$tokenId, d0);
                d1.L$0 = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                long v1;
                Object object2;
                long v;
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.L$0;
                        DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_collection_started", null, null, null, null, 30, null);
                        try {
                            List list0 = AndroidFetchSignalsAndSendUseCase.this.sessionRepository.getScarEligibleFormats();
                            this.J$0 = 3678700L;
                            this.label = 1;
                            object0 = AndroidFetchSignalsAndSendUseCase.this.scarManager.getSignals(list0, this);
                        }
                        catch(Throwable throwable0) {
                            v = 3678700L;
                            object2 = e0.b(f0.a(throwable0));
                            goto label_25;
                        }
                        if(object0 == object1) {
                            return object1;
                        }
                        v = 3678700L;
                        goto label_21;
                    }
                    case 1: {
                        try {
                            v = this.J$0;
                            f0.n(object0);
                        label_21:
                            object2 = e0.b(((BiddingSignals)object0));
                        }
                        catch(Throwable throwable0) {
                            object2 = e0.b(f0.a(throwable0));
                        }
                    label_25:
                        if(e0.i(object2)) {
                            object2 = null;
                        }
                        DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, (((BiddingSignals)object2) == null ? "native_scar_signals_collection_failure_time" : "native_scar_signals_collection_success_time"), kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v))), AndroidFetchSignalsAndSendUseCase.this.getTags(), null, null, 24, null);
                        if(((BiddingSignals)object2) == null) {
                            return S0.a;
                        }
                        DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_upload_started", null, null, null, null, 30, null);
                        this.J$0 = 4336400L;
                        this.label = 2;
                        object0 = AndroidFetchSignalsAndSendUseCase.this.handleGetTokenRequest.invoke(this.$tokenId, ((BiddingSignals)object2), this);
                        if(object0 == object1) {
                            return object1;
                        }
                        v1 = 4336400L;
                        break;
                    }
                    case 2: {
                        v1 = this.J$0;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                String s = ((UniversalResponse)object0).hasError() ? "native_scar_signals_upload_failure_time" : "native_scar_signals_upload_success_time";
                DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, s, kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v1))), AndroidFetchSignalsAndSendUseCase.this.getTags(), null, null, 24, null);
                return S0.a;
            }
        };
        k.f(this.scope, null, null, androidFetchSignalsAndSendUseCase$invoke$20, 3, null);
        return S0.a;
    }
}

