package androidx.privacysandbox.ads.adservices.java.measurement;

import A3.o;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
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

public abstract class MeasurementManagerFutures {
    static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {
        @l
        private final MeasurementManager b;

        public Api33Ext5JavaImpl(@l MeasurementManager measurementManager0) {
            L.p(measurementManager0, "mMeasurementManager");
            super();
            this.b = measurementManager0;
        }

        @Override  // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @l
        public t0 a(@l DeletionRequest deletionRequest0) {
            L.p(deletionRequest0, "deletionRequest");
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(deletionRequest0, null) {
                int k;
                final Api33Ext5JavaImpl l;
                final DeletionRequest m;

                {
                    this.l = measurementManagerFutures$Api33Ext5JavaImpl0;
                    this.m = deletionRequest0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.deleteRegistrationsAsync.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.deleteRegistrationsAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            return this.l.b.a(this.m, this) == object1 ? object1 : S0.a;
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

        @Override  // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @l
        public t0 c() {
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(null) {
                int k;
                final Api33Ext5JavaImpl l;

                {
                    this.l = measurementManagerFutures$Api33Ext5JavaImpl0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.getMeasurementApiStatusAsync.1(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.getMeasurementApiStatusAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            object0 = this.l.b.b(this);
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

        @Override  // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @l
        public t0 d(@l Uri uri0, @m InputEvent inputEvent0) {
            L.p(uri0, "attributionSource");
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(uri0, inputEvent0, null) {
                int k;
                final Api33Ext5JavaImpl l;
                final Uri m;
                final InputEvent n;

                {
                    this.l = measurementManagerFutures$Api33Ext5JavaImpl0;
                    this.m = uri0;
                    this.n = inputEvent0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.registerSourceAsync.1(this.l, this.m, this.n, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.registerSourceAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            return this.l.b.d(this.m, this.n, this) == object1 ? object1 : S0.a;
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

        @Override  // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @l
        public t0 e(@l Uri uri0) {
            L.p(uri0, "trigger");
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(uri0, null) {
                int k;
                final Api33Ext5JavaImpl l;
                final Uri m;

                {
                    this.l = measurementManagerFutures$Api33Ext5JavaImpl0;
                    this.m = uri0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.registerTriggerAsync.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.registerTriggerAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            return this.l.b.e(this.m, this) == object1 ? object1 : S0.a;
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

        @Override  // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @l
        public t0 f(@l WebSourceRegistrationRequest webSourceRegistrationRequest0) {
            L.p(webSourceRegistrationRequest0, "request");
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(webSourceRegistrationRequest0, null) {
                int k;
                final Api33Ext5JavaImpl l;
                final WebSourceRegistrationRequest m;

                {
                    this.l = measurementManagerFutures$Api33Ext5JavaImpl0;
                    this.m = webSourceRegistrationRequest0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.registerWebSourceAsync.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.registerWebSourceAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            return this.l.b.f(this.m, this) == object1 ? object1 : S0.a;
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

        @Override  // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @l
        public t0 g(@l WebTriggerRegistrationRequest webTriggerRegistrationRequest0) {
            L.p(webTriggerRegistrationRequest0, "request");
            return CoroutineAdapterKt.c(k.b(P.a(h0.a()), null, null, new o(webTriggerRegistrationRequest0, null) {
                int k;
                final Api33Ext5JavaImpl l;
                final WebTriggerRegistrationRequest m;

                {
                    this.l = measurementManagerFutures$Api33Ext5JavaImpl0;
                    this.m = webTriggerRegistrationRequest0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.registerWebTriggerAsync.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.Api33Ext5JavaImpl.registerWebTriggerAsync.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            return this.l.b.g(this.m, this) == object1 ? object1 : S0.a;
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

    @s0({"SMAP\nMeasurementManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        @n
        public final MeasurementManagerFutures a(@l Context context0) {
            L.p(context0, "context");
            MeasurementManager measurementManager0 = MeasurementManager.a.a(context0);
            return measurementManager0 != null ? new Api33Ext5JavaImpl(measurementManager0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        MeasurementManagerFutures.a = new Companion(null);
    }

    @l
    public abstract t0 a(@l DeletionRequest arg1);

    @m
    @n
    public static final MeasurementManagerFutures b(@l Context context0) {
        return MeasurementManagerFutures.a.a(context0);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @l
    public abstract t0 c();

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @l
    public abstract t0 d(@l Uri arg1, @m InputEvent arg2);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @l
    public abstract t0 e(@l Uri arg1);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @l
    public abstract t0 f(@l WebSourceRegistrationRequest arg1);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @l
    public abstract t0 g(@l WebTriggerRegistrationRequest arg1);
}

