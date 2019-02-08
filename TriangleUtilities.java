 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";
        for(int i = 0; i < numberOfStars; i++) {
            result = result + "*";
        }
        return result;
    }
    
    public static String getTriangle(int numberOfRows) {
        String result = "";
        for(int i = 0; i < numberOfRows; i++) {
            for(int j = i; j < numberOfRows; j++) {
                result = result + "*";
            }
            result = result + "\n";
        }
        return result;
    }


    public static String getSmallTriangle() {
        String result = "";
        for(int i = 0; i < 3; i++) {
            for(int j = i; j < 3; j++) {
                result = result + "*";
            }
            result = result + "\n";
        }
        return result;
    }

    public static String getLargeTriangle() {
        String result = "";
        for(int i = 0; i < 10; i++) {
            for(int j = i; j < 10; j++) {
                result = result + "*";
            }
            result = result + "\n";
        }
        return result;
    }
}
