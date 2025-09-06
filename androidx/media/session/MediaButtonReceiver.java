package androidx.media.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.PendingIntent;
import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {
    @RequiresApi(0x1F)
    static final class Api31 {
        @DoNotInline
        public static ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException0) {
            return (ForegroundServiceStartNotAllowedException)illegalStateException0;
        }

        @DoNotInline
        public static boolean b(IllegalStateException illegalStateException0) {
            return c.a(illegalStateException0);
        }
    }

    static class MediaButtonConnectionCallback extends android.support.v4.media.MediaBrowserCompat.c {
        private final Context c;
        private final Intent d;
        private final BroadcastReceiver.PendingResult e;
        private MediaBrowserCompat f;

        MediaButtonConnectionCallback(Context context0, Intent intent0, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
            this.c = context0;
            this.d = intent0;
            this.e = broadcastReceiver$PendingResult0;
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$c
        public void a() {
            Token mediaSessionCompat$Token0 = this.f.h();
            new MediaControllerCompat(this.c, mediaSessionCompat$Token0).d(((KeyEvent)this.d.getParcelableExtra("android.intent.extra.KEY_EVENT")));
            this.e();
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$c
        public void b() {
            this.e();
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$c
        public void c() {
            this.e();
        }

        private void e() {
            this.f.b();
            this.e.finish();
        }

        void f(MediaBrowserCompat mediaBrowserCompat0) {
            this.f = mediaBrowserCompat0;
        }
    }

    private static final String a = "MediaButtonReceiver";

    public static PendingIntent a(Context context0, long v) {
        ComponentName componentName0 = MediaButtonReceiver.c(context0);
        if(componentName0 == null) {
            Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn\'t build a pending intent.");
            return null;
        }
        return MediaButtonReceiver.b(context0, componentName0, v);
    }

    public static PendingIntent b(Context context0, ComponentName componentName0, long v) {
        if(componentName0 == null) {
            Log.w("MediaButtonReceiver", "The component name of media button receiver should be provided.");
            return null;
        }
        int v1 = PlaybackStateCompat.t(v);
        if(v1 == 0) {
            Log.w("MediaButtonReceiver", "Cannot build a media button pending intent with the given action: " + v);
            return null;
        }
        Intent intent0 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent0.setComponent(componentName0);
        int v2 = 0;
        intent0.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, v1));
        int v3 = Build.VERSION.SDK_INT;
        intent0.addFlags(0x10000000);
        if(v3 >= 0x1F) {
            v2 = 0x2000000;
        }
        return PendingIntent.getBroadcast(context0, v1, intent0, v2);
    }

    @RestrictTo({Scope.a})
    public static ComponentName c(Context context0) {
        Intent intent0 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent0.setPackage("com.dcinside.app.android");
        List list0 = context0.getPackageManager().queryBroadcastReceivers(intent0, 0);
        if(list0.size() == 1) {
            ActivityInfo activityInfo0 = ((ResolveInfo)list0.get(0)).activityInfo;
            return new ComponentName(activityInfo0.packageName, activityInfo0.name);
        }
        if(list0.size() > 1) {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        return null;
    }

    private static ComponentName d(Context context0, String s) {
        PackageManager packageManager0 = context0.getPackageManager();
        Intent intent0 = new Intent(s);
        intent0.setPackage("com.dcinside.app.android");
        List list0 = packageManager0.queryIntentServices(intent0, 0);
        if(list0.size() == 1) {
            ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
            return new ComponentName(serviceInfo0.packageName, serviceInfo0.name);
        }
        if(!list0.isEmpty()) {
            throw new IllegalStateException("Expected 1 service that handles " + s + ", found " + list0.size());
        }
        return null;
    }

    public static KeyEvent e(MediaSessionCompat mediaSessionCompat0, Intent intent0) {
        if(mediaSessionCompat0 != null && intent0 != null && "android.intent.action.MEDIA_BUTTON".equals(intent0.getAction()) && intent0.hasExtra("android.intent.extra.KEY_EVENT")) {
            KeyEvent keyEvent0 = (KeyEvent)intent0.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mediaSessionCompat0.e().d(keyEvent0);
            return keyEvent0;
        }
        return null;
    }

    @RequiresApi(0x1F)
    protected void f(@NonNull Intent intent0, @NonNull ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException0) {
        Log.e("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + foregroundServiceStartNotAllowedException0.getMessage());
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0 != null && "android.intent.action.MEDIA_BUTTON".equals(intent0.getAction()) && intent0.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName componentName0 = MediaButtonReceiver.d(context0, "android.intent.action.MEDIA_BUTTON");
            if(componentName0 != null) {
                intent0.setComponent(componentName0);
                try {
                    ContextCompat.startForegroundService(context0, intent0);
                }
                catch(IllegalStateException illegalStateException0) {
                    if(Build.VERSION.SDK_INT < 0x1F || !Api31.b(illegalStateException0)) {
                        throw illegalStateException0;
                    }
                    this.f(intent0, Api31.a(illegalStateException0));
                }
                return;
            }
            ComponentName componentName1 = MediaButtonReceiver.d(context0, "android.media.browse.MediaBrowserService");
            if(componentName1 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
            Context context1 = context0.getApplicationContext();
            MediaButtonConnectionCallback mediaButtonReceiver$MediaButtonConnectionCallback0 = new MediaButtonConnectionCallback(context1, intent0, broadcastReceiver$PendingResult0);
            MediaBrowserCompat mediaBrowserCompat0 = new MediaBrowserCompat(context1, componentName1, mediaButtonReceiver$MediaButtonConnectionCallback0, null);
            mediaButtonReceiver$MediaButtonConnectionCallback0.f(mediaBrowserCompat0);
            mediaBrowserCompat0.a();
            return;
        }
        Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent0);
    }
}

