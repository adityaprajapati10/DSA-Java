import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixOperations {
    public static List<List<Integer>> addMatrices(List<List<Integer>> matrixA, List<List<Integer>> matrixB) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < matrixA.size(); i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < matrixA.get(i).size(); j++) {
                row.add(matrixA.get(i).get(j) + matrixB.get(i).get(j));
            }
            result.add(row);
        }
        return result;
    }

    public static List<List<Integer>> subtractMatrices(List<List<Integer>> matrixA, List<List<Integer>> matrixB) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < matrixA.size(); i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < matrixA.get(i).size(); j++) {
                row.add(matrixA.get(i).get(j) - matrixB.get(i).get(j));
            }
            result.add(row);
        }
        return result;
    }

    public static List<List<Integer>> multiplyMatrices(List<List<Integer>> matrixA, List<List<Integer>> matrixB) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < matrixA.size(); i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < matrixB.get(0).size(); j++) {
                int sum = 0;
                for (int k = 0; k < matrixA.get(0).size(); k++) {
                    sum += matrixA.get(i).get(k) * matrixB.get(k).get(j);
                }
                row.add(sum);
            }
            result.add(row);
        }
        return result;
    }

    public static List<List<Double>> divideMatrixByScalar(List<List<Integer>> matrix, double scalar) {
        List<List<Double>> result = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            List<Double> row = new ArrayList<>();
            for (int j = 0; j < matrix.get(i).size(); j++) {
                row.add(matrix.get(i).get(j) / scalar);
            }
            result.add(row);
        }
        return result;
    }

    public static void printMatrix(List<List<?>> matrix) {
        for (List<?> row : matrix) {
            System.out.println(Arrays.toString(row.toArray()));
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> matrixA = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<List<Integer>> matrixB = Arrays.asList(
                Arrays.asList(9, 8, 7),
                Arrays.asList(6, 5, 4),
                Arrays.asList(3, 2, 1)
        );

        // Matrix Addition
        System.out.println("Matrix Addition:");
        List<List<Integer>> additionResult = addMatrices(matrixA, matrixB);
        printMatrix(additionResult);

        // Matrix Subtraction
        System.out.println("\nMatrix Subtraction:");
        List<List<Integer>> subtractionResult = subtractMatrices(matrixA, matrixB);
        printMatrix(subtractionResult);

        // Matrix Multiplication
        System.out.println("\nMatrix Multiplication:");
        List<List<Integer>> multiplicationResult = multiplyMatrices(matrixA, matrixB);
        printMatrix(multiplicationResult);

        // Matrix Division by Scalar
        System.out.println("\nMatrix Division by Scalar:");
        List<List<Double>> divisionResult = divideMatrixByScalar(matrixA, 2.0);
        printMatrix(divisionResult);
    }
}
