package com.nns.dsgnalgjava;

/**
 * Created by Aaron H. on 12/14/15.
 */
public class Progression {
    protected long current;

    public Progression() { this(0); }

    public Progression(long start) { current = start; }

    public long nextValue() {
        long answer = current;
        advance();
        return answer;

    }

    protected void advance(){
        current++;
    }

    public void printProgression(int n){
        System.out.println(nextValue());
        for(int i = 1; i < n; i++){
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }
}
