package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

public interface zzsd {
    int zza();

    int zzb(MediaCodec.BufferInfo arg1);

    MediaFormat zzc();

    @Nullable
    ByteBuffer zzf(int arg1);

    @Nullable
    ByteBuffer zzg(int arg1);

    @RequiresApi(35)
    void zzi();

    void zzj();

    void zzk(int arg1, int arg2, int arg3, long arg4, int arg5);

    void zzl(int arg1, int arg2, zzhe arg3, long arg4, int arg5);

    void zzm();

    void zzn(int arg1, long arg2);

    void zzo(int arg1, boolean arg2);

    @RequiresApi(23)
    void zzp(Surface arg1);

    void zzq(Bundle arg1);

    void zzr(int arg1);

    boolean zzs(zzsc arg1);
}

