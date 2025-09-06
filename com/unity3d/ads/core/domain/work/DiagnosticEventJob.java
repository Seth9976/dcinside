package com.unity3d.ads.core.domain.work;

import A3.a;
import android.content.Context;
import androidx.work.ListenableWorker.Result;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServicesRegistry;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import y4.l;
import y4.m;

@s0({"SMAP\nDiagnosticEventJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticEventJob.kt\ncom/unity3d/ads/core/domain/work/DiagnosticEventJob\n+ 2 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n*L\n1#1,29:1\n29#2,5:30\n29#2,5:35\n*S KotlinDebug\n*F\n+ 1 DiagnosticEventJob.kt\ncom/unity3d/ads/core/domain/work/DiagnosticEventJob\n*L\n16#1:30,5\n17#1:35,5\n*E\n"})
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {
    @l
    private final D diagnosticEventRequestWorkModifier$delegate;
    @l
    private final D getDiagnosticRequestPolicy$delegate;

    public DiagnosticEventJob(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "context");
        L.p(workerParameters0, "workerParams");
        super(context0, workerParameters0);
        com.unity3d.ads.core.domain.work.DiagnosticEventJob.special..inlined.inject.default.1 diagnosticEventJob$special$$inlined$inject$default$10 = new a("other_req") {
            final String $named;
            final IServiceComponent $this_inject;

            {
                this.$this_inject = iServiceComponent0;
                this.$named = s;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                IServicesRegistry iServicesRegistry0 = this.$this_inject.getServiceProvider().getRegistry();
                d d0 = m0.d(GetRequestPolicy.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        this.getDiagnosticRequestPolicy$delegate = E.c(H.c, diagnosticEventJob$special$$inlined$inject$default$10);
        com.unity3d.ads.core.domain.work.DiagnosticEventJob.special..inlined.inject.default.2 diagnosticEventJob$special$$inlined$inject$default$20 = new a("") {
            final String $named;
            final IServiceComponent $this_inject;

            {
                this.$this_inject = iServiceComponent0;
                this.$named = s;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                IServicesRegistry iServicesRegistry0 = this.$this_inject.getServiceProvider().getRegistry();
                d d0 = m0.d(DiagnosticEventRequestWorkModifier.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        this.diagnosticEventRequestWorkModifier$delegate = E.c(H.c, diagnosticEventJob$special$$inlined$inject$default$20);
    }

    @Override  // com.unity3d.ads.core.domain.work.UniversalRequestJob
    @m
    public Object doWork(@l kotlin.coroutines.d d0) {
        DiagnosticEventJob diagnosticEventJob1;
        DiagnosticEventJob diagnosticEventJob0;
        String s;
        com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork.1 diagnosticEventJob$doWork$10;
        if(d0 instanceof com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork.1) {
            diagnosticEventJob$doWork$10 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork.1)d0;
            int v = diagnosticEventJob$doWork$10.label;
            if((v & 0x80000000) == 0) {
                diagnosticEventJob$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.doWork(this);
                    }
                };
            }
            else {
                diagnosticEventJob$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            diagnosticEventJob$doWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.doWork(this);
                }
            };
        }
        Object object0 = diagnosticEventJob$doWork$10.result;
        Object object1 = b.l();
        switch(diagnosticEventJob$doWork$10.label) {
            case 0: {
                f0.n(object0);
                s = this.getWorkerParams().e().q("universalRequestId");
                if(s == null) {
                    Result listenableWorker$Result0 = Result.e();
                    L.o(listenableWorker$Result0, "success()");
                    return listenableWorker$Result0;
                }
                UniversalRequestDataSource universalRequestDataSource0 = this.getUniversalRequestDataSource();
                diagnosticEventJob$doWork$10.L$0 = this;
                diagnosticEventJob$doWork$10.L$1 = s;
                diagnosticEventJob$doWork$10.label = 1;
                object0 = universalRequestDataSource0.get(diagnosticEventJob$doWork$10);
                if(object0 == object1) {
                    return object1;
                }
                diagnosticEventJob0 = this;
                goto label_33;
            }
            case 1: {
                s = (String)diagnosticEventJob$doWork$10.L$1;
                diagnosticEventJob0 = (DiagnosticEventJob)diagnosticEventJob$doWork$10.L$0;
                f0.n(object0);
            label_33:
                UniversalRequest universalRequestOuterClass$UniversalRequest0 = UniversalRequest.parseFrom(((UniversalRequestStore)object0).getUniversalRequestMapOrThrow(s));
                DiagnosticEventRequestWorkModifier diagnosticEventRequestWorkModifier0 = diagnosticEventJob0.getDiagnosticEventRequestWorkModifier();
                L.o(universalRequestOuterClass$UniversalRequest0, "universalRequest");
                UniversalRequest universalRequestOuterClass$UniversalRequest1 = diagnosticEventRequestWorkModifier0.invoke(universalRequestOuterClass$UniversalRequest0);
                UniversalRequestDataSource universalRequestDataSource1 = diagnosticEventJob0.getUniversalRequestDataSource();
                ByteString byteString0 = universalRequestOuterClass$UniversalRequest1.toByteString();
                L.o(byteString0, "modifiedUniversalRequest.toByteString()");
                diagnosticEventJob$doWork$10.L$0 = diagnosticEventJob0;
                diagnosticEventJob$doWork$10.L$1 = null;
                diagnosticEventJob$doWork$10.label = 2;
                if(universalRequestDataSource1.set(s, byteString0, diagnosticEventJob$doWork$10) == object1) {
                    return object1;
                }
                diagnosticEventJob1 = diagnosticEventJob0;
                break;
            }
            case 2: {
                diagnosticEventJob1 = (DiagnosticEventJob)diagnosticEventJob$doWork$10.L$0;
                f0.n(object0);
                break;
            }
            case 3: {
                f0.n(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        diagnosticEventJob1.setRequestPolicy(diagnosticEventJob1.getGetDiagnosticRequestPolicy().invoke());
        diagnosticEventJob$doWork$10.L$0 = null;
        diagnosticEventJob$doWork$10.label = 3;
        object0 = diagnosticEventJob1.super.doWork(diagnosticEventJob$doWork$10);
        return object0 == object1 ? object1 : object0;
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier)this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy)this.getDiagnosticRequestPolicy$delegate.getValue();
    }
}

