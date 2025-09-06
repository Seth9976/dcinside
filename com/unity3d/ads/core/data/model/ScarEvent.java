package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.w;
import y4.l;

public abstract class ScarEvent {
    public static final class Show extends ScarEvent {
        @l
        public static final Show INSTANCE;

        static {
            Show.INSTANCE = new Show();
        }

        private Show() {
            super(null);
        }
    }

    private ScarEvent() {
    }

    public ScarEvent(w w0) {
    }
}

