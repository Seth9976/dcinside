package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.ImageView.ScaleType;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import java.util.Map;
import org.json.JSONObject;

public interface zzdin {
    void zzA(View arg1, Map arg2);

    boolean zzB();

    boolean zzC();

    boolean zzD(Bundle arg1);

    int zza();

    JSONObject zze(View arg1, Map arg2, Map arg3, @Nullable ImageView.ScaleType arg4);

    JSONObject zzf(View arg1, Map arg2, Map arg3, @Nullable ImageView.ScaleType arg4);

    void zzh();

    void zzi();

    void zzj();

    void zzk(@Nullable zzdh arg1);

    void zzl(View arg1, View arg2, Map arg3, Map arg4, boolean arg5, @Nullable ImageView.ScaleType arg6);

    void zzm(String arg1);

    void zzn(Bundle arg1);

    void zzp(@Nullable View arg1, View arg2, Map arg3, Map arg4, boolean arg5, @Nullable ImageView.ScaleType arg6, int arg7);

    void zzq();

    void zzr(View arg1, Map arg2, Map arg3, @Nullable ImageView.ScaleType arg4);

    void zzs();

    void zzt(@Nullable View arg1, MotionEvent arg2, View arg3);

    void zzu(Bundle arg1);

    void zzv(View arg1);

    void zzw();

    void zzx(zzdd arg1);

    void zzy(zzbhq arg1);

    void zzz(View arg1, Map arg2, Map arg3, View.OnTouchListener arg4, View.OnClickListener arg5);
}

