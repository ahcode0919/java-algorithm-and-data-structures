package com.nns.algorithms.progressions;

import com.nns.dsgnalgjava.Progression;

/**
 * Created by Aaron H. on 12/14/15.
 */
public class ArithmeticProgression extends Progression {
    protected long increment;

    public ArithmeticProgression() {
        this(1,0);
    }

    public ArithmeticProgression(long stepSize) {
        this(stepSize, 0);
    }

    public ArithmeticProgression(long stepSize, long start){
        super(start);
        increment = stepSize;
    }

    @Override
    protected void advance() {
        current += increment;
    }
}
