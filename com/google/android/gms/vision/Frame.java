package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image.Plane;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.nio.ByteBuffer;
import o3.h;

public class Frame {
    public static class Builder {
        private final Frame zza;

        public Builder() {
            this.zza = new Frame(null);
        }

        @RecentlyNonNull
        public Frame build() {
            if(this.zza.zzb == null && this.zza.zzd == null && this.zza.zzc == null) {
                throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            }
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setBitmap(@RecentlyNonNull Bitmap bitmap0) {
            int v = bitmap0.getWidth();
            int v1 = bitmap0.getHeight();
            this.zza.zzd = bitmap0;
            Metadata frame$Metadata0 = this.zza.getMetadata();
            frame$Metadata0.zza = v;
            frame$Metadata0.zzb = v1;
            return this;
        }

        @RecentlyNonNull
        public Builder setId(int v) {
            this.zza.getMetadata().zzc = v;
            return this;
        }

        @RecentlyNonNull
        public Builder setImageData(@RecentlyNonNull ByteBuffer byteBuffer0, int v, int v1, int v2) {
            if(byteBuffer0 == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if(byteBuffer0.capacity() < v * v1) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            if(v2 != 16 && v2 != 17 && v2 != 842094169) {
                throw new IllegalArgumentException("Unsupported image format: " + v2);
            }
            this.zza.zzb = byteBuffer0;
            Metadata frame$Metadata0 = this.zza.getMetadata();
            frame$Metadata0.zza = v;
            frame$Metadata0.zzb = v1;
            frame$Metadata0.zzf = v2;
            return this;
        }

        @RecentlyNonNull
        @RequiresApi(19)
        @KeepForSdk
        public Builder setPlanes(@RecentlyNonNull Image.Plane[] arr_image$Plane, int v, int v1, int v2) {
            if(arr_image$Plane == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if(arr_image$Plane.length != 3) {
                throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
            }
            if(arr_image$Plane[0].getBuffer().capacity() < v * v1) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            zza frame$zza0 = new zza(arr_image$Plane);
            this.zza.zzc = frame$zza0;
            Metadata frame$Metadata0 = this.zza.getMetadata();
            frame$Metadata0.zza = v;
            frame$Metadata0.zzb = v1;
            frame$Metadata0.zzf = v2;
            return this;
        }

        @RecentlyNonNull
        public Builder setRotation(int v) {
            this.zza.getMetadata().zze = v;
            return this;
        }

        @RecentlyNonNull
        public Builder setTimestampMillis(long v) {
            this.zza.getMetadata().zzd = v;
            return this;
        }
    }

    public static class Metadata {
        private int zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private int zze;
        private int zzf;

        public Metadata() {
            this.zzf = -1;
        }

        public Metadata(@RecentlyNonNull Metadata frame$Metadata0) {
            this.zzf = -1;
            this.zza = frame$Metadata0.getWidth();
            this.zzb = frame$Metadata0.getHeight();
            this.zzc = frame$Metadata0.getId();
            this.zzd = frame$Metadata0.getTimestampMillis();
            this.zze = frame$Metadata0.getRotation();
            this.zzf = frame$Metadata0.getFormat();
        }

        public int getFormat() {
            return this.zzf;
        }

        public int getHeight() {
            return this.zzb;
        }

        public int getId() {
            return this.zzc;
        }

        public int getRotation() {
            return this.zze;
        }

        public long getTimestampMillis() {
            return this.zzd;
        }

        public int getWidth() {
            return this.zza;
        }

        public final void zza() {
            if(this.zze % 2 != 0) {
                int v = this.zza;
                this.zza = this.zzb;
                this.zzb = v;
            }
            this.zze = 0;
        }
    }

    static final class zza {
        private final Image.Plane[] zza;

        zza(Image.Plane[] arr_image$Plane) {
            this.zza = arr_image$Plane;
        }

        final Image.Plane[] zza() {
            return this.zza;
        }
    }

    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    private final Metadata zza;
    @h
    private ByteBuffer zzb;
    @RequiresApi(19)
    @h
    private zza zzc;
    @h
    private Bitmap zzd;

    private Frame() {
        this.zza = new Metadata();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    Frame(zzb zzb0) {
    }

    @RecentlyNullable
    public Bitmap getBitmap() {
        return this.zzd;
    }

    @RecentlyNullable
    public ByteBuffer getGrayscaleImageData() {
        Bitmap bitmap0 = this.zzd;
        if(bitmap0 != null) {
            if(bitmap0 == null) {
                return null;
            }
            int v = bitmap0.getWidth();
            int v1 = this.zzd.getHeight();
            int v2 = v * v1;
            int[] arr_v = new int[v2];
            this.zzd.getPixels(arr_v, 0, v, 0, 0, v, v1);
            byte[] arr_b = new byte[v2];
            for(int v3 = 0; v3 < v2; ++v3) {
                arr_b[v3] = (byte)(((int)(((float)Color.red(arr_v[v3])) * 0.299f + ((float)Color.green(arr_v[v3])) * 0.587f + ((float)Color.blue(arr_v[v3])) * 0.114f)));
            }
            return ByteBuffer.wrap(arr_b);
        }
        return this.zzb;
    }

    @RecentlyNonNull
    public Metadata getMetadata() {
        return this.zza;
    }

    @RecentlyNullable
    @RequiresApi(19)
    @KeepForSdk
    public Image.Plane[] getPlanes() {
        return this.zzc == null ? null : this.zzc.zza();
    }
}

