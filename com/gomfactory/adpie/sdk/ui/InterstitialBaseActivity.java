package com.gomfactory.adpie.sdk.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.view.E0;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.common.AdData;
import com.gomfactory.adpie.sdk.event.AdBroadcast;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import java.util.concurrent.atomic.AtomicLong;

public abstract class InterstitialBaseActivity extends Activity {
    protected static String BROADCAST_IDENTIFIER_KEY = null;
    protected static String INTERSTITIAL_AD_BUNDLE_KEY = null;
    protected static String INTERSTITIAL_AD_DATA_KEY = null;
    protected static String INTERSTITIAL_SLOT_ID_KEY = null;
    protected static String REWARDED_AD_SSV_CUSTOM_DATA_KEY = null;
    protected static String REWARDED_AD_SSV_USER_ID_KEY = null;
    public static final String TAG = "InterstitialBaseActivity";
    protected AdData mAdData;
    protected long mBroadcastIdentifier;
    protected boolean mIsVideoAd;
    protected String mSlotId;
    protected String mSsvCustomData;
    protected String mSsvUserId;
    protected static final AtomicLong sNextGeneratedId;

    static {
        InterstitialBaseActivity.sNextGeneratedId = new AtomicLong(1L);
        InterstitialBaseActivity.INTERSTITIAL_SLOT_ID_KEY = "INTERSTITIAL_SLOT_ID";
        InterstitialBaseActivity.INTERSTITIAL_AD_DATA_KEY = "INTERSTITIAL_AD_DATA";
        InterstitialBaseActivity.INTERSTITIAL_AD_BUNDLE_KEY = "INTERSTITIAL_AD_BUNDLE";
        InterstitialBaseActivity.REWARDED_AD_SSV_USER_ID_KEY = "REWARDED_AD_SSV_USER_ID";
        InterstitialBaseActivity.REWARDED_AD_SSV_CUSTOM_DATA_KEY = "REWARDED_AD_SSV_CUSTOM_DATA";
        InterstitialBaseActivity.BROADCAST_IDENTIFIER_KEY = "INTERSTITIAL_BROADCAST";
    }

    protected static long generateUniqueId() {
        long v;
        do {
            AtomicLong atomicLong0 = InterstitialBaseActivity.sNextGeneratedId;
            v = atomicLong0.get();
            long v1 = 1L;
            long v2 = v + 1L;
            if(v2 <= 0x7FFFFFFFFFFFFFFEL) {
                v1 = v2;
            }
        }
        while(!atomicLong0.compareAndSet(v, v1));
        return v;
    }

    private void hideSystemUI() {
        if(Build.VERSION.SDK_INT < 30) {
            this.getWindow().getDecorView().setSystemUiVisibility(4);
            ActionBar actionBar0 = this.getActionBar();
            if(actionBar0 != null) {
                actionBar0.hide();
            }
        }
        else {
            this.getWindow().getDecorView().getWindowInsetsController().hide(E0.a());
            ActionBar actionBar1 = this.getActionBar();
            if(actionBar1 != null) {
                actionBar1.hide();
            }
        }
    }

    protected void notifyClick() {
        long v = this.mBroadcastIdentifier;
        if(v > 0L) {
            AdBroadcast.sendBroadCast(this, v, "com.gomfactory.adpie.action.interstitial.click");
        }
    }

    protected void notifyDismiss() {
        long v = this.mBroadcastIdentifier;
        if(v > 0L) {
            AdBroadcast.sendBroadCast(this, v, "com.gomfactory.adpie.action.interstitial.dismiss");
        }
    }

    protected void notifyShown() {
        long v = this.mBroadcastIdentifier;
        if(v > 0L) {
            AdBroadcast.sendBroadCast(this, v, "com.gomfactory.adpie.action.interstitial.show");
        }
    }

    protected void notifyVideoCompleted() {
        long v = this.mBroadcastIdentifier;
        if(v > 0L) {
            AdBroadcast.sendBroadCast(this, v, "com.gomfactory.adpie.action.interstitial.video_completed");
        }
    }

    protected void notifyVideoError() {
        long v = this.mBroadcastIdentifier;
        if(v > 0L) {
            AdBroadcast.sendBroadCast(this, v, "com.gomfactory.adpie.action.interstitial.video_error");
        }
    }

