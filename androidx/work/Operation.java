package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.t0;

public interface Operation {
    public static abstract class State {
        public static final class FAILURE extends State {
            private final Throwable a;

            public FAILURE(@NonNull Throwable throwable0) {
                this.a = throwable0;
            }

            @NonNull
            public Throwable a() {
                return this.a;
            }

            @Override
            @NonNull
            public String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        public static final class IN_PROGRESS extends State {
            private IN_PROGRESS() {
            }

            IN_PROGRESS(androidx.work.Operation.1 operation$10) {
            }

            @Override
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class SUCCESS extends State {
            private SUCCESS() {
            }

            SUCCESS(androidx.work.Operation.1 operation$10) {
            }

            @Override
            @NonNull
            public String toString() {
                return "SUCCESS";
            }
        }

    }

    @RestrictTo({Scope.b})
    public static final SUCCESS a;
    @RestrictTo({Scope.b})
    public static final IN_PROGRESS b;

    static {
        Operation.a = new SUCCESS(null);
        Operation.b = new IN_PROGRESS(null);
    }

    @NonNull
    t0 getResult();

    @NonNull
    LiveData getState();

    class androidx.work.Operation.1 {
    }

}

