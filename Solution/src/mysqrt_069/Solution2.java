package mysqrt_069;

/**
 * @author ASUS
 * @ 2021/12/8- 21:08
 */
class Solution2 {
    public int mySqrt(int x) {

        int l = 0, r = x;
        while(l < r){
            int mid = l + (r-l)>> 1;//避免和越界；或者写成：l+r +1l（表示long型的1）
            if(mid >= x / mid) r = mid;//直接用mid*mid可能会越界
            else l = mid + 1;
        }
        return l;

    }
}
