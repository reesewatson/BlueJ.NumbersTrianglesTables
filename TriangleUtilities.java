 

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
                result = result + "*" + "\n";
        }
        return result;
    }

    public static String getSmallTriangle() {
        String result = "";
        for(int i = 0; i < 6; i++) {
                result = result + "*" + "\n";
        }
        return result;
    }

    public static String getLargeTriangle() {
        String result = "";
        for(int i = 0; i < 21; i++) {
                result = result + "*" + "\n";
        }
        return result;
    }
}
