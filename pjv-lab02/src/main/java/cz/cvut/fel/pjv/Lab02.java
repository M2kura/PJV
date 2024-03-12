/*
 * File name: Lab06.java
 * Date:      2014/08/26 21:39
 * Author:    @author
 */

package cz.cvut.fel.pjv;
import java.util.ArrayList;
import java.util.List;

public class Lab02 {

   public void homework(String[] args) {
      TextIO io = new TextIO();
      List<Double> numbers = new ArrayList<Double>();
      boolean endOfInput = false;
      int lineNumber = 0;

      while (!endOfInput) {
         String line = io.getLine();
         lineNumber++;

         if (line.equals("")) {
            endOfInput = true;
            if (numbers.size() > 1) {
               printStatistics(numbers);
            }
            System.err.println("End of input detected!");
         } else if (TextIO.isDouble(line)) {
            numbers.add(Double.parseDouble(line));

            if (numbers.size() == 10) {
               printStatistics(numbers);
               numbers.clear();
            }
         } else {
            System.err.println("A number has not been parsed from line " + lineNumber);
         }
      }
   }

   private void printStatistics(List<Double> numbers) {
      if (numbers.size() == 0) return;

      double sum = 0;
      for (Double number : numbers) {
         sum += number;
      }
      double mean = sum / numbers.size();

      double varianceSum = 0;
      for (Double number : numbers) {
         varianceSum += Math.pow(number - mean, 2);
      }
      double variance = varianceSum / numbers.size();
      double standardDeviation = Math.sqrt(variance);

      System.out.printf("%2d %.3f %.3f%n", numbers.size(), mean, standardDeviation);
   }
}