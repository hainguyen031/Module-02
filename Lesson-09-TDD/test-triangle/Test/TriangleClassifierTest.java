import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void getTriangle() {
        int a = 2, b = 2, c = 2;
        int example = 1;
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        triangleClassifier.setTriangle(a, b, c);
        int result = triangleClassifier.getTriangle();
        assertEquals(example, result);
    }

    @Test
    void getTriangle1() {
        int a = 2, b = 2, c = 3;
        int example = 2;
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        triangleClassifier.setTriangle(a, b, c);
        int result = triangleClassifier.getTriangle();
        assertEquals(example, result);
    }

    @Test
    void getTriangle2() {
        int a = 3, b = 4, c = 5;
        int example = 3;
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        triangleClassifier.setTriangle(a, b, c);
        int result = triangleClassifier.getTriangle();
        assertEquals(example, result);
    }

    @Test
    void getTriangle3() {
        int a = 8, b = 2, c = 3;
        int example = 0;
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        triangleClassifier.setTriangle(a, b, c);
        int result = triangleClassifier.getTriangle();
        assertEquals(example, result);
    }

    @Test
    void getTriangle4() {
        int a = -1, b = 2, c = 1;
        int example = 0;
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        triangleClassifier.setTriangle(a, b, c);
        int result = triangleClassifier.getTriangle();
        assertEquals(example, result);
    }

    @Test
    void getTriangle5() {
        int a = 0, b = 1, c = 1;
        int example = 0;
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        triangleClassifier.setTriangle(a, b, c);
        int result = triangleClassifier.getTriangle();
        assertEquals(example, result);
    }
}