package com.gomfactory.adpie.sdk.nativeads.util;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.view.View;
import com.gomfactory.adpie.sdk.util.AsyncTaskUtil;
import java.util.HashMap;

public class VideoThumbnail {
    private Bitmap mBitmap;
    private long mTimeUs;
    private String mUrl;
    private View mView;

    public VideoThumbnail(View view0, String s) {
        this.mTimeUs = -1L;
        this.mView = view0;
        this.mUrl = s;
    }

    public VideoThumbnail(View view0, String s, long v) {
        this.mView = view0;
        this.mUrl = s;
        this.mTimeUs = v;
    }

    public void execute() {
        new AsyncTaskUtil() {
            @Override  // com.gomfactory.adpie.sdk.util.AsyncTaskUtil
            public void doInBackground() {
                MediaMetadataRetriever mediaMetadataRetriever0 = null;
                try {
                    mediaMetadataRetriever0 = new MediaMetadataRetriever();
                    goto label_6;
                }
                catch(Exception unused_ex) {
                    goto label_16;
                }
                catch(Throwable throwable0) {
                }
                Throwable throwable1 = throwable0;
                goto label_19;
                try {
                label_6:
                    mediaMetadataRetriever0.setDataSource(VideoThumbnail.this.mUrl, new HashMap());
                    if(VideoThumbnail.this.mTimeUs > -1L) {
                        Bitmap bitmap0 = mediaMetadataRetriever0.getFrameAtTime(VideoThumbnail.this.mTimeUs * 1000L, 3);
                        VideoThumbnail.this.mBitmap = bitmap0;
                        goto label_22;
                    }
                    Bitmap bitmap1 = mediaMetadataRetriever0.getFrameAtTime();
                    VideoThumbnail.this.mBitmap = bitmap1;
                    goto label_22;
                }
                catch(Exception unused_ex) {
                }
                catch(Throwable throwable1) {
                    goto label_19;
                }
            label_16:
                if(mediaMetadataRetriever0 != null) {
                    try {
                        mediaMetadataRetriever0.release();
                    }
                    catch(Exception unused_ex) {
                    }
                    return;
                label_19:
                    if(mediaMetadataRetriever0 != null) {
                        try {
                            mediaMetadataRetriever0.release();
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                    throw throwable1;
                    try {
                    label_22:
                        mediaMetadataRetriever0.release();
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }

            @Override  // com.gomfactory.adpie.sdk.util.AsyncTaskUtil
            public void doInUiThread() {
                if(VideoThumbnail.this.mView != null) {
                    if(VideoThumbnail.this.mBitmap != null) {
                        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(VideoThumbnail.this.mView.getResources(), VideoThumbnail.this.mBitmap);
                        VideoThumbnail.this.mView.setBackground(bitmapDrawable0);
                        return;
                    }
                    VideoThumbnail.this.mView.setBackground(null);
                }
            }
        }.execute();
    }
}

