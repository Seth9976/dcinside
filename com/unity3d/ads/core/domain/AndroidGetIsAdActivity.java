package com.unity3d.ads.core.domain;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nAndroidGetIsAdActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetIsAdActivity.kt\ncom/unity3d/ads/core/domain/AndroidGetIsAdActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n11335#2:23\n11670#2,3:24\n*S KotlinDebug\n*F\n+ 1 AndroidGetIsAdActivity.kt\ncom/unity3d/ads/core/domain/AndroidGetIsAdActivity\n*L\n20#1:23\n20#1:24,3\n*E\n"})
public final class AndroidGetIsAdActivity {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion;
    @l
    private static final Set knownAdActivities;

    static {
        AndroidGetIsAdActivity.Companion = new Companion(null);
        AdActivity[] arr_adActivity = AdActivity.values();
        ArrayList arrayList0 = new ArrayList(arr_adActivity.length);
        for(int v = 0; v < arr_adActivity.length; ++v) {
            arrayList0.add(arr_adActivity[v].getActivityName());
        }
        AndroidGetIsAdActivity.knownAdActivities = u.a6(arrayList0);
    }

    public final boolean invoke(@l String s) {
        L.p(s, "activityName");
        return AndroidGetIsAdActivity.knownAdActivities.contains(s);
    }
}

