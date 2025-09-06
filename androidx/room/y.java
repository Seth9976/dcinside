package androidx.room;

public final class y implements Runnable {
    public final RoomTrackingLiveData a;

    public y(RoomTrackingLiveData roomTrackingLiveData0) {
        this.a = roomTrackingLiveData0;
    }

    @Override
    public final void run() {
        RoomTrackingLiveData.E(this.a);
    }
}

