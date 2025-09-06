package androidx.media3.extractor;

import O1.a;
import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import java.util.Map;

@UnstableApi
public interface ExtractorsFactory {
    public static final ExtractorsFactory a;

    static {
        ExtractorsFactory.a = new e();
    }

    ExtractorsFactory a(Factory arg1);

    @a
    @Deprecated
    ExtractorsFactory b(boolean arg1);

    Extractor[] c(Uri arg1, Map arg2);

    Extractor[] d();
}

