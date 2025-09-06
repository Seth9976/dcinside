package com.unity3d.services.core.connectivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;

public class ConnectivityMonitor {
    private static int _connected = -1;
    private static Set _listeners = null;
    private static boolean _listening = false;
    private static int _networkType = -1;
    private static boolean _webappMonitoring = false;
    private static boolean _wifi = false;

    static {
    }

    public static void addListener(IConnectivityListener iConnectivityListener0) {
        if(ConnectivityMonitor._listeners == null) {
            ConnectivityMonitor._listeners = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        ConnectivityMonitor._listeners.add(iConnectivityListener0);
        ConnectivityMonitor.updateListeningStatus();
    }

    public static void connected() {
        if(ConnectivityMonitor._connected == 1) {
            return;
        }
        DeviceLog.debug("Unity Ads connectivity change: connected");
        ConnectivityMonitor.initConnectionStatus();
        Set set0 = ConnectivityMonitor._listeners;
        if(set0 != null) {
            for(Object object0: set0) {
                ((IConnectivityListener)object0).onConnected();
            }
        }
        ConnectivityMonitor.sendToWebview(ConnectivityEvent.CONNECTED, ConnectivityMonitor._wifi, ConnectivityMonitor._networkType);
    }

    public static void connectionStatusChanged() {
        int v;
        boolean z = true;
        if(ConnectivityMonitor._connected != 1) {
            return;
        }
        NetworkInfo networkInfo0 = ((ConnectivityManager)ClientProperties.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if(networkInfo0 != null && networkInfo0.isConnected()) {
            if(networkInfo0.getType() != 1) {
                z = false;
            }
            TelephonyManager telephonyManager0 = (TelephonyManager)ClientProperties.getApplicationContext().getSystemService("phone");
            try {
                v = telephonyManager0.getNetworkType();
            }
            catch(SecurityException unused_ex) {
                DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                v = -1;
            }
            if(z == ConnectivityMonitor._wifi && (v == ConnectivityMonitor._networkType || ConnectivityMonitor._wifi)) {
                return;
            }
            ConnectivityMonitor._wifi = z;
            ConnectivityMonitor._networkType = v;
            DeviceLog.debug("Unity Ads connectivity change: network change");
            ConnectivityMonitor.sendToWebview(ConnectivityEvent.NETWORK_CHANGE, z, v);
        }
    }

    public static void disconnected() {
        if(ConnectivityMonitor._connected == 0) {
            return;
        }
        ConnectivityMonitor._connected = 0;
        DeviceLog.debug("Unity Ads connectivity change: disconnected");
        Set set0 = ConnectivityMonitor._listeners;
        if(set0 != null) {
            for(Object object0: set0) {
                ((IConnectivityListener)object0).onDisconnected();
            }
        }
        ConnectivityMonitor.sendToWebview(ConnectivityEvent.DISCONNECTED, false, 0);
    }

    private static void initConnectionStatus() {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)ClientProperties.getApplicationContext().getSystemService("connectivity");
        if(connectivityManager0 == null) {
            return;
        }
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        boolean z = false;
        if(networkInfo0 == null || !networkInfo0.isConnected()) {
            ConnectivityMonitor._connected = 0;
        }
        else {
            ConnectivityMonitor._connected = 1;
            if(networkInfo0.getType() == 1) {
                z = true;
            }
            ConnectivityMonitor._wifi = z;
            if(!z) {
                TelephonyManager telephonyManager0 = (TelephonyManager)ClientProperties.getApplicationContext().getSystemService("phone");
                try {
                    ConnectivityMonitor._networkType = telephonyManager0.getNetworkType();
                }
                catch(SecurityException unused_ex) {
                    DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                }
            }
        }
    }

    public static void removeListener(IConnectivityListener iConnectivityListener0) {
        Set set0 = ConnectivityMonitor._listeners;
        if(set0 == null) {
            return;
        }
        set0.remove(iConnectivityListener0);
        ConnectivityMonitor.updateListeningStatus();
    }

    private static void sendToWebview(ConnectivityEvent connectivityEvent0, boolean z, int v) {
        if(!ConnectivityMonitor._webappMonitoring) {
            return;
        }
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null && webViewApp0.isWebAppLoaded()) {
            int v1 = com.unity3d.services.core.connectivity.ConnectivityMonitor.1.$SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent[connectivityEvent0.ordinal()];
            switch(v1) {
                case 1: {
                    if(z) {
                        webViewApp0.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.CONNECTED, new Object[]{Boolean.TRUE, 0});
                        return;
                    }
                    webViewApp0.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.CONNECTED, new Object[]{Boolean.FALSE, v});
                    break;
                }
                case 2: {
                    webViewApp0.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.DISCONNECTED, new Object[0]);
                    return;
                label_9:
                    if(v1 == 3) {
                        if(z) {
                            webViewApp0.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.NETWORK_CHANGE, new Object[]{Boolean.TRUE, 0});
                            return;
                        }
                        webViewApp0.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.NETWORK_CHANGE, new Object[]{Boolean.FALSE, v});
                        return;
                    }
                    break;
                }
                default: {
                    goto label_9;
                }
            }
        }
    }

    public static void setConnectionMonitoring(boolean z) {
        ConnectivityMonitor._webappMonitoring = z;
        ConnectivityMonitor.updateListeningStatus();
    }

    private static void startListening() {
        if(ConnectivityMonitor._listening) {
            return;
        }
        ConnectivityMonitor._listening = true;
        ConnectivityMonitor.initConnectionStatus();
        ConnectivityNetworkCallback.register();
    }

    public static void stopAll() {
        ConnectivityMonitor._listeners = null;
        ConnectivityMonitor._webappMonitoring = false;
        ConnectivityMonitor.updateListeningStatus();
    }

    private static void stopListening() {
        if(!ConnectivityMonitor._listening) {
            return;
        }
        ConnectivityMonitor._listening = false;
        ConnectivityNetworkCallback.unregister();
    }

    private static void updateListeningStatus() {
        if(!ConnectivityMonitor._webappMonitoring && (ConnectivityMonitor._listeners == null || ConnectivityMonitor._listeners.isEmpty())) {
            ConnectivityMonitor.stopListening();
            return;
        }
        ConnectivityMonitor.startListening();
    }
}

