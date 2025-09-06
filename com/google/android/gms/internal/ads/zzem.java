package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzem implements zzax {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    static {
        zzem.CREATOR = new zzek();
    }

    zzem(Parcel parcel0, zzel zzel0) {
        String s = parcel0.readString();
        this.zza = s;
        byte[] arr_b = parcel0.createByteArray();
        this.zzb = arr_b;
        this.zzc = parcel0.readInt();
        int v = parcel0.readInt();
        this.zzd = v;
        zzem.zzb(s, arr_b, v);
    }

    public zzem(String s, byte[] arr_b, int v, int v1) {
        zzem.zzb(s, arr_b, v1);
        this.zza = s;
        this.zzb = arr_b;
        this.zzc = v;
        this.zzd = v1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzem.class == class0 && this.zza.equals(((zzem)object0).zza) && Arrays.equals(this.zzb, ((zzem)object0).zzb) && this.zzc == ((zzem)object0).zzc && this.zzd == ((zzem)object0).zzd;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzb);
        return (((this.zza.hashCode() + 0x20F) * 0x1F + v) * 0x1F + this.zzc) * 0x1F + this.zzd;
    }

    @Override
    public final String toString() {
        String s;
        int v = 0;
        switch(this.zzd) {
            case 0: {
                if(this.zza.equals("editable.tracks.map")) {
                    zzcw.zzg(this.zza.equals("editable.tracks.map"), "Metadata is not an editable tracks map");
                    int v1 = this.zzb[1];
                    ArrayList arrayList0 = new ArrayList();
                    while(v < v1) {
                        arrayList0.add(((int)this.zzb[v + 2]));
                        ++v;
                    }
                    StringBuilder stringBuilder0 = new StringBuilder();
                    stringBuilder0.append("track types = ");
                    zzfuf.zzb(stringBuilder0, arrayList0, ",");
                    return "mdta: key=" + this.zza + ", value=" + stringBuilder0.toString();
                }
                break;
            }
            case 1: {
                return "mdta: key=" + this.zza + ", value=" + zzei.zzB(this.zzb);
            }
            case 23: {
                s = String.valueOf(Float.intBitsToFloat(zzgaq.zzd(this.zzb)));
                return "mdta: key=" + this.zza + ", value=" + s;
            }
            case 67: {
                s = String.valueOf(zzgaq.zzd(this.zzb));
                return "mdta: key=" + this.zza + ", value=" + s;
            }
            case 75: {
                return "mdta: key=" + this.zza + ", value=" + (this.zzb[0] & 0xFF);
            }
            case 78: {
                s = String.valueOf(new zzdy(this.zzb).zzw());
                return "mdta: key=" + this.zza + ", value=" + s;
            }
        }
        byte[] arr_b = this.zzb;
        StringBuilder stringBuilder1 = new StringBuilder(arr_b.length + arr_b.length);
        while(v < arr_b.length) {
            stringBuilder1.append(Character.forDigit(arr_b[v] >> 4 & 15, 16));
            stringBuilder1.append(Character.forDigit(arr_b[v] & 15, 16));
            ++v;
        }
        return "mdta: key=" + this.zza + ", value=" + stringBuilder1.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeByteArray(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeInt(this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzat0) {
    }

    private static void zzb(String s, byte[] arr_b, int v) {
        boolean z = true;
        switch(s) {
            case "com.android.capture.fps": {
                if(v != 23 || arr_b.length != 4) {
                    z = false;
                }
                zzcw.zzd(z);
                return;
            }
            case "editable.tracks.length": 
            case "editable.tracks.offset": {
                if(v != 78 || arr_b.length != 8) {
                    z = false;
                }
                zzcw.zzd(z);
                return;
            }
            case "editable.tracks.map": {
                if(v != 0) {
                    z = false;
                }
                zzcw.zzd(z);
                return;
            }
            case "editable.tracks.samples.location": {
                if(v != 75 || arr_b.length != 1) {
                    z = false;
                }
                else {
                    switch(arr_b[0]) {
                        case 0: 
                        case 1: {
                            break;
                        }
                        default: {
                            z = false;
                        }
                    }
                }
                zzcw.zzd(z);
            }
        }
    }
}

