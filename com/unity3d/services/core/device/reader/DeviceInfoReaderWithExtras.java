package com.unity3d.services.core.device.reader;

import java.util.Map;

public class DeviceInfoReaderWithExtras implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final Map _extras;

    public DeviceInfoReaderWithExtras(IDeviceInfoReader iDeviceInfoReader0, Map map0) {
        this._deviceInfoReader = iDeviceInfoReader0;
        this._extras = map0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map getDeviceInfoData() {
        Map map0 = this._deviceInfoReader.getDeviceInfoData();
        if(map0 != null) {
            Map map1 = this._extras;
            if(map1 != null) {
                map0.putAll(map1);
            }
        }
        return map0;
    }
}

