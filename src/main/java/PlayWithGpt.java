import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlayWithGpt {
    public static void main(String[] args) {
        List<Integer> integers = readFromFile();
        int[] arr = integers.stream().mapToInt(i->i).toArray();
        bubbleSort(arr);
        writeToFile(arr);
    }

    static List<Integer> readFromFile() {
        List<Integer> integers = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line = reader.readLine();

            while (line != null) {
                String[] parts = line.split(" "); // Assuming integers are separated by spaces

                for (String part : parts) {
                    try {
                        integers.add(Integer.parseInt(part));
                    } catch (NumberFormatException e) {
                        System.out.println(part + " is not a valid integer. Ignoring this value.");
                    }
                }

                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return integers;
    }

    static void writeToFile(int[] array) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            for (int i : array) {
                writer.write(Integer.toString(i));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}