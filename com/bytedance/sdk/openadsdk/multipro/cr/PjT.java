package com.bytedance.sdk.openadsdk.multipro.cr;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.cz;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.ub;
import java.util.HashSet;
import jeb.synthetic.FIN;

public class PjT {
    public static HashSet PjT;

    static {
        PjT.PjT = new HashSet() {
            {
                this.add("app_id");
                this.add("tt_gdpr");
                this.add("keywords");
                this.add("extra_data");
                this.add("sdk_app_sha1");
                this.add("uuid");
                this.add("android_system_ua");
                this.add("sdk_local_web_ua");
                this.add("sdk_local_rom_info");
            }
        };
    }

    protected static float PjT(Context context0, String s, String s1, float f) {
        String s2 = PjT.PjT(s, s1);
        if(SM.XX(s2)) {
            return com.bytedance.sdk.component.PjT.PjT(context0, s2).PjT(s1, f);
        }
        SharedPreferences sharedPreferences0 = Zh.PjT(context0, s2);
        return sharedPreferences0 == null ? f : sharedPreferences0.getFloat(s1, f);
    }

    protected static int PjT(Context context0, String s, String s1, int v) {
        String s2 = PjT.PjT(s, s1);
        if(SM.XX(s2)) {
            return com.bytedance.sdk.component.PjT.PjT(context0, s2).PjT(s1, v);
        }
        SharedPreferences sharedPreferences0 = Zh.PjT(context0, s2);
        return sharedPreferences0 == null ? v : sharedPreferences0.getInt(s1, v);
    }

