package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import y4.l;
import y4.m;

public interface BaseTask extends IServiceComponent {
    public static final class DefaultImpls {
        @l
        public static IServiceProvider getServiceProvider(@l BaseTask baseTask0) {
            return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(baseTask0);
        }

        @m
        public static Object invoke-gIAlu-s(@l BaseTask baseTask0, @l BaseParams baseParams0, @l d d0) {
            BaseTask.invoke.1 baseTask$invoke$10;
            if(d0 instanceof BaseTask.invoke.1) {
                baseTask$invoke$10 = (BaseTask.invoke.1)d0;
                int v = baseTask$invoke$10.label;
                if((v & 0x80000000) == 0) {
                    baseTask$invoke$10 = new BaseTask.invoke.1(d0);
                }
                else {
                    baseTask$invoke$10.label = v ^ 0x80000000;
                }
            }
            else {
                baseTask$invoke$10 = new BaseTask.invoke.1(d0);
            }
            Object object0 = baseTask$invoke$10.result;
            Object object1 = b.l();
            switch(baseTask$invoke$10.label) {
                case 0: {
                    f0.n(object0);
                    baseTask$invoke$10.label = 1;
                    Object object2 = baseTask0.doWork-gIAlu-s(baseParams0, baseTask$invoke$10);
                    return object2 == object1 ? object1 : object2;
                }
                case 1: {
                    f0.n(object0);
                    return ((e0)object0).l();
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
    }

    @m
    Object doWork-gIAlu-s(@l BaseParams arg1, @l d arg2);

    @m
    Object invoke-gIAlu-s(@l BaseParams arg1, @l d arg2);
}

