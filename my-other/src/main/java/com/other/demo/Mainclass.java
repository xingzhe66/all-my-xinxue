package com.other.demo;

public class Mainclass {

    public static void main(String[] args) {

         // 1.双心
       // heartTwo(15,0.9,"V","I","U");
        // 2. 单个心
        System.out.println(callBack("*"));
    }


    public static String callBack(String input) {

        int[] array = {0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1,
                0, 0, 1, 1, 4, 5, 2, 3, 4, 1, 0, 1,

                0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0};

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < array.length; i++) {

            if (i % 7 == 0)

                sb.append("  \n");

            if (array[i] == 0)

                sb.append("   ");

            else if (array[i] == 4)

                sb.append("  ");

            else if (array[i] == 5)

                sb.append(" I ");

            else if (array[i] == 2)

                sb.append("Lvoe ");

            else if (array[i] == 3)

                sb.append("You");

            else

                sb.append("  " + input);

        }

        return sb.toString();
    }


        private static void heartTwo(int r,double size,String center,String left,String right){

        size=1/(1.5*r*size);

        StringBuilder sb=new StringBuilder();

        for (int y = r; y > -r; y--,sb.append("\n"))

            for (int x = -2*r; x <4*r; x++ ) {

                boolean isLeft=inHeart(size,x,y);

                boolean isRight=inHeart(size,x-25,y-3);

//双空格

                String req=null;

                if(isLeft && isRight) req=center;

                else if(isLeft) req=left;

                else if (isRight) req=right;

                if(req!=null) sb.append((req + req).charAt((x - y) % req.length() + req.length()));

                else sb.append(" ");//双空格

            }
        System.out.println();
        System.out.println();
        System.out.println("                    ===============LOVE  YOU  FOREVER =============:");
        System.out.println();



        System.err.println(sb.toString());

    }


    private static boolean inHeart(double size,int x,int y){

        return Math.pow(Math.pow(x * size, 2) + Math.pow(y * 2*size, 2) - 1, 3) - Math.pow(x * size, 2) * Math.pow(y * 2*size, 3) <= 0;

    }
}
