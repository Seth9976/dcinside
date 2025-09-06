package com.unity3d.services.ads.adunit;

import com.unity3d.services.ads.configuration.IAdsModuleConfiguration;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.Map;

public class AdUnitViewHandlerFactory implements IAdUnitViewHandlerFactory {
    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandlerFactory
    public IAdUnitViewHandler createViewHandler(String s) {
        if(WebViewApp.getCurrentApp() != null) {
            Configuration configuration0 = WebViewApp.getCurrentApp().getConfiguration();
            Class[] arr_class = configuration0.getModuleConfigurationList();
            for(int v = 0; v < arr_class.length; ++v) {
                IModuleConfiguration iModuleConfiguration0 = configuration0.getModuleConfiguration(arr_class[v]);
                if(iModuleConfiguration0 instanceof IAdsModuleConfiguration) {
                    Map map0 = ((IAdsModuleConfiguration)iModuleConfiguration0).getAdUnitViewHandlers();
                    if(map0 != null && map0.containsKey(s)) {
                        try {
                            return (IAdUnitViewHandler)((Class)map0.get(s)).newInstance();
                        }
                        catch(Exception unused_ex) {
                            DeviceLog.error(("Error creating view: " + s));
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }
}

