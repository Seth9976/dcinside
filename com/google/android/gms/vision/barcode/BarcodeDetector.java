package com.google.android.gms.vision.barcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image.Plane;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzm;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import java.nio.ByteBuffer;

public final class BarcodeDetector extends Detector {
    public static class Builder {
        private Context zza;
        private zzk zzb;

        public Builder(@RecentlyNonNull Context context0) {
            this.zza = context0;
            this.zzb = new zzk();
        }

        @RecentlyNonNull
        public BarcodeDetector build() {
            return new BarcodeDetector(new zzm(this.zza, this.zzb), null);
        }

        @RecentlyNonNull
        public Builder setBarcodeFormats(int v) {
            this.zzb.zza = v;
            return this;
        }
    }

    private final zzm zza;

    private BarcodeDetector() {
        throw new IllegalStateException("Default constructor called");
    }

    private BarcodeDetector(zzm zzm0) {
        this.zza = zzm0;
    }

    BarcodeDetector(zzm zzm0, zzc zzc0) {
        this(zzm0);
    }

    @Override  // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public final SparseArray detect(@RecentlyNonNull Frame frame0) {
        Barcode[] arr_barcode;
        if(frame0 == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        zzs zzs0 = zzs.zza(frame0);
        if(frame0.getBitmap() != null) {
            Bitmap bitmap0 = (Bitmap)Preconditions.checkNotNull(frame0.getBitmap());
            arr_barcode = this.zza.zza(bitmap0, zzs0);
            if(arr_barcode == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        }
        else if(frame0.getPlanes() != null) {
            ByteBuffer byteBuffer0 = ((Image.Plane[])Preconditions.checkNotNull(frame0.getPlanes()))[0].getBuffer();
            zzs zzs1 = new zzs(((Image.Plane[])Preconditions.checkNotNull(frame0.getPlanes()))[0].getRowStride(), zzs0.zzb, zzs0.zzc, zzs0.zzd, zzs0.zze);
            ByteBuffer byteBuffer1 = (ByteBuffer)Preconditions.checkNotNull(byteBuffer0);
            arr_barcode = this.zza.zza(byteBuffer1, zzs1);
        }
        else {
            ByteBuffer byteBuffer2 = (ByteBuffer)Preconditions.checkNotNull(frame0.getGrayscaleImageData());
            arr_barcode = this.zza.zza(byteBuffer2, zzs0);
        }
        SparseArray sparseArray0 = new SparseArray(arr_barcode.length);
        for(int v = 0; v < arr_barcode.length; ++v) {
            Barcode barcode0 = arr_barcode[v];
            sparseArray0.append(barcode0.rawValue.hashCode(), barcode0);
        }
        return sparseArray0;
    }

    @Override  // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zza.zzb();
    }

    @Override  // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        this.zza.zzc();
    }
}

