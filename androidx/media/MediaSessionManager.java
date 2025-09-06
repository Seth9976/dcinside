package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class MediaSessionManager {
    interface MediaSessionManagerImpl {
        boolean a(RemoteUserInfoImpl arg1);

        Context getContext();
    }

    public static final class RemoteUserInfo {
        RemoteUserInfoImpl a;
        public static final String b = "android.media.session.MediaController";
        @RestrictTo({Scope.c})
        public static final int c = -1;
        @RestrictTo({Scope.c})
        public static final int d = -1;

        @RequiresApi(28)
        @RestrictTo({Scope.a})
        public RemoteUserInfo(MediaSessionManager.RemoteUserInfo mediaSessionManager$RemoteUserInfo0) {
            String s = RemoteUserInfoImplApi28.c(mediaSessionManager$RemoteUserInfo0);
            if(s == null) {
                throw new NullPointerException("package shouldn\'t be null");
            }
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            this.a = new RemoteUserInfoImplApi28(mediaSessionManager$RemoteUserInfo0);
        }

        public RemoteUserInfo(@NonNull String s, int v, int v1) {
            if(s == null) {
                throw new NullPointerException("package shouldn\'t be null");
            }
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if(Build.VERSION.SDK_INT >= 28) {
                this.a = new RemoteUserInfoImplApi28(s, v, v1);
                return;
            }
            this.a = new RemoteUserInfoImplBase(s, v, v1);
        }

        @NonNull
        public String a() {
            return this.a.getPackageName();
        }

        public int b() {
            return this.a.b();
        }

        public int c() {
            return this.a.a();
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RemoteUserInfo ? this.a.equals(((RemoteUserInfo)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    interface RemoteUserInfoImpl {
        int a();

        int b();

        String getPackageName();
    }

    MediaSessionManagerImpl a;
    static final String b = "MediaSessionManager";
    static final boolean c;
    private static final Object d;
    private static volatile MediaSessionManager e;

    static {
        MediaSessionManager.c = Log.isLoggable("MediaSessionManager", 3);
        MediaSessionManager.d = new Object();
    }

    private MediaSessionManager(Context context0) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a = new MediaSessionManagerImplApi28(context0);
            return;
        }
        this.a = new MediaSessionManagerImplApi21(context0);
    }

    Context a() {
        return this.a.getContext();
    }

    @NonNull
    public static MediaSessionManager b(@NonNull Context context0) {
        if(context0 != null) {
            Object object0 = MediaSessionManager.d;
            synchronized(object0) {
                if(MediaSessionManager.e == null) {
                    MediaSessionManager.e = new MediaSessionManager(context0.getApplicationContext());
                }
                return MediaSessionManager.e;
            }
        }
        throw new IllegalArgumentException("context cannot be null");
    }

    public boolean c(@NonNull RemoteUserInfo mediaSessionManager$RemoteUserInfo0) {
        if(mediaSessionManager$RemoteUserInfo0 == null) {
            throw new IllegalArgumentException("userInfo should not be null");
        }
        return this.a.a(mediaSessionManager$RemoteUserInfo0.a);
    }
}

