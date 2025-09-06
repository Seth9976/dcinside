package com.unity3d.services.core.device.reader;

import java.util.List;
import java.util.Map;

public class DeviceInfoReaderWithFilter implements IDeviceInfoReader {
    IDeviceInfoReader _deviceInfoReader;
    List _keysToExclude;

    public DeviceInfoReaderWithFilter(IDeviceInfoReader iDeviceInfoReader0, List list0) {
        this._deviceInfoReader = iDeviceInfoReader0;
        this._keysToExclude = list0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map getDeviceInfoData() {
        Map map0 = this._deviceInfoReader.getDeviceInfoData();
        List list0 = this._keysToExclude;
        if(list0 != null) {
            for(Object object0: list0) {
                map0.remove(((String)object0));
            }
        }
        return map0;
    }
}

