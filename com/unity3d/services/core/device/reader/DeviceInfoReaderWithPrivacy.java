package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import java.util.HashMap;
import java.util.Map;

public class DeviceInfoReaderWithPrivacy implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final PiiDataProvider _piiDataProvider;
    private final PiiTrackingStatusReader _piiTrackingStatusReader;
    private final PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderWithPrivacy(IDeviceInfoReader iDeviceInfoReader0, PrivacyConfigStorage privacyConfigStorage0, PiiDataProvider piiDataProvider0, PiiTrackingStatusReader piiTrackingStatusReader0) {
        this._deviceInfoReader = iDeviceInfoReader0;
        this._privacyConfigStorage = privacyConfigStorage0;
        this._piiDataProvider = piiDataProvider0;
        this._piiTrackingStatusReader = piiTrackingStatusReader0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map getDeviceInfoData() {
        Map map0 = this._deviceInfoReader.getDeviceInfoData();
        if(this._privacyConfigStorage != null && this._privacyConfigStorage.getPrivacyConfig() != null) {
            if(this._privacyConfigStorage.getPrivacyConfig().allowedToSendPii()) {
                map0.putAll(this.getPiiAttributesFromDevice());
            }
            if(this._privacyConfigStorage.getPrivacyConfig().shouldSendNonBehavioral()) {
                map0.put("user.nonBehavioral", Boolean.valueOf(this._piiTrackingStatusReader.getUserNonBehavioralFlag()));
            }
        }
        return map0;
    }

    private Map getPiiAttributesFromDevice() {
        Map map0 = new HashMap();
        String s = this._piiDataProvider.getAdvertisingTrackingId();
        if(s != null) {
            map0.put("unifiedconfig.pii.advertisingTrackingId", s);
        }
        return map0;
    }
}

