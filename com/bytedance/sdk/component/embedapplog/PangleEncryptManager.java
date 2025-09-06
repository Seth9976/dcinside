package com.bytedance.sdk.component.embedapplog;

import android.util.Pair;
import org.json.JSONObject;

public class PangleEncryptManager {
    public static final int CYPHER_VERSION_V4 = 4;
    public static final String KEY_CYPHER = "cypher";

    public static Pair decryptType4(String s) {
        return PangleEncryptUtilsType4.decrypt(s);
    }

    public static byte[] decryptV3(byte[] arr_b, int v) {
        return arr_b == null || arr_b.length == 0 ? null : PangleEncryptUtils.decrypt(arr_b, arr_b.length);
    }

    public static JSONObject encryptType4(JSONObject jSONObject0, IDefaultEncrypt iDefaultEncrypt0) {
        return PangleEncryptUtilsType4.encrypt(jSONObject0, iDefaultEncrypt0);
    }

    public static JSONObject encryptType4WithNoWrapBase64(JSONObject jSONObject0, IDefaultEncrypt iDefaultEncrypt0) {
        return PangleEncryptUtilsType4.encryptType4WithNoWrapBase64(jSONObject0, iDefaultEncrypt0);
    }

    public static Pair encryptType4WithoutBase64(byte[] arr_b) {
        return PangleEncryptUtilsType4.encryptWithoutBase64(arr_b);
    }

    public static byte[] encryptV3(byte[] arr_b) {
        return arr_b == null || arr_b.length == 0 ? null : PangleEncryptUtils.encrypt(arr_b, arr_b.length);
    }
}

