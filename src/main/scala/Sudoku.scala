package main.scala;

object Sudoku {

  def main(args: Array[String]) {
    val sd = new SudokuGenerator()
    val testPuzzle = sd.generateInvalidSudokuPuzzle();
    println("Test puzzle: \n" + testPuzzle);
  }

}