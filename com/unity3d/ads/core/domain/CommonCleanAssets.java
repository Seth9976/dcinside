package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.r0;
import kotlin.time.s.b.a;
import y4.l;
import y4.m;

public final class CommonCleanAssets implements CleanAssets {
    @l
    private final CacheRepository cacheRepository;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCleanAssets(@l CacheRepository cacheRepository0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(cacheRepository0, "cacheRepository");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.cacheRepository = cacheRepository0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @Override  // com.unity3d.ads.core.domain.CleanAssets
    @m
    public Object invoke(@l d d0) {
        long v4;
        long v3;
        CommonCleanAssets commonCleanAssets1;
        long v1;
        CommonCleanAssets commonCleanAssets0;
        com.unity3d.ads.core.domain.CommonCleanAssets.invoke.1 commonCleanAssets$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.CommonCleanAssets.invoke.1) {
            commonCleanAssets$invoke$10 = (com.unity3d.ads.core.domain.CommonCleanAssets.invoke.1)d0;
            int v = commonCleanAssets$invoke$10.label;
            if((v & 0x80000000) == 0) {
                commonCleanAssets$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    long J$0;
                    long J$1;
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
                commonCleanAssets$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            commonCleanAssets$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                long J$0;
                long J$1;
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
        Object object0 = commonCleanAssets$invoke$10.result;
        Object object1 = b.l();
        switch(commonCleanAssets$invoke$10.label) {
            case 0: {
                f0.n(object0);
                commonCleanAssets$invoke$10.L$0 = this;
                commonCleanAssets$invoke$10.J$0 = 7154176800L;
                commonCleanAssets$invoke$10.label = 1;
                object0 = this.cacheRepository.getCacheSize(commonCleanAssets$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                commonCleanAssets0 = this;
                v1 = 7154176800L;
                goto label_26;
            }
            case 1: {
                v1 = commonCleanAssets$invoke$10.J$0;
                commonCleanAssets0 = (CommonCleanAssets)commonCleanAssets$invoke$10.L$0;
                f0.n(object0);
            label_26:
                long v2 = ((Number)object0).longValue();
                commonCleanAssets$invoke$10.L$0 = commonCleanAssets0;
                commonCleanAssets$invoke$10.J$0 = v1;
                commonCleanAssets$invoke$10.J$1 = v2;
                commonCleanAssets$invoke$10.label = 2;
                if(commonCleanAssets0.cacheRepository.clearCache(commonCleanAssets$invoke$10) == object1) {
                    return object1;
                }
                commonCleanAssets1 = commonCleanAssets0;
                v3 = v1;
                v4 = v2;
                break;
            }
            case 2: {
                v4 = commonCleanAssets$invoke$10.J$1;
                v3 = commonCleanAssets$invoke$10.J$0;
                commonCleanAssets1 = (CommonCleanAssets)commonCleanAssets$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Double double0 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v3)));
        Map map0 = Y.k(r0.a("size_kb", kotlin.coroutines.jvm.internal.b.f(((int)(v4 / 0x400L)))));
        DefaultImpls.invoke$default(commonCleanAssets1.sendDiagnosticEvent, "native_clean_assets_task_success_time", double0, null, map0, null, 20, null);
        return S0.a;
    }
}

