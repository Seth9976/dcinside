package com.unity3d.services.core.network.mapper;

import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.json.JSONArray;
import y4.l;
import y4.m;

@s0({"SMAP\nHttpResponseHeaderToJSONArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpResponseHeaderToJSONArray.kt\ncom/unity3d/services/core/network/mapper/HttpResponseHeaderToJSONArrayKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,7:1\n1789#2,3:8\n*S KotlinDebug\n*F\n+ 1 HttpResponseHeaderToJSONArray.kt\ncom/unity3d/services/core/network/mapper/HttpResponseHeaderToJSONArrayKt\n*L\n5#1:8,3\n*E\n"})
public final class HttpResponseHeaderToJSONArrayKt {
    @l
    public static final JSONArray toResponseHeadersMap(@m Map map0) {
        if(map0 != null) {
            Set set0 = map0.entrySet();
            if(set0 != null) {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: set0) {
                    jSONArray0 = jSONArray0.put(new JSONArray(u.O(new Object[]{((String)((Map.Entry)object0).getKey()), ((List)((Map.Entry)object0).getValue())})));
                    L.o(jSONArray0, "acc.put(JSONArray(listOf(key, value)))");
                }
                return jSONArray0 == null ? new JSONArray() : jSONArray0;
            }
        }
        return new JSONArray();
    }
}

