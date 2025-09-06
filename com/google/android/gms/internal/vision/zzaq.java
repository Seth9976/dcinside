package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import jeb.synthetic.TWR;

public class zzaq {
    public static final Uri zza;
    public static final Pattern zzb;
    private static final Uri zzc;
    private static final Pattern zzd;
    private static final AtomicBoolean zze;
    private static HashMap zzf;
    private static final HashMap zzg;
    private static final HashMap zzh;
    private static final HashMap zzi;
    private static final HashMap zzj;
    private static Object zzk;
    private static boolean zzl;
    private static String[] zzm;

    static {
        zzaq.zza = Uri.parse("content://com.google.android.gsf.gservices");
        zzaq.zzc = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzaq.zzb = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzaq.zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        zzaq.zze = new AtomicBoolean();
        zzaq.zzg = new HashMap();
        zzaq.zzh = new HashMap();
        zzaq.zzi = new HashMap();
        zzaq.zzj = new HashMap();
        zzaq.zzm = new String[0];
    }

    public static String zza(ContentResolver contentResolver0, String s, String s1) {
        Object object0;
        String s2;
        String s5;
        synchronized(zzaq.class) {
            s2 = null;
            if(zzaq.zzf == null) {
                zzaq.zze.set(false);
                zzaq.zzf = new HashMap();
                zzaq.zzk = new Object();
                zzaq.zzl = false;
                zzat zzat0 = new zzat(null);
                contentResolver0.registerContentObserver(zzaq.zza, true, zzat0);
            }
            else if(zzaq.zze.getAndSet(false)) {
                zzaq.zzf.clear();
                zzaq.zzg.clear();
                zzaq.zzh.clear();
                zzaq.zzi.clear();
                zzaq.zzj.clear();
                zzaq.zzk = new Object();
                zzaq.zzl = false;
            }
            object0 = zzaq.zzk;
            if(zzaq.zzf.containsKey(s)) {
                String s3 = (String)zzaq.zzf.get(s);
                if(s3 != null) {
                    s2 = s3;
                }
                return s2;
            }
            String[] arr_s = zzaq.zzm;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(s.startsWith(arr_s[v1])) {
                    if(!zzaq.zzl || zzaq.zzf.isEmpty()) {
                        zzaq.zzf.putAll(zzaq.zza(contentResolver0, zzaq.zzm));
                        zzaq.zzl = true;
                        if(zzaq.zzf.containsKey(s)) {
                            String s4 = (String)zzaq.zzf.get(s);
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
        Cursor cursor0 = contentResolver0.query(zzaq.zza, null, null, new String[]{s}, null);
        if(cursor0 == null) {
            return null;
        }
        try {
            if(cursor0.moveToFirst()) {
                s5 = cursor0.getString(1);
                if(s5 != null && s5.equals(null)) {
                    s5 = null;
                }
                zzaq.zza(object0, s, s5);
                if(s5 != null) {
                    goto label_56;
                }
                goto label_57;
            }
            goto label_59;
        }
        catch(Throwable throwable0) {
            goto label_62;
        }
    label_56:
        s2 = s5;
    label_57:
        cursor0.close();
        return s2;
        try {
        label_59:
            zzaq.zza(object0, s, null);
        }
        catch(Throwable throwable0) {
        label_62:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return null;
    }

    private static Map zza(ContentResolver contentResolver0, String[] arr_s) {
        Cursor cursor0 = contentResolver0.query(zzaq.zzc, null, null, arr_s, null);
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

    private static void zza(Object object0, String s, String s1) {
        synchronized(zzaq.class) {
            if(object0 == zzaq.zzk) {
                zzaq.zzf.put(s, s1);
            }
        }
    }
}

