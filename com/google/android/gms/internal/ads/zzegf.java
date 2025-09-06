package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class zzegf implements zzecw {
    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        String s = zzfbo0.zzv.optString("pubid", "");
        zzfcj zzfcj0 = zzfca0.zza.zza;
        zzfch zzfch0 = new zzfch();
        zzfch0.zzq(zzfcj0);
        zzfch0.zzt(s);
        Bundle bundle0 = zzegf.zzd(zzfcj0.zzd.zzm);
        Bundle bundle1 = zzegf.zzd(bundle0.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundle1.putInt("gw", 1);
        String s1 = zzfbo0.zzv.optString("mad_hac", null);
        if(s1 != null) {
            bundle1.putString("mad_hac", s1);
        }
        String s2 = zzfbo0.zzv.optString("adJson", null);
        if(s2 != null) {
            bundle1.putString("_ad", s2);
        }
        bundle1.putBoolean("_noRefresh", true);
        Iterator iterator0 = zzfbo0.zzD.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s3 = (String)object0;
            String s4 = zzfbo0.zzD.optString(s3, null);
            if(s3 != null) {
                bundle1.putString(s3, s4);
            }
        }
        bundle0.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle1);
        zzfch0.zzH(new zzm(zzfcj0.zzd.zza, zzfcj0.zzd.zzb, bundle1, zzfcj0.zzd.zzd, zzfcj0.zzd.zze, zzfcj0.zzd.zzf, zzfcj0.zzd.zzg, zzfcj0.zzd.zzh, zzfcj0.zzd.zzi, zzfcj0.zzd.zzj, zzfcj0.zzd.zzk, zzfcj0.zzd.zzl, bundle0, zzfcj0.zzd.zzn, zzfcj0.zzd.zzo, zzfcj0.zzd.zzp, zzfcj0.zzd.zzq, zzfcj0.zzd.zzr, zzfcj0.zzd.zzs, zzfcj0.zzd.zzt, zzfcj0.zzd.zzu, zzfcj0.zzd.zzv, zzfcj0.zzd.zzw, zzfcj0.zzd.zzx, zzfcj0.zzd.zzy, zzfcj0.zzd.zzz));
        zzfcj zzfcj1 = zzfch0.zzJ();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList(zzfca0.zzb.zzb.zza));
        bundle3.putInt("refresh_interval", zzfca0.zzb.zzb.zzc);
        bundle3.putString("gws_query_id", zzfca0.zzb.zzb.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", zzfca0.zza.zza.zzf);
        bundle4.putString("allocation_id", zzfbo0.zzw);
        bundle4.putString("ad_source_name", zzfbo0.zzF);
        bundle4.putStringArrayList("click_urls", new ArrayList(zzfbo0.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList(zzfbo0.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList(zzfbo0.zzp));
        bundle4.putStringArrayList("fill_urls", new ArrayList(zzfbo0.zzm));
        bundle4.putStringArrayList("video_start_urls", new ArrayList(zzfbo0.zzg));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList(zzfbo0.zzh));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList(zzfbo0.zzi));
        bundle4.putString("transaction_id", zzfbo0.zzj);
        bundle4.putString("valid_from_timestamp", zzfbo0.zzk);
        bundle4.putBoolean("is_closable_area_disabled", zzfbo0.zzP);
        bundle4.putString("recursive_server_response_data", zzfbo0.zzao);
        bundle4.putBoolean("is_analytics_logging_enabled", zzfbo0.zzW);
        if(zzfbo0.zzl != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzfbo0.zzl.zzb);
            bundle5.putString("rb_type", zzfbo0.zzl.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return this.zzc(zzfcj1, bundle2, zzfbo0, zzfca0);
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        return !TextUtils.isEmpty(zzfbo0.zzv.optString("pubid", ""));
    }

    protected abstract t0 zzc(zzfcj arg1, Bundle arg2, zzfbo arg3, zzfca arg4);

    private static Bundle zzd(Bundle bundle0) {
        return bundle0 == null ? new Bundle() : new Bundle(bundle0);
    }
}

