package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nMetricsContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetricsContainer.kt\ncom/unity3d/services/core/request/metrics/MetricsContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n1#3:55\n*S KotlinDebug\n*F\n+ 1 MetricsContainer.kt\ncom/unity3d/services/core/request/metrics/MetricsContainer\n*L\n20#1:51\n20#1:52,3\n*E\n"})
public final class MetricsContainer {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    private static final String METRICS_CONTAINER = "m";
    @l
    private static final String METRICS_CONTAINER_TAGS = "t";
    @l
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";
    @l
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    @l
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    @l
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    @l
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";
    @l
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    @l
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    @l
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    @l
    private final String apiLevel;
    @l
    private final MetricCommonTags commonTags;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final String gameId;
    @l
    private final String metricSampleRate;
    @l
    private final List metrics;
    @m
    private final String sTkn;
    @l
    private final String shSid;

    static {
        MetricsContainer.Companion = new Companion(null);
    }

    public MetricsContainer(@l String s, @l MetricCommonTags metricCommonTags0, @l List list0, @m String s1) {
        L.p(s, "metricSampleRate");
        L.p(metricCommonTags0, "commonTags");
        L.p(list0, "metrics");
        super();
        this.metricSampleRate = s;
        this.commonTags = metricCommonTags0;
        this.metrics = list0;
        this.sTkn = s1;
        this.shSid = "7bb468bb-2c08-4a1f-ab41-e8111265cf75";
        this.apiLevel = "33";
        this.deviceModel = Device.getModel();
        this.deviceName = Device.getDevice();
        this.deviceManufacturer = Device.getManufacturer();
        this.gameId = ClientProperties.getGameId();
    }

    @l
    public final Map toMap() {
        ArrayList arrayList0 = new ArrayList(u.b0(this.metrics, 10));
        for(Object object0: this.metrics) {
            arrayList0.add(((Metric)object0).toMap());
        }
        Map map0 = Y.g();
        map0.put("msr", this.metricSampleRate);
        map0.put("m", arrayList0);
        map0.put("t", this.commonTags.toMap());
        map0.put("shSid", this.shSid);
        map0.put("apil", this.apiLevel);
        String s = this.sTkn;
        if(s != null) {
            map0.put("sTkn", s);
        }
        String s1 = this.deviceModel;
        if(s1 != null) {
            L.o(s1, "deviceModel");
            map0.put("deviceModel", s1);
        }
        String s2 = this.deviceName;
        if(s2 != null) {
            L.o(s2, "deviceName");
            map0.put("deviceName", s2);
        }
        String s3 = this.deviceManufacturer;
        if(s3 != null) {
            L.o(s3, "deviceManufacturer");
            map0.put("deviceMake", s3);
        }
        String s4 = this.gameId;
        if(s4 != null) {
            L.o(s4, "gameId");
            map0.put("gameId", s4);
        }
        return Y.d(map0);
    }
}

