package io.realm;

import io.realm.internal.Keep;

@Keep
public interface CompactOnLaunchCallback {
    boolean shouldCompact(long arg1, long arg2);
}

