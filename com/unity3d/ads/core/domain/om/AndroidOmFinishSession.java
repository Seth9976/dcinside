package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OMResult.Failure;
import com.unity3d.ads.core.data.model.OMResult.Success;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidOmFinishSession implements OmFinishSession {
    @l
    private final OpenMeasurementRepository openMeasurementRepository;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmFinishSession(@l OpenMeasurementRepository openMeasurementRepository0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(openMeasurementRepository0, "openMeasurementRepository");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.openMeasurementRepository = openMeasurementRepository0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @Override  // com.unity3d.ads.core.domain.om.OmFinishSession
    @m
    public Object invoke(@l AdObject adObject0, @l d d0) {
        AndroidOmFinishSession androidOmFinishSession0;
        com.unity3d.ads.core.domain.om.AndroidOmFinishSession.invoke.1 androidOmFinishSession$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.om.AndroidOmFinishSession.invoke.1) {
            androidOmFinishSession$invoke$10 = (com.unity3d.ads.core.domain.om.AndroidOmFinishSession.invoke.1)d0;
            int v = androidOmFinishSession$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidOmFinishSession$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, this);
                    }
                };
            }
            else {
                androidOmFinishSession$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidOmFinishSession$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, this);
                }
            };
        }
        Object object0 = androidOmFinishSession$invoke$10.result;
        Object object1 = b.l();
        switch(androidOmFinishSession$invoke$10.label) {
            case 0: {
                f0.n(object0);
                androidOmFinishSession$invoke$10.L$0 = this;
                androidOmFinishSession$invoke$10.L$1 = adObject0;
                androidOmFinishSession$invoke$10.label = 1;
                object0 = this.openMeasurementRepository.finishSession(adObject0.getOpportunityId(), androidOmFinishSession$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                androidOmFinishSession0 = this;
                break;
            }
            case 1: {
                adObject0 = (AdObject)androidOmFinishSession$invoke$10.L$1;
                androidOmFinishSession0 = (AndroidOmFinishSession)androidOmFinishSession$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((OMResult)object0) instanceof Success) {
            DefaultImpls.invoke$default(androidOmFinishSession0.sendDiagnosticEvent, "om_session_finish_success", null, null, null, adObject0, 14, null);
            return S0.a;
        }
        if(((OMResult)object0) instanceof Failure) {
            SendDiagnosticEvent sendDiagnosticEvent0 = androidOmFinishSession0.sendDiagnosticEvent;
            Map map0 = Y.g();
            map0.put("reason", ((Failure)(((OMResult)object0))).getReason());
            if(((Failure)(((OMResult)object0))).getReasonDebug() != null) {
                map0.put("reason_debug", ((Failure)(((OMResult)object0))).getReasonDebug());
            }
            DefaultImpls.invoke$default(sendDiagnosticEvent0, "om_session_finish_failure", null, Y.d(map0), null, adObject0, 10, null);
        }
        return S0.a;
    }
}

