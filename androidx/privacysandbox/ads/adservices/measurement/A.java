package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest.Builder;
import j..time.Instant;
import j..time.TimeConversions;

public final class a {
    public static DeletionRequest.Builder a(DeletionRequest.Builder deletionRequest$Builder0, Instant instant0) {
        return deletionRequest$Builder0.setStart(TimeConversions.convert(instant0));
    }
}

