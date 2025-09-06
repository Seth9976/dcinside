package com.unity3d.services.core.device;

import android.util.SparseArray;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.L;
import y4.l;

public final class VolumeChangeMonitor {
    @l
    private final IEventSender eventSender;
    @l
    private final VolumeChange volumeChange;
    @l
    private final SparseArray volumeChangeListeners;

    public VolumeChangeMonitor(@l IEventSender iEventSender0, @l VolumeChange volumeChange0) {
        L.p(iEventSender0, "eventSender");
        L.p(volumeChange0, "volumeChange");
        super();
        this.eventSender = iEventSender0;
        this.volumeChange = volumeChange0;
        this.volumeChangeListeners = new SparseArray();
    }

    public final void registerVolumeChangeListener(int v) {
        if(this.volumeChangeListeners.get(v) == null) {
            com.unity3d.services.core.device.VolumeChangeMonitor.registerVolumeChangeListener.listener.1 volumeChangeMonitor$registerVolumeChangeListener$listener$10 = new VolumeChangeListener() {
                @Override  // com.unity3d.services.core.device.VolumeChangeListener
                public int getStreamType() {
                    return this.$streamType;
                }

                @Override  // com.unity3d.services.core.device.VolumeChangeListener
                public void onVolumeChanged(int v) {
                    Object[] arr_object = {this.getStreamType(), v, Device.getStreamMaxVolume(this.$streamType)};
                    v.eventSender.sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, arr_object);
                }
            };
            this.volumeChangeListeners.append(v, volumeChangeMonitor$registerVolumeChangeListener$listener$10);
            this.volumeChange.registerListener(volumeChangeMonitor$registerVolumeChangeListener$listener$10);
        }
    }

    public final void unregisterVolumeChangeListener(int v) {
        if(this.volumeChangeListeners.get(v) != null) {
            VolumeChangeListener volumeChangeListener0 = (VolumeChangeListener)this.volumeChangeListeners.get(v);
            L.o(volumeChangeListener0, "listener");
            this.volumeChange.unregisterListener(volumeChangeListener0);
            this.volumeChangeListeners.remove(v);
        }
    }
}

