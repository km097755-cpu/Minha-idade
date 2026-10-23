import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite a sua idade: ");

    if (!teclado.hasNextInt()) {
        System.out.println("Idade inválida: digite apenas números.");
        return;
    }

    int idade = teclado.nextInt();

    if (idade < 0 || idade > 130)
        System.out.println("Idade inválida.");
    else if (idade <= 11)
        System.out.println("Criança");
    else if (idade <= 17)
        System.out.println("Adolescente");
    else
        System.out.println("Adulto");
}
