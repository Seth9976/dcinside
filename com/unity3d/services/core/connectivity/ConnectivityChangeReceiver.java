package com.unity3d.services.core.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.unity3d.services.core.properties.ClientProperties;

public class ConnectivityChangeReceiver extends BroadcastReceiver {
    private static ConnectivityChangeReceiver _receiver;

    static {
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0.getBooleanExtra("noConnectivity", false)) {
            ConnectivityMonitor.disconnected();
            return;
        }
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        if(connectivityManager0 == null) {
            return;
        }
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        if(networkInfo0 != null && networkInfo0.isConnected()) {
            ConnectivityMonitor.connected();
        }
    }

    public static void register() {
        if(ConnectivityChangeReceiver._receiver == null) {
            ConnectivityChangeReceiver._receiver = new ConnectivityChangeReceiver();
            ClientProperties.getApplicationContext().registerReceiver(ConnectivityChangeReceiver._receiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public static void unregister() {
        if(ConnectivityChangeReceiver._receiver != null) {
            ClientProperties.getApplicationContext().unregisterReceiver(ConnectivityChangeReceiver._receiver);
            ConnectivityChangeReceiver._receiver = null;
        }
    }
}

