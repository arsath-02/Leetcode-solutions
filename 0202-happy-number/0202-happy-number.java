class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        // Hash Table Approach
        

        // TC: O(n);
        // SC: O(n);
        int sum = 0;
        while( n!=1 && !set.contains(n)){
            set.add(n);
            n = getSquare(n);
        }
        return n==1;
    }
    private int getSquare(int n ){
        int sum = 0;
        int total =0;
        int rem =0;
        while(n!=0){
            if(n>0)
           {
             rem = n % 10;
            sum = rem * rem;
            total += sum;
            n/=10;
           }
        }
        return total;
    }
}