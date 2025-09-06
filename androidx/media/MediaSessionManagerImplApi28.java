package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    @RequiresApi(28)
    static final class RemoteUserInfoImplApi28 extends RemoteUserInfoImplBase {
        final MediaSessionManager.RemoteUserInfo d;

        RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo mediaSessionManager$RemoteUserInfo0) {
            super(mediaSessionManager$RemoteUserInfo0.getPackageName(), mediaSessionManager$RemoteUserInfo0.getPid(), mediaSessionManager$RemoteUserInfo0.getUid());
            this.d = mediaSessionManager$RemoteUserInfo0;
        }

        RemoteUserInfoImplApi28(String s, int v, int v1) {
            super(s, v, v1);
            this.d = i.a(s, v, v1);
        }

        static String c(MediaSessionManager.RemoteUserInfo mediaSessionManager$RemoteUserInfo0) {
            return mediaSessionManager$RemoteUserInfo0.getPackageName();
        }
    }

    MediaSessionManager h;

    MediaSessionManagerImplApi28(Context context0) {
        super(context0);
        this.h = (MediaSessionManager)context0.getSystemService("media_session");
    }

    @Override  // androidx.media.MediaSessionManagerImplApi21
    public boolean a(RemoteUserInfoImpl mediaSessionManager$RemoteUserInfoImpl0) {
        return super.a(mediaSessionManager$RemoteUserInfoImpl0);
    }
}

