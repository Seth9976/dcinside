package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

public final class zzo {
    private static final Uri zza;
    @Nullable
    private final String zzb;
    @Nullable
    private final String zzc;
    @Nullable
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    static {
        zzo.zza = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public zzo(ComponentName componentName0, int v) {
        this.zzb = null;
        this.zzc = null;
        Preconditions.checkNotNull(componentName0);
        this.zzd = componentName0;
        this.zze = 0x1081;
        this.zzf = false;
    }

    public zzo(String s, int v, boolean z) {
        this(s, "com.google.android.gms", 0x1081, false);
    }

    public zzo(String s, String s1, int v, boolean z) {
        Preconditions.checkNotEmpty(s);
        this.zzb = s;
        Preconditions.checkNotEmpty(s1);
        this.zzc = s1;
        this.zzd = null;
        this.zze = 0x1081;
        this.zzf = z;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzo ? Objects.equal(this.zzb, ((zzo)object0).zzb) && Objects.equal(this.zzc, ((zzo)object0).zzc) && Objects.equal(this.zzd, ((zzo)object0).zzd) && this.zzf == ((zzo)object0).zzf : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, 0x1081, Boolean.valueOf(this.zzf)});
    }

    @Override
    public final String toString() {
        String s = this.zzb;
        if(s == null) {
            Preconditions.checkNotNull(this.zzd);
            return this.zzd.flattenToString();
        }
        return s;
    }

    @Nullable
    public final ComponentName zza() {
        return this.zzd;
    }

    public final Intent zzb(Context context0) throws zzaj {
        Bundle bundle1;
        ContentProviderClient contentProviderClient0;
        Intent intent0 = null;
        if(this.zzb != null) {
            if(this.zzf) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("serviceActionBundleKey", this.zzb);
                try {
                    contentProviderClient0 = context0.getContentResolver().acquireUnstableContentProviderClient(zzo.zza);
                    if(contentProviderClient0 == null) {
                        throw new RemoteException("Failed to acquire ContentProviderClient");
                    }
                }
                catch(RemoteException | IllegalArgumentException remoteException0) {
                    bundle1 = null;
                    goto label_19;
                }
                try {
                    bundle1 = contentProviderClient0.call("serviceIntentCall", null, bundle0);
                }
                catch(Throwable throwable0) {
                    try {
                        contentProviderClient0.release();
                        throw throwable0;
                    }
                    catch(RemoteException | IllegalArgumentException remoteException0) {
                    }
                    bundle1 = null;
                    goto label_19;
                }
                try {
                    contentProviderClient0.release();
                    goto label_20;
                }
                catch(RemoteException | IllegalArgumentException remoteException0) {
                }
            label_19:
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: " + remoteException0.toString());
            label_20:
                if(bundle1 != null) {
                    intent0 = (Intent)bundle1.getParcelable("serviceResponseIntentKey");
                    if(intent0 == null) {
                        PendingIntent pendingIntent0 = (PendingIntent)bundle1.getParcelable("serviceMissingResolutionIntentKey");
                        if(pendingIntent0 != null) {
                            Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action " + this.zzb + " but has possible resolution");
                            throw new zzaj(new ConnectionResult(25, pendingIntent0));
                        }
                    }
                }
                if(intent0 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: " + this.zzb);
                }
            }
            return intent0 == null ? new Intent(this.zzb).setPackage(this.zzc) : intent0;
        }
        return new Intent().setComponent(this.zzd);
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }
}

