package io.realm.log;

import io.realm.internal.Keep;
import o3.h;

@Keep
public interface RealmLogger {
    void log(int arg1, String arg2, @h Throwable arg3, @h String arg4);
}

