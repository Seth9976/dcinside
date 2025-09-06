package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest.Builder;
import j..time.Instant;
import j..time.TimeConversions;

public final class b {
    public static DeletionRequest.Builder a(DeletionRequest.Builder deletionRequest$Builder0, Instant instant0) {
        return deletionRequest$Builder0.setEnd(TimeConversions.convert(instant0));
    }
}

