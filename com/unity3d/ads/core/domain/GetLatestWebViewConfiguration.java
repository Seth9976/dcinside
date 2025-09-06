package com.unity3d.ads.core.domain;

import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder;
import com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class GetLatestWebViewConfiguration {
    @l
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    public GetLatestWebViewConfiguration(@l WebviewConfigurationDataSource webviewConfigurationDataSource0) {
        L.p(webviewConfigurationDataSource0, "webviewConfigurationDataSource");
        super();
        this.webviewConfigurationDataSource = webviewConfigurationDataSource0;
    }

    @m
    public final Object invoke(@m String s, @m Integer integer0, @m List list0, @l d d0) {
        GetLatestWebViewConfiguration getLatestWebViewConfiguration0;
        com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.invoke.1 getLatestWebViewConfiguration$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.invoke.1) {
            getLatestWebViewConfiguration$invoke$10 = (com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.invoke.1)d0;
            int v = getLatestWebViewConfiguration$invoke$10.label;
            if((v & 0x80000000) == 0) {
                getLatestWebViewConfiguration$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, null, null, this);
                    }
                };
            }
            else {
                getLatestWebViewConfiguration$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            getLatestWebViewConfiguration$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, null, null, this);
                }
            };
        }
        Object object0 = getLatestWebViewConfiguration$invoke$10.result;
        Object object1 = b.l();
        switch(getLatestWebViewConfiguration$invoke$10.label) {
            case 0: {
                f0.n(object0);
                getLatestWebViewConfiguration$invoke$10.L$0 = this;
                getLatestWebViewConfiguration$invoke$10.L$1 = s;
                getLatestWebViewConfiguration$invoke$10.L$2 = integer0;
                getLatestWebViewConfiguration$invoke$10.L$3 = list0;
                getLatestWebViewConfiguration$invoke$10.label = 1;
                object0 = this.webviewConfigurationDataSource.get(getLatestWebViewConfiguration$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                getLatestWebViewConfiguration0 = this;
                break;
            }
            case 1: {
                list0 = (List)getLatestWebViewConfiguration$invoke$10.L$3;
                integer0 = (Integer)getLatestWebViewConfiguration$invoke$10.L$2;
                s = (String)getLatestWebViewConfiguration$invoke$10.L$1;
                getLatestWebViewConfiguration0 = (GetLatestWebViewConfiguration)getLatestWebViewConfiguration$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            case 2: {
                WebViewConfiguration webViewConfiguration0 = (WebViewConfiguration)getLatestWebViewConfiguration$invoke$10.L$0;
                f0.n(object0);
                return webViewConfiguration0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        int v1 = ((WebViewConfigurationStore)object0).getVersion();
        L.o("", "it.entryPoint");
        List list1 = ((WebViewConfigurationStore)object0).getAdditionalFilesList();
        L.o(list1, "it.additionalFilesList");
        WebViewConfiguration webViewConfiguration1 = new WebViewConfiguration(v1, "", list1);
        if(s == null && integer0 == null && list0 == null) {
            return webViewConfiguration1;
        }
        int v2 = integer0 == null ? webViewConfiguration1.getVersion() : ((int)integer0);
        if(s == null) {
            s = webViewConfiguration1.getEntryPoint();
        }
        if(list0 == null) {
            list0 = webViewConfiguration1.getAdditionalFiles();
        }
        WebViewConfiguration webViewConfiguration2 = new WebViewConfiguration(v2, s, list0);
        if(!L.g(webViewConfiguration2, webViewConfiguration1)) {
            Builder webviewConfigurationStore$WebViewConfigurationStore$Builder0 = WebViewConfigurationStore.newBuilder();
            webviewConfigurationStore$WebViewConfigurationStore$Builder0.setVersion(webViewConfiguration2.getVersion());
            webviewConfigurationStore$WebViewConfigurationStore$Builder0.setEntryPoint(webViewConfiguration2.getEntryPoint());
            webviewConfigurationStore$WebViewConfigurationStore$Builder0.addAllAdditionalFiles(webViewConfiguration2.getAdditionalFiles());
            GeneratedMessageLite generatedMessageLite0 = webviewConfigurationStore$WebViewConfigurationStore$Builder0.build();
            L.o(generatedMessageLite0, "newBuilder().apply {\n   …                }.build()");
            getLatestWebViewConfiguration$invoke$10.L$0 = webViewConfiguration2;
            getLatestWebViewConfiguration$invoke$10.L$1 = null;
            getLatestWebViewConfiguration$invoke$10.L$2 = null;
            getLatestWebViewConfiguration$invoke$10.L$3 = null;
            getLatestWebViewConfiguration$invoke$10.label = 2;
            return getLatestWebViewConfiguration0.webviewConfigurationDataSource.set(((WebViewConfigurationStore)generatedMessageLite0), getLatestWebViewConfiguration$invoke$10) == object1 ? object1 : webViewConfiguration2;
        }
        return webViewConfiguration2;
    }

    public static Object invoke$default(GetLatestWebViewConfiguration getLatestWebViewConfiguration0, String s, Integer integer0, List list0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            integer0 = null;
        }
        if((v & 4) != 0) {
            list0 = null;
        }
        return getLatestWebViewConfiguration0.invoke(s, integer0, list0, d0);
    }
}

