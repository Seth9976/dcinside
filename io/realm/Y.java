package io.realm;

public class y implements CompactOnLaunchCallback {
    @Override  // io.realm.CompactOnLaunchCallback
    public boolean shouldCompact(long v, long v1) {
        return v > 0x3200000L && ((double)v1) / ((double)v) < 0.5;
    }
}

