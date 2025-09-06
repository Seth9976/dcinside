package com.gomfactory.adpie.sdk.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.util.AdPieLog;

public class AdBroadcast extends BroadcastReceiver {
    public static final String ACTION_INTERSTITIAL_CLICK = "com.gomfactory.adpie.action.interstitial.click";
    public static final String ACTION_INTERSTITIAL_DISMISS = "com.gomfactory.adpie.action.interstitial.dismiss";
    public static final String ACTION_INTERSTITIAL_SHOW = "com.gomfactory.adpie.action.interstitial.show";
    public static final String ACTION_INTERSTITIAL_VIDEO_COMPLETED = "com.gomfactory.adpie.action.interstitial.video_completed";
    public static final String ACTION_INTERSTITIAL_VIDEO_ERROR = "com.gomfactory.adpie.action.interstitial.video_error";
    public static final String ACTION_INTERSTITIAL_VIDEO_PAUSED = "com.gomfactory.adpie.action.interstitial.video_paused";
    public static final String ACTION_INTERSTITIAL_VIDEO_SKIPPED = "com.gomfactory.adpie.action.interstitial.video_skipped";
    public static final String ACTION_INTERSTITIAL_VIDEO_STARTED = "com.gomfactory.adpie.action.interstitial.video_started";
    public static final String ACTION_INTERSTITIAL_VIDEO_STOPPED = "com.gomfactory.adpie.action.interstitial.video_stopped";
    public static final String BROADCAST_IDENTIFIER_KEY = "broadcast_identifier";
    public static final String TAG = "AdBroadcast";
    private AdEventListener mAdEventListener;
    private long mBroadcastIdentifier;
    private Context mContext;
    private IntentFilter mIntentFilter;

    static {
    }

    public AdBroadcast(AdEventListener adEventListener0, long v) {
        this.mAdEventListener = adEventListener0;
        this.mBroadcastIdentifier = v;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(this.mAdEventListener == null) {
            return;
        }
        long v = intent0.getLongExtra("broadcast_identifier", -1L);
        if(this.mBroadcastIdentifier != v) {
            return;
        }
        String s = intent0.getAction();
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdBroadcast", "action : " + s);
        }
        if(s.equals("com.gomfactory.adpie.action.interstitial.show")) {
            this.mAdEventListener.notifyAdShown();
            return;
        }
        if(s.equals("com.gomfactory.adpie.action.interstitial.dismiss")) {
            this.mAdEventListener.notifyAdDismissed();
            this.unregister();
            return;
        }
        if(s.equals("com.gomfactory.adpie.action.interstitial.click")) {
            this.mAdEventListener.notifyAdClicked();
            return;
        }
        if(s.equals("com.gomfactory.adpie.action.interstitial.video_started")) {
            this.mAdEventListener.notifyVideoAdStarted();
            return;
        }
        if(s.equals("com.gomfactory.adpie.action.interstitial.video_error")) {
            this.mAdEventListener.notifyVideoAdError();
            return;
        }
        if(s.equals("com.gomfactory.adpie.action.interstitial.video_skipped")) {
            this.mAdEventListener.notifyVideoAdSkipped();
            return;
        }
        if(s.equals("com.gomfactory.adpie.action.interstitial.video_completed")) {
            this.mAdEventListener.notifyVideoAdCompleted();
            return;
        }
        if(s.equals("com.gomfactory.adpie.action.interstitial.video_stopped")) {
            this.mAdEventListener.notifyVideoAdStopped();
            return;
        }
        if(s.equals("com.gomfactory.adpie.action.interstitial.video_paused")) {
            this.mAdEventListener.notifyVideoAdPaused();
        }
    }

    public void register(Context context0) {
        this.mContext = context0;
        if(this.mIntentFilter == null) {
            IntentFilter intentFilter0 = new IntentFilter();
            this.mIntentFilter = intentFilter0;
            intentFilter0.addAction("com.gomfactory.adpie.action.interstitial.show");
            this.mIntentFilter.addAction("com.gomfactory.adpie.action.interstitial.dismiss");
            this.mIntentFilter.addAction("com.gomfactory.adpie.action.interstitial.click");
            this.mIntentFilter.addAction("com.gomfactory.adpie.action.interstitial.video_started");
            this.mIntentFilter.addAction("com.gomfactory.adpie.action.interstitial.video_error");
            this.mIntentFilter.addAction("com.gomfactory.adpie.action.interstitial.video_skipped");
            this.mIntentFilter.addAction("com.gomfactory.adpie.action.interstitial.video_completed");
            this.mIntentFilter.addAction("com.gomfactory.adpie.action.interstitial.video_stopped");
            this.mIntentFilter.addAction("com.gomfactory.adpie.action.interstitial.video_paused");
        }
        LocalBroadcastManager.b(this.mContext).c(this, this.mIntentFilter);
    }

    public static void sendBroadCast(Context context0, long v, String s) {
        Intent intent0 = new Intent(s);
        intent0.putExtra("broadcast_identifier", v);
        LocalBroadcastManager.b(context0.getApplicationContext()).d(intent0);
    }

    public void unregister() {
        Context context0 = this.mContext;
        if(context0 != null) {
            LocalBroadcastManager.b(context0).f(this);
        }
    }
}

