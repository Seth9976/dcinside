package androidx.webkit.internal;

import androidx.annotation.NonNull;

public interface ConditionallySupportedFeature {
    @NonNull
    String a();

    boolean isSupported();
}

