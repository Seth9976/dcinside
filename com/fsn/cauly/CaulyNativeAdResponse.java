package com.fsn.cauly;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class CaulyNativeAdResponse {
    public class CaulyNativeAd {
        String a;
        final CaulyNativeAdResponse b;

    }

    String a;

    public CaulyNativeAdResponse(String s) {
        this.a = s;
        this.a();
    }

    private void a() {
        try {
            JSONObject jSONObject0 = new JSONObject(this.a);
            jSONObject0.getString("retmsg");
            jSONObject0.getInt("retcode");
            JSONArray jSONArray0 = new JSONArray(jSONObject0.getString("list"));
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                CaulyNativeAd caulyNativeAdResponse$CaulyNativeAd0 = new CaulyNativeAd(this);
                caulyNativeAdResponse$CaulyNativeAd0.a = jSONArray0.getJSONObject(v).getString("ad_type");
                arrayList0.add(caulyNativeAdResponse$CaulyNativeAd0);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public String getResponseString() {
        return this.a;
    }
}

