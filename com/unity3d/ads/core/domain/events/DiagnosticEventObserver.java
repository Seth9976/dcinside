package com.unity3d.ads.core.domain.events;

import A3.o;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class DiagnosticEventObserver {
    @l
    private final BackgroundWorker backgroundWorker;
    @l
    private final K defaultDispatcher;
    @l
    private final DiagnosticEventRepository diagnosticEventRepository;
    @l
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    @l
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    @l
    private final E isRunning;
    @l
    private final UniversalRequestDataSource universalRequestDataSource;

    public DiagnosticEventObserver(@l GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0, @l GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest0, @l K k0, @l DiagnosticEventRepository diagnosticEventRepository0, @l UniversalRequestDataSource universalRequestDataSource0, @l BackgroundWorker backgroundWorker0) {
        L.p(getUniversalRequestForPayLoad0, "getUniversalRequestForPayLoad");
        L.p(getDiagnosticEventBatchRequest0, "getDiagnosticEventBatchRequest");
        L.p(k0, "defaultDispatcher");
        L.p(diagnosticEventRepository0, "diagnosticEventRepository");
        L.p(universalRequestDataSource0, "universalRequestDataSource");
        L.p(backgroundWorker0, "backgroundWorker");
        super();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad0;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest0;
        this.defaultDispatcher = k0;
        this.diagnosticEventRepository = diagnosticEventRepository0;
        this.universalRequestDataSource = universalRequestDataSource0;
        this.backgroundWorker = backgroundWorker0;
        this.isRunning = W.a(Boolean.FALSE);
    }

    @m
    public final Object invoke(@l d d0) {
        com.unity3d.ads.core.domain.events.DiagnosticEventObserver.invoke.2 diagnosticEventObserver$invoke$20 = new o(null) {
            int label;

            {
                DiagnosticEventObserver.this = diagnosticEventObserver0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.events.DiagnosticEventObserver.invoke.2(DiagnosticEventObserver.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.events.DiagnosticEventObserver.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                E e0 = DiagnosticEventObserver.this.isRunning;
                do {
                    Object object1 = e0.getValue();
                    Boolean boolean0 = (Boolean)object1;
                    boolean0.booleanValue();
                }
                while(!e0.compareAndSet(object1, b.a(true)));
                if(boolean0.booleanValue()) {
                    return S0.a;
                }
                k.U0(k.e1(DiagnosticEventObserver.this.diagnosticEventRepository.getDiagnosticEvents(), new o(null) {
                    Object L$0;
                    int label;

                    {
                        DiagnosticEventObserver.this = diagnosticEventObserver0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.unity3d.ads.core.domain.events.DiagnosticEventObserver.invoke.2.2(DiagnosticEventObserver.this, d0);
                        d1.L$0 = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((List)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l List list0, @m d d0) {
                        return ((com.unity3d.ads.core.domain.events.DiagnosticEventObserver.invoke.2.2)this.create(list0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        String s;
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                List list0 = (List)this.L$0;
                                Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
                                L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
                                Dsl universalRequestKt$PayloadKt$Dsl0 = Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
                                universalRequestKt$PayloadKt$Dsl0.setDiagnosticEventRequest(DiagnosticEventObserver.this.getDiagnosticEventBatchRequest.invoke(list0));
                                Payload universalRequestOuterClass$UniversalRequest$Payload0 = universalRequestKt$PayloadKt$Dsl0._build();
                                this.label = 1;
                                object0 = DiagnosticEventObserver.this.getUniversalRequestForPayLoad.invoke(universalRequestOuterClass$UniversalRequest$Payload0, this);
                                if(object0 == object1) {
                                    return object1;
                                }
                                goto label_15;
                            }
                            case 1: {
                                f0.n(object0);
                            label_15:
                                L.o("25cf1957-c3c8-44f7-a1f1-18655a9a614c", "randomUUID().toString()");
                                byte[] arr_b = ((UniversalRequest)object0).toByteArray();
                                L.o(arr_b, "fullRequest.toByteArray()");
                                ByteString byteString0 = ByteStringsKt.toByteString(arr_b);
                                this.L$0 = "25cf1957-c3c8-44f7-a1f1-18655a9a614c";
                                this.label = 2;
                                if(DiagnosticEventObserver.this.universalRequestDataSource.set("25cf1957-c3c8-44f7-a1f1-18655a9a614c", byteString0, this) == object1) {
                                    return object1;
                                }
                                s = "25cf1957-c3c8-44f7-a1f1-18655a9a614c";
                                break;
                            }
                            case 2: {
                                s = (String)this.L$0;
                                f0.n(object0);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        UniversalRequestWorkerData universalRequestWorkerData0 = new UniversalRequestWorkerData(s);
                        Constraints constraints0 = new androidx.work.Constraints.Builder().d(NetworkType.b).b();
                        L.o(constraints0, "Builder()\n            .s…TED)\n            .build()");
                        WorkRequest workRequest0 = ((androidx.work.OneTimeWorkRequest.Builder)((androidx.work.OneTimeWorkRequest.Builder)((androidx.work.OneTimeWorkRequest.Builder)new androidx.work.OneTimeWorkRequest.Builder(DiagnosticEventJob.class).o(constraints0)).w(universalRequestWorkerData0.invoke())).a("UnityAdsBackgroundWorker")).b();
                        L.o(workRequest0, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                        DiagnosticEventObserver.this.backgroundWorker.getWorkManager().j(((OneTimeWorkRequest)workRequest0));
                        return S0.a;
                    }
                }), P.a(DiagnosticEventObserver.this.defaultDispatcher));
                return S0.a;
            }
        };
        Object object0 = i.h(this.defaultDispatcher, diagnosticEventObserver$invoke$20, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }
}

