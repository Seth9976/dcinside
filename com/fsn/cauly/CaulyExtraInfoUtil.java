package com.fsn.cauly;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class CaulyExtraInfoUtil {
    public static final int CAULY_EARNTYPE_CPC = 2;
    public static final int CAULY_EARNTYPE_CPI = 4;
    public static final int CAULY_EARNTYPE_CPM = 1;
    public static final int CAULY_EARNTYPE_CPVC = 3;
    public static final int CAULY_EARNTYPE_DEFAULT;
    static CaulyExtraInfoUtil a;
    static String b;

    static {
    }

    private Object a(String s, String s1, Object object0) {
        if(!TextUtils.isEmpty(s)) {
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                if(jSONObject0.has(s1)) {
                    String s2 = jSONObject0.getString(s1);
                    if(!TextUtils.isEmpty(s2) && !s2.equalsIgnoreCase("null")) {
                        return s2;
                    }
                }
                return object0;
            }
            catch(JSONException unused_ex) {
            }
        }
        return object0;
    }

    public int getEarnType() {
        try {
            return TextUtils.isEmpty(CaulyExtraInfoUtil.b) ? 0 : Integer.parseInt(((String)this.a(CaulyExtraInfoUtil.b, "earntype", "0")));
        }
        catch(Exception unused_ex) {
        }
        return 0;
    }

    public static CaulyExtraInfoUtil getInstance(String s) {
        if(CaulyExtraInfoUtil.a == null) {
            CaulyExtraInfoUtil.a = new CaulyExtraInfoUtil();
        }
        CaulyExtraInfoUtil.b = s;
        return CaulyExtraInfoUtil.a;
    }

    public float getPrice() {
        try {
            return TextUtils.isEmpty(CaulyExtraInfoUtil.b) ? 999999.0f : Float.parseFloat(((String)this.a(CaulyExtraInfoUtil.b, "price", 999999.0f)));
        }
        catch(Exception unused_ex) {
        }
        return 999999.0f;
    }

    public boolean isAvailable() {
        if(!TextUtils.isEmpty(CaulyExtraInfoUtil.b)) {
            try {
                JSONObject jSONObject0 = new JSONObject(CaulyExtraInfoUtil.b);
                if(jSONObject0.has("price") && jSONObject0.has("earntype")) {
                    return true;
                }
            }
            catch(JSONException unused_ex) {
            }
        }
        return false;
    }
}

