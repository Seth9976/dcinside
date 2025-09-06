package com.gomfactory.adpie.sdk.videoads;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.ui.progressbar.CircularProgressBar.ProgressDirection;
import com.gomfactory.adpie.sdk.ui.progressbar.CircularProgressBar;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.ClickThroughUtil;
import com.gomfactory.adpie.sdk.util.DisplayUtil;
import com.gomfactory.adpie.sdk.util.HttpUtil;
import com.gomfactory.adpie.sdk.util.ReportUtil;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class VideoAdView extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public class NoSkipSeekBar extends SeekBar {
        public NoSkipSeekBar(Context context0) {
            super(context0);
        }

        public NoSkipSeekBar(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public NoSkipSeekBar(Context context0, AttributeSet attributeSet0, int v) {
            super(context0, attributeSet0, v);
        }

        @Override  // android.widget.AbsSeekBar
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            return true;
        }
    }

    public static final String TAG = "VideoAdView";
    private Runnable checkVideoPrepared;
    private boolean isSentComplete;
    private boolean isSentFirst;
    private boolean isSentImpression;
    private boolean isSentSecond;
    private boolean isSentStart;
    private boolean isSentThird;
    private Button mAdButton;
    private AdEventListener mAdEventListener;
    private CircularProgressBar mCircularProgressBar;
    private Context mContext;
    private int mFirstQuartile;
    private boolean mIsClickableVideo;
    private boolean mIsPrepared;
    private boolean mIsWebViewLanding;
    private String mLink;
    private MediaPlayer mMediaPlayer;
    private ProgressBar mProgressBar;
    private int mSecondQuartile;
    private NoSkipSeekBar mSeekbar;
    private Button mSkipButton;
    private int mSkipOffsetSec;
    private int mThirdQuartile;
    private TextView mTimerTextView;
    private VideoAdData mVideoAdData;
    private float mVideoCurPosSec;
    private int mVideoDuration;
    private VideoView mVideoView;
    private static final AtomicInteger sNextGeneratedId;
    private Runnable showCloseButton;
    private Runnable updateTimeRunnable;
    private Runnable videoPlayTrackerRunnable;

    static {
        VideoAdView.sNextGeneratedId = new AtomicInteger(1);
    }

    public VideoAdView(Context context0) {
        super(context0);
        this.showCloseButton = new Runnable() {
            @Override
            public void run() {
                if(VideoAdView.this.mCircularProgressBar != null) {
                    VideoAdView.this.mCircularProgressBar.setVisibility(8);
                }
                if(VideoAdView.this.mTimerTextView != null) {
                    VideoAdView.this.mTimerTextView.setVisibility(8);
                }
                if(VideoAdView.this.mSkipButton != null) {
                    VideoAdView.this.mSkipButton.setVisibility(0);
                }
            }
        };
        this.updateTimeRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoAdView.this.mVideoView != null) {
                        float f = ((float)VideoAdView.this.mVideoView.getCurrentPosition()) / 1000.0f;
                        VideoAdView.this.mVideoCurPosSec = f;
                    }
                    if(VideoAdView.this.mSeekbar != null && VideoAdView.this.mVideoView != null) {
                        VideoAdView.this.mSeekbar.setProgress(VideoAdView.this.mVideoView.getCurrentPosition());
                    }
                    if(VideoAdView.this.mSkipOffsetSec > 0) {
                        if(((float)VideoAdView.this.mSkipOffsetSec) - VideoAdView.this.mVideoCurPosSec > 0.0f) {
                            if(VideoAdView.this.mCircularProgressBar != null) {
                                VideoAdView.this.mCircularProgressBar.setProgressWithAnimation(VideoAdView.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                                VideoAdView.this.mCircularProgressBar.setVisibility(0);
                            }
                            if(VideoAdView.this.mTimerTextView != null) {
                                VideoAdView.this.mTimerTextView.setText(VideoAdView.this.mSkipOffsetSec - ((int)VideoAdView.this.mVideoCurPosSec) + "");
                                VideoAdView.this.mTimerTextView.setVisibility(0);
                            }
                        }
                        else if(VideoAdView.this.mSkipButton != null && VideoAdView.this.mSkipButton.getVisibility() != 0) {
                            VideoAdView.this.post(VideoAdView.this.showCloseButton);
                        }
                    }
                    else if(VideoAdView.this.mSkipOffsetSec != 0) {
                        if(VideoAdView.this.mCircularProgressBar != null) {
                            VideoAdView.this.mCircularProgressBar.setProgressWithAnimation(VideoAdView.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                            VideoAdView.this.mCircularProgressBar.setVisibility(0);
                        }
                        if(VideoAdView.this.mTimerTextView != null) {
                            VideoAdView.this.mTimerTextView.setText(VideoAdView.this.mVideoDuration - ((int)VideoAdView.this.mVideoCurPosSec) + "");
                            VideoAdView.this.mTimerTextView.setVisibility(0);
                        }
                    }
                    else if(VideoAdView.this.mSkipButton != null && VideoAdView.this.mSkipButton.getVisibility() != 0) {
                        VideoAdView.this.post(VideoAdView.this.showCloseButton);
                    }
                }
                catch(Exception exception0) {
                    AdPieLog.e("VideoAdView", exception0);
                }
            }
        };
        this.videoPlayTrackerRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoAdView.this.mVideoView != null && VideoAdView.this.mVideoView.isPlaying()) {
                        int v = VideoAdView.this.mVideoView.getCurrentPosition();
                        AdPieLog.d("VideoAdView", "video current position  : " + v / 1000);
                        if(v / 1000 > 0) {
                            if(v / 1000 == VideoAdView.this.mFirstQuartile && !VideoAdView.this.isSentFirst) {
                                VideoAdView.this.isSentFirst = true;
                                ReportUtil.sendReport("VIDEO_FIRST_QUARTILE", VideoAdView.this.mVideoAdData.getTrackingFirstQuartileUrls());
                            }
                            else if(v / 1000 == VideoAdView.this.mSecondQuartile && !VideoAdView.this.isSentSecond) {
                                VideoAdView.this.isSentSecond = true;
                                ReportUtil.sendReport("VIDEO_MID_POINT", VideoAdView.this.mVideoAdData.getTrackingMidpointUrls());
                            }
                            else if(v / 1000 == VideoAdView.this.mThirdQuartile && !VideoAdView.this.isSentThird) {
                                VideoAdView.this.isSentThird = true;
                                ReportUtil.sendReport("VIDEO_THIRD_QUARTILE", VideoAdView.this.mVideoAdData.getTrackingThirdQuartileUrls());
                            }
                        }
                        VideoAdView.this.post(VideoAdView.this.updateTimeRunnable);
                        VideoAdView.this.postDelayed(VideoAdView.this.videoPlayTrackerRunnable, 500L);
                        return;
                    }
                    AdPieLog.d("VideoAdView", "::: videoview : " + (VideoAdView.this.mVideoView == null ? "null" : "isPlaying - " + VideoAdView.this.mVideoView.isPlaying()));
                    return;
                }
                catch(Exception exception0) {
                }
                AdPieLog.e("VideoAdView", exception0);
            }
        };
        this.checkVideoPrepared = new Runnable() {
            @Override
            public void run() {
                if(!VideoAdView.this.mIsPrepared) {
                    VideoAdView.this.notifyError();
                    VideoAdView.this.stopVideo();
                }
            }
        };
        this.mContext = context0;
    }

    public VideoAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.showCloseButton = new Runnable() {
            @Override
            public void run() {
                if(VideoAdView.this.mCircularProgressBar != null) {
                    VideoAdView.this.mCircularProgressBar.setVisibility(8);
                }
                if(VideoAdView.this.mTimerTextView != null) {
                    VideoAdView.this.mTimerTextView.setVisibility(8);
                }
                if(VideoAdView.this.mSkipButton != null) {
                    VideoAdView.this.mSkipButton.setVisibility(0);
                }
            }
        };
        this.updateTimeRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoAdView.this.mVideoView != null) {
                        float f = ((float)VideoAdView.this.mVideoView.getCurrentPosition()) / 1000.0f;
                        VideoAdView.this.mVideoCurPosSec = f;
                    }
                    if(VideoAdView.this.mSeekbar != null && VideoAdView.this.mVideoView != null) {
                        VideoAdView.this.mSeekbar.setProgress(VideoAdView.this.mVideoView.getCurrentPosition());
                    }
                    if(VideoAdView.this.mSkipOffsetSec > 0) {
                        if(((float)VideoAdView.this.mSkipOffsetSec) - VideoAdView.this.mVideoCurPosSec > 0.0f) {
                            if(VideoAdView.this.mCircularProgressBar != null) {
                                VideoAdView.this.mCircularProgressBar.setProgressWithAnimation(VideoAdView.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                                VideoAdView.this.mCircularProgressBar.setVisibility(0);
                            }
                            if(VideoAdView.this.mTimerTextView != null) {
                                VideoAdView.this.mTimerTextView.setText(VideoAdView.this.mSkipOffsetSec - ((int)VideoAdView.this.mVideoCurPosSec) + "");
                                VideoAdView.this.mTimerTextView.setVisibility(0);
                            }
                        }
                        else if(VideoAdView.this.mSkipButton != null && VideoAdView.this.mSkipButton.getVisibility() != 0) {
                            VideoAdView.this.post(VideoAdView.this.showCloseButton);
                        }
                    }
                    else if(VideoAdView.this.mSkipOffsetSec != 0) {
                        if(VideoAdView.this.mCircularProgressBar != null) {
                            VideoAdView.this.mCircularProgressBar.setProgressWithAnimation(VideoAdView.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                            VideoAdView.this.mCircularProgressBar.setVisibility(0);
                        }
                        if(VideoAdView.this.mTimerTextView != null) {
                            VideoAdView.this.mTimerTextView.setText(VideoAdView.this.mVideoDuration - ((int)VideoAdView.this.mVideoCurPosSec) + "");
                            VideoAdView.this.mTimerTextView.setVisibility(0);
                        }
                    }
                    else if(VideoAdView.this.mSkipButton != null && VideoAdView.this.mSkipButton.getVisibility() != 0) {
                        VideoAdView.this.post(VideoAdView.this.showCloseButton);
                    }
                }
                catch(Exception exception0) {
                    AdPieLog.e("VideoAdView", exception0);
                }
            }
        };
        this.videoPlayTrackerRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoAdView.this.mVideoView != null && VideoAdView.this.mVideoView.isPlaying()) {
                        int v = VideoAdView.this.mVideoView.getCurrentPosition();
                        AdPieLog.d("VideoAdView", "video current position  : " + v / 1000);
                        if(v / 1000 > 0) {
                            if(v / 1000 == VideoAdView.this.mFirstQuartile && !VideoAdView.this.isSentFirst) {
                                VideoAdView.this.isSentFirst = true;
                                ReportUtil.sendReport("VIDEO_FIRST_QUARTILE", VideoAdView.this.mVideoAdData.getTrackingFirstQuartileUrls());
                            }
                            else if(v / 1000 == VideoAdView.this.mSecondQuartile && !VideoAdView.this.isSentSecond) {
                                VideoAdView.this.isSentSecond = true;
                                ReportUtil.sendReport("VIDEO_MID_POINT", VideoAdView.this.mVideoAdData.getTrackingMidpointUrls());
                            }
                            else if(v / 1000 == VideoAdView.this.mThirdQuartile && !VideoAdView.this.isSentThird) {
                                VideoAdView.this.isSentThird = true;
                                ReportUtil.sendReport("VIDEO_THIRD_QUARTILE", VideoAdView.this.mVideoAdData.getTrackingThirdQuartileUrls());
                            }
                        }
                        VideoAdView.this.post(VideoAdView.this.updateTimeRunnable);
                        VideoAdView.this.postDelayed(VideoAdView.this.videoPlayTrackerRunnable, 500L);
                        return;
                    }
                    AdPieLog.d("VideoAdView", "::: videoview : " + (VideoAdView.this.mVideoView == null ? "null" : "isPlaying - " + VideoAdView.this.mVideoView.isPlaying()));
                    return;
                }
                catch(Exception exception0) {
                }
                AdPieLog.e("VideoAdView", exception0);
            }
        };
        this.checkVideoPrepared = new Runnable() {
            @Override
            public void run() {
                if(!VideoAdView.this.mIsPrepared) {
                    VideoAdView.this.notifyError();
                    VideoAdView.this.stopVideo();
                }
            }
        };
        this.mContext = context0;
    }

    public VideoAdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.showCloseButton = new Runnable() {
            @Override
            public void run() {
                if(VideoAdView.this.mCircularProgressBar != null) {
                    VideoAdView.this.mCircularProgressBar.setVisibility(8);
                }
                if(VideoAdView.this.mTimerTextView != null) {
                    VideoAdView.this.mTimerTextView.setVisibility(8);
                }
                if(VideoAdView.this.mSkipButton != null) {
                    VideoAdView.this.mSkipButton.setVisibility(0);
                }
            }
        };
        this.updateTimeRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoAdView.this.mVideoView != null) {
                        float f = ((float)VideoAdView.this.mVideoView.getCurrentPosition()) / 1000.0f;
                        VideoAdView.this.mVideoCurPosSec = f;
                    }
                    if(VideoAdView.this.mSeekbar != null && VideoAdView.this.mVideoView != null) {
                        VideoAdView.this.mSeekbar.setProgress(VideoAdView.this.mVideoView.getCurrentPosition());
                    }
                    if(VideoAdView.this.mSkipOffsetSec > 0) {
                        if(((float)VideoAdView.this.mSkipOffsetSec) - VideoAdView.this.mVideoCurPosSec > 0.0f) {
                            if(VideoAdView.this.mCircularProgressBar != null) {
                                VideoAdView.this.mCircularProgressBar.setProgressWithAnimation(VideoAdView.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                                VideoAdView.this.mCircularProgressBar.setVisibility(0);
                            }
                            if(VideoAdView.this.mTimerTextView != null) {
                                VideoAdView.this.mTimerTextView.setText(VideoAdView.this.mSkipOffsetSec - ((int)VideoAdView.this.mVideoCurPosSec) + "");
                                VideoAdView.this.mTimerTextView.setVisibility(0);
                            }
                        }
                        else if(VideoAdView.this.mSkipButton != null && VideoAdView.this.mSkipButton.getVisibility() != 0) {
                            VideoAdView.this.post(VideoAdView.this.showCloseButton);
                        }
                    }
                    else if(VideoAdView.this.mSkipOffsetSec != 0) {
                        if(VideoAdView.this.mCircularProgressBar != null) {
                            VideoAdView.this.mCircularProgressBar.setProgressWithAnimation(VideoAdView.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                            VideoAdView.this.mCircularProgressBar.setVisibility(0);
                        }
                        if(VideoAdView.this.mTimerTextView != null) {
                            VideoAdView.this.mTimerTextView.setText(VideoAdView.this.mVideoDuration - ((int)VideoAdView.this.mVideoCurPosSec) + "");
                            VideoAdView.this.mTimerTextView.setVisibility(0);
                        }
                    }
                    else if(VideoAdView.this.mSkipButton != null && VideoAdView.this.mSkipButton.getVisibility() != 0) {
                        VideoAdView.this.post(VideoAdView.this.showCloseButton);
                    }
                }
                catch(Exception exception0) {
                    AdPieLog.e("VideoAdView", exception0);
                }
            }
        };
        this.videoPlayTrackerRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoAdView.this.mVideoView != null && VideoAdView.this.mVideoView.isPlaying()) {
                        int v = VideoAdView.this.mVideoView.getCurrentPosition();
                        AdPieLog.d("VideoAdView", "video current position  : " + v / 1000);
                        if(v / 1000 > 0) {
                            if(v / 1000 == VideoAdView.this.mFirstQuartile && !VideoAdView.this.isSentFirst) {
                                VideoAdView.this.isSentFirst = true;
                                ReportUtil.sendReport("VIDEO_FIRST_QUARTILE", VideoAdView.this.mVideoAdData.getTrackingFirstQuartileUrls());
                            }
                            else if(v / 1000 == VideoAdView.this.mSecondQuartile && !VideoAdView.this.isSentSecond) {
                                VideoAdView.this.isSentSecond = true;
                                ReportUtil.sendReport("VIDEO_MID_POINT", VideoAdView.this.mVideoAdData.getTrackingMidpointUrls());
                            }
                            else if(v / 1000 == VideoAdView.this.mThirdQuartile && !VideoAdView.this.isSentThird) {
                                VideoAdView.this.isSentThird = true;
                                ReportUtil.sendReport("VIDEO_THIRD_QUARTILE", VideoAdView.this.mVideoAdData.getTrackingThirdQuartileUrls());
                            }
                        }
                        VideoAdView.this.post(VideoAdView.this.updateTimeRunnable);
                        VideoAdView.this.postDelayed(VideoAdView.this.videoPlayTrackerRunnable, 500L);
                        return;
                    }
                    AdPieLog.d("VideoAdView", "::: videoview : " + (VideoAdView.this.mVideoView == null ? "null" : "isPlaying - " + VideoAdView.this.mVideoView.isPlaying()));
                    return;
                }
                catch(Exception exception0) {
                }
                AdPieLog.e("VideoAdView", exception0);
            }
        };
        this.checkVideoPrepared = new Runnable() {
            @Override
            public void run() {
                if(!VideoAdView.this.mIsPrepared) {
                    VideoAdView.this.notifyError();
                    VideoAdView.this.stopVideo();
                }
            }
        };
        this.mContext = context0;
    }

    @RequiresApi(api = 21)
    public VideoAdView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.showCloseButton = new Runnable() {
            @Override
            public void run() {
                if(VideoAdView.this.mCircularProgressBar != null) {
                    VideoAdView.this.mCircularProgressBar.setVisibility(8);
                }
                if(VideoAdView.this.mTimerTextView != null) {
                    VideoAdView.this.mTimerTextView.setVisibility(8);
                }
                if(VideoAdView.this.mSkipButton != null) {
                    VideoAdView.this.mSkipButton.setVisibility(0);
                }
            }
        };
        this.updateTimeRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoAdView.this.mVideoView != null) {
                        float f = ((float)VideoAdView.this.mVideoView.getCurrentPosition()) / 1000.0f;
                        VideoAdView.this.mVideoCurPosSec = f;
                    }
                    if(VideoAdView.this.mSeekbar != null && VideoAdView.this.mVideoView != null) {
                        VideoAdView.this.mSeekbar.setProgress(VideoAdView.this.mVideoView.getCurrentPosition());
                    }
                    if(VideoAdView.this.mSkipOffsetSec > 0) {
                        if(((float)VideoAdView.this.mSkipOffsetSec) - VideoAdView.this.mVideoCurPosSec > 0.0f) {
                            if(VideoAdView.this.mCircularProgressBar != null) {
                                VideoAdView.this.mCircularProgressBar.setProgressWithAnimation(VideoAdView.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                                VideoAdView.this.mCircularProgressBar.setVisibility(0);
                            }
                            if(VideoAdView.this.mTimerTextView != null) {
                                VideoAdView.this.mTimerTextView.setText(VideoAdView.this.mSkipOffsetSec - ((int)VideoAdView.this.mVideoCurPosSec) + "");
                                VideoAdView.this.mTimerTextView.setVisibility(0);
                            }
                        }
                        else if(VideoAdView.this.mSkipButton != null && VideoAdView.this.mSkipButton.getVisibility() != 0) {
                            VideoAdView.this.post(VideoAdView.this.showCloseButton);
                        }
                    }
                    else if(VideoAdView.this.mSkipOffsetSec != 0) {
                        if(VideoAdView.this.mCircularProgressBar != null) {
                            VideoAdView.this.mCircularProgressBar.setProgressWithAnimation(VideoAdView.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                            VideoAdView.this.mCircularProgressBar.setVisibility(0);
                        }
                        if(VideoAdView.this.mTimerTextView != null) {
                            VideoAdView.this.mTimerTextView.setText(VideoAdView.this.mVideoDuration - ((int)VideoAdView.this.mVideoCurPosSec) + "");
                            VideoAdView.this.mTimerTextView.setVisibility(0);
                        }
                    }
                    else if(VideoAdView.this.mSkipButton != null && VideoAdView.this.mSkipButton.getVisibility() != 0) {
                        VideoAdView.this.post(VideoAdView.this.showCloseButton);
                    }
                }
                catch(Exception exception0) {
                    AdPieLog.e("VideoAdView", exception0);
                }
            }
        };
        this.videoPlayTrackerRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoAdView.this.mVideoView != null && VideoAdView.this.mVideoView.isPlaying()) {
                        int v = VideoAdView.this.mVideoView.getCurrentPosition();
                        AdPieLog.d("VideoAdView", "video current position  : " + v / 1000);
                        if(v / 1000 > 0) {
                            if(v / 1000 == VideoAdView.this.mFirstQuartile && !VideoAdView.this.isSentFirst) {
                                VideoAdView.this.isSentFirst = true;
                                ReportUtil.sendReport("VIDEO_FIRST_QUARTILE", VideoAdView.this.mVideoAdData.getTrackingFirstQuartileUrls());
                            }
                            else if(v / 1000 == VideoAdView.this.mSecondQuartile && !VideoAdView.this.isSentSecond) {
                                VideoAdView.this.isSentSecond = true;
                                ReportUtil.sendReport("VIDEO_MID_POINT", VideoAdView.this.mVideoAdData.getTrackingMidpointUrls());
                            }
                            else if(v / 1000 == VideoAdView.this.mThirdQuartile && !VideoAdView.this.isSentThird) {
                                VideoAdView.this.isSentThird = true;
                                ReportUtil.sendReport("VIDEO_THIRD_QUARTILE", VideoAdView.this.mVideoAdData.getTrackingThirdQuartileUrls());
                            }
                        }
                        VideoAdView.this.post(VideoAdView.this.updateTimeRunnable);
                        VideoAdView.this.postDelayed(VideoAdView.this.videoPlayTrackerRunnable, 500L);
                        return;
                    }
                    AdPieLog.d("VideoAdView", "::: videoview : " + (VideoAdView.this.mVideoView == null ? "null" : "isPlaying - " + VideoAdView.this.mVideoView.isPlaying()));
                    return;
                }
                catch(Exception exception0) {
                }
                AdPieLog.e("VideoAdView", exception0);
            }
        };
        this.checkVideoPrepared = new Runnable() {
            @Override
            public void run() {
                if(!VideoAdView.this.mIsPrepared) {
                    VideoAdView.this.notifyError();
                    VideoAdView.this.stopVideo();
                }
            }
        };
        this.mContext = context0;
    }

    @RequiresApi(api = 16)
    private void addAdUnits() {
        try {
            this.setupContainer();
            this.setupVideoView();
            this.setupSeekBar();
            this.setupClickButton();
            this.setupSkipButton();
            this.setupCircleProgressBar();
            this.setupProgressBar();
        }
        catch(Exception exception0) {
            AdPieLog.e("VideoAdView", exception0);
        }
    }

    @Override  // android.view.View
    public static int generateViewId() {
        return View.generateViewId();
    }

    public boolean isPlaying() {
        return this.mVideoView == null ? false : this.mVideoView.isPlaying();
    }

    public boolean mute() {
        return this.setVolume(0);
    }

    private void notifyClick() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyAdClicked();
        }
    }

    private void notifyCompleted() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdCompleted();
        }
    }

    private void notifyError() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdError();
        }
    }

    private void notifyPaused() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdPaused();
        }
    }

    private void notifySkipped() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdSkipped();
        }
    }

    private void notifyStarted() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdStarted();
        }
    }

    private void notifyStopped() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdStopped();
        }
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer0) {
        AdPieLog.d("VideoAdView", "onCompletion - current position : " + this.mVideoCurPosSec + ", duration : " + this.mVideoDuration);
        NoSkipSeekBar videoAdView$NoSkipSeekBar0 = this.mSeekbar;
        if(videoAdView$NoSkipSeekBar0 != null) {
            videoAdView$NoSkipSeekBar0.setProgress(videoAdView$NoSkipSeekBar0.getMax());
        }
        this.notifyCompleted();
        if(!this.isSentComplete) {
            this.isSentComplete = true;
            ReportUtil.sendReport("VIDEO_COMPLETE", this.mVideoAdData.getTrackingCompleteUrls());
        }
        this.stopVideo();
    }

    @Override  // android.view.View
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        AdPieLog.d("VideoAdView", "onError - what : " + v + ", extra : " + v1);
        this.notifyError();
        this.stopVideo();
        return true;
    }

    @Override  // android.media.MediaPlayer$OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
        switch(v) {
            case 701: {
                AdPieLog.d("VideoAdView", "MediaPlayer Buffering Start");
                ProgressBar progressBar0 = this.mProgressBar;
                if(progressBar0 != null) {
                    progressBar0.setVisibility(0);
                    return false;
                }
                break;
            }
            case 702: {
                AdPieLog.d("VideoAdView", "MediaPlayer Buffering End");
                ProgressBar progressBar1 = this.mProgressBar;
                if(progressBar1 != null) {
                    progressBar1.setVisibility(8);
                    return false;
                }
                break;
            }
            default: {
                return false;
            }
        }
        return false;
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer0) {
        try {
            this.mIsPrepared = true;
            this.removeCallbacks(this.checkVideoPrepared);
            this.mMediaPlayer = mediaPlayer0;
            mediaPlayer0.setOnVideoSizeChangedListener(this);
            int v = mediaPlayer0.getDuration();
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            AdPieLog.d("VideoAdView", String.format("onPrepared - %d:%d", timeUnit0.toMinutes(((long)v)), ((long)(timeUnit0.toSeconds(((long)v)) - TimeUnit.MINUTES.toSeconds(timeUnit0.toMinutes(((long)v)))))));
            this.mVideoDuration = v / 1000;
            if(this.mSkipOffsetSec > v / 1000) {
                this.mSkipOffsetSec = v / 1000;
            }
            this.mFirstQuartile = v / 1000 / 4;
            this.mSecondQuartile = v / 1000 / 2;
            this.mThirdQuartile = v / 1000 * 3 / 4;
            ProgressBar progressBar0 = this.mProgressBar;
            if(progressBar0 != null) {
                progressBar0.setVisibility(8);
            }
            this.mVideoView.start();
            int v1 = this.mSkipOffsetSec;
            if(v1 > 0) {
                CircularProgressBar circularProgressBar0 = this.mCircularProgressBar;
                if(circularProgressBar0 != null) {
                    circularProgressBar0.setProgressMax(((float)v1));
                    this.mCircularProgressBar.setVisibility(0);
                }
                TextView textView0 = this.mTimerTextView;
                if(textView0 != null) {
                    textView0.setVisibility(0);
                }
                Button button0 = this.mSkipButton;
                if(button0 != null) {
                    button0.setVisibility(8);
                }
            }
            else if(v1 == 0) {
                CircularProgressBar circularProgressBar1 = this.mCircularProgressBar;
                if(circularProgressBar1 != null) {
                    circularProgressBar1.setVisibility(8);
                }
                TextView textView1 = this.mTimerTextView;
                if(textView1 != null) {
                    textView1.setVisibility(8);
                }
                Button button1 = this.mSkipButton;
                if(button1 != null) {
                    button1.setVisibility(0);
                }
            }
            else {
                CircularProgressBar circularProgressBar2 = this.mCircularProgressBar;
                if(circularProgressBar2 != null) {
                    circularProgressBar2.setProgressMax(((float)this.mVideoDuration));
                    this.mCircularProgressBar.setVisibility(0);
                }
                TextView textView2 = this.mTimerTextView;
                if(textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
            NoSkipSeekBar videoAdView$NoSkipSeekBar0 = this.mSeekbar;
            if(videoAdView$NoSkipSeekBar0 != null) {
                videoAdView$NoSkipSeekBar0.setMax(v);
            }
            this.removeCallbacks(this.videoPlayTrackerRunnable);
            this.post(this.videoPlayTrackerRunnable);
            this.notifyStarted();
            if(!this.isSentImpression) {
                this.isSentImpression = true;
                ReportUtil.sendReport("VIDEO_IMPRESSION", this.mVideoAdData.getTrackingImpUrls());
            }
            if(!this.isSentStart) {
                this.isSentStart = true;
                ReportUtil.sendReport("VIDEO_START", this.mVideoAdData.getTrackingStartUrls());
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("VideoAdView", exception0);
            this.notifyError();
            this.stopVideo();
        }
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
        AdPieLog.d("VideoAdView", "onVideoSizeChanged - video size : " + v + "x" + v1 + ", VideoAdView size : " + this.getWidth() + "x" + this.getHeight() + (this.mVideoView == null ? "" : ", VideoView size : " + this.mVideoView.getWidth() + "x" + this.mVideoView.getHeight()));
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(v != 0) {
            if(this.mVideoView != null) {
                this.notifyStopped();
            }
            this.stopVideo();
        }
        AdPieLog.d("VideoAdView", "onVisibilityChanged : " + (v == 0 ? "VISIBLE" : "INVISIBLE"));
    }

    @RequiresApi(api = 16)
    public void playVideo(AdEventListener adEventListener0, VideoAdData videoAdData0) {
        this.stopVideo();
        this.mVideoAdData = videoAdData0;
        int v = videoAdData0.getSkipOffset();
        this.mSkipOffsetSec = v;
        if(v > 0 && v < 3) {
            this.mSkipOffsetSec = 3;
        }
        this.mLink = this.mVideoAdData.getLink();
        this.mIsWebViewLanding = this.mVideoAdData.getWebviewLanding() == 1;
        this.mIsClickableVideo = !TextUtils.isEmpty(this.mLink);
        this.addAdUnits();
        ProgressBar progressBar0 = this.mProgressBar;
        if(progressBar0 != null) {
            progressBar0.setVisibility(0);
        }
        this.mAdEventListener = adEventListener0;
        this.mVideoView.setVisibility(8);
        this.mVideoView.setVisibility(0);
        this.mVideoView.setVideoURI(Uri.parse(this.mVideoAdData.getVideoContent()));
        this.mVideoView.requestFocus();
        this.mIsPrepared = false;
        this.postDelayed(this.checkVideoPrepared, 5000L);
    }

    private void removeAdUnits() {
        try {
            this.removeAllViews();
            VideoView videoView0 = this.mVideoView;
            if(videoView0 != null) {
                videoView0.stopPlayback();
            }
            ProgressBar progressBar0 = this.mProgressBar;
            if(progressBar0 != null) {
                progressBar0.setVisibility(8);
            }
        }
        catch(Exception unused_ex) {
        }
        finally {
            this.mVideoView = null;
            this.mSkipButton = null;
            this.mSeekbar = null;
            this.mAdButton = null;
            this.mCircularProgressBar = null;
            this.mProgressBar = null;
        }
    }

    public void setVideoAdData(VideoAdData videoAdData0) {
        this.mVideoAdData = videoAdData0;
    }

    private boolean setVolume(int v) {
        if(this.mMediaPlayer != null) {
            try {
                float f = (float)(1.0 - (100 - v <= 0 ? 0.0 : Math.log(100 - v)) / 4.60517);
                this.mMediaPlayer.setVolume(f, f);
                return true;
            }
            catch(Exception exception0) {
            }
            AdPieLog.e("VideoAdView", exception0);
        }
        return false;
    }

    private void setupCircleProgressBar() {
        if(this.mCircularProgressBar == null) {
            CircularProgressBar circularProgressBar0 = new CircularProgressBar(this.mContext, null);
            this.mCircularProgressBar = circularProgressBar0;
            circularProgressBar0.setProgressBarColor(Color.parseColor("#B344C8E5"));
            this.mCircularProgressBar.setBackgroundProgressBarColor(0xFF888888);
            this.mCircularProgressBar.setProgressBarWidth(5.0f);
            this.mCircularProgressBar.setBackgroundProgressBarWidth(3.0f);
            this.mCircularProgressBar.setRoundBorder(true);
            this.mCircularProgressBar.setStartAngle(0.0f);
            this.mCircularProgressBar.setProgressDirection(ProgressDirection.TO_RIGHT);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(DisplayUtil.dpToPx(this.mContext, 0x20), DisplayUtil.dpToPx(this.mContext, 0x20));
            relativeLayout$LayoutParams0.addRule(5, this.mVideoView.getId());
            relativeLayout$LayoutParams0.addRule(8, this.mVideoView.getId());
            int v = DisplayUtil.dpToPx(this.mContext, 10);
            relativeLayout$LayoutParams0.setMargins(v, v, v, v);
            this.mCircularProgressBar.setLayoutParams(relativeLayout$LayoutParams0);
            this.mCircularProgressBar.setVisibility(8);
            this.addView(this.mCircularProgressBar);
            TextView textView0 = new TextView(this.mContext);
            this.mTimerTextView = textView0;
            textView0.setLayoutParams(relativeLayout$LayoutParams0);
            this.mTimerTextView.setTextColor(Color.parseColor("#FFFFFF"));
            this.mTimerTextView.setTextSize(((float)DisplayUtil.dpToPx(this.mContext, 4)));
            this.mTimerTextView.setGravity(17);
            this.mTimerTextView.setVisibility(8);
            this.addView(this.mTimerTextView);
        }
    }

    @RequiresApi(api = 16)
    private void setupClickButton() {
        if(this.mIsClickableVideo && this.mAdButton == null) {
            Button button0 = new Button(this.mContext);
            this.mAdButton = button0;
            button0.setBackgroundColor(0x80000000);
            this.mAdButton.setTextColor(-1);
            this.mAdButton.setOnClickListener(new View.OnClickListener() {
                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(!ClickThroughUtil.isValidClick()) {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("VideoAdView", ":::clickEvent::: " + VideoAdView.this.mLink + " -> block");
                        }
                        return;
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("VideoAdView", ":::clickEvent::: " + VideoAdView.this.mLink + " -> isWebViewLanding : " + VideoAdView.this.mIsWebViewLanding);
                    }
                    if(VideoAdView.this.mIsWebViewLanding) {
                        HttpUtil.getFinalURL(VideoAdView.this.mLink, new Handler(Looper.getMainLooper()) {
                            @Override  // android.os.Handler
                            public void handleMessage(@NonNull Message message0) {
                                if(message0.what == 100) {
                                    try {
                                        if(ClickThroughUtil.goToWebView(VideoAdView.this.mContext, ((String)message0.obj))) {
                                            VideoAdView.this.notifyClick();
                                            if(VideoAdView.this.mVideoAdData != null) {
                                                ReportUtil.sendReport("VIDEO_CLICK", VideoAdView.this.mVideoAdData.getTrackingClkUrls());
                                                return;
                                            }
                                        }
                                        else if(ClickThroughUtil.goToBrowser(VideoAdView.this.mContext, ((String)message0.obj))) {
                                            VideoAdView.this.notifyClick();
                                            if(VideoAdView.this.mVideoAdData != null) {
                                                ReportUtil.sendReport("VIDEO_CLICK", VideoAdView.this.mVideoAdData.getTrackingClkUrls());
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    catch(Exception exception0) {
                                    }
                                    AdPieLog.e("VideoAdView", exception0);
                                }
                            }
                        });
                        return;
                    }
                    if(ClickThroughUtil.goToBrowser(VideoAdView.this.mContext, VideoAdView.this.mLink)) {
                        VideoAdView.this.notifyClick();
                        if(VideoAdView.this.mVideoAdData != null) {
                            ReportUtil.sendReport("VIDEO_CLICK", VideoAdView.this.mVideoAdData.getTrackingClkUrls());
                        }
                    }
                }
            });
            if(TextUtils.isEmpty(this.mVideoAdData.getLinkText())) {
                this.mAdButton.setText("자세히 보기");
            }
            else {
                this.mAdButton.setText(this.mVideoAdData.getLinkText());
            }
            this.mAdButton.setTextSize(2, 9.0f);
            this.mAdButton.setMinimumHeight(0);
            this.mAdButton.setMinimumWidth(0);
            this.mAdButton.setMaxEms(10);
            this.mAdButton.setMaxLines(1);
            this.mAdButton.setSingleLine();
            this.mAdButton.setWidth(DisplayUtil.dpToPx(this.mContext, 60));
            this.mAdButton.setHeight(DisplayUtil.dpToPx(this.mContext, 0x20));
            this.mAdButton.setAllCaps(false);
            this.mAdButton.setEllipsize(TextUtils.TruncateAt.END);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(7, this.mVideoView.getId());
            relativeLayout$LayoutParams0.addRule(8, this.mVideoView.getId());
            int v = DisplayUtil.dpToPx(this.mContext, 10);
            relativeLayout$LayoutParams0.setMargins(v, v, v, v);
            this.mAdButton.setLayoutParams(relativeLayout$LayoutParams0);
            this.mAdButton.setVisibility(0);
            this.addView(this.mAdButton, relativeLayout$LayoutParams0);
        }
    }

    private void setupContainer() {
        this.setBackgroundColor(Color.parseColor("#000000"));
    }

    private void setupProgressBar() {
        if(this.mProgressBar == null) {
            this.mProgressBar = new ProgressBar(this.mContext);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(15, this.mVideoView.getId());
            relativeLayout$LayoutParams0.addRule(14, this.mVideoView.getId());
            this.mProgressBar.setLayoutParams(relativeLayout$LayoutParams0);
            this.mProgressBar.setVisibility(8);
            this.addView(this.mProgressBar);
            try {
                this.mProgressBar.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF4081"), PorterDuff.Mode.SRC_IN);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @RequiresApi(api = 16)
    private void setupSeekBar() {
        if(this.mSeekbar == null) {
            this.mSeekbar = new NoSkipSeekBar(this, this.mContext);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, DisplayUtil.dpToPx(this.mContext, 4));
            relativeLayout$LayoutParams0.addRule(8, this.mVideoView.getId());
            this.mSeekbar.setLayoutParams(relativeLayout$LayoutParams0);
            ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(new float[]{6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f}, null, null));
            shapeDrawable0.setIntrinsicHeight(0);
            shapeDrawable0.setIntrinsicWidth(0);
            this.mSeekbar.setThumb(shapeDrawable0);
            this.addView(this.mSeekbar);
            try {
                Drawable drawable0 = this.mSeekbar.getProgressDrawable();
                int v = Color.parseColor("#FF4081");
                PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
                drawable0.setColorFilter(v, porterDuff$Mode0);
                this.mSeekbar.getThumb().setColorFilter(Color.parseColor("#FF4081"), porterDuff$Mode0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @RequiresApi(api = 16)
    private void setupSkipButton() {
        if(this.mSkipButton == null) {
            Button button0 = new Button(this.mContext);
            this.mSkipButton = button0;
            button0.setBackgroundColor(0x80000000);
            this.mSkipButton.setTextColor(-1);
            this.mSkipButton.setOnClickListener(new View.OnClickListener() {
                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    VideoAdView.this.notifySkipped();
                    VideoAdView.this.stopVideo();
                }
            });
            this.mSkipButton.setText("Skip");
            this.mSkipButton.setTextSize(2, 9.0f);
            this.mSkipButton.setMinimumHeight(0);
            this.mSkipButton.setMinimumWidth(0);
            this.mSkipButton.setMaxLines(1);
            this.mSkipButton.setSingleLine();
            this.mSkipButton.setWidth(DisplayUtil.dpToPx(this.mContext, 60));
            this.mSkipButton.setHeight(DisplayUtil.dpToPx(this.mContext, 0x20));
            this.mSkipButton.setAllCaps(false);
            this.mSkipButton.setEllipsize(TextUtils.TruncateAt.END);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(5, this.mVideoView.getId());
            relativeLayout$LayoutParams0.addRule(8, this.mVideoView.getId());
            int v = DisplayUtil.dpToPx(this.mContext, 10);
            relativeLayout$LayoutParams0.setMargins(v, v, v, v);
            this.mSkipButton.setLayoutParams(relativeLayout$LayoutParams0);
            this.mSkipButton.setVisibility(8);
            this.addView(this.mSkipButton, relativeLayout$LayoutParams0);
        }
    }

    private void setupVideoView() {
        if(this.mVideoView == null) {
            VideoView videoView0 = new VideoView(this.mContext);
            this.mVideoView = videoView0;
            videoView0.setId(VideoAdView.generateViewId());
            this.mVideoView.setZOrderMediaOverlay(true);
            this.mVideoView.setKeepScreenOn(true);
            this.mVideoView.setOnPreparedListener(this);
            this.mVideoView.setOnCompletionListener(this);
            this.mVideoView.setOnErrorListener(this);
            this.mVideoView.setOnInfoListener(this);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
            relativeLayout$LayoutParams0.addRule(13);
            this.addView(this.mVideoView, relativeLayout$LayoutParams0);
        }
    }

    private void stopVideo() {
        try {
            AdPieLog.d("VideoAdView", "stopVideo");
            this.removeCallbacks(this.checkVideoPrepared);
            this.removeCallbacks(this.videoPlayTrackerRunnable);
            this.removeCallbacks(this.updateTimeRunnable);
            this.removeAdUnits();
        }
        catch(Exception exception0) {
            AdPieLog.e("VideoAdView", exception0);
        }
    }

    public boolean unmute() {
        return this.setVolume(100);
    }
}

