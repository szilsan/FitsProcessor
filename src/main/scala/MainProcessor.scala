import nom.tam.fits.{BinaryTableHDU, Fits, ImageHDU}
import nom.tam.util.ArrayDataInput

/**
  * Created by szilsan on 17/04/2017.
  */
object MainProcessor extends App {

  println("hello world")

  val f = new Fits("d://sky//allVisit-l30e.2.fits")

  var hduImage1 =  f.getHDU(0).asInstanceOf[ImageHDU]
  var hduImage2 =  f.getHDU(2).asInstanceOf[ImageHDU]
  var hduBinaryTable =  f.getHDU(1).asInstanceOf[BinaryTableHDU]

  val data = hduBinaryTable.getData

  val col0 = data.getColumn(0)


  val types = data.getTypes

  val bases = data.getBases

  val row1 = data.getRow(0)


  print("Rows: " + data.getNRows + " Cols: " + data.getNCols + "\n")



  val a = data.getColumn(0)
  //val b = hduBinaryTable.getHeader.
  val c = hduBinaryTable.getHeader.findCard("DEC")



  print("end")


  /*
  val modelRow = hduBinaryTable.getData.getModelRow

  if (hduBinaryTable.getData.reset()) {
    var adi : ArrayDataInput = f.getStream.asInstanceOf[ArrayDataInput]
    while (adi.readArray(modelRow) > 0) {

      print("aaa:" + hduBinaryTable.getHeader.getStringValue("VISIT_ID"))

      modelRow(0) match {
        case a: Array[Byte] => print (new String (a.asInstanceOf[Array[Byte]] ) + "\n")
        case _ => ""
      }
      modelRow(1) match {
        case a: Array[Byte] => print (new String (a.asInstanceOf[Array[Byte]] ) + "\n")
        case _ => ""
      }
      modelRow(2) match {
        case a: Array[Byte] => print (new String (a.asInstanceOf[Array[Byte]] ) + "\n")
        case _ => ""
      }
    }
  }


  println(hduBinaryTable.getData.getModelRow)
*/


}
