package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;

class MediaSessionManagerImplBase implements MediaSessionManagerImpl {
    static class RemoteUserInfoImplBase implements RemoteUserInfoImpl {
        private String a;
        private int b;
        private int c;

        RemoteUserInfoImplBase(String s, int v, int v1) {
            this.a = s;
            this.b = v;
            this.c = v1;
        }

        @Override  // androidx.media.MediaSessionManager$RemoteUserInfoImpl
        public int a() {
            return this.c;
        }

        @Override  // androidx.media.MediaSessionManager$RemoteUserInfoImpl
        public int b() {
            return this.b;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RemoteUserInfoImplBase)) {
                return false;
            }
            return this.b < 0 || ((RemoteUserInfoImplBase)object0).b < 0 ? TextUtils.equals(this.a, ((RemoteUserInfoImplBase)object0).a) && this.c == ((RemoteUserInfoImplBase)object0).c : TextUtils.equals(this.a, ((RemoteUserInfoImplBase)object0).a) && this.b == ((RemoteUserInfoImplBase)object0).b && this.c == ((RemoteUserInfoImplBase)object0).c;
        }

        @Override  // androidx.media.MediaSessionManager$RemoteUserInfoImpl
        public String getPackageName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return ObjectsCompat.b(new Object[]{this.a, this.c});
        }
    }

    Context a;
    ContentResolver b;
    private static final String c = "MediaSessionManager";
    private static final boolean d = false;
    private static final String e = "android.permission.STATUS_BAR_SERVICE";
    private static final String f = "android.permission.MEDIA_CONTENT_CONTROL";
    private static final String g = "enabled_notification_listeners";

    static {
        MediaSessionManagerImplBase.d = MediaSessionManager.c;
    }

    MediaSessionManagerImplBase(Context context0) {
        this.a = context0;
        this.b = context0.getContentResolver();
    }

    @Override  // androidx.media.MediaSessionManager$MediaSessionManagerImpl
    public boolean a(@NonNull RemoteUserInfoImpl mediaSessionManager$RemoteUserInfoImpl0) {
        try {
            if(this.a.getPackageManager().getApplicationInfo(mediaSessionManager$RemoteUserInfoImpl0.getPackageName(), 0) == null) {
                return false;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            if(MediaSessionManagerImplBase.d) {
                Log.d("MediaSessionManager", "Package " + mediaSessionManager$RemoteUserInfoImpl0.getPackageName() + " doesn\'t exist");
            }
            return false;
        }
        return this.c(mediaSessionManager$RemoteUserInfoImpl0, "android.permission.STATUS_BAR_SERVICE") || this.c(mediaSessionManager$RemoteUserInfoImpl0, "android.permission.MEDIA_CONTENT_CONTROL") || mediaSessionManager$RemoteUserInfoImpl0.a() == 1000 || this.b(mediaSessionManager$RemoteUserInfoImpl0);
    }

    boolean b(@NonNull RemoteUserInfoImpl mediaSessionManager$RemoteUserInfoImpl0) {
        String s = Settings.Secure.getString(this.b, "enabled_notification_listeners");
        if(s != null) {
            String[] arr_s = s.split(":");
            for(int v = 0; v < arr_s.length; ++v) {
                ComponentName componentName0 = ComponentName.unflattenFromString(arr_s[v]);
                if(componentName0 != null && componentName0.getPackageName().equals(mediaSessionManager$RemoteUserInfoImpl0.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean c(RemoteUserInfoImpl mediaSessionManager$RemoteUserInfoImpl0, String s) {
        return mediaSessionManager$RemoteUserInfoImpl0.b() >= 0 ? this.a.checkPermission(s, mediaSessionManager$RemoteUserInfoImpl0.b(), mediaSessionManager$RemoteUserInfoImpl0.a()) == 0 : this.a.getPackageManager().checkPermission(s, mediaSessionManager$RemoteUserInfoImpl0.getPackageName()) == 0;
    }

    @Override  // androidx.media.MediaSessionManager$MediaSessionManagerImpl
    public Context getContext() {
        return this.a;
    }
}

