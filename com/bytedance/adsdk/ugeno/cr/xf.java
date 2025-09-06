package com.bytedance.adsdk.ugeno.cr;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ReZ.Zh;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

public class xf {
    public static PjT PjT(String s, JSONObject jSONObject0) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        PjT cz$PjT0 = new PjT();
        Uri uri0 = Uri.parse(s);
        if(uri0 == null) {
            return null;
        }
        cz$PjT0.ReZ(s);
        if(!TextUtils.isEmpty(uri0.getScheme())) {
            cz$PjT0.PjT(uri0.getScheme());
        }
        String s1 = uri0.getAuthority();
        if(TextUtils.isEmpty(s1)) {
            s1 = uri0.getPath();
        }
        cz$PjT0.Zh(s1);
        cz$PjT0.cr("global://" + cz$PjT0.Zh());
        HashMap hashMap0 = new HashMap();
        Set set0 = uri0.getQueryParameterNames();
        if(set0 != null && set0.size() > 0) {
            for(Object object0: set0) {
                hashMap0.put(((String)object0), Zh.PjT(uri0.getQueryParameter(((String)object0)), jSONObject0));
            }
        }
        cz$PjT0.PjT(hashMap0);
        return cz$PjT0;
    }
}

