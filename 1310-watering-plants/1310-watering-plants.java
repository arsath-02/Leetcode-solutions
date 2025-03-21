class Solution {
    public int wateringPlants(int[] plants, int capacity) {
    int n=plants.length;
    int step=0;
    int curr=0;
    for(int i=0;i<n;i++){
        if(curr>=plants[i]){
            curr-=plants[i];
            step+=1;
        }
        else{
            step+=2*i+1;
            curr=capacity;
        curr-=plants[i];
        }
    }
    return step;}
}