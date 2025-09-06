package com.gomfactory.adpie.sdk.videoads;

public interface VideoAdPlaybackListener {
    void onVideoAdStarted();

    void onVideoFinished(FinishState arg1);
}

