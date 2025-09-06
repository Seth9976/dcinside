package com.bytedance.sdk.openadsdk.ub;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;
import java.util.List;

public class PjT {
    private Runnable Au;
    private static final long JQp;
    private Zh PjT;
    private Boolean ReZ;
    private Runnable SM;
    private final ArrayList XX;
    private com.bytedance.sdk.openadsdk.ub.ReZ.PjT Zh;
    private static Context cr;
    private int cz;

    static {
        PjT.JQp = System.currentTimeMillis();
    }

    private PjT(Zh zh0) {
        this.cz = 0;
        this.XX = new ArrayList();
        this.Au = new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                Boolean boolean0 = Boolean.valueOf(PjT.this.PjT.isMonitorOpen());
                PjT.this.ReZ = boolean0;
                if(!PjT.this.ReZ.booleanValue()) {
                    return;
                }
                PjT.this.PjT(PjT.this.XX);
                PjT.this.XX.clear();
            }
        };
        this.SM = new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                ArrayList arrayList2;
                try {
                    SQLiteDatabase sQLiteDatabase0 = com.bytedance.sdk.openadsdk.ub.PjT.PjT.Zh();
                    if(sQLiteDatabase0 != null) {
                        int v = Math.max(10, PjT.this.PjT.getOnceLogCount());
                        int v1 = v <= 100 ? v : 10;
                        Cursor cursor0 = sQLiteDatabase0.query("monitor_table", new String[]{"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"}, "timestamp <= ?", new String[]{"1757089260481"}, null, null, null, String.valueOf(v1));
                        if(cursor0 != null) {
                            ArrayList arrayList0 = new ArrayList();
                            ArrayList arrayList1 = new ArrayList();
                            while(cursor0.moveToNext()) {
                                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                if(cursor0.getColumnIndex("_id") >= 0) {
                                    arrayList2 = arrayList0;
                                    long v2 = cursor0.getLong(cursor0.getColumnIndex("_id"));
                                    pjT0.PjT(v2);
                                    arrayList1.add(String.valueOf(v2));
                                }
                                else {
                                    arrayList2 = arrayList0;
                                }
                                if(cursor0.getColumnIndex("sdk_version") >= 0) {
                                    pjT0.PjT(cursor0.getString(cursor0.getColumnIndex("sdk_version")));
                                }
                                if(cursor0.getColumnIndex("scene") >= 0) {
                                    pjT0.Zh(cursor0.getString(cursor0.getColumnIndex("scene")));
                                }
                                if(cursor0.getColumnIndex("start_count") >= 0) {
                                    pjT0.PjT(cursor0.getInt(cursor0.getColumnIndex("start_count")));
                                }
                                if(cursor0.getColumnIndex("success_count") >= 0) {
                                    pjT0.Zh(cursor0.getInt(cursor0.getColumnIndex("success_count")));
                                }
                                if(cursor0.getColumnIndex("fail_count") >= 0) {
                                    pjT0.ReZ(cursor0.getInt(cursor0.getColumnIndex("fail_count")));
                                }
                                if(cursor0.getColumnIndex("rit") >= 0) {
                                    pjT0.ReZ(cursor0.getString(cursor0.getColumnIndex("rit")));
                                }
                                if(cursor0.getColumnIndex("tag") >= 0) {
                                    pjT0.cr(cursor0.getString(cursor0.getColumnIndex("tag")));
                                }
                                if(cursor0.getColumnIndex("label") >= 0) {
                                    pjT0.JQp(cursor0.getString(cursor0.getColumnIndex("label")));
                                }
                                if(cursor0.getColumnIndex("mediation") >= 0) {
                                    pjT0.cz(cursor0.getString(cursor0.getColumnIndex("mediation")));
                                }
                                if(cursor0.getColumnIndex("is_init") >= 0) {
                                    pjT0.cr(cursor0.getInt(cursor0.getColumnIndex("is_init")));
                                }
                                if(cursor0.getColumnIndex("extra") >= 0) {
                                    pjT0.XX(cursor0.getString(cursor0.getColumnIndex("extra")));
                                }
                                arrayList0 = arrayList2;
                                arrayList0.add(pjT0);
                            }
                            cursor0.close();
                            Log.i("BusMonitorCenter", "exec upload ...");
                            if(!arrayList0.isEmpty()) {
                                PjT.this.PjT.onMonitorUpload(arrayList0);
                                SQLiteDatabase sQLiteDatabase1 = com.bytedance.sdk.openadsdk.ub.PjT.PjT.PjT();
                                if(sQLiteDatabase1 != null && sQLiteDatabase1.isOpen()) {
                                    StringBuilder stringBuilder0 = new StringBuilder();
                                    stringBuilder0.append("_id IN (");
                                    for(int v3 = 0; v3 < arrayList1.size(); ++v3) {
                                        stringBuilder0.append("?");
                                        if(v3 < arrayList1.size() - 1) {
                                            stringBuilder0.append(",");
                                        }
                                    }
                                    stringBuilder0.append(")");
                                    sQLiteDatabase1.delete("monitor_table", stringBuilder0.toString(), ((String[])arrayList1.toArray(new String[0])));
                                    if(PjT.this.Zh != null) {
                                        PjT.this.Zh.PjT(1757089260481L);
                                    }
                                }
                                if(arrayList0.size() >= v1 && PjT.this.cz <= 1000) {
                                    PjT.this.PjT(false);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                }
                catch(Throwable throwable0) {
                }
                Log.e("BusMonitorCenter", throwable0.getMessage());
            }
        };
        try {
            this.PjT = new BusMonitorDependWrapper(zh0);
            this.Zh = new com.bytedance.sdk.openadsdk.ub.ReZ.PjT(zh0.getContext());
            PjT.cr = zh0.getContext();
        }
        catch(Throwable throwable0) {
            Log.e("BusMonitorCenter", throwable0.getMessage());
        }
    }

    public static Context PjT() {
        Context context0 = PjT.cr;
        return context0 == null ? BusMonitorDependWrapper.getReflectContext() : context0;
    }

    public static PjT PjT(Zh zh0) {
        return new PjT(zh0);
    }

    private void PjT(List list0) {
        SQLiteDatabase sQLiteDatabase0;
        if(list0 != null && !list0.isEmpty()) {
            try {
                sQLiteDatabase0 = null;
                sQLiteDatabase0 = com.bytedance.sdk.openadsdk.ub.PjT.PjT.PjT();
                if(sQLiteDatabase0 != null) {
                    sQLiteDatabase0.beginTransaction();
                    for(int v = 0; v < list0.size(); ++v) {
                        cr cr0 = (cr)list0.get(v);
                        if(cr0 != null) {
                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = cr0.generatorModel();
                            if(pjT0 != null) {
                                Cursor cursor0 = sQLiteDatabase0.query("monitor_table", new String[]{"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"}, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND extra = ?", new String[]{"", "", "", "", "", "", String.valueOf(pjT0.xf()), ""}, null, null, null);
                                if(cursor0 != null) {
                                    if(cursor0.moveToNext()) {
                                        if(cursor0.getColumnIndex("_id") >= 0) {
                                            pjT0.PjT(cursor0.getLong(cursor0.getColumnIndex("_id")));
                                        }
                                        if(cursor0.getColumnIndex("start_count") >= 0) {
                                            pjT0.PjT(cursor0.getInt(cursor0.getColumnIndex("start_count")) + pjT0.cr());
                                        }
                                        if(cursor0.getColumnIndex("success_count") >= 0) {
                                            pjT0.Zh(cursor0.getInt(cursor0.getColumnIndex("success_count")) + pjT0.JQp());
                                        }
                                        if(cursor0.getColumnIndex("fail_count") >= 0) {
                                            pjT0.ReZ(cursor0.getInt(cursor0.getColumnIndex("fail_count")) + pjT0.cz());
                                        }
                                        if(cursor0.getColumnIndex("timestamp") >= 0) {
                                            pjT0.Zh(Math.min(cursor0.getLong(cursor0.getColumnIndex("timestamp")), pjT0.DWo()));
                                        }
                                    }
                                    cursor0.close();
                                }
                                ContentValues contentValues0 = new ContentValues();
                                if(pjT0.PjT() > 0L) {
                                    contentValues0.put("_id", pjT0.PjT());
                                }
                                contentValues0.put("sdk_version", "");
                                contentValues0.put("scene", "");
                                contentValues0.put("start_count", pjT0.cr());
                                contentValues0.put("success_count", pjT0.JQp());
                                contentValues0.put("fail_count", pjT0.cz());
                                contentValues0.put("rit", "");
                                contentValues0.put("tag", "");
                                contentValues0.put("label", "");
                                contentValues0.put("timestamp", pjT0.DWo());
                                contentValues0.put("mediation", "");
                                contentValues0.put("is_init", pjT0.xf());
                                contentValues0.put("extra", "");
                                sQLiteDatabase0.insertWithOnConflict("monitor_table", null, contentValues0, 5);
                            }
                        }
                    }
                    Log.i("BusMonitorCenter", "exec save size = " + list0.size());
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                goto label_59;
            }
            catch(Throwable throwable0) {
                try {
                    Log.e("BusMonitorCenter", throwable0.getMessage());
                }
                catch(Throwable throwable1) {
                    if(sQLiteDatabase0 != null) {
                        try {
                            sQLiteDatabase0.endTransaction();
                        }
                        catch(Throwable throwable2) {
                            Log.e("BusMonitorCenter", throwable2.getMessage());
                        }
                    }
                    throw throwable1;
                }
                if(sQLiteDatabase0 != null) {
                    goto label_57;
                }
                return;
            }
            try {
            label_57:
                sQLiteDatabase0.endTransaction();
                return;
            label_59:
                if(sQLiteDatabase0 != null) {
                    sQLiteDatabase0.endTransaction();
                }
            }
            catch(Throwable throwable3) {
                Log.e("BusMonitorCenter", throwable3.getMessage());
            }
        }
    }

    public void PjT(cr cr0) {
        if(cr0 != null && this.ReZ()) {
            this.PjT.getHandler().post(new Runnable() {
                final PjT Zh;

                @Override
                public void run() {
                    Boolean boolean0 = Boolean.valueOf(PjT.this.PjT.isMonitorOpen());
                    PjT.this.ReZ = boolean0;
                    if(!PjT.this.ReZ.booleanValue()) {
                        return;
                    }
                    PjT.this.XX.add(cr0);
                    if(PjT.this.XX.size() >= 10) {
                        PjT.this.PjT(PjT.this.XX);
                        PjT.this.XX.clear();
                    }
                }
            });
            this.PjT.getHandler().removeCallbacks(this.Au);
            this.PjT.getHandler().postDelayed(this.Au, 5000L);
        }
    }

    public void PjT(boolean z) {
        if(this.PjT == null || this.PjT.getHandler() == null || this.PjT.getContext() == null || this.Zh == null || !this.PjT.isMonitorOpen()) {
            return;
        }
        int v = this.PjT.getOnceLogInterval();
        this.PjT.getHandler().postDelayed(new Runnable() {
            final PjT Zh;

            @Override
            public void run() {
                try {
                    PjT.cr(PjT.this);
                    if(z) {
                        long v = PjT.this.Zh.PjT();
                        if(v == 0L) {
                            PjT.this.Zh.PjT(System.currentTimeMillis());
                            return;
                        }
                        if(1757089260321L - v < ((long)PjT.this.PjT.getUploadIntervalTime())) {
                            return;
                        }
                    }
                    if(PjT.this.PjT.getHandler() != null) {
                        PjT.this.PjT.getHandler().post(PjT.this.SM);
                    }
                    return;
                }
                catch(Throwable throwable0) {
                }
                Log.e("BusMonitorCenter", throwable0.getMessage());
            }
        }, ((long)Math.max(v, 10000)));
    }

    // 去混淆评级： 低(20)
    private boolean ReZ() {
        return this.ReZ == null ? this.PjT != null && this.PjT.getContext() != null && this.PjT.getHandler() != null : this.PjT != null && this.PjT.getContext() != null && this.PjT.isMonitorOpen() && this.PjT.getHandler() != null;
    }

    static long Zh() [...] // 潜在的解密器

    static int cr(PjT pjT0) {
        int v = pjT0.cz;
        pjT0.cz = v + 1;
        return v;
    }
}

