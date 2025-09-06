package com.google.android.gms.internal.clearcut;

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

public class zzy {
    private static final Uri CONTENT_URI;
    private static final Uri zzcq;
    public static final Pattern zzcr;
    public static final Pattern zzcs;
    private static final AtomicBoolean zzct;
    private static HashMap zzcu;
    private static final HashMap zzcv;
    private static final HashMap zzcw;
    private static final HashMap zzcx;
    private static final HashMap zzcy;
    private static Object zzcz;
    private static boolean zzda;
    private static String[] zzdb;

    static {
        zzy.CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
        zzy.zzcq = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzy.zzcr = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzy.zzcs = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        zzy.zzct = new AtomicBoolean();
        zzy.zzcv = new HashMap();
        zzy.zzcw = new HashMap();
        zzy.zzcx = new HashMap();
        zzy.zzcy = new HashMap();
        zzy.zzdb = new String[0];
    }

    public static long getLong(ContentResolver contentResolver0, String s, long v) {
        Object object0 = zzy.zzb(contentResolver0);
        long v1 = 0L;
        Long long0 = (Long)zzy.zza(zzy.zzcx, s, 0L);
        if(long0 != null) {
            return (long)long0;
        }
        String s1 = zzy.zza(contentResolver0, s, null);
        if(s1 != null) {
            try {
                long v2 = Long.parseLong(s1);
                long0 = v2;
                v1 = v2;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        zzy.zza(object0, zzy.zzcx, s, long0);
        return v1;
    }

    private static Object zza(HashMap hashMap0, String s, Object object0) {
        synchronized(zzy.class) {
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
        synchronized(zzy.class) {
            zzy.zza(contentResolver0);
            object0 = zzy.zzcz;
            s2 = null;
            if(zzy.zzcu.containsKey(s)) {
                String s3 = (String)zzy.zzcu.get(s);
                if(s3 != null) {
                    s2 = s3;
                }
                return s2;
            }
            String[] arr_s = zzy.zzdb;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(s.startsWith(arr_s[v1])) {
                    if(!zzy.zzda || zzy.zzcu.isEmpty()) {
                        zzy.zzcu.putAll(zzy.zza(contentResolver0, zzy.zzdb));
                        zzy.zzda = true;
                        if(zzy.zzcu.containsKey(s)) {
                            String s4 = (String)zzy.zzcu.get(s);
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
        Cursor cursor0 = contentResolver0.query(zzy.CONTENT_URI, null, null, new String[]{s}, null);
        try {
            if(cursor0 != null && cursor0.moveToFirst()) {
                s5 = cursor0.getString(1);
                if(s5 != null && s5.equals(null)) {
                    s5 = null;
                }
                zzy.zza(object0, s, s5);
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
            zzy.zza(object0, s, null);
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
        Cursor cursor0 = contentResolver0.query(zzy.zzcq, null, null, arr_s, null);
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
        if(zzy.zzcu == null) {
            zzy.zzct.set(false);
            zzy.zzcu = new HashMap();
            zzy.zzcz = new Object();
            zzy.zzda = false;
            zzz zzz0 = new zzz(null);
            contentResolver0.registerContentObserver(zzy.CONTENT_URI, true, zzz0);
            return;
        }
        if(zzy.zzct.getAndSet(false)) {
            zzy.zzcu.clear();
            zzy.zzcv.clear();
            zzy.zzcw.clear();
            zzy.zzcx.clear();
            zzy.zzcy.clear();
            zzy.zzcz = new Object();
            zzy.zzda = false;
        }
    }

    private static void zza(Object object0, String s, String s1) {
        synchronized(zzy.class) {
            if(object0 == zzy.zzcz) {
                zzy.zzcu.put(s, s1);
            }
        }
    }

    private static void zza(Object object0, HashMap hashMap0, String s, Object object1) {
        synchronized(zzy.class) {
            if(object0 == zzy.zzcz) {
                hashMap0.put(s, object1);
                zzy.zzcu.remove(s);
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver0, String s, boolean z) {
        Object object0 = zzy.zzb(contentResolver0);
        HashMap hashMap0 = zzy.zzcv;
        Boolean boolean0 = (Boolean)zzy.zza(hashMap0, s, Boolean.valueOf(z));
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        String s1 = zzy.zza(contentResolver0, s, null);
        if(s1 != null && !s1.equals("")) {
            if(zzy.zzcr.matcher(s1).matches()) {
                boolean0 = Boolean.TRUE;
                z = true;
            }
            else if(zzy.zzcs.matcher(s1).matches()) {
                boolean0 = Boolean.FALSE;
                z = false;
            }
            else {
                Log.w("Gservices", "attempt to read gservices key " + s + " (value \"" + s1 + "\") as boolean");
            }
        }
        zzy.zza(object0, hashMap0, s, boolean0);
        return z;
    }

    private static Object zzb(ContentResolver contentResolver0) {
        synchronized(zzy.class) {
            zzy.zza(contentResolver0);
            return zzy.zzcz;
        }
    }
}