    protected void notifyVideoPaused() {
        long v = this.mBroadcastIdentifier;
        if(v > 0L) {
            AdBroadcast.sendBroadCast(this, v, "com.gomfactory.adpie.action.interstitial.video_paused");
        }
    }

    protected void notifyVideoSkipped() {
        long v = this.mBroadcastIdentifier;
        if(v > 0L) {
            AdBroadcast.sendBroadCast(this, v, "com.gomfactory.adpie.action.interstitial.video_skipped");
        }
    }

    protected void notifyVideoStarted() {
        long v = this.mBroadcastIdentifier;
        if(v > 0L) {
            AdBroadcast.sendBroadCast(this, v, "com.gomfactory.adpie.action.interstitial.video_started");
        }
    }

    protected void notifyVideoStopped() {
        long v = this.mBroadcastIdentifier;
        if(v > 0L) {
            AdBroadcast.sendBroadCast(this, v, "com.gomfactory.adpie.action.interstitial.video_stopped");
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        boolean z = true;
        try {
            this.requestWindowFeature(1);
            if(Build.VERSION.SDK_INT >= 27) {
                this.setShowWhenLocked(true);
            }
            else {
                this.getWindow().addFlags(0x80000);
            }
            this.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.mBroadcastIdentifier = this.getIntent().getLongExtra("INTERSTITIAL_BROADCAST", 0L);
            this.mSlotId = this.getIntent().getStringExtra("INTERSTITIAL_SLOT_ID");
            this.mAdData = (AdData)this.getIntent().getBundleExtra("INTERSTITIAL_AD_BUNDLE").getParcelable("INTERSTITIAL_AD_DATA");
            this.mSsvUserId = this.getIntent().getStringExtra("REWARDED_AD_SSV_USER_ID");
            this.mSsvCustomData = this.getIntent().getStringExtra("REWARDED_AD_SSV_CUSTOM_DATA");
            if(this.mAdData.getIcType() != 52) {
                z = false;
            }
            this.mIsVideoAd = z;
            this.hideSystemUI();
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("InterstitialBaseActivity", exception0);
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override  // android.app.Activity
    protected void onPause() {
        if(this.isFinishing()) {
            this.notifyDismiss();
        }
        super.onPause();
    }

    @Override  // android.app.Activity
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(z) {
            this.hideSystemUI();
        }
    }

    public static void start(Context context0, Class class0, String s, AdData adData0, String s1, String s2, AdEventListener adEventListener0) {
        AdBroadcast adBroadcast1;
        long v;
        AdBroadcast adBroadcast0 = null;
        try {
            v = InterstitialBaseActivity.generateUniqueId();
            adBroadcast1 = new AdBroadcast(adEventListener0, v);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            goto label_27;
        }
        catch(Exception exception0) {
            goto label_31;
        }
        try {
            adBroadcast1.register(context0);
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("InterstitialBaseActivity", "mBroadcastId : " + v);
            }
            Intent intent0 = new Intent(context0, class0);
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("INTERSTITIAL_AD_DATA", adData0);
            intent0.putExtra("INTERSTITIAL_AD_BUNDLE", bundle0);
            intent0.putExtra("INTERSTITIAL_SLOT_ID", s);
            intent0.putExtra("REWARDED_AD_SSV_USER_ID", s1);
            intent0.putExtra("REWARDED_AD_SSV_CUSTOM_DATA", s2);
            intent0.putExtra("INTERSTITIAL_BROADCAST", v);
            intent0.addFlags(0x10000000);
            context0.startActivity(intent0);
            return;
        label_26:
            adBroadcast0 = adBroadcast1;
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            goto label_26;
        }
        catch(Exception exception0) {
            adBroadcast0 = adBroadcast1;
            goto label_31;
        }
    label_27:
        AdPieLog.i("InterstitialBaseActivity", class0.getSimpleName() + " not found - did you declare it in AndroidManifest.xml?");
        if(adBroadcast0 != null) {
            adBroadcast0.unregister();
        }
        throw activityNotFoundException0;
    label_31:
        AdPieLog.e("InterstitialBaseActivity", exception0);
        if(adBroadcast0 != null) {
            adBroadcast0.unregister();
        }
        throw exception0;
    }
}

