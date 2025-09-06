package com.davemorrissey.labs.subscaleview.decoder;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

public interface DecoderFactory {
    @NonNull
    Object make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;
}

