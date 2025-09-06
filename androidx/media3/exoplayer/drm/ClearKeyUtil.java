package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ClearKeyUtil {
    private static final String a = "ClearKeyUtil";

    public static byte[] a(byte[] arr_b) {
        return Util.a < 27 ? Util.O0(ClearKeyUtil.c(Util.T(arr_b))) : arr_b;
    }

    public static byte[] b(byte[] arr_b) {
        if(Util.a >= 27) {
            return arr_b;
        }
        try {
            JSONObject jSONObject0 = new JSONObject(Util.T(arr_b));
            StringBuilder stringBuilder0 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray0 = jSONObject0.getJSONArray("keys");
            for(int v = 0; v < jSONArray0.length(); ++v) {
                if(v != 0) {
                    stringBuilder0.append(",");
                }
                JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                stringBuilder0.append("{\"k\":\"");
                stringBuilder0.append(ClearKeyUtil.d(jSONObject1.getString("k")));
                stringBuilder0.append("\",\"kid\":\"");
                stringBuilder0.append(ClearKeyUtil.d(jSONObject1.getString("kid")));
                stringBuilder0.append("\",\"kty\":\"");
                stringBuilder0.append(jSONObject1.getString("kty"));
                stringBuilder0.append("\"}");
            }
            stringBuilder0.append("]}");
            return Util.O0(stringBuilder0.toString());
        }
        catch(JSONException jSONException0) {
        }
        Log.e("ClearKeyUtil", "Failed to adjust response data: " + Util.T(arr_b), jSONException0);
        return arr_b;
    }

    private static String c(String s) {
        return s.replace('+', '-').replace('/', '_');
    }

    private static String d(String s) {
        return s.replace('-', '+').replace('_', '/');
    }
}