    public static int PjT(String s, String s1, int v) {
        if(!PjT.PjT()) {
            return v;
        }
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                return PjT.PjT(PjT.ReZ(), s, s1, v);
            }
            cz cz0 = PjT.Zh();
            if(cz0 != null) {
                String s2 = cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_sp/int/" + s1 + PjT.Zh(s))));
                return s2 == null || s2.equals("null") ? v : Integer.parseInt(s2);
            }
        }
        catch(Throwable unused_ex) {
        }
        return v;
    }

    protected static long PjT(Context context0, String s, String s1, long v) {
        String s2 = PjT.PjT(s, s1);
        if(SM.XX(s2)) {
            return com.bytedance.sdk.component.PjT.PjT(context0, s2).PjT(s1, v);
        }
        SharedPreferences sharedPreferences0 = Zh.PjT(context0, s2);
        return sharedPreferences0 == null ? v : sharedPreferences0.getLong(s1, v);
    }

    public static long PjT(String s, String s1, long v) {
        if(!PjT.PjT()) {
            return v;
        }
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                return PjT.PjT(PjT.ReZ(), s, s1, v);
            }
            cz cz0 = PjT.Zh();
            if(cz0 != null) {
                String s2 = cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_sp/long/" + s1 + PjT.Zh(s))));
                return s2 == null || s2.equals("null") ? v : Long.parseLong(s2);
            }
        }
        catch(Throwable unused_ex) {
        }
        return v;
    }

    protected static String PjT(Context context0, String s, String s1, String s2) {
        String s3 = PjT.PjT(s, s1);
        if(SM.XX(s3)) {
            return com.bytedance.sdk.component.PjT.PjT(context0, s3).PjT(s1, s2);
        }
        SharedPreferences sharedPreferences0 = Zh.PjT(context0, s3);
        return sharedPreferences0 == null ? s2 : sharedPreferences0.getString(s1, s2);
    }

    // 去混淆评级： 低(20)
    public static String PjT(String s, String s1) {
        return PjT.PjT.contains(s1) ? "pag_sp_bad_par" : s;
    }

    public static void PjT(String s) {
        if(!PjT.PjT()) {
            return;
        }
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                Zh.Zh(PjT.ReZ(), s);
                return;
            }
            cz cz0 = PjT.Zh();
            if(cz0 != null) {
                cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_sp/clean" + PjT.Zh(s))), null, null);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(String s, String s1, Boolean boolean0) {
        Class class0 = PjT.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(!PjT.PjT()) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(class0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                Zh.PjT(PjT.ReZ(), s, s1, boolean0);
                FIN.finallyExec$NT(v);
                return;
            }
            cz cz0 = PjT.Zh();
            if(cz0 != null) {
                Uri uri0 = Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_sp/boolean/" + s1 + PjT.Zh(s)));
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("value", boolean0);
                cz0.PjT(uri0, contentValues0, null, null);
            }
            FIN.finallyExec$NT(v);
        }
        catch(Throwable unused_ex) {
            FIN.finallyExec$NT(v);
        }
    }

    public static void PjT(String s, String s1, Integer integer0) {
        Class class0 = PjT.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(!PjT.PjT()) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(class0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                Zh.PjT(PjT.ReZ(), s, s1, integer0);
                FIN.finallyExec$NT(v);
                return;
            }
            cz cz0 = PjT.Zh();
            if(cz0 != null) {
                Uri uri0 = Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_sp/int/" + s1 + PjT.Zh(s)));
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("value", integer0);
                cz0.PjT(uri0, contentValues0, null, null);
            }
            FIN.finallyExec$NT(v);
        }
        catch(Throwable unused_ex) {
            FIN.finallyExec$NT(v);
        }
    }

    public static void PjT(String s, String s1, Long long0) {
        Class class0 = PjT.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(!PjT.PjT()) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(class0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                Zh.PjT(PjT.ReZ(), s, s1, long0);
                FIN.finallyExec$NT(v);
                return;
            }
            cz cz0 = PjT.Zh();
            if(cz0 != null) {
                Uri uri0 = Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_sp/long/" + s1 + PjT.Zh(s)));
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("value", long0);
                cz0.PjT(uri0, contentValues0, null, null);
            }
            FIN.finallyExec$NT(v);
        }
        catch(Throwable unused_ex) {
            FIN.finallyExec$NT(v);
        }
    }

    public static void PjT(String s, String s1, String s2) {
        Class class0 = PjT.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(!PjT.PjT()) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(class0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                Zh.PjT(PjT.ReZ(), s, s1, s2);
                FIN.finallyExec$NT(v);
                return;
            }
            cz cz0 = PjT.Zh();
            if(cz0 != null) {
                Uri uri0 = Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_sp/string/" + s1 + PjT.Zh(s)));
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("value", s2);
                cz0.PjT(uri0, contentValues0, null, null);
            }
            FIN.finallyExec$NT(v);
        }
        catch(Throwable unused_ex) {
            FIN.finallyExec$NT(v);
        }
    }

    public static boolean PjT() {
        return ub.PjT() != null;
    }

    protected static boolean PjT(Context context0, String s, String s1, boolean z) {
        String s2 = PjT.PjT(s, s1);
        if(SM.XX(s2)) {
            return com.bytedance.sdk.component.PjT.PjT(context0, s2).PjT(s1, z);
        }
        SharedPreferences sharedPreferences0 = Zh.PjT(context0, s2);
        return sharedPreferences0 == null ? z : sharedPreferences0.getBoolean(s1, z);
    }

    public static boolean PjT(String s, String s1, boolean z) {
        if(!PjT.PjT()) {
            return z;
        }
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                return PjT.PjT(PjT.ReZ(), s, s1, z);
            }
            cz cz0 = PjT.Zh();
            if(cz0 != null) {
                String s2 = cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_sp/boolean/" + s1 + PjT.Zh(s))));
                return s2 == null || s2.equals("null") ? z : Boolean.parseBoolean(s2);
            }
        }
        catch(Throwable unused_ex) {
        }
        return z;
    }

    private static Context ReZ() {
        return ub.PjT();
    }

    private static cz Zh() {
        try {
            return PjT.PjT() ? com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT()) : null;
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    // 去混淆评级： 低(20)
    private static String Zh(String s) {
        return TextUtils.isEmpty(s) ? "" : "?sp_file_name=" + s;
    }

    public static String Zh(String s, String s1, String s2) [...] // 潜在的解密器

    public static void Zh(String s, String s1) {
        if(!PjT.PjT()) {
            return;
        }
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                Zh.Zh(PjT.ReZ(), s, s1);
                return;
            }
            cz cz0 = PjT.Zh();
            if(cz0 != null) {
                cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_sp/long/" + s1 + PjT.Zh(s))), null, null);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    private static String cr() [...] // 潜在的解密器
}

