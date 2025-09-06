package com.google.android.gms.internal.ads;

import j..util.function.Function.-CC;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdkx implements Function {
    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        for(int v = 0; v < ((JSONArray)object0).length(); ++v) {
            JSONObject jSONObject0 = ((JSONArray)object0).optJSONObject(v);
            if(jSONObject0.optString("key").equals("afma_video_player_type")) {
                return jSONObject0.optString("value");
            }
        }
        return null;
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

