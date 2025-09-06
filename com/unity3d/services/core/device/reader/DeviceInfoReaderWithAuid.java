package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Device;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nDeviceInfoReaderWithAuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoReaderWithAuid.kt\ncom/unity3d/services/core/device/reader/DeviceInfoReaderWithAuid\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
public final class DeviceInfoReaderWithAuid implements IDeviceInfoReader {
    @l
    private final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderWithAuid(@l IDeviceInfoReader iDeviceInfoReader0) {
        L.p(iDeviceInfoReader0, "_deviceInfoReader");
        super();
        this._deviceInfoReader = iDeviceInfoReader0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    @l
    public Map getDeviceInfoData() {
        Map map0 = this._deviceInfoReader.getDeviceInfoData();
        L.o(map0, "_deviceInfoReader.deviceInfoData");
        String s = Device.getAuid();
        if(s != null) {
            map0.put("auid", s);
        }
        return map0;
    }
}

