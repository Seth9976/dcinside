package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

public class ReZ {
    private static HashMap PjT;

    static {
        ReZ.PjT = new HashMap();
    }

    public static String PjT(Context context0) [...] // 潜在的解密器

    private static String PjT(Signature signature0, String s) {
        byte[] arr_b = signature0.toByteArray();
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance(s);
            if(messageDigest0 != null) {
                byte[] arr_b1 = messageDigest0.digest(arr_b);
                StringBuilder stringBuilder0 = new StringBuilder();
                for(int v = 0; v < arr_b1.length; ++v) {
                    stringBuilder0.append(Integer.toHexString(arr_b1[v] & 0xFF | 0x100).substring(1, 3).toUpperCase());
                    stringBuilder0.append(":");
                }
                return stringBuilder0.substring(0, stringBuilder0.length() - 1).toString();
            }
        }
        catch(Exception unused_ex) {
        }
        return "error!";
    }

    public static ArrayList PjT(Context context0, String s) {
        ArrayList arrayList0 = null;
        if(context0 != null && s != null) {
            if(ReZ.PjT.get(s) != null) {
                return (ArrayList)ReZ.PjT.get(s);
            }
            arrayList0 = new ArrayList();
            try {
                Signature[] arr_signature = ReZ.Zh(context0, "com.dcinside.app.android");
                for(int v = 0; v < arr_signature.length; ++v) {
                    Signature signature0 = arr_signature[v];
                    String s1 = "error!";
                    if("MD5".equals(s)) {
                        s1 = ReZ.PjT(signature0, "MD5");
                    }
                    else if("SHA1".equals(s)) {
                        s1 = ReZ.PjT(signature0, "SHA1");
                    }
                    else if("SHA256".equals(s)) {
                        s1 = ReZ.PjT(signature0, "SHA256");
                    }
                    arrayList0.add(s1);
                }
            }
            catch(Exception unused_ex) {
            }
            ReZ.PjT.put(s, arrayList0);
        }
        return arrayList0;
    }

    private static Signature[] Zh(Context context0, String s) {
        try {
            return context0.getPackageManager().getPackageInfo(s, 0x40).signatures;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

