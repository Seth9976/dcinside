package com.unity3d.services.core.request.metrics;

import A3.o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent.DefaultImpls;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import kotlin.text.v;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import org.json.JSONObject;
import y4.l;
import y4.m;

@s0({"SMAP\nMetricSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetricSender.kt\ncom/unity3d/services/core/request/metrics/MetricSender\n+ 2 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,79:1\n16#2,4:80\n16#2,4:84\n49#3,4:88\n*S KotlinDebug\n*F\n+ 1 MetricSender.kt\ncom/unity3d/services/core/request/metrics/MetricSender\n*L\n25#1:80,4\n26#1:84,4\n53#1:88,4\n*E\n"})
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    @l
    private final MetricCommonTags commonTags;
    @l
    private final ISDKDispatchers dispatchers;
    @l
    private final HttpClient httpClient;
    @m
    private final String metricEndPoint;
    @l
    private final String metricSampleRate;
    @l
    private final O scope;
    private final String sessionToken;

    public MetricSender(@l Configuration configuration0, @l InitializationStatusReader initializationStatusReader0) {
        L.p(configuration0, "configuration");
        L.p(initializationStatusReader0, "initializationStatusReader");
        super(initializationStatusReader0);
        MetricCommonTags metricCommonTags0 = new MetricCommonTags();
        metricCommonTags0.updateWithConfig(configuration0);
        this.commonTags = metricCommonTags0;
        this.metricSampleRate = String.valueOf(b.K0(configuration0.getMetricSampleRate()));
        this.sessionToken = configuration0.getSessionToken();
        ISDKDispatchers iSDKDispatchers0 = (ISDKDispatchers)this.getServiceProvider().getRegistry().getService("", m0.d(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers0;
        this.httpClient = (HttpClient)this.getServiceProvider().getRegistry().getService("", m0.d(HttpClient.class));
        this.scope = P.a(iSDKDispatchers0.getIo());
        this.metricEndPoint = "";
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    @m
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override  // com.unity3d.services.core.di.IServiceComponent
    @l
    public IServiceProvider getServiceProvider() {
        return DefaultImpls.getServiceProvider(this);
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@l String s, @m String s1, @l Map map0) {
        L.p(s, "event");
        L.p(map0, "tags");
        if(s.length() == 0) {
            DeviceLog.debug(("Metric event not sent due to being null or empty: " + s));
            return;
        }
        this.sendMetrics(u.k(new Metric(s, s1, map0)));
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(@l Metric metric0) {
        L.p(metric0, "metric");
        this.sendMetrics(u.k(metric0));
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetrics(@l List list0) {
        L.p(list0, "metrics");
        if(list0.isEmpty()) {
            DeviceLog.debug("Metrics event not send due to being empty");
            return;
        }
        String s = this.getMetricEndPoint();
        if(s != null && !v.x3(s)) {
            com.unity3d.services.core.request.metrics.MetricSender.sendMetrics..inlined.CoroutineExceptionHandler.1 metricSender$sendMetrics$$inlined$CoroutineExceptionHandler$10 = new CoroutineExceptionHandler(list0) {
                @Override  // kotlinx.coroutines.CoroutineExceptionHandler
                public void handleException(@l g g0, @l Throwable throwable0) {
                    DeviceLog.debug(("Metric " + this.$metrics$inlined + " failed to send with error: " + throwable0));
                }
            };
            com.unity3d.services.core.request.metrics.MetricSender.sendMetrics.1 metricSender$sendMetrics$10 = new o(list0, null) {
                final List $metrics;
                int label;

                {
                    MetricSender.this = metricSender0;
                    this.$metrics = list0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.unity3d.services.core.request.metrics.MetricSender.sendMetrics.1(MetricSender.this, this.$metrics, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.unity3d.services.core.request.metrics.MetricSender.sendMetrics.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object2;
                    Object object1 = kotlin.coroutines.intrinsics.b.l();
                    switch(this.label) {
                        case 0: {
                            f0.n(object0);
                            String s = new JSONObject(new MetricsContainer(MetricSender.this.metricSampleRate, MetricSender.this.commonTags, this.$metrics, MetricSender.this.sessionToken).toMap()).toString();
                            L.o(s, "JSONObject(container.toMap()).toString()");
                            String s1 = MetricSender.this.getMetricEndPoint();
                            if(s1 == null) {
                                s1 = "";
                            }
                            HttpRequest httpRequest0 = new HttpRequest(s1, null, RequestType.POST, s, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FFF2, null);
                            this.label = 1;
                            object2 = MetricSender.this.httpClient.execute(httpRequest0, this);
                            if(object2 == object1) {
                                return object1;
                            }
                            break;
                        }
                        case 1: {
                            f0.n(object0);
                            object2 = object0;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    if(((HttpResponse)object2).getStatusCode() / 100 == 2) {
                        DeviceLog.debug(("Metric " + this.$metrics + " sent to " + MetricSender.this.getMetricEndPoint()));
                        return S0.a;
                    }
                    DeviceLog.debug(("Metric " + this.$metrics + " failed to send with response code: " + ((HttpResponse)object2).getStatusCode()));
                    return S0.a;
                }
            };
            k.f(this.scope, metricSender$sendMetrics$$inlined$CoroutineExceptionHandler$10, null, metricSender$sendMetrics$10, 2, null);
            return;
        }
        DeviceLog.debug(("Metrics: " + list0 + " was not sent to null or empty endpoint: " + this.getMetricEndPoint()));
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}

