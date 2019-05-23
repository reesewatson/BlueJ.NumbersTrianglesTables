 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }
    

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);

    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        
        for (int i = 1; i < tableSize + 1; i++){
            for (int j = 1; j < tableSize + 1; j++){
                int n = j * i;
                if (n < 10){
                    result = result + "  " + n + " |";
                }
                else if (n < 100){
                    result = result + " " + n + " |";
                }
                else if (n < 1000){
                    result = result + n + " |";
                }
                if (j == tableSize){
                    result = result + "\n";
                }
            }
        }
        
        return result;
    }
}
