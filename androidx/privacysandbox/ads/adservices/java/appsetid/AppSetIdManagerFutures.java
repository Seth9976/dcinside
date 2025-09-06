package androidx.privacysandbox.ads.adservices.java.appsetid;

import A3.o;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
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

public abstract class AppSetIdManagerFutures {
    static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {
        @l
        private final AppSetIdManager b;

        public Api33Ext4JavaImpl(@l AppSetIdManager appSetIdManager0) {
            L.p(appSetIdManager0, "mAppSetIdManager");
            super();
            this.b = appSetIdManager0;
        }

        @Override  // androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures
        @DoNotInline
        @l
        public t0 b() {
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(null) {
                int k;
                final Api33Ext4JavaImpl l;

                {
                    this.l = appSetIdManagerFutures$Api33Ext4JavaImpl0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures.Api33Ext4JavaImpl.getAppSetIdAsync.1(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures.Api33Ext4JavaImpl.getAppSetIdAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            object0 = this.l.b.a(this);
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

    @s0({"SMAP\nAppSetIdManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetIdManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/appsetid/AppSetIdManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        @n
        public final AppSetIdManagerFutures a(@l Context context0) {
            L.p(context0, "context");
            AppSetIdManager appSetIdManager0 = AppSetIdManager.a.a(context0);
            return appSetIdManager0 != null ? new Api33Ext4JavaImpl(appSetIdManager0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        AppSetIdManagerFutures.a = new Companion(null);
    }

    @m
    @n
    public static final AppSetIdManagerFutures a(@l Context context0) {
        return AppSetIdManagerFutures.a.a(context0);
    }

    @l
    public abstract t0 b();
}

