package com.unity3d.services.core.device.reader.builder;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithExtras;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.device.reader.IGameSessionIdReader;
import java.util.Map;

public class DeviceInfoReaderBuilderWithExtras extends DeviceInfoReaderBuilder {
    private Map _extras;

    public DeviceInfoReaderBuilderWithExtras(ConfigurationReader configurationReader0, PrivacyConfigStorage privacyConfigStorage0, IGameSessionIdReader iGameSessionIdReader0) {
        super(configurationReader0, privacyConfigStorage0, iGameSessionIdReader0);
    }

    @Override  // com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder
    public IDeviceInfoReader build() {
        return this._extras == null ? super.build() : new DeviceInfoReaderWithExtras(super.build(), this._extras);
    }

    public void setExtras(Map map0) {
        this._extras = map0;
    }
}

