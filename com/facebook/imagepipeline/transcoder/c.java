package com.facebook.imagepipeline.transcoder;

import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.h;
import java.io.IOException;
import java.io.OutputStream;
import y4.l;
import y4.m;

public interface c {
    @l
    String a();

    boolean b(@l X0.c arg1);

    @l
    b c(@l com.facebook.imagepipeline.image.l arg1, @l OutputStream arg2, @m h arg3, @m g arg4, @m X0.c arg5, @m Integer arg6, @m ColorSpace arg7) throws IOException;

    boolean d(@l com.facebook.imagepipeline.image.l arg1, @m h arg2, @m g arg3);
}

