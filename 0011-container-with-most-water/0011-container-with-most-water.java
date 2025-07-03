class Solution {
    public int maxArea(int[] height) {  
        int n = height.length;
        
        int front = 0, rear = n - 1;
        int max =0;
        while( rear>= 0 && front<=n-1){
            int h1 = height[front];
            int h2 = height[rear];
            int min = Math.min(h1,h2);
            int width = rear - front;
            int area = min * width;
            max= Math.max(max,area);
            if(h1<h2)
                front++;
            else
                rear--;
        }
        return max;
    }   

}