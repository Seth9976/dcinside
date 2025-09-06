package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.System;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class VolumeChangeContentObserver implements VolumeChange {
    @m
    private ContentObserver contentObserver;
    @l
    private List listeners;

    public VolumeChangeContentObserver() {
        this.listeners = new ArrayList();
    }

    @Override  // com.unity3d.services.core.device.VolumeChange
    public void clearAllListeners() {
        synchronized(this) {
            this.listeners.clear();
            this.stopObserving();
        }
    }

    @Override  // com.unity3d.services.core.device.VolumeChange
    public void registerListener(@l VolumeChangeListener volumeChangeListener0) {
        synchronized(this) {
            L.p(volumeChangeListener0, "volumeChangeListener");
            if(!this.listeners.contains(volumeChangeListener0)) {
                this.startObserving();
                this.listeners.add(volumeChangeListener0);
            }
        }
    }

    @Override  // com.unity3d.services.core.device.VolumeChange
    public void startObserving() {
        synchronized(this) {
            if(this.contentObserver != null) {
                return;
            }
            this.contentObserver = new ContentObserver(/*ERROR_MISSING_ARG_1/*) {
                @Override  // android.database.ContentObserver
                public boolean deliverSelfNotifications() {
                    return false;
                }

                @Override  // android.database.ContentObserver
                public void onChange(boolean z, @m Uri uri0) {
                    new Handler(Looper.getMainLooper()).triggerListeners();
                }
            };
            Context context0 = ClientProperties.getApplicationContext();
            if(context0 != null) {
                ContentResolver contentResolver0 = context0.getContentResolver();
                if(contentResolver0 != null) {
                    Uri uri0 = Settings.System.CONTENT_URI;
                    ContentObserver contentObserver0 = this.contentObserver;
                    L.n(contentObserver0, "null cannot be cast to non-null type android.database.ContentObserver");
                    contentResolver0.registerContentObserver(uri0, true, contentObserver0);
                }
            }
        }
    }

    @Override  // com.unity3d.services.core.device.VolumeChange
    public void stopObserving() {
        synchronized(this) {
            if(this.contentObserver == null) {
                return;
            }
            Context context0 = ClientProperties.getApplicationContext();
            if(context0 != null) {
                ContentResolver contentResolver0 = context0.getContentResolver();
                if(contentResolver0 != null) {
                    ContentObserver contentObserver0 = this.contentObserver;
                    L.m(contentObserver0);
                    contentResolver0.unregisterContentObserver(contentObserver0);
                }
            }
            this.contentObserver = null;
        }
    }

    private final void triggerListeners() {
        synchronized(this) {
            for(Object object0: this.listeners) {
                ((VolumeChangeListener)object0).onVolumeChanged(Device.getStreamVolume(((VolumeChangeListener)object0).getStreamType()));
            }
        }
    }

    @Override  // com.unity3d.services.core.device.VolumeChange
    public void unregisterListener(@l VolumeChangeListener volumeChangeListener0) {
        synchronized(this) {
            L.p(volumeChangeListener0, "volumeChangeListener");
            this.listeners.remove(volumeChangeListener0);
            if(this.listeners.isEmpty()) {
                this.stopObserving();
            }
        }
    }
}

