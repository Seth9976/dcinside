package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.i;
import com.google.firebase.crashlytics.internal.metadata.o;
import com.google.firebase.remoteconfig.interop.rollouts.d;
import com.google.firebase.remoteconfig.interop.rollouts.f;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nCrashlyticsRemoteConfigListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashlyticsRemoteConfigListener.kt\ncom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1549#2:41\n1620#2,3:42\n*S KotlinDebug\n*F\n+ 1 CrashlyticsRemoteConfigListener.kt\ncom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener\n*L\n27#1:41\n27#1:42,3\n*E\n"})
public final class e implements f {
    @l
    private final o a;

    public e(@l o o0) {
        L.p(o0, "userMetadata");
        super();
        this.a = o0;
    }

    @Override  // com.google.firebase.remoteconfig.interop.rollouts.f
    public void a(@l com.google.firebase.remoteconfig.interop.rollouts.e e0) {
        L.p(e0, "rolloutsState");
        o o0 = this.a;
        Set set0 = e0.b();
        L.o(set0, "rolloutsState.rolloutAssignments");
        ArrayList arrayList0 = new ArrayList(u.b0(set0, 10));
        for(Object object0: set0) {
            arrayList0.add(i.b(((d)object0).f(), ((d)object0).d(), ((d)object0).e(), ((d)object0).h(), ((d)object0).g()));
        }
        o0.u(arrayList0);
        g.f().b("Updated Crashlytics Rollout State");
    }
}

