package main.scala;

import scala.collection.mutable

/**
 * @author Kuba
 * This is the main data element in this program, the Sudoku puzzle
 * It is basically a thin wrapper over a two-dimensional array of integers. (9x9)
 * With some added functionality.
 */
class Puzzle
{
	private val data = Array.ofDim[Int](9,9)
	
	def getCell(rowNumber: Int, colNumber: Int): Int =  data(rowNumber)(colNumber)
	def setCell(rowNumber: Int, colNumber: Int, value : Int) =  data(rowNumber)(colNumber) = value;
	
	override def toString = 
	{
		val sb = new StringBuilder
		val newPuzzle = new Puzzle
		
		for(i <- 0 until 8)
		{
			sb.append("[")
			
			for (j <- 0 to 8)
				sb.append(newPuzzle.getCell(i, j).toString())
		
			sb.append("]").append("\n")
		}
		
		sb.toString
	}
}