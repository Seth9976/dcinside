package com.unity3d.ads.core.domain;

import A3.o;
import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import java.io.File;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.io.m;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.time.e;
import kotlin.time.s.b.a;
import kotlinx.coroutines.O;
import kotlinx.coroutines.j;
import kotlinx.coroutines.p;
import kotlinx.coroutines.u1;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;
import y4.l;

@s0({"SMAP\nAndroidHttpClientProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHttpClientProvider.kt\ncom/unity3d/ads/core/domain/AndroidHttpClientProvider\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,107:1\n314#2,11:108\n*S KotlinDebug\n*F\n+ 1 AndroidHttpClientProvider.kt\ncom/unity3d/ads/core/domain/AndroidHttpClientProvider\n*L\n69#1:108,11\n*E\n"})
public final class AndroidHttpClientProvider implements HttpClientProvider {
    @l
    private final AlternativeFlowReader alternativeFlowReader;
    @l
    private final CleanupDirectory cleanupDirectory;
    @l
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    @l
    private final Context context;
    @l
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    @l
    private final ISDKDispatchers dispatchers;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;

    public AndroidHttpClientProvider(@l ConfigFileFromLocalStorage configFileFromLocalStorage0, @l AlternativeFlowReader alternativeFlowReader0, @l ISDKDispatchers iSDKDispatchers0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l Context context0, @l CronetEngineBuilderFactory cronetEngineBuilderFactory0, @l SessionRepository sessionRepository0, @l CleanupDirectory cleanupDirectory0) {
        L.p(configFileFromLocalStorage0, "configFileFromLocalStorage");
        L.p(alternativeFlowReader0, "alternativeFlowReader");
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(context0, "context");
        L.p(cronetEngineBuilderFactory0, "cronetEngineBuilderFactory");
        L.p(sessionRepository0, "sessionRepository");
        L.p(cleanupDirectory0, "cleanupDirectory");
        super();
        this.configFileFromLocalStorage = configFileFromLocalStorage0;
        this.alternativeFlowReader = alternativeFlowReader0;
        this.dispatchers = iSDKDispatchers0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.context = context0;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory0;
        this.sessionRepository = sessionRepository0;
        this.cleanupDirectory = cleanupDirectory0;
    }

    private final String buildCronetCachePath(Context context0) {
        File file0 = context0.getFilesDir();
        L.o(file0, "context.filesDir");
        File file1 = m.l0(file0, "UnityAdsHttpCache");
        if(!file1.exists()) {
            file1.mkdirs();
        }
        String s = file1.getAbsolutePath();
        L.o(s, "cacheDir.absolutePath");
        return s;
    }

