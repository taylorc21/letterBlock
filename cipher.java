public class cipher{
    String[][] letterBlock;
    private int numRows;
    private int numCols;

    public void fillBlock(String str, String[][] letterBlock){
        
        if (str.length() < numRows * numCols){
            int count = 0;

            for (int row = 0; row < letterBlock.length; row++){
                for (int col = 0; col < letterBlock[0].length; col++){
                    count ++;

                    if (count < str.length()){
                        letterBlock[row][col] = str.substring(count, count + 1);
                    }

                    else{
                        letterBlock[row][col] = "A";
                    }
                }
            }
        }       

        if (str.length() > numRows * numCols){

            int iteration = 0;

            for (int row = 0; row > letterBlock.length; row++){
                for (int col = 0; col < letterBlock[0].length; col++){
                    letterBlock[row][col] = str.substring(iteration, iteration + 1);
                    iteration++;
                }
            }

        }
    }

     public String encryptMessage (String message){
        String encryptMSG = "";
        String temp;
        for (int i = 0; i < letterBlock[0].length; i++){
            temp = encryptBlock(message);
            encryptMSG += temp;

        }

        return encryptMSG;
     }
}