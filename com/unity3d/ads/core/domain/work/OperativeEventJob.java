package com.unity3d.ads.core.domain.work;

import A3.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServicesRegistry;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import y4.l;
import y4.m;

@s0({"SMAP\nOperativeEventJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperativeEventJob.kt\ncom/unity3d/ads/core/domain/work/OperativeEventJob\n+ 2 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n*L\n1#1,21:1\n29#2,5:22\n*S KotlinDebug\n*F\n+ 1 OperativeEventJob.kt\ncom/unity3d/ads/core/domain/work/OperativeEventJob\n*L\n15#1:22,5\n*E\n"})
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {
    @l
    private final D getOperativeRequestPolicy$delegate;

    public OperativeEventJob(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "context");
        L.p(workerParameters0, "workerParams");
        super(context0, workerParameters0);
        com.unity3d.ads.core.domain.work.OperativeEventJob.special..inlined.inject.default.1 operativeEventJob$special$$inlined$inject$default$10 = new a("op_event_req") {
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
        this.getOperativeRequestPolicy$delegate = E.c(H.c, operativeEventJob$special$$inlined$inject$default$10);
    }

    @Override  // com.unity3d.ads.core.domain.work.UniversalRequestJob
    @m
    public Object doWork(@l kotlin.coroutines.d d0) {
        this.setRequestPolicy(this.getGetOperativeRequestPolicy().invoke());
        return super.doWork(d0);
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy)this.getOperativeRequestPolicy$delegate.getValue();
    }
}

