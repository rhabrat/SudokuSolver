package main.scala;

import scala.collection.mutable
import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV

/**
 * @author Kuba
 * This is the main data element in this program, the Sudoku puzzle
 * It is basically a thin wrapper over a two-dimensional array of integers. (9x9)
 * With some added functionality.
 */
class Puzzle
{
	private val data = Array.ofDim[Int](9,9)
  val horizontal: List[Set[Int]] = {
    var result = List[Set[Int]]()
    var entry = Set[Int]()
    for( i <- 1 to 9 ) entry = entry + i
    for( i <- 0 to 8 ) result = entry :: result
    result
  }

  val vertical: List[Set[Int]] = List()
  val boxes: List[Set[Int]] = List()



  def getBoxIdx( input: (Int,Int) ): Int = {
    input match {
      case ( x, y ) if ((x > 0) && (x <= 2) && (y > 0) && (y <= 2)) => 0
      case ( x, y ) if ((x > 0) && (x <= 2) && (y > 2) && (y <= 5)) => 3
      case ( x, y ) if ((x > 0) && (x <= 2) && (y > 5) && (y <= 8)) => 6
      case ( x, y ) if x > 2 && x <= 5 && y > 0 &&  y <= 2 => 1
      case ( x, y ) if x > 2 && x <= 5 && y > 2 &&  y <= 5 => 4
      case ( x, y ) if x > 2 && x <= 5 && y > 5 &&  y <= 8 => 7
      case ( x, y ) if x > 5 && x <= 8 && y > 0 &&  y <= 2 => 2
      case ( x, y ) if x > 5 && x <= 8 && y > 2 &&  y <= 5 => 5
      case ( x, y ) if x > 5 && x <= 8 && y > 5 &&  y <= 8 => 8
      case _ => -1
    }
  }

	
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