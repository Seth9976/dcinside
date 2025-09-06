package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.dash.offline.a;
import java.util.ArrayList;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@SuppressLint({"NewApi"})
@RequiresExtension(extension = 1000000, version = 4)
@RestrictTo({Scope.a})
@s0({"SMAP\nTopicsManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,54:1\n314#2,11:55\n*S KotlinDebug\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n*L\n28#1:55,11\n*E\n"})
public class TopicsManagerImplCommon extends TopicsManager {
    @l
    private final android.adservices.topics.TopicsManager b;

    public TopicsManagerImplCommon(@l android.adservices.topics.TopicsManager topicsManager0) {
        L.p(topicsManager0, "mTopicsManager");
        super();
        this.b = topicsManager0;
    }

    @Override  // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @DoNotInline
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @m
    public Object a(@l GetTopicsRequest getTopicsRequest0, @l d d0) {
        return TopicsManagerImplCommon.g(this, getTopicsRequest0, d0);
    }

    public static final Object d(TopicsManagerImplCommon topicsManagerImplCommon0, android.adservices.topics.GetTopicsRequest getTopicsRequest0, d d0) {
        return topicsManagerImplCommon0.h(getTopicsRequest0, d0);
    }

    @l
    public android.adservices.topics.GetTopicsRequest e(@l GetTopicsRequest getTopicsRequest0) {
        L.p(getTopicsRequest0, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequest1 = f.a().setAdsSdkName("").build();
        L.o(getTopicsRequest1, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequest1;
    }

    @l
    public final GetTopicsResponse f(@l android.adservices.topics.GetTopicsResponse getTopicsResponse0) {
        L.p(getTopicsResponse0, "response");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: getTopicsResponse0.getTopics()) {
            Topic topic0 = (Topic)object0;
            arrayList0.add(new androidx.privacysandbox.ads.adservices.topics.Topic(topic0.getTaxonomyVersion(), topic0.getModelVersion(), topic0.getTopicId()));
        }
        return new GetTopicsResponse(arrayList0);
    }

    @DoNotInline
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    static Object g(TopicsManagerImplCommon topicsManagerImplCommon0, GetTopicsRequest getTopicsRequest0, d d0) {
        androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.getTopics.1 topicsManagerImplCommon$getTopics$10;
        if(d0 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.getTopics.1) {
            topicsManagerImplCommon$getTopics$10 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.getTopics.1)d0;
            int v = topicsManagerImplCommon$getTopics$10.n;
            if((v & 0x80000000) == 0) {
                topicsManagerImplCommon$getTopics$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return TopicsManagerImplCommon.g(topicsManagerImplCommon0, null, this);
                    }
                };
            }
            else {
                topicsManagerImplCommon$getTopics$10.n = v ^ 0x80000000;
            }
        }
        else {
            topicsManagerImplCommon$getTopics$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return TopicsManagerImplCommon.g(topicsManagerImplCommon0, null, this);
                }
            };
        }
        Object object0 = topicsManagerImplCommon$getTopics$10.l;
        Object object1 = b.l();
        switch(topicsManagerImplCommon$getTopics$10.n) {
            case 0: {
                f0.n(object0);
                android.adservices.topics.GetTopicsRequest getTopicsRequest1 = topicsManagerImplCommon0.e(getTopicsRequest0);
                topicsManagerImplCommon$getTopics$10.k = topicsManagerImplCommon0;
                topicsManagerImplCommon$getTopics$10.n = 1;
                object0 = topicsManagerImplCommon0.h(getTopicsRequest1, topicsManagerImplCommon$getTopics$10);
                return object0 == object1 ? object1 : topicsManagerImplCommon0.f(((android.adservices.topics.GetTopicsResponse)object0));
            }
            case 1: {
                topicsManagerImplCommon0 = (TopicsManagerImplCommon)topicsManagerImplCommon$getTopics$10.k;
                f0.n(object0);
                return topicsManagerImplCommon0.f(((android.adservices.topics.GetTopicsResponse)object0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    private final Object h(android.adservices.topics.GetTopicsRequest getTopicsRequest0, d d0) {
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        this.b.getTopics(getTopicsRequest0, new a(), OutcomeReceiverKt.a(p0));
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

