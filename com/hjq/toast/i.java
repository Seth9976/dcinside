package com.hjq.toast;

import android.annotation.TargetApi;
import android.app.Application;
import android.os.Handler;
import android.widget.Toast;
import java.lang.reflect.Field;

@TargetApi(19)
public class i extends f {
    private boolean c;

    public i(Application application0) {
        super(application0);
    }

    private void c() {
        if(this.c) {
            return;
        }
        try {
            this.c = true;
            Field field0 = Toast.class.getDeclaredField("mTN");
            field0.setAccessible(true);
            Object object0 = field0.get(this);
            Field field1 = field0.getType().getDeclaredField("mHandler");
            field1.setAccessible(true);
            Handler handler0 = (Handler)field1.get(object0);
            if(handler0 instanceof h) {
                return;
            }
            field1.set(object0, new h(handler0));
        }
        catch(IllegalAccessException | NoSuchFieldException illegalAccessException0) {
            illegalAccessException0.printStackTrace();
        }
    }

    @Override  // com.hjq.toast.f
    public void show() {
        this.c();
        super.show();
    }
}

