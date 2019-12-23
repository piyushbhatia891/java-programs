package com.piyush.programs.array;

public class CheckIfStraightLine {
    public static void main(String[] args){
        int[][] line=  {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        Solution sol=new Solution();
        System.out.println(sol.checkStraightLine(line));
    }
}
class Solution {
    class Slope {
        boolean x;
        boolean y;
        int slope;

        public boolean equals(Slope s) {
            return this.y==s.y &&
                    this.x==s.x &&
                    this.slope==s.slope;
        }
    }
    public boolean checkStraightLine(int[][] coordinates) {
        int[] a=coordinates[0];
        int[] b=coordinates[1];
        Slope slope=getSlope(a,b);

        for(int i=2; i<coordinates.length-1; i+=2) {
            a=coordinates[i];
            b=coordinates[i+1];

            Slope s=getSlope(a,b);

            if(!slope.equals(s)) return false;
        }
        return true;
    }

    Slope getSlope(int[] a, int[] b) {
        int ax=a[0];
        int ay=a[1];
        int bx=b[0];
        int by=b[1];

        int x=ax-bx;
        int y=ay-by;

        Slope slope=new Slope();
        /*slope.x=x==0;
        slope.y=y==0;*/

        if(x!=0&&y!=0) {
            slope.slope=x/y;
        } else {
            slope.slope=0;
        }

        return slope;
    }
}
