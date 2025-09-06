package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

public class DeviceInfoReaderCompressor implements IDeviceInfoDataCompressor {
    public final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderCompressor(IDeviceInfoReader iDeviceInfoReader0) {
        this._deviceInfoReader = iDeviceInfoReader0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoDataCompressor
    public byte[] compressDeviceInfo(Map map0) {
        if(map0 != null) {
            String s = new JSONObject(map0).toString();
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(s.length());
            try {
                GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
                gZIPOutputStream0.write(s.getBytes());
                gZIPOutputStream0.flush();
                gZIPOutputStream0.close();
                byteArrayOutputStream0.close();
                return byteArrayOutputStream0.toByteArray();
            }
            catch(IOException unused_ex) {
                DeviceLog.error("Error occurred while trying to compress device data.");
                return null;
            }
        }
        DeviceLog.error("Invalid DeviceInfoData: Expected non null map provided by reader");
        return null;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoDataContainer
    public byte[] getDeviceData() {
        return this.compressDeviceInfo(this.getDeviceInfo());
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoDataContainer
    public Map getDeviceInfo() {
        return this._deviceInfoReader.getDeviceInfoData();
    }
}

