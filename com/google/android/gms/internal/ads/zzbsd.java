package com.google.android.gms.internal.ads;

import android.app.DownloadManager.Request;
import android.app.DownloadManager;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

final class zzbsd implements DialogInterface.OnClickListener {
    final String zza;
    final String zzb;
    final zzbsf zzc;

    zzbsd(zzbsf zzbsf0, String s, String s1) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzbsf0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        DownloadManager downloadManager0 = (DownloadManager)this.zzc.zzb.getSystemService("download");
        try {
            DownloadManager.Request downloadManager$Request0 = new DownloadManager.Request(Uri.parse(this.zza));
            downloadManager$Request0.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, this.zzb);
            downloadManager$Request0.allowScanningByMediaScanner();
            downloadManager$Request0.setNotificationVisibility(1);
            downloadManager0.enqueue(downloadManager$Request0);
        }
        catch(IllegalStateException unused_ex) {
            this.zzc.zzh("Could not store picture.");
        }
    }
}

