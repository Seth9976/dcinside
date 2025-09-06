package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderPrivacyBuilder;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;

public class DeviceInfoDataFactory {
    private final SDKMetricsSender _sdkMetricsSender;

    public DeviceInfoDataFactory(SDKMetricsSender sDKMetricsSender0) {
        this._sdkMetricsSender = sDKMetricsSender0;
    }

    public IDeviceInfoDataContainer getDeviceInfoData(InitRequestType initRequestType0) {
        switch(initRequestType0) {
            case 1: {
                return this.getTokenDeviceInfoData();
            }
            case 2: {
                return this.getPrivacyDeviceInfoData();
            }
            default: {
                return null;
            }
        }
    }

    private IDeviceInfoDataContainer getPrivacyDeviceInfoData() {
        PrivacyConfigStorage privacyConfigStorage0 = PrivacyConfigStorage.getInstance();
        return new DeviceInfoReaderCompressor(new DeviceInfoReaderPrivacyBuilder(new ConfigurationReader(), privacyConfigStorage0, GameSessionIdReader.getInstance()).build());
    }

    private IDeviceInfoDataContainer getTokenDeviceInfoData() {
        PrivacyConfigStorage privacyConfigStorage0 = PrivacyConfigStorage.getInstance();
        return new DeviceInfoReaderCompressorWithMetrics(new DeviceInfoReaderCompressor(new DeviceInfoReaderBuilder(new ConfigurationReader(), privacyConfigStorage0, GameSessionIdReader.getInstance()).build()), this._sdkMetricsSender);
    }
}

