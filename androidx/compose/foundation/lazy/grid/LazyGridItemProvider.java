package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import y4.l;

@ExperimentalFoundationApi
public interface LazyGridItemProvider extends LazyLayoutItemProvider {
    long b(@l LazyGridItemSpanScope arg1, int arg2);

    boolean c();

    @l
    LazyGridSpanLayoutProvider f();
}

