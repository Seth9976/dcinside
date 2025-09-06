package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import java.util.Map;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@Stable
public interface LazyLayoutItemProvider {
    @l
    Object D(int arg1);

    @m
    Object E(int arg1);

    @Composable
    void F(int arg1, @m Composer arg2, int arg3);

    @l
    Map G();

    int getItemCount();
}