    private final Object buildNetworkClient(Context context0, ISDKDispatchers iSDKDispatchers0, d d0) {
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        CronetProviderInstaller.installProvider(context0).addOnCompleteListener(new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@l Task task0) {
                L.p(task0, "it");
                if(task0.isSuccessful()) {
                    long v = context0.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration() ? ((long)context0.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration().getMaxCachedAssetSizeMb()) * 0x100000L : 0x1400000L;
                    try {
                        CronetEngine cronetEngine0 = context0.cronetEngineBuilderFactory.createCronetEngineBuilder(p0).setStoragePath(context0.buildCronetCachePath(p0)).enableHttpCache(3, v).enableQuic(true).addQuicHint("gateway.unityads.unity3d.com", 443, 443).addQuicHint("cdn-creatives-cf-prd.acquire.unity3dusercontent.com", 443, 443).build();
                        L.o(cronetEngine0, "cronetEngine");
                        CronetClient cronetClient0 = new CronetClient(cronetEngine0, this.$dispatchers);
                        iSDKDispatchers0.resumeWith(cronetClient0);
                    }
                    catch(Throwable unused_ex) {
                        OkHttpClient okHttpClient0 = new OkHttpClient();
                        OkHttp3Client okHttp3Client0 = new OkHttp3Client(this.$dispatchers, okHttpClient0, p0, context0.sessionRepository, context0.cleanupDirectory, context0.alternativeFlowReader);
                        iSDKDispatchers0.resumeWith(okHttp3Client0);
                    }
                    return;
                }
                OkHttpClient okHttpClient1 = new OkHttpClient();
                OkHttp3Client okHttp3Client1 = new OkHttp3Client(this.$dispatchers, okHttpClient1, p0, context0.sessionRepository, context0.cleanupDirectory, context0.alternativeFlowReader);
                iSDKDispatchers0.resumeWith(okHttp3Client1);
            }
        });
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @Override  // com.unity3d.ads.core.domain.HttpClientProvider
    @y4.m
    public Object invoke(@l d d0) {
        long v1;
        AndroidHttpClientProvider androidHttpClientProvider0;
        com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke.1 androidHttpClientProvider$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke.1) {
            androidHttpClientProvider$invoke$10 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke.1)d0;
            int v = androidHttpClientProvider$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidHttpClientProvider$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    long J$0;
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(this);
                    }
                };
            }
            else {
                androidHttpClientProvider$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidHttpClientProvider$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                long J$0;
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @y4.m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(this);
                }
            };
        }
        Object object0 = androidHttpClientProvider$invoke$10.result;
        Object object1 = b.l();
        switch(androidHttpClientProvider$invoke$10.label) {
            case 0: {
                f0.n(object0);
                if(this.alternativeFlowReader.invoke()) {
                    com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke.client.1 androidHttpClientProvider$invoke$client$10 = new o(null) {
                        int label;

                        {
                            AndroidHttpClientProvider.this = androidHttpClientProvider0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@y4.m Object object0, @l d d0) {
                            return new com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke.client.1(AndroidHttpClientProvider.this, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @y4.m
                        public final Object invoke(@l O o0, @y4.m d d0) {
                            return ((com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke.client.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @y4.m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.label) {
                                case 0: {
                                    f0.n(object0);
                                    this.label = 1;
                                    object0 = AndroidHttpClientProvider.this.buildNetworkClient(AndroidHttpClientProvider.this.context, AndroidHttpClientProvider.this.dispatchers, this);
                                    return object0 == object1 ? object1 : object0;
                                }
                                case 1: {
                                    f0.n(object0);
                                    return object0;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                        }
                    };
                    androidHttpClientProvider$invoke$10.L$0 = this;
                    androidHttpClientProvider$invoke$10.J$0 = 3484200L;
                    androidHttpClientProvider$invoke$10.label = 1;
                    object0 = u1.e(500L, androidHttpClientProvider$invoke$client$10, androidHttpClientProvider$invoke$10);
                    if(object0 == object1) {
                        return object1;
                    }
                    androidHttpClientProvider0 = this;
                    v1 = 3484200L;
                    break;
                }
                Configuration configuration0 = (Configuration)j.b(null, new o(null) {
                    private Object L$0;
                    int label;

                    {
                        AndroidHttpClientProvider.this = androidHttpClientProvider0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@y4.m Object object0, @l d d0) {
                        d d1 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke.config.1(AndroidHttpClientProvider.this, d0);
                        d1.L$0 = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m d d0) {
                        return ((com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke.config.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object3;
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                O o0 = (O)this.L$0;
                                try {
                                    Params configFileFromLocalStorage$Params0 = new Params(null, 1, null);
                                    this.label = 1;
                                    Object object2 = AndroidHttpClientProvider.this.configFileFromLocalStorage.invoke-gIAlu-s(configFileFromLocalStorage$Params0, this);
                                    if(object2 == object1) {
                                        return object1;
                                    label_10:
                                        f0.n(object0);
                                        object2 = ((e0)object0).l();
                                    }
                                    object3 = e0.b(e0.a(object2));
                                    goto label_16;
                                }
                                catch(Throwable throwable0) {
                                }
                                break;
                            }
                            case 1: {
                                goto label_10;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        object3 = e0.b(f0.a(throwable0));
                    label_16:
                        if(e0.i(object3)) {
                            object3 = null;
                        }
                        if(((e0)object3) != null) {
                            Object object4 = ((e0)object3).l();
                            if(!e0.i(object4)) {
                                return object4;
                            }
                        }
                        return null;
                    }
                }, 1, null);
                if(configuration0 != null) {
                    IExperiments iExperiments0 = configuration0.getExperiments();
                    if(iExperiments0 != null && iExperiments0.isOkHttpEnabled()) {
                        OkHttpClient okHttpClient0 = new OkHttpClient();
                        return new OkHttp3Client(this.dispatchers, okHttpClient0, this.context, this.sessionRepository, this.cleanupDirectory, this.alternativeFlowReader);
                    }
                }
                return new LegacyHttpClient(this.dispatchers);
            }
            case 1: {
                v1 = androidHttpClientProvider$invoke$10.J$0;
                androidHttpClientProvider0 = (AndroidHttpClientProvider)androidHttpClientProvider$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Double double0 = kotlin.coroutines.jvm.internal.b.d(e.o0(a.h(v1), kotlin.time.h.d));
        DefaultImpls.invoke$default(androidHttpClientProvider0.sendDiagnosticEvent, (((HttpClient)object0) instanceof CronetClient ? "native_cronet_success_time" : "native_cronet_failure_time"), double0, null, null, null, 28, null);
        if(((HttpClient)object0) == null) {
            OkHttpClient okHttpClient1 = new OkHttpClient();
            return new OkHttp3Client(androidHttpClientProvider0.dispatchers, okHttpClient1, androidHttpClientProvider0.context, androidHttpClientProvider0.sessionRepository, androidHttpClientProvider0.cleanupDirectory, androidHttpClientProvider0.alternativeFlowReader);
        }
        return (HttpClient)object0;
    }
}

