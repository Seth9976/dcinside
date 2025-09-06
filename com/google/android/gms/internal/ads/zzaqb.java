package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeSet;
import jeb.synthetic.FIN;

public class zzaqb implements zzapf {
    protected final zzaqd zza;
    private final zzaqa zzb;

    public zzaqb(zzaqa zzaqa0) {
        zzaqd zzaqd0 = new zzaqd(0x1000);
        super();
        this.zzb = zzaqa0;
        this.zza = zzaqd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzapf
    public zzapi zza(zzapm zzapm0) throws zzapv {
        zzaqo zzaqo0;
        byte[] arr_b1;
        byte[] arr_b;
        int v4;
        zzaqq zzaqq0;
        zzaqd zzaqd0;
        InputStream inputStream0;
        List list0;
        int v2;
        zzaqk zzaqk0;
        Map map0;
        long v = SystemClock.elapsedRealtime();
        while(true) {
            Collections.emptyList();
            try {
                zzaov zzaov0 = zzapm0.zzd();
                if(zzaov0 == null) {
                    map0 = Collections.emptyMap();
                }
                else {
                    HashMap hashMap0 = new HashMap();
                    String s = zzaov0.zzb;
                    if(s != null) {
                        hashMap0.put("If-None-Match", s);
                    }
                    long v1 = zzaov0.zzd;
                    if(v1 > 0L) {
                        hashMap0.put("If-Modified-Since", zzaqj.zzc(v1));
                    }
                    map0 = hashMap0;
                }
                zzaqk0 = this.zzb.zza(zzapm0, map0);
            }
            catch(IOException iOException0) {
                zzaqk0 = null;
                goto label_76;
            }
            try {
                v2 = zzaqk0.zzb();
                list0 = zzaqk0.zzd();
                if(v2 == 304) {
                    long v3 = SystemClock.elapsedRealtime() - v;
                    zzaov zzaov1 = zzapm0.zzd();
                    if(zzaov1 == null) {
                        return new zzapi(304, null, true, v3, list0);
                    }
                    TreeSet treeSet0 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    if(!list0.isEmpty()) {
                        for(Object object0: list0) {
                            treeSet0.add(((zzape)object0).zza());
                        }
                    }
                    ArrayList arrayList0 = new ArrayList(list0);
                    List list1 = zzaov1.zzh;
                    if(list1 != null) {
                        if(!list1.isEmpty()) {
                            for(Object object2: zzaov1.zzh) {
                                zzape zzape0 = (zzape)object2;
                                if(!treeSet0.contains(zzape0.zza())) {
                                    arrayList0.add(zzape0);
                                }
                            }
                        }
                    }
                    else if(!zzaov1.zzg.isEmpty()) {
                        for(Object object1: zzaov1.zzg.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object1;
                            if(!treeSet0.contains(map$Entry0.getKey())) {
                                arrayList0.add(new zzape(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue())));
                            }
                        }
                    }
                    return new zzapi(304, zzaov1.zza, true, v3, arrayList0);
                }
                inputStream0 = zzaqk0.zzc();
                if(inputStream0 == null) {
                    goto label_73;
                }
                else {
                    zzaqd0 = this.zza;
                    zzaqq0 = new zzaqq(zzaqd0, zzaqk0.zza());
                    v4 = FIN.finallyOpen$NT();
                    arr_b = zzaqd0.zzb(0x400);
                    int v5;
                    while((v5 = inputStream0.read(arr_b)) != -1) {
                        zzaqq0.write(arr_b, 0, v5);
                    }
                    arr_b1 = zzaqq0.toByteArray();
                    goto label_65;
                }
                goto label_78;
            }
            catch(IOException iOException0) {
                goto label_76;
            }
            try {
            label_65:
                FIN.finallyCodeBegin$NT(v4);
                inputStream0.close();
                goto label_69;
            }
            catch(IOException unused_ex) {
                try {
                    zzapy.zzd("Error occurred when closing InputStream", new Object[0]);
                label_69:
                    zzaqd0.zza(arr_b);
                    zzaqq0.close();
                    FIN.finallyCodeEnd$NT(v4);
                    goto label_78;
                label_73:
                    arr_b1 = new byte[0];
                    goto label_78;
                }
                catch(IOException iOException0) {
                }
            }
        label_76:
            byte[] arr_b2 = null;
            goto label_91;
            try {
            label_78:
                long v6 = SystemClock.elapsedRealtime() - v;
                if(zzapy.zzb || v6 > 3000L) {
                    Long long0 = v6;
                    Integer integer0 = arr_b1 == null ? "null" : ((int)arr_b1.length);
                    zzapy.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[]{zzapm0, long0, integer0, v2, zzapm0.zzy().zza()});
                }
                if(v2 < 200 || v2 > 299) {
                    throw new IOException();
                }
                return new zzapi(v2, arr_b1, false, SystemClock.elapsedRealtime() - v, list0);
            label_90:
                arr_b2 = arr_b1;
            }
            catch(IOException iOException0) {
                goto label_90;
            }
        label_91:
            if(iOException0 instanceof SocketTimeoutException) {
                zzaqo0 = new zzaqo("socket", new zzapu(), null);
            }
            else {
                if(iOException0 instanceof MalformedURLException) {
                    break;
                }
                if(zzaqk0 == null) {
                    throw new zzapj(iOException0);
                }
                int v7 = zzaqk0.zzb();
                zzapy.zzb("Unexpected response code %d for %s", new Object[]{v7, zzapm0.zzk()});
                if(arr_b2 == null) {
                    zzaqo0 = new zzaqo("network", new zzaph(), null);
                }
                else {
                    List list2 = zzaqk0.zzd();
                    zzapi zzapi0 = new zzapi(v7, arr_b2, false, SystemClock.elapsedRealtime() - v, list2);
                    if(v7 != 401 && v7 != 403) {
                        if(!(v7 >= 400 && v7 <= 0x1F3)) {
                            throw new zzapt(zzapi0);
                        }
                        throw new zzaoz(zzapi0);
                    }
                    zzaqo0 = new zzaqo("auth", new zzaou(zzapi0), null);
                }
            }
            zzapa zzapa0 = zzapm0.zzy();
            int v8 = zzapm0.zzb();
            try {
                zzapa0.zzc(zzaqo0.zzb);
            }
            catch(zzapv zzapv0) {
                zzapm0.zzm(String.format("%s-timeout-giveup [timeout=%s]", zzaqo0.zza, v8));
                throw zzapv0;
            }
            zzapm0.zzm(String.format("%s-retry [timeout=%s]", zzaqo0.zza, v8));
        }
        throw new RuntimeException("Bad URL " + zzapm0.zzk(), iOException0);
    }
}

