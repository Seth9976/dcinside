package com.bytedance.sdk.component.embedapplog;

import android.util.Log;
import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONObject;

class PangleEncryptUtilsType4 {
    static Pair decrypt(String s) {
        try {
            Pair pair0 = PglCryptUtils.getInstance().cypher4Decrypt(s);
            return new Pair(PangleEncryptUtilsType4.getCryptFailedReason(((int)(((Integer)pair0.first)))), pair0.second);
        }
        catch(Throwable throwable0) {
            Log.e("pangle-encrypt", "decrypt exception " + throwable0.getMessage());
            return new Pair(2, null);
        }
    }

    static JSONObject encrypt(JSONObject jSONObject0, IDefaultEncrypt iDefaultEncrypt0) {
        Pair pair0;
        try {
            pair0 = PglCryptUtils.getInstance().cypher4Encrypt(jSONObject0);
        }
        catch(Throwable throwable0) {
            Log.e("pangle-encrypt", "encrypt exception " + throwable0.getMessage());
            pair0 = null;
        }
        if(pair0 != null && ((int)(((Integer)pair0.first))) == 0) {
            Object object0 = pair0.second;
            if(object0 != null) {
                return (JSONObject)object0;
            }
        }
        if(iDefaultEncrypt0 != null) {
            int v = pair0 == null ? 0 : PangleEncryptUtilsType4.getCryptFailedReason(((int)(((Integer)pair0.first))));
            try {
                return iDefaultEncrypt0.encrypt(jSONObject0, v);
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    static JSONObject encryptType4WithNoWrapBase64(JSONObject jSONObject0, IDefaultEncrypt iDefaultEncrypt0) {
        JSONObject jSONObject2;
        Pair pair0;
        JSONObject jSONObject1 = null;
        if(jSONObject0 == null) {
            pair0 = null;
        }
        else {
            try {
                pair0 = PglCryptUtils.getInstance().cypher4EncryptWithNoWrapBase64(jSONObject0.toString());
            }
            catch(Throwable throwable0) {
                Log.e("pangle-encrypt", "encrypt exception " + throwable0.getMessage());
                pair0 = null;
            }
        }
        if(pair0 != null && ((int)(((Integer)pair0.first))) == 0 && pair0.second != null) {
            try {
                jSONObject2 = new JSONObject();
            }
            catch(Throwable throwable1) {
                Log.e("pangle-encrypt", "encrypt json exception " + throwable1.getMessage());
                return jSONObject1;
            }
            try {
                jSONObject2.put("message", pair0.second);
                jSONObject2.put("cypher", 4);
                return jSONObject2;
            }
            catch(Throwable throwable1) {
                jSONObject1 = jSONObject2;
            }
            Log.e("pangle-encrypt", "encrypt json exception " + throwable1.getMessage());
            return jSONObject1;
        }
        if(iDefaultEncrypt0 != null) {
            int v = pair0 == null ? 0 : PangleEncryptUtilsType4.getCryptFailedReason(((int)(((Integer)pair0.first))));
            try {
                return iDefaultEncrypt0.encrypt(jSONObject0, v);
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    static Pair encryptWithoutBase64(byte[] arr_b) {
        Pair pair0;
        try {
            if(arr_b == null) {
                return null;
            }
            pair0 = PglCryptUtils.getInstance().cypher4Encrypt(arr_b);
        }
        catch(Throwable throwable0) {
            Log.e("pangle-encrypt", "encrypt exception " + throwable0.getMessage());
            pair0 = null;
        }
        int v = 0;
        if(pair0 != null && ((int)(((Integer)pair0.first))) == 0) {
            Object object0 = pair0.second;
            if(object0 != null && ((byte[])object0).length > 0) {
                return new Pair(0, ((byte[])object0));
            }
        }
        if(pair0 != null) {
            v = PangleEncryptUtilsType4.getCryptFailedReason(((int)(((Integer)pair0.first))));
        }
        return new Pair(v, null);
    }

    private static int getCryptFailedReason(int v) {
        switch(v) {
            case 501: {
                return 6;
            }
            case 502: {
                return 4;
            }
            case 503: {
                return 1;
            }
            case 504: {
                return 3;
            }
            case 505: 
            case 506: {
                return 2;
            }
            default: {
                return 0;
            }
        }
    }
}

