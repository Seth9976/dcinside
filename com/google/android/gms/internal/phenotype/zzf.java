package com.google.android.gms.internal.phenotype;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import jeb.synthetic.TWR;

public class zzf {
    private static final Uri CONTENT_URI;
    private static final Uri zzbe;
    private static final Pattern zzbf;
    private static final Pattern zzbg;
    private static final AtomicBoolean zzbh;
    private static HashMap zzbi;
    private static final HashMap zzbj;
    private static final HashMap zzbk;
    private static final HashMap zzbl;
    private static final HashMap zzbm;
    private static Object zzbn;
    private static boolean zzbo;
    private static String[] zzbp;

    static {
        zzf.CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
        zzf.zzbe = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzf.zzbf = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzf.zzbg = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        zzf.zzbh = new AtomicBoolean();
        zzf.zzbj = new HashMap();
        zzf.zzbk = new HashMap();
        zzf.zzbl = new HashMap();
        zzf.zzbm = new HashMap();
        zzf.zzbp = new String[0];
    }

    private static Object zza(HashMap hashMap0, String s, Object object0) {
        synchronized(zzf.class) {
            if(hashMap0.containsKey(s)) {
                Object object1 = hashMap0.get(s);
                if(object1 != null) {
                    object0 = object1;
                }
                return object0;
            }
            return null;
        }
    }

    public static String zza(ContentResolver contentResolver0, String s, String s1) {
        String s2;
        Object object0;
        String s5;
        synchronized(zzf.class) {
            zzf.zza(contentResolver0);
            object0 = zzf.zzbn;
            s2 = null;
            if(zzf.zzbi.containsKey(s)) {
                String s3 = (String)zzf.zzbi.get(s);
                if(s3 != null) {
                    s2 = s3;
                }
                return s2;
            }
            String[] arr_s = zzf.zzbp;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(s.startsWith(arr_s[v1])) {
                    if(!zzf.zzbo || zzf.zzbi.isEmpty()) {
                        zzf.zzbi.putAll(zzf.zza(contentResolver0, zzf.zzbp));
                        zzf.zzbo = true;
                        if(zzf.zzbi.containsKey(s)) {
                            String s4 = (String)zzf.zzbi.get(s);
                            if(s4 != null) {
                                s2 = s4;
                            }
                            return s2;
                        }
                    }
                    return null;
                }
            }
        }
        Cursor cursor0 = contentResolver0.query(zzf.CONTENT_URI, null, null, new String[]{s}, null);
        try {
            if(cursor0 != null && cursor0.moveToFirst()) {
                s5 = cursor0.getString(1);
                if(s5 != null && s5.equals(null)) {
                    s5 = null;
                }
                zzf.zza(object0, s, s5);
                if(s5 != null) {
                    goto label_39;
                }
                goto label_40;
            }
            goto label_42;
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
    label_39:
        s2 = s5;
    label_40:
        cursor0.close();
        return s2;
        try {
        label_42:
            zzf.zza(object0, s, null);
        }
        catch(Throwable throwable0) {
        label_45:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return null;
    }

    private static Map zza(ContentResolver contentResolver0, String[] arr_s) {
        Cursor cursor0 = contentResolver0.query(zzf.zzbe, null, null, arr_s, null);
        Map map0 = new TreeMap();
        if(cursor0 == null) {
            return map0;
        }
        while(true) {
            try {
                if(!cursor0.moveToNext()) {
                    break;
                }
                ((TreeMap)map0).put(cursor0.getString(0), cursor0.getString(1));
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
        cursor0.close();
        return map0;
    }

    private static void zza(ContentResolver contentResolver0) {
        if(zzf.zzbi == null) {
            zzf.zzbh.set(false);
            zzf.zzbi = new HashMap();
            zzf.zzbn = new Object();
            zzf.zzbo = false;
            zzg zzg0 = new zzg(null);
            contentResolver0.registerContentObserver(zzf.CONTENT_URI, true, zzg0);
            return;
        }
        if(zzf.zzbh.getAndSet(false)) {
            zzf.zzbi.clear();
            zzf.zzbj.clear();
            zzf.zzbk.clear();
            zzf.zzbl.clear();
            zzf.zzbm.clear();
            zzf.zzbn = new Object();
            zzf.zzbo = false;
        }
    }

    private static void zza(Object object0, String s, String s1) {
        synchronized(zzf.class) {
            if(object0 == zzf.zzbn) {
                zzf.zzbi.put(s, s1);
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver0, String s, boolean z) {
        Object object0 = zzf.zzb(contentResolver0);
        HashMap hashMap0 = zzf.zzbj;
        Boolean boolean0 = (Boolean)zzf.zza(hashMap0, s, Boolean.valueOf(z));
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        String s1 = zzf.zza(contentResolver0, s, null);
        if(s1 != null && !s1.equals("")) {
            if(zzf.zzbf.matcher(s1).matches()) {
                boolean0 = Boolean.TRUE;
                z = true;
            }
            else if(zzf.zzbg.matcher(s1).matches()) {
                boolean0 = Boolean.FALSE;
                z = false;
            }
            else {
                Log.w("Gservices", "attempt to read gservices key " + s + " (value \"" + s1 + "\") as boolean");
            }
        }
        synchronized(zzf.class) {
            if(object0 == zzf.zzbn) {
                hashMap0.put(s, boolean0);
                zzf.zzbi.remove(s);
            }
            return z;
        }
    }

    private static Object zzb(ContentResolver contentResolver0) {
        synchronized(zzf.class) {
            zzf.zza(contentResolver0);
            return zzf.zzbn;
        }
    }
}

