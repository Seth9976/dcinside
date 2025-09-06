package com.unity3d.services.ads.token;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.misc.IObserver;
import java.util.concurrent.ExecutorService;

public class NativeTokenGeneratorWithPrivacyAwait implements INativeTokenGenerator {
    private final ExecutorService _executorService;
    private final INativeTokenGenerator _nativeTokenGenerator;
    private final ConditionVariable _privacyAwait;
    private final int _privacyAwaitTimeout;

    public NativeTokenGeneratorWithPrivacyAwait(ExecutorService executorService0, INativeTokenGenerator iNativeTokenGenerator0, int v) {
        this._executorService = executorService0;
        this._nativeTokenGenerator = iNativeTokenGenerator0;
        this._privacyAwait = new ConditionVariable();
        this._privacyAwaitTimeout = v;
    }

    @Override  // com.unity3d.services.ads.token.INativeTokenGenerator
    public void generateToken(INativeTokenGeneratorListener iNativeTokenGeneratorListener0) {
        com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.1 nativeTokenGeneratorWithPrivacyAwait$10 = new IObserver() {
            public void updated(PrivacyConfig privacyConfig0) {
                NativeTokenGeneratorWithPrivacyAwait.this._privacyAwait.open();
            }

            @Override  // com.unity3d.services.core.misc.IObserver
            public void updated(Object object0) {
                this.updated(((PrivacyConfig)object0));
            }
        };
        PrivacyConfigStorage.getInstance().registerObserver(nativeTokenGeneratorWithPrivacyAwait$10);
        com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.2 nativeTokenGeneratorWithPrivacyAwait$20 = new Runnable() {
            @Override
            public void run() {
                NativeTokenGeneratorWithPrivacyAwait.this._privacyAwait.block(((long)NativeTokenGeneratorWithPrivacyAwait.this._privacyAwaitTimeout));
                PrivacyConfigStorage.getInstance().unregisterObserver(nativeTokenGeneratorWithPrivacyAwait$10);
                NativeTokenGeneratorWithPrivacyAwait.this._nativeTokenGenerator.generateToken(iNativeTokenGeneratorListener0);
            }
        };
        this._executorService.execute(nativeTokenGeneratorWithPrivacyAwait$20);
    }
}

