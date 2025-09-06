package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;

@Class(creator = "LargeParcelTeleporterCreator")
@Reserved({1})
public final class zzbvi extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    ParcelFileDescriptor zza;
    private Parcelable zzb;
    private boolean zzc;

    static {
        zzbvi.CREATOR = new zzbvj();
    }

    @Constructor
    public zzbvi(@Param(id = 2) ParcelFileDescriptor parcelFileDescriptor0) {
        this.zza = parcelFileDescriptor0;
        this.zzb = null;
        this.zzc = true;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        byte[] arr_b;
        ParcelFileDescriptor.AutoCloseOutputStream parcelFileDescriptor$AutoCloseOutputStream0;
        if(this.zza == null) {
            Parcel parcel1 = Parcel.obtain();
            try {
                this.zzb.writeToParcel(parcel1, 0);
                arr_b = parcel1.marshall();
            }
            finally {
                parcel1.recycle();
            }
            ParcelFileDescriptor parcelFileDescriptor0 = null;
            try {
                ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
                parcelFileDescriptor$AutoCloseOutputStream0 = null;
                parcelFileDescriptor$AutoCloseOutputStream0 = new ParcelFileDescriptor.AutoCloseOutputStream(arr_parcelFileDescriptor[1]);
                zzbvh zzbvh0 = new zzbvh(parcelFileDescriptor$AutoCloseOutputStream0, arr_b);
                zzbzw.zza.execute(zzbvh0);
                parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
            }
            catch(IOException iOException0) {
                zzo.zzh("Error transporting the ad response", iOException0);
                zzv.zzp().zzw(iOException0, "LargeParcelTeleporter.pipeData.2");
                IOUtils.closeQuietly(parcelFileDescriptor$AutoCloseOutputStream0);
            }
            this.zza = parcelFileDescriptor0;
        }
        int v2 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zza, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v2);
    }

    public final SafeParcelable zza(Parcelable.Creator parcelable$Creator0) {
        byte[] arr_b;
        int v1;
        if(this.zzc) {
            if(this.zza == null) {
                zzo.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream0 = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                v1 = dataInputStream0.readInt();
                arr_b = new byte[v1];
                dataInputStream0.readFully(arr_b, 0, v1);
            }
            catch(IOException iOException0) {
                zzo.zzh("Could not read from parcel file descriptor", iOException0);
                return null;
            }
            finally {
                IOUtils.closeQuietly(dataInputStream0);
            }
            Parcel parcel0 = Parcel.obtain();
            try {
                parcel0.unmarshall(arr_b, 0, v1);
                parcel0.setDataPosition(0);
                this.zzb = (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
            }
            finally {
                parcel0.recycle();
            }
            this.zzc = false;
            return (SafeParcelable)this.zzb;
        }
        return (SafeParcelable)this.zzb;
    }
}

