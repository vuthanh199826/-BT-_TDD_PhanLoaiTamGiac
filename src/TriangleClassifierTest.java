import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void testPhanloai() {
        int side1 = 1;
        int side2 = 1;
        int side3 = 1;
        String expected = "Tam giac deu";
        String result = TriangleClassifier.phanloai(side1,side2,side3);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void testPhanloai1() {
        int side1 = 1;
        int side2 = 2;
        int side3 = 1;
        String expected = "Tam giac can";
        String result = TriangleClassifier.phanloai(side1,side2,side3);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void testPhanloai3() {
        int side1 = -1;
        int side2 = 1;
        int side3 = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.phanloai(side1,side2,side3);
        assertEquals(expected,result);
    }


}