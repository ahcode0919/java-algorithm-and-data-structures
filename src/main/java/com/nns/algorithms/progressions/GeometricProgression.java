package com.nns.algorithms.progressions;

import com.nns.dsgnalgjava.Progression;

/**
 * Created by Aaron H. on 12/14/15.
 */
public class GeometricProgression extends Progression {
    protected long base;

    public GeometricProgression() {
        this(2,1);
    }

    public GeometricProgression(long b) {
        this(b, 1);
    }

    public GeometricProgression(long b, long start) {
        super(start);
        base = b;
    }

    @Override
    protected void advance(){
        current *= base;
    }
}
