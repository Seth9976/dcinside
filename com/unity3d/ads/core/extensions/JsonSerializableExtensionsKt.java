package com.unity3d.ads.core.extensions;

import com.unity3d.services.store.JsonSerializable;
import java.util.List;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import y4.l;

public final class JsonSerializableExtensionsKt {
    @l
    public static final JSONArray toJsonArray(@l List list0) {
        L.p(list0, "<this>");
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: list0) {
            jSONArray0.put(((JsonSerializable)object0).toJson());
        }
        return jSONArray0;
    }
}

