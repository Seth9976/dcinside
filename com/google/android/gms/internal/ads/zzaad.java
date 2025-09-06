package com.google.android.gms.internal.ads;

public final class zzaad implements zzfvf {
    @Override  // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        try {
            Class class0 = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object object0 = class0.getMethod("build", null).invoke(class0.getConstructor(null).newInstance(null), null);
            if(object0 == null) {
                throw null;
            }
            return (zzca)object0;
        }
        catch(Exception exception0) {
        }
        throw new IllegalStateException(exception0);
    }
}

