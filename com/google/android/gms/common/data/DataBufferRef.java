package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public abstract class DataBufferRef {
    @NonNull
    @KeepForSdk
    protected final DataHolder mDataHolder;
    @KeepForSdk
    protected int mDataRow;
    private int zaa;

    @KeepForSdk
    public DataBufferRef(@NonNull DataHolder dataHolder0, int v) {
        this.mDataHolder = (DataHolder)Preconditions.checkNotNull(dataHolder0);
        this.zaa(v);
    }

    @KeepForSdk
    protected void copyToBuffer(@NonNull String s, @NonNull CharArrayBuffer charArrayBuffer0) {
        this.mDataHolder.zac(s, this.mDataRow, this.zaa, charArrayBuffer0);
    }

    // 去混淆评级： 低(30)
    @Override
    @KeepForSdk
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof DataBufferRef && Objects.equal(((DataBufferRef)object0).mDataRow, this.mDataRow) && Objects.equal(((DataBufferRef)object0).zaa, this.zaa) && ((DataBufferRef)object0).mDataHolder == this.mDataHolder;
    }

    @KeepForSdk
    protected boolean getBoolean(@NonNull String s) {
        return this.mDataHolder.getBoolean(s, this.mDataRow, this.zaa);
    }

    @NonNull
    @KeepForSdk
    protected byte[] getByteArray(@NonNull String s) {
        return this.mDataHolder.getByteArray(s, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    protected int getDataRow() {
        return this.mDataRow;
    }

    @KeepForSdk
    protected double getDouble(@NonNull String s) {
        return this.mDataHolder.zaa(s, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    protected float getFloat(@NonNull String s) {
        return this.mDataHolder.zab(s, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    protected int getInteger(@NonNull String s) {
        return this.mDataHolder.getInteger(s, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    protected long getLong(@NonNull String s) {
        return this.mDataHolder.getLong(s, this.mDataRow, this.zaa);
    }

    @NonNull
    @KeepForSdk
    protected String getString(@NonNull String s) {
        return this.mDataHolder.getString(s, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String s) {
        return this.mDataHolder.hasColumn(s);
    }

    @KeepForSdk
    protected boolean hasNull(@NonNull String s) {
        return this.mDataHolder.hasNull(s, this.mDataRow, this.zaa);
    }

    @Override
    @KeepForSdk
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.mDataRow, this.zaa, this.mDataHolder});
    }

    @KeepForSdk
    public boolean isDataValid() {
        return !this.mDataHolder.isClosed();
    }

    @Nullable
    @KeepForSdk
    protected Uri parseUri(@NonNull String s) {
        String s1 = this.mDataHolder.getString(s, this.mDataRow, this.zaa);
        return s1 == null ? null : Uri.parse(s1);
    }

    protected final void zaa(int v) {
        Preconditions.checkState(v >= 0 && v < this.mDataHolder.getCount());
        this.mDataRow = v;
        this.zaa = this.mDataHolder.getWindowIndex(v);
    }
}

