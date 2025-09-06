package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.List;
import o3.j;
import org.json.JSONException;
import org.json.JSONObject;

@j
public final class zzazj extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzaza zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzazj() {
        zzaza zzaza0 = new zzaza();
        super();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzaza0;
        this.zzc = new Object();
        this.zzf = ((Long)zzbec.zzd.zze()).intValue();
        this.zzg = ((Long)zzbec.zza.zze()).intValue();
        this.zzh = ((Long)zzbec.zze.zze()).intValue();
        this.zzi = ((Long)zzbec.zzc.zze()).intValue();
        this.zzj = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzae)));
        this.zzk = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzaf)));
        this.zzl = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzag)));
        this.zze = ((Long)zzbec.zzf.zze()).intValue();
        this.zzm = (String)zzbe.zzc().zza(zzbcl.zzai);
        this.zzn = ((Boolean)zzbe.zzc().zza(zzbcl.zzaj)).booleanValue();
        this.zzo = ((Boolean)zzbe.zzc().zza(zzbcl.zzak)).booleanValue();
        ((Boolean)zzbe.zzc().zza(zzbcl.zzal)).booleanValue();
        this.setName("ContentFetchTask");
    }

    @Override
    public final void run() {
        Activity activity0;
        View view0;
        while(true) {
            try {
                Context context0 = zzv.zzb().zzb();
                if(context0 != null) {
                    ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
                    KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
                    if(activityManager0 != null && keyguardManager0 != null) {
                        List list0 = activityManager0.getRunningAppProcesses();
                        if(list0 != null) {
                            Iterator iterator0 = list0.iterator();
                            while(true) {
                                if(!iterator0.hasNext()) {
                                    break;
                                }
                                Object object0 = iterator0.next();
                                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                                if(Process.myPid() == activityManager$RunningAppProcessInfo0.pid) {
                                    if(activityManager$RunningAppProcessInfo0.importance == 100 && !keyguardManager0.inKeyguardRestrictedInputMode()) {
                                        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
                                        if(powerManager0 != null && powerManager0.isScreenOn()) {
                                            goto label_21;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                try {
                    zzv.zzp().zzw(throwable0, "ContentFetchTask.isInForeground");
                label_18:
                    zzo.zze("ContentFetchTask: sleeping");
                    this.zze();
                    goto label_35;
                label_21:
                    view0 = null;
                    activity0 = zzv.zzb().zza();
                    if(activity0 == null) {
                        zzo.zze("ContentFetchThread: no activity. Sleeping.");
                        this.zze();
                        goto label_35;
                    }
                }
                catch(InterruptedException interruptedException0) {
                    zzo.zzh("Error in ContentFetchTask", interruptedException0);
                    goto label_43;
                }
                catch(Exception exception0) {
                    goto label_41;
                }
            }
            try {
                if(activity0.getWindow() != null && activity0.getWindow().getDecorView() != null) {
                    view0 = activity0.getWindow().getDecorView().findViewById(0x1020002);
                }
                goto label_33;
            }
            catch(Exception exception1) {
                try {
                    zzv.zzp().zzw(exception1, "ContentFetchTask.extractContent");
                    zzo.zze("Failed getting root view of activity. Content not extracted.");
                label_33:
                    if(view0 != null) {
                        view0.post(new zzazf(this, view0));
                    }
                label_35:
                    Thread.sleep(this.zze * 1000);
                    goto label_43;
                }
                catch(InterruptedException interruptedException0) {
                }
                catch(Exception exception0) {
                    goto label_41;
                }
            }
            zzo.zzh("Error in ContentFetchTask", interruptedException0);
            goto label_43;
        label_41:
            zzo.zzh("Error in ContentFetchTask", exception0);
            zzv.zzp().zzw(exception0, "ContentFetchTask.run");
        label_43:
            synchronized(this.zzc) {
                while(this.zzb) {
                    try {
                        zzo.zze("ContentFetchTask: waiting");
                        this.zzc.wait();
                    }
                    catch(InterruptedException unused_ex) {
                    }
                }
            }
        }
    }

    @VisibleForTesting
    final zzazi zza(@Nullable View view0, zzayz zzayz0) {
        if(view0 != null) {
            boolean z = view0.getGlobalVisibleRect(new Rect());
            if(!(view0 instanceof TextView) || view0 instanceof EditText) {
                if(view0 instanceof WebView && !(view0 instanceof zzcex)) {
                    zzayz0.zzf();
                    ((WebView)view0).post(new zzazh(this, zzayz0, ((WebView)view0), z));
                    return new zzazi(this, 0, 1);
                }
                if(view0 instanceof ViewGroup) {
                    int v1 = 0;
                    int v2 = 0;
                    for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                        zzazi zzazi0 = this.zza(((ViewGroup)view0).getChildAt(v), zzayz0);
                        v1 += zzazi0.zza;
                        v2 += zzazi0.zzb;
                    }
                    return new zzazi(this, v1, v2);
                }
            }
            else {
                CharSequence charSequence0 = ((TextView)view0).getText();
                if(!TextUtils.isEmpty(charSequence0)) {
                    zzayz0.zzh(charSequence0.toString(), z, view0.getX(), view0.getY(), ((float)view0.getWidth()), ((float)view0.getHeight()));
                    return new zzazi(this, 1, 0);
                }
            }
        }
        return new zzazi(this, 0, 0);
    }

    @VisibleForTesting
    final void zzb(View view0) {
        try {
            zzayz zzayz0 = new zzayz(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context context0 = zzv.zzb().zzb();
            if(context0 != null && !TextUtils.isEmpty(this.zzm)) {
                String s = (String)view0.getTag(context0.getResources().getIdentifier(((String)zzbe.zzc().zza(zzbcl.zzah)), "id", "com.dcinside.app.android"));
                if(s == null || !s.equals(this.zzm)) {
                    goto label_5;
                }
                return;
            }
        label_5:
            zzazi zzazi0 = this.zza(view0, zzayz0);
            zzayz0.zzj();
            if(zzazi0.zza == 0 && zzazi0.zzb == 0 || zzazi0.zzb == 0 && (zzayz0.zzb() == 0 || this.zzd.zzc(zzayz0))) {
                return;
            }
            this.zzd.zza(zzayz0);
            return;
        }
        catch(Exception exception0) {
        }
        zzo.zzh("Exception in fetchContentOnUIThread", exception0);
        zzv.zzp().zzw(exception0, "ContentFetchTask.fetchContent");
    }

    @VisibleForTesting
    final void zzc(zzayz zzayz0, WebView webView0, String s, boolean z) {
        zzayz0.zze();
        try {
            if(!TextUtils.isEmpty(s)) {
                String s1 = new JSONObject(s).optString("text");
                if(this.zzn || TextUtils.isEmpty(webView0.getTitle())) {
                    zzayz0.zzi(s1, z, webView0.getX(), webView0.getY(), ((float)webView0.getWidth()), ((float)webView0.getHeight()));
                }
                else {
                    zzayz0.zzi(webView0.getTitle() + "\n" + s1, z, webView0.getX(), webView0.getY(), ((float)webView0.getWidth()), ((float)webView0.getHeight()));
                }
            }
            if(zzayz0.zzl()) {
                this.zzd.zzb(zzayz0);
            }
            return;
        }
        catch(JSONException unused_ex) {
        }
        catch(Throwable throwable0) {
            zzo.zzf("Failed to get webview content.", throwable0);
            zzv.zzp().zzw(throwable0, "ContentFetchTask.processWebViewContent");
            return;
        }
        zzo.zze("Json string may be malformed.");
    }

    public final void zzd() {
        synchronized(this.zzc) {
            if(this.zza) {
                zzo.zze("Content hash thread already started, quitting...");
                return;
            }
            this.zza = true;
        }
        this.start();
    }

    public final void zze() {
        synchronized(this.zzc) {
            this.zzb = true;
            zzo.zze(("ContentFetchThread: paused, pause = " + true));
        }
    }
}

