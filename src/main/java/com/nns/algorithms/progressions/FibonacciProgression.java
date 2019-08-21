package com.nns.algorithms.progressions;

import com.nns.dsgnalgjava.Progression;

/**
 * Created by Aaron H. on 12/14/15.
 */
public class FibonacciProgression extends Progression {
    protected long prev;

    public FibonacciProgression(){
        this(0,1);
    }

    public FibonacciProgression(long first, long second){
        super(first);
        prev = second - first;
    }

    @Override
    protected void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }
}
