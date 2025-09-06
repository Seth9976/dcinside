package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpa;

@KeepForSdk
public final class OutOfContextTestingActivity extends Activity {
    @NonNull
    @KeepForSdk
    public static final String AD_UNIT_KEY = "adUnit";
    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override  // android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        zzdu zzdu0 = zzbc.zza().zzh(this, new zzbpa());
        if(zzdu0 == null) {
            this.finish();
            return;
        }
        this.setContentView(layout.admob_empty_layout);
        LinearLayout linearLayout0 = (LinearLayout)this.findViewById(id.layout);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            this.finish();
            return;
        }
        String s = intent0.getStringExtra("adUnit");
        if(s == null) {
            this.finish();
            return;
        }
        try {
            zzdu0.zze(s, ObjectWrapper.wrap(this), ObjectWrapper.wrap(linearLayout0));
        }
        catch(RemoteException unused_ex) {
            this.finish();
        }
    }
}

