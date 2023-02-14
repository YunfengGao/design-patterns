package com.github.yunfeng.demo;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println(context.getState().onPlay());
        // Playing Track 1

        System.out.println(context.getState().onNext());
        // Playing Track 2

        System.out.println(context.getState().onPlay());
        // Paused...

        System.out.println(context.getState().onPlay());
        // Playing Track 2

        System.out.println(context.getState().onPrevious());
        // Playing Track 1

        System.out.println(context.getState().onLock());
        // Stop playing

        System.out.println(context.getState().onNext());
        // Locked...
    }
}