package com.google.android.gms.internal.vision;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzdg {
    private static String zza(@NullableDecl Object object0) {
        if(object0 == null) {
            return "null";
        }
        try {
            return object0.toString();
        }
        catch(Exception exception0) {
            String s = object0.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(object0));
            String s1 = String.valueOf(s);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", (s1.length() == 0 ? new String("Exception during lenientFormat for ") : "Exception during lenientFormat for " + s1), exception0);
            return "<" + s + " threw " + exception0.getClass().getName() + ">";
        }
    }

    public static String zza(@NullableDecl String s) {
        return zzda.zza(s);
    }

    public static String zza(@NullableDecl String s, @NullableDecl Object[] arr_object) {
        String s1 = String.valueOf(s);
        int v = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            arr_object[v1] = zzdg.zza(arr_object[v1]);
        }
        StringBuilder stringBuilder0 = new StringBuilder(s1.length() + arr_object.length * 16);
        int v2 = 0;
        while(v < arr_object.length) {
            int v3 = s1.indexOf("%s", v2);
            if(v3 == -1) {
                break;
            }
            stringBuilder0.append(s1, v2, v3);
            stringBuilder0.append(arr_object[v]);
            v2 = v3 + 2;
            ++v;
        }
        stringBuilder0.append(s1, v2, s1.length());
        if(v < arr_object.length) {
            stringBuilder0.append(" [");
            int v4 = v + 1;
            stringBuilder0.append(arr_object[v]);
            while(v4 < arr_object.length) {
                stringBuilder0.append(", ");
                stringBuilder0.append(arr_object[v4]);
                ++v4;
            }
            stringBuilder0.append(']');
        }
        return stringBuilder0.toString();
    }
}

