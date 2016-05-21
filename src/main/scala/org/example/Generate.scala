package org.example

import scala.reflect.runtime.{ universe => ru }
import slick.driver.MySQLDriver

object Generate {

  def main(args: Array[String]): Unit = {
    val slickDriver = "slick.driver.MySQLDriver"
    val jdbcDriver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/automutton?characterEncoding=UTF8"
    val outputFolder = "/Users/ishikawayuuki"
    val pkg = "model"
    val user = "root"
    val password = ""

    slick.codegen.SourceCodeGenerator.main(
      Array(slickDriver, jdbcDriver, url, outputFolder, pkg, user, password)
    )
  }

}
