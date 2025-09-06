package com.unity3d.ads.core.extensions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import org.json.JSONArray;
import y4.l;

@s0({"SMAP\nJSONArrayExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONArrayExtensions.kt\ncom/unity3d/ads/core/extensions/JSONArrayExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n37#3,2:25\n*S KotlinDebug\n*F\n+ 1 JSONArrayExtensions.kt\ncom/unity3d/ads/core/extensions/JSONArrayExtensionsKt\n*L\n5#1:21\n5#1:22,3\n5#1:25,2\n*E\n"})
public final class JSONArrayExtensionsKt {
    @l
    public static final Map getHeadersMap(@l JSONArray jSONArray0) {
        L.p(jSONArray0, "<this>");
        Map map0 = new LinkedHashMap();
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = jSONArray0.get(v1);
            L.n(object0, "null cannot be cast to non-null type org.json.JSONArray");
            List list0 = (List)map0.get(((JSONArray)object0).getString(0));
            if(list0 == null) {
                list0 = new ArrayList();
            }
            String s = ((JSONArray)object0).getString(1);
            L.o(s, "header.getString(1)");
            list0.add(s);
            String s1 = ((JSONArray)object0).getString(0);
            L.o(s1, "header.getString(0)");
            map0.put(s1, list0);
        }
        return map0;
    }

    @l
    public static final Object[] toTypedArray(@l JSONArray jSONArray0) {
        L.p(jSONArray0, "<this>");
        kotlin.ranges.l l0 = s.W1(0, jSONArray0.length());
        ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            arrayList0.add(jSONArray0.get(((T)iterator0).b()));
        }
        return arrayList0.toArray(new Object[0]);
    }
}

