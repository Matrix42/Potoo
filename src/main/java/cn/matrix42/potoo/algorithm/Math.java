package cn.matrix42.potoo.algorithm;

public class Math {

    /**
     * 牛顿迭代法求近似平方根倒数java实现.
     * 原作者:卡马克
     * @link https://zhuanlan.zhihu.com/p/29075553
     * @param number input
     * @return 平方根倒数
     */
    public static float q_rsqrt(float number) {
        int i;
        float x2, y;
        final float threehalfs = 1.5f;
        x2 = number * 0.5f;
        y = number;
        //i = * ( long * ) &y ; // evil floating point bit level hacking
        i = Float.floatToRawIntBits(y);
        i = 0x5f3759df - (i >> 1); // what the fuck?
        //  y = * ( float * ) &i;
        y = Float.intBitsToFloat(i);
        y = y * (threehalfs - (x2 * y * y)); // 1st iteration
        //y = y * ( threehalfs - ( x2 * y * y ) ); // 2nd iteration, this can be removed
        return y;
    }

    public static void main(String[] args) {
        long start1 = System.nanoTime();
        float res1 = q_rsqrt(2);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        double res2 = 1.0 / java.lang.Math.sqrt(2);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;


        System.out.println(String.format("%s %s", res1, time1));
        System.out.println(String.format("%s %s", res2, time2));
    }

}
