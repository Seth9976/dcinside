package com.google.android.gms.vision.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.internal.vision.zzan;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public final class TextRecognizer extends Detector {
    public static class Builder {
        private Context zza;
        private zzam zzb;

        public Builder(@RecentlyNonNull Context context0) {
            this.zza = context0;
            this.zzb = new zzam();
        }

        @RecentlyNonNull
        public TextRecognizer build() {
            return new TextRecognizer(new zzan(this.zza, this.zzb), null);
        }
    }

    private final zzan zza;

    private TextRecognizer() {
        throw new IllegalStateException("Default constructor called");
    }

    private TextRecognizer(zzan zzan0) {
        this.zza = zzan0;
    }

    TextRecognizer(zzan zzan0, zzb zzb0) {
        this(zzan0);
    }

    @Override  // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public final SparseArray detect(@RecentlyNonNull Frame frame0) {
        Bitmap bitmap0;
        byte[] arr_b;
        zzaj zzaj0 = new zzaj(new Rect());
        if(frame0 == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        zzs zzs0 = zzs.zza(frame0);
        if(frame0.getBitmap() == null) {
            ByteBuffer byteBuffer0 = (ByteBuffer)Preconditions.checkNotNull(frame0.getGrayscaleImageData());
            int v1 = frame0.getMetadata().getFormat();
            int v2 = zzs0.zza;
            int v3 = zzs0.zzb;
            if(!byteBuffer0.hasArray() || byteBuffer0.arrayOffset() != 0) {
                byte[] arr_b1 = new byte[byteBuffer0.capacity()];
                byteBuffer0.get(arr_b1);
                arr_b = arr_b1;
            }
            else {
                arr_b = byteBuffer0.array();
            }
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            new YuvImage(arr_b, v1, v2, v3, null).compressToJpeg(new Rect(0, 0, v2, v3), 100, byteArrayOutputStream0);
            byte[] arr_b2 = byteArrayOutputStream0.toByteArray();
            bitmap0 = BitmapFactory.decodeByteArray(arr_b2, 0, arr_b2.length);
        }
        else {
            bitmap0 = frame0.getBitmap();
        }
        Bitmap bitmap1 = zzw.zza(((Bitmap)Preconditions.checkNotNull(bitmap0)), zzs0);
        if(!zzaj0.zza.isEmpty()) {
            Rect rect0 = zzaj0.zza;
            int v4 = frame0.getMetadata().getWidth();
            int v5 = frame0.getMetadata().getHeight();
            switch(zzs0.zze) {
                case 1: {
                    rect0 = new Rect(v5 - rect0.bottom, rect0.left, v5 - rect0.top, rect0.right);
                    break;
                }
                case 2: {
                    rect0 = new Rect(v4 - rect0.right, v5 - rect0.bottom, v4 - rect0.left, v5 - rect0.top);
                    break;
                }
                case 3: {
                    rect0 = new Rect(rect0.top, v4 - rect0.right, rect0.bottom, v4 - rect0.left);
                }
            }
            zzaj0.zza.set(rect0);
        }
        zzs0.zze = 0;
        zzah[] arr_zzah = this.zza.zza(bitmap1, zzs0, zzaj0);
        SparseArray sparseArray0 = new SparseArray();
        for(int v6 = 0; v6 < arr_zzah.length; ++v6) {
            zzah zzah0 = arr_zzah[v6];
            SparseArray sparseArray1 = (SparseArray)sparseArray0.get(zzah0.zzf);
            if(sparseArray1 == null) {
                sparseArray1 = new SparseArray();
                sparseArray0.append(zzah0.zzf, sparseArray1);
            }
            sparseArray1.append(zzah0.zzg, zzah0);
        }
        SparseArray sparseArray2 = new SparseArray(sparseArray0.size());
        for(int v = 0; v < sparseArray0.size(); ++v) {
            sparseArray2.append(sparseArray0.keyAt(v), new TextBlock(((SparseArray)sparseArray0.valueAt(v))));
        }
        return sparseArray2;
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

