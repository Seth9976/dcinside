package com.unity3d.services.core.configuration;

import com.unity3d.services.core.device.reader.IDeviceInfoDataContainer;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

public class ConfigurationRequestFactory {
    private final Configuration _configuration;
    private final IDeviceInfoDataContainer _deviceInfoDataContainer;

    public ConfigurationRequestFactory(Configuration configuration0) {
        this(configuration0, null);
    }

    public ConfigurationRequestFactory(Configuration configuration0, IDeviceInfoDataContainer iDeviceInfoDataContainer0) {
        this._configuration = configuration0;
        this._deviceInfoDataContainer = iDeviceInfoDataContainer0;
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public WebRequest getWebRequest() throws MalformedURLException {
        String s = this._configuration.getConfigUrl();
        if(s == null) {
            throw new MalformedURLException("Base URL is null");
        }
        StringBuilder stringBuilder0 = new StringBuilder(s);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Content-Encoding", Collections.singletonList("gzip"));
        WebRequest webRequest0 = new WebRequest(stringBuilder0.toString(), "POST", hashMap0);
        webRequest0.setBody((this._deviceInfoDataContainer == null ? null : this._deviceInfoDataContainer.getDeviceData()));
        DeviceLog.debug(("Requesting configuration with: " + stringBuilder0));
        return webRequest0;
    }
}

