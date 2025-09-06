package com.bytedance.sdk.component.cz.PjT.Zh.Zh;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.cr.PjT;
import com.bytedance.sdk.component.cz.PjT.cr;
import com.bytedance.sdk.component.cz.PjT.cz;
import java.util.ArrayList;
import java.util.List;

public class Zh {
    public static cz PjT;

    public static cz PjT(Context context0) {
        try {
            if(Zh.PjT == null) {
                Zh.PjT = Au.XX().xE().qj();
            }
        }
        catch(Exception unused_ex) {
        }
        return Zh.PjT;
    }

    public static void PjT() {
        if(Au.XX().cz() == null) {
            return;
        }
        try {
            cz cz0 = Zh.PjT(Au.XX().cz());
            if(cz0 != null) {
                cz0.PjT(Uri.parse("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/adLogStart"));
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(PjT pjT0) {
        if(pjT0 == null) {
            return;
        }
        try {
            cz cz0 = Zh.PjT(Au.XX().cz());
            if(cz0 != null) {
                cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/adLogDispatch?event=" + com.bytedance.sdk.component.cz.PjT.PjT.PjT.cz.PjT(pjT0.cz()))));
            }
        }
        catch(Throwable throwable0) {
            throwable0.toString();
        }
    }

    public static void PjT(String s, List list0, boolean z, int v, String s1) {
        if(list0 != null && !list0.isEmpty()) {
            try {
                StringBuilder stringBuilder0 = new StringBuilder();
                for(Object object0: list0) {
                    stringBuilder0.append(com.bytedance.sdk.component.cz.PjT.PjT.PjT.cz.PjT(((String)object0)));
                    stringBuilder0.append(",");
                }
                String s2 = "?did=" + s + "&track=" + com.bytedance.sdk.component.cz.PjT.PjT.PjT.cz.PjT(stringBuilder0.toString()) + "&replace=" + z + "&urlType=" + v + "&adId=" + s1;
                cz cz0 = Zh.PjT(Au.XX().cz());
                if(cz0 != null) {
                    cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/trackAdUrl" + s2)));
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void PjT(String s, boolean z) {
        if(Au.XX().xE().cz() == 0 && TextUtils.isEmpty(s)) {
            return;
        }
        try {
            cz cz0 = Zh.PjT(Au.XX().cz());
            if(cz0 != null) {
                cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/trackAdFailed?did=" + s + "&triggerOnInit=" + z)));
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public int PjT(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) [...] // Inlined contents

    public int PjT(Uri uri0, String s, String[] arr_s) [...] // Inlined contents

    public Cursor PjT(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) [...] // Inlined contents

    public Uri PjT(Uri uri0, ContentValues contentValues0) [...] // Inlined contents

    public String PjT(Uri uri0) {
        int v2;
        String s = uri0.getPath().split("/")[2];
        s.hashCode();
        int v = 0;
        switch(s) {
            case "adLogDispatch": {
                String s2 = uri0.getQueryParameter("event");
                if(!TextUtils.isEmpty(s2)) {
                    PjT pjT0 = com.bytedance.sdk.component.cz.PjT.cr.PjT.PjT.ReZ(com.bytedance.sdk.component.cz.PjT.PjT.PjT.cz.Zh(s2));
                    if(pjT0 != null) {
                        cr.PjT.PjT(pjT0);
                        return null;
                    }
                }
                return null;
            }
            case "adLogStart": {
                Au.XX().SM();
                return null;
            }
            case "adLogStop": {
                Au.XX().qj();
                return null;
            }
            case "trackAdFailed": {
                String s1 = uri0.getQueryParameter("did");
                boolean z = uri0.getBooleanQueryParameter("triggerOnInit", false);
                com.bytedance.sdk.component.cz.PjT.cz.PjT.PjT().PjT(s1, z);
                return null;
            }
            case "trackAdUrl": {
                try {
                    String s3 = uri0.getQueryParameter("did");
                    boolean z1 = Boolean.valueOf(uri0.getQueryParameter("replace")).booleanValue();
                    String s4 = uri0.getQueryParameter("track");
                    String s5 = uri0.getQueryParameter("urlType");
                    String s6 = uri0.getQueryParameter("adId");
                    String[] arr_s = com.bytedance.sdk.component.cz.PjT.PjT.PjT.cz.Zh(s4).split(",");
                    if(arr_s.length > 0) {
                        ArrayList arrayList0 = new ArrayList();
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            String s7 = com.bytedance.sdk.component.cz.PjT.PjT.PjT.cz.Zh(arr_s[v1]);
                            if(!TextUtils.isEmpty(s7)) {
                                arrayList0.add(s7);
                            }
                        }
                        try {
                            if(!TextUtils.isEmpty(s5)) {
                                v = Integer.parseInt(s5);
                            }
                            v2 = v;
                        }
                        catch(Exception unused_ex) {
                            v2 = 0;
                        }
                        com.bytedance.sdk.component.cz.PjT.cz.PjT.PjT().PjT(s3, arrayList0, z1, null, v2, s6);
                        return null;
                    }
                }
                catch(Throwable unused_ex) {
                }
                return null;
            }
            default: {
                return null;
            }
        }
    }

    public String ReZ() [...] // Inlined contents

    public static void Zh() {
        if(Au.XX().cz() == null) {
            return;
        }
        try {
            cz cz0 = Zh.PjT(Au.XX().cz());
            if(cz0 != null) {
                cz0.PjT(Uri.parse("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/adLogStop"));
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    private static String cr() [...] // 潜在的解密器
}

