package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import com.google.common.util.concurrent.t0;

@UnstableApi
public interface ExternalLoader {
    public static final class LoadRequest {
        public final Uri a;

        public LoadRequest(Uri uri0) {
            this.a = uri0;
        }
    }

    t0 a(LoadRequest arg1);
}

