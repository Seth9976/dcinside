package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;

public final class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        zzr zzr0 = null;
        byte[] arr_b = null;
        int[] arr_v = null;
        String[] arr_s = null;
        int[] arr_v1 = null;
        byte[][] arr2_b = null;
        ExperimentTokens[] arr_experimentTokens = null;
        boolean z = true;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v1)) {
                case 2: {
                    zzr0 = (zzr)SafeParcelReader.createParcelable(parcel0, v1, zzr.CREATOR);
                    break;
                }
                case 3: {
                    arr_b = SafeParcelReader.createByteArray(parcel0, v1);
                    break;
                }
                case 4: {
                    arr_v = SafeParcelReader.createIntArray(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_s = SafeParcelReader.createStringArray(parcel0, v1);
                    break;
                }
                case 6: {
                    arr_v1 = SafeParcelReader.createIntArray(parcel0, v1);
                    break;
                }
                case 7: {
                    arr2_b = SafeParcelReader.createByteArrayArray(parcel0, v1);
                    break;
                }
                case 8: {
                    z = SafeParcelReader.readBoolean(parcel0, v1);
                    break;
                }
                case 9: {
                    arr_experimentTokens = (ExperimentTokens[])SafeParcelReader.createTypedArray(parcel0, v1, ExperimentTokens.CREATOR);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v1);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zze(zzr0, arr_b, arr_v, arr_s, arr_v1, arr2_b, z, arr_experimentTokens);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zze[v];
    }
}

