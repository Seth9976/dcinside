package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.InitRequestType;
import java.util.Map;

public class DeviceInfoReaderWithRequestType implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final InitRequestType _initRequestType;

    public DeviceInfoReaderWithRequestType(IDeviceInfoReader iDeviceInfoReader0, InitRequestType initRequestType0) {
        this._deviceInfoReader = iDeviceInfoReader0;
        this._initRequestType = initRequestType0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map getDeviceInfoData() {
        Map map0 = this._deviceInfoReader.getDeviceInfoData();
        InitRequestType initRequestType0 = this._initRequestType;
        if(initRequestType0 != null) {
            map0.put("callType", initRequestType0.toString().toLowerCase());
        }
        return map0;
    }
}

