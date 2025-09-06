package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigurationReader {
    private Configuration _localConfiguration;

    public Configuration getCurrentConfiguration() {
        if(this.getRemoteConfiguration() != null) {
            return this.getRemoteConfiguration();
        }
        Configuration configuration0 = this.getLocalConfiguration();
        return configuration0 == null ? new Configuration() : configuration0;
    }

    private Configuration getLocalConfiguration() {
        Configuration configuration0 = this._localConfiguration;
        if(configuration0 != null) {
            return configuration0;
        }
        File file0 = new File("");
        if(file0.exists()) {
            try {
                this._localConfiguration = new Configuration(new JSONObject(new String(Utilities.readFileBytes(file0))));
                return this._localConfiguration;
            }
            catch(IOException | JSONException unused_ex) {
                DeviceLog.debug("Unable to read configuration from storage");
                this._localConfiguration = null;
            }
        }
        return this._localConfiguration;
    }

    private Configuration getRemoteConfiguration() {
        return WebViewApp.getCurrentApp() == null ? null : WebViewApp.getCurrentApp().getConfiguration();
    }
}

