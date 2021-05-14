public class TriangleClassifier {
    public static String phanloai(int side1, int side2, int side3){
        if(isTamGiac(side1,side2,side3)) {
            if (side1 == side2 && side1 == side3) {
                return "Tam giac deu";
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                return "Tam giac can";
            } else {
                return "Tam giac thuong";
            }
        }else {
            return "Khong phai tam giac";
        }
    }

    public static boolean isTamGiac(int side1, int side2, int side3){
        if(side1 >0 && side2>0 && side3>0) {
            if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) {
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }
}
