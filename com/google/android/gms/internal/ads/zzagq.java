package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class zzagq extends zzagh {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    public final String zza;
    public final zzfxn zzb;

    static {
        zzagq.CREATOR = new zzagp();
    }

    public zzagq(String s, @Nullable String s1, List list0) {
        super(s);
        zzcw.zzd(!list0.isEmpty());
        this.zza = s1;
        zzfxn zzfxn0 = zzfxn.zzl(list0);
        this.zzb = zzfxn0;
        String s2 = (String)zzfxn0.get(0);
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzagq.class == class0 && Objects.equals(this.zzf, ((zzagq)object0).zzf) && Objects.equals(this.zza, ((zzagq)object0).zza) && this.zzb.equals(((zzagq)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzf.hashCode();
        return this.zza == null ? (v + 0x20F) * 961 + this.zzb.hashCode() : ((v + 0x20F) * 0x1F + this.zza.hashCode()) * 0x1F + this.zzb.hashCode();
    }

    @Override  // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zzf);
        parcel0.writeString(this.zza);
        parcel0.writeStringArray(((String[])this.zzb.toArray(new String[0])));
    }

    @Override  // com.google.android.gms.internal.ads.zzagh
    public final void zza(zzat zzat0) {
        switch(this.zzf) {
            case "TAL": 
            case "TALB": {
                zzat0.zzd(((CharSequence)this.zzb.get(0)));
                return;
            }
            case "TCM": 
            case "TCOM": {
                zzat0.zzf(((CharSequence)this.zzb.get(0)));
                return;
            }
            case "TCON": {
                Integer integer1 = zzgaq.zzf(((String)this.zzb.get(0)), 10);
                if(integer1 == null) {
                    zzat0.zzi(((CharSequence)this.zzb.get(0)));
                    return;
                }
                String s1 = zzagi.zza(((int)integer1));
                if(s1 == null) {
                    return;
                }
                zzat0.zzi(s1);
                return;
            }
            case "TDA": 
            case "TDAT": {
                try {
                    String s = (String)this.zzb.get(0);
                    int v = Integer.parseInt(s.substring(2, 4));
                    int v1 = Integer.parseInt(s.substring(0, 2));
                    zzat0.zzk(v);
                    zzat0.zzj(v1);
                }
                catch(NumberFormatException | StringIndexOutOfBoundsException unused_ex) {
                }
                return;
            }
            case "TDRC": {
                List list1 = zzagq.zzb(((String)this.zzb.get(0)));
                switch(list1.size()) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        zzat0.zzk(((Integer)list1.get(1)));
                        break;
                    }
                    case 3: {
                        zzat0.zzj(((Integer)list1.get(2)));
                        zzat0.zzk(((Integer)list1.get(1)));
                        break;
                    }
                    default: {
                        return;
                    }
                }
                zzat0.zzl(((Integer)list1.get(0)));
                return;
            }
            case "TDRL": {
                List list0 = zzagq.zzb(((String)this.zzb.get(0)));
                switch(list0.size()) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        zzat0.zzn(((Integer)list0.get(1)));
                        break;
                    }
                    case 3: {
                        zzat0.zzm(((Integer)list0.get(2)));
                        zzat0.zzn(((Integer)list0.get(1)));
                        break;
                    }
                    default: {
                        return;
                    }
                }
                zzat0.zzo(((Integer)list0.get(0)));
                return;
            }
            case "TEXT": 
            case "TXT": {
                zzat0.zzt(((CharSequence)this.zzb.get(0)));
                return;
            }
            case "TIT2": 
            case "TT2": {
                zzat0.zzq(((CharSequence)this.zzb.get(0)));
                return;
            }
            case "TP1": 
            case "TPE1": {
                zzat0.zze(((CharSequence)this.zzb.get(0)));
                return;
            }
            case "TPE2": 
            case "TP2": {
                zzat0.zzc(((CharSequence)this.zzb.get(0)));
                return;
            }
            case "TP3": 
            case "TPE3": {
                zzat0.zzg(((CharSequence)this.zzb.get(0)));
                return;
            }
            case "TRCK": 
            case "TRK": {
                String[] arr_s = ((String)this.zzb.get(0)).split("/", -1);
                try {
                    int v2 = Integer.parseInt(arr_s[0]);
                    Integer integer0 = arr_s.length <= 1 ? null : Integer.parseInt(arr_s[1]);
                    zzat0.zzs(v2);
                    zzat0.zzr(integer0);
                }
                catch(NumberFormatException unused_ex) {
                }
                return;
            }
            case "TYE": 
            case "TYER": {
                try {
                    zzat0.zzl(Integer.parseInt(((String)this.zzb.get(0))));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
        }
    }

    private static List zzb(String s) {
        List list0 = new ArrayList();
        try {
            if(s.length() >= 10) {
                list0.add(Integer.parseInt(s.substring(0, 4)));
                list0.add(Integer.parseInt(s.substring(5, 7)));
                list0.add(Integer.parseInt(s.substring(8, 10)));
                return list0;
            }
            if(s.length() >= 7) {
                list0.add(Integer.parseInt(s.substring(0, 4)));
                list0.add(Integer.parseInt(s.substring(5, 7)));
                return list0;
            }
            if(s.length() >= 4) {
                list0.add(Integer.parseInt(s.substring(0, 4)));
            }
            return list0;
        }
        catch(NumberFormatException unused_ex) {
            return new ArrayList();
        }
    }
}

