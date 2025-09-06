package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.dash.offline.a;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;
import z3.n;

public abstract class AdSelectionManager {
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @RequiresExtension(extension = 1000000, version = 4)
    @s0({"SMAP\nAdSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManager.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager$Api33Ext4Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,199:1\n314#2,11:200\n314#2,11:211\n*S KotlinDebug\n*F\n+ 1 AdSelectionManager.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager$Api33Ext4Impl\n*L\n98#1:200,11\n162#1:211,11\n*E\n"})
    static final class Api33Ext4Impl extends AdSelectionManager {
        @l
        private final android.adservices.adselection.AdSelectionManager b;

        public Api33Ext4Impl(@l android.adservices.adselection.AdSelectionManager adSelectionManager0) {
            L.p(adSelectionManager0, "mAdSelectionManager");
            super();
            this.b = adSelectionManager0;
        }

        public Api33Ext4Impl(@l Context context0) {
            L.p(context0, "context");
            Object object0 = context0.getSystemService(android.adservices.adselection.AdSelectionManager.class);
            L.o(object0, "context.getSystemService…:class.java\n            )");
            this(((android.adservices.adselection.AdSelectionManager)object0));
        }

        @Override  // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @m
        public Object b(@l ReportImpressionRequest reportImpressionRequest0, @l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.b.reportImpression(this.k(reportImpressionRequest0), new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0 == b.l() ? object0 : S0.a;
        }

        @Override  // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @m
        public Object c(@l AdSelectionConfig adSelectionConfig0, @l d d0) {
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.selectAds.1 adSelectionManager$Api33Ext4Impl$selectAds$10;
            if(d0 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.selectAds.1) {
                adSelectionManager$Api33Ext4Impl$selectAds$10 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.selectAds.1)d0;
                int v = adSelectionManager$Api33Ext4Impl$selectAds$10.n;
                if((v & 0x80000000) == 0) {
                    adSelectionManager$Api33Ext4Impl$selectAds$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                        Object k;
                        Object l;
                        int n;

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            this.l = object0;
                            this.n |= 0x80000000;
                            return d0.c(null, this);
                        }
                    };
                }
                else {
                    adSelectionManager$Api33Ext4Impl$selectAds$10.n = v ^ 0x80000000;
                }
            }
            else {
                adSelectionManager$Api33Ext4Impl$selectAds$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.c(null, this);
                    }
                };
            }
            Object object0 = adSelectionManager$Api33Ext4Impl$selectAds$10.l;
            Object object1 = b.l();
            switch(adSelectionManager$Api33Ext4Impl$selectAds$10.n) {
                case 0: {
                    f0.n(object0);
                    android.adservices.adselection.AdSelectionConfig adSelectionConfig1 = this.g(adSelectionConfig0);
                    adSelectionManager$Api33Ext4Impl$selectAds$10.k = this;
                    adSelectionManager$Api33Ext4Impl$selectAds$10.n = 1;
                    object0 = this.m(adSelectionConfig1, adSelectionManager$Api33Ext4Impl$selectAds$10);
                    return object0 == object1 ? object1 : this.l(((AdSelectionOutcome)object0));
                }
                case 1: {
                    Api33Ext4Impl adSelectionManager$Api33Ext4Impl0 = (Api33Ext4Impl)adSelectionManager$Api33Ext4Impl$selectAds$10.k;
                    f0.n(object0);
                    return adSelectionManager$Api33Ext4Impl0.l(((AdSelectionOutcome)object0));
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }

        public static final Object f(Api33Ext4Impl adSelectionManager$Api33Ext4Impl0, android.adservices.adselection.AdSelectionConfig adSelectionConfig0, d d0) {
            return adSelectionManager$Api33Ext4Impl0.m(adSelectionConfig0, d0);
        }

        private final android.adservices.adselection.AdSelectionConfig g(AdSelectionConfig adSelectionConfig0) {
            android.adservices.adselection.AdSelectionConfig adSelectionConfig1 = k.a().setAdSelectionSignals(this.h(adSelectionConfig0.a())).setCustomAudienceBuyers(this.i(adSelectionConfig0.b())).setDecisionLogicUri(adSelectionConfig0.c()).setSeller(AdTechIdentifier.fromString(adSelectionConfig0.e().a())).setPerBuyerSignals(this.j(adSelectionConfig0.d())).setSellerSignals(this.h(adSelectionConfig0.f())).setTrustedScoringSignalsUri(adSelectionConfig0.g()).build();
            L.o(adSelectionConfig1, "Builder()\n              …\n                .build()");
            return adSelectionConfig1;
        }

        private final AdSelectionSignals h(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals0) {
            AdSelectionSignals adSelectionSignals1 = AdSelectionSignals.fromString(adSelectionSignals0.a());
            L.o(adSelectionSignals1, "fromString(request.signals)");
            return adSelectionSignals1;
        }

        private final List i(List list0) {
            List list1 = new ArrayList();
            for(Object object0: list0) {
                AdTechIdentifier adTechIdentifier0 = AdTechIdentifier.fromString(((androidx.privacysandbox.ads.adservices.common.AdTechIdentifier)object0).a());
                L.o(adTechIdentifier0, "fromString(buyer.identifier)");
                list1.add(adTechIdentifier0);
            }
            return list1;
        }

        private final Map j(Map map0) {
            AdSelectionSignals adSelectionSignals0;
            Map map1 = new HashMap();
            for(Object object0: map0.keySet()) {
                androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier0 = (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier)object0;
                AdTechIdentifier adTechIdentifier1 = AdTechIdentifier.fromString(adTechIdentifier0.a());
                L.o(adTechIdentifier1, "fromString(key.identifier)");
                if(map0.get(adTechIdentifier0) == null) {
                    adSelectionSignals0 = null;
                }
                else {
                    Object object1 = map0.get(adTechIdentifier0);
                    L.m(object1);
                    adSelectionSignals0 = this.h(((androidx.privacysandbox.ads.adservices.common.AdSelectionSignals)object1));
                }
                map1.put(adTechIdentifier1, adSelectionSignals0);
            }
            return map1;
        }

        private final android.adservices.adselection.ReportImpressionRequest k(ReportImpressionRequest reportImpressionRequest0) {
            return i.a(reportImpressionRequest0.b(), this.g(reportImpressionRequest0.a()));
        }

        private final androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome l(AdSelectionOutcome adSelectionOutcome0) {
            long v = adSelectionOutcome0.getAdSelectionId();
            Uri uri0 = adSelectionOutcome0.getRenderUri();
            L.o(uri0, "response.renderUri");
            return new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome(v, uri0);
        }

        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        private final Object m(android.adservices.adselection.AdSelectionConfig adSelectionConfig0, d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.b.selectAds(adSelectionConfig0, new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @m
        @n
        public final AdSelectionManager a(@l Context context0) {
            L.p(context0, "context");
            return AdServicesInfo.a.a() >= 4 ? new Api33Ext4Impl(context0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        AdSelectionManager.a = new Companion(null);
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @m
    @n
    public static final AdSelectionManager a(@l Context context0) {
        return AdSelectionManager.a.a(context0);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @m
    public abstract Object b(@l ReportImpressionRequest arg1, @l d arg2);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @m
    public abstract Object c(@l AdSelectionConfig arg1, @l d arg2);
}

