package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.settings.SM;
import com.bytedance.sdk.openadsdk.core.settings.cz;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.cr.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ.ReZ;
import com.bytedance.sdk.openadsdk.qla.ReZ.Zh;

public class ub {
    static class PjT {
        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application PjT;

        static {
            try {
                Object object0 = PjT.Zh();
                PjT.PjT = (Application)object0.getClass().getMethod("getApplication", null).invoke(object0, null);
            }
            catch(Throwable throwable0) {
                RD.PjT("MyApplication", "application get failed", throwable0);
            }
        }

        @Nullable
        public static Application PjT() {
            return PjT.PjT;
        }

        // 去混淆评级： 低(20)
        private static Object Zh() {
            ActivityThread.class.getMethod("currentActivityThread", null).setAccessible(true);
            return ActivityThread.currentActivityThread();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context PjT = null;
    private static int ReZ = -1;
    private static volatile ltE Zh;

    static {
    }

    public static Zh JQp() {
        return SM.PjT() ? cr.PjT() : ReZ.PjT();
    }

    public static Context PjT() {
        if(ub.PjT == null) {
            ub.Zh(null);
        }
        return ub.PjT;
    }

    public static Context PjT(Context context0) {
        if(context0 == null) {
            context0 = ub.PjT();
        }
        if(context0 instanceof Application) {
            return context0;
        }
        return context0 == null ? null : context0.getApplicationContext();
    }

    public static ltE ReZ() {
        if(ub.Zh == null) {
            Class class0 = ub.class;
            __monitor_enter(class0);
            try {
                if(ub.Zh == null) {
                    ub.Zh = new Owx(ub.PjT);
                }
                __monitor_exit(class0);
                return ub.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return ub.Zh;
    }

    public static int Zh() {
        if(ub.ReZ < 0) {
            Context context0 = ub.PjT();
            if(context0 != null) {
                ub.ReZ = ViewConfiguration.get(context0).getScaledTouchSlop();
            }
        }
        return ub.ReZ;
    }

    public static void Zh(Context context0) {
        if(ub.PjT == null) {
            Class class0 = ub.class;
            __monitor_enter(class0);
            try {
                if(ub.PjT == null) {
                    if(context0 != null) {
                        ub.PjT = context0;
                        Context context1 = context0.getApplicationContext();
                        if(context1 != null) {
                            ub.PjT = context1;
                        }
                        __monitor_exit(class0);
                        return;
                    }
                    Application application0 = PjT.PjT();
                    if(application0 != null) {
                        ub.PjT = application0;
                    }
                }
                __monitor_exit(class0);
                return;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
    }

    public static cz cr() {
        return xs.Gr();
    }
}

