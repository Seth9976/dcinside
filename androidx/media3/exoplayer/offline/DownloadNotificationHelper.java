package androidx.media3.exoplayer.offline;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.R.string;
import java.util.List;

@UnstableApi
public final class DownloadNotificationHelper {
    @RequiresApi(0x1F)
    static final class Api31 {
        @SuppressLint({"WrongConstant"})
        @DoNotInline
        public static void a(Builder notificationCompat$Builder0) {
            notificationCompat$Builder0.W(1);
        }
    }

    private final Builder a;
    @StringRes
    private static final int b;

    public DownloadNotificationHelper(Context context0, String s) {
        this.a = new Builder(context0.getApplicationContext(), s);
    }

    public Notification a(Context context0, @DrawableRes int v, @Nullable PendingIntent pendingIntent0, @Nullable String s) {
        return this.c(context0, v, pendingIntent0, s, string.exo_download_completed);
    }

    public Notification b(Context context0, @DrawableRes int v, @Nullable PendingIntent pendingIntent0, @Nullable String s) {
        return this.c(context0, v, pendingIntent0, s, string.exo_download_failed);
    }

    private Notification c(Context context0, @DrawableRes int v, @Nullable PendingIntent pendingIntent0, @Nullable String s, @StringRes int v1) {
        return this.d(context0, v, pendingIntent0, s, v1, 0, 0, false, false, true);
    }

    private Notification d(Context context0, @DrawableRes int v, @Nullable PendingIntent pendingIntent0, @Nullable String s, @StringRes int v1, int v2, int v3, boolean z, boolean z1, boolean z2) {
        this.a.t0(v);
        BigTextStyle notificationCompat$BigTextStyle0 = null;
        String s1 = v1 == 0 ? null : context0.getResources().getString(v1);
        this.a.O(s1);
        this.a.M(pendingIntent0);
        Builder notificationCompat$Builder0 = this.a;
        if(s != null) {
            notificationCompat$BigTextStyle0 = new BigTextStyle().A(s);
        }
        notificationCompat$Builder0.z0(notificationCompat$BigTextStyle0);
        this.a.l0(v2, v3, z);
        this.a.i0(z1);
        this.a.r0(z2);
        if(Util.a >= 0x1F) {
            Api31.a(this.a);
        }
        return this.a.h();
    }

    public Notification e(Context context0, @DrawableRes int v, @Nullable PendingIntent pendingIntent0, @Nullable String s, List list0, int v1) {
        int v6;
        boolean z5;
        int v5;
        float f = 0.0f;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v3 = 0;
        boolean z3 = false;
        int v4 = 0;
        boolean z4 = true;
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            Download download0 = (Download)list0.get(v2);
            switch(download0.b) {
                case 0: {
                    z2 = true;
                    break;
                }
                case 5: {
                    z3 = true;
                    break;
                }
                case 2: 
                case 7: {
                    float f1 = download0.b();
                    if(f1 != -1.0f) {
                        f += f1;
                        z4 = false;
                    }
                    v3 |= (download0.a() <= 0L ? 0 : 1);
                    ++v4;
                    z1 = true;
                }
            }
        }
        if(z1) {
            v5 = string.exo_download_downloading;
            z5 = true;
        }
        else if(!z2 || v1 == 0) {
            v5 = z3 ? string.exo_download_removing : 0;
            z5 = true;
        }
        else {
            if((v1 & 2) == 0) {
                v6 = (v1 & 1) == 0 ? string.exo_download_paused : string.exo_download_paused_for_network;
            }
            else {
                v6 = string.exo_download_paused_for_wifi;
            }
            v5 = v6;
            z5 = false;
        }
        if(z5) {
            if(z1) {
                if(z4 && v3 != 0) {
                    z = true;
                }
                return this.d(context0, v, pendingIntent0, s, v5, 100, ((int)(f / ((float)v4))), z, true, false);
            }
            return this.d(context0, v, pendingIntent0, s, v5, 100, 0, true, true, false);
        }
        return this.d(context0, v, pendingIntent0, s, v5, 0, 0, false, true, false);
    }
}

