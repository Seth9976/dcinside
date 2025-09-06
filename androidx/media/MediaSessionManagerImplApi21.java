package androidx.media;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaSessionManagerImplApi21 extends MediaSessionManagerImplBase {
    MediaSessionManagerImplApi21(Context context0) {
        super(context0);
        this.a = context0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media.MediaSessionManagerImplBase
    public boolean a(@NonNull RemoteUserInfoImpl mediaSessionManager$RemoteUserInfoImpl0) {
        return this.d(mediaSessionManager$RemoteUserInfoImpl0) || super.a(mediaSessionManager$RemoteUserInfoImpl0);
    }

    private boolean d(@NonNull RemoteUserInfoImpl mediaSessionManager$RemoteUserInfoImpl0) {
        return this.getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", mediaSessionManager$RemoteUserInfoImpl0.b(), mediaSessionManager$RemoteUserInfoImpl0.a()) == 0;
    }
}

