package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.multipro.PjT.Zh;
import com.bytedance.sdk.openadsdk.multipro.cr.ReZ;
import j..util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JQp implements PjT {
    private static volatile JQp PjT;
    private static final List ReZ;
    private static WeakReference Zh;

    static {
        List list0 = DesugarCollections.synchronizedList(new ArrayList());
        JQp.ReZ = list0;
        list0.add(new ReZ());
        list0.add(new Zh());
        list0.add(new com.bytedance.sdk.openadsdk.multipro.ReZ.PjT());
        list0.add(new com.bytedance.sdk.openadsdk.cr.PjT.JQp(new com.bytedance.sdk.component.cz.PjT.Zh.Zh.Zh()));
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    public static JQp PjT(Context context0) {
        if(context0 != null) {
            JQp.Zh = new WeakReference(context0.getApplicationContext());
        }
        if(JQp.PjT == null) {
            Class class0 = JQp.class;
            __monitor_enter(class0);
            try {
                if(JQp.PjT == null) {
                    JQp.PjT = new JQp();
                }
                __monitor_exit(class0);
                return JQp.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return JQp.PjT;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(@NonNull Uri uri0, @Nullable ContentValues contentValues0, @Nullable String s, @Nullable String[] arr_s) {
        try {
            PjT pjT0 = this.Zh(uri0);
            return pjT0 == null ? 0 : pjT0.PjT(uri0, contentValues0, s, arr_s);
        }
        catch(Throwable unused_ex) {
        }
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(@NonNull Uri uri0, @Nullable String s, @Nullable String[] arr_s) {
        try {
            PjT pjT0 = this.Zh(uri0);
            return pjT0 == null ? 0 : pjT0.PjT(uri0, s, arr_s);
        }
        catch(Throwable unused_ex) {
        }
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Cursor PjT(@NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        try {
            PjT pjT0 = this.Zh(uri0);
            return pjT0 == null ? null : pjT0.PjT(uri0, arr_s, s, arr_s1, s1);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Uri PjT(@NonNull Uri uri0, @Nullable ContentValues contentValues0) {
        try {
            PjT pjT0 = this.Zh(uri0);
            return pjT0 == null ? null : pjT0.PjT(uri0, contentValues0);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    @NonNull
    public String PjT() {
        return "";
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public String PjT(@NonNull Uri uri0) {
        try {
            PjT pjT0 = this.Zh(uri0);
            return pjT0 == null ? null : pjT0.PjT(uri0);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    private boolean ReZ(Uri uri0) [...] // Inlined contents

    private PjT Zh(Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        String[] arr_s = uri0.getPath().split("/");
        if(arr_s.length < 2) {
            return null;
        }
        String s = arr_s[1];
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        for(Object object0: JQp.ReZ) {
            PjT pjT0 = (PjT)object0;
            if(s.equals(pjT0.PjT())) {
                return pjT0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }
}

