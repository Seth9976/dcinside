package com.bytedance.sdk.openadsdk.multipro.ReZ;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.cz.PjT.cz;
import com.bytedance.sdk.openadsdk.core.ub;

public class PjT implements com.bytedance.sdk.openadsdk.multipro.PjT {
    // 去混淆评级： 低(20)
    private static String JQp() [...] // 潜在的解密器

    public static boolean PjT(String s) {
        if(ub.PjT() == null) {
            return false;
        }
        try {
            cz cz0 = PjT.cr();
            return cz0 == null ? false : "true".equals(cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_frequent/checkFrequency?rit=" + s))));
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(@NonNull Uri uri0, @Nullable ContentValues contentValues0, @Nullable String s, @Nullable String[] arr_s) {
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(@NonNull Uri uri0, @Nullable String s, @Nullable String[] arr_s) {
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Cursor PjT(@NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Uri PjT(@NonNull Uri uri0, @Nullable ContentValues contentValues0) {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    @NonNull
    public String PjT() {
        return "t_frequent";
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public String PjT(@NonNull Uri uri0) {
        String s = uri0.getPath().split("/")[2];
        if("checkFrequency".equals(s)) {
            String s1 = uri0.getQueryParameter("rit");
            return com.bytedance.sdk.openadsdk.core.XX.PjT.PjT().PjT(s1) ? "true" : "false";
        }
        if("isSilent".equals(s)) {
            return com.bytedance.sdk.openadsdk.core.XX.PjT.PjT().Zh() ? "true" : "false";
        }
        return "maxRit".equals(s) ? com.bytedance.sdk.openadsdk.core.XX.PjT.PjT().ReZ() : null;
    }

    public static String ReZ() {
        if(ub.PjT() == null) {
            return null;
        }
        try {
            cz cz0 = PjT.cr();
            return cz0 == null ? null : cz0.PjT(Uri.parse("content://com.bytedance.openadsdk.TTMultiProvider/t_frequent/maxRit"));
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static boolean Zh() {
        if(ub.PjT() == null) {
            return false;
        }
        try {
            cz cz0 = PjT.cr();
            return cz0 == null ? false : "true".equals(cz0.PjT(Uri.parse("content://com.bytedance.openadsdk.TTMultiProvider/t_frequent/isSilent")));
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static cz cr() {
        try {
            return ub.PjT() == null ? null : com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT());
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }
}

