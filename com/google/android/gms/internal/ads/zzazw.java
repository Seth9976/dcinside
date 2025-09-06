package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.IOException;
import java.text.Normalizer.Form;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public final class zzazw {
    private final zzazl zza;
    private final int zzb;
    private final int zzc;

    public zzazw(int v, int v1, int v2) {
        this.zzb = v;
        if(v1 > 0x40 || v1 < 0) {
            v1 = 0x40;
        }
        this.zzc = v2 <= 0 ? 1 : v2;
        this.zza = new zzazu(v1);
    }

    public final String zza(ArrayList arrayList0, ArrayList arrayList1) {
        Iterator iterator0;
        zzazn zzazn0;
        Collections.sort(arrayList1, new zzazv(this));
        HashSet hashSet0 = new HashSet();
        int v = 0;
        while(v < arrayList1.size()) {
            String[] arr_s = Normalizer.normalize(((CharSequence)arrayList0.get(((zzazk)arrayList1.get(v)).zze())), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if(arr_s.length != 0) {
                int v1 = 0;
                while(v1 < arr_s.length) {
                    String s = arr_s[v1];
                    if(s.contains("\'")) {
                        StringBuilder stringBuilder0 = new StringBuilder(s);
                        boolean z = false;
                        for(int v2 = 1; v2 + 2 <= stringBuilder0.length(); ++v2) {
                            if(stringBuilder0.charAt(v2) == 39) {
                                if(stringBuilder0.charAt(v2 - 1) == 0x20) {
                                    stringBuilder0.setCharAt(v2, ' ');
                                }
                                else {
                                    switch(stringBuilder0.charAt(v2 + 1)) {
                                        case 83: 
                                        case 0x73: {
                                            if(v2 + 2 == stringBuilder0.length() || stringBuilder0.charAt(v2 + 2) == 0x20) {
                                                stringBuilder0.insert(v2, ' ');
                                                v2 += 2;
                                            }
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                        String s1 = z ? stringBuilder0.toString() : null;
                        if(s1 != null) {
                            s = s1;
                        }
                    }
                    String[] arr_s1 = zzazp.zzb(s, true);
                    if(arr_s1.length >= this.zzc) {
                        int v3 = 0;
                    label_32:
                        while(v3 < arr_s1.length) {
                            String s2 = "";
                            for(int v4 = 0; v4 < this.zzc; ++v4) {
                                int v5 = v3 + v4;
                                if(v5 >= arr_s1.length) {
                                    break label_32;
                                }
                                if(v4 > 0) {
                                    s2 = s2 + " ";
                                }
                                s2 = s2 + arr_s1[v5];
                            }
                            hashSet0.add(s2);
                            if(hashSet0.size() < this.zzb) {
                                ++v3;
                                continue;
                            }
                            else {
                                zzazn0 = new zzazn();
                                iterator0 = hashSet0.iterator();
                            }
                            goto label_62;
                        }
                        if(hashSet0.size() < this.zzb) {
                            ++v1;
                            continue;
                        }
                        else {
                            zzazn0 = new zzazn();
                            iterator0 = hashSet0.iterator();
                        }
                    }
                    else {
                        ++v1;
                        continue;
                    }
                    goto label_62;
                }
            }
            ++v;
        }
        zzazn0 = new zzazn();
        iterator0 = hashSet0.iterator();
    label_62:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s3 = (String)object0;
            try {
                byte[] arr_b = this.zza.zzb(s3);
                zzazn0.zzb.write(arr_b);
            }
            catch(IOException iOException0) {
                zzo.zzh("Error while writing hash to byteStream", iOException0);
                if(true) {
                    break;
                }
            }
        }
        return zzazn0.toString();
    }
}

