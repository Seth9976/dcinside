package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzdr {
    public static void zza(MediaFormat mediaFormat0, String s, int v) {
        if(v != -1) {
            mediaFormat0.setInteger(s, v);
        }
    }

    public static void zzb(MediaFormat mediaFormat0, List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            mediaFormat0.setByteBuffer("csd-" + v, ByteBuffer.wrap(((byte[])list0.get(v))));
        }
    }
}

