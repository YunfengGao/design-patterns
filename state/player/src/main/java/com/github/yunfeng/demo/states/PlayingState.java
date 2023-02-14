package com.github.yunfeng.demo.states;

import com.github.yunfeng.demo.Context;

public class PlayingState extends State {
    PlayingState(Context context) {
        super(context);
    }

    @Override
    public String onLock() {
        context.changeState(new LockedState(context));
        context.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        context.changeState(new ReadyState(context));
        return "Paused...";
    }

    @Override
    public String onNext() {
        return context.nextTrack();
    }

    @Override
    public String onPrevious() {
        return context.previousTrack();
    }
}
