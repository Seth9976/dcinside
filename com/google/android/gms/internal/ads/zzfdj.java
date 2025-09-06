package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import jeb.synthetic.TWR;

public final class zzfdj implements Runnable {
    public final InputStream zza;
    public final ParcelFileDescriptor zzb;

    public zzfdj(InputStream inputStream0, ParcelFileDescriptor parcelFileDescriptor0) {
        this.zza = inputStream0;
        this.zzb = parcelFileDescriptor0;
    }

    @Override
    public final void run() {
        InputStream inputStream0;
        try {
            inputStream0 = this.zza;
            try(ParcelFileDescriptor.AutoCloseOutputStream parcelFileDescriptor$AutoCloseOutputStream0 = new ParcelFileDescriptor.AutoCloseOutputStream(this.zzb)) {
                IOUtils.copyStream(inputStream0, parcelFileDescriptor$AutoCloseOutputStream0);
            }
            goto label_9;
        }
        catch(Throwable throwable0) {
            try {
                TWR.safeClose$NT(inputStream0, throwable0);
                throw throwable0;
            label_9:
                if(inputStream0 != null) {
                    inputStream0.close();
                }
            }
            catch(IOException unused_ex) {
            }
        }
    }
}

