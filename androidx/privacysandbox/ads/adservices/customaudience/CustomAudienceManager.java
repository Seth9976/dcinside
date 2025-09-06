package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.TrustedBiddingData;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.dash.offline.a;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;
import z3.n;

public abstract class CustomAudienceManager {
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @RequiresExtension(extension = 1000000, version = 4)
    @s0({"SMAP\nCustomAudienceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManager.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager$Api33Ext4Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,220:1\n314#2,11:221\n314#2,11:232\n*S KotlinDebug\n*F\n+ 1 CustomAudienceManager.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager$Api33Ext4Impl\n*L\n111#1:221,11\n123#1:232,11\n*E\n"})
    static final class Api33Ext4Impl extends CustomAudienceManager {
        @l
        private final android.adservices.customaudience.CustomAudienceManager b;

        public Api33Ext4Impl(@l android.adservices.customaudience.CustomAudienceManager customAudienceManager0) {
            L.p(customAudienceManager0, "customAudienceManager");
            super();
            this.b = customAudienceManager0;
        }

        public Api33Ext4Impl(@l Context context0) {
            L.p(context0, "context");
            Object object0 = context0.getSystemService(android.adservices.customaudience.CustomAudienceManager.class);
            L.o(object0, "context.getSystemService…:class.java\n            )");
            this(((android.adservices.customaudience.CustomAudienceManager)object0));
        }

        @Override  // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @m
        public Object a(@l JoinCustomAudienceRequest joinCustomAudienceRequest0, @l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.b.joinCustomAudience(this.k(joinCustomAudienceRequest0), new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0 == b.l() ? object0 : S0.a;
        }

        @Override  // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @m
        public Object b(@l LeaveCustomAudienceRequest leaveCustomAudienceRequest0, @l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.b.leaveCustomAudience(this.l(leaveCustomAudienceRequest0), new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0 == b.l() ? object0 : S0.a;
        }

        private final List g(List list0) {
            List list1 = new ArrayList();
            for(Object object0: list0) {
                AdData adData0 = v.a().setMetadata(((androidx.privacysandbox.ads.adservices.common.AdData)object0).a()).setRenderUri(((androidx.privacysandbox.ads.adservices.common.AdData)object0).b()).build();
                L.o(adData0, "Builder()\n              …                 .build()");
                list1.add(adData0);
            }
            return list1;
        }

        private final AdTechIdentifier h(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier0) {
            AdTechIdentifier adTechIdentifier1 = AdTechIdentifier.fromString(adTechIdentifier0.a());
            L.o(adTechIdentifier1, "fromString(input.identifier)");
            return adTechIdentifier1;
        }

        private final AdSelectionSignals i(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals0) {
            return adSelectionSignals0 == null ? null : AdSelectionSignals.fromString(adSelectionSignals0.a());
        }

        private final CustomAudience j(androidx.privacysandbox.ads.adservices.customaudience.CustomAudience customAudience0) {
            CustomAudience customAudience1 = androidx.privacysandbox.ads.adservices.customaudience.b.a(androidx.privacysandbox.ads.adservices.customaudience.a.a(r.a(), customAudience0.a()).setAds(this.g(customAudience0.b())).setBiddingLogicUri(customAudience0.c()).setBuyer(this.h(customAudience0.d())).setDailyUpdateUri(customAudience0.e()), customAudience0.f()).setName(customAudience0.g()).setTrustedBiddingData(this.m(customAudience0.h())).setUserBiddingSignals(this.i(customAudience0.i())).build();
            L.o(customAudience1, "Builder()\n              …\n                .build()");
            return customAudience1;
        }

        private final android.adservices.customaudience.JoinCustomAudienceRequest k(JoinCustomAudienceRequest joinCustomAudienceRequest0) {
            android.adservices.customaudience.JoinCustomAudienceRequest joinCustomAudienceRequest1 = t.a().setCustomAudience(this.j(joinCustomAudienceRequest0.a())).build();
            L.o(joinCustomAudienceRequest1, "Builder()\n              …\n                .build()");
            return joinCustomAudienceRequest1;
        }

        private final android.adservices.customaudience.LeaveCustomAudienceRequest l(LeaveCustomAudienceRequest leaveCustomAudienceRequest0) {
            android.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequest1 = s.a().setBuyer(this.h(leaveCustomAudienceRequest0.a())).setName(leaveCustomAudienceRequest0.b()).build();
            L.o(leaveCustomAudienceRequest1, "Builder()\n              …\n                .build()");
            return leaveCustomAudienceRequest1;
        }

        private final TrustedBiddingData m(androidx.privacysandbox.ads.adservices.customaudience.TrustedBiddingData trustedBiddingData0) {
            return trustedBiddingData0 == null ? null : u.a().setTrustedBiddingKeys(trustedBiddingData0.a()).setTrustedBiddingUri(trustedBiddingData0.b()).build();
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
        public final CustomAudienceManager a(@l Context context0) {
            L.p(context0, "context");
            return AdServicesInfo.a.a() >= 4 ? new Api33Ext4Impl(context0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        CustomAudienceManager.a = new Companion(null);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @m
    public abstract Object a(@l JoinCustomAudienceRequest arg1, @l d arg2);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @m
    public abstract Object b(@l LeaveCustomAudienceRequest arg1, @l d arg2);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @m
    @n
    public static final CustomAudienceManager c(@l Context context0) {
        return CustomAudienceManager.a.a(context0);
    }
}

