package K;

import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;
import y4.l;

public final class a {
    public static final void a(@l JSONObject jSONObject0) {
        L.p(jSONObject0, "jsonObject");
        if(jSONObject0.has("items")) {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("items");
            int v = jSONArray0.length();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                    L.o(jSONObject1, "items.getJSONObject(i)");
                    a.a(jSONObject1);
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
        }
        if(jSONObject0.has("type") && L.g(jSONObject0.getString("type"), "H_SCROLLABLE_STACK")) {
            jSONObject0.put("type", "H_STACK");
        }
        if(jSONObject0.has("childItemProperty")) {
            jSONObject0.put("items", new JSONArray('[' + jSONObject0.getJSONObject("childItemProperty") + ']'));
        }
    }
}

