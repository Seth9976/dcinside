package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;

public final class zzm extends zzt {
    private final zzk zza;

    public zzm(Context context0, zzk zzk0) {
        super(context0, "BarcodeNativeHandle", "barcode");
        this.zza = zzk0;
        this.zzd();
    }

    @Override  // com.google.android.gms.internal.vision.zzt
    @Nullable
    protected final Object zza(DynamiteModule dynamiteModule0, Context context0) throws RemoteException, LoadingException {
        zzn zzn0;
        IBinder iBinder0 = dynamiteModule0.instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if(iBinder0 == null) {
            zzn0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            zzn0 = iInterface0 instanceof zzn ? ((zzn)iInterface0) : new zzp(iBinder0);
        }
        return zzn0 == null ? null : zzn0.zza(ObjectWrapper.wrap(context0), ((zzk)Preconditions.checkNotNull(this.zza)));
    }

    @Override  // com.google.android.gms.internal.vision.zzt
    protected final void zza() throws RemoteException {
        if(this.zzb()) {
            ((zzl)Preconditions.checkNotNull(((zzl)this.zzd()))).zza();
        }
    }

    public final Barcode[] zza(Bitmap bitmap0, zzs zzs0) {
        if(!this.zzb()) {
            return new Barcode[0];
        }
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(bitmap0);
            return ((zzl)Preconditions.checkNotNull(((zzl)this.zzd()))).zzb(iObjectWrapper0, zzs0);
        }
        catch(RemoteException remoteException0) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", remoteException0);
            return new Barcode[0];
        }
    }

    public final Barcode[] zza(ByteBuffer byteBuffer0, zzs zzs0) {
        if(!this.zzb()) {
            return new Barcode[0];
        }
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(byteBuffer0);
            return ((zzl)Preconditions.checkNotNull(((zzl)this.zzd()))).zza(iObjectWrapper0, zzs0);
        }
        catch(RemoteException remoteException0) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", remoteException0);
            return new Barcode[0];
        }
    }
}

