package com.gomfactory.adpie.sdk.videoads;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper.ImageLoadEventListener;
import com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper;
import com.gomfactory.adpie.sdk.nativeads.util.VideoThumbnail;
import com.gomfactory.adpie.sdk.ui.InterstitialBaseActivity;
import com.gomfactory.adpie.sdk.ui.progressbar.CircularProgressBar.ProgressDirection;
import com.gomfactory.adpie.sdk.ui.progressbar.CircularProgressBar;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.ClickThroughUtil;
import com.gomfactory.adpie.sdk.util.DisplayUtil;
import com.gomfactory.adpie.sdk.util.HttpUtil;
import com.gomfactory.adpie.sdk.util.ReportUtil;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class VideoFullScreenActivity extends InterstitialBaseActivity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
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

    public static final String TAG = "VideoFullScreenActivity";
    private Runnable checkVideoPrepared;
    private boolean isSentComplete;
    private boolean isSentFirst;
    private boolean isSentImpression;
    private boolean isSentSecond;
    private boolean isSentStart;
    private boolean isSentThird;
    private boolean isUserNotification;
    private Button mAdButton;
    private CircularProgressBar mCircularProgressBar;
    private ImageView mCloseButton;
    private RelativeLayout mContainer;
    private int mFirstQuartile;
    private Handler mHandler;
    private boolean mIsClickableVideo;
    private boolean mIsPrepared;
    private boolean mIsVolumeOn;
    private boolean mIsWebViewLanding;
    private String mLink;
    private MediaPlayer mMediaPlayer;
    private ImageView mOptOutImageView;
    private ProgressBar mProgressBar;
    private int mSecondQuartile;
    private NoSkipSeekBar mSeekbar;
    private int mSkipOffsetSec;
    private int mStopPosition;
    private int mThirdQuartile;
    private TextView mTimerTextView;
    private VideoAdData mVideoAdData;
    private float mVideoCurPosSec;
    private int mVideoDuration;
    private VideoView mVideoView;
    private ImageView mVolumeImage;
    private Bitmap mVolumeOffBitmap;
    private Bitmap mVolumeOnBitmap;
    private static final AtomicInteger sNextGeneratedId;
    private Runnable showCloseButton;
    private Runnable updateTimeRunnable;
    private Runnable videoPlayTrackerRunnable;

    static {
        VideoFullScreenActivity.sNextGeneratedId = new AtomicInteger(1);
    }

    public VideoFullScreenActivity() {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.checkVideoPrepared = new Runnable() {
            @Override
            public void run() {
                if(!VideoFullScreenActivity.this.mIsPrepared) {
                    VideoFullScreenActivity.this.isUserNotification = true;
                    VideoFullScreenActivity.this.notifyVideoError();
                    VideoFullScreenActivity.this.finish();
                }
            }
        };
        this.showCloseButton = new Runnable() {
            @Override
            public void run() {
                if(VideoFullScreenActivity.this.mCircularProgressBar != null) {
                    VideoFullScreenActivity.this.mCircularProgressBar.setVisibility(8);
                }
                if(VideoFullScreenActivity.this.mTimerTextView != null) {
                    VideoFullScreenActivity.this.mTimerTextView.setVisibility(8);
                }
                if(VideoFullScreenActivity.this.mCloseButton != null) {
                    VideoFullScreenActivity.this.mCloseButton.setVisibility(0);
                }
            }
        };
        this.updateTimeRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoFullScreenActivity.this.mVideoView != null) {
                        float f = ((float)VideoFullScreenActivity.this.mVideoView.getCurrentPosition()) / 1000.0f;
                        VideoFullScreenActivity.this.mVideoCurPosSec = f;
                    }
                    if(VideoFullScreenActivity.this.mSeekbar != null) {
                        VideoFullScreenActivity.this.mSeekbar.setProgress(VideoFullScreenActivity.this.mVideoView.getCurrentPosition());
                    }
                    if(VideoFullScreenActivity.this.isSentComplete) {
                        if(VideoFullScreenActivity.this.mCircularProgressBar != null) {
                            VideoFullScreenActivity.this.mCircularProgressBar.setVisibility(8);
                        }
                        if(VideoFullScreenActivity.this.mTimerTextView != null) {
                            VideoFullScreenActivity.this.mTimerTextView.setVisibility(8);
                        }
                        if(VideoFullScreenActivity.this.mCloseButton != null && VideoFullScreenActivity.this.mCloseButton.getVisibility() != 0 && VideoFullScreenActivity.this.mHandler != null) {
                            VideoFullScreenActivity.this.mHandler.post(VideoFullScreenActivity.this.showCloseButton);
                        }
                        return;
                    }
                    if(VideoFullScreenActivity.this.mSkipOffsetSec > 0) {
                        if(((float)VideoFullScreenActivity.this.mSkipOffsetSec) - VideoFullScreenActivity.this.mVideoCurPosSec <= 0.0f) {
                            if(VideoFullScreenActivity.this.mCircularProgressBar != null) {
                                VideoFullScreenActivity.this.mCircularProgressBar.setVisibility(8);
                            }
                            if(VideoFullScreenActivity.this.mTimerTextView != null) {
                                VideoFullScreenActivity.this.mTimerTextView.setVisibility(8);
                            }
                            if(VideoFullScreenActivity.this.mCloseButton != null && VideoFullScreenActivity.this.mCloseButton.getVisibility() != 0 && VideoFullScreenActivity.this.mHandler != null) {
                                VideoFullScreenActivity.this.mHandler.post(VideoFullScreenActivity.this.showCloseButton);
                            }
                        }
                        else {
                            if(VideoFullScreenActivity.this.mCircularProgressBar != null) {
                                VideoFullScreenActivity.this.mCircularProgressBar.setProgressMax(((float)VideoFullScreenActivity.this.mSkipOffsetSec));
                                VideoFullScreenActivity.this.mCircularProgressBar.setProgressWithAnimation(VideoFullScreenActivity.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                                VideoFullScreenActivity.this.mCircularProgressBar.setVisibility(0);
                            }
                            if(VideoFullScreenActivity.this.mTimerTextView != null) {
                                VideoFullScreenActivity.this.mTimerTextView.setText(VideoFullScreenActivity.this.mSkipOffsetSec - ((int)VideoFullScreenActivity.this.mVideoCurPosSec) + "");
                                VideoFullScreenActivity.this.mTimerTextView.setVisibility(0);
                            }
                            if(VideoFullScreenActivity.this.mCloseButton != null) {
                                VideoFullScreenActivity.this.mCloseButton.setVisibility(8);
                            }
                        }
                    }
                    else if(VideoFullScreenActivity.this.mSkipOffsetSec != 0) {
                        if(VideoFullScreenActivity.this.mCircularProgressBar != null) {
                            VideoFullScreenActivity.this.mCircularProgressBar.setProgressMax(((float)VideoFullScreenActivity.this.mVideoDuration));
                            VideoFullScreenActivity.this.mCircularProgressBar.setProgressWithAnimation(VideoFullScreenActivity.this.mVideoCurPosSec + 0.5f, 500L, null, 0L);
                            VideoFullScreenActivity.this.mCircularProgressBar.setVisibility(0);
                        }
                        if(VideoFullScreenActivity.this.mTimerTextView != null) {
                            VideoFullScreenActivity.this.mTimerTextView.setText(VideoFullScreenActivity.this.mVideoDuration - ((int)VideoFullScreenActivity.this.mVideoCurPosSec) + "");
                            VideoFullScreenActivity.this.mTimerTextView.setVisibility(0);
                        }
                    }
                    else if(VideoFullScreenActivity.this.mCloseButton != null && VideoFullScreenActivity.this.mCloseButton.getVisibility() != 0 && VideoFullScreenActivity.this.mHandler != null) {
                        VideoFullScreenActivity.this.mHandler.post(VideoFullScreenActivity.this.showCloseButton);
                    }
                }
                catch(Exception exception0) {
                    AdPieLog.e("VideoFullScreenActivity", exception0);
                }
            }
        };
        this.videoPlayTrackerRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(VideoFullScreenActivity.this.mVideoView != null) {
                        AdPieLog.d("VideoFullScreenActivity", "videoPlayTrackerRunnable : " + VideoFullScreenActivity.this.mVideoView.getCurrentPosition() + ", isPlaying : " + VideoFullScreenActivity.this.mVideoView.isPlaying());
                    }
                    if(VideoFullScreenActivity.this.mVideoView == null || !VideoFullScreenActivity.this.mVideoView.isPlaying()) {
                        AdPieLog.d("VideoFullScreenActivity", "::: videoview : " + (VideoFullScreenActivity.this.mVideoView == null ? "null" : "isPlaying - " + VideoFullScreenActivity.this.mVideoView.isPlaying()));
                        return;
                    }
                    int v = VideoFullScreenActivity.this.mVideoView.getCurrentPosition();
                    AdPieLog.d("VideoFullScreenActivity", "video current position  : " + v / 1000);
                    if(v / 1000 > 0) {
                        if(v / 1000 == VideoFullScreenActivity.this.mFirstQuartile && !VideoFullScreenActivity.this.isSentFirst) {
                            VideoFullScreenActivity.this.isSentFirst = true;
                            ReportUtil.sendReport("VIDEO_FIRST_QUARTILE", VideoFullScreenActivity.this.mVideoAdData.getTrackingFirstQuartileUrls());
                        }
                        else if(v / 1000 == VideoFullScreenActivity.this.mSecondQuartile && !VideoFullScreenActivity.this.isSentSecond) {
                            VideoFullScreenActivity.this.isSentSecond = true;
                            ReportUtil.sendReport("VIDEO_MID_POINT", VideoFullScreenActivity.this.mVideoAdData.getTrackingMidpointUrls());
                        }
                        else if(v / 1000 == VideoFullScreenActivity.this.mThirdQuartile && !VideoFullScreenActivity.this.isSentThird) {
                            VideoFullScreenActivity.this.isSentThird = true;
                            ReportUtil.sendReport("VIDEO_THIRD_QUARTILE", VideoFullScreenActivity.this.mVideoAdData.getTrackingThirdQuartileUrls());
                        }
                    }
                    if(VideoFullScreenActivity.this.mHandler != null) {
                        VideoFullScreenActivity.this.mHandler.post(VideoFullScreenActivity.this.updateTimeRunnable);
                        VideoFullScreenActivity.this.mHandler.postDelayed(VideoFullScreenActivity.this.videoPlayTrackerRunnable, 500L);
                    }
                }
                catch(Exception exception0) {
                    AdPieLog.e("VideoFullScreenActivity", exception0);
                }
            }
        };
    }

    // 检测为 Lambda 实现
    private void clickLink() [...]

    private int generateViewId() {
        return View.generateViewId();
    }

    public boolean mute() {
        return this.setVolume(0);
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer0) {
        AdPieLog.d("VideoFullScreenActivity", "onCompletion - video current position : " + this.mVideoCurPosSec + ", duration : " + this.mVideoDuration);
        NoSkipSeekBar videoFullScreenActivity$NoSkipSeekBar0 = this.mSeekbar;
        if(videoFullScreenActivity$NoSkipSeekBar0 != null) {
            videoFullScreenActivity$NoSkipSeekBar0.setProgress(videoFullScreenActivity$NoSkipSeekBar0.getMax());
        }
        CircularProgressBar circularProgressBar0 = this.mCircularProgressBar;
        if(circularProgressBar0 != null) {
            circularProgressBar0.setVisibility(8);
        }
        TextView textView0 = this.mTimerTextView;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
        if(this.mCloseButton != null && this.mCloseButton.getVisibility() != 0) {
            Handler handler0 = this.mHandler;
            if(handler0 != null) {
                handler0.post(this.showCloseButton);
            }
        }
        Handler handler1 = this.mHandler;
        if(handler1 != null) {
            handler1.removeCallbacks(this.videoPlayTrackerRunnable);
        }
        VideoView videoView0 = this.mVideoView;
        if(videoView0 != null) {
            videoView0.stopPlayback();
        }
        this.isUserNotification = true;
        this.notifyVideoCompleted();
        if(!this.isSentComplete) {
            this.isSentComplete = true;
            ReportUtil.sendReport("VIDEO_COMPLETE", this.mVideoAdData.getTrackingCompleteUrls());
            String s = this.mVideoAdData.getSsvUrl();
            if(!TextUtils.isEmpty(s)) {
                if(!TextUtils.isEmpty(this.mSsvUserId)) {
                    s = s.replaceFirst("\\{\\{userid\\}\\}", this.mSsvUserId);
                }
                if(!TextUtils.isEmpty(this.mSsvCustomData)) {
                    s = s.replaceFirst("\\{\\{customdata\\}\\}", this.mSsvCustomData);
                }
                ReportUtil.sendReport("SSV_CALLBACK", s);
            }
        }
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
    }

    @Override  // com.gomfactory.adpie.sdk.ui.InterstitialBaseActivity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        try {
            this.mVideoAdData = (VideoAdData)this.mAdData;
            if(((VideoAdData)this.mAdData).getOrientation() == 1) {
                this.setRequestedOrientation(1);
            }
            else if(this.mVideoAdData.getOrientation() == 2) {
                this.setRequestedOrientation(6);
            }
            int v = this.mVideoAdData.getSkipOffset();
            this.mSkipOffsetSec = v;
            if(v > 0 && v < 3) {
                this.mSkipOffsetSec = 3;
            }
            this.mLink = this.mVideoAdData.getLink();
            this.mIsWebViewLanding = this.mVideoAdData.getWebviewLanding() == 1;
            this.mIsClickableVideo = !TextUtils.isEmpty(this.mLink);
            this.setupContainer();
            this.setupVideoView();
            this.setupSeekBar();
            this.setupClickButton();
            this.setupCloseButton();
            this.setupCircleProgressBar();
            this.setupVolumeButton();
            this.setupProgressBar();
            this.setupOptOut();
            ProgressBar progressBar0 = this.mProgressBar;
            if(progressBar0 != null) {
                progressBar0.setVisibility(0);
            }
            this.mVideoView.setVideoURI(Uri.parse(this.mVideoAdData.getVideoContent()));
            Handler handler0 = this.mHandler;
            if(handler0 != null) {
                handler0.postDelayed(this.checkVideoPrepared, 5000L);
            }
            this.mVideoView.requestFocus();
            this.notifyShown();
            if(!this.isSentImpression) {
                this.isSentImpression = true;
                ReportUtil.sendReport("VIDEO_IMPRESSION", this.mVideoAdData.getTrackingImpUrls());
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("VideoFullScreenActivity", exception0);
            this.isUserNotification = true;
            this.notifyVideoError();
            this.finish();
        }
    }

    @Override  // com.gomfactory.adpie.sdk.ui.InterstitialBaseActivity
    protected void onDestroy() {
        try {
            ProgressBar progressBar0 = this.mProgressBar;
            if(progressBar0 != null) {
                progressBar0.setVisibility(8);
                this.mProgressBar = null;
            }
            Handler handler0 = this.mHandler;
            if(handler0 != null) {
                handler0.removeCallbacks(this.checkVideoPrepared);
                this.mHandler.removeCallbacks(this.videoPlayTrackerRunnable);
                this.mHandler.removeCallbacks(this.updateTimeRunnable);
            }
            VideoView videoView0 = this.mVideoView;
            if(videoView0 != null) {
                videoView0.stopPlayback();
                this.mVideoView = null;
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("VideoFullScreenActivity", exception0);
        }
        super.onDestroy();
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        AdPieLog.d("VideoFullScreenActivity", "onError - what : " + v + ", extra : " + v1);
        this.isUserNotification = true;
        this.notifyVideoError();
        this.finish();
        return true;
    }

    @Override  // android.media.MediaPlayer$OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
        switch(v) {
            case 701: {
                AdPieLog.d("VideoFullScreenActivity", "MediaPlayer Buffering Start");
                ProgressBar progressBar0 = this.mProgressBar;
                if(progressBar0 != null) {
                    progressBar0.setVisibility(0);
                    return false;
                }
                break;
            }
            case 702: {
                AdPieLog.d("VideoFullScreenActivity", "MediaPlayer Buffering End");
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

    @Override  // android.app.Activity
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        if(v == 4) {
            if(this.mVideoAdData.getBackButtonEnabled() == 0) {
                return true;
            }
            ImageView imageView0 = this.mCloseButton;
            if(imageView0 == null) {
                this.isUserNotification = true;
                if(!this.isSentComplete) {
                    this.notifyVideoSkipped();
                }
                this.finish();
            }
            else if(imageView0.getVisibility() == 0) {
                this.isUserNotification = true;
                if(!this.isSentComplete) {
                    this.notifyVideoSkipped();
                }
                this.finish();
                return super.onKeyDown(4, keyEvent0);
            }
        }
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // com.gomfactory.adpie.sdk.ui.InterstitialBaseActivity
    protected void onPause() {
        if(!this.isFinishing()) {
            VideoView videoView0 = this.mVideoView;
            if(videoView0 != null) {
                try {
                    this.mStopPosition = videoView0.getCurrentPosition();
                    this.mVideoView.pause();
                }
                catch(Exception unused_ex) {
                }
                this.notifyVideoPaused();
            }
        }
        else if(!this.isUserNotification && (this.mVideoView != null && this.mVideoView.isPlaying())) {
            this.notifyVideoStopped();
        }
        super.onPause();
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer0) {
        try {
            AdPieLog.d("VideoFullScreenActivity", "onPrepared - position : " + this.mVideoView.getCurrentPosition() + ", stopPosition : " + this.mStopPosition);
            this.mIsPrepared = true;
            Handler handler0 = this.mHandler;
            if(handler0 != null) {
                handler0.removeCallbacks(this.checkVideoPrepared);
            }
            this.mMediaPlayer = mediaPlayer0;
            int v = mediaPlayer0.getDuration();
            NoSkipSeekBar videoFullScreenActivity$NoSkipSeekBar0 = this.mSeekbar;
            if(videoFullScreenActivity$NoSkipSeekBar0 != null) {
                videoFullScreenActivity$NoSkipSeekBar0.setMax(v);
            }
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            AdPieLog.d("VideoFullScreenActivity", String.format("onPrepared - %d:%d", timeUnit0.toMinutes(((long)v)), ((long)(timeUnit0.toSeconds(((long)v)) - TimeUnit.MINUTES.toSeconds(timeUnit0.toMinutes(((long)v)))))));
            this.mVideoDuration = v / 1000;
            if(this.mSkipOffsetSec > v / 1000) {
                this.mSkipOffsetSec = v / 1000;
            }
            this.mFirstQuartile = v / 1000 / 4;
            this.mSecondQuartile = v / 1000 / 2;
            this.mThirdQuartile = v / 1000 * 3 / 4;
            mediaPlayer0.setOnVideoSizeChangedListener(this);
            mediaPlayer0.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
                @Override  // android.media.MediaPlayer$OnSeekCompleteListener
                public void onSeekComplete(MediaPlayer mediaPlayer0) {
                    AdPieLog.d("VideoFullScreenActivity", "onSeekComplete");
                    mediaPlayer0.start();
                    if(VideoFullScreenActivity.this.mProgressBar != null) {
                        VideoFullScreenActivity.this.mProgressBar.setVisibility(8);
                    }
                    if(VideoFullScreenActivity.this.mVolumeImage != null) {
                        VideoFullScreenActivity.this.mVolumeImage.setVisibility(0);
                    }
                    if(!VideoFullScreenActivity.this.mIsVolumeOn) {
                        VideoFullScreenActivity.this.mute();
                    }
                    if(VideoFullScreenActivity.this.mHandler != null) {
                        VideoFullScreenActivity.this.mHandler.removeCallbacks(VideoFullScreenActivity.this.videoPlayTrackerRunnable);
                        VideoFullScreenActivity.this.mHandler.post(VideoFullScreenActivity.this.videoPlayTrackerRunnable);
                    }
                    if(!VideoFullScreenActivity.this.isSentStart) {
                        VideoFullScreenActivity.this.isSentStart = true;
                        VideoFullScreenActivity.this.notifyVideoStarted();
                        ReportUtil.sendReport("VIDEO_START", VideoFullScreenActivity.this.mVideoAdData.getTrackingStartUrls());
                    }
                }
            });
            if(this.isSentComplete) {
                new VideoThumbnail(this.mVideoView, this.mVideoAdData.getVideoContent(), ((long)v)).execute();
                return;
            }
            if(Build.VERSION.SDK_INT >= 26) {
                this.mMediaPlayer.seekTo(((long)this.mStopPosition), 3);
                return;
            }
            this.mMediaPlayer.seekTo(this.mStopPosition);
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("VideoFullScreenActivity", exception0);
        this.isUserNotification = true;
        this.notifyVideoError();
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        VideoView videoView0 = this.mVideoView;
        if(videoView0 != null) {
            videoView0.resume();
        }
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
        AdPieLog.d("VideoFullScreenActivity", "onVideoSizeChanged - video size : " + v + "x" + v1 + ", Container size : " + this.mContainer.getWidth() + "x" + this.mContainer.getHeight() + (this.mVideoView == null ? "" : ", VideoView size : " + this.mVideoView.getWidth() + "x" + this.mVideoView.getHeight()));
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
            AdPieLog.e("VideoFullScreenActivity", exception0);
        }
        return false;
    }

    public void setVolumeImage() {
        try {
            if(this.mVolumeOffBitmap == null) {
                byte[] arr_b = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAQAAAD9CzEMAAAB20lEQVR4Ae3WPYtTQRSH8dFdJIKijW8pfEHMBhsLsbOIgtoLFvkISW8rq34DOwM2IvgNtLwq64paRCyMgp3sptHGTlnziEw4HIazN39IOvOcKpO599fMwE3LFt0ymlS0SML0OKPsS/hp8gXYkgiATbqsoANUALXEugNyI67rQIvtWuIueMAa0NAAT2xTEvfAARV/HPGOoxqQWIsJ7pNLNmcZsGPEJ47EgEY0eO8Bm4uMjHhLQwFKYm26dnhKlHsP8MyIhwJgxDgmgr37eG7ENWJAJ8K9B/lsh3ZFBRLtiLB/39B2ey/ZmerqQEjYwE867vcjcq/rgLrGBcE/wq2dY0LutAAIRG7Trbwk168BdMLuxQ1buU3uiQ5ERLu4F4/t6cvkhgqgE1/t6WPkviuATvxyFy73WwB0wh3LVXI7CqAT++3pE+R+zAdslYTNFXIf5gNauxJ3hGMqlHYlhuR68wIxsTq9FxNORkA86xFgRHwvXpB0ICLSDOKmDsREqiUOsUcHYiLNIJIOxERSCR0wIgCu8g1iQgeMKIDzPMWKCB0wwgEb+CYRoQNGOMC//AEXGIeEDhhRAh/pFF8glQAIA/CKW+wtPnJGHF8M0OdU8B1V2esNWPwsgf8N+AunGBPD8qjlUgAAAABJRU5ErkJggg==", 0);
                this.mVolumeOffBitmap = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            }
            if(this.mVolumeOnBitmap == null) {
                byte[] arr_b1 = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAQAAAD9CzEMAAABjklEQVR4Ae2XQSuEQRjHN2qtoj0QDgqx7d6lqFVI6+6EswvOnPdDyGFLLfEVuKjN2nbLRZJ2w0dQtDfi/blMT9O0YfJMLu8zp/n/n31+787Ozjxv4v8ijjjYYoLEz8Oe+A2AOut06wKKCMBEk4IeoAg2QKJESgNQBAtQ4RMJrhn6E0DKYymTlPiwlqojwrc8jj5N0/oWvf4AtzyuRx9n4pX8AW55OvhJzsUtuK5veTrm9NMybsv9X/iWR5wGOStvRvbUhgvwK4940GbByj00fv07wG/Czm2TlXmGyGSMawHc57002o4mAFZE2TXKqS7gWJS8UW50AU+iDBvlWRfwJkrSKO/BAaGWaCTMEpVFmQ/zIy+LsmeUE03AlfXpqtG29QCvZGSelYwxrcPuhbyVWzZ+Teu4rjJl5c3KUbcW4sJJ82Dce7r0r8weLsRd0r/001b5A/22ZY5HcRqkdBuvHEdWd3fHoG7rWCMCiToD4ZrfiH2S4dr3WxZDvYBEVFiVfa8O2GQ06CuUjBgQA74AFyzYmAiHa/QAAAAASUVORK5CYII=", 0);
                this.mVolumeOnBitmap = BitmapFactory.decodeByteArray(arr_b1, 0, arr_b1.length);
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("VideoFullScreenActivity", exception0);
        }
    }

    private void setupCircleProgressBar() {
        CircularProgressBar circularProgressBar0 = new CircularProgressBar(this, null);
        this.mCircularProgressBar = circularProgressBar0;
        circularProgressBar0.setProgressBarColor(Color.parseColor("#B344C8E5"));
        this.mCircularProgressBar.setBackgroundProgressBarColor(0xFF888888);
        this.mCircularProgressBar.setProgressBarWidth(5.0f);
        this.mCircularProgressBar.setBackgroundProgressBarWidth(3.0f);
        this.mCircularProgressBar.setRoundBorder(true);
        this.mCircularProgressBar.setStartAngle(0.0f);
        this.mCircularProgressBar.setProgressDirection(ProgressDirection.TO_RIGHT);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(DisplayUtil.dpToPx(this, 0x20), DisplayUtil.dpToPx(this, 0x20));
        relativeLayout$LayoutParams0.addRule(11);
        int v = DisplayUtil.dpToPx(this, 13);
        relativeLayout$LayoutParams0.setMargins(v, v, v, v);
        this.mCircularProgressBar.setLayoutParams(relativeLayout$LayoutParams0);
        this.mCircularProgressBar.setVisibility(8);
        this.mContainer.addView(this.mCircularProgressBar);
        TextView textView0 = new TextView(this);
        this.mTimerTextView = textView0;
        textView0.setLayoutParams(relativeLayout$LayoutParams0);
        this.mTimerTextView.setTextColor(Color.parseColor("#FFFFFF"));
        this.mTimerTextView.setTextSize(((float)DisplayUtil.dpToPx(this, 4)));
        this.mTimerTextView.setGravity(17);
        this.mTimerTextView.setVisibility(8);
        this.mContainer.addView(this.mTimerTextView);
    }

    private void setupClickButton() {
        if(this.mIsClickableVideo) {
            Button button0 = new Button(this);
            this.mAdButton = button0;
            button0.setBackgroundColor(0x80000000);
            this.mAdButton.setTextColor(-1);
            this.mAdButton.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                if(!ClickThroughUtil.isValidClick()) {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("VideoFullScreenActivity", ":::clickEvent::: " + VideoFullScreenActivity.this.mLink + " -> block");
                    }
                    return;
                }
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("VideoFullScreenActivity", ":::clickEvent::: " + VideoFullScreenActivity.this.mLink + " -> isWebViewLanding : " + VideoFullScreenActivity.this.mIsWebViewLanding);
                }
                if(VideoFullScreenActivity.this.mIsWebViewLanding) {
                    HttpUtil.getFinalURL(VideoFullScreenActivity.this.mLink, new Handler(Looper.getMainLooper()) {
                        @Override  // android.os.Handler
                        public void handleMessage(@NonNull Message message0) {
                            if(message0.what == 100) {
                                try {
                                    if(ClickThroughUtil.goToWebView(VideoFullScreenActivity.this, ((String)message0.obj))) {
                                        VideoFullScreenActivity.this.notifyClick();
                                        if(VideoFullScreenActivity.this.mVideoAdData != null) {
                                            ReportUtil.sendReport("VIDEO_CLICK", VideoFullScreenActivity.this.mVideoAdData.getTrackingClkUrls());
                                            return;
                                        }
                                    }
                                    else if(ClickThroughUtil.goToBrowser(VideoFullScreenActivity.this, ((String)message0.obj))) {
                                        VideoFullScreenActivity.this.notifyClick();
                                        if(VideoFullScreenActivity.this.mVideoAdData != null) {
                                            ReportUtil.sendReport("VIDEO_CLICK", VideoFullScreenActivity.this.mVideoAdData.getTrackingClkUrls());
                                            return;
                                        }
                                    }
                                    return;
                                }
                                catch(Exception exception0) {
                                }
                                AdPieLog.e("VideoFullScreenActivity", exception0);
                            }
                        }
                    });
                    return;
                }
                if(ClickThroughUtil.goToBrowser(VideoFullScreenActivity.this, VideoFullScreenActivity.this.mLink)) {
                    VideoFullScreenActivity.this.notifyClick();
                    VideoAdData videoAdData0 = VideoFullScreenActivity.this.mVideoAdData;
                    if(videoAdData0 != null) {
                        ReportUtil.sendReport("VIDEO_CLICK", videoAdData0.getTrackingClkUrls());
                    }
                }
            });
            if(TextUtils.isEmpty(this.mVideoAdData.getLinkText())) {
                this.mAdButton.setText("자세히 보기");
            }
            else {
                this.mAdButton.setText(this.mVideoAdData.getLinkText());
            }
            this.mAdButton.setTextSize(2, 12.0f);
            this.mAdButton.setMinimumHeight(0);
            this.mAdButton.setMinimumWidth(0);
            this.mAdButton.setMaxEms(10);
            this.mAdButton.setMaxLines(1);
            this.mAdButton.setSingleLine();
            this.mAdButton.setHeight(DisplayUtil.dpToPx(this, 0x20));
            this.mAdButton.setAllCaps(false);
            this.mAdButton.setEllipsize(TextUtils.TruncateAt.END);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(8, this.mSeekbar.getId());
            relativeLayout$LayoutParams0.addRule(7, this.mSeekbar.getId());
            int v = DisplayUtil.dpToPx(this, 10);
            relativeLayout$LayoutParams0.setMargins(0, 0, DisplayUtil.dpToPx(this, 20), v);
            this.mAdButton.setLayoutParams(relativeLayout$LayoutParams0);
            this.mAdButton.setPadding(v, 0, v, 0);
            this.mAdButton.setVisibility(8);
            this.mContainer.addView(this.mAdButton, relativeLayout$LayoutParams0);
        }

        class com.gomfactory.adpie.sdk.videoads.VideoFullScreenActivity.6 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                VideoFullScreenActivity.this.clickLink();
            }
        }

    }

    private void setupCloseButton() {
        this.mCloseButton = new ImageView(this);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(DisplayUtil.dpToPx(this, 0x20), DisplayUtil.dpToPx(this, 0x20));
        relativeLayout$LayoutParams0.addRule(10);
        relativeLayout$LayoutParams0.addRule(11);
        int v = DisplayUtil.dpToPx(this, 13);
        relativeLayout$LayoutParams0.setMargins(v, v, v, v);
        this.mCloseButton.setLayoutParams(relativeLayout$LayoutParams0);
        try {
            byte[] arr_b = Base64.decode("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", 0);
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            this.mCloseButton.setImageBitmap(bitmap0);
        }
        catch(Exception exception0) {
            AdPieLog.e("VideoFullScreenActivity", exception0);
        }
        this.mCloseButton.setOnTouchListener(new View.OnTouchListener() {
            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                VideoFullScreenActivity.this.isUserNotification = true;
                if(!VideoFullScreenActivity.this.isSentComplete) {
                    VideoFullScreenActivity.this.notifyVideoSkipped();
                }
                VideoFullScreenActivity.this.finish();
                return true;
            }
        });
        this.mCloseButton.setVisibility(8);
        this.mContainer.addView(this.mCloseButton);
    }

    private void setupContainer() {
        RelativeLayout relativeLayout0 = new RelativeLayout(this);
        this.mContainer = relativeLayout0;
        relativeLayout0.setBackgroundColor(Color.parseColor("#000000"));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
        this.setContentView(this.mContainer, relativeLayout$LayoutParams0);
        if(this.mIsClickableVideo) {
            this.mContainer.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                if(!ClickThroughUtil.isValidClick()) {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("VideoFullScreenActivity", ":::clickEvent::: " + VideoFullScreenActivity.this.mLink + " -> block");
                    }
                    return;
                }
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("VideoFullScreenActivity", ":::clickEvent::: " + VideoFullScreenActivity.this.mLink + " -> isWebViewLanding : " + VideoFullScreenActivity.this.mIsWebViewLanding);
                }
                if(VideoFullScreenActivity.this.mIsWebViewLanding) {
                    HttpUtil.getFinalURL(VideoFullScreenActivity.this.mLink, new Handler(Looper.getMainLooper()) {
                        @Override  // android.os.Handler
                        public void handleMessage(@NonNull Message message0) {
                            if(message0.what == 100) {
                                try {
                                    if(ClickThroughUtil.goToWebView(VideoFullScreenActivity.this, ((String)message0.obj))) {
                                        VideoFullScreenActivity.this.notifyClick();
                                        if(VideoFullScreenActivity.this.mVideoAdData != null) {
                                            ReportUtil.sendReport("VIDEO_CLICK", VideoFullScreenActivity.this.mVideoAdData.getTrackingClkUrls());
                                            return;
                                        }
                                    }
                                    else if(ClickThroughUtil.goToBrowser(VideoFullScreenActivity.this, ((String)message0.obj))) {
                                        VideoFullScreenActivity.this.notifyClick();
                                        if(VideoFullScreenActivity.this.mVideoAdData != null) {
                                            ReportUtil.sendReport("VIDEO_CLICK", VideoFullScreenActivity.this.mVideoAdData.getTrackingClkUrls());
                                            return;
                                        }
                                    }
                                    return;
                                }
                                catch(Exception exception0) {
                                }
                                AdPieLog.e("VideoFullScreenActivity", exception0);
                            }
                        }
                    });
                    return;
                }
                if(ClickThroughUtil.goToBrowser(VideoFullScreenActivity.this, VideoFullScreenActivity.this.mLink)) {
                    VideoFullScreenActivity.this.notifyClick();
                    VideoAdData videoAdData0 = VideoFullScreenActivity.this.mVideoAdData;
                    if(videoAdData0 != null) {
                        ReportUtil.sendReport("VIDEO_CLICK", videoAdData0.getTrackingClkUrls());
                    }
                }
            });
        }

        class com.gomfactory.adpie.sdk.videoads.VideoFullScreenActivity.5 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                VideoFullScreenActivity.this.clickLink();
            }
        }

    }

    private void setupOptOut() {
        this.mOptOutImageView = new ImageView(this);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(DisplayUtil.dpToPx(this, 20), DisplayUtil.dpToPx(this, 20));
        relativeLayout$LayoutParams0.addRule(10);
        relativeLayout$LayoutParams0.addRule(9);
        int v = DisplayUtil.dpToPx(this, 20);
        relativeLayout$LayoutParams0.setMargins(v, v, v, v);
        this.mOptOutImageView.setLayoutParams(relativeLayout$LayoutParams0);
        String s = this.mVideoAdData.getOptoutImageUrl();
        if(TextUtils.isEmpty(s)) {
            this.mOptOutImageView.setImageBitmap(null);
            this.mOptOutImageView.setVisibility(8);
        }
        else {
            this.mOptOutImageView.setImageBitmap(null);
            NativeAdImageHelper nativeAdImageHelper0 = new NativeAdImageHelper(this);
            HashMap hashMap0 = new HashMap();
            hashMap0.put(s, this.mOptOutImageView);
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("VideoFullScreenActivity", ":::setupOptOut::: load - " + s);
            }
            nativeAdImageHelper0.load(hashMap0, new ImageLoadEventListener() {
                @Override  // com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper$ImageLoadEventListener
                public void onError() {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("VideoFullScreenActivity", ":::setupOptOut:::onError - " + s);
                    }
                    VideoFullScreenActivity.this.mOptOutImageView.setVisibility(8);
                }

                @Override  // com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper$ImageLoadEventListener
                public void onSuccess() {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("VideoFullScreenActivity", ":::setupOptOut:::onSuccess - " + s);
                    }
                    VideoFullScreenActivity.this.mOptOutImageView.setVisibility(0);
                }
            });
        }
        this.mOptOutImageView.setOnClickListener(new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(!ClickThroughUtil.isValidClick()) {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("VideoFullScreenActivity", ":::clickEvent::: OptOut : " + VideoFullScreenActivity.this.mVideoAdData.getOptoutLink() + " -> block");
                    }
                    return;
                }
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("VideoFullScreenActivity", ":::clickEvent::: OptOut : " + VideoFullScreenActivity.this.mVideoAdData.getOptoutLink());
                }
                ClickThroughUtil.goToBrowser(VideoFullScreenActivity.this, VideoFullScreenActivity.this.mVideoAdData.getOptoutLink());
            }
        });
        this.mContainer.addView(this.mOptOutImageView);
    }

    private void setupProgressBar() {
        this.mProgressBar = new ProgressBar(this);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(13);
        this.mProgressBar.setLayoutParams(relativeLayout$LayoutParams0);
        this.mProgressBar.setVisibility(8);
        this.mContainer.addView(this.mProgressBar);
        try {
            this.mProgressBar.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF4081"), PorterDuff.Mode.SRC_IN);
        }
        catch(Exception unused_ex) {
        }
    }

    private void setupSeekBar() {
        NoSkipSeekBar videoFullScreenActivity$NoSkipSeekBar0 = new NoSkipSeekBar(this, this);
        this.mSeekbar = videoFullScreenActivity$NoSkipSeekBar0;
        videoFullScreenActivity$NoSkipSeekBar0.setId(this.generateViewId());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, DisplayUtil.dpToPx(this, 4));
        relativeLayout$LayoutParams0.addRule(12);
        relativeLayout$LayoutParams0.setMargins(0, 0, 0, DisplayUtil.dpToPx(this, 20));
        this.mSeekbar.setLayoutParams(relativeLayout$LayoutParams0);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(new float[]{6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f}, null, null));
        shapeDrawable0.setIntrinsicHeight(0);
        shapeDrawable0.setIntrinsicWidth(0);
        this.mSeekbar.setThumb(shapeDrawable0);
        this.mContainer.addView(this.mSeekbar);
        try {
            Drawable drawable0 = this.mSeekbar.getProgressDrawable();
            int v = Color.parseColor("#FF4081");
            PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
            drawable0.setColorFilter(v, porterDuff$Mode0);
            this.mSeekbar.getThumb().setColorFilter(Color.parseColor("#FF4081"), porterDuff$Mode0);
        }
        catch(Exception exception0) {
            AdPieLog.e("VideoFullScreenActivity", exception0);
        }
        this.mSeekbar.setVisibility(4);
    }

    private void setupVideoView() {
        VideoView videoView0 = new VideoView(this);
        this.mVideoView = videoView0;
        videoView0.setId(this.generateViewId());
        this.mVideoView.setZOrderMediaOverlay(true);
        this.mVideoView.setKeepScreenOn(true);
        this.mVideoView.setOnPreparedListener(this);
        this.mVideoView.setOnCompletionListener(this);
        this.mVideoView.setOnErrorListener(this);
        this.mVideoView.setOnInfoListener(this);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout$LayoutParams0.addRule(13);
        this.mContainer.addView(this.mVideoView, relativeLayout$LayoutParams0);
    }

    private void setupVolumeButton() {
        ImageView imageView0 = new ImageView(this);
        this.mVolumeImage = imageView0;
        imageView0.setBackgroundColor(0x80000000);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(DisplayUtil.dpToPx(this, 24), DisplayUtil.dpToPx(this, 24));
        relativeLayout$LayoutParams0.addRule(8, this.mSeekbar.getId());
        relativeLayout$LayoutParams0.addRule(5, this.mSeekbar.getId());
        int v = DisplayUtil.dpToPx(this, 10);
        relativeLayout$LayoutParams0.setMargins(DisplayUtil.dpToPx(this, 20), 0, 0, v);
        this.mVolumeImage.setLayoutParams(relativeLayout$LayoutParams0);
        this.mVolumeImage.setVisibility(8);
        this.mVolumeImage.setOnClickListener(new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                VideoFullScreenActivity.this.setVolumeImage();
                if(VideoFullScreenActivity.this.mIsVolumeOn) {
                    if(VideoFullScreenActivity.this.mute()) {
                        VideoFullScreenActivity.this.mIsVolumeOn = false;
                        VideoFullScreenActivity.this.mVolumeImage.setImageBitmap(VideoFullScreenActivity.this.mVolumeOffBitmap);
                    }
                }
                else if(VideoFullScreenActivity.this.unmute()) {
                    VideoFullScreenActivity.this.mIsVolumeOn = true;
                    VideoFullScreenActivity.this.mVolumeImage.setImageBitmap(VideoFullScreenActivity.this.mVolumeOnBitmap);
                }
            }
        });
        this.setVolumeImage();
        this.mVolumeImage.setImageBitmap(this.mVolumeOffBitmap);
        this.mContainer.addView(this.mVolumeImage);
    }

    public boolean unmute() {
        return this.setVolume(100);
    }
}

