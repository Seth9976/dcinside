package androidx.media3.common.util;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import com.google.common.util.concurrent.t0;

@UnstableApi
public interface BitmapLoader {
    t0 a(byte[] arg1);

    boolean b(String arg1);

    @Nullable
    t0 c(MediaMetadata arg1);

    t0 d(Uri arg1);
}

