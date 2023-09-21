public class test {
    public static int bestWeekToTravel(int[] forecast){
    
        int n = 0;
        int daystart = 0;
        int count = 0;
        int longestCount = 0;
        int dwday = 0;
        int r = 0;
        int g = 0;
        
            for(int i = 0; i < forecast.length; i++) {
                dwday = 0;
                if(forecast[i] == 2) {  
                    if(i < forecast.length - 7){ 
                    for(int j = i; j < i + 7; j++){
                    if(forecast[j] == 2){
                    dwday ++;
                    }
                    if(dwday > r){
                        r = dwday;
                        g = i;
                    }
                    }
                }
                    count+=1;
                    if(count > longestCount) {
                        longestCount = count;
                        n = i;
                    }
                } 
                else {
                    count = 0;
                }
            }
            daystart = (n -  longestCount) + 1;
            return g;
        }
    

    public static void main(String[] args){
//         double[][] drywet = new double[4100][14];
//         StdIn.setFile("drywet.txt");
//          for(int i=0; i < drywet.length; i++){
//              for(int j=0; j<14; j++){
//                  drywet[i][j] = StdIn.readDouble();
//              }
//          }

// double longitude = -97.58;
// double latitude = 26.02;
// int n = 0;
//         for(int i = 0; i < drywet.length; i++){
//                 if(drywet[i][0] == longitude && drywet[i][1] == latitude){
//                     n = i;
                  
//                 }
                   
                  
                
//             }
//         double[] drywetProbability = new double[12];
//         for(int i = 0; i < 12; i++){
//             drywetProbability[i] = drywet[n][i + 2];
//      System.out.println(drywetProbability[i]);       
//     }
    int[] arr = {1,2,2,1,2,1,2,2,1,1,2, 1,  1,2,2,2,1,2,2,2,2,  1,2,1,2,1,2,1,2};
    
    for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + ", ");
    }
    System.out.println(); 
    
    System.out.println(bestWeekToTravel(arr));
}
}
