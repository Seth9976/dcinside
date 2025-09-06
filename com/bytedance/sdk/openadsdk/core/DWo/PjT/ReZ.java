package com.bytedance.sdk.openadsdk.core.DWo.PjT;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.ub;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jeb.synthetic.TWR;

public class ReZ {
    public static int PjT = 20;
    private final Object ReZ;
    private static volatile ReZ Zh;
    private final LruCache cr;

    static {
    }

    private ReZ() {
        this.ReZ = new Object();
        this.cr = new LruCache(ReZ.PjT) {
            final ReZ PjT;

            protected int PjT(String s, PjT pjT0) {
                return 1;
            }

            @Override  // android.util.LruCache
            protected int sizeOf(Object object0, Object object1) {
                return this.PjT(((String)object0), ((PjT)object1));
            }
        };
    }

    public static ReZ PjT() {
        if(ReZ.Zh == null) {
            Class class0 = ReZ.class;
            __monitor_enter(class0);
            try {
                if(ReZ.Zh == null) {
                    ReZ.Zh = new ReZ();
                }
                __monitor_exit(class0);
                return ReZ.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return ReZ.Zh;
    }

    PjT PjT(String s, String s1) {
        PjT pjT0;
        PjT pjT1;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        synchronized(this.ReZ) {
            pjT0 = (PjT)this.cr.get(s);
        }
        if(pjT0 != null) {
            if(!TextUtils.equals(s1, pjT0.Zh())) {
                this.Zh(s1);
                return null;
            }
            return pjT0;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.ReZ reZ0 = new com.bytedance.sdk.openadsdk.multipro.aidl.ReZ(com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), "ugen_template", null, "id=? AND md5=?", new String[]{s, s1}, null, null, null));
        try {
            if(reZ0.moveToFirst()) {
                do {
                    int v1 = reZ0.getColumnIndex("id");
                    int v2 = reZ0.getColumnIndex("md5");
                    int v3 = reZ0.getColumnIndex("url");
                    int v4 = reZ0.getColumnIndex("data");
                    int v5 = reZ0.getColumnIndex("update_time");
                    if(v1 == -1 || v2 == -1 || v3 == -1 || v5 == -1 || v4 == -1) {
                        goto label_48;
                    }
                    int v6 = reZ0.getColumnIndex("rit");
                    String s2 = reZ0.getString(v1);
                    String s3 = reZ0.getString(v2);
                    String s4 = reZ0.getString(v3);
                    String s5 = reZ0.getString(v4);
                    if(TextUtils.isEmpty(s5)) {
                        goto label_46;
                    }
                    String s6 = v6 == -1 ? null : reZ0.getString(v6);
                    Long long0 = reZ0.getLong(v5);
                    pjT1 = new PjT().PjT(s2).Zh(s3).cr(s5).ReZ(s4).JQp(s6).PjT(long0);
                    synchronized(this.ReZ) {
                        this.cr.put(s2, pjT1);
                    }
                }
                while(reZ0.moveToNext());
                goto label_44;
            }
            goto label_50;
        }
        catch(Throwable throwable0) {
        }
        try {
            RD.PjT("UGTmplDbHelper", "getGgenTemplate error", throwable0);
            goto label_50;
        }
        catch(Throwable throwable1) {
            TWR.safeClose$NT(reZ0, throwable1);
            throw throwable1;
        }
    label_44:
        reZ0.close();
        return pjT1;
    label_46:
        reZ0.close();
        return null;
    label_48:
        reZ0.close();
        return null;
    label_50:
        reZ0.close();
        return null;
    }

    Set PjT(String s) {
        PjT pjT0;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        Set set0 = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.ReZ reZ0 = new com.bytedance.sdk.openadsdk.multipro.aidl.ReZ(com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), "ugen_template", null, "rit=?", new String[]{s}, null, null, null));
        try {
            if(reZ0.moveToFirst()) {
                do {
                    int v = reZ0.getColumnIndex("id");
                    if(v != -1) {
                        String s1 = reZ0.getString(v);
                        if(!TextUtils.isEmpty(s1)) {
                            synchronized(this.ReZ) {
                                pjT0 = (PjT)this.cr.get(s1);
                            }
                            if(pjT0 == null) {
                                PjT pjT1 = new PjT();
                                int v2 = reZ0.getColumnIndex("data");
                                if(v2 != -1) {
                                    String s2 = reZ0.getString(v2);
                                    if(!TextUtils.isEmpty(s2)) {
                                        pjT1.cr(s2);
                                        pjT1.PjT(s1);
                                        pjT1.JQp(s);
                                        int v3 = reZ0.getColumnIndex("md5");
                                        int v4 = reZ0.getColumnIndex("url");
                                        int v5 = reZ0.getColumnIndex("update_time");
                                        if(v3 != -1) {
                                            pjT1.Zh(reZ0.getString(v3));
                                        }
                                        if(v4 != -1) {
                                            pjT1.ReZ(reZ0.getString(v4));
                                        }
                                        if(v5 != -1) {
                                            pjT1.PjT(reZ0.getLong(v5));
                                        }
                                        set0.add(pjT1);
                                        synchronized(this.ReZ) {
                                            this.cr.put(s1, pjT1);
                                        }
                                    }
                                }
                            }
                            else {
                                set0.add(pjT0);
                            }
                        }
                    }
                }
                while(reZ0.moveToNext());
            }
            goto label_50;
        }
        catch(Throwable throwable0) {
        }
        try {
            RD.PjT("UGTmplDbHelper", "getUgenTemplateFormRit error", throwable0);
        }
        catch(Throwable throwable1) {
            TWR.safeClose$NT(reZ0, throwable1);
            throw throwable1;
        }
    label_50:
        reZ0.close();
        return set0;
    }

    void PjT(PjT pjT0) {
        if(pjT0 == null) {
            return;
        }
        if(TextUtils.isEmpty(pjT0.PjT())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.ReZ reZ0 = new com.bytedance.sdk.openadsdk.multipro.aidl.ReZ(com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), "ugen_template", null, "id=?", new String[]{pjT0.PjT()}, null, null, null));
        boolean z = reZ0.getCount() > 0;
        try {
            reZ0.close();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("id", pjT0.PjT());
            contentValues0.put("md5", pjT0.Zh());
            contentValues0.put("url", pjT0.ReZ());
            contentValues0.put("data", pjT0.JQp());
            contentValues0.put("rit", pjT0.cz());
            contentValues0.put("update_time", pjT0.cr());
            if(z) {
                com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), "ugen_template", contentValues0, "id=?", new String[]{pjT0.PjT()});
            }
            else {
                com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), "ugen_template", contentValues0);
            }
            synchronized(this.ReZ) {
                this.cr.put(pjT0.PjT(), pjT0);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    void PjT(Set set0) {
        if(set0 != null && !set0.isEmpty()) {
            String[] arr_s = (String[])set0.toArray(new String[set0.size()]);
            if(arr_s.length > 0) {
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    this.Zh(s);
                    com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), "ugen_template", "id=?", new String[]{s});
                }
            }
        }
    }

    public static String ReZ() [...] // Inlined contents

    private void Zh(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(this.cr.size() <= 0) {
            return;
        }
        synchronized(this.ReZ) {
            this.cr.remove(s);
        }
    }

    List Zh() {
        List list0 = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.ReZ reZ0 = new com.bytedance.sdk.openadsdk.multipro.aidl.ReZ(com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), "ugen_template", null, null, null, null, null, null));
        try {
            if(reZ0.moveToFirst()) {
                do {
                    int v = reZ0.getColumnIndex("id");
                    int v1 = reZ0.getColumnIndex("md5");
                    int v2 = reZ0.getColumnIndex("url");
                    int v3 = reZ0.getColumnIndex("data");
                    int v4 = reZ0.getColumnIndex("update_time");
                    if(v != -1 && v1 != -1 && v2 != -1 && v4 != -1 && v3 != -1) {
                        int v5 = reZ0.getColumnIndex("rit");
                        String s = v5 == -1 ? null : reZ0.getString(v5);
                        String s1 = reZ0.getString(v);
                        String s2 = reZ0.getString(v1);
                        String s3 = reZ0.getString(v2);
                        String s4 = reZ0.getString(v3);
                        Long long0 = reZ0.getLong(v4);
                        PjT pjT0 = new PjT().PjT(s1).Zh(s2).ReZ(s3).cr(s4).JQp(s).PjT(long0);
                        list0.add(pjT0);
                        synchronized(this.ReZ) {
                            this.cr.put(s1, pjT0);
                        }
                    }
                }
                while(reZ0.moveToNext());
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
        }
        try {
            RD.PjT("UGTmplDbHelper", "getUgenTemplate error", throwable0);
        }
        catch(Throwable throwable1) {
            TWR.safeClose$NT(reZ0, throwable1);
            throw throwable1;
        }
    label_32:
        reZ0.close();
        return list0;
    }

    public static String cr() [...] // Inlined contents
}

