package com.hjq.toast;

import android.os.Handler;
import android.os.Message;
import android.view.WindowManager.BadTokenException;

final class h extends Handler {
    private final Handler a;

    h(Handler handler0) {
        this.a = handler0;
    }

    @Override  // android.os.Handler
    public void handleMessage(Message message0) {
        try {
            this.a.handleMessage(message0);
        }
        catch(WindowManager.BadTokenException | IllegalStateException windowManager$BadTokenException0) {
            windowManager$BadTokenException0.printStackTrace();
        }
    }
}

