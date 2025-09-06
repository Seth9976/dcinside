package com.vungle.ads.internal.util;

import A3.a;
import android.os.CountDownTimer;
import androidx.annotation.VisibleForTesting;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class u {
    private final double durationSecs;
    private boolean isCanceled;
    private boolean isPaused;
    private double nextDurationSecs;
    @l
    private final a onFinish;
    @l
    private final a onTick;
    private final boolean repeats;
    private long startTimeMillis;
    @m
    private CountDownTimer timer;

    public u(double f, boolean z, @l a a0, @l a a1) {
        L.p(a0, "onTick");
        L.p(a1, "onFinish");
        super();
        this.durationSecs = f;
        this.repeats = z;
        this.onTick = a0;
        this.onFinish = a1;
        this.nextDurationSecs = f;
    }

    public u(double f, boolean z, a a0, a a1, int v, w w0) {
        static final class com.vungle.ads.internal.util.u.a extends N implements a {
            public static final com.vungle.ads.internal.util.u.a INSTANCE;

            static {
                com.vungle.ads.internal.util.u.a.INSTANCE = new com.vungle.ads.internal.util.u.a();
            }

            com.vungle.ads.internal.util.u.a() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }

        if((v & 4) != 0) {
            a0 = com.vungle.ads.internal.util.u.a.INSTANCE;
        }
        this(f, z, a0, a1);
    }

    public final void cancel() {
        this.isPaused = false;
        this.isCanceled = true;
        CountDownTimer countDownTimer0 = this.timer;
        if(countDownTimer0 != null) {
            countDownTimer0.cancel();
        }
        this.timer = null;
    }

    private final CountDownTimer createCountdown(long v) {
        public static final class b extends CountDownTimer {
            b(long v, u u0) {
                u.this = u0;
                super(v, v);
            }

            @Override  // android.os.CountDownTimer
            public void onFinish() {
                u u0 = u.this;
                u0.onFinish.invoke();
                if(u0.repeats && !u0.isCanceled) {
                    u0.setNextDurationSecs$vungle_ads_release(u0.durationSecs);
                    u0.start();
                    return;
                }
                u0.cancel();
            }

            @Override  // android.os.CountDownTimer
            public void onTick(long v) {
                u.this.onTick.invoke();
            }
        }

        return new b(v, this);
    }

    private final long getDurationMillis() {
        return (long)(this.durationSecs * 1000.0);
    }

    // 去混淆评级： 低(20)
    public final long getElapsedMillis$vungle_ads_release() {
        return this.isPaused ? this.getDurationMillis() - this.getNextDurationMillis() : System.currentTimeMillis() - this.startTimeMillis;
    }

    @VisibleForTesting
    public static void getElapsedMillis$vungle_ads_release$annotations() {
    }

    private final double getElapsedSecs() {
        return (double)(this.getElapsedMillis$vungle_ads_release() / 1000L);
    }

    private final long getNextDurationMillis() {
        return (long)(this.nextDurationSecs * 1000.0);
    }

    public final double getNextDurationSecs$vungle_ads_release() {
        return this.nextDurationSecs;
    }

    @VisibleForTesting
    public static void getNextDurationSecs$vungle_ads_release$annotations() {
    }

    public final long getStartTimeMillis$vungle_ads_release() {
        return this.startTimeMillis;
    }

    @VisibleForTesting
    public static void getStartTimeMillis$vungle_ads_release$annotations() {
    }

    @m
    public final CountDownTimer getTimer$vungle_ads_release() {
        return this.timer;
    }

    @VisibleForTesting
    public static void getTimer$vungle_ads_release$annotations() {
    }

    public final void pause() {
        if(this.timer == null) {
            return;
        }
        this.nextDurationSecs -= this.getElapsedSecs();
        this.isPaused = true;
        CountDownTimer countDownTimer0 = this.timer;
        if(countDownTimer0 != null) {
            countDownTimer0.cancel();
        }
        this.timer = null;
    }

    public final void reset() {
        this.cancel();
        this.start();
    }

    public final void resume() {
        if(!this.isPaused) {
            return;
        }
        this.isPaused = false;
        this.start();
    }

    public final void setNextDurationSecs$vungle_ads_release(double f) {
        this.nextDurationSecs = f;
    }

    public final void setStartTimeMillis$vungle_ads_release(long v) {
        this.startTimeMillis = v;
    }

    public final void setTimer$vungle_ads_release(@m CountDownTimer countDownTimer0) {
        this.timer = countDownTimer0;
    }

    public final void start() {
        this.startTimeMillis = System.currentTimeMillis();
        CountDownTimer countDownTimer0 = this.createCountdown(this.getNextDurationMillis());
        this.timer = countDownTimer0;
        if(countDownTimer0 != null) {
            countDownTimer0.start();
        }
    }
}

