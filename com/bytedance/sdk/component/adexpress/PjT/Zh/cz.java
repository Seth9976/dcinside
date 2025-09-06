package com.bytedance.sdk.component.adexpress.PjT.Zh;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.sdk.component.adexpress.PjT.PjT.PjT;
import com.bytedance.sdk.component.adexpress.PjT.ReZ.ReZ;
import com.bytedance.sdk.component.adexpress.PjT.ReZ.Zh;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.TWR;

public class cz {
    private volatile ConcurrentHashMap JQp;
    public static int PjT = 20;
    private Set ReZ;
    private LruCache XX;
    private static volatile cz Zh;
    private final Object cr;
    private AtomicBoolean cz;

    static {
    }

    private cz() {
        this.cr = new Object();
        this.cz = new AtomicBoolean(false);
        this.XX = new LruCache(cz.PjT) {
            final cz PjT;

            protected int PjT(String s, Zh zh0) {
                return 1;
            }

            @Override  // android.util.LruCache
            protected int sizeOf(Object object0, Object object1) {
                return this.PjT(((String)object0), ((Zh)object1));
            }
        };
        this.ReZ = DesugarCollections.synchronizedSet(new HashSet());
    }

    public static cz PjT() {
        if(cz.Zh == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.Zh == null) {
                    cz.Zh = new cz();
                }
                __monitor_exit(class0);
                return cz.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.Zh;
    }

    public static void PjT(int v) {
        cz.PjT = v;
    }

    Zh PjT(String s) {
        Zh zh0;
        Zh zh1;
        if(!TextUtils.isEmpty(s) && PjT.PjT().Zh() != null) {
            synchronized(this.cr) {
                zh0 = (Zh)this.XX.get(String.valueOf(s));
            }
            if(zh0 != null) {
                return zh0;
            }
            Cursor cursor0 = PjT.PjT().Zh().PjT("template_diff_new", null, "id=?", new String[]{s}, null, null, null);
            if(cursor0 != null) {
                try {
                    if(cursor0.moveToFirst()) {
                        while(true) {
                            String s1 = cursor0.getString(cursor0.getColumnIndex("rit"));
                            String s2 = cursor0.getString(cursor0.getColumnIndex("id"));
                            String s3 = cursor0.getString(cursor0.getColumnIndex("md5"));
                            String s4 = cursor0.getString(cursor0.getColumnIndex("url"));
                            String s5 = cursor0.getString(cursor0.getColumnIndex("data"));
                            String s6 = cursor0.getString(cursor0.getColumnIndex("version"));
                            Long long0 = cursor0.getLong(cursor0.getColumnIndex("update_time"));
                            zh1 = new Zh().PjT(s1).Zh(s2).ReZ(s3).cr(s4).JQp(s5).cz(s6).PjT(long0);
                            synchronized(this.cr) {
                                this.XX.put(s2, zh1);
                            }
                            this.ReZ.add(s2);
                            if(cursor0.moveToNext()) {
                                continue;
                            }
                            goto label_28;
                        }
                    }
                }
                catch(Throwable unused_ex) {
                }
                cursor0.close();
                return null;
            label_28:
                cursor0.close();
                return zh1;
            }
            return null;
        }
        return null;
    }

