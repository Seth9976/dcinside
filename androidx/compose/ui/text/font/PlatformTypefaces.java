package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import y4.l;
import y4.m;

public interface PlatformTypefaces {
    @l
    Typeface a(@l GenericFontFamily arg1, @l FontWeight arg2, int arg3);

    @l
    Typeface b(@l FontWeight arg1, int arg2);

    @m
    Typeface c(@l String arg1, @l FontWeight arg2, int arg3, @l Settings arg4, @l Context arg5);
}

