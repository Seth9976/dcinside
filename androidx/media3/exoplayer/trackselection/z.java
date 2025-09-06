package androidx.media3.exoplayer.trackselection;

public final class z implements AdaptiveTrackSelectionFactory {
    public final Factory a;

    public z(Factory randomTrackSelection$Factory0) {
        this.a = randomTrackSelection$Factory0;
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelectionUtil$AdaptiveTrackSelectionFactory
    public final ExoTrackSelection a(Definition exoTrackSelection$Definition0) {
        return this.a.c(exoTrackSelection$Definition0);
    }
}

