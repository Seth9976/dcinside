package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public final class zzfeh implements zzfeg {
    private final Object[] zza;

    public zzfeh(zzm zzm0, String s, int v, String s1, zzy zzy0) {
        HashSet hashSet0 = new HashSet(Arrays.asList(s1.split(",")));
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s1);
        arrayList0.add(s);
        if(hashSet0.contains("networkType")) {
            arrayList0.add(v);
        }
        if(hashSet0.contains("birthday")) {
            arrayList0.add(zzm0.zzb);
        }
        if(hashSet0.contains("extras")) {
            arrayList0.add(zzfeh.zza(zzm0.zzc));
        }
        else if(hashSet0.contains("npa")) {
            arrayList0.add(zzm0.zzc.getString("npa"));
        }
        if(hashSet0.contains("gender")) {
            arrayList0.add(zzm0.zzd);
        }
        if(hashSet0.contains("keywords")) {
            List list0 = zzm0.zze;
            if(list0 == null) {
                arrayList0.add(null);
            }
            else {
                arrayList0.add(list0.toString());
            }
        }
        if(hashSet0.contains("isTestDevice")) {
            arrayList0.add(Boolean.valueOf(zzm0.zzf));
        }
        if(hashSet0.contains("tagForChildDirectedTreatment")) {
            arrayList0.add(zzm0.zzg);
        }
        if(hashSet0.contains("manualImpressionsEnabled")) {
            arrayList0.add(Boolean.valueOf(zzm0.zzh));
        }
        if(hashSet0.contains("publisherProvidedId")) {
            arrayList0.add(zzm0.zzi);
        }
        if(hashSet0.contains("location")) {
            Location location0 = zzm0.zzk;
            if(location0 == null) {
                arrayList0.add(null);
            }
            else {
                arrayList0.add(location0.toString());
            }
        }
        if(hashSet0.contains("contentUrl")) {
            arrayList0.add(zzm0.zzl);
        }
        if(hashSet0.contains("networkExtras")) {
            arrayList0.add(zzfeh.zza(zzm0.zzm));
        }
        if(hashSet0.contains("customTargeting")) {
            arrayList0.add(zzfeh.zza(zzm0.zzn));
        }
        if(hashSet0.contains("categoryExclusions")) {
            List list1 = zzm0.zzo;
            if(list1 == null) {
                arrayList0.add(null);
            }
            else {
                arrayList0.add(list1.toString());
            }
        }
        if(hashSet0.contains("requestAgent")) {
            arrayList0.add(zzm0.zzp);
        }
        if(hashSet0.contains("requestPackage")) {
            arrayList0.add(zzm0.zzq);
        }
        if(hashSet0.contains("isDesignedForFamilies")) {
            arrayList0.add(Boolean.valueOf(zzm0.zzr));
        }
        if(hashSet0.contains("tagForUnderAgeOfConsent")) {
            arrayList0.add(zzm0.zzt);
        }
        if(hashSet0.contains("maxAdContentRating")) {
            arrayList0.add(zzm0.zzu);
        }
        if(hashSet0.contains("orientation")) {
            if(zzy0 == null) {
                arrayList0.add(null);
            }
            else {
                arrayList0.add(zzy0.zza);
            }
        }
        this.zza = arrayList0.toArray();
    }

    @Override  // com.google.android.gms.internal.ads.zzfeg
    public final boolean equals(Object object0) {
        return object0 instanceof zzfeh ? Arrays.equals(this.zza, ((zzfeh)object0).zza) : false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfeg
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override
    public final String toString() {
        return "[PoolKey#" + Arrays.hashCode(this.zza) + " " + Arrays.toString(this.zza) + "]";
    }

    private static String zza(Bundle bundle0) {
        String s;
        if(bundle0 == null) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: new TreeSet(bundle0.keySet())) {
            Object object1 = bundle0.get(((String)object0));
            if(object1 == null) {
                s = "null";
            }
            else {
                s = object1 instanceof Bundle ? zzfeh.zza(((Bundle)object1)) : object1.toString();
            }
            stringBuilder0.append(s);
        }
        return stringBuilder0.toString();
    }
}

