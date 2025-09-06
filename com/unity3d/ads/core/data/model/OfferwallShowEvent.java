package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.w;
import y4.l;

public abstract class OfferwallShowEvent {
    public static final class Show extends OfferwallShowEvent {
        @l
        public static final Show INSTANCE;

        static {
            Show.INSTANCE = new Show();
        }

        private Show() {
            super(null);
        }
    }

    private OfferwallShowEvent() {
    }

    public OfferwallShowEvent(w w0) {
    }
}

