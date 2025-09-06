package com.gomfactory.adpie.sdk.network;

import android.os.Handler;
import android.os.Message;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import java.util.ArrayList;

public class NetworkServiceManager {
    public static final int MAX_CONNECTIONS = 5;
    public static final String TAG = "NetworkServiceManager";
    private ArrayList active;
    private static NetworkServiceManager ourInstance;
    private ArrayList queue;

    static {
        NetworkServiceManager.ourInstance = new NetworkServiceManager();
    }

    private NetworkServiceManager() {
        this.active = new ArrayList();
        this.queue = new ArrayList();
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("NetworkServiceManager", "NetworkServiceManager instance is created.");
        }
    }

    public void didComplete(NetworkService networkService0) {
        this.active.remove(networkService0);
        this.startNext();
    }

    public void get(String s, Handler handler0) {
        try {
            this.push(new NetworkService(s, null, handler0, "GET"));
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("NetworkServiceManager", exception0);
            }
            if(handler0 != null) {
                handler0.sendMessage(Message.obtain(handler0, -1));
            }
        }
    }

    public static NetworkServiceManager getInstance() {
        return NetworkServiceManager.ourInstance;
    }

    public void post(String s, String s1, Handler handler0) {
        try {
            this.push(new NetworkService(s, s1, handler0, "POST"));
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("NetworkServiceManager", exception0);
            }
            if(handler0 != null) {
                handler0.sendMessage(Message.obtain(handler0, -1));
            }
        }
    }

    private void push(NetworkService networkService0) {
        this.queue.add(networkService0);
        if(this.active.size() < 5) {
            this.startNext();
        }
    }

    private void startNext() {
        try {
            ArrayList arrayList0 = this.queue;
            synchronized(arrayList0) {
                if(!this.queue.isEmpty()) {
                    NetworkService networkService0 = (NetworkService)this.queue.get(0);
                    this.queue.remove(0);
                    this.active.add(networkService0);
                    networkService0.process();
                }
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("NetworkServiceManager", exception0);
        }
    }
}

