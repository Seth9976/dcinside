package com.google.android.gms.vision.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image.Plane;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.internal.client.zzb;
import com.google.android.gms.vision.face.internal.client.zzf;
import com.google.android.gms.vision.zzc;
import java.nio.ByteBuffer;
import java.util.HashSet;
import p3.a;

public final class FaceDetector extends Detector {
    public static class Builder {
        private final Context zza;
        private int zzb;
        private boolean zzc;
        private int zzd;
        private boolean zze;
        private int zzf;
        private float zzg;

        public Builder(@RecentlyNonNull Context context0) {
            this.zzb = 0;
            this.zzc = false;
            this.zzd = 0;
            this.zze = true;
            this.zzf = 0;
            this.zzg = -1.0f;
            this.zza = context0;
        }

        @RecentlyNonNull
        public FaceDetector build() {
            zzf zzf0 = new zzf();
            zzf0.zza = this.zzf;
            zzf0.zzb = this.zzb;
            zzf0.zzc = this.zzd;
            zzf0.zzd = this.zzc;
            zzf0.zze = this.zze;
            zzf0.zzf = this.zzg;
            if(!FaceDetector.zzb(zzf0)) {
                throw new IllegalArgumentException("Invalid build options");
            }
            return new FaceDetector(new zzb(this.zza, zzf0), null);
        }

        @RecentlyNonNull
        public Builder setClassificationType(int v) {
            if(v != 0 && v != 1) {
                throw new IllegalArgumentException("Invalid classification type: " + v);
            }
            this.zzd = v;
            return this;
        }

        @RecentlyNonNull
        public Builder setLandmarkType(int v) {
            if(v != 0 && v != 1 && v != 2) {
                throw new IllegalArgumentException("Invalid landmark type: " + v);
            }
            this.zzb = v;
            return this;
        }

        @RecentlyNonNull
        public Builder setMinFaceSize(float f) {
            if(f < 0.0f || f > 1.0f) {
                throw new IllegalArgumentException("Invalid proportional face size: " + f);
            }
            this.zzg = f;
            return this;
        }

        @RecentlyNonNull
        public Builder setMode(int v) {
            if(v != 0 && v != 1 && v != 2) {
                throw new IllegalArgumentException("Invalid mode: " + v);
            }
            this.zzf = v;
            return this;
        }

        @RecentlyNonNull
        public Builder setProminentFaceOnly(boolean z) {
            this.zzc = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setTrackingEnabled(boolean z) {
            this.zze = z;
            return this;
        }
    }

    public static final int ACCURATE_MODE = 1;
    public static final int ALL_CLASSIFICATIONS = 1;
    public static final int ALL_LANDMARKS = 1;
    public static final int CONTOUR_LANDMARKS = 2;
    public static final int FAST_MODE = 0;
    public static final int NO_CLASSIFICATIONS = 0;
    public static final int NO_LANDMARKS = 0;
    public static final int SELFIE_MODE = 2;
    private final zzc zza;
    @a("lock")
    private final zzb zzb;
    private final Object zzc;
    @a("lock")
    private boolean zzd;

    private FaceDetector() {
        this.zza = new zzc();
        this.zzc = new Object();
        this.zzd = true;
        throw new IllegalStateException("Default constructor called");
    }

    private FaceDetector(zzb zzb0) {
        this.zza = new zzc();
        this.zzc = new Object();
        this.zzd = true;
        this.zzb = zzb0;
    }

    FaceDetector(zzb zzb0, zza zza0) {
        this(zzb0);
    }

    @Override  // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public final SparseArray detect(@RecentlyNonNull Frame frame0) {
        Face[] arr_face;
        if(frame0 == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        if(frame0.getPlanes() != null && ((Image.Plane[])Preconditions.checkNotNull(frame0.getPlanes())).length == 3) {
            synchronized(this.zzc) {
                if(this.zzd) {
                    Image.Plane[] arr_image$Plane = (Image.Plane[])Preconditions.checkNotNull(frame0.getPlanes());
                    zzs zzs0 = zzs.zza(frame0);
                    arr_face = this.zzb.zza(arr_image$Plane, zzs0);
                    goto label_26;
                }
            }
            throw new IllegalStateException("Cannot use detector after release()");
        }
        ByteBuffer byteBuffer0 = frame0.getBitmap() == null ? frame0.getGrayscaleImageData() : zzw.zza(((Bitmap)Preconditions.checkNotNull(frame0.getBitmap())), true);
        synchronized(this.zzc) {
            if(this.zzd) {
                ByteBuffer byteBuffer1 = (ByteBuffer)Preconditions.checkNotNull(byteBuffer0);
                zzs zzs1 = zzs.zza(frame0);
                arr_face = this.zzb.zza(byteBuffer1, zzs1);
            label_26:
                HashSet hashSet0 = new HashSet();
                SparseArray sparseArray0 = new SparseArray(arr_face.length);
                int v3 = 0;
                for(int v2 = 0; v2 < arr_face.length; ++v2) {
                    Face face0 = arr_face[v2];
                    int v4 = face0.getId();
                    v3 = Math.max(v3, v4);
                    if(hashSet0.contains(v4)) {
                        v4 = v3 + 1;
                        v3 = v4;
                    }
                    hashSet0.add(v4);
                    sparseArray0.append(this.zza.zza(v4), face0);
                }
                return sparseArray0;
            }
        }
        throw new IllegalStateException("Cannot use detector after release()");
    }

    @Override
    protected final void finalize() throws Throwable {
        try {
            Object object0 = this.zzc;
            synchronized(object0) {
                if(this.zzd) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    this.release();
                }
            }
        }
        finally {
            super.finalize();
        }
    }

    @Override  // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zzb.zzb();
    }

    @Override  // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        synchronized(this.zzc) {
            if(!this.zzd) {
                return;
            }
            this.zzb.zzc();
            this.zzd = false;
        }
    }

    @Override  // com.google.android.gms.vision.Detector
    public final boolean setFocus(int v) {
        int v1 = this.zza.zzb(v);
        synchronized(this.zzc) {
            if(this.zzd) {
                return this.zzb.zza(v1);
            }
        }
        throw new RuntimeException("Cannot use detector after release()");
    }

    private static boolean zzb(zzf zzf0) {
        boolean z;
        if(zzf0.zza == 2 || zzf0.zzb != 2) {
            z = true;
        }
        else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z = false;
        }
        if(zzf0.zzb == 2 && zzf0.zzc == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
            return false;
        }
        return z;
    }
}

