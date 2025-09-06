package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat.BigPictureStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.impl.R.id;
import com.google.android.gms.ads.impl.R.layout;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Timer;

public final class zzebv extends zzbsw {
    @VisibleForTesting
    final Map zza;
    private final Context zzb;
    private final zzdrw zzc;
    private final zzu zzd;
    private final zzebk zze;
    private String zzf;
    private String zzg;

    @VisibleForTesting
    public zzebv(Context context0, zzebk zzebk0, zzu zzu0, zzdrw zzdrw0) {
        this.zza = new HashMap();
        this.zzb = context0;
        this.zzc = zzdrw0;
        this.zzd = zzu0;
        this.zze = zzebk0;
    }

    public static void zzc(Context context0, zzdrw zzdrw0, zzebk zzebk0, String s, String s1) {
        zzebv.zzd(context0, zzdrw0, zzebk0, s, s1, new HashMap());
    }

    public static void zzd(Context context0, zzdrw zzdrw0, zzebk zzebk0, String s, String s1, Map map0) {
        String s3;
        String s2 = zzv.zzp().zzA(context0) ? "online" : "offline";
        if(zzdrw0 == null) {
            s3 = "";
        }
        else {
            zzdrv zzdrv0 = zzdrw0.zza();
            zzdrv0.zzb("gqi", s);
            zzdrv0.zzb("action", s1);
            zzdrv0.zzb("device_connectivity", s2);
            zzdrv0.zzb("event_timestamp", String.valueOf(zzv.zzC().currentTimeMillis()));
            for(Object object0: map0.entrySet()) {
                zzdrv0.zzb(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            s3 = zzdrv0.zze();
        }
        zzebk0.zzd(new zzebm(zzv.zzC().currentTimeMillis(), s, s3, 2));
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zze(Intent intent0) {
        SQLiteDatabase sQLiteDatabase0;
        String s = intent0.getStringExtra("offline_notification_action");
        if(!s.equals("offline_notification_clicked") && !s.equals("offline_notification_dismissed")) {
            return;
        }
        String s1 = intent0.getStringExtra("gws_query_id");
        String s2 = intent0.getStringExtra("uri");
        boolean z = zzv.zzp().zzA(this.zzb);
        HashMap hashMap0 = new HashMap();
        int v = 2;
        if(s.equals("offline_notification_clicked")) {
            hashMap0.put("offline_notification_action", "offline_notification_clicked");
            if(z) {
                v = 1;
            }
            hashMap0.put("obvs", "33");
            hashMap0.put("olaih", String.valueOf(s2.startsWith("http")));
            try {
                Intent intent1 = this.zzb.getPackageManager().getLaunchIntentForPackage(s2);
                if(intent1 == null) {
                    intent1 = new Intent("android.intent.action.VIEW");
                    intent1.setData(Uri.parse(s2));
                }
                intent1.addFlags(0x10000000);
                this.zzb.startActivity(intent1);
                hashMap0.put("olaa", "olas");
            }
            catch(ActivityNotFoundException unused_ex) {
                hashMap0.put("olaa", "olaf");
            }
        }
        else {
            hashMap0.put("offline_notification_action", "offline_notification_dismissed");
        }
        this.zzw(s1, "offline_notification_action", hashMap0);
        try {
            sQLiteDatabase0 = this.zze.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            zzo.zzg(("Failed to get writable offline buffering database: " + sQLiteException0.toString()));
            return;
        }
        if(v == 1) {
            this.zze.zzg(sQLiteDatabase0, this.zzd, s1);
            return;
        }
        zzebk.zzi(sQLiteDatabase0, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzf(String[] arr_s, int[] arr_v, IObjectWrapper iObjectWrapper0) {
        int v = 0;
        while(v < arr_s.length) {
            if(arr_s[v].equals("android.permission.POST_NOTIFICATIONS")) {
                zzebx zzebx0 = (zzebx)ObjectWrapper.unwrap(iObjectWrapper0);
                Activity activity0 = zzebx0.zza();
                zzm zzm0 = zzebx0.zzb();
                HashMap hashMap0 = new HashMap();
                if(arr_v[v] == 0) {
                    hashMap0.put("dialog_action", "confirm");
                    this.zzx();
                    this.zzz(activity0, zzm0);
                }
                else {
                    hashMap0.put("dialog_action", "dismiss");
                    if(zzm0 != null) {
                        zzm0.zzb();
                    }
                }
                this.zzw(this.zzf, "asnpdc", hashMap0);
                if(true) {
                    break;
                }
            }
            else {
                ++v;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzg(IObjectWrapper iObjectWrapper0) {
        zzebx zzebx0 = (zzebx)ObjectWrapper.unwrap(iObjectWrapper0);
        Activity activity0 = zzebx0.zza();
        zzm zzm0 = zzebx0.zzb();
        this.zzf = zzebx0.zzc();
        this.zzg = zzebx0.zzd();
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzip)).booleanValue()) {
            this.zzw(this.zzf, "dialog_impression", zzfxq.zzd());
            AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(activity0);
            alertDialog$Builder0.setTitle(zzebv.zzv(string.offline_opt_in_title, "Open ad when you\'re back online.")).setMessage(zzebv.zzv(string.offline_opt_in_message, "We\'ll send you a notification with a link to the advertiser site.")).setPositiveButton(zzebv.zzv(string.offline_opt_in_confirm, "OK"), (DialogInterface dialogInterface0, int v) -> {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("dialog_action", "confirm");
                this.zzw(this.zzf, "dialog_click", hashMap0);
                this.zzy(activity0, zzm0);
            }).setNegativeButton(zzebv.zzv(string.offline_opt_in_decline, "No thanks"), (DialogInterface dialogInterface0, int v) -> {
                this.zze.zzc(this.zzf);
                HashMap hashMap0 = new HashMap();
                hashMap0.put("dialog_action", "dismiss");
                this.zzw(this.zzf, "dialog_click", hashMap0);
                if(zzm0 != null) {
                    zzm0.zzb();
                }
            }).setOnCancelListener((DialogInterface dialogInterface0) -> {
                this.zze.zzc(this.zzf);
                HashMap hashMap0 = new HashMap();
                hashMap0.put("dialog_action", "dismiss");
                this.zzw(this.zzf, "dialog_click", hashMap0);
                if(zzm0 != null) {
                    zzm0.zzb();
                }
            });
            alertDialog$Builder0.create().show();
            return;
        }
        this.zzy(activity0, zzm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzh() {
        zzebd zzebd0 = new zzebd(this.zzd);
        this.zze.zze(zzebd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzi(IObjectWrapper iObjectWrapper0, String s, String s1) {
        this.zzj(iObjectWrapper0, new zza(s, s1, ""));
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzj(IObjectWrapper iObjectWrapper0, zza zza0) {
        String s3;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        String s = zza0.zzb;
        String s1 = zza0.zzc;
        String s2 = this.zzu();
        zzv.zzr().zzh(context0, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntent0 = zzebv.zzr(context0, "offline_notification_clicked", s, zza0.zza);
        PendingIntent pendingIntent1 = zzebv.zzr(context0, "offline_notification_dismissed", s, zza0.zza);
        Builder notificationCompat$Builder0 = new Builder(context0, "offline_notification_channel");
        if(TextUtils.isEmpty(s2)) {
            notificationCompat$Builder0.O(zzebv.zzv(string.offline_notification_title, "You are back online! Let\'s pick up where we left off"));
        }
        else {
            notificationCompat$Builder0.O(String.format(zzebv.zzv(string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), s2));
        }
        notificationCompat$Builder0.C(true).T(pendingIntent1).M(pendingIntent0).t0(context0.getApplicationInfo().icon).k0(((int)(((Integer)zzbe.zzc().zza(zzbcl.zziq)))));
        Bitmap bitmap0 = null;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzis)).booleanValue() && !s1.isEmpty()) {
            try {
                bitmap0 = BitmapFactory.decodeStream(new URL(s1).openConnection().getInputStream());
            }
            catch(IOException unused_ex) {
            }
        }
        if(bitmap0 != null) {
            try {
                notificationCompat$Builder0.b0(bitmap0).z0(new BigPictureStyle().D(bitmap0).B(null));
            }
            catch(Resources.NotFoundException unused_ex) {
            }
        }
        NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService("notification");
        HashMap hashMap0 = new HashMap();
        try {
            notificationManager0.notify(s, 0xD431, notificationCompat$Builder0.h());
            s3 = "offline_notification_impression";
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            hashMap0.put("notification_not_shown_reason", illegalArgumentException0.getMessage());
            s3 = "offline_notification_failed";
        }
        this.zzw(s, s3, hashMap0);
    }

    // 检测为 Lambda 实现
    final void zzk(Activity activity0, zzm zzm0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    final void zzl(zzm zzm0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    final void zzm(zzm zzm0, DialogInterface dialogInterface0) [...]

    // 检测为 Lambda 实现
    final void zzn(Activity activity0, zzm zzm0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    final void zzo(zzm zzm0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    final void zzp(zzm zzm0, DialogInterface dialogInterface0) [...]

    public final void zzq(String s, zzdif zzdif0) {
        String s1 = zzdif0.zzx();
        String s2 = zzdif0.zzB();
        String s3 = "";
        if(TextUtils.isEmpty(s1)) {
            s1 = s2 == null ? "" : s2;
        }
        zzbfw zzbfw0 = zzdif0.zzm();
        if(zzbfw0 != null) {
            try {
                s3 = zzbfw0.zze().toString();
            }
            catch(RemoteException unused_ex) {
            }
        }
        zzbfw zzbfw1 = zzdif0.zzn();
        Drawable drawable0 = null;
        if(zzbfw1 != null) {
            try {
                IObjectWrapper iObjectWrapper0 = zzbfw1.zzf();
                if(iObjectWrapper0 != null) {
                    drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
                }
            }
            catch(RemoteException unused_ex) {
            }
        }
        zzeay zzeay0 = new zzeay(s1, s3, drawable0);
        this.zza.put(s, zzeay0);
    }

    @VisibleForTesting
    public static final PendingIntent zzr(Context context0, String s, String s1, String s2) {
        Intent intent0 = new Intent();
        intent0.setAction(s);
        intent0.putExtra("offline_notification_action", s);
        intent0.putExtra("gws_query_id", s1);
        intent0.putExtra("uri", s2);
        if(Build.VERSION.SDK_INT >= 29 && s.equals("offline_notification_clicked")) {
            intent0.setClassName(context0, "com.google.android.gms.ads.NotificationHandlerActivity");
            return zzfrk.zza(context0, 0, intent0, 0xC000000);
        }
        intent0.setClassName(context0, "com.google.android.gms.ads.AdService");
        return zzfrk.zzb(context0, 0, intent0, zzfrk.zza | 0x40000000, 0);
    }

    private final AlertDialog zzs(Activity activity0, @Nullable zzm zzm0) {
        View view0;
        Drawable drawable0;
        AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(activity0).setOnCancelListener(new zzebn(zzm0));
        XmlResourceParser xmlResourceParser0 = zzebv.zzt(layout.offline_ads_dialog);
        if(xmlResourceParser0 == null) {
            alertDialog$Builder0.setMessage(zzebv.zzv(string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you\'re back online."));
            return alertDialog$Builder0.create();
        }
        try {
            drawable0 = null;
            view0 = activity0.getLayoutInflater().inflate(xmlResourceParser0, null);
        }
        catch(Resources.NotFoundException unused_ex) {
            alertDialog$Builder0.setMessage(zzebv.zzv(string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you\'re back online."));
            return alertDialog$Builder0.create();
        }
        alertDialog$Builder0.setView(view0);
        String s = this.zzu();
        if(!TextUtils.isEmpty(s)) {
            TextView textView0 = (TextView)view0.findViewById(id.offline_dialog_advertiser_name);
            textView0.setVisibility(0);
            textView0.setText(s);
        }
        zzebc zzebc0 = (zzebc)this.zza.get(this.zzf);
        if(zzebc0 != null) {
            drawable0 = zzebc0.zza();
        }
        if(drawable0 != null) {
            ((ImageView)view0.findViewById(id.offline_dialog_image)).setImageDrawable(drawable0);
        }
        AlertDialog alertDialog0 = alertDialog$Builder0.create();
        alertDialog0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return alertDialog0;
    }

    @Nullable
    private static XmlResourceParser zzt(int v) {
        Resources resources0 = zzv.zzp().zze();
        if(resources0 == null) {
            return null;
        }
        try {
            return resources0.getLayout(v);
        }
        catch(Resources.NotFoundException unused_ex) {
            return null;
        }
    }

    @Nullable
    private final String zzu() {
        zzebc zzebc0 = (zzebc)this.zza.get(this.zzf);
        return zzebc0 == null ? "" : zzebc0.zzb();
    }

    private static String zzv(int v, String s) {
        Resources resources0 = zzv.zzp().zze();
        if(resources0 == null) {
            return s;
        }
        try {
            return resources0.getString(v);
        }
        catch(Resources.NotFoundException unused_ex) {
            return s;
        }
    }

    private final void zzw(String s, String s1, Map map0) {
        zzebv.zzd(this.zzb, this.zzc, this.zze, s, s1, map0);
    }

    private final void zzx() {
        try {
            zzbr zzbr0 = zzs.zzA(this.zzb);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zzb);
            String s = this.zzg;
            String s1 = this.zzf;
            zzebc zzebc0 = (zzebc)this.zza.get(s1);
            boolean z = false;
            z = zzbr0.zzg(iObjectWrapper0, new zza(s, s1, (zzebc0 == null ? "" : zzebc0.zzc())));
            if(!z) {
                z = zzbr0.zzf(ObjectWrapper.wrap(this.zzb), this.zzg, this.zzf);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Failed to schedule offline notification poster.", remoteException0);
        }
        if(!z) {
            this.zze.zzc(this.zzf);
            this.zzw(this.zzf, "offline_notification_worker_not_scheduled", zzfxq.zzd());
        }
    }

    private final void zzy(Activity activity0, @Nullable zzm zzm0) {
        if(!NotificationManagerCompat.q(activity0).a()) {
            if(Build.VERSION.SDK_INT < 33) {
                AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(activity0);
                alertDialog$Builder0.setTitle(zzebv.zzv(string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzebv.zzv(string.notifications_permission_confirm, "Allow"), (DialogInterface dialogInterface0, int v) -> {
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put("dialog_action", "confirm");
                    this.zzw(this.zzf, "rtsdc", hashMap0);
                    activity0.startActivity(zzv.zzr().zzf(activity0));
                    this.zzx();
                    if(zzm0 != null) {
                        zzm0.zzb();
                    }
                }).setNegativeButton(zzebv.zzv(string.notifications_permission_decline, "Don\'t allow"), (DialogInterface dialogInterface0, int v) -> {
                    this.zze.zzc(this.zzf);
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put("dialog_action", "dismiss");
                    this.zzw(this.zzf, "rtsdc", hashMap0);
                    if(zzm0 != null) {
                        zzm0.zzb();
                    }
                }).setOnCancelListener((DialogInterface dialogInterface0) -> {
                    this.zze.zzc(this.zzf);
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put("dialog_action", "dismiss");
                    this.zzw(this.zzf, "rtsdc", hashMap0);
                    if(zzm0 != null) {
                        zzm0.zzb();
                    }
                });
                alertDialog$Builder0.create().show();
                this.zzw(this.zzf, "rtsdi", zzfxq.zzd());
                return;
            }
            activity0.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 0x3039);
            this.zzw(this.zzf, "asnpdi", zzfxq.zzd());
            return;
        }
        this.zzx();
        this.zzz(activity0, zzm0);
    }

    private final void zzz(Activity activity0, @Nullable zzm zzm0) {
        AlertDialog alertDialog0 = this.zzs(activity0, zzm0);
        alertDialog0.show();
        Timer timer0 = new Timer();
        timer0.schedule(new zzebu(this, alertDialog0, timer0, zzm0), 3000L);
    }
}

