package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import java.util.Comparator;

public final class a implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return BaseUrlExclusionList.d(((BaseUrl)object0), ((BaseUrl)object1));
    }
}

