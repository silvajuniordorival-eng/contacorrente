public class ContaCorrente {
 private String titular;
 private double saldo;

 public ContaCorrente(String titular, double saldoInicial) {
  this.titular = titular;
  this.saldo = saldoInicial;
 }

 public String getTitular() {
  return titular;
 }

 public double getSaldo() {
  return saldo;
 }

 public void depositar(double valor) {
  if (valor > 0) {
   this.saldo += valor;
  }
 }

 public boolean sacar(double valor) {
  if (valor > 0 && valor <= this.saldo) {
   this.saldo -= valor;
   return true;
  } else {
   System.out.println("Saldo insuficiente para saque de R$ " + valor + " na conta de " + this.titular);
   return false;
  }
 }

 public boolean transferir(ContaCorrente destino, double valor) {
  if (this.sacar(valor)) {
   destino.depositar(valor);
   System.out.printf("Transferência de R$ %.2f realizada de %s para %s com sucesso!%n", valor, this.titular,
     destino.getTitular());
   return true;
  } else {
   System.out.println("Falha na transferência de " + this.titular + " para " + destino.getTitular());
   return false;
  }
 }
}