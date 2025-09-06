package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbte;

@KeepForSdk
public final class AdActivity extends Activity {
    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    @Nullable
    private zzbte zza;

    @Override  // android.app.Activity
    protected final void onActivityResult(int v, int v1, @NonNull Intent intent0) {
        zzbte zzbte0 = this.zza;
        if(zzbte0 != null) {
            try {
                zzbte0.zzh(v, v1, intent0);
            }
            catch(Exception exception0) {
                zzo.zzl("#007 Could not call remote method.", exception0);
            }
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // android.app.Activity
    public final void onBackPressed() {
        try {
            if(this.zza == null || this.zza.zzH()) {
                goto label_4;
            }
            return;
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    label_4:
        super.onBackPressed();
        try {
            zzbte zzbte0 = this.zza;
            if(zzbte0 != null) {
                zzbte0.zzi();
            }
        }
        catch(RemoteException remoteException1) {
            zzo.zzl("#007 Could not call remote method.", remoteException1);
        }
    }

    @Override  // android.app.Activity
    public final void onConfigurationChanged(@NonNull Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        try {
            zzbte zzbte0 = this.zza;
            if(zzbte0 != null) {
                zzbte0.zzk(ObjectWrapper.wrap(configuration0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        zzbte zzbte0 = zzbc.zza().zzq(this);
        this.zza = zzbte0;
        if(zzbte0 != null) {
            try {
                zzbte0.zzl(bundle0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
            return;
        }
        zzo.zzl("#007 Could not call remote method.", null);
        this.finish();
    }

    @Override  // android.app.Activity
    protected final void onDestroy() {
        zzbte zzbte0 = this.zza;
        if(zzbte0 != null) {
            try {
                zzbte0.zzm();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        super.onDestroy();
    }

    @Override  // android.app.Activity
    protected final void onPause() {
        zzbte zzbte0 = this.zza;
        if(zzbte0 != null) {
            try {
                zzbte0.zzo();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
        }
        super.onPause();
    }

    @Override  // android.app.Activity
    public final void onRequestPermissionsResult(int v, @NonNull String[] arr_s, @NonNull int[] arr_v) {
        try {
            zzbte zzbte0 = this.zza;
            if(zzbte0 != null) {
                zzbte0.zzp(v, arr_s, arr_v);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbte zzbte0 = this.zza;
            if(zzbte0 != null) {
                zzbte0.zzq();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbte zzbte0 = this.zza;
            if(zzbte0 != null) {
                zzbte0.zzr();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected final void onSaveInstanceState(@NonNull Bundle bundle0) {
        zzbte zzbte0 = this.zza;
        if(zzbte0 != null) {
            try {
                zzbte0.zzs(bundle0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
        }
        super.onSaveInstanceState(bundle0);
    }

    @Override  // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbte zzbte0 = this.zza;
            if(zzbte0 != null) {
                zzbte0.zzt();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected final void onStop() {
        zzbte zzbte0 = this.zza;
        if(zzbte0 != null) {
            try {
                zzbte0.zzu();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
        }
        super.onStop();
    }

    @Override  // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbte zzbte0 = this.zza;
            if(zzbte0 != null) {
                zzbte0.zzv();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // android.app.Activity
    public final void setContentView(int v) {
        super.setContentView(v);
        this.zza();
    }

    @Override  // android.app.Activity
    public final void setContentView(@NonNull View view0) {
        super.setContentView(view0);
        this.zza();
    }

    @Override  // android.app.Activity
    public final void setContentView(@NonNull View view0, @NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(view0, viewGroup$LayoutParams0);
        this.zza();
    }

    private final void zza() {
        zzbte zzbte0 = this.zza;
        if(zzbte0 != null) {
            try {
                zzbte0.zzx();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

