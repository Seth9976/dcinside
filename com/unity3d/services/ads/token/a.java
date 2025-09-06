package com.unity3d.services.ads.token;

public final class a implements INativeTokenGeneratorListener {
    @Override  // com.unity3d.services.ads.token.INativeTokenGeneratorListener
    public final void onReady(String s) {
        InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(s);
    }
}

