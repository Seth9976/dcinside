package com.unity3d.services.core.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.HashMap;
import java.util.Map;

public class BroadcastMonitor {
    private final Context _context;
    private Map _eventReceivers;
    private static BroadcastMonitor _instance;

    private BroadcastMonitor(Context context0) {
        this._context = context0;
    }

    public void addBroadcastListener(String s, String s1, String[] arr_s) {
        this.removeBroadcastListener(s);
        IntentFilter intentFilter0 = new IntentFilter();
        for(int v = 0; v < arr_s.length; ++v) {
            intentFilter0.addAction(arr_s[v]);
        }
        if(s1 != null) {
            intentFilter0.addDataScheme(s1);
        }
        if(this._eventReceivers == null) {
            this._eventReceivers = new HashMap();
        }
        BroadcastEventReceiver broadcastEventReceiver0 = new BroadcastEventReceiver(s);
        this._eventReceivers.put(s, broadcastEventReceiver0);
        this._context.registerReceiver(broadcastEventReceiver0, intentFilter0);
    }

    public static BroadcastMonitor getInstance() {
        synchronized(BroadcastMonitor.class) {
            if(BroadcastMonitor._instance == null) {
                BroadcastMonitor._instance = new BroadcastMonitor(ClientProperties.getApplicationContext());
            }
            return BroadcastMonitor._instance;
        }
    }

    public void removeAllBroadcastListeners() {
        Map map0 = this._eventReceivers;
        if(map0 != null) {
            for(Object object0: map0.keySet()) {
                BroadcastReceiver broadcastReceiver0 = (BroadcastReceiver)this._eventReceivers.get(((String)object0));
                this._context.unregisterReceiver(broadcastReceiver0);
            }
            this._eventReceivers = null;
        }
    }

    public void removeBroadcastListener(String s) {
        if(this._eventReceivers != null && this._eventReceivers.containsKey(s)) {
            BroadcastReceiver broadcastReceiver0 = (BroadcastReceiver)this._eventReceivers.get(s);
            this._context.unregisterReceiver(broadcastReceiver0);
            this._eventReceivers.remove(s);
        }
    }
}

