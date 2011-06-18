package main.scala

import scala.util.Random
import java.util.Calendar

/**
 * @author Kuba
 * This class generates various sudoku puzzles. 
 * Some of them are fully solved, some of them are 
 * ready to be solved, and some are invalid. 
 */
class SudokuGenerator {

	
	def generateInvalidSudokuPuzzle(): Puzzle = 
	{
		val newPuzzle = new Puzzle
		val random = new Random(Calendar.MILLISECOND)
		
		for(i <- 0 until 8)
		{
			for (j <- 0 until 8)
			{
				newPuzzle.setCell(i, j, random.nextInt(9))
			}
		}
		
		newPuzzle
	}
	
	//def generate3By3(): List[Int] = List( 1, 2, 3, 4, 5, 6, 7, 8, 9 ).permutations.toList


}