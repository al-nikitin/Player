package com.appshop162.player;

import android.content.Context;
import android.widget.MediaController;

public class MusicController extends MediaController {
    public MusicController(Context context) {
        super(context);
        // TODO inflate(context, R.id.controller_main, null);
    }

    @Override
    public void hide() {
        // do nothing
    }
}
