package androidx.privacysandbox.ads.adservices.java.topics;

import A3.o;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import com.google.common.util.concurrent.t0;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;
import z3.n;

public abstract class TopicsManagerFutures {
    static final class Api33Ext4JavaImpl extends TopicsManagerFutures {
        @l
        private final TopicsManager b;

        public Api33Ext4JavaImpl(@l TopicsManager topicsManager0) {
            L.p(topicsManager0, "mTopicsManager");
            super();
            this.b = topicsManager0;
        }

        @Override  // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
        @l
        public t0 b(@l GetTopicsRequest getTopicsRequest0) {
            L.p(getTopicsRequest0, "request");
            return CoroutineAdapterKt.c(k.b(P.a(h0.e()), null, null, new o(getTopicsRequest0, null) {
                int k;
                final Api33Ext4JavaImpl l;
                final GetTopicsRequest m;

                {
                    this.l = topicsManagerFutures$Api33Ext4JavaImpl0;
                    this.m = getTopicsRequest0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.Api33Ext4JavaImpl.getTopicsAsync.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.Api33Ext4JavaImpl.getTopicsAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            object0 = this.l.b.a(this.m, this);
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
            }, 3, null), null, 1, null);
        }
    }

    @s0({"SMAP\nTopicsManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        @n
        public final TopicsManagerFutures a(@l Context context0) {
            L.p(context0, "context");
            TopicsManager topicsManager0 = TopicsManager.a.a(context0);
            return topicsManager0 != null ? new Api33Ext4JavaImpl(topicsManager0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        TopicsManagerFutures.a = new Companion(null);
    }

    @m
    @n
    public static final TopicsManagerFutures a(@l Context context0) {
        return TopicsManagerFutures.a.a(context0);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @l
    public abstract t0 b(@l GetTopicsRequest arg1);
}

