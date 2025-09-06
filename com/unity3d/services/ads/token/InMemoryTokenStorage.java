package com.unity3d.services.ads.token;

import A3.a;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.di.IServiceComponent.DefaultImpls;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.D;
import kotlin.H;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import org.json.JSONArray;
import org.json.JSONException;
import y4.l;
import y4.m;

@s0({"SMAP\nInMemoryTokenStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMemoryTokenStorage.kt\ncom/unity3d/services/ads/token/InMemoryTokenStorage\n+ 2 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,101:1\n29#2,5:102\n230#3,5:107\n214#3,5:112\n230#3,5:117\n*S KotlinDebug\n*F\n+ 1 InMemoryTokenStorage.kt\ncom/unity3d/services/ads/token/InMemoryTokenStorage\n*L\n27#1:102,5\n53#1:107,5\n67#1:112,5\n91#1:117,5\n*E\n"})
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {
    @l
    private final E accessCounter;
    @l
    private final D asyncTokenStorage$delegate;
    private final ExecutorService executorService;
    @l
    private final E initToken;
    @l
    private final ConcurrentLinkedQueue queue;

    public InMemoryTokenStorage() {
        this.queue = new ConcurrentLinkedQueue();
        this.accessCounter = W.a(-1);
        this.initToken = W.a(null);
        this.executorService = Executors.newSingleThreadExecutor();
        com.unity3d.services.ads.token.InMemoryTokenStorage.special..inlined.inject.default.1 inMemoryTokenStorage$special$$inlined$inject$default$10 = new a("") {
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
                d d0 = m0.d(AsyncTokenStorage.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        this.asyncTokenStorage$delegate = kotlin.E.c(H.c, inMemoryTokenStorage$special$$inlined$inject$default$10);
    }

    // 检测为 Lambda 实现
    private static final void _get_nativeGeneratedToken_$lambda$2(String s) [...]

    @Override  // com.unity3d.services.ads.token.TokenStorage
    public void appendTokens(@l JSONArray jSONArray0) throws JSONException {
        L.p(jSONArray0, "tokens");
        this.accessCounter.compareAndSet(-1, 0);
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = jSONArray0.getString(v1);
            this.queue.add(s);
        }
        if(v > 0) {
            this.triggerTokenAvailable(false);
            this.getAsyncTokenStorage().onTokenAvailable();
        }
    }

    @Override  // com.unity3d.services.ads.token.TokenStorage
    public void createTokens(@l JSONArray jSONArray0) throws JSONException {
        L.p(jSONArray0, "tokens");
        this.deleteTokens();
        this.appendTokens(jSONArray0);
    }

    @Override  // com.unity3d.services.ads.token.TokenStorage
    public void deleteTokens() {
        this.queue.clear();
        E e0 = this.accessCounter;
        do {
            Object object0 = e0.getValue();
            ((Number)object0).intValue();
        }
        while(!e0.compareAndSet(object0, -1));
    }

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage)this.asyncTokenStorage$delegate.getValue();
    }

    @Override  // com.unity3d.services.ads.token.TokenStorage
    @l
    public S0 getNativeGeneratedToken() {
        DeviceInfoReaderBuilder deviceInfoReaderBuilder0 = new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance());
        new NativeTokenGenerator(this.executorService, deviceInfoReaderBuilder0, null).generateToken((String s) -> WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, new Object[]{s}));
        return S0.a;
    }

    @Override  // com.unity3d.services.core.di.IServiceComponent
    @l
    public IServiceProvider getServiceProvider() {
        return DefaultImpls.getServiceProvider(this);
    }

    @Override  // com.unity3d.services.ads.token.TokenStorage
    @m
    public String getToken() {
        Number number0;
        if(((Number)this.accessCounter.getValue()).intValue() == -1) {
            return (String)this.initToken.getValue();
        }
        if(this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        E e0 = this.accessCounter;
        do {
            Object object0 = e0.getValue();
            number0 = (Number)object0;
        }
        while(!e0.compareAndSet(object0, ((int)(number0.intValue() + 1))));
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, new Object[]{number0.intValue()});
        return (String)this.queue.poll();
    }

    @Override  // com.unity3d.services.ads.token.TokenStorage
    public void setInitToken(@m String s) {
        if(s == null) {
            return;
        }
        E e0 = this.initToken;
        do {
            Object object0 = e0.getValue();
            String s1 = (String)object0;
        }
        while(!e0.compareAndSet(object0, s));
        this.triggerTokenAvailable(true);
        this.getAsyncTokenStorage().onTokenAvailable();
    }

    private final void triggerTokenAvailable(boolean z) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z);
    }
}

