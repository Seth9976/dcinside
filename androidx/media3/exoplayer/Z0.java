package androidx.media3.exoplayer;

import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class z0 implements Event {
    public final DeviceInfo a;

    public z0(DeviceInfo deviceInfo0) {
        this.a = deviceInfo0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ComponentListener.V(this.a, ((Listener)object0));
    }
}

