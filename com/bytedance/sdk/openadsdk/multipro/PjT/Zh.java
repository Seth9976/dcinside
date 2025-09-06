package com.bytedance.sdk.openadsdk.multipro.PjT;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.JQp;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.PjT;
import jeb.synthetic.FIN;

public class Zh implements PjT {
    private Context PjT;
    private static final Object Zh;

    static {
        Zh.Zh = new Object();
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(@NonNull Uri uri0, @Nullable ContentValues contentValues0, @Nullable String s, @Nullable String[] arr_s) {
        synchronized(Zh.Zh) {
            int v = FIN.finallyOpen$NT();
            if(this.Zh(uri0)) {
                return 0;
            }
            String[] arr_s1 = uri0.getPath().split("/");
            if(arr_s1 != null && arr_s1.length >= 4) {
                String s1 = arr_s1[2];
                String s2 = arr_s1[3];
                if("ttopensdk.db".equals(s1)) {
                    return JQp.PjT(this.Zh()).PjT().PjT(s2, contentValues0, s, arr_s);
                }
                FIN.finallyCodeBegin$NT(v);
                FIN.finallyCodeEnd$NT(v);
                return 0;
            }
        }
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(@NonNull Uri uri0, @Nullable String s, @Nullable String[] arr_s) {
        synchronized(Zh.Zh) {
            int v = FIN.finallyOpen$NT();
            if(this.Zh(uri0)) {
                return 0;
            }
            String[] arr_s1 = uri0.getPath().split("/");
            if(arr_s1 != null && arr_s1.length >= 4) {
                String s1 = arr_s1[2];
                String s2 = arr_s1[3];
                if("ttopensdk.db".equals(s1)) {
                    return JQp.PjT(this.Zh()).PjT().PjT(s2, s, arr_s);
                }
                FIN.finallyCodeBegin$NT(v);
                FIN.finallyCodeEnd$NT(v);
                return 0;
            }
        }
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Cursor PjT(@NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        synchronized(Zh.Zh) {
            int v = FIN.finallyOpen$NT();
            if(this.Zh(uri0)) {
                return null;
            }
            String[] arr_s2 = uri0.getPath().split("/");
            if(arr_s2 != null && arr_s2.length >= 4) {
                String s2 = arr_s2[2];
                String s3 = arr_s2[3];
                if("ttopensdk.db".equals(s2)) {
                    return JQp.PjT(this.Zh()).PjT().PjT(s3, arr_s, s, arr_s1, null, null, s1);
                }
                FIN.finallyCodeBegin$NT(v);
                FIN.finallyCodeEnd$NT(v);
                return null;
            }
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Uri PjT(@NonNull Uri uri0, @Nullable ContentValues contentValues0) {
        Object object0 = Zh.Zh;
        __monitor_enter(object0);
        try {
            if(this.Zh(uri0)) {
                __monitor_exit(object0);
                return null;
            }
            String[] arr_s = uri0.getPath().split("/");
            if(arr_s != null && arr_s.length >= 4) {
                String s = arr_s[2];
                String s1 = arr_s[3];
                if("ttopensdk.db".equals(s)) {
                    JQp.PjT(this.Zh()).PjT().PjT(s1, null, contentValues0);
                }
                __monitor_exit(object0);
                return null;
            }
            __monitor_exit(object0);
            return null;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    @NonNull
    public String PjT() {
        return "t_db";
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public String PjT(@NonNull Uri uri0) {
        Object object0 = Zh.Zh;
        __monitor_enter(object0);
        try {
            if(this.Zh(uri0)) {
                __monitor_exit(object0);
                return null;
            }
            String[] arr_s = uri0.getPath().split("/");
            if(arr_s != null && arr_s.length >= 5) {
                String s = arr_s[2];
                String s1 = arr_s[4];
                if("ttopensdk.db".equals(s)) {
                    if("execSQL".equals(s1)) {
                        String s2 = uri0.getQueryParameter("sql");
                        if(!TextUtils.isEmpty(s2)) {
                            JQp.PjT(this.Zh()).PjT().PjT(Uri.decode(s2));
                        }
                    }
                    else if("transactionBegin".equals(s1)) {
                        JQp.PjT(this.Zh()).PjT().Zh();
                    }
                    else if("transactionSetSuccess".equals(s1)) {
                        JQp.PjT(this.Zh()).PjT().ReZ();
                    }
                    else if("transactionEnd".equals(s1)) {
                        JQp.PjT(this.Zh()).PjT().cr();
                    }
                }
                __monitor_exit(object0);
                return null;
            }
            __monitor_exit(object0);
            return null;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    private Context Zh() {
        return this.PjT == null ? ub.PjT() : this.PjT;
    }

    private boolean Zh(Uri uri0) {
        return uri0 == null || TextUtils.isEmpty(uri0.getPath());
    }
}

