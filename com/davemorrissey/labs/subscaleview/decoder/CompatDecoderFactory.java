package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap.Config;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

public class CompatDecoderFactory implements DecoderFactory {
    private final Bitmap.Config bitmapConfig;
    private final Class clazz;

    public CompatDecoderFactory(@NonNull Class class0) {
        this(class0, null);
    }

    public CompatDecoderFactory(@NonNull Class class0, Bitmap.Config bitmap$Config0) {
        this.clazz = class0;
        this.bitmapConfig = bitmap$Config0;
    }

    @Override  // com.davemorrissey.labs.subscaleview.decoder.DecoderFactory
    @NonNull
    public Object make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        return this.bitmapConfig == null ? this.clazz.newInstance() : this.clazz.getConstructor(Bitmap.Config.class).newInstance(this.bitmapConfig);
    }
}

