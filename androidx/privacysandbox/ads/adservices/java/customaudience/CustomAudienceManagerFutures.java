package androidx.privacysandbox.ads.adservices.java.customaudience;

import A3.o;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
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

public abstract class CustomAudienceManagerFutures {
    static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        @m
        private final CustomAudienceManager b;

        public Api33Ext4JavaImpl(@m CustomAudienceManager customAudienceManager0) {
            this.b = customAudienceManager0;
        }

        @Override  // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @l
        public t0 b(@l JoinCustomAudienceRequest joinCustomAudienceRequest0) {
            L.p(joinCustomAudienceRequest0, "request");
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(joinCustomAudienceRequest0, null) {
                int k;
                final Api33Ext4JavaImpl l;
                final JoinCustomAudienceRequest m;

                {
                    this.l = customAudienceManagerFutures$Api33Ext4JavaImpl0;
                    this.m = joinCustomAudienceRequest0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures.Api33Ext4JavaImpl.joinCustomAudienceAsync.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures.Api33Ext4JavaImpl.joinCustomAudienceAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            CustomAudienceManager customAudienceManager0 = this.l.b;
                            L.m(customAudienceManager0);
                            this.k = 1;
                            return customAudienceManager0.a(this.m, this) == object1 ? object1 : S0.a;
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

        @Override  // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @l
        public t0 c(@l LeaveCustomAudienceRequest leaveCustomAudienceRequest0) {
            L.p(leaveCustomAudienceRequest0, "request");
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(leaveCustomAudienceRequest0, null) {
                int k;
                final Api33Ext4JavaImpl l;
                final LeaveCustomAudienceRequest m;

                {
                    this.l = customAudienceManagerFutures$Api33Ext4JavaImpl0;
                    this.m = leaveCustomAudienceRequest0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures.Api33Ext4JavaImpl.leaveCustomAudienceAsync.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures.Api33Ext4JavaImpl.leaveCustomAudienceAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            CustomAudienceManager customAudienceManager0 = this.l.b;
                            L.m(customAudienceManager0);
                            this.k = 1;
                            return customAudienceManager0.b(this.m, this) == object1 ? object1 : S0.a;
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
    }

    @s0({"SMAP\nCustomAudienceManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1#2:141\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        @n
        public final CustomAudienceManagerFutures a(@l Context context0) {
            L.p(context0, "context");
            CustomAudienceManager customAudienceManager0 = CustomAudienceManager.a.a(context0);
            return customAudienceManager0 != null ? new Api33Ext4JavaImpl(customAudienceManager0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        CustomAudienceManagerFutures.a = new Companion(null);
    }

    @m
    @n
    public static final CustomAudienceManagerFutures a(@l Context context0) {
        return CustomAudienceManagerFutures.a.a(context0);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @l
    public abstract t0 b(@l JoinCustomAudienceRequest arg1);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @l
    public abstract t0 c(@l LeaveCustomAudienceRequest arg1);
}

