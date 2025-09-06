package com.unity3d.services.core.connectivity;

import android.annotation.TargetApi;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest.Builder;
import com.unity3d.services.core.properties.ClientProperties;

@TargetApi(21)
public class ConnectivityNetworkCallback extends ConnectivityManager.NetworkCallback {
    private static ConnectivityNetworkCallback _impl;

    static {
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public void onAvailable(Network network0) {
        ConnectivityMonitor.connected();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public void onCapabilitiesChanged(Network network0, NetworkCapabilities networkCapabilities0) {
        ConnectivityMonitor.connectionStatusChanged();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public void onLinkPropertiesChanged(Network network0, LinkProperties linkProperties0) {
        ConnectivityMonitor.connectionStatusChanged();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public void onLost(Network network0) {
        ConnectivityMonitor.disconnected();
    }

    public static void register() {
        synchronized(ConnectivityNetworkCallback.class) {
            if(ConnectivityNetworkCallback._impl == null) {
                ConnectivityNetworkCallback._impl = new ConnectivityNetworkCallback();
                ((ConnectivityManager)ClientProperties.getApplicationContext().getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().build(), ConnectivityNetworkCallback._impl);
            }
        }
    }

    public static void unregister() {
        synchronized(ConnectivityNetworkCallback.class) {
            if(ConnectivityNetworkCallback._impl != null) {
                ((ConnectivityManager)ClientProperties.getApplicationContext().getSystemService("connectivity")).unregisterNetworkCallback(ConnectivityNetworkCallback._impl);
                ConnectivityNetworkCallback._impl = null;
            }
        }
    }
}

