package androidx.privacysandbox.ads.adservices.adid;

import android.adservices.adid.AdId;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.dash.offline.a;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
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

public abstract class AdIdManager {
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @RequiresExtension(extension = 1000000, version = 4)
    @s0({"SMAP\nAdIdManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManager.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManager$Api33Ext4Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,98:1\n314#2,11:99\n*S KotlinDebug\n*F\n+ 1 AdIdManager.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManager$Api33Ext4Impl\n*L\n67#1:99,11\n*E\n"})
    static final class Api33Ext4Impl extends AdIdManager {
        @l
        private final android.adservices.adid.AdIdManager b;

        public Api33Ext4Impl(@l android.adservices.adid.AdIdManager adIdManager0) {
            L.p(adIdManager0, "mAdIdManager");
            super();
            this.b = adIdManager0;
        }

        public Api33Ext4Impl(@l Context context0) {
            L.p(context0, "context");
            Object object0 = context0.getSystemService(android.adservices.adid.AdIdManager.class);
            L.o(object0, "context.getSystemService…:class.java\n            )");
            this(((android.adservices.adid.AdIdManager)object0));
        }

        @Override  // androidx.privacysandbox.ads.adservices.adid.AdIdManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        @m
        public Object a(@l d d0) {
            androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl.getAdId.1 adIdManager$Api33Ext4Impl$getAdId$10;
            if(d0 instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl.getAdId.1) {
                adIdManager$Api33Ext4Impl$getAdId$10 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl.getAdId.1)d0;
                int v = adIdManager$Api33Ext4Impl$getAdId$10.n;
                if((v & 0x80000000) == 0) {
                    adIdManager$Api33Ext4Impl$getAdId$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                        Object k;
                        Object l;
                        int n;

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            this.l = object0;
                            this.n |= 0x80000000;
                            return d0.a(this);
                        }
                    };
                }
                else {
                    adIdManager$Api33Ext4Impl$getAdId$10.n = v ^ 0x80000000;
                }
            }
            else {
                adIdManager$Api33Ext4Impl$getAdId$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.a(this);
                    }
                };
            }
            Object object0 = adIdManager$Api33Ext4Impl$getAdId$10.l;
            Object object1 = b.l();
            switch(adIdManager$Api33Ext4Impl$getAdId$10.n) {
                case 0: {
                    f0.n(object0);
                    adIdManager$Api33Ext4Impl$getAdId$10.k = this;
                    adIdManager$Api33Ext4Impl$getAdId$10.n = 1;
                    object0 = this.f(adIdManager$Api33Ext4Impl$getAdId$10);
                    return object0 == object1 ? object1 : this.e(((AdId)object0));
                }
                case 1: {
                    Api33Ext4Impl adIdManager$Api33Ext4Impl0 = (Api33Ext4Impl)adIdManager$Api33Ext4Impl$getAdId$10.k;
                    f0.n(object0);
                    return adIdManager$Api33Ext4Impl0.e(((AdId)object0));
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }

        public static final Object c(Api33Ext4Impl adIdManager$Api33Ext4Impl0, d d0) {
            return adIdManager$Api33Ext4Impl0.f(d0);
        }

        private final androidx.privacysandbox.ads.adservices.adid.AdId e(AdId adId0) {
            String s = adId0.getAdId();
            L.o(s, "response.adId");
            return new androidx.privacysandbox.ads.adservices.adid.AdId(s, adId0.isLimitAdTrackingEnabled());
        }

        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        private final Object f(d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.b.getAdId(new a(), OutcomeReceiverKt.a(p0));
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
        public final AdIdManager a(@l Context context0) {
            L.p(context0, "context");
            return AdServicesInfo.a.a() >= 4 ? new Api33Ext4Impl(context0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        AdIdManager.a = new Companion(null);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    @m
    public abstract Object a(@l d arg1);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @m
    @n
    public static final AdIdManager b(@l Context context0) {
        return AdIdManager.a.a(context0);
    }
}

