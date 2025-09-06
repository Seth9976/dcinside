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

public final class zzan extends zzt {
    private final zzam zza;

    public zzan(Context context0, zzam zzam0) {
        super(context0, "TextNativeHandle", "ocr");
        this.zza = zzam0;
        this.zzd();
    }

    @Override  // com.google.android.gms.internal.vision.zzt
    @Nullable
    protected final Object zza(DynamiteModule dynamiteModule0, Context context0) throws RemoteException, LoadingException {
        zzaf zzaf0;
        IBinder iBinder0 = dynamiteModule0.instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
        if(iBinder0 == null) {
            zzaf0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            zzaf0 = iInterface0 instanceof zzaf ? ((zzaf)iInterface0) : new zzae(iBinder0);
        }
        return zzaf0 == null ? null : zzaf0.zza(ObjectWrapper.wrap(context0), ((zzam)Preconditions.checkNotNull(this.zza)));
    }

    @Override  // com.google.android.gms.internal.vision.zzt
    protected final void zza() throws RemoteException {
        ((zzad)Preconditions.checkNotNull(((zzad)this.zzd()))).zzb();
    }

    public final zzah[] zza(Bitmap bitmap0, zzs zzs0, zzaj zzaj0) {
        if(!this.zzb()) {
            return new zzah[0];
        }
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(bitmap0);
            return ((zzad)Preconditions.checkNotNull(((zzad)this.zzd()))).zza(iObjectWrapper0, zzs0, zzaj0);
        }
        catch(RemoteException remoteException0) {
            Log.e("TextNativeHandle", "Error calling native text recognizer", remoteException0);
            return new zzah[0];
        }
    }
}

