package com.bytedance.sdk.component.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import com.bytedance.sdk.component.Au.Au;
import java.util.concurrent.ExecutorService;

public class Zh {
    public interface PjT {
        ExecutorService getAsyncStartActivityThreadPool();

        boolean isEnableAsyncStartActivity();
    }

    public interface com.bytedance.sdk.component.utils.Zh.Zh {
        void PjT();

        void PjT(Throwable arg1);
    }

    private static PjT PjT;

    public static Activity PjT(View view0) {
        if(view0 == null) {
            return null;
        }
        Context context0 = view0.getContext();
        if(context0 instanceof Activity) {
            return (Activity)context0;
        }
        View view1 = view0.getRootView();
        if(view1 == null) {
            return null;
        }
        View view2 = view1.findViewById(0x1020002);
        if(view2 == null) {
            return null;
        }
        Context context1 = view2.getContext();
        if(context1 == null) {
            return null;
        }
        if(context1 instanceof Activity) {
            return (Activity)context1;
        }
        if(context1 instanceof ContextWrapper) {
            Context context2 = ((ContextWrapper)context1).getBaseContext();
            return context2 instanceof Activity ? ((Activity)context2) : null;
        }
        return null;
    }

    public static void PjT(PjT zh$PjT0) {
        Zh.PjT = zh$PjT0;
    }

    public static boolean PjT(Context context0, Intent intent0, com.bytedance.sdk.component.utils.Zh.Zh zh$Zh0) {
        return Zh.PjT(context0, intent0, zh$Zh0, false);
    }

    public static boolean PjT(Context context0, Intent intent0, com.bytedance.sdk.component.utils.Zh.Zh zh$Zh0, boolean z) {
        if(z && (Zh.PjT != null && Zh.PjT.isEnableAsyncStartActivity())) {
            ExecutorService executorService0 = Zh.PjT.getAsyncStartActivityThreadPool();
            if(executorService0 != null) {
                executorService0.execute(new Au("startAct") {
                    @Override
                    public void run() {
                        Zh.ReZ(context0, intent0, zh$Zh0);
                    }
                });
                return true;
            }
        }
        return Zh.ReZ(context0, intent0, zh$Zh0);
    }

    private static boolean ReZ(Context context0, Intent intent0, com.bytedance.sdk.component.utils.Zh.Zh zh$Zh0) {
        if(context0 != null && intent0 != null) {
            try {
                if(!(context0 instanceof Activity)) {
                    intent0.addFlags(0x10000000);
                }
                context0.startActivity(intent0);
                if(zh$Zh0 != null) {
                    zh$Zh0.PjT();
                }
                return true;
            label_8:
                if(zh$Zh0 != null) {
                    goto label_9;
                }
                return false;
            }
            catch(Throwable throwable0) {
                goto label_8;
            }
        label_9:
            zh$Zh0.PjT(throwable0);
        }
        return false;
    }
}

