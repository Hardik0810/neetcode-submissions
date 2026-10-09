class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet = 0;
        double ltime = 0;
        sortByPositionDesc(position, speed);
        for(int i = 0; i < position.length; i++){
            if(ltime == 0){
                fleet++;
                ltime = (double)(target - position[i]) / speed[i];
            }
            else{
                if(((double)(target - position[i])/speed[i]) > ltime){
                    fleet++;
                    ltime = (double)(target - position[i])/speed[i];
                }
                
            }

        }
        return fleet;


        
    }
    private static void sortByPositionDesc(int[] position, int[] speed) {
    int n = position.length;

    int[][] cars = new int[n][2];

    for (int i = 0; i < n; i++) {
        cars[i][0] = position[i];
        cars[i][1] = speed[i];
    }

    Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

    for (int i = 0; i < n; i++) {
        position[i] = cars[i][0];
        speed[i] = cars[i][1];
    }
}
}