    void PjT(Zh zh0, boolean z) {
        if(zh0 == null || PjT.PjT().Zh() == null || TextUtils.isEmpty(zh0.Zh())) {
            return;
        }
        Cursor cursor0 = PjT.PjT().Zh().PjT("template_diff_new", null, "id=?", new String[]{zh0.Zh()}, null, null, null);
        boolean z1 = cursor0 != null && cursor0.getCount() > 0;
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    cursor0.getString(cursor0.getColumnIndex("rit"));
                }
                cursor0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("rit", zh0.PjT());
        contentValues0.put("id", zh0.Zh());
        contentValues0.put("md5", zh0.ReZ());
        contentValues0.put("url", zh0.cr());
        contentValues0.put("data", zh0.JQp());
        contentValues0.put("version", zh0.cz());
        contentValues0.put("update_time", zh0.XX());
        if(z1) {
            PjT.PjT().Zh().PjT("template_diff_new", contentValues0, "id=?", new String[]{zh0.Zh()});
        }
        else {
            PjT.PjT().Zh().PjT("template_diff_new", contentValues0);
        }
        synchronized(this.cr) {
            this.XX.put(zh0.Zh(), zh0);
        }
        this.ReZ.add(zh0.Zh());
        if(!z) {
            try {
                if(PjT.PjT().cz() != null) {
                    if(this.JQp == null) {
                        this.JQp = new ConcurrentHashMap();
                    }
                    ReZ reZ0 = new ReZ(zh0.PjT(), zh0.Zh(), zh0.ReZ());
                    this.JQp.put(zh0.Zh(), reZ0);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    void PjT(Set set0) {
        if(set0 != null && !set0.isEmpty() && PjT.PjT().Zh() != null) {
            String[] arr_s = (String[])set0.toArray(new String[set0.size()]);
            if(arr_s.length > 0) {
                for(int v = 0; v < arr_s.length; ++v) {
                    this.cr(arr_s[v]);
                    PjT.PjT().Zh().PjT("template_diff_new", "id=?", new String[]{arr_s[v]});
                    this.ReZ(arr_s[v]);
                }
            }
        }
    }

    public static String ReZ() [...] // Inlined contents

    void ReZ(String s) {
        try {
            if(this.JQp != null && !this.JQp.isEmpty()) {
                ReZ reZ0 = (ReZ)this.JQp.get(s);
                if(reZ0 == null) {
                    return;
                }
                boolean z = TextUtils.isEmpty(reZ0.PjT()) || PjT.PjT().cz() == null;
                this.JQp.remove(s);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    List Zh() {
        if(PjT.PjT().Zh() == null) {
            return null;
        }
        boolean z = this.cz.get();
        this.cz.set(true);
        List list0 = new ArrayList();
        Cursor cursor0 = PjT.PjT().Zh().PjT("template_diff_new", null, null, null, null, null, null);
        if(cursor0 != null) {
            try {
                while(cursor0.moveToNext()) {
                    String s = cursor0.getString(cursor0.getColumnIndex("rit"));
                    String s1 = cursor0.getString(cursor0.getColumnIndex("id"));
                    String s2 = cursor0.getString(cursor0.getColumnIndex("md5"));
                    String s3 = cursor0.getString(cursor0.getColumnIndex("url"));
                    String s4 = cursor0.getString(cursor0.getColumnIndex("data"));
                    String s5 = cursor0.getString(cursor0.getColumnIndex("version"));
                    Long long0 = cursor0.getLong(cursor0.getColumnIndex("update_time"));
                    list0.add(new Zh().PjT(s).Zh(s1).ReZ(s2).cr(s3).JQp(s4).cz(s5).PjT(long0));
                    synchronized(this.cr) {
                        this.XX.put(s1, list0.get(list0.size() - 1));
                    }
                    this.ReZ.add(s1);
                    if(!z && PjT.PjT().cz() != null) {
                        if(this.JQp == null) {
                            this.JQp = new ConcurrentHashMap();
                        }
                        if(s1 != null && !this.JQp.contains(s1)) {
                            this.JQp.put(s1, new ReZ(s, s1, s2));
                        }
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
            cursor0.close();
        }
        return list0;
    }

    Set Zh(String s) {
        if(!TextUtils.isEmpty(s) && PjT.PjT().Zh() != null) {
            Set set0 = new HashSet();
            Cursor cursor0 = PjT.PjT().Zh().PjT("template_diff_new", null, "rit=?", new String[]{s}, null, null, null);
            if(cursor0 != null) {
                try {
                    try {
                        if(cursor0.moveToFirst()) {
                            do {
                                set0.add(cursor0.getString(cursor0.getColumnIndex("id")));
                            }
                            while(cursor0.moveToNext());
                            goto label_14;
                        }
                    }
                    catch(Exception exception0) {
                        Log.e("TmplDbHelper", "", exception0);
                    }
                    goto label_16;
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            label_14:
                cursor0.close();
                return set0;
            label_16:
                cursor0.close();
                return null;
            }
        }
        return null;
    }

    private void cr(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(this.XX != null && this.XX.size() > 0) {
            synchronized(this.cr) {
                this.XX.remove(s);
            }
        }
    }
}

