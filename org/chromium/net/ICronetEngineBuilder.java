package org.chromium.net;

import java.util.Date;
import java.util.Set;

public abstract class ICronetEngineBuilder {
    public abstract ICronetEngineBuilder addPublicKeyPins(String arg1, Set arg2, boolean arg3, Date arg4);

    public abstract ICronetEngineBuilder addQuicHint(String arg1, int arg2, int arg3);

    public abstract ExperimentalCronetEngine build();

    public ICronetEngineBuilder enableBrotli(boolean z) [...] // Inlined contents

    public abstract ICronetEngineBuilder enableHttp2(boolean arg1);

    public abstract ICronetEngineBuilder enableHttpCache(int arg1, long arg2);

    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) [...] // Inlined contents

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean arg1);

    public abstract ICronetEngineBuilder enableQuic(boolean arg1);

    public abstract ICronetEngineBuilder enableSdch(boolean arg1);

    public abstract String getDefaultUserAgent();

    public abstract ICronetEngineBuilder setExperimentalOptions(String arg1);

    public abstract ICronetEngineBuilder setLibraryLoader(LibraryLoader arg1);

    public abstract ICronetEngineBuilder setStoragePath(String arg1);

    public ICronetEngineBuilder setThreadPriority(int v) [...] // Inlined contents

    public abstract ICronetEngineBuilder setUserAgent(String arg1);
}

