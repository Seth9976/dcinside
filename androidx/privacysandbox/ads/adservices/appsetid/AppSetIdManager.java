package androidx.privacysandbox.ads.adservices.appsetid;

import android.adservices.appsetid.AppSetId;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
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

public abstract class AppSetIdManager {
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @RequiresExtension(extension = 1000000, version = 4)
    @s0({"SMAP\nAppSetIdManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetIdManager.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager$Api33Ext4Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 AppSetIdManager.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager$Api33Ext4Impl\n*L\n59#1:95,11\n*E\n"})
    static final class Api33Ext4Impl extends AppSetIdManager {
        @l
        private final android.adservices.appsetid.AppSetIdManager b;

        public Api33Ext4Impl(@l android.adservices.appsetid.AppSetIdManager appSetIdManager0) {
            L.p(appSetIdManager0, "mAppSetIdManager");
            super();
            this.b = appSetIdManager0;
        }

        public Api33Ext4Impl(@l Context context0) {
            L.p(context0, "context");
            Object object0 = context0.getSystemService(android.adservices.appsetid.AppSetIdManager.class);
            L.o(object0, "context.getSystemService…:class.java\n            )");
            this(((android.adservices.appsetid.AppSetIdManager)object0));
        }

        @Override  // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
        @DoNotInline
        @m
        public Object a(@l d d0) {
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl.getAppSetId.1 appSetIdManager$Api33Ext4Impl$getAppSetId$10;
            if(d0 instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl.getAppSetId.1) {
                appSetIdManager$Api33Ext4Impl$getAppSetId$10 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl.getAppSetId.1)d0;
                int v = appSetIdManager$Api33Ext4Impl$getAppSetId$10.n;
                if((v & 0x80000000) == 0) {
                    appSetIdManager$Api33Ext4Impl$getAppSetId$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                    appSetIdManager$Api33Ext4Impl$getAppSetId$10.n = v ^ 0x80000000;
                }
            }
            else {
                appSetIdManager$Api33Ext4Impl$getAppSetId$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
            Object object0 = appSetIdManager$Api33Ext4Impl$getAppSetId$10.l;
            Object object1 = b.l();
            switch(appSetIdManager$Api33Ext4Impl$getAppSetId$10.n) {
                case 0: {
                    f0.n(object0);
                    appSetIdManager$Api33Ext4Impl$getAppSetId$10.k = this;
                    appSetIdManager$Api33Ext4Impl$getAppSetId$10.n = 1;
                    object0 = this.f(appSetIdManager$Api33Ext4Impl$getAppSetId$10);
                    return object0 == object1 ? object1 : this.e(((AppSetId)object0));
                }
                case 1: {
                    Api33Ext4Impl appSetIdManager$Api33Ext4Impl0 = (Api33Ext4Impl)appSetIdManager$Api33Ext4Impl$getAppSetId$10.k;
                    f0.n(object0);
                    return appSetIdManager$Api33Ext4Impl0.e(((AppSetId)object0));
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }

        public static final Object c(Api33Ext4Impl appSetIdManager$Api33Ext4Impl0, d d0) {
            return appSetIdManager$Api33Ext4Impl0.f(d0);
        }

        private final androidx.privacysandbox.ads.adservices.appsetid.AppSetId e(AppSetId appSetId0) {
            if(appSetId0.getScope() == 1) {
                String s = appSetId0.getId();
                L.o(s, "response.id");
                return new androidx.privacysandbox.ads.adservices.appsetid.AppSetId(s, 1);
            }
            String s1 = appSetId0.getId();
            L.o(s1, "response.id");
            return new androidx.privacysandbox.ads.adservices.appsetid.AppSetId(s1, 2);
        }

        private final Object f(d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.b.getAppSetId(new a(), OutcomeReceiverKt.a(p0));
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
        public final AppSetIdManager a(@l Context context0) {
            L.p(context0, "context");
            return AdServicesInfo.a.a() >= 4 ? new Api33Ext4Impl(context0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        AppSetIdManager.a = new Companion(null);
    }

    @m
    public abstract Object a(@l d arg1);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @m
    @n
    public static final AppSetIdManager b(@l Context context0) {
        return AppSetIdManager.a.a(context0);
    }
}

