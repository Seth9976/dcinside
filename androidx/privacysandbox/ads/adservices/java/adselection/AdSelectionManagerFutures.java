package androidx.privacysandbox.ads.adservices.java.adselection;

import A3.o;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
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

public abstract class AdSelectionManagerFutures {
    static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {
        @m
        private final AdSelectionManager b;

        public Api33Ext4JavaImpl(@m AdSelectionManager adSelectionManager0) {
            this.b = adSelectionManager0;
        }

        @Override  // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @l
        public t0 b(@l ReportImpressionRequest reportImpressionRequest0) {
            L.p(reportImpressionRequest0, "reportImpressionRequest");
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(reportImpressionRequest0, null) {
                int k;
                final Api33Ext4JavaImpl l;
                final ReportImpressionRequest m;

                {
                    this.l = adSelectionManagerFutures$Api33Ext4JavaImpl0;
                    this.m = reportImpressionRequest0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Api33Ext4JavaImpl.reportImpressionAsync.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Api33Ext4JavaImpl.reportImpressionAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            AdSelectionManager adSelectionManager0 = this.l.b;
                            L.m(adSelectionManager0);
                            this.k = 1;
                            return adSelectionManager0.b(this.m, this) == object1 ? object1 : S0.a;
                        }
                        case 1: {
                            f0.n(object0);
                            return S0.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }
            }, 3, null), null, 1, null);
        }

        @Override  // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @l
        public t0 c(@l AdSelectionConfig adSelectionConfig0) {
            L.p(adSelectionConfig0, "adSelectionConfig");
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(adSelectionConfig0, null) {
                int k;
                final Api33Ext4JavaImpl l;
                final AdSelectionConfig m;

                {
                    this.l = adSelectionManagerFutures$Api33Ext4JavaImpl0;
                    this.m = adSelectionConfig0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Api33Ext4JavaImpl.selectAdsAsync.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Api33Ext4JavaImpl.selectAdsAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            AdSelectionManager adSelectionManager0 = this.l.b;
                            L.m(adSelectionManager0);
                            this.k = 1;
                            object0 = adSelectionManager0.c(this.m, this);
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

    @s0({"SMAP\nAdSelectionManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        @n
        public final AdSelectionManagerFutures a(@l Context context0) {
            L.p(context0, "context");
            AdSelectionManager adSelectionManager0 = AdSelectionManager.a.a(context0);
            return adSelectionManager0 != null ? new Api33Ext4JavaImpl(adSelectionManager0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        AdSelectionManagerFutures.a = new Companion(null);
    }

    @m
    @n
    public static final AdSelectionManagerFutures a(@l Context context0) {
        return AdSelectionManagerFutures.a.a(context0);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @l
    public abstract t0 b(@l ReportImpressionRequest arg1);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @l
    public abstract t0 c(@l AdSelectionConfig arg1);
}

