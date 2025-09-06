package com.vungle.ads.internal.bidding;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.W0;
import com.vungle.ads.c0;
import com.vungle.ads.internal.k;
import com.vungle.ads.internal.model.n;
import com.vungle.ads.internal.model.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.r0;
import com.vungle.ads.r;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlinx.serialization.i;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.s;
import kotlinx.serialization.z;
import y4.l;
import y4.m;

public final class a {
    public static final class b {
        @l
        private final String bidToken;
        @l
        private final String errorMessage;

        public b(@l String s, @l String s1) {
            L.p(s, "bidToken");
            L.p(s1, "errorMessage");
            super();
            this.bidToken = s;
            this.errorMessage = s1;
        }

        @l
        public final String component1() {
            return this.bidToken;
        }

        @l
        public final String component2() {
            return this.errorMessage;
        }

        @l
        public final b copy(@l String s, @l String s1) {
            L.p(s, "bidToken");
            L.p(s1, "errorMessage");
            return new b(s, s1);
        }

        public static b copy$default(b a$b0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = a$b0.bidToken;
            }
            if((v & 2) != 0) {
                s1 = a$b0.errorMessage;
            }
            return a$b0.copy(s, s1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            return L.g(this.bidToken, ((b)object0).bidToken) ? L.g(this.errorMessage, ((b)object0).errorMessage) : false;
        }

        @l
        public final String getBidToken() {
            return this.bidToken;
        }

        @l
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override
        public int hashCode() {
            return this.bidToken.hashCode() * 0x1F + this.errorMessage.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "BiddingTokenInfo(bidToken=" + this.bidToken + ", errorMessage=" + this.errorMessage + ')';
        }
    }

    public static final class c {
        private c() {
        }

        public c(w w0) {
        }
    }

    @l
    public static final c Companion = null;
    @l
    private static final String TAG = "BidTokenEncoder";
    public static final int TOKEN_VERSION = 6;
    @l
    private W0 bidTokenRequestedMetric;
    @l
    private final Context context;
    private long enterBackgroundTime;
    @l
    private final kotlinx.serialization.json.b json;
    private int ordinalView;

    static {
        a.Companion = new c(null);
    }

    public a(@l Context context0) {
        public static final class com.vungle.ads.internal.bidding.a.a extends com.vungle.ads.internal.util.b.b {
            com.vungle.ads.internal.bidding.a.a(a a0) {
                a.this = a0;
                super();
            }

            @Override  // com.vungle.ads.internal.util.b$b
            public void onBackground() {
                a.this.onPause$vungle_ads_release();
            }

            @Override  // com.vungle.ads.internal.util.b$b
            public void onForeground() {
                a.this.onResume$vungle_ads_release();
            }
        }


        static final class e extends N implements Function1 {
            public static final e INSTANCE;

            static {
                e.INSTANCE = new e();
            }

            e() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((f)object0));
                return S0.a;
            }

            public final void invoke(@l f f0) {
                L.p(f0, "$this$Json");
                f0.w(true);
                f0.u(true);
                f0.v(false);
            }
        }

        L.p(context0, "context");
        super();
        this.context = context0;
        this.bidTokenRequestedMetric = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BID_TOKEN_REQUESTED);
        this.json = s.b(null, e.INSTANCE, 1, null);
        com.vungle.ads.internal.bidding.a.a a$a0 = new com.vungle.ads.internal.bidding.a.a(this);
        com.vungle.ads.internal.util.b.Companion.addLifecycleListener(a$a0);
    }

    private static final com.vungle.ads.internal.network.l constructV6Token$lambda-0(D d0) {
        return (com.vungle.ads.internal.network.l)d0.getValue();
    }

    @VisibleForTesting
    @l
    public final String constructV6Token$vungle_ads_release() {
        public static final class d extends N implements A3.a {
            final Context $context;

            public d(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }

        d a$d0 = new d(this.context);
        com.vungle.ads.internal.model.f f0 = a.constructV6Token$lambda-0(E.c(H.a, a$d0)).requestBody(true, true);
        o o0 = new o(f0.getDevice(), f0.getUser(), f0.getExt(), new n(com.vungle.ads.internal.network.n.INSTANCE.getHeaderUa()), this.ordinalView);
        i i0 = z.k(this.json.a(), m0.A(o.class));
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return this.json.c(i0, o0);
    }

    @l
    public final b encode() {
        ++this.ordinalView;
        return this.generateBidToken();
    }

    private final b generateBidToken() {
        String s;
        r.logMetric$vungle_ads_release$default(r.INSTANCE, this.bidTokenRequestedMetric, null, null, 6, null);
        try {
            s = this.constructV6Token$vungle_ads_release();
        }
        catch(Exception exception0) {
            String s1 = "Failed to encode TokenParameters. " + exception0.getLocalizedMessage();
            new r0(s1).logErrorNoReturnValue$vungle_ads_release();
            return new b("", s1);
        }
        p.Companion.d("BidTokenEncoder", "BidToken: " + s);
        try {
            String s2 = com.vungle.ads.internal.util.m.INSTANCE.convertForSending(s);
            p.Companion.d("BidTokenEncoder", "After conversion: " + ("6:" + s2));
            return new b("6:" + s2, "");
        }
        catch(Exception exception1) {
            String s3 = "Fail to gzip token data. " + exception1.getLocalizedMessage();
            new c0(s3).logErrorNoReturnValue$vungle_ads_release();
            return new b("", s3);
        }
    }

    public final long getEnterBackgroundTime$vungle_ads_release() {
        return this.enterBackgroundTime;
    }

    @VisibleForTesting(otherwise = 2)
    public static void getEnterBackgroundTime$vungle_ads_release$annotations() {
    }

    private static void getJson$annotations() {
    }

    public final int getOrdinalView$vungle_ads_release() {
        return this.ordinalView;
    }

    @VisibleForTesting(otherwise = 2)
    public static void getOrdinalView$vungle_ads_release$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public final void onPause$vungle_ads_release() {
        p.Companion.d("BidTokenEncoder", "BidTokenEncoder#onBackground()");
        this.enterBackgroundTime = System.currentTimeMillis();
    }

    @VisibleForTesting(otherwise = 2)
    public final void onResume$vungle_ads_release() {
        p.Companion.d("BidTokenEncoder", "BidTokenEncoder#onForeground()");
        long v = k.INSTANCE.getSessionTimeout();
        if(System.currentTimeMillis() > this.enterBackgroundTime + v) {
            this.ordinalView = 0;
            this.enterBackgroundTime = 0L;
        }
    }

    public final void setEnterBackgroundTime$vungle_ads_release(long v) {
        this.enterBackgroundTime = v;
    }

    public final void setOrdinalView$vungle_ads_release(int v) {
        this.ordinalView = v;
    }
}

