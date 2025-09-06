package com.bytedance.sdk.component.cz.PjT.Zh.Zh;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.PjT.PjT.cz;
import java.util.List;

public class PjT {
    public static void PjT() {
        if(Au.XX().cz() == null) {
            return;
        }
        try {
            ContentResolver contentResolver0 = PjT.ReZ();
            if(contentResolver0 != null) {
                contentResolver0.getType(Uri.parse("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/adLogStart"));
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        if(pjT0 == null) {
            return;
        }
        try {
            ContentResolver contentResolver0 = PjT.ReZ();
            if(contentResolver0 != null) {
                contentResolver0.getType(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/adLogDispatch?event=" + cz.PjT(pjT0.cz()))));
            }
        }
        catch(Throwable throwable0) {
            throwable0.toString();
        }
    }

    public static void PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            ContentResolver contentResolver0 = PjT.ReZ();
            if(contentResolver0 != null) {
                contentResolver0.getType(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/trackAdFailed?did=" + s)));
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(String s, List list0, boolean z) {
        if(!TextUtils.isEmpty(s) && list0 != null && !list0.isEmpty()) {
            try {
                StringBuilder stringBuilder0 = new StringBuilder();
                for(Object object0: list0) {
                    stringBuilder0.append(cz.PjT(((String)object0)));
                    stringBuilder0.append(",");
                }
                String s1 = "?did=" + s + "&track=" + cz.PjT(stringBuilder0.toString()) + "&replace=" + z;
                ContentResolver contentResolver0 = PjT.ReZ();
                if(contentResolver0 != null) {
                    contentResolver0.getType(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/trackAdUrl" + s1)));
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private static ContentResolver ReZ() {
        try {
            return Au.XX().cz() == null ? null : Au.XX().cz().getContentResolver();
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static void Zh() {
        if(Au.XX().cz() == null) {
            return;
        }
        try {
            ContentResolver contentResolver0 = PjT.ReZ();
            if(contentResolver0 != null) {
                contentResolver0.getType(Uri.parse("content://com.bytedance.openadsdk.TTMultiProvider/ad_log_event/adLogStop"));
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    private static String cr() [...] // 潜在的解密器
}

