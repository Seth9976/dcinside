package com.iab.omid.library.bytedance2.adsession.media;

public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");

    private final String playerState;

    private PlayerState(String s1) {
        this.playerState = s1;
    }

    @Override
    public String toString() {
        return this.playerState;
    }
}

