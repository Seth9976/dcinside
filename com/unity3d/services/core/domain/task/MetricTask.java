package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nMetricTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetricTask.kt\ncom/unity3d/services/core/domain/task/MetricTask\n+ 2 Timing.kt\nkotlin/system/TimingKt\n+ 3 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n*L\n1#1,104:1\n31#2,6:105\n16#3,4:111\n*S KotlinDebug\n*F\n+ 1 MetricTask.kt\ncom/unity3d/services/core/domain/task/MetricTask\n*L\n23#1:105,6\n68#1:111,4\n*E\n"})
public abstract class MetricTask implements BaseTask {
    private long duration;
    @l
    private String taskStatus;

    public MetricTask() {
        this.taskStatus = "unknown";
    }

    private final void captureMetric(Object object0) {
        this.taskStatus = e0.j(object0) ? "success" : "failure";
        this.sendMetric();
    }

    public final long getDuration() {
        return this.duration;
    }

    private final Metric getMetric() {
        Long long0 = this.duration;
        Map map0 = this.getMetricTagsForState();
        return new Metric(this.getMetricName(), long0, map0);
    }

    @m
    public String getMetricName() {
        return null;
    }

    @l
    public final String getMetricNameForInitializeTask(@l String s) [...] // 潜在的解密器

    @m
    public final String getMetricNameForTask(@l Object object0) {
        L.p(object0, "task");
        String s = object0.getClass().getSimpleName();
        L.o(s, "className");
        if(s.length() == 0) {
            return null;
        }
        L.o(s, "className");
        String s1 = s.substring(15);
        L.o(s1, "this as java.lang.String).substring(startIndex)");
        String s2 = s1.toLowerCase(Locale.ROOT);
        L.o(s2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return "native_" + s2 + "_state";
    }

    private final Map getMetricTagsForState() {
        Map map0 = InitializeEventsMetricSender.getInstance().getRetryTags();
        L.o(map0, "getInstance().retryTags");
        return map0;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender)this.getServiceProvider().getRegistry().getService("", m0.d(SDKMetricsSender.class));
    }

    @Override  // com.unity3d.services.core.di.IServiceComponent
    @l
    public IServiceProvider getServiceProvider() {
        return DefaultImpls.getServiceProvider(this);
    }

    private final int getStatePrefixLength() [...] // Inlined contents

    @l
    public final String getTaskStatus() {
        return this.taskStatus;
    }

    @Override  // com.unity3d.services.core.domain.task.BaseTask
    @m
    public Object invoke-gIAlu-s(@l BaseParams baseParams0, @l d d0) {
        return MetricTask.invoke-gIAlu-s$suspendImpl(this, baseParams0, d0);
    }

    static Object invoke-gIAlu-s$suspendImpl(MetricTask metricTask0, BaseParams baseParams0, d d0) {
        h l0$h2;
        Object object3;
        TimeUnit timeUnit1;
        h l0$h1;
        MetricTask metricTask1;
        long v1;
        com.unity3d.services.core.domain.task.MetricTask.invoke.1 metricTask$invoke$10;
        if(d0 instanceof com.unity3d.services.core.domain.task.MetricTask.invoke.1) {
            metricTask$invoke$10 = (com.unity3d.services.core.domain.task.MetricTask.invoke.1)d0;
            int v = metricTask$invoke$10.label;
            if((v & 0x80000000) == 0) {
                metricTask$invoke$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    long J$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        Object object1 = MetricTask.invoke-gIAlu-s$suspendImpl(metricTask0, null, this);
                        return object1 == b.l() ? object1 : e0.a(object1);
                    }
                };
            }
            else {
                metricTask$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            metricTask$invoke$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                long J$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    Object object1 = MetricTask.invoke-gIAlu-s$suspendImpl(metricTask0, null, this);
                    return object1 == b.l() ? object1 : e0.a(object1);
                }
            };
        }
        Object object0 = metricTask$invoke$10.result;
        Object object1 = b.l();
        switch(metricTask$invoke$10.label) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
                v1 = System.nanoTime();
                metricTask$invoke$10.L$0 = metricTask0;
                metricTask$invoke$10.L$1 = l0$h0;
                metricTask$invoke$10.L$2 = l0$h0;
                metricTask$invoke$10.L$3 = metricTask0;
                metricTask$invoke$10.L$4 = timeUnit0;
                metricTask$invoke$10.J$0 = v1;
                metricTask$invoke$10.label = 1;
                Object object2 = DefaultImpls.invoke-gIAlu-s(metricTask0, baseParams0, metricTask$invoke$10);
                if(object2 == object1) {
                    return object1;
                }
                metricTask1 = metricTask0;
                l0$h1 = l0$h0;
                timeUnit1 = timeUnit0;
                object3 = object2;
                l0$h2 = l0$h1;
                break;
            }
            case 1: {
                long v2 = metricTask$invoke$10.J$0;
                timeUnit1 = (TimeUnit)metricTask$invoke$10.L$4;
                MetricTask metricTask2 = (MetricTask)metricTask$invoke$10.L$3;
                l0$h1 = (h)metricTask$invoke$10.L$2;
                h l0$h3 = (h)metricTask$invoke$10.L$1;
                metricTask1 = (MetricTask)metricTask$invoke$10.L$0;
                f0.n(object0);
                object3 = ((e0)object0).l();
                metricTask0 = metricTask2;
                l0$h2 = l0$h3;
                v1 = v2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        l0$h1.a = object3;
        metricTask0.duration = timeUnit1.toMillis(System.nanoTime() - v1);
        metricTask1.captureMetric(l0$h2.a);
        return l0$h2.a;
    }

    private final void sendMetric() {
        String s = this.getMetricName();
        if(s != null && s.length() != 0) {
            this.getSDKMetrics().sendMetric(this.getMetric());
        }
    }

    public final void setDuration(long v) {
        this.duration = v;
    }

    public final void setTaskStatus(@l String s) {
        L.p(s, "<set-?>");
        this.taskStatus = s;
    }
}

