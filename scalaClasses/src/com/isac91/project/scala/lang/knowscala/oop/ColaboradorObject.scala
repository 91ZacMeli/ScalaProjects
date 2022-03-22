package com.isac91.project.scala.lang.knowscala.oop

import com.isac91.project.scala.lang.knowscala.oop.classes.Colaborador

object ColaboradorObject {
  def main(args: Array[String]): Unit = {
    println("Bem vindo a classe Object")

    val colaborador = new Colaborador
    colaborador.descricao()

    println(colaborador.mensagem("Wesley"))
  }

}
