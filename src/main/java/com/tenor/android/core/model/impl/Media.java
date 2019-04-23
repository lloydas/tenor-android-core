package com.tenor.android.core.model.impl;

import android.support.annotation.NonNull;

import com.tenor.android.core.constant.StringConstant;

/**
 * The model of {@link Media}
 */
public class Media extends Image {
    private static final long serialVersionUID = -8616498739266612929L;
    private String preview;
    private double duration;
    private long size;

    /**
     * @return url of a static image preview
     */
    @NonNull
    public String getPreviewUrl() {
        return StringConstant.getOrEmpty(preview);
    }

    /**
     * @return duration of each loop, in seconds
     */
    public double getDuration() {
        return duration;
    }

    /**
     * @return size of this {@link Image} or -1 if it doesn't exist
     */
    public long getSize() {
        return size != 0 ? size : -1;
    }
}
