package com.bytedance.sdk.openadsdk.multipro.PjT;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.cz;
import com.bytedance.sdk.openadsdk.core.JQp;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PjT {
    public static cz PjT;
    private static final ConcurrentHashMap Zh;

    static {
        PjT.Zh = new ConcurrentHashMap();
    }

    public static int PjT(Context context0, String s, ContentValues contentValues0, String s1, String[] arr_s) {
        int v1;
        int v;
        if(contentValues0 != null && !TextUtils.isEmpty(s)) {
            Object object0 = PjT.PjT(s);
            __monitor_enter(object0);
            try {
                if(!Zh.ReZ()) {
                    v = JQp.PjT(context0).PjT().PjT(s, contentValues0, s1, arr_s);
                    goto label_5;
                }
                goto label_7;
            }
            catch(Throwable unused_ex) {
                __monitor_exit(object0);
                return 0;
            }
        label_5:
            __monitor_exit(object0);
            return v;
            try {
            label_7:
                cz cz0 = PjT.PjT(context0);
                if(cz0 != null) {
                    v1 = cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_db/ttopensdk.db/" + s)), contentValues0, s1, arr_s);
                    goto label_10;
                }
            }
            catch(Throwable unused_ex) {
            }
            __monitor_exit(object0);
            return 0;
        label_10:
            __monitor_exit(object0);
            return v1;
        }
        return 0;
    }

    public static int PjT(Context context0, String s, String s1, String[] arr_s) {
        int v1;
        int v;
        if(TextUtils.isEmpty(s)) {
            return 0;
        }
        Object object0 = PjT.PjT(s);
        __monitor_enter(object0);
        try {
            if(!Zh.ReZ()) {
                v = JQp.PjT(context0).PjT().PjT(s, s1, arr_s);
                goto label_6;
            }
            goto label_8;
        }
        catch(Throwable unused_ex) {
            __monitor_exit(object0);
            return 0;
        }
    label_6:
        __monitor_exit(object0);
        return v;
        try {
        label_8:
            cz cz0 = PjT.PjT(context0);
            if(cz0 != null) {
                v1 = cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_db/ttopensdk.db/" + s)), s1, arr_s);
                goto label_11;
            }
        }
        catch(Throwable unused_ex) {
        }
        __monitor_exit(object0);
        return 0;
    label_11:
        __monitor_exit(object0);
        return v1;
    }

    public static cz PjT(Context context0) {
        try {
            if(context0 == null) {
                ub.PjT();
            }
            if(PjT.PjT == null) {
                if(Zh.ReZ()) {
                    PjT.PjT = com.bytedance.sdk.component.cz.PjT.cz.PjT.PjT(com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT().PjT(5));
                    return PjT.PjT;
                }
                PjT.PjT = com.bytedance.sdk.openadsdk.multipro.aidl.PjT.cz.Zh();
                return PjT.PjT;
            }
        }
        catch(Throwable unused_ex) {
            wN.Au("binder error");
        }
        return PjT.PjT;
    }

    private static Object PjT(String s) {
        ConcurrentHashMap concurrentHashMap0 = PjT.Zh;
        Object object0 = concurrentHashMap0.get(s);
        if(object0 == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                Object object1 = concurrentHashMap0.get(s);
                if(object1 == null) {
                    object1 = new Object();
                    concurrentHashMap0.put(s, object1);
                }
                __monitor_exit(class0);
                return object1;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return object0;
    }

    // 去混淆评级： 低(40)
    private static String PjT() [...] // 潜在的解密器

    public static Map PjT(Context context0, String s, String[] arr_s, String s1, String[] arr_s1, String s2, String s3, String s4) {
        Map map1;
        Map map0;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        Object object0 = PjT.PjT(s);
        __monitor_enter(object0);
        try {
            if(!Zh.ReZ()) {
                map0 = PjT.PjT(JQp.PjT(context0).PjT().PjT(s, arr_s, s1, arr_s1, s2, s3, s4));
                goto label_6;
            }
            goto label_8;
        }
        catch(Throwable unused_ex) {
            __monitor_exit(object0);
            return null;
        }
    label_6:
        __monitor_exit(object0);
        return map0;
        try {
        label_8:
            cz cz0 = PjT.PjT(context0);
            if(cz0 != null) {
                map1 = cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_db/ttopensdk.db/" + s)), arr_s, s1, arr_s1, s4);
                goto label_11;
            }
        }
        catch(Throwable unused_ex) {
        }
        __monitor_exit(object0);
        return null;
    label_11:
        __monitor_exit(object0);
        return map1;
    }

    public static Map PjT(Cursor cursor0) {
        Map map0 = new HashMap();
        if(cursor0 != null) {
            try {
                String[] arr_s = cursor0.getColumnNames();
                while(cursor0.getCount() > 0 && cursor0.moveToNext()) {
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s = arr_s[v];
                        if(!map0.containsKey(s)) {
                            map0.put(s, new LinkedList());
                        }
                        ((List)map0.get(s)).add(cursor0.getString(cursor0.getColumnIndex(s)));
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
            cursor0.close();
        }
        return map0;
    }

    public static void PjT(Context context0, String s, ContentValues contentValues0) {
        if(contentValues0 != null && !TextUtils.isEmpty(s)) {
            Object object0 = PjT.PjT(s);
            __monitor_enter(object0);
            try {
                if(!Zh.ReZ()) {
                    JQp.PjT(context0).PjT().PjT(s, null, contentValues0);
                    goto label_5;
                }
                goto label_7;
            }
            catch(Throwable unused_ex) {
                __monitor_exit(object0);
                return;
            }
        label_5:
            __monitor_exit(object0);
            return;
            try {
            label_7:
                cz cz0 = PjT.PjT(context0);
                if(cz0 != null) {
                    cz0.PjT(Uri.parse(("content://com.bytedance.openadsdk.TTMultiProvider/t_db/ttopensdk.db/" + s)), contentValues0);
                }
            }
            catch(Throwable unused_ex) {
            }
            __monitor_exit(object0);
        }
    }
}

