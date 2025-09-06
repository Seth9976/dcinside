package com.unity3d.services.ads.token;

import android.util.Base64;
import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.ExecutorService;

public class NativeTokenGenerator implements INativeTokenGenerator {
    private static final String DEFAULT_NATIVE_TOKEN_PREFIX = "1:";
    private DeviceInfoReaderBuilder _deviceInfoReaderBuilder;
    private ExecutorService _executorService;
    private String _prependStr;

    public NativeTokenGenerator(ExecutorService executorService0, DeviceInfoReaderBuilder deviceInfoReaderBuilder0) {
        this(executorService0, deviceInfoReaderBuilder0, "1:");
    }

    public NativeTokenGenerator(ExecutorService executorService0, DeviceInfoReaderBuilder deviceInfoReaderBuilder0, String s) {
        this._executorService = executorService0;
        this._deviceInfoReaderBuilder = deviceInfoReaderBuilder0;
        this._prependStr = s;
    }

    @Override  // com.unity3d.services.ads.token.INativeTokenGenerator
    public void generateToken(INativeTokenGeneratorListener iNativeTokenGeneratorListener0) {
        this._executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Base64.encodeToString(new DeviceInfoReaderCompressor(NativeTokenGenerator.this._deviceInfoReaderBuilder.build()).getDeviceData(), 2);
                    if(NativeTokenGenerator.this._prependStr != null && !NativeTokenGenerator.this._prependStr.isEmpty()) {
                        iNativeTokenGeneratorListener0.onReady(NativeTokenGenerator.this._prependStr + s);
                        return;
                    }
                    iNativeTokenGeneratorListener0.onReady(s);
                    return;
                }
                catch(Exception exception0) {
                }
                DeviceLog.exception("Unity Ads failed to generate token.", exception0);
                iNativeTokenGeneratorListener0.onReady(null);
            }
        });
    }
}

