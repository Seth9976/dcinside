package com.unity3d.ads.core.extensions;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.m;
import kotlin.sequences.p;
import org.json.JSONObject;
import y4.l;

@s0({"SMAP\nJSONObjectExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONObjectExtensions.kt\ncom/unity3d/ads/core/extensions/JSONObjectExtensionsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n759#2,2:14\n775#2,2:16\n778#2:19\n1#3:18\n*S KotlinDebug\n*F\n+ 1 JSONObjectExtensions.kt\ncom/unity3d/ads/core/extensions/JSONObjectExtensionsKt\n*L\n11#1:14,2\n11#1:16,2\n11#1:19\n*E\n"})
public final class JSONObjectExtensionsKt {
    @l
    public static final Map toBuiltInMap(@l JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        Iterator iterator0 = jSONObject0.keys();
        L.o(iterator0, "keys()");
        m m0 = p.e(iterator0);
        Map map0 = new LinkedHashMap();
        for(Object object0: m0) {
            Object object1 = jSONObject0.opt(((String)object0));
            if(object1 == null) {
                object1 = null;
            }
            else {
                L.o(object1, "opt(value)");
                if(L.g(String.valueOf(object1), "undefined") || L.g(String.valueOf(object1), "null")) {
                    object1 = null;
                }
            }
            map0.put(object0, object1);
        }
        return map0;
    }
}

