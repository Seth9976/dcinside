package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public interface LoaderErrorThrower {
    public static final class Placeholder implements LoaderErrorThrower {
        @Override  // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void a(int v) {
        }

        @Override  // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void b() {
        }
    }

    void a(int arg1) throws IOException;

    void b() throws IOException;
}

