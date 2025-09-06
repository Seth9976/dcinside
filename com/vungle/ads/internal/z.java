package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.V;
import com.vungle.ads.VungleAds;
import com.vungle.ads.Y0;
import com.vungle.ads.internal.util.d;
import com.vungle.ads.r;
import java.util.concurrent.TimeUnit;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

public final class z {
    @m
    public final String getAvailableBidTokens(@l Context context0) {
        public static final class a extends N implements A3.a {
            final Context $context;

            public a(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(d.class);
            }
        }


        public static final class b extends N implements A3.a {
            final Context $context;

            public b(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.d.class);
            }
        }


        public static final class c extends N implements A3.a {
            final Context $context;

            public c(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.bidding.a.class);
            }
        }

        L.p(context0, "context");
        Y0 y00 = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        y00.markStart();
        if(!VungleAds.Companion.isInitialized()) {
            Context context1 = context0.getApplicationContext();
            L.o(context1, "context.applicationContext");
            V2.c.INSTANCE.init(context1);
        }
        a z$a0 = new a(context0);
        D d0 = E.c(H.a, z$a0);
        b z$b0 = new b(context0);
        D d1 = E.c(H.a, z$b0);
        c z$c0 = new c(context0);
        D d2 = E.c(H.a, z$c0);
        String s = (String)new com.vungle.ads.internal.executor.b(z.getAvailableBidTokens$lambda-1(d1).getApiExecutor().submit(() -> {
            L.p(d2, "$bidTokenEncoder$delegate");
            return z.getAvailableBidTokens$lambda-2(d2).encode().getBidToken();
        })).get(z.getAvailableBidTokens$lambda-0(d0).getTimeout(), TimeUnit.MILLISECONDS);
        if(s == null || s.length() == 0) {
            y00.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            y00.setMeta("Bid token is null or empty");
        }
        y00.markEnd();
        r.logMetric$vungle_ads_release$default(r.INSTANCE, y00, null, null, 6, null);
        return s;
    }

    private static final d getAvailableBidTokens$lambda-0(D d0) {
        return (d)d0.getValue();
    }

    private static final com.vungle.ads.internal.executor.d getAvailableBidTokens$lambda-1(D d0) {
        return (com.vungle.ads.internal.executor.d)d0.getValue();
    }

    private static final com.vungle.ads.internal.bidding.a getAvailableBidTokens$lambda-2(D d0) {
        return (com.vungle.ads.internal.bidding.a)d0.getValue();
    }

    // 检测为 Lambda 实现
    private static final String getAvailableBidTokens$lambda-3(D d0) [...]

    public final void getAvailableBidTokensAsync(@l Context context0, @l V v0) {
        public static final class com.vungle.ads.internal.z.d extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.z.d(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.bidding.a.class);
            }
        }


        public static final class e extends N implements A3.a {
            final Context $context;

            public e(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.d.class);
            }
        }

        L.p(context0, "context");
        L.p(v0, "callback");
        if(!VungleAds.Companion.isInitialized()) {
            Context context1 = context0.getApplicationContext();
            L.o(context1, "context.applicationContext");
            V2.c.INSTANCE.init(context1);
        }
        com.vungle.ads.internal.z.d z$d0 = new com.vungle.ads.internal.z.d(context0);
        D d0 = E.c(H.a, z$d0);
        e z$e0 = new e(context0);
        z.getAvailableBidTokensAsync$lambda-5(E.c(H.a, z$e0)).getApiExecutor().execute(() -> {
            L.p(v0, "$callback");
            L.p(d0, "$bidTokenEncoder$delegate");
            Y0 y00 = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
            y00.markStart();
            com.vungle.ads.internal.bidding.a.b a$b0 = z.getAvailableBidTokensAsync$lambda-4(d0).encode();
            y00.markEnd();
            if(a$b0.getBidToken().length() > 0) {
                v0.onBidTokenCollected(a$b0.getBidToken());
            }
            else {
                y00.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
                y00.setMeta(a$b0.getErrorMessage());
                v0.onBidTokenError(a$b0.getErrorMessage());
            }
            r.logMetric$vungle_ads_release$default(r.INSTANCE, y00, null, null, 6, null);
        });
    }

    private static final com.vungle.ads.internal.bidding.a getAvailableBidTokensAsync$lambda-4(D d0) {
        return (com.vungle.ads.internal.bidding.a)d0.getValue();
    }

    private static final com.vungle.ads.internal.executor.d getAvailableBidTokensAsync$lambda-5(D d0) {
        return (com.vungle.ads.internal.executor.d)d0.getValue();
    }

    // 检测为 Lambda 实现
    private static final void getAvailableBidTokensAsync$lambda-6(V v0, D d0) [...]

    @l
    public final String getSdkVersion() [...] // Inlined contents
}

