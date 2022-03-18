def typeCommunucation(typec: String) = {
  if (typec == "email"){
    println("To send email to client")
  }else if (typec == "celular"){
    println("To call for the cell of client")
  } else{
    println("Error! this is another type of communication ")
  }
 }
typeCommunucation("celular")

val authorization = 18
var idade = 24

val authorized = if(idade < authorization) "No Authorized " else "Yes! Authorized"
println(authorized)

