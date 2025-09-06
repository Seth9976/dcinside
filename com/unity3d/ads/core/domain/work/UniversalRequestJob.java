package com.unity3d.ads.core.domain.work;

import A3.a;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent.DefaultImpls;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import y4.l;
import y4.m;

@s0({"SMAP\nUniversalRequestJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalRequestJob.kt\ncom/unity3d/ads/core/domain/work/UniversalRequestJob\n+ 2 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n*L\n1#1,37:1\n29#2,5:38\n29#2,5:43\n*S KotlinDebug\n*F\n+ 1 UniversalRequestJob.kt\ncom/unity3d/ads/core/domain/work/UniversalRequestJob\n*L\n19#1:38,5\n20#1:43,5\n*E\n"})
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {
    public RequestPolicy requestPolicy;
    @l
    private final D universalRequestDataSource$delegate;
    @l
    private final D universalRequestEventSender$delegate;
    @l
    private final WorkerParameters workerParams;

    public UniversalRequestJob(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "context");
        L.p(workerParameters0, "workerParams");
        super(context0, workerParameters0);
        this.workerParams = workerParameters0;
        com.unity3d.ads.core.domain.work.UniversalRequestJob.special..inlined.inject.default.1 universalRequestJob$special$$inlined$inject$default$10 = new a("") {
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
                d d0 = m0.d(UniversalRequestEventSender.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        this.universalRequestEventSender$delegate = E.c(H.c, universalRequestJob$special$$inlined$inject$default$10);
        com.unity3d.ads.core.domain.work.UniversalRequestJob.special..inlined.inject.default.2 universalRequestJob$special$$inlined$inject$default$20 = new a("") {
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
                d d0 = m0.d(UniversalRequestDataSource.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        this.universalRequestDataSource$delegate = E.c(H.c, universalRequestJob$special$$inlined$inject$default$20);
    }

    @Override  // androidx.work.CoroutineWorker
    @m
    public Object doWork(@l kotlin.coroutines.d d0) {
        return UniversalRequestJob.doWork$suspendImpl(this, d0);
    }

    static Object doWork$suspendImpl(UniversalRequestJob universalRequestJob0, kotlin.coroutines.d d0) {
        Result listenableWorker$Result1;
        S0 s00;
        String s1;
        UniversalRequestJob universalRequestJob1;
        com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork.1 universalRequestJob$doWork$10;
        if(d0 instanceof com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork.1) {
            universalRequestJob$doWork$10 = (com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork.1)d0;
            int v = universalRequestJob$doWork$10.label;
            if((v & 0x80000000) == 0) {
                universalRequestJob$doWork$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return UniversalRequestJob.doWork$suspendImpl(universalRequestJob0, this);
                    }
                };
            }
            else {
                universalRequestJob$doWork$10.label = v ^ 0x80000000;
            }
        }
        else {
            universalRequestJob$doWork$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return UniversalRequestJob.doWork$suspendImpl(universalRequestJob0, this);
                }
            };
        }
        Object object0 = universalRequestJob$doWork$10.result;
        Object object1 = b.l();
        switch(universalRequestJob$doWork$10.label) {
            case 0: {
                f0.n(object0);
                String s = universalRequestJob0.workerParams.e().q("universalRequestId");
                if(s == null) {
                    Result listenableWorker$Result0 = Result.e();
                    L.o(listenableWorker$Result0, "success()");
                    return listenableWorker$Result0;
                }
                UniversalRequestDataSource universalRequestDataSource0 = universalRequestJob0.getUniversalRequestDataSource();
                universalRequestJob$doWork$10.L$0 = universalRequestJob0;
                universalRequestJob$doWork$10.L$1 = s;
                universalRequestJob$doWork$10.label = 1;
                Object object2 = universalRequestDataSource0.get(universalRequestJob$doWork$10);
                if(object2 == object1) {
                    return object1;
                }
                universalRequestJob1 = universalRequestJob0;
                s1 = s;
                object0 = object2;
                goto label_33;
            }
            case 1: {
                s1 = (String)universalRequestJob$doWork$10.L$1;
                universalRequestJob1 = (UniversalRequestJob)universalRequestJob$doWork$10.L$0;
                f0.n(object0);
            label_33:
                UniversalRequest universalRequestOuterClass$UniversalRequest0 = UniversalRequest.parseFrom(((UniversalRequestStore)object0).getUniversalRequestMapOrThrow(s1));
                try {
                    UniversalRequestEventSender universalRequestEventSender0 = universalRequestJob1.getUniversalRequestEventSender();
                    L.o(universalRequestOuterClass$UniversalRequest0, "universalRequest");
                    RequestPolicy requestPolicy0 = universalRequestJob1.getRequestPolicy();
                    universalRequestJob$doWork$10.L$0 = universalRequestJob1;
                    universalRequestJob$doWork$10.L$1 = s1;
                    universalRequestJob$doWork$10.label = 2;
                    if(universalRequestEventSender0.invoke(universalRequestOuterClass$UniversalRequest0, requestPolicy0, universalRequestJob$doWork$10) == object1) {
                        return object1;
                    }
                    goto label_45;
                }
                catch(Throwable throwable0) {
                    goto label_48;
                }
            }
            case 2: {
                s1 = (String)universalRequestJob$doWork$10.L$1;
                universalRequestJob1 = (UniversalRequestJob)universalRequestJob$doWork$10.L$0;
                try {
                    f0.n(object0);
                label_45:
                    s00 = S0.a;
                }
                catch(Throwable throwable0) {
                label_48:
                    s00 = e0.b(f0.a(throwable0));
                }
                if(!e0.j(s00)) {
                    listenableWorker$Result1 = Result.d();
                    L.o(listenableWorker$Result1, "{\n            Result.retry()\n        }");
                    return listenableWorker$Result1;
                }
                UniversalRequestDataSource universalRequestDataSource1 = universalRequestJob1.getUniversalRequestDataSource();
                universalRequestJob$doWork$10.L$0 = null;
                universalRequestJob$doWork$10.L$1 = null;
                universalRequestJob$doWork$10.label = 3;
                if(universalRequestDataSource1.remove(s1, universalRequestJob$doWork$10) == object1) {
                    return object1;
                }
                listenableWorker$Result1 = Result.e();
                L.o(listenableWorker$Result1, "{\n            universalR…esult.success()\n        }");
                return listenableWorker$Result1;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f0.n(object0);
        listenableWorker$Result1 = Result.e();
        L.o(listenableWorker$Result1, "{\n            universalR…esult.success()\n        }");
        return listenableWorker$Result1;
    }

    @l
    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy0 = this.requestPolicy;
        if(requestPolicy0 != null) {
            return requestPolicy0;
        }
        L.S("requestPolicy");
        return null;
    }

    @Override  // com.unity3d.services.core.di.IServiceComponent
    @l
    public IServiceProvider getServiceProvider() {
        return DefaultImpls.getServiceProvider(this);
    }

    @l
    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource)this.universalRequestDataSource$delegate.getValue();
    }

    @l
    public final UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender)this.universalRequestEventSender$delegate.getValue();
    }

    @l
    protected final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(@l RequestPolicy requestPolicy0) {
        L.p(requestPolicy0, "<set-?>");
        this.requestPolicy = requestPolicy0;
    }
}

