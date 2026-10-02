public class Main {
 public static void main(String[] args) {
  System.out.println("--- TESTE EXERCÍCIO 3 ---");

  ContaCorrente c1 = new ContaCorrente("João", 1000.00);
  ContaCorrente c2 = new ContaCorrente("Maria", 500.00);

  System.out.printf("Saldo inicial %s: R$ %.2f%n", c1.getTitular(), c1.getSaldo());
  System.out.printf("Saldo inicial %s: R$ %.2f%n%n", c2.getTitular(), c2.getSaldo());

  // Transferindo 300 reais de João para Maria
  c1.transferir(c2, 300.00);

  // Saldos Finais
  System.out.println("\n--- SALDOS FINAIS ---");
  System.out.printf("Saldo final %s: R$ %.2f%n", c1.getTitular(), c1.getSaldo());
  System.out.printf("Saldo final %s: R$ %.2f%n", c2.getTitular(), c2.getSaldo());
 }
}