package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Message;
import androidx.annotation.RequiresApi;

public final class MessageCompat {
    @RequiresApi(22)
    static class Api22Impl {
        static boolean a(Message message0) {
            return message0.isAsynchronous();
        }

        static void b(Message message0, boolean z) {
            message0.setAsynchronous(z);
        }
    }

    private static boolean a = true;
    private static boolean b = true;

    static {
    }

    @SuppressLint({"NewApi"})
    public static boolean a(Message message0) {
        if(Build.VERSION.SDK_INT >= 22) {
            return Api22Impl.a(message0);
        }
        if(MessageCompat.b) {
            try {
                return Api22Impl.a(message0);
            }
            catch(NoSuchMethodError unused_ex) {
                MessageCompat.b = false;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public static void b(Message message0, boolean z) {
        if(Build.VERSION.SDK_INT >= 22) {
            Api22Impl.b(message0, z);
            return;
        }
        if(MessageCompat.a) {
            try {
                Api22Impl.b(message0, z);
            }
            catch(NoSuchMethodError unused_ex) {
                MessageCompat.a = false;
            }
        }
    }
}

