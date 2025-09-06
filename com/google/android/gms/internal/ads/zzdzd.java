package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.common.util.concurrent.t0;
import java.io.InputStream;

public final class zzdzd implements zzgbo {
    public zzdzd(zzdzl zzdzl0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
        zzfdj zzfdj0 = new zzfdj(((InputStream)object0), arr_parcelFileDescriptor[1]);
        zzbzw.zza.execute(zzfdj0);
        return zzgch.zzh(parcelFileDescriptor0);
    }
}

