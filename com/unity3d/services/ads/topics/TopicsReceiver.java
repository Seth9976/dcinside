package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.json.JSONArray;
import org.json.JSONObject;
import y4.l;

@SuppressLint({"NewApi", "MissingPermission"})
@s0({"SMAP\nTopicsReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsReceiver.kt\ncom/unity3d/services/ads/topics/TopicsReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1855#2,2:37\n*S KotlinDebug\n*F\n+ 1 TopicsReceiver.kt\ncom/unity3d/services/ads/topics/TopicsReceiver\n*L\n17#1:37,2\n*E\n"})
public final class TopicsReceiver implements OutcomeReceiver {
    @l
    private final IEventSender eventSender;

    public TopicsReceiver(@l IEventSender iEventSender0) {
        L.p(iEventSender0, "eventSender");
        super();
        this.eventSender = iEventSender0;
    }

    @l
    public final JSONObject formatTopic(@l Topic topic0) {
        L.p(topic0, "topic");
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("taxonomyVersion", topic0.getTaxonomyVersion());
        jSONObject0.put("modelVersion", topic0.getModelVersion());
        jSONObject0.put("topicId", topic0.getTopicId());
        return jSONObject0;
    }

    public void onError(@l Exception exception0) {
        L.p(exception0, "error");
        DeviceLog.debug(("GetTopics exception: " + exception0));
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, new Object[]{TopicsErrors.ERROR_EXCEPTION, exception0.toString()});
    }

    @Override  // android.os.OutcomeReceiver
    public void onError(Throwable throwable0) {
        this.onError(((Exception)throwable0));
    }

    public void onResult(@l GetTopicsResponse getTopicsResponse0) {
        L.p(getTopicsResponse0, "result");
        JSONArray jSONArray0 = new JSONArray();
        List list0 = getTopicsResponse0.getTopics();
        L.o(list0, "result.topics");
        for(Object object0: list0) {
            L.o(((Topic)object0), "it");
            jSONArray0.put(this.formatTopic(((Topic)object0)));
        }
        String s = jSONArray0.toString();
        L.o(s, "resultArray.toString()");
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.TOPICS_AVAILABLE, new Object[]{s});
    }

    @Override  // android.os.OutcomeReceiver
    public void onResult(Object object0) {
        this.onResult(((GetTopicsResponse)object0));
    }
}

