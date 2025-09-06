package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.customaudience.CustomAudience.Builder;
import j..time.Instant;
import j..time.TimeConversions;

public final class b {
    public static CustomAudience.Builder a(CustomAudience.Builder customAudience$Builder0, Instant instant0) {
        return customAudience$Builder0.setExpirationTime(TimeConversions.convert(instant0));
    }
}

