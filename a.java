public class a{
    String[][] letterBlock;

    public void fillBlock(String str, String[][] letterBlock){
        for (int row = 0; row < letterBlock.length; row++){
            for (int col = 0; col < letterBlock[0].length; col++){
                letterBlock[row][col] = str.substring(row, row + 1);
              
            }

        }

    }

}