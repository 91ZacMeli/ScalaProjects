def executeComunucation(typeCommunication: String)= typeCommunication match {
  case "email" => "To send email to user "
  case "celular" => "To Call for to user cellPhone"
  case _ => "Erro Invalid Type"
}
println(executeComunucation("celular"))
println(executeComunucation("email"))
println(executeComunucation("carta"))