package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebTriggerParams;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
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

public abstract class MeasurementManager {
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @RequiresExtension(extension = 1000000, version = 5)
    @s0({"SMAP\nMeasurementManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManager.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManager$Api33Ext5Impl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,263:1\n314#2,11:264\n314#2,11:275\n314#2,11:286\n314#2,11:297\n314#2,11:308\n314#2,11:319\n*S KotlinDebug\n*F\n+ 1 MeasurementManager.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManager$Api33Ext5Impl\n*L\n106#1:264,11\n131#1:275,11\n144#1:286,11\n155#1:297,11\n193#1:308,11\n226#1:319,11\n*E\n"})
    static final class Api33Ext5Impl extends MeasurementManager {
        @l
        private final android.adservices.measurement.MeasurementManager d;

        public Api33Ext5Impl(@l android.adservices.measurement.MeasurementManager measurementManager0) {
            L.p(measurementManager0, "mMeasurementManager");
            super();
            this.d = measurementManager0;
        }

        public Api33Ext5Impl(@l Context context0) {
            L.p(context0, "context");
            Object object0 = context0.getSystemService(android.adservices.measurement.MeasurementManager.class);
            L.o(object0, "context.getSystemService…:class.java\n            )");
            this(((android.adservices.measurement.MeasurementManager)object0));
        }

        @Override  // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        @m
        public Object a(@l DeletionRequest deletionRequest0, @l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.d.deleteRegistrations(this.l(deletionRequest0), new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0 == b.l() ? object0 : S0.a;
        }

        @Override  // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @m
        public Object b(@l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.d.getMeasurementApiStatus(new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0;
        }

        @Override  // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @m
        public Object d(@l Uri uri0, @m InputEvent inputEvent0, @l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.d.registerSource(uri0, inputEvent0, new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0 == b.l() ? object0 : S0.a;
        }

        @Override  // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @m
        public Object e(@l Uri uri0, @l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.d.registerTrigger(uri0, new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0 == b.l() ? object0 : S0.a;
        }

        @Override  // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @m
        public Object f(@l WebSourceRegistrationRequest webSourceRegistrationRequest0, @l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.d.registerWebSource(this.n(webSourceRegistrationRequest0), new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0 == b.l() ? object0 : S0.a;
        }

        @Override  // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @m
        public Object g(@l WebTriggerRegistrationRequest webTriggerRegistrationRequest0, @l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.d.registerWebTrigger(this.p(webTriggerRegistrationRequest0), new a(), OutcomeReceiverKt.a(p0));
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0 == b.l() ? object0 : S0.a;
        }

        private final android.adservices.measurement.DeletionRequest l(DeletionRequest deletionRequest0) {
            android.adservices.measurement.DeletionRequest deletionRequest1 = androidx.privacysandbox.ads.adservices.measurement.b.a(androidx.privacysandbox.ads.adservices.measurement.a.a(v.a().setDeletionMode(deletionRequest0.a()).setMatchBehavior(deletionRequest0.d()), deletionRequest0.f()), deletionRequest0.c()).setDomainUris(deletionRequest0.b()).setOriginUris(deletionRequest0.e()).build();
            L.o(deletionRequest1, "Builder()\n              …\n                .build()");
            return deletionRequest1;
        }

        private final List m(List list0) {
            List list1 = new ArrayList();
            for(Object object0: list0) {
                WebSourceParams webSourceParams0 = t.a(((androidx.privacysandbox.ads.adservices.measurement.WebSourceParams)object0).b()).setDebugKeyAllowed(((androidx.privacysandbox.ads.adservices.measurement.WebSourceParams)object0).a()).build();
                L.o(webSourceParams0, "Builder(param.registrati…                 .build()");
                list1.add(webSourceParams0);
            }
            return list1;
        }

        private final android.adservices.measurement.WebSourceRegistrationRequest n(WebSourceRegistrationRequest webSourceRegistrationRequest0) {
            android.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequest1 = x.a(this.m(webSourceRegistrationRequest0.f()), webSourceRegistrationRequest0.c()).setWebDestination(webSourceRegistrationRequest0.e()).setAppDestination(webSourceRegistrationRequest0.a()).setInputEvent(webSourceRegistrationRequest0.b()).setVerifiedDestination(webSourceRegistrationRequest0.d()).build();
            L.o(webSourceRegistrationRequest1, "Builder(\n               …\n                .build()");
            return webSourceRegistrationRequest1;
        }

        private final List o(List list0) {
            List list1 = new ArrayList();
            for(Object object0: list0) {
                WebTriggerParams webTriggerParams0 = r.a(((androidx.privacysandbox.ads.adservices.measurement.WebTriggerParams)object0).b()).setDebugKeyAllowed(((androidx.privacysandbox.ads.adservices.measurement.WebTriggerParams)object0).a()).build();
                L.o(webTriggerParams0, "Builder(param.registrati…                 .build()");
                list1.add(webTriggerParams0);
            }
            return list1;
        }

        private final android.adservices.measurement.WebTriggerRegistrationRequest p(WebTriggerRegistrationRequest webTriggerRegistrationRequest0) {
            android.adservices.measurement.WebTriggerRegistrationRequest webTriggerRegistrationRequest1 = z.a(this.o(webTriggerRegistrationRequest0.b()), webTriggerRegistrationRequest0.a()).build();
            L.o(webTriggerRegistrationRequest1, "Builder(\n               …\n                .build()");
            return webTriggerRegistrationRequest1;
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
        public final MeasurementManager a(@l Context context0) {
            L.p(context0, "context");
            Log.d("MeasurementManager", "AdServicesInfo.version=" + AdServicesInfo.a.a());
            return AdServicesInfo.a.a() >= 5 ? new Api33Ext5Impl(context0) : null;
        }
    }

    @l
    public static final Companion a = null;
    public static final int b = 0;
    public static final int c = 1;

    static {
        MeasurementManager.a = new Companion(null);
    }

    @m
    public abstract Object a(@l DeletionRequest arg1, @l d arg2);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @m
    public abstract Object b(@l d arg1);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @m
    @n
    public static final MeasurementManager c(@l Context context0) {
        return MeasurementManager.a.a(context0);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @m
    public abstract Object d(@l Uri arg1, @m InputEvent arg2, @l d arg3);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @m
    public abstract Object e(@l Uri arg1, @l d arg2);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @m
    public abstract Object f(@l WebSourceRegistrationRequest arg1, @l d arg2);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @m
    public abstract Object g(@l WebTriggerRegistrationRequest arg1, @l d arg2);
}

