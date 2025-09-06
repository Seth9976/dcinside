package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

public final class zzbrz extends zzbsi {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbrz(zzcex zzcex0, Map map0) {
        super(zzcex0, "createCalendarEvent");
        this.zza = map0;
        this.zzb = zzcex0.zzi();
        this.zzc = this.zze("description");
        this.zzf = this.zze("summary");
        this.zzd = this.zzd("start_ticks");
        this.zze = this.zzd("end_ticks");
        this.zzg = this.zze("location");
    }

    final Intent zzb() {
        Intent intent0 = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        intent0.putExtra("title", this.zzc);
        intent0.putExtra("eventLocation", this.zzg);
        intent0.putExtra("description", this.zzf);
        long v = this.zzd;
        if(v > -1L) {
            intent0.putExtra("beginTime", v);
        }
        long v1 = this.zze;
        if(v1 > -1L) {
            intent0.putExtra("endTime", v1);
        }
        intent0.setFlags(0x10000000);
        return intent0;
    }

    public final void zzc() {
        if(this.zzb == null) {
            this.zzh("Activity context is not available.");
            return;
        }
        if(!new zzbbt(this.zzb).zzb()) {
            this.zzh("This feature is not available on the device.");
            return;
        }
        AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(this.zzb);
        Resources resources0 = zzv.zzp().zze();
        alertDialog$Builder0.setTitle((resources0 == null ? "Create calendar event" : resources0.getString(string.s5)));
        alertDialog$Builder0.setMessage((resources0 == null ? "Allow Ad to create a calendar event?" : resources0.getString(string.s6)));
        alertDialog$Builder0.setPositiveButton((resources0 == null ? "Accept" : resources0.getString(string.s3)), new zzbrx(this));
        alertDialog$Builder0.setNegativeButton((resources0 == null ? "Decline" : resources0.getString(string.s4)), new zzbry(this));
        alertDialog$Builder0.create().show();
    }

    private final long zzd(String s) {
        String s1 = (String)this.zza.get(s);
        if(s1 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s1);
        }
        catch(NumberFormatException unused_ex) {
            return -1L;
        }
    }

    // 去混淆评级： 低(20)
    private final String zze(String s) {
        return TextUtils.isEmpty(((CharSequence)this.zza.get(s))) ? "" : ((String)this.zza.get(s));
    }
}

