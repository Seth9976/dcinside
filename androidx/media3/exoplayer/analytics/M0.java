package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;

public final class m0 implements Event {
    public final EventTime a;
    public final AudioTrackConfig b;

    public m0(EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0) {
        this.a = analyticsListener$EventTime0;
        this.b = audioSink$AudioTrackConfig0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.m2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

