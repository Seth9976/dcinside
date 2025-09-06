package com.unity3d.ads.core.domain.om;

import android.content.Context;
import com.unity3d.ads.core.data.model.OMResult.Failure;
import com.unity3d.ads.core.data.model.OMResult.Success;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.time.s.b.a;
import y4.l;
import y4.m;

public final class AndroidInitializeOMSDK implements InitializeOMSDK {
    @l
    private final Context context;
    @l
    private final OpenMeasurementRepository omRepository;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;

    public AndroidInitializeOMSDK(@l Context context0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l SessionRepository sessionRepository0, @l OpenMeasurementRepository openMeasurementRepository0) {
        L.p(context0, "context");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(sessionRepository0, "sessionRepository");
        L.p(openMeasurementRepository0, "omRepository");
        super();
        this.context = context0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.sessionRepository = sessionRepository0;
        this.omRepository = openMeasurementRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.om.InitializeOMSDK
    @m
    public Object invoke(@l d d0) {
        long v1;
        AndroidInitializeOMSDK androidInitializeOMSDK0;
        com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.invoke.1 androidInitializeOMSDK$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.invoke.1) {
            androidInitializeOMSDK$invoke$10 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.invoke.1)d0;
            int v = androidInitializeOMSDK$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidInitializeOMSDK$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    long J$0;
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(this);
                    }
                };
            }
            else {
                androidInitializeOMSDK$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidInitializeOMSDK$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                long J$0;
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(this);
                }
            };
        }
        Object object0 = androidInitializeOMSDK$invoke$10.result;
        Object object1 = b.l();
        switch(androidInitializeOMSDK$invoke$10.label) {
            case 0: {
                f0.n(object0);
                if(this.sessionRepository.isOmEnabled()) {
                    DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_started", null, null, null, null, 30, null);
                    androidInitializeOMSDK$invoke$10.L$0 = this;
                    androidInitializeOMSDK$invoke$10.J$0 = 18952273500L;
                    androidInitializeOMSDK$invoke$10.label = 1;
                    object0 = this.omRepository.activateOM(this.context, androidInitializeOMSDK$invoke$10);
                    if(object0 == object1) {
                        return object1;
                    }
                    androidInitializeOMSDK0 = this;
                    v1 = 18952273500L;
                    goto label_28;
                }
                break;
            }
            case 1: {
                v1 = androidInitializeOMSDK$invoke$10.J$0;
                androidInitializeOMSDK0 = (AndroidInitializeOMSDK)androidInitializeOMSDK$invoke$10.L$0;
                f0.n(object0);
            label_28:
                if(((OMResult)object0) instanceof Success) {
                    Double double0 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v1)));
                    DefaultImpls.invoke$default(androidInitializeOMSDK0.sendDiagnosticEvent, "om_activate_success_time", double0, null, null, null, 28, null);
                    return S0.a;
                }
                if(((OMResult)object0) instanceof Failure) {
                    SendDiagnosticEvent sendDiagnosticEvent0 = androidInitializeOMSDK0.sendDiagnosticEvent;
                    Double double1 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v1)));
                    Map map0 = Y.g();
                    map0.put("reason", ((Failure)(((OMResult)object0))).getReason());
                    if(((Failure)(((OMResult)object0))).getReasonDebug() != null) {
                        map0.put("reason_debug", ((Failure)(((OMResult)object0))).getReasonDebug());
                    }
                    DefaultImpls.invoke$default(sendDiagnosticEvent0, "om_activate_failure_time", double1, Y.d(map0), null, null, 24, null);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return S0.a;
    }
}

