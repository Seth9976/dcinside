package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
public interface LazyLayoutIntervalContent {
    @m
    Function1 getKey();

    @l
    Function1 getType();
}

