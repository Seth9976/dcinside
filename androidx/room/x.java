package androidx.room;

public final class x implements Runnable {
    public final RoomTrackingLiveData a;

    public x(RoomTrackingLiveData roomTrackingLiveData0) {
        this.a = roomTrackingLiveData0;
    }

    @Override
    public final void run() {
        RoomTrackingLiveData.F(this.a);
    }
}

